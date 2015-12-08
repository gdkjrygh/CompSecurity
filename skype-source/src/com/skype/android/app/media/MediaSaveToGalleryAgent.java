// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.skype.Account;
import com.skype.MediaDocument;
import com.skype.Message;
import com.skype.VideoMessage;
import com.skype.VideoMessageImpl;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.Agent;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.FileUtil;
import com.skype.android.event.EventBus;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.AccountUtil;
import java.util.HashSet;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.media:
//            MediaSaveCallback, MediaLinkProfile, MediaDocumentDownloadUtil, XmmUtil, 
//            OnMediaDownloadedForSave, OnMediaSaveToGallery, MediaLinkSaveError

public class MediaSaveToGalleryAgent extends Agent
{

    Account account;
    Analytics analytics;
    AsyncService async;
    EventBus eventBus;
    ObjectIdMap map;
    MediaDocumentDownloadUtil mediaDocumentDownloadUtil;
    private HashSet pendingSaveAsyncViMIdSet;
    private HashSet pendingSaveP2PVideoMessageSet;

    public MediaSaveToGalleryAgent(Application application)
    {
        super(application);
        pendingSaveAsyncViMIdSet = new HashSet();
        pendingSaveP2PVideoMessageSet = new HashSet();
    }

    private void downloadRemoteVim(final String vimUrlPath, VideoMessage videomessage)
    {
        vimUrlPath = new Callable() {

            final MediaSaveToGalleryAgent this$0;
            final String val$vimUrlPath;

            public final MediaLinkSaveError call()
                throws Exception
            {
                return FileUtil.downloadAndSaveVideoMessage(getContext(), vimUrlPath);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = MediaSaveToGalleryAgent.this;
                vimUrlPath = s;
                super();
            }
        };
        async.a(vimUrlPath, new MediaSaveCallback(getContext(), analytics, MediaLinkProfile.VIDEO_PROFILE, videomessage.getAuthorProp().equals(account.getSkypenameProp()), eventBus));
    }

    private Message getMessage(MediaDocument mediadocument)
    {
        int i = mediadocument.getMessageIdProp();
        return (Message)map.a(i, com/skype/Message);
    }

    private void saveAsyncVideoMessage(MediaDocument mediadocument)
    {
        com.skype.MediaDocument.GetMediaLink_Result getmedialink_result1 = mediadocument.getMediaLink((new StringBuilder("?")).append(MediaLinkProfile.VIDEO_PROFILE.toString()).toString(), com.skype.MediaDocument.MEDIA_GET_POLICY.CACHE_ONLY);
        com.skype.MediaDocument.GetMediaLink_Result getmedialink_result = getmedialink_result1;
        if (TextUtils.isEmpty(getmedialink_result1.m_path))
        {
            getmedialink_result = mediadocument.getMediaLink(MediaLinkProfile.VIDEO_PROFILE.toString(), com.skype.MediaDocument.MEDIA_GET_POLICY.CACHE_THEN_DOWNLOAD);
        }
        if (!TextUtils.isEmpty(getmedialink_result.m_path))
        {
            saveVideoMessageFromLocalPath(getmedialink_result.m_path, getMessage(mediadocument));
            return;
        } else
        {
            pendingSaveAsyncViMIdSet.add(Integer.valueOf(mediadocument.getObjectID()));
            return;
        }
    }

    private void saveMediaDocument(MediaDocument mediadocument, MediaLinkProfile medialinkprofile)
    {
        static final class _cls3
        {

            static final int $SwitchMap$com$skype$android$app$media$MediaLinkProfile[];

            static 
            {
                $SwitchMap$com$skype$android$app$media$MediaLinkProfile = new int[MediaLinkProfile.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.VIDEO_PROFILE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.SAVE_PROFILE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3..SwitchMap.com.skype.android.app.media.MediaLinkProfile[medialinkprofile.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 111;
           goto _L1 _L2 _L3
_L1:
        int i;
        return;
_L2:
        if (pendingSaveAsyncViMIdSet.contains(Integer.valueOf(i = mediadocument.getObjectID())))
        {
            pendingSaveAsyncViMIdSet.remove(Integer.valueOf(i));
            mediaDocumentDownloadUtil.saveMediaAsync(mediadocument, medialinkprofile, new MediaSaveCallback(getContext(), analytics, MediaLinkProfile.VIDEO_PROFILE, AccountUtil.a(getMessage(mediadocument), account), eventBus));
            return;
        }
          goto _L1
_L3:
        mediaDocumentDownloadUtil.saveMediaAsync(mediadocument, medialinkprofile, new MediaSaveCallback(getContext(), analytics, MediaLinkProfile.SAVE_PROFILE, eventBus));
        return;
    }

    private void saveMediaToGallery(Message message)
    {
        MediaDocument mediadocument;
        Toast.makeText(getContext(), getContext().getString(0x7f08041d), 0).show();
        mediadocument = XmmUtil.getMediaDocument(message);
        if (mediadocument == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        if (mediadocument.getDocTypeProp() != com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_VIDEO) goto _L2; else goto _L1
_L1:
        saveAsyncVideoMessage(mediadocument);
_L4:
        return;
_L2:
        if (mediadocument.getDocTypeProp() != com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_PHOTO) goto _L4; else goto _L3
_L3:
        saveMediaDocument(mediadocument, MediaLinkProfile.SAVE_PROFILE);
        return;
        saveP2PVideoMessage(message);
        return;
    }

    private void saveP2PVideoMessage(Message message)
    {
        VideoMessageImpl videomessageimpl = new VideoMessageImpl();
        message.getVideoMessage(videomessageimpl);
        String s = videomessageimpl.getLocalPathProp();
        if (!TextUtils.isEmpty(s))
        {
            saveVideoMessageFromLocalPath(s, message);
            return;
        } else
        {
            videomessageimpl.prepareForPlay(true);
            pendingSaveP2PVideoMessageSet.add(videomessageimpl);
            return;
        }
    }

    private void saveVideoMessageFromLocalPath(final String localPath, Message message)
    {
        localPath = new Callable() {

            final MediaSaveToGalleryAgent this$0;
            final String val$localPath;

            public final MediaLinkSaveError call()
                throws Exception
            {
                return FileUtil.copyVimToGallery(localPath, getContext());
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = MediaSaveToGalleryAgent.this;
                localPath = s;
                super();
            }
        };
        async.a(localPath, new MediaSaveCallback(getContext(), analytics, MediaLinkProfile.VIDEO_PROFILE, AccountUtil.a(message, account), eventBus));
    }

    public void onEvent(OnMediaDownloadedForSave onmediadownloadedforsave)
    {
        saveMediaDocument((MediaDocument)map.a(onmediadownloadedforsave.getMediaDocumentId(), com/skype/MediaDocument), onmediadownloadedforsave.getProfile());
    }

    public void onEvent(OnMediaSaveToGallery onmediasavetogallery)
    {
        saveMediaToGallery(onmediasavetogallery.getMessage());
    }

    public void onEvent(com.skype.android.gen.VideoMessageListener.OnPropertyChange onpropertychange)
    {
        onpropertychange = (VideoMessage)onpropertychange.getSender();
        if (pendingSaveP2PVideoMessageSet.contains(onpropertychange) && !TextUtils.isEmpty(onpropertychange.getVodPathProp()))
        {
            com.skype.VideoMessage.VOD_STATUS vod_status = onpropertychange.getVodStatusProp();
            if (vod_status == com.skype.VideoMessage.VOD_STATUS.VOD_PLAYABLE || vod_status == com.skype.VideoMessage.VOD_STATUS.VOD_PLAYABLE_LOCAL)
            {
                pendingSaveP2PVideoMessageSet.remove(onpropertychange);
                downloadRemoteVim(onpropertychange.getVodPathProp(), onpropertychange);
            }
        }
    }


}
