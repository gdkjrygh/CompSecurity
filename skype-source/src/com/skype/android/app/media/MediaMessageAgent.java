// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.app.Application;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.skype.Account;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.MediaDocument;
import com.skype.MediaDocumentImpl;
import com.skype.Message;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.SkypeConstants;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.Agent;
import com.skype.android.app.NotificationId;
import com.skype.android.app.main.SplashActivity;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.event.EventBus;
import com.skype.android.inject.AccountProvider;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.skylib.ObjectInterfaceNotFoundException;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.ViewUtil;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.media:
//            c, XmmUtil, MediaLinkProfile, OnMediaDownloadedForSave, 
//            OnMediaUploadAutoRetry, MediaDocumentUploadUtil, OnMediaUploadRetry, OnMediaDownloadCriticalError, 
//            OnMediaDefaultLinkUpdate, OnMediaThumbnailLinkStatusChange, OnMediaDocumentLinkStatusChange, OnMediaGroupAvatarLoaded, 
//            OnMediaUploadStatusChange, OnMediaUploadProgress

public class MediaMessageAgent extends Agent
    implements SkypeConstants
{

    private static final int FAILED_MEDIA_DOCUMENT_NOTIFICATION_ID = NotificationId.newId();
    private static final int RETRY_REQUEST_CODE = -1;
    private static final Logger log = Logger.getLogger("MediaMessageAgent");
    AccountProvider accountProvider;
    Analytics analytics;
    ContactUtil contactUtil;
    ConversationUtil conversationUtil;
    private EventBus eventBus;
    ImageCache imageCache;
    SkyLib lib;
    private ObjectIdMap map;
    private c mediaDocumentQueue;
    MediaDocumentUploadUtil mediaDocumentUploadUtil;
    NetworkUtil networkUtil;
    NotificationManager notificationManager;

    public MediaMessageAgent(Application application, EventBus eventbus, ObjectIdMap objectidmap)
    {
        super(application);
        eventBus = eventbus;
        map = objectidmap;
        mediaDocumentQueue = new c(objectidmap);
    }

    private void constructNotificationForFailedUploads()
    {
        Iterator iterator = mediaDocumentQueue.getConvoDbIdForFailedUploads().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (Integer)iterator.next();
            ConversationImpl conversationimpl = new ConversationImpl();
            if (lib.getConversationByConvoID(((Integer) (obj)).intValue(), conversationimpl))
            {
                obj = createNotificationForFailedUploads(conversationimpl, mediaDocumentQueue.getFailedUploadsCountForConversation(((Integer) (obj)).intValue()));
                notificationManager.notify(FAILED_MEDIA_DOCUMENT_NOTIFICATION_ID | conversationimpl.getDbID(), ((android.support.v4.app.x.d) (obj)).e());
            }
        } while (true);
    }

    private android.support.v4.app.x.d createNotificationForFailedUploads(Conversation conversation, int i)
    {
        Object obj = conversationUtil.m(conversation);
        String s1 = getContext().getResources().getQuantityString(0x7f0b0013, i, new Object[] {
            Integer.valueOf(i)
        });
        android.text.SpannableStringBuilder spannablestringbuilder = ViewUtil.a(((CharSequence) (obj)), s1);
        String s = conversation.getIdentityProp();
        conversation = imageCache.a(conversation, Boolean.valueOf(true));
        android.support.v4.app.x.d d = new android.support.v4.app.x.d(getContext());
        obj = d.b(true).c(true).c(spannablestringbuilder).c().a(((CharSequence) (obj))).b(s1);
        obj.g = conversation;
        ((android.support.v4.app.x.d) (obj)).a(0x7f0201b8).b(getContext().getResources().getColor(0x7f0f00d3)).a(getContentIntent(s, false)).a(0x7f0201c0, getContext().getString(0x7f080177), getContentIntent(s, true));
        return d;
    }

    private String getContentId(com.skype.MediaDocument.DOCUMENT_TYPE document_type)
    {
        return lib.getDefaultContentId(document_type).m_contentId;
    }

    private PendingIntent getContentIntent(String s, boolean flag)
    {
        Context context = getContext();
        Intent intent = new Intent(context, com/skype/android/app/main/SplashActivity);
        intent.addFlags(0x10000000);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("com.skype.identitiy", s);
        if (flag)
        {
            intent.putExtra("autoRetry", true);
        }
        int i;
        if (flag)
        {
            i = s.hashCode() - 1;
        } else
        {
            i = s.hashCode();
        }
        return PendingIntent.getActivity(context, i, intent, 0x8000000);
    }

    private void handleCompletedUpload(int i)
    {
        int j = mediaDocumentQueue.getMessageIdForFailedUpload(i);
        if (j != -1)
        {
            try
            {
                Message message = (Message)map.a(j, com/skype/Message);
                notificationManager.cancel(FAILED_MEDIA_DOCUMENT_NOTIFICATION_ID | message.getConvoIdProp());
            }
            catch (ObjectInterfaceNotFoundException objectinterfacenotfoundexception)
            {
                sendHandledObjectNotFoundTelemetry("handleCompletedUpload");
                return;
            }
        }
        mediaDocumentQueue.removeFromUploadQueue(i);
        if (mediaDocumentQueue.hasFailedUploads())
        {
            MediaDocument mediadocument = XmmUtil.getMediaDocumentForMessageId(map, j);
            if (mediadocument != null && mediadocument.getDocTypeProp() == com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_PHOTO)
            {
                constructNotificationForFailedUploads();
            }
        }
    }

    private boolean handleFailedMediaDownloadForSave(MediaDocument mediadocument)
    {
        com.skype.MediaDocument.GetMediaLink_Result getmedialink_result = mediadocument.getMediaLink(MediaLinkProfile.PREVIEW_PROFILE.toString(), com.skype.MediaDocument.MEDIA_GET_POLICY.CACHE_ONLY);
        if (getmedialink_result.m_return == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
        {
            analytics.c(AnalyticsEvent.bu);
            eventBus.a(new OnMediaDownloadedForSave(mediadocument.getObjectID(), getmedialink_result.m_path, MediaLinkProfile.PREVIEW_PROFILE));
            return true;
        } else
        {
            return false;
        }
    }

    private void handleFailedMediaUpload(MediaDocument mediadocument)
    {
        if (mediadocument.getDocTypeProp() != com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_VIDEO && mediadocument.getDocTypeProp() == com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_PHOTO)
        {
            analytics.c(AnalyticsEvent.bx);
            constructNotificationForFailedUploads();
        }
        mediaDocumentQueue.addFailedUpload(mediadocument.getObjectID());
    }

    private boolean isMessageDeliveryFailed(int i)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (i != -1)
        {
            Message message;
            try
            {
                message = (Message)map.a(i, com/skype/Message);
            }
            catch (ObjectInterfaceNotFoundException objectinterfacenotfoundexception)
            {
                sendHandledObjectNotFoundTelemetry("isMessageDeliveryFailed");
                return false;
            }
            flag = flag1;
            if (message.getSendingStatusProp() == com.skype.Message.SENDING_STATUS.FAILED_TO_SEND)
            {
                flag = true;
            }
        }
        return flag;
    }

    private boolean isSupportedMediaDocumentProfile(MediaLinkProfile medialinkprofile, com.skype.MediaDocument.DOCUMENT_TYPE document_type)
    {
        return medialinkprofile != MediaLinkProfile.UNKNOWN_PROFILE && document_type != com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_URL_PREVIEW;
    }

    private void reportAnalyticsForDownloadError(MediaDocument mediadocument, com.skype.MediaDocument.NETWORK_ERROR network_error, boolean flag)
    {
        com.skype.MediaDocument.DOCUMENT_TYPE document_type = mediadocument.getDocTypeProp();
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$MediaDocument$DOCUMENT_TYPE[];
            static final int $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[];
            static final int $SwitchMap$com$skype$Message$SENDING_STATUS[];
            static final int $SwitchMap$com$skype$Message$TYPE[];
            static final int $SwitchMap$com$skype$android$app$media$MediaLinkProfile[];

            static 
            {
                $SwitchMap$com$skype$MediaDocument$DOCUMENT_TYPE = new int[com.skype.MediaDocument.DOCUMENT_TYPE.values().length];
                try
                {
                    $SwitchMap$com$skype$MediaDocument$DOCUMENT_TYPE[com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_PHOTO.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$DOCUMENT_TYPE[com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS = new int[com.skype.MediaDocument.MEDIA_STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_BAD_CONTENT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_NOT_AVAILABLE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                $SwitchMap$com$skype$Message$TYPE = new int[com.skype.Message.TYPE.values().length];
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_MEDIA_MESSAGE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_FLIK_MESSAGE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                $SwitchMap$com$skype$Message$SENDING_STATUS = new int[com.skype.Message.SENDING_STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Message$SENDING_STATUS[com.skype.Message.SENDING_STATUS.SENT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$skype$Message$SENDING_STATUS[com.skype.Message.SENDING_STATUS.FAILED_TO_SEND.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                $SwitchMap$com$skype$android$app$media$MediaLinkProfile = new int[MediaLinkProfile.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.DEFAULT_PROFILE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.IMG_PROFILE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.FAVICON_PROFILE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.THUMBNAIL_PROFILE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.PREVIEW_PROFILE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.VIDEO_PROFILE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.SAVE_PROFILE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.GROUP_AVATAR_PROFILE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.ORIGINAL.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.MediaDocument.DOCUMENT_TYPE[document_type.ordinal()])
        {
        default:
            Object obj = new AnalyticsParameterContainer();
            ((AnalyticsParameterContainer) (obj)).a(AnalyticsParameter.b, document_type.toString());
            ((AnalyticsParameterContainer) (obj)).a(AnalyticsParameter.e, networkUtil.b(contactUtil, accountProvider.get()));
            ((AnalyticsParameterContainer) (obj)).a(AnalyticsParameter.q, network_error.toString());
            network_error = analytics;
            if (flag)
            {
                mediadocument = AnalyticsEvent.bP;
            } else
            {
                mediadocument = AnalyticsEvent.bO;
            }
            network_error.a(mediadocument, obj);
            return;

        case 1: // '\001'
            obj = analytics;
            if (flag)
            {
                mediadocument = AnalyticsEvent.bw;
            } else
            {
                mediadocument = AnalyticsEvent.bv;
            }
            ((Analytics) (obj)).a(mediadocument, network_error.toString());
            return;

        case 2: // '\002'
            break;
        }
        if (flag)
        {
            obj = new SkypeTelemetryEvent(LogEvent.P);
        } else
        {
            obj = new SkypeTelemetryEvent(LogEvent.S);
        }
        ((SkypeTelemetryEvent) (obj)).put(LogAttributeName.F, XmmUtil.getMediaDocumentId(mediadocument));
        ((SkypeTelemetryEvent) (obj)).put(LogAttributeName.b, network_error.toString());
        analytics.a(((SkypeTelemetryEvent) (obj)));
    }

    private void reportAnalyticsPerStatus(MediaDocument mediadocument, com.skype.MediaDocument.MEDIA_STATUS media_status, MediaLinkProfile medialinkprofile)
    {
        _cls1..SwitchMap.com.skype.MediaDocument.MEDIA_STATUS[media_status.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 37
    //                   2 37
    //                   3 228;
           goto _L1 _L2 _L2 _L3
_L1:
        return;
_L2:
        if (medialinkprofile == MediaLinkProfile.SAVE_PROFILE)
        {
            analytics.c(AnalyticsEvent.bt);
            return;
        }
        if (medialinkprofile == MediaLinkProfile.PREVIEW_PROFILE)
        {
            analytics.c(AnalyticsEvent.bs);
            return;
        }
        if (medialinkprofile == MediaLinkProfile.GROUP_AVATAR_PROFILE)
        {
            mediadocument = new AnalyticsParameterContainer();
            mediadocument.a(AnalyticsParameter.q, media_status.name());
            mediadocument.a(AnalyticsParameter.e, networkUtil.b(contactUtil, accountProvider.get()));
            analytics.a(AnalyticsEvent.bN, mediadocument);
            return;
        }
        if (mediadocument.getDocTypeProp() == com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK)
        {
            SkypeTelemetryEvent skypetelemetryevent = new SkypeTelemetryEvent(LogEvent.af);
            skypetelemetryevent.put(LogAttributeName.E, XmmUtil.getMetadataStringValue(mediadocument, "pickerTitle"));
            skypetelemetryevent.put(LogAttributeName.F, XmmUtil.getMediaDocumentId(mediadocument));
            skypetelemetryevent.put(LogAttributeName.b, String.format("%s for profile %s", new Object[] {
                media_status.name(), medialinkprofile
            }));
            analytics.a(skypetelemetryevent);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (mediadocument.getDocTypeProp() == com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK)
        {
            media_status = new SkypeTelemetryEvent(LogEvent.Q);
            media_status.put(LogAttributeName.F, XmmUtil.getMediaDocumentId(mediadocument));
            media_status.put(LogAttributeName.a, medialinkprofile.toString());
            analytics.a(media_status);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    boolean onAcceptEvent(OnMediaUploadRetry onmediauploadretry)
    {
        return getAccount().getStatusProp() == com.skype.Account.STATUS.LOGGED_IN;
    }

    boolean onAcceptEvent(com.skype.android.gen.SkyLibListener.OnMessage onmessage)
    {
        return getAccount().getStatusProp() == com.skype.Account.STATUS.LOGGED_IN;
    }

    public void onEvent(OnMediaUploadAutoRetry onmediauploadautoretry)
    {
        ConversationImpl conversationimpl = new ConversationImpl();
        if (lib.getConversationByIdentity(onmediauploadautoretry.getConversationIdentity(), conversationimpl, false))
        {
            int i = conversationimpl.getDbID();
            notificationManager.cancel(FAILED_MEDIA_DOCUMENT_NOTIFICATION_ID | i);
            if (mediaDocumentQueue.hasFailedUploadsForConversation(i))
            {
                try
                {
                    onmediauploadautoretry = mediaDocumentQueue.getFailedUploadsByConvoDbId(i).iterator();
                    do
                    {
                        if (!onmediauploadautoretry.hasNext())
                        {
                            break;
                        }
                        Integer integer = (Integer)onmediauploadautoretry.next();
                        MediaDocument mediadocument = (MediaDocument)map.a(integer.intValue(), com/skype/MediaDocument);
                        int j = mediaDocumentQueue.getMessageIdForFailedUpload(integer.intValue());
                        if (mediadocument.getStatusProp() == com.skype.MediaDocument.STATUS.FAILED || mediadocument.getUploadStatus(getContentId(mediadocument.getDocTypeProp())) == com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_FAILED || isMessageDeliveryFailed(j))
                        {
                            mediaDocumentUploadUtil.retryMediaDocumentUploadAsync(j, mediadocument);
                        }
                    } while (true);
                }
                // Misplaced declaration of an exception variable
                catch (OnMediaUploadAutoRetry onmediauploadautoretry)
                {
                    sendHandledObjectNotFoundTelemetry("onEventForOnMediaUploadAutoRetry");
                }
            }
        }
    }

    public void onEvent(OnMediaUploadRetry onmediauploadretry)
    {
        if (onmediauploadretry.isStarted())
        {
            mediaDocumentQueue.addToUploadQueue(onmediauploadretry.getMessageId(), onmediauploadretry.getMediaDocumentId());
        } else
        {
            mediaDocumentQueue.addFailedUpload(onmediauploadretry.getMessageId(), onmediauploadretry.getMediaDocumentId());
            onmediauploadretry = XmmUtil.getMediaDocumentForMessageId(map, onmediauploadretry.getMessageId());
            if (onmediauploadretry != null && onmediauploadretry.getDocTypeProp() == com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_PHOTO)
            {
                constructNotificationForFailedUploads();
                return;
            }
        }
    }

    public void onEvent(com.skype.android.gen.MediaDocumentListener.OnDownloadError ondownloaderror)
    {
        String s = ondownloaderror.getProfile();
        if (isSupportedMediaDocumentProfile(MediaLinkProfile.fromString(s), ondownloaderror.getSender().getDocTypeProp()))
        {
            MediaDocument mediadocument = ondownloaderror.getSender();
            reportAnalyticsForDownloadError(mediadocument, ondownloaderror.getError(), ondownloaderror.getIsCritical());
            if (ondownloaderror.getIsCritical() && (!ondownloaderror.getProfile().equalsIgnoreCase(MediaLinkProfile.SAVE_PROFILE.toString()) || !handleFailedMediaDownloadForSave(mediadocument)))
            {
                eventBus.a(new OnMediaDownloadCriticalError(ondownloaderror.getSender().getObjectID(), MediaLinkProfile.fromString(s)));
                return;
            }
        }
    }

    public void onEvent(com.skype.android.gen.MediaDocumentListener.OnMediaLinkProgress onmedialinkprogress)
    {
        MediaLinkProfile medialinkprofile = MediaLinkProfile.fromString(onmedialinkprogress.getProfile());
        if (!isSupportedMediaDocumentProfile(medialinkprofile, onmedialinkprogress.getSender().getDocTypeProp()))
        {
            return;
        }
        switch (_cls1..SwitchMap.com.skype.android.app.media.MediaLinkProfile[medialinkprofile.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 6: // '\006'
        case 9: // '\t'
            eventBus.a(new OnMediaDefaultLinkUpdate(onmedialinkprogress.getSender(), onmedialinkprogress.getProfile(), com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADING, onmedialinkprogress.getSizeDownloaded(), onmedialinkprogress.getTotalSize()));
            break;
        }
    }

    public void onEvent(com.skype.android.gen.MediaDocumentListener.OnMediaLinkStatusChange onmedialinkstatuschange)
    {
        MediaLinkProfile medialinkprofile;
        com.skype.MediaDocument.MEDIA_STATUS media_status;
        String s;
        int i;
        medialinkprofile = MediaLinkProfile.fromString(onmedialinkstatuschange.getProfile());
        if (!isSupportedMediaDocumentProfile(medialinkprofile, onmedialinkstatuschange.getSender().getDocTypeProp()))
        {
            return;
        }
        media_status = onmedialinkstatuschange.getStatus();
        i = onmedialinkstatuschange.getSender().getObjectID();
        s = onmedialinkstatuschange.getPath();
        _cls1..SwitchMap.com.skype.android.app.media.MediaLinkProfile[medialinkprofile.ordinal()];
        JVM INSTR tableswitch 1 8: default 104
    //                   1 115
    //                   2 149
    //                   3 149
    //                   4 149
    //                   5 173
    //                   6 197
    //                   7 197
    //                   8 227;
           goto _L1 _L2 _L3 _L3 _L3 _L4 _L5 _L5 _L6
_L1:
        reportAnalyticsPerStatus(onmedialinkstatuschange.getSender(), media_status, medialinkprofile);
        return;
_L2:
        if (media_status != com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
        {
            eventBus.a(new OnMediaDefaultLinkUpdate(onmedialinkstatuschange.getSender(), onmedialinkstatuschange.getProfile(), media_status));
        }
        continue; /* Loop/switch isn't completed */
_L3:
        eventBus.a(new OnMediaThumbnailLinkStatusChange(i, media_status, s, medialinkprofile));
        continue; /* Loop/switch isn't completed */
_L4:
        eventBus.a(new OnMediaDocumentLinkStatusChange(i, media_status, s, medialinkprofile));
        continue; /* Loop/switch isn't completed */
_L5:
        if (media_status == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
        {
            eventBus.a(new OnMediaDownloadedForSave(i, s, medialinkprofile));
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (media_status == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
        {
            eventBus.a(new OnMediaGroupAvatarLoaded(i));
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void onEvent(com.skype.android.gen.MediaDocumentListener.OnPropertyChange onpropertychange)
    {
        if (onpropertychange.getPropKey() == PROPKEY.MEDIADOCUMENT_STATUS)
        {
            MediaDocument mediadocument = (MediaDocument)onpropertychange.getSender();
            int i = mediadocument.getObjectID();
            com.skype.MediaDocument.STATUS status = mediadocument.getStatusProp();
            log.info((new StringBuilder("MediaDocumentListener.OnPropertyChange mediaDocumentID:")).append(i).append(" propKey: ").append(onpropertychange.getPropKey()).append(" upload status ").append(mediadocument.getUploadStatus(getContentId(mediadocument.getDocTypeProp()))).append(" status ").append(status).toString());
            if (status == com.skype.MediaDocument.STATUS.FAILED)
            {
                handleFailedMediaUpload(mediadocument);
            }
            eventBus.a(new OnMediaUploadStatusChange(i));
        }
    }

    public void onEvent(com.skype.android.gen.MediaDocumentListener.OnUploadError onuploaderror)
    {
        MediaDocument mediadocument = onuploaderror.getSender();
        int i = mediadocument.getObjectID();
        log.info((new StringBuilder("MediaDocumentListener.OnUploadError mediaDocumentID:")).append(i).append(" error:").append(onuploaderror.getError()).toString());
        if (mediadocument.getStatusProp() == com.skype.MediaDocument.STATUS.FAILED || mediadocument.getUploadStatus(getContentId(mediadocument.getDocTypeProp())) == com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_FAILED)
        {
            handleFailedMediaUpload(mediadocument);
        }
        eventBus.a(new OnMediaUploadStatusChange(i));
    }

    public void onEvent(com.skype.android.gen.MediaDocumentListener.OnUploadProgress onuploadprogress)
    {
        MediaLinkProfile medialinkprofile = MediaLinkProfile.fromString(onuploadprogress.getContentId());
        switch (_cls1..SwitchMap.com.skype.android.app.media.MediaLinkProfile[medialinkprofile.ordinal()])
        {
        case 7: // '\007'
        case 8: // '\b'
        default:
            return;

        case 6: // '\006'
        case 9: // '\t'
            eventBus.a(new OnMediaUploadProgress(onuploadprogress.getSender(), onuploadprogress.getContentId(), com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADING, onuploadprogress.getSizeUploaded(), onuploadprogress.getTotalSize()));
            break;
        }
    }

    public void onEvent(com.skype.android.gen.MediaDocumentListener.OnUploadStatusChanged onuploadstatuschanged)
    {
        Object obj;
        int i;
        i = onuploadstatuschanged.getSender().getObjectID();
        obj = onuploadstatuschanged.getStatus();
        log.info((new StringBuilder("MediaDocumentListener.OnUploadStatusChanged mediaDocumentID:")).append(i).append(" status:").append(obj).toString());
        eventBus.a(new OnMediaUploadStatusChange(i));
        if (obj != com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_COMPLETED) goto _L2; else goto _L1
_L1:
        int j = mediaDocumentQueue.getMessageIdForQueuedUpload(i);
        if (j == -1) goto _L2; else goto _L3
_L3:
        try
        {
            obj = (Message)map.a(j, com/skype/Message);
        }
        // Misplaced declaration of an exception variable
        catch (com.skype.android.gen.MediaDocumentListener.OnUploadStatusChanged onuploadstatuschanged)
        {
            sendHandledObjectNotFoundTelemetry("onEventForOnUploadStatusChanged");
            return;
        }
        _cls1..SwitchMap.com.skype.Message.SENDING_STATUS[((Message) (obj)).getSendingStatusProp().ordinal()];
        JVM INSTR tableswitch 1 2: default 140
    //                   1 150
    //                   2 156;
           goto _L2 _L4 _L5
_L2:
        return;
_L4:
        handleCompletedUpload(i);
        return;
_L5:
        handleFailedMediaUpload(onuploadstatuschanged.getSender());
        return;
    }

    public void onEvent(com.skype.android.gen.MessageListener.OnPropertyChange onpropertychange)
    {
        if (onpropertychange.getPropKey() != PROPKEY.MESSAGE_SENDING_STATUS) goto _L2; else goto _L1
_L1:
        com.skype.Message.SENDING_STATUS sending_status;
        onpropertychange = (Message)onpropertychange.getSender();
        sending_status = onpropertychange.getSendingStatusProp();
        if (onpropertychange.getTypeProp() != com.skype.Message.TYPE.POSTED_MEDIA_MESSAGE && onpropertychange.getTypeProp() != com.skype.Message.TYPE.POSTED_VIDEO || sending_status == com.skype.Message.SENDING_STATUS.SENDING) goto _L2; else goto _L3
_L3:
        MediaDocumentImpl mediadocumentimpl = new MediaDocumentImpl();
        if (!onpropertychange.getMediaDocument(mediadocumentimpl)) goto _L2; else goto _L4
_L4:
        int i = mediadocumentimpl.getObjectID();
        _cls1..SwitchMap.com.skype.Message.SENDING_STATUS[sending_status.ordinal()];
        JVM INSTR tableswitch 1 2: default 112
    //                   1 119
    //                   2 113;
           goto _L2 _L5 _L6
_L2:
        return;
_L6:
        handleFailedMediaUpload(mediadocumentimpl);
        return;
_L5:
        if (mediadocumentimpl.getUploadStatus(getContentId(mediadocumentimpl.getDocTypeProp())) == com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_COMPLETED)
        {
            handleCompletedUpload(i);
            return;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnMessage onmessage)
    {
        try
        {
            onmessage = (Message)map.a(onmessage.getMessageObjectID(), com/skype/Message);
        }
        // Misplaced declaration of an exception variable
        catch (com.skype.android.gen.SkyLibListener.OnMessage onmessage)
        {
            sendHandledObjectNotFoundTelemetry("onEventForOnMessage");
            return;
        }
        _cls1..SwitchMap.com.skype.Message.TYPE[onmessage.getTypeProp().ordinal()];
        JVM INSTR tableswitch 1 2: default 56
    //                   1 66
    //                   2 209;
           goto _L1 _L2 _L3
_L1:
        MediaDocumentImpl mediadocumentimpl;
        return;
_L2:
        boolean flag;
        if (onmessage.getMediaDocument(mediadocumentimpl = new MediaDocumentImpl()))
        {
            flag = onmessage.getAuthorProp().equals(getAccount().getSkypenameProp());
            if (onmessage.getConsumptionStatusProp() == com.skype.Message.CONSUMPTION_STATUS.CONSUMED)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!flag)
            {
                analytics.c(AnalyticsEvent.bo);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (!flag || onmessage.getSendingStatusProp() != com.skype.Message.SENDING_STATUS.SENDING) goto _L1; else goto _L4
_L4:
        log.info((new StringBuilder("MediaDocumentListener SkyLibListener.OnMessage message ")).append(onmessage.getObjectID()).append(" sending status:").append(onmessage.getSendingStatusProp()).toString());
        mediaDocumentQueue.addToUploadQueue(onmessage.getObjectID(), mediadocumentimpl.getObjectID());
        return;
_L3:
        MediaDocumentImpl mediadocumentimpl1 = new MediaDocumentImpl();
        if (onmessage.getMediaDocument(mediadocumentimpl1))
        {
            if (!getUserPreferences().autoDownloadMojisOnWifiOnly() || networkUtil.d())
            {
                mediadocumentimpl1.getMediaLink(MediaLinkProfile.DEFAULT_PROFILE.toString());
                return;
            } else
            {
                onmessage = new SkypeTelemetryEvent(LogEvent.W);
                onmessage.put(LogAttributeName.F, XmmUtil.getMediaDocumentId(mediadocumentimpl1));
                analytics.a(onmessage);
                return;
            }
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected void sendHandledObjectNotFoundTelemetry(String s)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        s = (new StringBuilder()).append(getClass().getSimpleName()).append("-").append(s).toString();
        analyticsparametercontainer.a(AnalyticsParameter.T, s);
        analytics.a(AnalyticsEvent.df, analyticsparametercontainer);
    }

}
