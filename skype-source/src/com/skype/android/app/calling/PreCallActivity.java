// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.Participant;
import com.skype.SkyLib;
import com.skype.Translator;
import com.skype.Video;
import com.skype.Voicemail;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.Navigation;
import com.skype.android.audio.AudioRoute;
import com.skype.android.calling.CameraFacing;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.media.CameraView;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.res.Sounds;
import com.skype.android.ringtone.RingtoneStorage;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.telemetry.TelemetryHelper;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ConversationViewState;
import com.skype.android.util.DeviceFeatures;
import com.skype.android.util.ImageCache;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.PerformanceLog;
import com.skype.android.util.StartupTimeReporter;
import com.skype.android.util.ViewStateManager;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.async.UiCallback;
import com.skype.android.widget.CircleImageView;
import com.skype.pcmhost.PcmHost;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.calling:
//            CallConstants, d, CallControlsView, b, 
//            VideoMonitor, CallActivity, AfterCallEndedActivity, OnAudioRouteChangedEvent

public class PreCallActivity extends SkypeActivity
    implements android.os.Handler.Callback, android.view.View.OnClickListener, CallConstants, d
{

    private static final String ANDROID_MEDIA_EXTRA_VOLUME_STREAM_VALUE = "android.media.EXTRA_VOLUME_STREAM_VALUE";
    private static final String ANDROID_MEDIA_VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private static final String SAVED_BUNDLE_CALL_STATUS_MESSAGE = "status_text_message";
    private static final String SAVED_BUNDLE_HANDLER_FINISHING = "handler_finishing";
    private static final String SAVED_BUNDLE_OUTGOING_CALL = "calloutgoing";
    private static final String SAVED_BUNDLE_RINGTONE_MUTED = "ringtone_muted";
    private static final String SAVED_BUNDLE_SHOULD_STOP_RINGING_LOCALLY = "should_stop_ringing_locally";
    private static final String SAVED_BUNDLE_USER_MUTED = "user_muted";
    ImageButton acceptCallButton;
    ImageButton acceptVideoCallButton;
    AccessibilityUtil accessibility;
    private BroadcastReceiver amazonVolumeChangeReceiver;
    Analytics analytics;
    AudioManager audioManager;
    CircleImageView avatarImage;
    CallControlsView callControls;
    b callEndOverlay;
    TextView calleeText;
    ViewGroup callingButtons;
    CameraView cameraPreview;
    ViewGroup connectContainer;
    private Contact contact;
    ContactUtil contactUtil;
    private Conversation conversation;
    ConversationUtil conversationUtil;
    ImageButton declineCallButton;
    DefaultAvatars defaultAvatars;
    private int dotCount;
    TextView dotsText;
    EcsConfiguration ecsConfiguration;
    private Handler handler;
    ImageCache imageCache;
    private boolean incomingWithVideo;
    private boolean isCallOutgoing;
    private boolean isDialog;
    private com.skype.SkyLib.LEAVE_REASON lastLeaveReason;
    SkyLib lib;
    private String liveIdentity;
    ObjectIdMap map;
    Navigation navigation;
    private BroadcastReceiver networkStateReceiver;
    NetworkUtil networkUtil;
    private boolean outgoingVideo;
    private Participant participant;
    PcmHost pcmHost;
    private boolean ringTranslated;
    private boolean ringtoneMuted;
    RingtoneStorage ringtoneStorage;
    private boolean shouldStopRingingLocally;
    Sounds sounds;
    private ConversationViewState state;
    ViewStateManager stateManager;
    TextView statusText;
    TelemetryHelper telemetryHelper;
    TelephonyManager telephonyManager;
    Translator translator;
    private boolean userMuted;
    private boolean videoCall;
    private IntentFilter volumeChangeIntentFilter;

    public PreCallActivity()
    {
        ringTranslated = false;
    }

    private void acceptIncomingCall(boolean flag)
    {
        outgoingVideo = flag;
        videoCall = outgoingVideo;
        sounds.c();
        if (DeviceFeatures.d() && audioManager.getMode() != 3)
        {
            audioManager.setMode(3);
        }
        if (conversation.joinLiveSession("", flag))
        {
            AnalyticsEvent analyticsevent;
            if (incomingWithVideo)
            {
                if (flag)
                {
                    analyticsevent = AnalyticsEvent.U;
                } else
                {
                    analyticsevent = AnalyticsEvent.T;
                }
            } else
            {
                analyticsevent = AnalyticsEvent.V;
            }
            analytics.c(analyticsevent);
            return;
        } else
        {
            log.info((new StringBuilder("Failed to join live session, conversation status: ")).append(conversation.getLocalLiveStatusProp()).toString());
            endCallWithMessage(getString(0x7f080370));
            return;
        }
    }

    private boolean canRing()
    {
        boolean flag2 = false;
        boolean flag;
        boolean flag1;
        if (telephonyManager.getCallState() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (participant != null && participant.getIsSeamlesslyUpgradedCallProp())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 || flag)
        {
            flag2 = true;
        }
        return flag2;
    }

    private boolean checkAndLaunchEmergencyDialer(String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!TextUtils.isEmpty(s))
        {
            flag = flag1;
            if (contactUtil.a(s, 0))
            {
                s = new Intent("com.android.phone.EmergencyDialer.DIAL");
                s.setData(Uri.parse((new StringBuilder("tel:")).append(contact.getIdentity()).toString()));
                if (s.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(s);
                    finish();
                }
                flag = true;
            }
        }
        return flag;
    }

    private boolean checkConnectivity()
    {
        if (!networkUtil.b())
        {
            endCallWithReason(com.skype.SkyLib.LEAVE_REASON.LIVE_INTERNET_CONNECTION_LOST);
            return false;
        } else
        {
            return true;
        }
    }

    private void checkConversationState()
    {
        if (isDisplayingCallDropped() || isFinishing()) goto _L2; else goto _L1
_L1:
        com.skype.Conversation.LOCAL_LIVESTATUS local_livestatus;
        local_livestatus = conversation.getLocalLiveStatusProp();
        log.info((new StringBuilder("live status ")).append(local_livestatus).toString());
        static final class _cls4
        {

            static final int $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[];
            static final int $SwitchMap$com$skype$PROPKEY[];
            static final int $SwitchMap$com$skype$Participant$VOICE_STATUS[];
            static final int $SwitchMap$com$skype$SkyLib$LEAVE_REASON[];

            static 
            {
                $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS = new int[com.skype.Conversation.LOCAL_LIVESTATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror33) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.OTHERS_ARE_LIVE_FULL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror32) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.RECORDING_VOICE_MESSAGE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror31) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.PLAYING_VOICE_MESSAGE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror30) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.OTHERS_ARE_LIVE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror29) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.RECENTLY_LIVE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror28) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.NONE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror27) { }
                $SwitchMap$com$skype$Participant$VOICE_STATUS = new int[com.skype.Participant.VOICE_STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Participant$VOICE_STATUS[com.skype.Participant.VOICE_STATUS.VOICE_CONNECTING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror26) { }
                try
                {
                    $SwitchMap$com$skype$Participant$VOICE_STATUS[com.skype.Participant.VOICE_STATUS.RINGING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                try
                {
                    $SwitchMap$com$skype$Participant$VOICE_STATUS[com.skype.Participant.VOICE_STATUS.EARLY_MEDIA.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_LOCAL_LIVESTATUS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_META_TOPIC.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_LIVE_IS_MUTED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                $SwitchMap$com$skype$SkyLib$LEAVE_REASON = new int[com.skype.SkyLib.LEAVE_REASON.values().length];
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_INSUFFICIENT_FUNDS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_TRANSFER_INSUFFICIENT_FUNDS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_PSTN_INVALID_NUMBER.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_EMERGENCY_CALL_DENIED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_BLOCKED_BY_US.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_NO_SKYPEOUT_SUBSCRIPTION.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_PSTN_NETWORK_ERROR.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_CONNECTION_DROPPED.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_INTERNET_CONNECTION_LOST.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_LEGACY_ERROR.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_MANUAL.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_NO_ANSWER.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_PSTN_CALL_REJECTED.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_PSTN_CALL_TERMINATED.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_BUSY.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_PSTN_BUSY.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_TOO_MANY_IDENTITIES.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_BLOCKED_BY_PRIVACY_SETTINGS.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_SKYPEOUT_ACCOUNT_BLOCKED.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_RECORDING_FAILED.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LEAVE_REASON_NONE.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls4..SwitchMap.com.skype.Conversation.LOCAL_LIVESTATUS[local_livestatus.ordinal()];
        JVM INSTR tableswitch 1 7: default 96
    //                   1 97
    //                   2 128
    //                   3 140
    //                   4 150
    //                   5 169
    //                   6 190
    //                   7 190;
           goto _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L8
_L2:
        return;
_L3:
        PerformanceLog.d.a("live");
        setUiState();
        conversation.joinLiveSession("");
        startInCallAndFinish();
        return;
_L4:
        endCallWithMessage(getString(0x7f080371));
        return;
_L5:
        statusText.setText(0x7f08041a);
_L6:
        updateCallControlsLayout();
        callControls.refreshCallControls();
        sounds.c();
        return;
_L7:
        if (getIntent().getBooleanExtra("joinLiveSession", false) && joinCall()) goto _L2; else goto _L8
_L8:
        PerformanceLog.d.a("abandoned");
        endCallWithMessage("");
        return;
    }

    private void checkForIncomingVideoCall(Participant participant1)
    {
        int i = 0;
        boolean flag = false;
        if (conversation.getLiveCallTechnologyProp() == com.skype.Conversation.CALL_TECHNOLOGY.CALL_NGC)
        {
            flag = true;
        } else
        if (participant1 != null)
        {
            participant1 = ConversationUtil.a(lib, participant1);
            if (participant1 != null && participant1.getStatusProp() == com.skype.Video.STATUS.HINT_IS_VIDEOCALL_RECEIVED)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            incomingWithVideo = flag;
            flag = incomingWithVideo;
        }
        if (flag)
        {
            videoCall = true;
            flag = conversationUtil.i(conversation);
            if (acceptVideoCallButton != null)
            {
                participant1 = acceptVideoCallButton;
                if (!flag)
                {
                    i = 8;
                }
                participant1.setVisibility(i);
            }
        }
    }

    private void displayOutgoingAudioCall()
    {
        if (callingButtons != null)
        {
            callingButtons.setVisibility(8);
        }
        callControls.setVisibility(0);
    }

    private void displayOutgoingVideoCall()
    {
        if (callingButtons != null)
        {
            callingButtons.setVisibility(8);
        }
        callControls.setVisibility(0);
    }

    private void endCallWithMessage(String s)
    {
        endCall();
        handler.removeMessages(3);
        statusText.setText(s);
        dotsText.setVisibility(8);
    }

    private void endCallWithReason(com.skype.SkyLib.LEAVE_REASON leave_reason)
    {
        lastLeaveReason = leave_reason;
        _cls4..SwitchMap.com.skype.SkyLib.LEAVE_REASON[leave_reason.ordinal()];
        JVM INSTR tableswitch 1 21: default 112
    //                   1 156
    //                   2 156
    //                   3 226
    //                   4 142
    //                   5 128
    //                   6 122
    //                   7 170
    //                   8 170
    //                   9 170
    //                   10 184
    //                   11 198
    //                   12 198
    //                   13 198
    //                   14 198
    //                   15 212
    //                   16 212
    //                   17 212
    //                   18 240
    //                   19 272
    //                   20 122
    //                   21 122;
           goto _L1 _L2 _L2 _L3 _L4 _L5 _L6 _L7 _L7 _L7 _L8 _L9 _L9 _L9 _L9 _L10 _L10 _L10 _L11 _L12 _L6 _L6
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        endCallWithMessage(getString(0x7f080370));
_L14:
        reportCallEndedForReason(leave_reason);
        return;
_L5:
        endCallWithMessage(getString(0x7f080375));
        continue; /* Loop/switch isn't completed */
_L4:
        endCallWithMessage(getString(0x7f080372));
        continue; /* Loop/switch isn't completed */
_L2:
        endCallWithMessage(getString(0x7f080401));
        continue; /* Loop/switch isn't completed */
_L7:
        endCallWithMessage(getString(0x7f080377));
        continue; /* Loop/switch isn't completed */
_L8:
        endCallWithMessage(getString(0x7f080374));
        continue; /* Loop/switch isn't completed */
_L9:
        endCallWithMessage(getString(0x7f080376));
        continue; /* Loop/switch isn't completed */
_L10:
        endCallWithMessage(getString(0x7f080371));
        continue; /* Loop/switch isn't completed */
_L3:
        endCallWithMessage(getString(0x7f080373));
        continue; /* Loop/switch isn't completed */
_L11:
        endCallWithMessage(getString(0x7f080378, new Object[] {
            contactUtil.l(contact)
        }));
        continue; /* Loop/switch isn't completed */
_L12:
        endCallWithMessage(getString(0x7f08037a));
        if (true) goto _L14; else goto _L13
_L13:
    }

    private void enterEndCallState()
    {
        callEndOverlay.setOverlayVisible(true);
        handler.sendEmptyMessageDelayed(4, 3000L);
    }

    private String getPhoneNumber()
    {
        if (contact != null && ContactUtil.g(contact))
        {
            return contact.getIdentity();
        } else
        {
            return (String)getIntent().getExtras().get("com.skype.identitiy");
        }
    }

    private void initializeState(Intent intent, Bundle bundle)
    {
label0:
        {
            Object obj1 = null;
            int i = intent.getIntExtra("com.skype.objId", 0);
            conversation = (Conversation)map.a(i, com/skype/Conversation);
            state = (ConversationViewState)stateManager.a(conversation, com/skype/android/util/ConversationViewState);
            Object obj;
            Object obj2;
            boolean flag;
            if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            isDialog = flag;
            isCallOutgoing = intent.getBooleanExtra("outgoing", false);
            if (isDialog)
            {
                obj = conversationUtil.a(conversation, conversation.getIdentityProp());
            } else
            {
                obj = null;
            }
            participant = ((Participant) (obj));
            outgoingVideo = getIntent().getBooleanExtra("extraVideo", false);
            if (participant != null)
            {
                liveIdentity = participant.getIdentityProp();
                if (getIntent().hasExtra("com.skype.identitiy"))
                {
                    liveIdentity = getIntent().getStringExtra("com.skype.identitiy");
                    outgoingVideo = false;
                }
                participant.setLiveIdentityToUse(liveIdentity);
            }
            videoCall = outgoingVideo;
            obj2 = state.f();
            if (obj2 != null)
            {
                obj = obj2;
                if (((AudioRoute) (obj2)).c(audioManager).booleanValue())
                {
                    break label0;
                }
            }
            obj2 = audioManager;
            obj = obj1;
            if (outgoingVideo)
            {
                obj = AudioRoute.c;
            }
            obj = AudioRoute.a(((AudioManager) (obj2)), ((AudioRoute) (obj)));
        }
        setAudioRoute(((AudioRoute) (obj)));
        if (videoCall && !VideoMonitor.isShowing())
        {
            setContentView(0x7f0300dd);
        } else
        {
            setContentView(0x7f0300db);
        }
        if (isCallOutgoing)
        {
            statusText.setText(0x7f0803d9);
            if ((intent.getFlags() & 0x40000) != 0)
            {
                log.warning("We should never initiate a call unattended");
            }
        }
        intent = new UiCallback(this, new AsyncCallback() {

            final PreCallActivity this$0;

            public final void done(AsyncResult asyncresult)
            {
                ImageView imageview = (ImageView)asyncresult.b();
                asyncresult = (Bitmap)asyncresult.a();
                if (asyncresult != null)
                {
                    imageview.setImageBitmap(asyncresult);
                } else
                if (isDialog)
                {
                    avatarImage.setImageDrawable(contactUtil.c(contact));
                } else
                {
                    avatarImage.setImageDrawable(defaultAvatars.a(com.skype.android.res.DefaultAvatars.AvatarType.d, com.skype.android.res.DefaultAvatars.AvatarSize.c, conversation.getIdentityProp()));
                }
                imageview.setVisibility(0);
            }

            
            {
                this$0 = PreCallActivity.this;
                super();
            }
        });
        if (isDialog)
        {
            contact = conversationUtil.r(conversation);
            imageCache.b(contact, avatarImage, intent);
        } else
        {
            imageCache.a(conversation, avatarImage, intent);
        }
        if (bundle != null)
        {
            ringtoneMuted = bundle.getBoolean("ringtone_muted");
            shouldStopRingingLocally = bundle.getBoolean("should_stop_ringing_locally");
            userMuted = bundle.getBoolean("user_muted", false);
            statusText.setText(bundle.getString("status_text_message"));
            setMicrophoneMuted(userMuted);
            if (bundle.getBoolean("handler_finishing"))
            {
                if (bundle.getBoolean("calloutgoing"))
                {
                    updateCallControlsLayout();
                }
                enterEndCallState();
            }
        }
        updateCalleeText();
        ViewUtil.a(getWindow().getDecorView());
        ViewUtil.a(this, new View[] {
            declineCallButton, acceptCallButton, acceptVideoCallButton
        });
    }

    private boolean isDisplayingCallDropped()
    {
        return handler.hasMessages(4);
    }

    private boolean joinCall()
    {
        setUiState();
        callControls.setVisibility(8);
        if (acceptCallButton != null)
        {
            acceptCallButton.setVisibility(8);
        }
        if (acceptVideoCallButton != null)
        {
            acceptVideoCallButton.setVisibility(8);
        }
        return conversation.joinLiveSession("");
    }

    private void reportCallEndedForReason(com.skype.SkyLib.LEAVE_REASON leave_reason)
    {
        switch (_cls4..SwitchMap.com.skype.SkyLib.LEAVE_REASON[leave_reason.ordinal()])
        {
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        default:
            return;

        case 1: // '\001'
            analytics.c(AnalyticsEvent.e);
            return;

        case 2: // '\002'
            analytics.c(AnalyticsEvent.g);
            return;

        case 6: // '\006'
            analytics.c(AnalyticsEvent.f);
            break;
        }
    }

    private void reportTranslatorRingEvent(String s, String s1, boolean flag)
    {
        SkypeTelemetryEvent skypetelemetryevent = new SkypeTelemetryEvent(LogEvent.aj);
        skypetelemetryevent.put(LogAttributeName.g, Integer.valueOf(conversation.getObjectID()));
        skypetelemetryevent.put(LogAttributeName.i, s);
        skypetelemetryevent.put(LogAttributeName.p, s1);
        skypetelemetryevent.put(LogAttributeName.o, Boolean.valueOf(flag));
        analytics.a(skypetelemetryevent);
    }

    private void ringIn(Participant participant1)
    {
        setUiState();
        callControls.setVisibility(8);
        callingButtons.setVisibility(0);
        if (ringtoneMuted) goto _L2; else goto _L1
_L1:
        AsyncTask asynctask;
        String s;
        String s1;
        s = conversation.getIdentityProp();
        s1 = conversationUtil.o(conversation).getIdentityProp();
        asynctask = ringtoneStorage.a(s1, s);
        Object obj1;
        StringBuilder stringbuilder;
        obj1 = log;
        stringbuilder = new StringBuilder("ringIn() uri:");
        if (asynctask != null) goto _L4; else goto _L3
_L3:
        Object obj = "null";
_L5:
        ((Logger) (obj1)).info(stringbuilder.append(obj).toString());
        obj1 = getApplicationContext().getContentResolver();
        if (asynctask == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        if (asynctask.get() == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        obj = asynctask;
        if (((ContentResolver) (obj1)).getType((Uri)asynctask.get()) != null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        ringtoneStorage.b(s1, s);
        obj = null;
_L6:
        setVolumeControlStream(sounds.a(state.f(), conversationUtil.b(true), ((AsyncTask) (obj))));
_L2:
        checkForIncomingVideoCall(participant1);
        PerformanceLog.d.a("CallSetupTime:ringing;inbound");
        return;
_L4:
        obj = (Comparable)asynctask.get();
          goto _L5
        InterruptedException interruptedexception;
        interruptedexception;
_L7:
        log.info((new StringBuilder("ringIn() Exception:")).append(interruptedexception).toString());
        interruptedexception = asynctask;
          goto _L6
        interruptedexception;
          goto _L7
    }

    private void ringOut()
    {
        setUiState();
        updateCallControlsLayout();
        if (shouldStopRingingLocally) goto _L2; else goto _L1
_L1:
        shouldStopRingingLocally = true;
        if (!getIntent().getBooleanExtra("extraRingSeamless", false)) goto _L4; else goto _L3
_L3:
        conversation.ringSeamless(true);
_L6:
        PerformanceLog.d.a("CallSetupTime:ringing;outbound");
        lib.startMonitoringQuality(conversation.getIdentityProp(), true);
_L2:
        return;
_L4:
        com.skype.android.util.ConversationUtil.TranslatorSetting translatorsetting = conversationUtil.C(conversation);
        if (conversationUtil.B(conversation) && networkUtil.d() && ConversationUtil.b(translatorsetting))
        {
            ringTranslated = translator.ringTranslated(conversation.getObjectID(), outgoingVideo, translatorsetting.d, translatorsetting.e);
            reportTranslatorRingEvent(translatorsetting.d, translatorsetting.e, ringTranslated);
        }
        if (!ringTranslated)
        {
            String as[];
            if (conversation.getTypeProp() == com.skype.Conversation.TYPE.CONFERENCE)
            {
                as = new String[0];
            } else
            {
                as = new String[1];
                as[0] = liveIdentity;
            }
            conversation.ringOthers(as, outgoingVideo, "");
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void setDefaultVolumeControlStream()
    {
        setVolumeControlStream(0);
    }

    private void setUiState()
    {
        state.a(true);
    }

    private void startInCallAndFinish()
    {
        sounds.c();
        Intent intent = new Intent(this, com/skype/android/app/calling/CallActivity);
        intent.putExtras(getIntent());
        intent.putExtra("com.skype.objId", conversation.getObjectID());
        intent.putExtra("extraVideo", outgoingVideo);
        intent.putExtra("ringTranslated", ringTranslated);
        if (userMuted)
        {
            intent.putExtra("userMuted", userMuted);
        }
        startActivity(intent);
        userMuted = false;
        finish();
    }

    private void updateAccessibilityState()
    {
        if (accessibility.a())
        {
            int i;
            if (!isDialog)
            {
                if (isCallOutgoing)
                {
                    i = 0x7f0800a9;
                } else
                {
                    i = 0x7f08008f;
                }
            } else
            if (isCallOutgoing)
            {
                if (outgoingVideo)
                {
                    i = 0x7f0800aa;
                } else
                {
                    i = 0x7f0800a8;
                }
            } else
            if (incomingWithVideo)
            {
                i = 0x7f080090;
            } else
            {
                i = 0x7f08008e;
            }
            setTitle(getString(i, new Object[] {
                conversationUtil.m(conversation)
            }));
        }
    }

    private void updateCallControlsLayout()
    {
        if (outgoingVideo)
        {
            displayOutgoingVideoCall();
            return;
        } else
        {
            displayOutgoingAudioCall();
            return;
        }
    }

    private void updateCalleeText()
    {
        TextView textview = calleeText;
        Object obj;
        if (isDialog)
        {
            obj = contactUtil.l(contact);
        } else
        {
            obj = conversationUtil.m(conversation);
        }
        textview.setText(((CharSequence) (obj)));
        if (connectContainer != null)
        {
            connectContainer.setContentDescription((new StringBuilder()).append(calleeText.getText()).append(" ").append(statusText.getText()).toString());
        }
    }

    public void addParticipantsToCall()
    {
    }

    public boolean canAddParticipants()
    {
        return false;
    }

    public void endCall()
    {
        int i = conversation.getActiveVmIdProp();
        if (i > 0)
        {
            i = lib.findObjectByDbID(com.skype.SkyLib.OBJECTTYPE.VOICEMAIL, i);
            Voicemail voicemail = (Voicemail)map.a(i, com/skype/Voicemail);
            if (!conversation.postVoiceMessage(voicemail.getObjectID(), ""))
            {
                log.warning("failed to post voicemail");
                conversation.leaveLiveSession(false);
            }
        } else
        {
            conversation.leaveLiveSession(false);
        }
        if (!isFinishing() && !callEndOverlay.isOverlayVisible())
        {
            audioManager.abandonAudioFocus(null);
            enterEndCallState();
        }
    }

    public AudioRoute getAudioRoute()
    {
        return state.f();
    }

    public CameraFacing getCameraFacing()
    {
        CameraFacing camerafacing1 = state.e();
        CameraFacing camerafacing = camerafacing1;
        if (camerafacing1 == null)
        {
            camerafacing = CameraFacing.c;
        }
        return camerafacing;
    }

    public EnumSet getPossibleCameraFacing()
    {
        if (isSkypeOutCall())
        {
            return EnumSet.noneOf(com/skype/android/calling/CameraFacing);
        } else
        {
            return EnumSet.of(CameraFacing.c);
        }
    }

    public boolean handleMessage(Message message)
    {
        boolean flag1 = true;
        message.what;
        JVM INSTR tableswitch 3 4: default 28
    //                   3 34
    //                   4 132;
           goto _L1 _L2 _L3
_L1:
        boolean flag = false;
_L5:
        return flag;
_L2:
        flag = flag1;
        if (callEndOverlay.isOverlayVisible()) goto _L5; else goto _L4
_L4:
        handler.sendEmptyMessageDelayed(3, 500L);
        message = new StringBuilder();
        for (int i = 0; i < dotCount; i++)
        {
            message.append('.');
        }

        dotsText.setText(message.toString());
        dotCount = dotCount + 1;
        flag = flag1;
        if (dotCount <= 3) goto _L5; else goto _L6
_L6:
        dotCount = 0;
        return true;
_L3:
        if (lastLeaveReason == null) goto _L8; else goto _L7
_L7:
        message = new Intent(this, com/skype/android/app/calling/AfterCallEndedActivity);
        _cls4..SwitchMap.com.skype.SkyLib.LEAVE_REASON[lastLeaveReason.ordinal()];
        JVM INSTR tableswitch 1 4: default 192
    //                   1 203
    //                   2 203
    //                   3 220
    //                   4 237;
           goto _L8 _L9 _L9 _L10 _L11
_L8:
        userMuted = false;
        finish();
        return true;
_L9:
        message.putExtra("extraCallEndedNoSkypeCredit", true);
        startActivity(message);
        continue; /* Loop/switch isn't completed */
_L10:
        message.putExtra("extraCallEndedInvalidNumber", true);
        startActivity(message);
        continue; /* Loop/switch isn't completed */
_L11:
        message = getPackageManager();
        message.clearPackagePreferredActivities(getPackageName());
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse((new StringBuilder("tel:")).append(liveIdentity).toString()));
        if (message.queryIntentActivities(intent, 0).size() > 0)
        {
            startActivity(intent);
        }
        if (true) goto _L8; else goto _L12
_L12:
    }

    public boolean hasUnconsumedMessages()
    {
        return false;
    }

    public boolean isAudioCall()
    {
        return !videoCall;
    }

    public boolean isCallOnHold()
    {
        return ConversationUtil.s(conversation);
    }

    public boolean isDialogCall()
    {
        return isDialog;
    }

    public boolean isDialpadShowing()
    {
        return false;
    }

    public boolean isMicrophoneMuted()
    {
        return conversation.getLiveIsMutedProp();
    }

    public boolean isPreCall()
    {
        return true;
    }

    public boolean isSkypeOutCall()
    {
        if (liveIdentity != null)
        {
            return ContactUtil.a(lib.getIdentityType(liveIdentity));
        } else
        {
            return false;
        }
    }

    boolean onAcceptEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        onpropertychange = onpropertychange.getPropKey();
        return onpropertychange == PROPKEY.CONVERSATION_LOCAL_LIVESTATUS || onpropertychange == PROPKEY.CONVERSATION_META_TOPIC || onpropertychange == PROPKEY.CONVERSATION_LIVE_IS_MUTED;
    }

    public void onBackPressed()
    {
        if (!callEndOverlay.isOverlayVisible())
        {
            endCall();
            super.onBackPressed();
        }
    }

    public void onClick(View view)
    {
        if (view == declineCallButton)
        {
            endCall();
            userMuted = false;
            finish();
        } else
        {
            if (view == acceptCallButton)
            {
                acceptIncomingCall(false);
                return;
            }
            if (view == acceptVideoCallButton)
            {
                acceptIncomingCall(true);
                return;
            }
        }
    }

    public void onControlsClicked(boolean flag)
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        setDefaultVolumeControlStream();
        if (DeviceFeatures.b())
        {
            volumeChangeIntentFilter = new IntentFilter();
            volumeChangeIntentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            amazonVolumeChangeReceiver = new BroadcastReceiver() {

                final PreCallActivity this$0;

                public final void onReceive(Context context, Intent intent)
                {
                    unregisterReceiver(this);
                    audioManager.setStreamVolume(getVolumeControlStream(), ((Integer)intent.getExtras().get("android.media.EXTRA_VOLUME_STREAM_VALUE")).intValue(), 0);
                    registerReceiver(this, volumeChangeIntentFilter);
                }

            
            {
                this$0 = PreCallActivity.this;
                super();
            }
            };
        }
        getWindow().addFlags(0x688480);
        getWindow().getDecorView().setSystemUiVisibility(1);
        handler = new Handler(this);
        initializeState(getIntent(), bundle);
        callControls.setSettings(this);
        if (accessibility.a())
        {
            callControls.enableFingerScanningMode();
            if (connectContainer != null)
            {
                AccessibilityUtil.a(new View[] {
                    calleeText, statusText, dotsText
                });
            }
        }
        networkStateReceiver = new BroadcastReceiver() {

            final PreCallActivity this$0;

            public final void onReceive(Context context, Intent intent)
            {
                checkConnectivity();
            }

            
            {
                this$0 = PreCallActivity.this;
                super();
            }
        };
        if (cameraPreview != null)
        {
            cameraPreview.initialize();
        }
        if (isCallOutgoing)
        {
            PerformanceLog.d.a();
        }
    }

    protected void onDestroy()
    {
        if (cameraPreview != null)
        {
            cameraPreview.onDestroy();
        }
        super.onDestroy();
    }

    public void onEvent(OnAudioRouteChangedEvent onaudioroutechangedevent)
    {
        callControls.updateAudioRouteButtonImage(getAudioRoute());
    }

    void onEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        if (onpropertychange.getSender().getObjectID() != conversation.getObjectID()) goto _L2; else goto _L1
_L1:
        _cls4..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()];
        JVM INSTR tableswitch 1 3: default 60
    //                   1 61
    //                   2 73
    //                   3 78;
           goto _L3 _L4 _L5 _L6
_L3:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_78;
_L2:
        return;
_L4:
        if (!isDisplayingCallDropped())
        {
            checkConversationState();
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
        updateCalleeText();
        return;
        callControls.refreshCallControls();
        return;
    }

    void onEvent(com.skype.android.gen.ParticipantListener.OnPropertyChange onpropertychange)
    {
        Participant participant1 = (Participant)onpropertychange.getSender();
        if (participant1.getConvoIdProp() != conversation.getDbID() || onpropertychange.getPropKey() != PROPKEY.PARTICIPANT_VOICE_STATUS) goto _L2; else goto _L1
_L1:
        String s = participant1.getLiveIdentityToUseProp();
        onpropertychange = s;
        if (TextUtils.isEmpty(s))
        {
            onpropertychange = participant1.getLiveIdentityProp();
        }
        if (!onpropertychange.equals(liveIdentity)) goto _L2; else goto _L3
_L3:
        _cls4..SwitchMap.com.skype.Participant.VOICE_STATUS[participant1.getVoiceStatusProp().ordinal()];
        JVM INSTR tableswitch 1 3: default 108
    //                   1 109
    //                   2 145
    //                   3 188;
           goto _L2 _L4 _L5 _L6
_L2:
        return;
_L4:
        statusText.setText(0x7f0803d9);
        updateCalleeText();
        setVolumeControlStream(sounds.a(state.f(), 0x7f070002));
        return;
_L5:
        statusText.setText(0x7f0803da);
        updateCalleeText();
        sounds.c();
        setVolumeControlStream(sounds.a(state.f(), 0x7f070008));
        return;
_L6:
        log.info("PSTN early media ring stop");
        statusText.setText(0x7f0803da);
        updateCalleeText();
        sounds.c();
        return;
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnMessage onmessage)
    {
        if (onmessage.getConversationObjectID() != conversation.getObjectID()) goto _L2; else goto _L1
_L1:
        onmessage = (com.skype.Message)map.a(onmessage.getMessageObjectID(), com/skype/Message);
        if (onmessage.getTypeProp() != com.skype.Message.TYPE.ENDED_LIVESESSION) goto _L2; else goto _L3
_L3:
        if (onmessage.getLeaveReasonProp() != com.skype.SkyLib.LEAVE_REASON.LIVE_EMERGENCY_CALL_DENIED && conversation.getConsumptionHorizonProp() < onmessage.getTimestampProp()) goto _L5; else goto _L4
_L4:
        if (!isCallOutgoing || !isDialog || contact == null || !contactUtil.i(contact)) goto _L7; else goto _L6
_L6:
        endCallWithMessage(getString(0x7f080370));
        sounds.a(getAudioRoute());
_L2:
        return;
_L7:
        endCallWithReason(onmessage.getLeaveReasonProp());
        return;
_L5:
        if (onmessage.getLeaveReasonProp() == com.skype.SkyLib.LEAVE_REASON.LIVE_INSUFFICIENT_FUNDS)
        {
            endCallWithReason(onmessage.getLeaveReasonProp());
            return;
        }
        if (true) goto _L2; else goto _L8
_L8:
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnQualityTestResult onqualitytestresult)
    {
        com.skype.SkyLib.QUALITYTESTTYPE qualitytesttype = onqualitytestresult.getTestType();
        onqualitytestresult = onqualitytestresult.getTestResult();
        if (qualitytesttype == com.skype.SkyLib.QUALITYTESTTYPE.QTT_AUDIO_IN)
        {
            if (onqualitytestresult == com.skype.SkyLib.QUALITYTESTRESULT.QTR_UNDEFINED || onqualitytestresult == com.skype.SkyLib.QUALITYTESTRESULT.QTR_CRITICAL)
            {
                statusText.setText(getString(0x7f080381));
            }
        } else
        if (qualitytesttype == com.skype.SkyLib.QUALITYTESTTYPE.QTT_AUDIO_OUT && (onqualitytestresult == com.skype.SkyLib.QUALITYTESTRESULT.QTR_UNDEFINED || onqualitytestresult == com.skype.SkyLib.QUALITYTESTRESULT.QTR_CRITICAL))
        {
            statusText.setText(getString(0x7f080382));
            return;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if ((i == 25 || i == 164) && conversation.getLocalLiveStatusProp() == com.skype.Conversation.LOCAL_LIVESTATUS.RINGING_FOR_ME)
        {
            sounds.c();
            ringtoneMuted = true;
            setDefaultVolumeControlStream();
        } else
        if (!ringtoneMuted || i != 25 && i != 24 && i != 164)
        {
            return super.onKeyDown(i, keyevent);
        }
        return true;
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        if (isDisplayingCallDropped() || isFinishing())
        {
            handler.removeMessages(4);
            finish();
            startActivity(intent);
            return;
        } else
        {
            initializeState(intent, null);
            return;
        }
    }

    protected void onPause()
    {
        ViewUtil.b(getWindow().getDecorView());
        if (DeviceFeatures.b())
        {
            unregisterReceiver(amazonVolumeChangeReceiver);
        }
        accessibility.a(false);
        handler.removeMessages(3);
        super.onPause();
        if (cameraPreview != null)
        {
            log.info("stopping camera preview");
            cameraPreview.onPause();
        }
    }

    protected void onResume()
    {
        super.onResume();
        ViewUtil.a(getWindow().getDecorView());
        StartupTimeReporter.a().a(com.skype.android.util.StartupTimeReporter.CheckPoint.h, telemetryHelper);
        if (DeviceFeatures.b())
        {
            registerReceiver(amazonVolumeChangeReceiver, volumeChangeIntentFilter);
        }
        if (checkAndLaunchEmergencyDialer(getPhoneNumber()))
        {
            return;
        }
        if (isDisplayingCallDropped() || !checkConnectivity()) goto _L2; else goto _L1
_L1:
        if (!canRing()) goto _L4; else goto _L3
_L3:
        com.skype.Conversation.LOCAL_LIVESTATUS local_livestatus = conversation.getLocalLiveStatusProp();
        if (local_livestatus != com.skype.Conversation.LOCAL_LIVESTATUS.NONE && local_livestatus != com.skype.Conversation.LOCAL_LIVESTATUS.STARTING && local_livestatus != com.skype.Conversation.LOCAL_LIVESTATUS.RECENTLY_LIVE) goto _L6; else goto _L5
_L5:
        if (!isCallOutgoing) goto _L8; else goto _L7
_L7:
        ringOut();
_L10:
        checkConversationState();
        callControls.refreshCallControls();
        handler.sendEmptyMessage(3);
        updateAccessibilityState();
_L2:
        if (cameraPreview != null)
        {
            cameraPreview.onResume();
        }
        accessibility.a(true);
        return;
_L8:
        log.info((new StringBuilder("probably an outgoing call that finished too early ")).append(local_livestatus).toString());
        finish();
        return;
_L6:
        if (local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.RINGING_FOR_ME)
        {
            ringIn(participant);
        } else
        {
            log.info((new StringBuilder("unhandled conversation live status: ")).append(local_livestatus).toString());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        endCallWithMessage(getString(0x7f080370));
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("handler_finishing", isDisplayingCallDropped());
        bundle.putString("status_text_message", statusText.getText().toString());
        bundle.putBoolean("calloutgoing", isCallOutgoing);
        bundle.putBoolean("should_stop_ringing_locally", shouldStopRingingLocally);
        bundle.putBoolean("user_muted", userMuted);
        bundle.putBoolean("ringtone_muted", ringtoneMuted);
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        registerReceiver(networkStateReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    protected void onStop()
    {
        super.onStop();
        lib.stopMonitoringQuality(conversation.getIdentityProp(), true);
        unregisterReceiver(networkStateReceiver);
    }

    protected void onUserLeaveHint()
    {
        if (conversation.getLocalLiveStatusProp() != com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE)
        {
            endCall();
        }
    }

    public void sendDTMF(com.skype.Participant.DTMF dtmf)
    {
    }

    public void setAudioRoute(AudioRoute audioroute)
    {
        if (audioroute != null)
        {
            audioroute.a(audioManager, pcmHost);
        }
        state.a(audioroute);
    }

    public void setCameraFacing(CameraFacing camerafacing)
    {
    }

    public void setMicrophoneMuted(boolean flag)
    {
        if (flag)
        {
            conversation.muteMyMicrophone();
        } else
        {
            conversation.unmuteMyMicrophone();
        }
        userMuted = flag;
    }

    public void showChat()
    {
    }

    public void showDialpad(boolean flag)
    {
    }





}
