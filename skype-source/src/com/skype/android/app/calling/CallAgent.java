// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.c;
import com.google.android.gms.wearable.j;
import com.google.android.gms.wearable.k;
import com.google.android.gms.wearable.o;
import com.skype.Account;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.PROPKEY;
import com.skype.Participant;
import com.skype.SkyLib;
import com.skype.Video;
import com.skype.android.SkypeConstants;
import com.skype.android.ads.AdManager;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.analytics.ExperimentTag;
import com.skype.android.app.Agent;
import com.skype.android.app.BackgroundNavigation;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.app2app.App2AppManager;
import com.skype.android.app.app2app.ChannelKey;
import com.skype.android.app.app2app.translator.OnTranscribedMessage;
import com.skype.android.app.app2app.translator.OnUITranscribedMessage;
import com.skype.android.app.app2app.translator.TranslatorChannel;
import com.skype.android.app.settings.SnoozeNotificationHelper;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.wear.CommandHandlerUriMatcher;
import com.skype.android.app.wear.EventHandler;
import com.skype.android.app.wear.RemoteNodeWearModule;
import com.skype.android.app.wear.WearModule;
import com.skype.android.app.wear.eventhandler.AnswerCallEventHandler;
import com.skype.android.app.wear.eventhandler.LeaveLiveSessionEventHandler;
import com.skype.android.app.wear.eventhandler.MuteCallEventHandler;
import com.skype.android.app.wear.eventhandler.UnmuteCallEventHandler;
import com.skype.android.audio.AudioRoute;
import com.skype.android.audio.BluetoothReceiver;
import com.skype.android.audio.VoiceStreamControlWrapper;
import com.skype.android.audio.WiredHeadsetReceiver;
import com.skype.android.calling.CameraFacing;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.res.Sounds;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.skylib.ObjectInterfaceNotFoundException;
import com.skype.android.skylib.PcmHostCallback;
import com.skype.android.util.CheckedBroadcastReceiver;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ConversationViewState;
import com.skype.android.util.ImageCache;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.ViewStateManager;
import com.skype.android.util.accessibility.AccessibilityEventFreezeControl;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.ref.AggregateReferenceCounted;
import com.skype.android.util.ref.GuardedReferenceCount;
import com.skype.android.util.ref.ReferenceCounted;
import com.skype.android.wakeup.ForegroundState;
import com.skype.pcmhost.PcmHost;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.calling:
//            CallConstants, f, c, e, 
//            OngoingNotificationsManager, CallActivity, PreCallActivity, OnUpdateCallDurationEvent, 
//            OnAudioRouteChangedEvent, OnCallScreenForegroundChanged, CallQualityFeedbackManager, VideoMonitor

public class CallAgent extends Agent
    implements android.media.AudioManager.OnAudioFocusChangeListener, android.os.Handler.Callback, com.google.android.gms.wearable.j.a, SkypeConstants, CallConstants, com.skype.android.audio.BluetoothReceiver.Listener, com.skype.android.audio.WiredHeadsetReceiver.Listener, com.skype.android.skylib.PcmHostCallback.Listener
{
    private final class a extends CheckedBroadcastReceiver
    {

        final CallAgent this$0;

        public final void onReceiveFiltered(Context context1, Intent intent, int i)
        {
            if (!intent.hasExtra("com.skype.objId"))
            {
                break MISSING_BLOCK_LABEL_105;
            }
            context1 = (Conversation)map.a(intent.getIntExtra("com.skype.objId", 0), com/skype/Conversation);
            if (context1 == null)
            {
                break MISSING_BLOCK_LABEL_105;
            }
            i;
            JVM INSTR tableswitch 0 1: default 105
        //                       0 60
        //                       1 80;
               goto _L1 _L2 _L3
_L1:
            break MISSING_BLOCK_LABEL_105;
_L2:
            try
            {
                context1.leaveLiveSession(false);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context1)
            {
                sendHandledObjectNotFoundTelemetry("onReceiveFiltered");
            }
            return;
_L3:
            if (context1.getLiveIsMutedProp())
            {
                context1.unmuteMyMicrophone();
                return;
            }
            context1.muteMyMicrophone();
            return;
        }

        a()
        {
            this$0 = CallAgent.this;
            super(CallAgent.NOTIFICATION_ACTIONS);
        }
    }


    private static final int END_CALL_POSITION = 0;
    private static final int MUTE_CALL_POSITION = 1;
    private static final String NOTIFICATION_ACTIONS[] = {
        "endCall", "muteCall"
    };
    private static final Logger log = Logger.getLogger("CallAgent");
    private AccessibilityUtil accessibility;
    private AdManager adManager;
    private Analytics analytics;
    private App2AppManager app2AppManager;
    private AudioManager audioManager;
    private GuardedReferenceCount callListenerRef;
    private CallQualityFeedbackManager callQualityFeedbackManager;
    private CommandHandlerUriMatcher commandHandlers;
    private Context context;
    private ConversationUtil conversationUtil;
    private EcsConfiguration ecsConfiguration;
    private com.skype.android.app.calling.c endCallReceiver;
    private EventBus eventBus;
    private ForegroundState foregroundState;
    private final c googleApiClient;
    private Handler handler;
    private final Set iWasLiveSet = Collections.synchronizedSet(new HashSet());
    private ImageCache imageCache;
    private boolean isCallForegrounded;
    private LayoutExperience layoutExperience;
    private SkyLib lib;
    private ObjectIdMap map;
    private BackgroundNavigation nav;
    private a notificationActionReceiver;
    private NotificationManager notificationManager;
    private volatile Notification ongoingCallNotification;
    private OngoingNotificationsManager ongoingNotificationsManager;
    private PcmHost pcmHost;
    private PcmHostCallback pcmHostCallback;
    private PowerManager powerManager;
    private e proximityWakeLock;
    private final WearModule remoteNodeWearModule;
    private Sounds sounds;
    private ViewStateManager stateManager;
    private TelephonyManager telephonyManager;
    private Provider translatorProvider;
    private GuardedReferenceCount wifiLockRef;
    private WifiManager wifiManager;
    private WiredHeadsetReceiver wiredHeadsetReceiver;

    public CallAgent(Application application, SkyLib skylib, ObjectIdMap objectidmap, EventBus eventbus, NotificationManager notificationmanager, PowerManager powermanager, final TelephonyManager telephonyManager, 
            WifiManager wifimanager, final AudioManager audioManager, ViewStateManager viewstatemanager, AdManager admanager, OngoingNotificationsManager ongoingnotificationsmanager, App2AppManager app2appmanager, CallQualityFeedbackManager callqualityfeedbackmanager, 
            PcmHost pcmhost, PcmHostCallback pcmhostcallback, final Sounds sounds, Analytics analytics1, AccessibilityUtil accessibilityutil, LayoutExperience layoutexperience, EcsConfiguration ecsconfiguration, 
            BackgroundNavigation backgroundnavigation, ImageCache imagecache, ConversationUtil conversationutil, ContactUtil contactutil, Provider provider, ForegroundState foregroundstate)
    {
        super(application);
        context = application;
        lib = skylib;
        map = objectidmap;
        eventBus = eventbus;
        notificationManager = notificationmanager;
        powerManager = powermanager;
        this.telephonyManager = telephonyManager;
        wifiManager = wifimanager;
        this.audioManager = audioManager;
        stateManager = viewstatemanager;
        adManager = admanager;
        ongoingNotificationsManager = ongoingnotificationsmanager;
        app2AppManager = app2appmanager;
        callQualityFeedbackManager = callqualityfeedbackmanager;
        pcmHost = pcmhost;
        pcmHostCallback = pcmhostcallback;
        this.sounds = sounds;
        analytics = analytics1;
        accessibility = accessibilityutil;
        layoutExperience = layoutexperience;
        ecsConfiguration = ecsconfiguration;
        nav = backgroundnavigation;
        imageCache = imagecache;
        conversationUtil = conversationutil;
        translatorProvider = provider;
        foregroundState = foregroundstate;
        registerWearCommandHandlers();
        callListenerRef = new GuardedReferenceCount(new AggregateReferenceCounted(new ReferenceCounted[] {
            new VoiceStreamControlWrapper(audioManager, this), new AccessibilityEventFreezeControl(accessibilityutil)
        }));
        wifiLockRef = new GuardedReferenceCount(new f(wifimanager));
        handler = new Handler(Looper.getMainLooper(), this);
        handler.post(new Runnable() {

            final CallAgent this$0;
            final AudioManager val$audioManager;
            final Sounds val$sounds;
            final TelephonyManager val$telephonyManager;

            public final void run()
            {
                telephonyManager.listen(new PhoneStateListener() {

                    final _cls1 this$1;

                    public final void onCallStateChanged(int i, String s)
                    {
                        i;
                        JVM INSTR tableswitch 1 2: default 24
                    //                                   1 82
                    //                                   2 25;
                           goto _L1 _L2 _L3
_L1:
                        return;
_L3:
                        boolean flag = checkLiveConversationsForSpeakerphone();
                        endVoicemailRecordings();
                        holdLiveConversations();
                        endRingingConversations();
                        if (flag)
                        {
                            audioManager.setSpeakerphoneOn(false);
                            return;
                        }
                          goto _L1
_L2:
                        endRingingConversations();
                        sounds.c();
                        return;
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                }, 32);
            }

            
            {
                this$0 = CallAgent.this;
                telephonyManager = telephonymanager;
                audioManager = audiomanager;
                sounds = sounds1;
                super();
            }
        });
        endCallReceiver = new com.skype.android.app.calling.c(conversationutil);
        notificationActionReceiver = new a();
        wiredHeadsetReceiver = new WiredHeadsetReceiver(audioManager);
        proximityWakeLock = new e(powermanager);
        pcmhostcallback.b(this);
        pcmhostcallback.a(this);
        ongoingnotificationsmanager.cancelAll();
        googleApiClient = (new com.google.android.gms.common.api.c.a(application)).a(new com.google.android.gms.common.api.c.c() {

            final CallAgent this$0;

            public final void onConnectionFailed(ConnectionResult connectionresult)
            {
                CallAgent.log.info("Failed to connect to Google Play Services.");
            }

            
            {
                this$0 = CallAgent.this;
                super();
            }
        }).b(o.l).b();
        googleApiClient.a(new com.google.android.gms.common.api.c.b() {

            final CallAgent this$0;

            public final void onConnected(Bundle bundle)
            {
                o.c.a(googleApiClient, CallAgent.this);
            }

            public final void onConnectionSuspended(int i)
            {
            }

            
            {
                this$0 = CallAgent.this;
                super();
            }
        });
        if (ecsconfiguration.isWearRemoteControlEnabled())
        {
            application = new RemoteNodeWearModule(googleApiClient);
        } else
        {
            application = WearModule.NULL_OBJECT;
        }
        remoteNodeWearModule = application;
    }

    private boolean amICallHost(Conversation conversation)
    {
        conversation = conversation.getLiveHostProp();
        return getAccount().getSkypenameProp().equals(conversation);
    }

    private void buildAndUpdateNotification(Conversation conversation)
    {
        com.skype.Conversation.LOCAL_LIVESTATUS local_livestatus = conversation.getLocalLiveStatusProp();
        if (local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE || local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_LOCALLY || local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_REMOTELY)
        {
            updateNotification(conversation);
        }
    }

    private android.support.v4.app.x.d buildDummyNotification(Conversation conversation)
    {
        android.support.v4.app.x.d d = new android.support.v4.app.x.d(context);
        d.b(true);
        d.a(true);
        char c1;
        if (getUserPreferences().isNotificationLightEnabled())
        {
            c1 = '\u01F4';
        } else
        {
            c1 = '\0';
        }
        d.b(c1, c1);
        d.g = imageCache.a(conversation, Boolean.valueOf(true));
        return d;
    }

    private android.support.v4.app.x.d buildNotification(Conversation conversation)
    {
        android.support.v4.app.x.d d = buildDummyNotification(conversation);
        int i = conversation.getObjectID();
        Object obj = new Intent(context, com/skype/android/app/calling/CallActivity);
        ((Intent) (obj)).putExtra("com.skype.objId", i);
        ((Intent) (obj)).addFlags(0x20000);
        ((Intent) (obj)).addFlags(0x200000);
        d.a(PendingIntent.getActivity(context, i, ((Intent) (obj)), 0x10000000));
        obj = new Intent("endCall");
        ((Intent) (obj)).putExtra("com.skype.objId", i);
        obj = PendingIntent.getBroadcast(context, i, ((Intent) (obj)), 0x10000000);
        d.a(0x7f0200b9, context.getString(0x7f080147), ((PendingIntent) (obj)));
        obj = conversation.getLocalLiveStatusProp();
        if (obj == com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_LOCALLY || obj == com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_REMOTELY)
        {
            obj = null;
        } else
        {
            obj = new Intent("muteCall");
            ((Intent) (obj)).putExtra("com.skype.objId", i);
            obj = PendingIntent.getBroadcast(context, i, ((Intent) (obj)), 0x10000000);
        }
        if (conversation.getLiveIsMutedProp())
        {
            i = 0x7f0200e0;
            conversation = context.getString(0x7f0801a0);
        } else
        {
            i = 0x7f0200dc;
            conversation = context.getString(0x7f08015a);
        }
        d.a(i, conversation, ((PendingIntent) (obj)));
        return d;
    }

    private boolean checkLiveConversationsForSpeakerphone()
    {
        for (Iterator iterator = conversationUtil.a(com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE).iterator(); iterator.hasNext();)
        {
            Object obj = (Conversation)iterator.next();
            obj = (ConversationViewState)stateManager.a(((com.skype.ObjectInterface) (obj)), com/skype/android/util/ConversationViewState);
            if (obj != null && ((ConversationViewState) (obj)).f() == AudioRoute.c)
            {
                return true;
            }
        }

        return false;
    }

    private boolean conversationHasVideo(Conversation conversation)
    {
        return conversationUtil.x(conversation);
    }

    private Notification createNotification(Conversation conversation)
    {
        String s;
        int i;
        boolean flag;
        android.support.v4.app.x.d d = buildNotification(conversation);
        Object obj = conversation.getLocalLiveStatusProp();
        flag = conversationHasVideo(conversation);
        s = null;
        static final class _cls5
        {

            static final int $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[];
            static final int $SwitchMap$com$skype$Translator$TRANSLATOR_RESERVED_MSGID[];
            static final int $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus[];

            static 
            {
                $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus = new int[com.skype.android.audio.WiredHeadsetReceiver.WiredHeadsetStatus.values().length];
                try
                {
                    $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus[com.skype.android.audio.WiredHeadsetReceiver.WiredHeadsetStatus.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus[com.skype.android.audio.WiredHeadsetReceiver.WiredHeadsetStatus.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus[com.skype.android.audio.WiredHeadsetReceiver.WiredHeadsetStatus.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS = new int[com.skype.Conversation.LOCAL_LIVESTATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.RINGING_FOR_ME.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.STARTING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_LOCALLY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_REMOTELY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.OTHERS_ARE_LIVE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.NONE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.RECENTLY_LIVE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                $SwitchMap$com$skype$Translator$TRANSLATOR_RESERVED_MSGID = new int[com.skype.Translator.TRANSLATOR_RESERVED_MSGID.values().length];
                try
                {
                    $SwitchMap$com$skype$Translator$TRANSLATOR_RESERVED_MSGID[com.skype.Translator.TRANSLATOR_RESERVED_MSGID.MSGID_FORCALLEE_ORIG.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$Translator$TRANSLATOR_RESERVED_MSGID[com.skype.Translator.TRANSLATOR_RESERVED_MSGID.MSGID_FORCALLER_TRANSLATED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$Translator$TRANSLATOR_RESERVED_MSGID[com.skype.Translator.TRANSLATOR_RESERVED_MSGID.MSGID_FORCALLEE_TRANSLATED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Translator$TRANSLATOR_RESERVED_MSGID[com.skype.Translator.TRANSLATOR_RESERVED_MSGID.MSGID_FORCALLER_ORIG.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        CharSequence charsequence;
        if (flag)
        {
            i = 0x7f0201c4;
        } else
        {
            i = 0x7f0201b3;
        }
        _cls5..SwitchMap.com.skype.Conversation.LOCAL_LIVESTATUS[((com.skype.Conversation.LOCAL_LIVESTATUS) (obj)).ordinal()];
        JVM INSTR tableswitch 1 4: default 72
    //                   1 192
    //                   2 192
    //                   3 206
    //                   4 206;
           goto _L1 _L2 _L2 _L3 _L3
_L1:
        charsequence = conversationUtil.n(conversation);
        obj = s;
        if (s == null)
        {
            obj = context.getString(0x7f080404);
        }
        d.a(i);
        d.a(charsequence);
        d.c(charsequence);
        d.b(((CharSequence) (obj)));
        d.c();
        d.b(context.getResources().getColor(0x7f0f00d3));
        d.l = true;
        d.a((long)conversation.getLiveStartTimestampProp() * 1000L);
        return d.e();
_L2:
        s = context.getString(0x7f08041c);
        continue; /* Loop/switch isn't completed */
_L3:
        s = context.getString(0x7f08046f);
        if (flag)
        {
            i = 0x7f0201c5;
        } else
        {
            i = 0x7f0201bd;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void endRingingConversations()
    {
        Object obj = EnumSet.of(com.skype.Conversation.LOCAL_LIVESTATUS.RINGING_FOR_ME, com.skype.Conversation.LOCAL_LIVESTATUS.STARTING);
        for (obj = conversationUtil.a(((EnumSet) (obj))).iterator(); ((Iterator) (obj)).hasNext(); ((Conversation)((Iterator) (obj)).next()).leaveLiveSession(false)) { }
    }

    private void endVoicemailRecordings()
    {
        Object obj = EnumSet.of(com.skype.Conversation.LOCAL_LIVESTATUS.RECORDING_VOICE_MESSAGE, com.skype.Conversation.LOCAL_LIVESTATUS.PLAYING_VOICE_MESSAGE);
        obj = conversationUtil.a(((EnumSet) (obj))).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Conversation conversation = (Conversation)((Iterator) (obj)).next();
            log.info((new StringBuilder("Stopping voicemail for conversation ")).append(conversation.getIdentityProp()).toString());
            int i = conversation.getActiveVmIdProp();
            i = lib.findObjectByDbID(com.skype.SkyLib.OBJECTTYPE.VOICEMAIL, i);
            if (i == 0 || !conversation.postVoiceMessage(i, ""))
            {
                conversation.leaveLiveSession(false);
            }
        } while (true);
    }

    private void handleDefaultAudioRoute(Conversation conversation)
    {
label0:
        {
label1:
            {
                if (!stateManager.a(conversation))
                {
                    break label0;
                }
                boolean flag = conversationHasVideo(conversation);
                Object obj = (ConversationViewState)stateManager.a(conversation, com/skype/android/util/ConversationViewState);
                Object obj1;
                if (flag)
                {
                    obj = AudioRoute.c;
                } else
                {
                    obj = ((ConversationViewState) (obj)).g();
                }
                if (obj != null)
                {
                    obj1 = obj;
                    if (((AudioRoute) (obj)).c(audioManager).booleanValue())
                    {
                        break label1;
                    }
                }
                obj1 = null;
            }
            setAudioRoute(conversation, AudioRoute.a(audioManager, ((AudioRoute) (obj1))));
        }
    }

    private void holdLiveConversations()
    {
        holdLiveConversationsExcept(null);
    }

    private void holdLiveConversationsExcept(Conversation conversation)
    {
        int i;
        if (conversation != null)
        {
            i = conversation.getObjectID();
        } else
        {
            i = 0;
        }
        conversation = conversationUtil.a(com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE).iterator();
        do
        {
            if (!conversation.hasNext())
            {
                break;
            }
            Conversation conversation1 = (Conversation)conversation.next();
            if (i != conversation1.getObjectID())
            {
                conversation1.holdMyLiveSession();
            }
        } while (true);
    }

    private int mapCallerMsgIdToCalleeMsgId(int i)
    {
        com.skype.Translator.TRANSLATOR_RESERVED_MSGID translator_reserved_msgid = com.skype.Translator.TRANSLATOR_RESERVED_MSGID.fromInt(i);
        switch (_cls5..SwitchMap.com.skype.Translator.TRANSLATOR_RESERVED_MSGID[translator_reserved_msgid.ordinal()])
        {
        default:
            return i;

        case 1: // '\001'
            return com.skype.Translator.TRANSLATOR_RESERVED_MSGID.MSGID_FORCALLER_ORIG.toInt();

        case 3: // '\003'
            return com.skype.Translator.TRANSLATOR_RESERVED_MSGID.MSGID_FORCALLER_TRANSLATED.toInt();

        case 2: // '\002'
            return com.skype.Translator.TRANSLATOR_RESERVED_MSGID.MSGID_FORCALLEE_TRANSLATED.toInt();

        case 4: // '\004'
            return com.skype.Translator.TRANSLATOR_RESERVED_MSGID.MSGID_FORCALLEE_ORIG.toInt();
        }
    }

    private static Notification neuterNotification(Notification notification)
    {
        return new Notification(notification.icon, notification.tickerText, notification.when);
    }

    private void registerWearCommandHandlers()
    {
        commandHandlers = new CommandHandlerUriMatcher() {

            final CallAgent this$0;

            public final EventHandler match(String s)
            {
                s = super.match(s);
                if (s != null)
                {
                    return s;
                } else
                {
                    return EventHandler.NULL_HANDLER;
                }
            }

            
            {
                this$0 = CallAgent.this;
                super();
                callagent = new LeaveLiveSessionEventHandler(map);
                addURI(com.skype.android.app.wear.HostDeviceCapabilities.RemoteCommands.ANSWER_CALL_COMMAND.getCommand(), "#", new AnswerCallEventHandler(map));
                addURI(com.skype.android.app.wear.HostDeviceCapabilities.RemoteCommands.REJECT_CALL_COMMAND.getCommand(), "#", CallAgent.this);
                addURI(com.skype.android.app.wear.HostDeviceCapabilities.RemoteCommands.MUTE_CALL_COMMAND.getCommand(), "#", new MuteCallEventHandler(map));
                addURI(com.skype.android.app.wear.HostDeviceCapabilities.RemoteCommands.UNMUTE_CALL_COMMAND.getCommand(), "#", new UnmuteCallEventHandler(map));
                addURI(com.skype.android.app.wear.HostDeviceCapabilities.RemoteCommands.HANG_UP_CALL_COMMAND.getCommand(), "#", CallAgent.this);
            }
        };
    }

    private void sendCallStateBroadcastIntent(Conversation conversation)
    {
        Intent intent = new Intent("com.skype.android.CONVERSATION_LIVE_STATE");
        intent.addFlags(32);
        intent.putExtra("com.skype.account", getAccount().getSkypenameProp());
        intent.putExtra("com.skype.live_identity", conversation.getIdentityProp());
        intent.putExtra("com.skype.live_status", conversation.getLocalLiveStatusProp().toString());
        getContext().sendBroadcast(intent);
    }

    private void sendTranscribedMessageToCallee(com.skype.android.gen.TranslatorListener.OnTranscribedMessage ontranscribedmessage)
    {
        TranslatorChannel translatorchannel = app2AppManager.getTranslatorChannel();
        if (translatorchannel != null)
        {
            int i = ontranscribedmessage.getConvId();
            translatorchannel.sendMessage((Conversation)map.a(i, com/skype/ConversationImpl), mapCallerMsgIdToCalleeMsgId(ontranscribedmessage.getMsgId()), ontranscribedmessage.getText(), ontranscribedmessage.getRecotype());
            return;
        } else
        {
            log.info("Translator channel doesn't exist");
            return;
        }
    }

    private void showTranscribeIfRequired(int i, String s, String s1, String s2)
    {
        if (ecsConfiguration.isTranslatorEnabled() && (s2 != null || s1 != null))
        {
            s = new OnUITranscribedMessage(i, s, s1, s2);
            eventBus.a(s);
        }
    }

    private boolean snoozeCalls()
    {
        if (!foregroundState.c() && ecsConfiguration.getExperimentHideSignoutGroupTag().equals(ExperimentTag.h) && (new SnoozeNotificationHelper(context)).checkSnoozedStatus())
        {
            log.info("snoozing incoming call");
            return true;
        } else
        {
            return false;
        }
    }

    private boolean startIncomingCall(Conversation conversation)
    {
        if (!snoozeCalls())
        {
            powerManager.newWakeLock(0x1000000a, "Call").acquire(3000L);
            boolean flag2 = false;
            boolean flag4 = false;
            boolean flag3 = flag4;
            if (getUserPreferences().isAutoAnswerEnabled())
            {
                boolean flag1 = false;
                Iterator iterator = conversationUtil.a(com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE).iterator();
                boolean flag;
                do
                {
                    flag = flag1;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    if (((Conversation)iterator.next()).getObjectID() == conversation.getObjectID())
                    {
                        continue;
                    }
                    flag = true;
                    break;
                } while (true);
                if (flag)
                {
                    flag2 = false;
                    flag3 = flag4;
                } else
                if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
                {
                    Participant participant = conversationUtil.a(conversation, conversation.getIdentityProp());
                    Video video = ConversationUtil.a(lib, participant);
                    if (video != null && video.getStatusProp() == com.skype.Video.STATUS.HINT_IS_VIDEOCALL_RECEIVED)
                    {
                        flag3 = true;
                    } else
                    {
                        flag3 = false;
                    }
                    if (!participant.getIsSeamlesslyUpgradedCallProp())
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                } else
                {
                    flag2 = true;
                    flag3 = flag4;
                }
            }
            if (flag2)
            {
                conversation.joinLiveSession("");
                conversation = nav.intentFor(conversation, com/skype/android/app/calling/CallActivity);
                conversation.putExtra("extraVideo", flag3);
            } else
            {
                conversation = nav.intentFor(conversation, com/skype/android/app/calling/PreCallActivity);
            }
            conversation.addFlags(4);
            conversation.addFlags(0x40000);
            context.startActivity(conversation);
            return flag2;
        } else
        {
            return true;
        }
    }

    private void updateNotification(Conversation conversation)
    {
        Notification notification = createNotification(conversation);
        ongoingCallNotification = notification;
        ongoingNotificationsManager.notify(getNotificationId(conversation), notification);
    }

    private void updateNotificationStatus(Conversation conversation)
    {
        switch (_cls5..SwitchMap.com.skype.Conversation.LOCAL_LIVESTATUS[conversation.getLocalLiveStatusProp().ordinal()])
        {
        case 7: // '\007'
        default:
            buildAndUpdateNotification(conversation);
            return;

        case 5: // '\005'
        case 6: // '\006'
        case 8: // '\b'
            ongoingNotificationsManager.cancel(getNotificationId(conversation));
            break;
        }
    }

    private void updateProximity(boolean flag)
    {
label0:
        {
            if (shouldUseProximity())
            {
                if (!flag)
                {
                    break label0;
                }
                proximityWakeLock.acquire();
            }
            return;
        }
        proximityWakeLock.release();
    }

    public void deviceConnected(BluetoothDevice bluetoothdevice)
    {
        Iterator iterator = conversationUtil.a(false).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Conversation conversation = (Conversation)iterator.next();
            if (stateManager.a(conversation))
            {
                setAudioRoute(conversation, AudioRoute.b);
            }
        } while (true);
        analytics.a(AnalyticsEvent.aG, bluetoothdevice.getName());
    }

    public void deviceDisconnected(BluetoothDevice bluetoothdevice)
    {
        Iterator iterator = conversationUtil.a(false).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Conversation conversation = (Conversation)iterator.next();
            if (stateManager.a(conversation) && ((ConversationViewState)stateManager.a(conversation, com/skype/android/util/ConversationViewState)).f() == AudioRoute.b)
            {
                handleDefaultAudioRoute(conversation);
            }
        } while (true);
        analytics.a(AnalyticsEvent.aH, bluetoothdevice.getName());
    }

    public int getNotificationId(Conversation conversation)
    {
        return ONGOING_CALL_NOTIFICATION_ID | conversation.getObjectID();
    }

    public Notification getOrCreateOngoingCallNotification(Conversation conversation)
    {
        if (ongoingCallNotification == null)
        {
            updateNotification(conversation);
        }
        return ongoingCallNotification;
    }

    public boolean handleMessage(Message message)
    {
        boolean flag = true;
        message.what;
        JVM INSTR tableswitch 3 6: default 36
    //                   3 40
    //                   4 36
    //                   5 93
    //                   6 110;
           goto _L1 _L2 _L1 _L3 _L4
_L1:
        flag = false;
_L6:
        return flag;
_L2:
        if (conversationUtil.a(true).size() <= 0) goto _L6; else goto _L5
_L5:
        eventBus.a(new OnUpdateCallDurationEvent());
        handler.removeMessages(3);
        handler.sendEmptyMessageDelayed(3, 1000L);
        return true;
_L3:
        sounds.a((AudioRoute)message.obj);
        continue; /* Loop/switch isn't completed */
_L4:
        sounds.c();
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void headsetStateChanged(com.skype.android.audio.WiredHeadsetReceiver.WiredHeadsetStatus wiredheadsetstatus)
    {
        Iterator iterator = conversationUtil.a(false).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Conversation conversation = (Conversation)iterator.next();
            switch (_cls5..SwitchMap.com.skype.android.audio.WiredHeadsetReceiver.WiredHeadsetStatus[wiredheadsetstatus.ordinal()])
            {
            default:
                if (stateManager.a(conversation))
                {
                    ConversationViewState conversationviewstate = (ConversationViewState)stateManager.a(conversation, com/skype/android/util/ConversationViewState);
                    if (conversationviewstate.f() == AudioRoute.e || conversationviewstate.f() == AudioRoute.d)
                    {
                        handleDefaultAudioRoute(conversation);
                    }
                }
                break;

            case 1: // '\001'
                if (stateManager.a(conversation))
                {
                    setAudioRoute(conversation, AudioRoute.e);
                }
                break;

            case 2: // '\002'
                if (stateManager.a(conversation))
                {
                    setAudioRoute(conversation, AudioRoute.d);
                }
                break;
            }
        } while (true);
    }

    boolean onAcceptEvent(com.skype.android.gen.ConversationListener.OnSpawnConference onspawnconference)
    {
        return getAccount().getStatusProp() == com.skype.Account.STATUS.LOGGED_IN;
    }

    boolean onAcceptEvent(com.skype.android.gen.SkyLibListener.OnConversationListChange onconversationlistchange)
    {
        return getAccount().getStatusProp() == com.skype.Account.STATUS.LOGGED_IN;
    }

    boolean onAcceptEvent(com.skype.android.gen.SkyLibListener.OnMessage onmessage)
    {
        return getAccount().getStatusProp() == com.skype.Account.STATUS.LOGGED_IN || getAccount().getStatusProp() == com.skype.Account.STATUS.LOGGED_IN_PARTIALLY;
    }

    public void onAudioFocusChange(int i)
    {
        log.info((new StringBuilder("audio focus change: ")).append(i).toString());
    }

    public void onAudioRouteChanged(boolean flag, String s)
    {
        if (flag)
        {
            AudioRoute.a(s, audioManager);
            eventBus.a(new OnAudioRouteChangedEvent());
            return;
        } else
        {
            log.info((new StringBuilder("Audio routing failed - ")).append(s).toString());
            return;
        }
    }

    void onEvent(OnTranscribedMessage ontranscribedmessage)
    {
        if (ontranscribedmessage.getRecordType() != com.skype.Translator.TRANSLATOR_RECO_TYPE.RECO_FULL) goto _L2; else goto _L1
_L1:
        String s;
        String s1;
        com.skype.Translator.TRANSLATOR_RESERVED_MSGID translator_reserved_msgid;
        s1 = "";
        s = "";
        translator_reserved_msgid = com.skype.Translator.TRANSLATOR_RESERVED_MSGID.fromInt(ontranscribedmessage.getMessageId());
        _cls5..SwitchMap.com.skype.Translator.TRANSLATOR_RESERVED_MSGID[translator_reserved_msgid.ordinal()];
        JVM INSTR tableswitch 1 2: default 60
    //                   1 72
    //                   2 80;
           goto _L3 _L4 _L5
_L3:
        showTranscribeIfRequired(0, ontranscribedmessage.getPartnerId(), s, s1);
_L2:
        return;
_L4:
        s = ontranscribedmessage.getText();
        continue; /* Loop/switch isn't completed */
_L5:
        s1 = ontranscribedmessage.getText();
        if (true) goto _L3; else goto _L6
_L6:
    }

    void onEvent(OnCallScreenForegroundChanged oncallscreenforegroundchanged)
    {
        isCallForegrounded = oncallscreenforegroundchanged.isForegrounded();
        if (!isCallForegrounded && shouldUseProximity())
        {
            boolean flag1 = false;
            oncallscreenforegroundchanged = conversationUtil.a(false).iterator();
            boolean flag;
            do
            {
                flag = flag1;
                if (!oncallscreenforegroundchanged.hasNext())
                {
                    break;
                }
                if (!conversationHasVideo((Conversation)oncallscreenforegroundchanged.next()))
                {
                    continue;
                }
                flag = true;
                break;
            } while (true);
            if (!flag && conversationUtil.a(false).size() > 0)
            {
                updateProximity(true);
            }
        }
    }

    void onEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        if (onpropertychange.getPropKey() == PROPKEY.CONVERSATION_LOCAL_LIVESTATUS) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Conversation conversation;
        List list;
        com.skype.Conversation.LOCAL_LIVESTATUS local_livestatus;
        int i;
        conversation = (Conversation)onpropertychange.getSender();
        i = conversation.getObjectID();
        updateNotificationStatus(conversation);
        sendCallStateBroadcastIntent(conversation);
        list = conversationUtil.a(false);
        local_livestatus = conversation.getLocalLiveStatusProp();
        _cls5..SwitchMap.com.skype.Conversation.LOCAL_LIVESTATUS[local_livestatus.ordinal()];
        JVM INSTR tableswitch 1 7: default 104
    //                   1 182
    //                   2 229
    //                   3 272
    //                   4 272
    //                   5 392
    //                   6 392
    //                   7 698;
           goto _L3 _L4 _L5 _L6 _L6 _L7 _L7 _L8
_L3:
        Object obj;
        AudioRoute audioroute;
        String s;
        long l;
        if (com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE == local_livestatus)
        {
            app2AppManager.connect(ChannelKey.TRANSLATOR, conversation);
        } else
        {
            app2AppManager.disconnect(ChannelKey.TRANSLATOR, conversation);
        }
        if (conversation.getLocalLiveStatusProp() != com.skype.Conversation.LOCAL_LIVESTATUS.NONE)
        {
            notificationManager.cancel(MISSED_CALL_NOTIFICATION_ID | conversation.getObjectID());
            conversationUtil.b(conversation.getObjectID());
        }
        if (list.size() == 0)
        {
            callListenerRef.a();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        onpropertychange = imageCache.a(conversation, Boolean.valueOf(true));
        if (!startIncomingCall(conversation))
        {
            remoteNodeWearModule.startRinging(conversation, onpropertychange);
        }
        wifiLockRef.a(Integer.valueOf(i));
          goto _L3
_L5:
        if (!((ConversationViewState)stateManager.a(conversation, com/skype/android/util/ConversationViewState)).b())
        {
            nav.placeCall(conversation);
        }
        wifiLockRef.a(Integer.valueOf(i));
          goto _L3
_L6:
        onpropertychange = imageCache.a(conversation, Boolean.valueOf(true));
        remoteNodeWearModule.updateLiveCallConversation(conversation, onpropertychange);
        sounds.a();
        callListenerRef.b(Integer.valueOf(i));
        i = 1;
        if (stateManager.a(conversation))
        {
            if (((ConversationViewState)stateManager.a(conversation, com/skype/android/util/ConversationViewState)).e() == CameraFacing.c)
            {
                i = 1;
            } else
            {
                i = 0;
            }
        }
        obj = analytics;
        if (i != 0)
        {
            onpropertychange = AnalyticsEvent.bf;
        } else
        {
            onpropertychange = AnalyticsEvent.bg;
        }
        ((Analytics) (obj)).c(onpropertychange);
          goto _L3
_L7:
        onpropertychange = imageCache.a(conversation, Boolean.valueOf(true));
        remoteNodeWearModule.stopRinging(i);
        remoteNodeWearModule.updateLiveCallConversation(conversation, onpropertychange);
        if (stateManager.a(conversation))
        {
            obj = (ConversationViewState)stateManager.a(conversation, com/skype/android/util/ConversationViewState);
            onpropertychange = ((ConversationViewState) (obj)).e();
            audioroute = ((ConversationViewState) (obj)).f();
            ((ConversationViewState) (obj)).a(null);
            ((ConversationViewState) (obj)).a(null);
            ((ConversationViewState) (obj)).i();
            ((ConversationViewState) (obj)).c(false);
            ((ConversationViewState) (obj)).a(false);
            l = ((ConversationViewState) (obj)).a();
            if (l > 0L)
            {
                s = Analytics.b(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - TimeUtil.f(l)));
                if (onpropertychange == null || onpropertychange == CameraFacing.c)
                {
                    onpropertychange = AnalyticsEvent.ay;
                } else
                {
                    onpropertychange = AnalyticsEvent.S;
                }
                analytics.a(onpropertychange, s);
                onpropertychange = handler.obtainMessage(5);
                onpropertychange.obj = audioroute;
                handler.sendMessageDelayed(onpropertychange, 100L);
                ((ConversationViewState) (obj)).a(0L);
            } else
            {
                onpropertychange = handler.obtainMessage(6);
                handler.sendMessage(onpropertychange);
            }
        }
        onpropertychange = ongoingCallNotification;
        if (onpropertychange != null)
        {
            onpropertychange = neuterNotification(onpropertychange);
        } else
        {
            onpropertychange = buildDummyNotification(conversation).e();
        }
        ongoingCallNotification = onpropertychange;
        callListenerRef.b(Integer.valueOf(i));
        wifiLockRef.b(Integer.valueOf(i));
        updateProximity(false);
        if (list.size() == 0)
        {
            adManager.b();
        }
          goto _L3
_L8:
        onpropertychange = (ConversationViewState)stateManager.a(conversation, com/skype/android/util/ConversationViewState);
        obj = conversationUtil.o(conversation);
        if (obj != null)
        {
            onpropertychange.a((long)((Participant) (obj)).getLiveStartTimestampProp() & 0xffffffffL);
        }
        if (!onpropertychange.b())
        {
            nav.toOngoingCall(conversation);
        }
        sounds.c();
        remoteNodeWearModule.stopRinging(i);
        onpropertychange = imageCache.a(conversation, Boolean.valueOf(true));
        remoteNodeWearModule.updateLiveCallConversation(conversation, onpropertychange);
        endVoicemailRecordings();
        callListenerRef.a(Integer.valueOf(i));
        wifiLockRef.a(Integer.valueOf(i));
        updateProximity(true);
        handler.sendEmptyMessage(3);
        holdLiveConversationsExcept(conversation);
        adManager.a();
        iWasLiveSet.add(Integer.valueOf(conversation.getObjectID()));
          goto _L3
    }

    public void onEvent(com.skype.android.gen.ConversationListener.OnSpawnConference onspawnconference)
    {
        Conversation conversation = onspawnconference.getSender();
        if (conversation.getLocalLiveStatusProp() != com.skype.Conversation.LOCAL_LIVESTATUS.NONE)
        {
            startIncomingCall(conversation);
        }
        updateNotificationStatus(conversation);
        try
        {
            updateNotificationStatus((Conversation)map.a(onspawnconference.getSpawnedObjectID(), com/skype/Conversation));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.skype.android.gen.ConversationListener.OnSpawnConference onspawnconference)
        {
            sendHandledObjectNotFoundTelemetry("onEventForOnSpawnConference");
        }
    }

    void onEvent(com.skype.android.gen.ParticipantListener.OnPropertyChange onpropertychange)
    {
        if (onpropertychange.getPropKey() == PROPKEY.PARTICIPANT_VOICE_STATUS)
        {
            Participant participant = (Participant)onpropertychange.getSender();
            int i = participant.getConvoIdProp();
            if (i > 0)
            {
                onpropertychange = new ConversationImpl();
                lib.getConversationByConvoID(i, onpropertychange);
                com.skype.Conversation.LOCAL_LIVESTATUS local_livestatus = onpropertychange.getLocalLiveStatusProp();
                if (local_livestatus != com.skype.Conversation.LOCAL_LIVESTATUS.NONE && local_livestatus != com.skype.Conversation.LOCAL_LIVESTATUS.RECENTLY_LIVE)
                {
                    Participant participant1 = conversationUtil.o(onpropertychange);
                    if (participant.getObjectID() == participant1.getObjectID())
                    {
                        buildAndUpdateNotification(onpropertychange);
                        android.graphics.Bitmap bitmap = imageCache.a(onpropertychange, Boolean.valueOf(true));
                        remoteNodeWearModule.updateLiveCallConversation(onpropertychange, bitmap);
                    }
                }
            }
        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnConversationListChange onconversationlistchange)
    {
        if (onconversationlistchange.getType() == com.skype.Conversation.LIST_TYPE.LIVE_CONVERSATIONS)
        {
            int i = onconversationlistchange.getConversationObjectID();
            try
            {
                onconversationlistchange = (Conversation)map.a(i, com/skype/Conversation);
                switch (_cls5..SwitchMap.com.skype.Conversation.LOCAL_LIVESTATUS[onconversationlistchange.getLocalLiveStatusProp().ordinal()])
                {
                case 1: // '\001'
                    android.graphics.Bitmap bitmap = imageCache.a(onconversationlistchange, Boolean.valueOf(true));
                    wifiLockRef.a(Integer.valueOf(i));
                    if (!startIncomingCall(onconversationlistchange))
                    {
                        remoteNodeWearModule.startRinging(onconversationlistchange, bitmap);
                        return;
                    }
                    break;
                }
            }
            // Misplaced declaration of an exception variable
            catch (com.skype.android.gen.SkyLibListener.OnConversationListChange onconversationlistchange)
            {
                sendHandledObjectNotFoundTelemetry("onEventForOnConversationListChange");
                return;
            }
        }
    }

    void onEvent(com.skype.android.gen.SkyLibListener.OnMessage onmessage)
    {
        int i = onmessage.getMessageObjectID();
        com.skype.Message message;
        com.skype.Message.TYPE type;
        message = (com.skype.Message)map.a(i, com/skype/Message);
        type = message.getTypeProp();
        if (type == com.skype.Message.TYPE.STARTED_LIVESESSION)
        {
            callQualityFeedbackManager.callStarted(message);
            return;
        }
        try
        {
            if (type == com.skype.Message.TYPE.ENDED_LIVESESSION)
            {
                callQualityFeedbackManager.callEnded(message);
                int j = onmessage.getConversationObjectID();
                onmessage = (Conversation)map.a(j, com/skype/Conversation);
                if (iWasLiveSet.remove(Integer.valueOf(j)) && onmessage.getUnconsumedNormalMessagesProp() == 1)
                {
                    onmessage.setConsumedHorizon(message.getTimestampProp());
                    return;
                }
            }
        }
        // Misplaced declaration of an exception variable
        catch (com.skype.android.gen.SkyLibListener.OnMessage onmessage)
        {
            sendHandledObjectNotFoundTelemetry("onEventForOnMessage");
        }
        return;
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnObjectPropertyChangeWithValue onobjectpropertychangewithvalue)
    {
        Object obj;
        Iterator iterator;
        int j;
        if (onobjectpropertychangewithvalue.getPropKey() != PROPKEY.VIDEO_STATUS)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        j = onobjectpropertychangewithvalue.getObjectID();
        obj = null;
        iterator = conversationUtil.a(false).iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Conversation conversation;
        Iterator iterator1;
        conversation = (Conversation)iterator.next();
        iterator1 = conversationUtil.a(conversation, com.skype.Conversation.PARTICIPANTFILTER.ALL).iterator();
        onobjectpropertychangewithvalue = ((com.skype.android.gen.SkyLibListener.OnObjectPropertyChangeWithValue) (obj));
_L6:
        obj = onobjectpropertychangewithvalue;
        if (!iterator1.hasNext()) goto _L4; else goto _L3
_L3:
        obj = ((Participant)iterator1.next()).getLiveSessionVideos();
        if (!((com.skype.Participant.GetLiveSessionVideos_Result) (obj)).m_return || ((com.skype.Participant.GetLiveSessionVideos_Result) (obj)).m_videoObjectIDList.length <= 0) goto _L6; else goto _L5
_L5:
        int i;
        int l;
        obj = ((com.skype.Participant.GetLiveSessionVideos_Result) (obj)).m_videoObjectIDList;
        l = obj.length;
        i = 0;
_L7:
        if (i < l)
        {
label0:
            {
                if (obj[i] != j)
                {
                    break label0;
                }
                onobjectpropertychangewithvalue = conversation;
            }
        }
          goto _L6
        i++;
          goto _L7
_L2:
        if (obj != null)
        {
            buildAndUpdateNotification(((Conversation) (obj)));
            if (ConversationUtil.t(((Conversation) (obj))))
            {
                boolean flag = conversationHasVideo(((Conversation) (obj)));
                if (!isCallForegrounded && !flag)
                {
                    flag = true;
                } else
                if (!flag && !audioManager.isSpeakerphoneOn())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                updateProximity(flag);
            }
        }
          goto _L6
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnOperationModeChanged onoperationmodechanged)
    {
        if (onoperationmodechanged.getLevel() >= com.skype.GI.NETWORKACTIVITYLEVEL.NAL_QUIET_SUSPENDED_LEVEL.toInt())
        {
            callQualityFeedbackManager.uploadAllRatings();
        }
    }

    public void onEvent(com.skype.android.gen.TranslatorListener.OnTranscribedMessage ontranscribedmessage)
    {
        com.skype.Translator.TRANSLATOR_RESERVED_MSGID translator_reserved_msgid = com.skype.Translator.TRANSLATOR_RESERVED_MSGID.fromInt(ontranscribedmessage.getMsgId());
        if (translator_reserved_msgid != com.skype.Translator.TRANSLATOR_RESERVED_MSGID.WRAPPER_UNKNOWN_VALUE)
        {
            if (ontranscribedmessage.getStatus() != com.skype.Translator.TRANSLATOR_STATUS.TRANSLATOR_CONNECTED)
            {
                log.info((new StringBuilder("TranscribeMessage ignored: ")).append(ontranscribedmessage.getStatus()).toString());
                return;
            }
            boolean flag;
            if (ontranscribedmessage.getRecotype() == com.skype.Translator.TRANSLATOR_RECO_TYPE.RECO_FULL)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                if (translator_reserved_msgid == com.skype.Translator.TRANSLATOR_RESERVED_MSGID.MSGID_FORCALLEE_TRANSLATED || translator_reserved_msgid == com.skype.Translator.TRANSLATOR_RESERVED_MSGID.MSGID_FORCALLER_ORIG)
                {
                    sendTranscribedMessageToCallee(ontranscribedmessage);
                    return;
                }
                if (translator_reserved_msgid == com.skype.Translator.TRANSLATOR_RESERVED_MSGID.MSGID_FORCALLEE_ORIG || translator_reserved_msgid == com.skype.Translator.TRANSLATOR_RESERVED_MSGID.MSGID_FORCALLER_TRANSLATED)
                {
                    String s1 = "";
                    String s = "";
                    if (translator_reserved_msgid == com.skype.Translator.TRANSLATOR_RESERVED_MSGID.MSGID_FORCALLEE_ORIG)
                    {
                        s = ontranscribedmessage.getText();
                    } else
                    {
                        s1 = ontranscribedmessage.getText();
                    }
                    showTranscribeIfRequired(ontranscribedmessage.getConvId(), "", s, s1);
                    return;
                }
            }
        }
    }

    public void onLogin()
    {
        super.onLogin();
        BluetoothReceiver.a(context);
        notificationActionReceiver.register(context);
        endCallReceiver.register(context);
        context.registerReceiver(wiredHeadsetReceiver, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        WiredHeadsetReceiver.a(this);
        BluetoothReceiver.a(this);
    }

    public void onLogout()
    {
        super.onLogout();
        callListenerRef.a();
        VideoMonitor.close(context);
        a a1 = notificationActionReceiver;
        WiredHeadsetReceiver wiredheadsetreceiver = wiredHeadsetReceiver;
        com.skype.android.app.calling.c c1 = endCallReceiver;
        int i = 0;
        while (i < 3) 
        {
            BroadcastReceiver broadcastreceiver = (new BroadcastReceiver[] {
                a1, wiredheadsetreceiver, c1
            })[i];
            try
            {
                context.unregisterReceiver(broadcastreceiver);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                log.warning("Receiver not registered before unregister was called");
            }
            i++;
        }
        WiredHeadsetReceiver.b(this);
        BluetoothReceiver.b(this);
    }

    public void onMessageReceived(k k1)
    {
        commandHandlers.match(k1.a()).handle(context, googleApiClient, k1.a());
    }

    public void onStopRingoutRequested()
    {
        log.info("Stop ringout requested.");
    }

    public void scoConnected()
    {
    }

    public void scoDisconnected()
    {
    }

    protected void sendHandledObjectNotFoundTelemetry(String s)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        s = (new StringBuilder()).append(getClass().getSimpleName()).append("-").append(s).toString();
        analyticsparametercontainer.a(AnalyticsParameter.T, s);
        analytics.a(AnalyticsEvent.df, analyticsparametercontainer);
    }

    public void setAudioRoute(Conversation conversation, AudioRoute audioroute)
    {
        conversation = (ConversationViewState)stateManager.a(conversation, com/skype/android/util/ConversationViewState);
        if (audioroute != null)
        {
            conversation.a(audioroute);
            audioroute.a(audioManager, pcmHost);
        }
        boolean flag;
        if (audioroute == AudioRoute.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        updateProximity(flag);
    }

    public boolean shouldUseProximity()
    {
        return proximityWakeLock.supportsProximitySensor() && !layoutExperience.isMultipane();
    }









}
