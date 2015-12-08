// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Application;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.c;
import com.google.android.gms.wearable.o;
import com.skype.Account;
import com.skype.ContactImpl;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.MediaDocument;
import com.skype.MediaDocumentImpl;
import com.skype.Message;
import com.skype.Metatag;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.SmsImpl;
import com.skype.Transfer;
import com.skype.VideoMessageImpl;
import com.skype.Voicemail;
import com.skype.VoicemailImpl;
import com.skype.android.SkypeConstants;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.app.Agent;
import com.skype.android.app.NotificationId;
import com.skype.android.app.OnForegroundChanged;
import com.skype.android.app.calling.CallConstants;
import com.skype.android.app.main.SplashActivity;
import com.skype.android.app.media.MediaLinkProfile;
import com.skype.android.app.media.XmmUtil;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.wear.RemoteNodeWearModule;
import com.skype.android.app.wear.WearModule;
import com.skype.android.badges.BadgeNotification;
import com.skype.android.badges.BadgeNotificationFactory;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.LoginManager;
import com.skype.android.push.ChatPushMessage;
import com.skype.android.push.DisplayResult;
import com.skype.android.push.OnChatPushMessageStoredEvent;
import com.skype.android.push.PushHandlingHelper;
import com.skype.android.push.PushMessageRepository;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.skylib.ObjectInterfaceNotFoundException;
import com.skype.android.util.CheckedBroadcastReceiver;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ViewUtil;
import com.skype.android.wakeup.DreamKeeper;
import com.skype.android.wakeup.ForegroundState;
import com.skype.msnp.MsnpIdentity;
import com.skype.msnp.MsnpIdentityType;
import com.skype.msnp.MsnpMessage;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.chat:
//            i, NotificationRouter, MessageHolder, SkypeMessageHolder, 
//            PushMessageHolder, AnnotationUtil

public class MessageAgent extends Agent
    implements SkypeConstants, CallConstants
{
    private final class a extends CheckedBroadcastReceiver
    {

        final MessageAgent this$0;

        public final void onReceiveFiltered(Context context1, Intent intent, int j)
        {
            switch (j)
            {
            default:
                return;

            case 0: // '\0'
                setBackgroundedTime(System.currentTimeMillis());
                return;

            case 1: // '\001'
                j = intent.getIntExtra("0", 0);
                break;
            }
            conversationUtil.b(j);
        }

        a()
        {
            this$0 = MessageAgent.this;
            super(MessageAgent.NOTIFICATION_DELETE_ACTIONS);
        }
    }


    public static final String CHAT_NOTIF_DELETE_ACTION = "CHAT_NOTIF_DELETE";
    private static final int CHAT_NOTIF_DELETE_POSITION = 0;
    private static final int MEDIA_MESSAGE_NOTIFICATION_ID = NotificationId.newId();
    public static final int MESSAGE_CHAT_NOTIFICATION_ID = NotificationId.newId();
    private static Comparator MESSAGE_COMPARATOR = Collections.reverseOrder(new i());
    private static final String MISSED_CALL_ID = "0";
    private static final String MISSED_CALL_NOTIF_DELETE_ACTION = "MISSED_NOTIF_DELETE";
    private static final int MISSED_CALL_NOTIF_DELETE_POSITION = 1;
    private static final String NOTIFICATION_DELETE_ACTIONS[] = {
        "CHAT_NOTIF_DELETE", "MISSED_NOTIF_DELETE"
    };
    private static final int SOUND_NOTIFICATION_INTERVAL_MS = 3000;
    private static final int VOICEMAIL_NOTIFICATION_ID = NotificationId.newId();
    private static final Logger log = Logger.getLogger("MessageAgent");
    private Set alreadyNotified;
    private Analytics analytics;
    private AnnotationUtil annotationUtil;
    private BadgeNotification badgeNotification;
    private ContactUtil contactUtil;
    private Context context;
    private ConversationUtil conversationUtil;
    private DreamKeeper dreamKeeper;
    private EcsConfiguration ecsConfiguration;
    private ForegroundState foregroundState;
    private final c googleApiClient;
    private ImageCache imageCache;
    private long lastNotificationSound;
    private SkyLib lib;
    private LoginManager loginManager;
    private ObjectIdMap map;
    private a notificationDeleteReceiver;
    private NotificationManager notificationManager;
    private NotificationRouter notificationRouter;
    private Map pendingMediaNotifications;
    private PushHandlingHelper pushHandlingHelper;
    private PushMessageRepository pushMessageRepository;
    private final WearModule remoteNodeWearModule;

    public MessageAgent(Application application, ForegroundState foregroundstate, DreamKeeper dreamkeeper, SkyLib skylib, ObjectIdMap objectidmap, ConversationUtil conversationutil, ContactUtil contactutil, 
            NotificationManager notificationmanager, ImageCache imagecache, PushMessageRepository pushmessagerepository, PushHandlingHelper pushhandlinghelper, LoginManager loginmanager, NotificationRouter notificationrouter, EcsConfiguration ecsconfiguration, 
            Analytics analytics1, AnnotationUtil annotationutil)
    {
        super(application);
        alreadyNotified = new HashSet();
        context = application;
        foregroundState = foregroundstate;
        dreamKeeper = dreamkeeper;
        lib = skylib;
        map = objectidmap;
        conversationUtil = conversationutil;
        contactUtil = contactutil;
        notificationManager = notificationmanager;
        imageCache = imagecache;
        pushMessageRepository = pushmessagerepository;
        pushHandlingHelper = pushhandlinghelper;
        loginManager = loginmanager;
        notificationDeleteReceiver = new a();
        pendingMediaNotifications = new HashMap();
        notificationRouter = notificationrouter;
        ecsConfiguration = ecsconfiguration;
        analytics = analytics1;
        annotationUtil = annotationutil;
        badgeNotification = BadgeNotificationFactory.getBadgeObject(application);
        googleApiClient = (new com.google.android.gms.common.api.c.a(application)).a(new com.google.android.gms.common.api.c.c() {

            final MessageAgent this$0;

            public final void onConnectionFailed(ConnectionResult connectionresult)
            {
                MessageAgent.log.info("Failed to connect to Google Play Services.");
            }

            
            {
                this$0 = MessageAgent.this;
                super();
            }
        }).b(o.l).b();
        if (ecsconfiguration.isWearRemoteControlEnabled())
        {
            application = new RemoteNodeWearModule(googleApiClient);
        } else
        {
            application = WearModule.NULL_OBJECT;
        }
        remoteNodeWearModule = application;
    }

    private void addToMapAndListen(ObjectInterface objectinterface)
    {
        if (map.a(objectinterface.getObjectID()) == null)
        {
            map.b(objectinterface);
            map.a(objectinterface);
        }
    }

    private boolean canShowChatNotification()
    {
        boolean flag;
        if (!foregroundState.c() && getUserPreferences().isNewMessageNotificationEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        log.info((new StringBuilder("canShowChatNotification() res: ")).append(flag).toString());
        return flag;
    }

    private void cancelChatNotification()
    {
        notificationRouter.clearAll();
    }

    private void cancelChatNotification(int j)
    {
        notificationRouter.clear(j);
    }

    private boolean chatMessageExists(ChatPushMessage chatpushmessage)
    {
        chatpushmessage = getChatMessageIds(chatpushmessage);
        return chatpushmessage != null && chatpushmessage.length > 0;
    }

    private android.support.v4.app.x.d createMediaMessageNotificationBuilder(Conversation conversation, boolean flag, String s, Bitmap bitmap)
    {
        CharSequence charsequence = conversationUtil.m(conversation);
        SpannableStringBuilder spannablestringbuilder = ViewUtil.a(charsequence, s);
        conversation = conversation.getIdentityProp();
        android.support.v4.app.x.d d = createNotificationBuilder(flag);
        s = d.a(0x7f0201bc).a(charsequence).c(spannablestringbuilder).b(s);
        s.g = bitmap;
        s.b(context.getResources().getColor(0x7f0f00d3)).a(getContentIntent(conversation));
        return d;
    }

    private android.support.v4.app.x.d createNotificationBuilder(boolean flag)
    {
        android.support.v4.app.x.d d = new android.support.v4.app.x.d(context);
        d.b(true).c(true);
        char c;
        if (getUserPreferences().isNotificationLightEnabled())
        {
            c = '\u05DC';
        } else
        {
            c = '\0';
        }
        d.b(c, c);
        if (flag)
        {
            d.a(getChatSoundUri());
        }
        return d;
    }

    private List dedupeMessages(List list)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            MessageHolder messageholder = (MessageHolder)list.next();
            if (isUnique(messageholder))
            {
                arraylist.add(messageholder);
            }
        } while (true);
        return arraylist;
    }

    private long getBackgroundedTime()
    {
        UserPreferences userpreferences = getUserPreferences();
        if (userpreferences == null)
        {
            return 0L;
        } else
        {
            return userpreferences.getBackgroundedTime();
        }
    }

    private int[] getChatMessageIds(ChatPushMessage chatpushmessage)
    {
        chatpushmessage = chatpushmessage.getMsnpMessage();
        if (chatpushmessage == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        chatpushmessage = chatpushmessage.e();
        if (chatpushmessage == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        long l = (new BigInteger(chatpushmessage)).longValue();
        long l1 = (int)l;
        chatpushmessage = String.format("crc = %d AND remote_id = %d", new Object[] {
            Long.valueOf((long)(int)(l >> 32) & 0xffffffffL), Long.valueOf(l1 & 0xffffffffL)
        });
        chatpushmessage = lib.findObjects(com.skype.SkyLib.OBJECTTYPE.MESSAGE, chatpushmessage).m_objectIDList;
        return chatpushmessage;
        chatpushmessage;
        return null;
    }

    private Uri getChatSoundUri()
    {
        return Uri.parse((new StringBuilder("android.resource://")).append(context.getPackageName()).append("/2131165194").toString());
    }

    private PendingIntent getContentIntent(String s)
    {
        int j = 0;
        Intent intent = new Intent(context, com/skype/android/app/main/SplashActivity);
        intent.addFlags(0x10000000);
        if (s != null)
        {
            intent.setAction("android.intent.action.VIEW");
            intent.putExtra("com.skype.identitiy", s);
        } else
        {
            intent.putExtra("com.skype.index", 0);
        }
        if (s != null)
        {
            j = s.hashCode();
        }
        return PendingIntent.getActivity(context, j, intent, 0x8000000);
    }

    private long getForegroundedTime()
    {
        UserPreferences userpreferences = getUserPreferences();
        if (userpreferences == null)
        {
            return 0L;
        } else
        {
            return userpreferences.getForegroundedTime();
        }
    }

    private PendingIntent getMissedCallActionIntent(Conversation conversation)
    {
        String s = conversation.getIdentityProp();
        Intent intent = new Intent(context, com/skype/android/app/main/SplashActivity);
        if (s != null)
        {
            intent.setAction("com.skype.callback");
            intent.putExtra("com.skype.identitiy", s);
        }
        intent.addFlags(0x10000000);
        return PendingIntent.getActivity(context, conversation.getObjectID(), intent, 0x10000000);
    }

    private PendingIntent getMissedCallDeleteIntent(int j)
    {
        Intent intent = new Intent("MISSED_NOTIF_DELETE");
        intent.putExtra("0", j);
        return PendingIntent.getBroadcast(context, j, intent, 0x10000000);
    }

    private List getStackedMessageHolders(MessageHolder messageholder, Map map1, List list)
    {
        ArrayList arraylist = new ArrayList();
        if (messageholder != null)
        {
            arraylist.add(messageholder);
        }
        if (map1 != null && !map1.isEmpty())
        {
            for (messageholder = map1.entrySet().iterator(); messageholder.hasNext(); arraylist.add(new SkypeMessageHolder((Conversation)map1.getKey(), (Message)map1.getValue(), conversationUtil)))
            {
                map1 = (java.util.Map.Entry)messageholder.next();
            }

        }
        if (list != null && !list.isEmpty())
        {
            for (messageholder = list.iterator(); messageholder.hasNext(); arraylist.add(new PushMessageHolder((ChatPushMessage)messageholder.next()))) { }
        }
        Collections.sort(arraylist, MESSAGE_COMPARATOR);
        messageholder = new ArrayList();
        map1 = arraylist.iterator();
        do
        {
            if (!map1.hasNext())
            {
                break;
            }
            list = (MessageHolder)map1.next();
            if (!messageholder.contains(list))
            {
                messageholder.add(list);
            }
        } while (true);
        return messageholder;
    }

    private PendingIntent getVoicemailActionIntent(String s, Voicemail voicemail)
    {
        Intent intent = new Intent(context, com/skype/android/app/main/SplashActivity);
        intent.setAction("com.skype.playVoicemail");
        intent.putExtra("com.skype.identitiy", s);
        intent.addFlags(0x10000000);
        intent.putExtra("voicemailToPlay", voicemail.getObjectID());
        return PendingIntent.getActivity(context, voicemail.getObjectID(), intent, 0x8000000);
    }

    private void handleLastMessage(int j)
    {
        Object obj;
        Conversation conversation;
        Object obj1;
        boolean flag;
        boolean flag2;
        try
        {
            obj = (Message)map.a(j, com/skype/Message);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            sendHandledObjectNotFoundTelemetry("handleLastMessageAMessage");
            return;
        }
        j = lib.findObjectByDbID(com.skype.SkyLib.OBJECTTYPE.CONVERSATION, ((Message) (obj)).getConvoIdProp());
        if (j <= 0 || ((Message) (obj)).getAuthorProp().equals(getAccount().getSkypenameProp())) goto _L2; else goto _L1
_L1:
        try
        {
            conversation = (Conversation)map.a(j, com/skype/Conversation);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            sendHandledObjectNotFoundTelemetry("handleLastMessageAConversation");
            return;
        }
        if (((Message) (obj)).getConsumptionStatusProp() != com.skype.Message.CONSUMPTION_STATUS.UNCONSUMED_NORMAL) goto _L2; else goto _L3
_L3:
        obj1 = pushMessageRepository.getMessages(conversation.getIdentityProp());
        flag = true;
        flag2 = flag;
        if (obj1 != null)
        {
            flag2 = flag;
            if (((List) (obj1)).size() > 0)
            {
                obj1 = (ChatPushMessage)((List) (obj1)).get(((List) (obj1)).size() - 1);
                flag2 = flag;
                if (obj1 != null)
                {
                    if (((ChatPushMessage) (obj1)).isConsumed() && conversation.getConsumptionHorizonProp() < ((Message) (obj)).getTimestampProp())
                    {
                        conversation.setConsumedHorizon(((Message) (obj)).getTimestampProp(), true);
                    }
                    boolean flag1;
                    if (!((ChatPushMessage) (obj1)).isDisplayedToUser())
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    flag2 = flag1;
                    if (flag1)
                    {
                        ((ChatPushMessage) (obj1)).setDisplayedToUser(true);
                        flag2 = flag1;
                    }
                }
            }
        }
        j = pushMessageRepository.removeMessages(conversation.getIdentityProp());
        log.info((new StringBuilder("PUSHMSGRECD: notify: ")).append(flag2).append(" removed ").append(j).append(" msg: ").append(((Message) (obj)).getBodyXmlProp()).toString());
        if (!flag2 || !canShowChatNotification()) goto _L2; else goto _L4
_L4:
        obj1 = ((Message) (obj)).getTypeProp();
        if (obj1 == null)
        {
            return;
        }
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$Message$TYPE[];
            static final int $SwitchMap$com$skype$PROPKEY[];
            static final int $SwitchMap$com$skype$android$app$media$MediaLinkProfile[];

            static 
            {
                $SwitchMap$com$skype$android$app$media$MediaLinkProfile = new int[MediaLinkProfile.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.THUMBNAIL_PROFILE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                $SwitchMap$com$skype$Message$TYPE = new int[com.skype.Message.TYPE.values().length];
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_LOCATION.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_SMS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_TEXT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_MEDIA_MESSAGE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_VIDEO.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_VIDEO_MESSAGE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_FILE_MESSAGE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_FILES.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_VOICE_MESSAGE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_FLIK_MESSAGE.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.ENDED_LIVESESSION.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_CONSUMPTION_HORIZON.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_UNCONSUMED_NORMAL_MESSAGES.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_LAST_MESSAGE_ID.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.MESSAGE_ANNOTATION_VERSION.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.skype.Message.TYPE[((com.skype.Message.TYPE) (obj1)).ordinal()];
        JVM INSTR tableswitch 1 11: default 408
    //                   1 435
    //                   2 435
    //                   3 435
    //                   4 435
    //                   5 435
    //                   6 435
    //                   7 435
    //                   8 455
    //                   9 475
    //                   10 488
    //                   11 591;
           goto _L5 _L6 _L6 _L6 _L6 _L6 _L6 _L6 _L7 _L8 _L9 _L10
_L5:
        if (XmmUtil.isXmmMessageType(((com.skype.Message.TYPE) (obj1))))
        {
            handleMediaMessage(((Message) (obj)), conversation, shouldPlayChatSound(), 0x7f0802ed);
        }
_L2:
        listenToSpecialMessageTypes(((Message) (obj)));
        return;
_L6:
        handleMessage(new SkypeMessageHolder(conversation, ((Message) (obj)), conversationUtil));
        continue; /* Loop/switch isn't completed */
_L7:
        handleMessage(new SkypeMessageHolder(conversation, ((Message) (obj)), conversationUtil));
        continue; /* Loop/switch isn't completed */
_L8:
        handleVoicemail(((Message) (obj)), conversation, shouldPlayChatSound());
        continue; /* Loop/switch isn't completed */
_L9:
        MediaDocumentImpl mediadocumentimpl = new MediaDocumentImpl();
        ((Message) (obj)).getMediaDocument(mediadocumentimpl);
        com.skype.MediaDocument.GetMediaLink_Result getmedialink_result = mediadocumentimpl.getMediaLink(MediaLinkProfile.THUMBNAIL_PROFILE.toString());
        if (getmedialink_result.m_return == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
        {
            handleMojiMessage(((Message) (obj)), conversation, shouldPlayChatSound(), 0x7f0804c5, getmedialink_result.m_path);
        } else
        {
            pendingMediaNotifications.put(mediadocumentimpl, obj);
            map.b(mediadocumentimpl);
            map.a(mediadocumentimpl);
        }
        continue; /* Loop/switch isn't completed */
_L10:
        handleMissedCall(shouldPlayChatSound());
        if (true) goto _L2; else goto _L11
_L11:
    }

    private void handleMediaMessage(Message message, Conversation conversation, boolean flag, int j)
    {
        handleMediaMessage(message, conversation, flag, j, imageCache.a(conversation, Boolean.valueOf(true)));
    }

    private void handleMediaMessage(Message message, Conversation conversation, boolean flag, int j, Bitmap bitmap)
    {
        if ((long)message.getTimestampProp() < getBackgroundedTime() / 1000L)
        {
            return;
        } else
        {
            conversation = createMediaMessageNotificationBuilder(conversation, flag, context.getString(j), bitmap);
            notificationManager.notify(MEDIA_MESSAGE_NOTIFICATION_ID | message.getConvoIdProp(), conversation.e());
            return;
        }
    }

    private void handleMessage(MessageHolder messageholder)
    {
        long l = (getBackgroundedTime() - 4000L) / 1000L;
        Map map1 = conversationUtil.a(l);
        List list = pushMessageRepository.getUnreadConversationsCountSince(l);
        if (map1.size() > 0 || list.size() > 0)
        {
            messageholder = dedupeMessages(getStackedMessageHolders(messageholder, map1, list));
            if (messageholder.isEmpty())
            {
                log.info("All unread chat messages has been marked as duplicates");
                return;
            } else
            {
                notificationRouter.displayMessages(messageholder);
                return;
            }
        } else
        {
            log.info("Notification got canceled");
            cancelChatNotification();
            return;
        }
    }

    private void handleMissedCall(boolean flag)
    {
        long l = getForegroundedTime() / 1000L;
        List list = conversationUtil.b(l);
        if (list.size() > 0)
        {
            Conversation conversation;
            android.support.v4.app.x.d d;
            for (Iterator iterator = list.iterator(); iterator.hasNext(); notificationManager.notify(MISSED_CALL_NOTIFICATION_ID | conversation.getObjectID(), d.e()))
            {
                conversation = (Conversation)iterator.next();
                d = createNotificationBuilder(flag);
                String s = context.getString(0x7f08037f);
                String s1 = (new StringBuilder()).append(s.substring(0, 1).toUpperCase(Locale.getDefault())).append(s.substring(1)).toString();
                s = conversation.getDisplaynameProp();
                Object obj = new ContactImpl();
                lib.getContact(conversation.getIdentityProp(), ((com.skype.Contact) (obj)));
                if (contactUtil.i(((com.skype.Contact) (obj))))
                {
                    s = context.getString(0x7f080341);
                }
                Object obj1 = ViewUtil.a(s, s1);
                ((SpannableStringBuilder) (obj1)).setSpan(new StyleSpan(1), 0, s.length(), 0);
                d.b(s1);
                obj = imageCache.a(conversation, Boolean.valueOf(true));
                obj1 = d.c(((CharSequence) (obj1))).a(0x7f0201bb);
                obj1.g = ((Bitmap) (obj));
                ((android.support.v4.app.x.d) (obj1)).a(s).b(s1).b(context.getResources().getColor(0x7f0f00d3)).a(getContentIntent(conversation.getIdentityProp())).b(getMissedCallDeleteIntent(conversation.getObjectID())).a(0x7f0200b8, context.getString(0x7f080119), getMissedCallActionIntent(conversation));
            }

        }
    }

    private void handleMojiMessage(Message message, Conversation conversation, boolean flag, int j, String s)
    {
        handleMediaMessage(message, conversation, flag, j, BitmapFactory.decodeFile(s));
    }

    private void handleVoicemail(Message message, Conversation conversation, boolean flag)
    {
        if ((long)message.getTimestampProp() < getBackgroundedTime() / 1000L)
        {
            return;
        }
        VoicemailImpl voicemailimpl = new VoicemailImpl();
        message.getVoiceMessage(voicemailimpl);
        Object obj = conversationUtil.n(conversation);
        String s = conversation.getIdentityProp();
        Bitmap bitmap = imageCache.a(conversation, Boolean.valueOf(true));
        SpannableStringBuilder spannablestringbuilder = ViewUtil.a(((CharSequence) (obj)), context.getString(0x7f080453));
        android.support.v4.app.x.d d = createNotificationBuilder(flag);
        obj = d.a(0x7f02010c).a(((CharSequence) (obj))).c(spannablestringbuilder).b(context.getString(0x7f080453));
        obj.g = bitmap;
        ((android.support.v4.app.x.d) (obj)).b(context.getResources().getColor(0x7f0f00d3)).a(getContentIntent(s)).a(0x7f0200ea, context.getString(0x7f080413), getVoicemailActionIntent(s, voicemailimpl));
        int j = conversationUtil.q(conversation).size();
        if (j > 1)
        {
            d.i = j;
        }
        notificationManager.notify(VOICEMAIL_NOTIFICATION_ID | message.getConvoIdProp(), d.e());
        notificationManager.cancel(MISSED_CALL_NOTIFICATION_ID | conversation.getObjectID());
        conversationUtil.b(conversation.getObjectID());
    }

    private int heartCount(Message message)
    {
        return annotationUtil.getAnnotationCount(message, com.skype.MessageAnnotation.TYPE.EMOTICON, "heart");
    }

    private boolean isConsumed(Message message)
    {
        return message.getConsumptionStatusProp() == com.skype.Message.CONSUMPTION_STATUS.CONSUMED;
    }

    private boolean isMessageForMe(ChatPushMessage chatpushmessage)
    {
        Object obj;
        Object obj1;
        String s;
        boolean flag1;
        flag1 = true;
        obj = getAccount();
        obj1 = ((Account) (obj)).getSkypenameProp();
        s = ((Account) (obj)).getLiveidMembernameProp();
        obj = obj1;
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            obj = lib.getDefaultAccountName();
        }
        obj1 = chatpushmessage.getMsnpMessage();
        if (obj1 != null && ((MsnpMessage) (obj1)).b().a() != MsnpIdentityType.f) goto _L2; else goto _L1
_L1:
        obj1 = chatpushmessage.getConversationIdentity();
        if (chatpushmessage.getRecipientId() == null) goto _L4; else goto _L3
_L3:
        boolean flag = chatpushmessage.getRecipientId().equals(obj);
_L6:
        return flag;
_L4:
        flag = flag1;
        if (TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L6; else goto _L5
_L5:
        obj1 = new ConversationImpl();
        if (!lib.getConversationByIdentity(chatpushmessage.getConversationIdentity(), ((Conversation) (obj1)), false))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (conversationUtil.a(((Conversation) (obj1)), ((String) (obj))) != null) goto _L6; else goto _L7
_L7:
        flag = flag1;
        if (conversationUtil.a(((Conversation) (obj1)), s) != null) goto _L6; else goto _L8
_L8:
        return false;
_L2:
        if (chatpushmessage.getChatReceiverId() == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (chatpushmessage.getChatReceiverId().equals(obj)) goto _L6; else goto _L9
_L9:
        flag = flag1;
        if (chatpushmessage.getChatReceiverId().equals(s)) goto _L6; else goto _L10
_L10:
        return false;
    }

    private boolean isUnique(MessageHolder messageholder)
    {
        messageholder = messageholder.getMessageId();
        if (messageholder == null)
        {
            return true;
        } else
        {
            return alreadyNotified.add(messageholder);
        }
    }

    private void listenToSpecialMessageTypes(Message message)
    {
        com.skype.Message.TYPE type = message.getTypeProp();
        _cls2..SwitchMap.com.skype.Message.TYPE[type.ordinal()];
        JVM INSTR tableswitch 2 9: default 60
    //                   2 246
    //                   3 60
    //                   4 60
    //                   5 60
    //                   6 105
    //                   7 60
    //                   8 188
    //                   9 164;
           goto _L1 _L2 _L1 _L1 _L1 _L3 _L1 _L4 _L5
_L1:
        if (type == com.skype.Message.TYPE.POSTED_MEDIA_MESSAGE || type == com.skype.Message.TYPE.POSTED_VIDEO || XmmUtil.isXmmMessageType(type))
        {
            MediaDocumentImpl mediadocumentimpl = new MediaDocumentImpl();
            if (message.getMediaDocument(mediadocumentimpl))
            {
                addToMapAndListen(mediadocumentimpl);
            }
        }
_L7:
        return;
_L3:
        Object obj = new VideoMessageImpl();
        if (message.getVideoMessage(((com.skype.VideoMessage) (obj))))
        {
            addToMapAndListen(((ObjectInterface) (obj)));
            boolean flag = ecsConfiguration.isViMReplyWithVideoEnabled();
            obj = analytics;
            if (flag)
            {
                message = AnalyticsEvent.E;
            } else
            {
                message = AnalyticsEvent.F;
            }
            ((Analytics) (obj)).c(message);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        VoicemailImpl voicemailimpl = new VoicemailImpl();
        if (message.getVoiceMessage(voicemailimpl))
        {
            addToMapAndListen(voicemailimpl);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int j;
        int k;
        int l;
        try
        {
            message = message.getTransfers().m_transferObjectIDList;
            k = message.length;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            sendHandledObjectNotFoundTelemetry("listenToSpecialMessageTypes");
            return;
        }
        j = 0;
        if (j >= k)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = message[j];
        map.a(l, com/skype/Transfer);
        j++;
        if (true)
        {
            break MISSING_BLOCK_LABEL_204;
        }
_L2:
        SmsImpl smsimpl = new SmsImpl();
        if (message.getSMS(smsimpl))
        {
            addToMapAndListen(smsimpl);
            return;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private boolean loginIfRequired(boolean flag)
    {
        return loginManager.loginIfRequired(flag);
    }

    private void registerNotifDeleteReceiver()
    {
        IntentFilter intentfilter = new IntentFilter("CHAT_NOTIF_DELETE");
        intentfilter.addAction("MISSED_NOTIF_DELETE");
        if (notificationDeleteReceiver != null)
        {
            context.registerReceiver(notificationDeleteReceiver, intentfilter);
        }
    }

    private void setBackgroundedTime(long l)
    {
        UserPreferences userpreferences = getUserPreferences();
        if (userpreferences != null)
        {
            userpreferences.setBackgroundedTime(l);
        }
    }

    private void setForegroundedTime(long l)
    {
        UserPreferences userpreferences = getUserPreferences();
        if (userpreferences != null)
        {
            userpreferences.setForegroundedTime(l);
        }
    }

    private boolean shouldPlayChatSound()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (getUserPreferences().isNotificationSoundEnabled())
        {
            flag = flag1;
            if (conversationUtil.a(false).size() == 0)
            {
                flag = flag1;
                if (SystemClock.elapsedRealtime() - lastNotificationSound > 3000L)
                {
                    lastNotificationSound = SystemClock.elapsedRealtime();
                    flag = true;
                }
            }
        }
        return flag;
    }

    private void unregisterNotifDeleteReceiver()
    {
        if (notificationDeleteReceiver == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        context.unregisterReceiver(notificationDeleteReceiver);
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        log.warning("Notification delete receiver was not registered before unregister was called");
        return;
    }

    public void onEvent(OnForegroundChanged onforegroundchanged)
    {
        if (onforegroundchanged.isForegrounded())
        {
            cancelChatNotification();
            unregisterNotifDeleteReceiver();
            setBackgroundedTime(0L);
            setForegroundedTime(System.currentTimeMillis());
            return;
        }
        registerNotifDeleteReceiver();
        if (canShowChatNotification())
        {
            handleMissedCall(shouldPlayChatSound());
        }
        setBackgroundedTime(System.currentTimeMillis());
        setForegroundedTime(0L);
        boolean flag = false;
        int j = ((flag) ? 1 : 0);
        if (!loginManager.isLoggedOut())
        {
            j = ((flag) ? 1 : 0);
            if (loginIfRequired(false))
            {
                j = lib.getUnconsumedConversationsCount(com.skype.Conversation.LIST_TYPE.INBOX_CONVERSATIONS);
            }
        }
        badgeNotification.a(j);
        remoteNodeWearModule.updateUnreadConversationCount(j);
    }

    public void onEvent(com.skype.android.gen.MediaDocumentListener.OnMediaLinkStatusChange onmedialinkstatuschange)
    {
        Object obj = onmedialinkstatuschange.getSender();
        if (!pendingMediaNotifications.containsKey(obj)) goto _L2; else goto _L1
_L1:
        Message message;
        String s;
        message = (Message)pendingMediaNotifications.remove(obj);
        obj = null;
        int j = lib.findObjectByDbID(com.skype.SkyLib.OBJECTTYPE.CONVERSATION, message.getConvoIdProp());
        MediaLinkProfile medialinkprofile;
        if (j > 0)
        {
            try
            {
                obj = (Conversation)map.a(j, com/skype/Conversation);
            }
            // Misplaced declaration of an exception variable
            catch (com.skype.android.gen.MediaDocumentListener.OnMediaLinkStatusChange onmedialinkstatuschange)
            {
                sendHandledObjectNotFoundTelemetry("onEventForOnMediaLinkStatusChange");
                return;
            }
        }
        medialinkprofile = MediaLinkProfile.fromString(onmedialinkstatuschange.getProfile());
        s = onmedialinkstatuschange.getPath();
        _cls2..SwitchMap.com.skype.android.app.media.MediaLinkProfile[medialinkprofile.ordinal()];
        JVM INSTR tableswitch 1 1: default 120
    //                   1 130;
           goto _L2 _L3
_L2:
        return;
_L3:
        if (onmedialinkstatuschange.getStatus() == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
        {
            handleMojiMessage(message, ((Conversation) (obj)), shouldPlayChatSound(), 0x7f0804c5, s);
            return;
        } else
        {
            handleMediaMessage(message, ((Conversation) (obj)), shouldPlayChatSound(), 0x7f0804c5);
            return;
        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnObjectPropertyChangeWithValue onobjectpropertychangewithvalue)
    {
        _cls2..SwitchMap.com.skype.PROPKEY[onobjectpropertychangewithvalue.getPropKey().ordinal()];
        JVM INSTR tableswitch 1 4: default 40
    //                   1 41
    //                   2 91
    //                   3 125
    //                   4 145;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        if (!foregroundState.c())
        {
            notificationManager.cancel(MISSED_CALL_NOTIFICATION_ID | onobjectpropertychangewithvalue.getObjectID());
            conversationUtil.b(onobjectpropertychangewithvalue.getObjectID());
            cancelChatNotification(onobjectpropertychangewithvalue.getObjectID());
            handleMessage(null);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        int j = lib.getUnconsumedConversationsCount(com.skype.Conversation.LIST_TYPE.INBOX_CONVERSATIONS);
        badgeNotification.a(j);
        remoteNodeWearModule.updateUnreadConversationCount(j);
        return;
_L4:
        int k = onobjectpropertychangewithvalue.getProperty().getIntValue();
        if (k > 0)
        {
            handleLastMessage(k);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (ecsConfiguration.isHeartMarkedEnabled())
        {
            onobjectpropertychangewithvalue = (Message)map.a(onobjectpropertychangewithvalue.getObjectID(), com/skype/Message);
            if (isConsumed(onobjectpropertychangewithvalue) && heartCount(onobjectpropertychangewithvalue) > 0)
            {
                ConversationImpl conversationimpl = new ConversationImpl();
                if (lib.getConversationByConvoID(onobjectpropertychangewithvalue.getConvoIdProp(), conversationimpl))
                {
                    conversationUtil.a(conversationimpl.getObjectID(), onobjectpropertychangewithvalue.getObjectID());
                    return;
                }
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnOperationModeChanged onoperationmodechanged)
    {
        if (onoperationmodechanged.getLevel() != com.skype.GI.NETWORKACTIVITYLEVEL.NAL_NORMAL_LEVEL.toInt() && loginManager != null)
        {
            log.info("SkyLib moved to background, resetting userless foreground flag.");
            loginManager.unsetUserlessForegroundFlag();
        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnPushHandlingComplete onpushhandlingcomplete)
    {
        log.info((new StringBuilder("Push handling complete ")).append(onpushhandlingcomplete.getResult()).append(" pushID: ").append(onpushhandlingcomplete.getPushId()).toString());
        pushHandlingHelper.stopPushHandling(onpushhandlingcomplete.getPushId());
        int j = lib.getUnconsumedConversationsCount(com.skype.Conversation.LIST_TYPE.INBOX_CONVERSATIONS);
        badgeNotification.a(j);
        remoteNodeWearModule.updateUnreadConversationCount(j);
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnRegisterContextsComplete onregistercontextscomplete)
    {
        log.info((new StringBuilder("PushNotifications. OnRegisterContextComplete: ")).append(onregistercontextscomplete.getSuccess().toString()).toString());
    }

    public void onEvent(OnChatPushMessageStoredEvent onchatpushmessagestoredevent)
    {
        ChatPushMessage chatpushmessage = onchatpushmessagestoredevent.getStoredMessage();
        dreamKeeper.a();
        boolean flag = loginIfRequired(true);
        boolean flag1 = isMessageForMe(chatpushmessage);
        if (flag)
        {
            if (flag1)
            {
                if (canShowChatNotification())
                {
                    if (!chatMessageExists(chatpushmessage))
                    {
                        log.info((new StringBuilder("incoming message notification ")).append(chatpushmessage.getConversationIdentity()).append(" : ").append(chatpushmessage.getMessageBody()).toString());
                        chatpushmessage.setDisplayedToUser(true);
                        chatpushmessage.onMessageConsumed(DisplayResult.SUCCESS);
                        handleMessage(new PushMessageHolder(chatpushmessage));
                    } else
                    {
                        log.info("Message already synced, don't show push notification");
                        chatpushmessage.onMessageConsumed(DisplayResult.ALREADY_SYNCED);
                    }
                } else
                {
                    if (foregroundState.c())
                    {
                        chatpushmessage.onMessageConsumed(DisplayResult.FOREGROUND_STATE);
                        log.info("Can't show notification: client in foreground");
                    } else
                    if (!getUserPreferences().isNewMessageNotificationEnabled())
                    {
                        log.info("Can't show notification: disabled in user preferences");
                        chatpushmessage.onMessageConsumed(DisplayResult.USER_PREFERENCES);
                    } else
                    {
                        log.info("Can't show notification: unknow reason");
                        chatpushmessage.onMessageConsumed(DisplayResult.UNKNOWN);
                    }
                    pushMessageRepository.removeMessage(chatpushmessage);
                }
            } else
            {
                log.info("Message dropped as it's for other user");
                pushMessageRepository.removeMessage(chatpushmessage);
                chatpushmessage.onMessageConsumed(DisplayResult.DIFFERENT_USER);
            }
        } else
        {
            log.info("Dropped push we are in logged out state");
            pushMessageRepository.removeMessage(chatpushmessage);
            chatpushmessage.onMessageConsumed(DisplayResult.USER_LOGGED_OUT);
        }
        if (onchatpushmessagestoredevent.isFastSyncMessage())
        {
            String s = chatpushmessage.getMessageBody();
            if (flag && flag1)
            {
                log.info((new StringBuilder("GCM_FAST_SYNC: ")).append(s).append(';').append(System.currentTimeMillis()).append("; active? ").append(chatpushmessage.isActive()).toString());
                int j = chatpushmessage.handleInSkyLib(lib);
                pushHandlingHelper.startPushHandling(j);
            } else
            {
                log.info((new StringBuilder("GCM_FAST_SYNC_NO_AUTH: ")).append(s).append(';').append(System.currentTimeMillis()).toString());
            }
        }
        pushHandlingHelper.stopPushHandling(onchatpushmessagestoredevent.getSyntheticId());
    }

    public void onLogout()
    {
        super.onLogout();
        alreadyNotified.clear();
    }

    protected void sendHandledObjectNotFoundTelemetry(String s)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        s = (new StringBuilder()).append(getClass().getSimpleName()).append("-").append(s).toString();
        analyticsparametercontainer.a(AnalyticsParameter.T, s);
        analytics.a(AnalyticsEvent.df, analyticsparametercontainer);
    }





}
