// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.animation.ObjectAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.support.v7.app.ActionBar;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.skype.Account;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.Message;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.Participant;
import com.skype.Setup;
import com.skype.SkyLib;
import com.skype.android.SkypeFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.ads.AdParent;
import com.skype.android.ads.AdPlacement;
import com.skype.android.ads.AdPlacer;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.ActionBarProvider;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.app2app.translator.OnUITranscribedMessage;
import com.skype.android.app.chat.AddParticipantsActivity;
import com.skype.android.app.dialer.DialKey;
import com.skype.android.app.dialer.DialpadButton;
import com.skype.android.app.dialer.DialpadView;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.vim.FilterRosterView;
import com.skype.android.app.vim.VideoEffect;
import com.skype.android.audio.AudioRoute;
import com.skype.android.calling.CallView;
import com.skype.android.calling.CallViewAdapter;
import com.skype.android.calling.CallViewElementFactory;
import com.skype.android.calling.CameraFacing;
import com.skype.android.calling.UnhandledGestureListener;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.res.Sounds;
import com.skype.android.res.Vibration;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ConversationViewState;
import com.skype.android.util.ImageCache;
import com.skype.android.util.PropertyAnimationUtil;
import com.skype.android.util.State;
import com.skype.android.util.ViewStateManager;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.async.UiCallback;
import com.skype.android.video.OnVideoDisplayChangedListener;
import com.skype.android.widget.PathClippedImageView;
import com.skype.android.widget.SkypeAvatarView;
import com.skype.android.widget.SymbolView;
import java.util.EnumSet;
import java.util.Iterator;

// Referenced classes of package com.skype.android.app.calling:
//            CallConstants, OnSetCameraFacingListener, d, CallVideoFacade, 
//            VideoFacade, CallFxType, a, CallControlsView, 
//            CallAgent, VideoMonitor, InCallMessagePopup, CallRosterFragment, 
//            OnAudioRouteChangedEvent

public class InCallFragment extends SkypeFragment
    implements SensorEventListener, android.view.View.OnClickListener, CallConstants, OnSetCameraFacingListener, d, CallViewAdapter, CallViewElementFactory, UnhandledGestureListener, OnVideoDisplayChangedListener, com.skype.android.video.ViewSnapper.ViewSnapperListener, com.skype.android.widget.MessagePopup.OnMessagePopupListener
{
    public static interface ActivityCallback
    {

        public abstract void callFragmentResumed(InCallFragment incallfragment);

        public abstract void cancelCallControlsTimeout(boolean flag);

        public abstract void endCall();

        public abstract void onAudioRouteChanged();

        public abstract void onConfirmedTap();

        public abstract void onVoiceStatusChanged();

        public abstract void setCallControlsVisible(boolean flag);

        public abstract void setSwipingAllowed(boolean flag);

        public abstract void showChat();

        public abstract void videoCountChanged(int i);
    }

    public class NetworkStateReceiver extends BroadcastReceiver
    {

        final InCallFragment this$0;

        public void onReceive(Context context, Intent intent)
        {
label0:
            {
                if (getActivity() != null && intent.getExtras() != null)
                {
                    context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
                    if (context == null || !context.isConnected())
                    {
                        break label0;
                    }
                    updateStatusLabel();
                }
                return;
            }
            setStatusLabel(getString(0x7f080377), 0x7f0f0135);
        }

        public NetworkStateReceiver()
        {
            this$0 = InCallFragment.this;
            super();
        }
    }


    private static final int BACKGROUND_IMAGE_ALPHA = 25;
    private static final int REQUEST_ADD_PARTICIPANTS = 0;
    private static final String TRANSCRIBED_MESSAGE_INITIAL_DEFAULT = "...";
    AccessibilityUtil accessibility;
    private State accessibilityMyVideoIsStarting;
    private State accessibilityTheirVideoIsStarting;
    Account account;
    ViewGroup adContainer;
    AdPlacer adPlacer;
    Analytics analytics;
    PropertyAnimationUtil animationUtil;
    AudioManager audioManager;
    ImageView avatarImage;
    CallAgent callAgent;
    CallControlsView callControls;
    private a callControlsPresenter;
    private View callRibbonText;
    private Contact contact;
    ContactUtil contactUtil;
    private Conversation conversation;
    private ConversationViewState conversationState;
    ConversationUtil conversationUtil;
    private VideoEffect currentEffect;
    DefaultAvatars defaultAvatars;
    ViewStub dialpadStub;
    private DialpadView dialpadView;
    EcsConfiguration ecsConfiguration;
    SymbolView filterButton;
    private final android.view.View.OnClickListener filterButtonClickListener = new android.view.View.OnClickListener() {

        final InCallFragment this$0;

        public final void onClick(View view)
        {
            if (filterRoster.isShown())
            {
                filterRoster.hide();
                return;
            } else
            {
                filterRoster.show(currentEffect, true);
                filterRoster.bringToFront();
                return;
            }
        }

            
            {
                this$0 = InCallFragment.this;
                super();
            }
    };
    FilterRosterView filterRoster;
    private final com.skype.android.app.vim.FilterRosterView.FilterRosterEventsListener filterSelectionListener = new com.skype.android.app.vim.FilterRosterView.FilterRosterEventsListener() {

        final InCallFragment this$0;

        public final void onFilterRosterVisibilityChanged(boolean flag)
        {
        }

        public final void onFilterSelected(VideoEffect videoeffect)
        {
            enableEffect(videoeffect);
        }

            
            {
                this$0 = InCallFragment.this;
                super();
            }
    };
    private boolean handleOnPause;
    ImageCache imageCache;
    private InCallMessagePopup incallPopup;
    ViewStub incallPopupStub;
    LayoutExperience layoutExpierence;
    SkyLib lib;
    ObjectIdMap map;
    private Participant me;
    Button mutedButton;
    Navigation navigation;
    private NetworkStateReceiver networkStateReceiver;
    ImageView onHoldOverlay;
    private boolean outgoingVideo;
    RelativeLayout parentLayout;
    private boolean popupShown;
    PowerManager powerManager;
    private Sensor proximitySensor;
    private long resumeTime;
    private boolean ringTranslated;
    private boolean screenOff;
    SensorManager sensorManager;
    private boolean showTechInfo;
    ImageView skypeLogo;
    Sounds sounds;
    private boolean startWithMyVideo;
    ViewStateManager stateManager;
    TextView statusLabel;
    TextView techInfo;
    TelephonyManager telephonyManager;
    private Participant them;
    ViewGroup transcribedMessagesContainer;
    private ObjectAnimator unmuteButtonAnimation;
    UserPreferences userPrefs;
    Vibration vibration;
    private VideoFacade videoFacade;
    FrameLayout videoFrameLayout;
    private CallView videoView;
    private boolean visibleOnScreen;

    public InCallFragment()
    {
        handleOnPause = true;
    }

    private void attachVideoFrame()
    {
        if (videoView.getParent() == null)
        {
            videoFrameLayout.addView(videoView);
        }
        updateVideoLayoutVisibility();
    }

    private void coordinateDialpadAndActionBar(boolean flag)
    {
        boolean flag1 = false;
        Resources resources = getResources();
        int i;
        if (resources.getConfiguration().orientation == 2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (flag)
        {
            android.view.ViewGroup.LayoutParams layoutparams = dialpadView.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)layoutparams;
            int j = getActionBarHeight();
            if (i != 0)
            {
                i = ((flag1) ? 1 : 0);
            } else
            {
                i = resources.getDimensionPixelSize(0x7f0c00c4);
            }
            marginlayoutparams.topMargin = i + j;
            dialpadView.setLayoutParams(layoutparams);
        }
    }

    private void createVideoLayer()
    {
        boolean flag;
        boolean flag1;
        if (conversation.getLiveCallTechnologyProp() == com.skype.Conversation.CALL_TECHNOLOGY.CALL_NGC)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = ConversationUtil.a(lib).contains(com.skype.SkyLib.NGC_CAPABILITIES.NGC_GROUP_CALLING_ENABLED);
        if (isDialogCall() || flag && flag1)
        {
            videoFacade = new CallVideoFacade(stateManager);
            videoView = new CallView(getActivity());
            videoView.setFactory(this);
            videoView.setAdapter(this);
            videoView.setUnhandledGestureListener(this);
            videoFacade.initialize(lib, conversation, videoView);
            videoFacade.setVideoDisplayChangedListener(this);
            videoFacade.setOnCameraFacingChangedListener(this);
            videoFacade.setOverlayDragListener(this);
            updateOptimalRemoteVideoCount();
        }
    }

    private void destroyVideoLayer()
    {
        if (videoFacade != null)
        {
            videoFacade.destroy();
            videoFacade = null;
        }
    }

    private void disableFilters()
    {
        enableEffect(VideoEffect.NORMAL);
        filterRoster.hide();
        filterButton.setVisibility(8);
    }

    private void enableEffect(VideoEffect videoeffect)
    {
        SkypeTelemetryEvent skypetelemetryevent = new SkypeTelemetryEvent(LogEvent.b);
        skypetelemetryevent.put(LogAttributeName.ab, videoeffect.name());
        skypetelemetryevent.put(LogAttributeName.ac, CallFxType.PLACEHOLDER);
        analytics.a(skypetelemetryevent);
        currentEffect = videoeffect;
        filterRoster.hide();
    }

    private void enableFilters()
    {
        filterRoster.setFilters(ecsConfiguration.getCallFilters().split(","));
        filterButton.setVisibility(0);
        filterButton.setOnClickListener(filterButtonClickListener);
        filterRoster.setOnFilterSelectionListener(filterSelectionListener);
    }

    private int getActionBarHeight()
    {
        return ((ActionBarProvider)getActivity()).getSupportActionBar().f();
    }

    private void handleAccessibilityForVideoChanges(String s, com.skype.Video.STATUS status)
    {
        int i;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (status == com.skype.Video.STATUS.STARTING)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = s.equals(account.getSkypenameProp());
        if (flag2 && accessibilityMyVideoIsStarting.a(Boolean.valueOf(flag1)))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!flag2 && accessibilityTheirVideoIsStarting.a(Boolean.valueOf(flag1)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i != 0)
        {
            if (flag1)
            {
                if (conversationState.e() == CameraFacing.a)
                {
                    Toast.makeText(getActivity(), 0x7f0800f2, 0).show();
                } else
                if (conversationState.e() == CameraFacing.b)
                {
                    Toast.makeText(getActivity(), 0x7f0800f1, 0).show();
                }
            } else
            {
                Toast.makeText(getActivity(), 0x7f0800f3, 0).show();
            }
        }
        if (flag)
        {
            if (flag1)
            {
                i = 0x7f0800f0;
            } else
            {
                i = 0x7f0800ef;
            }
            Toast.makeText(getActivity(), i, 0).show();
        }
        setActivityTitle();
    }

    private void handleConfigChangeForTranscribedMessage(Configuration configuration)
    {
    }

    private void handleVideoOrientationChange(Configuration configuration)
    {
        if (videoFacade != null)
        {
            if (configuration.orientation == 2)
            {
                adPlacer.b(AdPlacement.d, adContainer);
                analytics.c(AnalyticsEvent.x);
            } else
            if (configuration.orientation == 1 && !videoFacade.isVideoDisplayed())
            {
                adPlacer.a(AdPlacement.d, adContainer);
                return;
            }
        }
    }

    private void initDialpad()
    {
        if (dialpadView == null && dialpadStub != null)
        {
            dialpadView = (DialpadView)dialpadStub.inflate();
            dialpadView.setKeyListeners(this);
        }
    }

    private boolean isEffectPickerEnabled()
    {
        return ecsConfiguration.isCallEffectsEnabled();
    }

    private boolean isTranscribedMessageForThisCall(OnUITranscribedMessage onuitranscribedmessage)
    {
        if (onuitranscribedmessage.getConversationId() == conversation.getObjectID())
        {
            return true;
        }
        if (isDialogCall())
        {
            return TextUtils.equals(conversation.getIdentityProp(), onuitranscribedmessage.getPartnerId());
        } else
        {
            return false;
        }
    }

    private boolean isVideoRunning(com.skype.Video.STATUS status)
    {
        return status == com.skype.Video.STATUS.STARTING || status == com.skype.Video.STATUS.CHECKING_SUBSCRIPTION || status == com.skype.Video.STATUS.PAUSED || status == com.skype.Video.STATUS.RUNNING || status == com.skype.Video.STATUS.STOPPING || status == com.skype.Video.STATUS.SWITCHING_DEVICE;
    }

    private void onMessagePopupVisibilityChanged(boolean flag)
    {
        boolean flag3 = true;
        boolean flag2;
        if (videoFacade != null)
        {
            Object obj = videoFacade;
            ImageView imageview;
            if (!flag)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            ((VideoFacade) (obj)).setOverlayVisible(flag2);
        }
        if (!isDialpadShowing())
        {
            boolean flag1;
            if (videoFacade != null && videoFacade.isVideoDisplayed() && !isCallOnHold())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj = animationUtil;
            imageview = avatarImage;
            if (!flag && !flag1)
            {
                flag2 = flag3;
            } else
            {
                flag2 = false;
            }
            ((PropertyAnimationUtil) (obj)).a(imageview, flag2);
        }
        if (!flag)
        {
            popupShown = false;
        }
    }

    private void removeVideoFrame()
    {
        if (videoView != null && videoFrameLayout != null)
        {
            videoFrameLayout.removeView(videoView);
            videoView = null;
        }
    }

    private void setActivityTitle()
    {
        if (accessibility.a())
        {
            FragmentActivity fragmentactivity = getActivity();
            int i;
            if (isAudioCall())
            {
                i = 0x7f080066;
            } else
            {
                i = 0x7f0800f4;
            }
            fragmentactivity.setTitle(getString(i, new Object[] {
                conversationUtil.m(conversation)
            }));
        }
    }

    private void setupCallControls()
    {
        callControlsPresenter = new a(this, videoFacade, layoutExpierence);
        callControls.setSettings(this);
        if (accessibility.a())
        {
            callControls.enableFingerScanningMode();
        }
    }

    private void setupTranslatorTranscribedMessageViews()
    {
        if (transcribedMessagesContainer.getVisibility() != 0)
        {
            transcribedMessagesContainer.setVisibility(0);
            SkypeAvatarView skypeavatarview = (SkypeAvatarView)transcribedMessagesContainer.findViewById(0x7f10039b);
            skypeavatarview.setImageDrawable(contactUtil.a(defaultAvatars.a(com.skype.android.res.DefaultAvatars.AvatarType.c, com.skype.android.res.DefaultAvatars.AvatarSize.c, account.getDisplaynameProp())));
            skypeavatarview.a().setClipCircleEnabled(true);
            imageCache.a(account, skypeavatarview, new UiCallback(this, new AsyncCallback() {

                final InCallFragment this$0;

                public final void done(AsyncResult asyncresult)
                {
                    Bitmap bitmap = (Bitmap)asyncresult.a();
                    asyncresult = (SkypeAvatarView)asyncresult.b();
                    if (bitmap != null)
                    {
                        asyncresult.setImageBitmap(bitmap);
                    }
                }

            
            {
                this$0 = InCallFragment.this;
                super();
            }
            }));
            skypeavatarview = (SkypeAvatarView)transcribedMessagesContainer.findViewById(0x7f100399);
            skypeavatarview.setImageDrawable(contactUtil.a(defaultAvatars.a(com.skype.android.res.DefaultAvatars.AvatarType.c, com.skype.android.res.DefaultAvatars.AvatarSize.c, contact.getDisplaynameProp())));
            skypeavatarview.a().setClipCircleEnabled(true);
            imageCache.a(contact, skypeavatarview, new UiCallback(this, new AsyncCallback() {

                final InCallFragment this$0;

                public final void done(AsyncResult asyncresult)
                {
                    Bitmap bitmap = (Bitmap)asyncresult.a();
                    asyncresult = (SkypeAvatarView)asyncresult.b();
                    if (bitmap != null)
                    {
                        asyncresult.setImageBitmap(bitmap);
                    }
                }

            
            {
                this$0 = InCallFragment.this;
                super();
            }
            }));
            ((TextView)transcribedMessagesContainer.findViewById(0x7f10039c)).setText("...");
            ((TextView)transcribedMessagesContainer.findViewById(0x7f10039a)).setText("...");
            handleConfigChangeForTranscribedMessage(getResources().getConfiguration());
        }
    }

    private void startProximitySensorEventListener()
    {
        if (callAgent.shouldUseProximity() && sensorManager != null && proximitySensor != null)
        {
            sensorManager.registerListener(this, proximitySensor, 2);
        }
    }

    private void startVideoMonitor()
    {
        if (videoFacade != null && conversationUtil.x(conversation))
        {
            CameraFacing camerafacing = conversationState.e();
            boolean flag;
            boolean flag1;
            boolean flag2;
            boolean flag3;
            if (camerafacing != null && camerafacing != CameraFacing.c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = videoFacade.isVideoDisplayed();
            videoFacade.stop();
            flag2 = powerManager.isScreenOn();
            flag3 = ConversationUtil.s(conversation);
            if (flag2 && (flag || flag1) && userPrefs.isVideoMonitorEnabled() && !flag3)
            {
                removeVideoFrame();
                destroyVideoLayer();
                if (!ConversationUtil.s(conversation))
                {
                    VideoMonitor.close(getActivity());
                    Intent intent = VideoMonitor.getShowIntent(getActivity(), com/skype/android/app/calling/VideoMonitor, 0);
                    intent.putExtra("extraMyCamera", camerafacing);
                    intent.putExtra("com.skype.objId", conversation.getObjectID());
                    getActivity().startService(intent);
                    conversationState.c(true);
                }
            }
        }
    }

    private void stopProximitySensorEventListener()
    {
        if (callAgent.shouldUseProximity() && sensorManager != null)
        {
            sensorManager.unregisterListener(this);
        }
    }

    private void stopVideoMonitor()
    {
        VideoMonitor.close(getActivity());
        conversationState.c(false);
    }

    private void unholdCall()
    {
        if (telephonyManager.getCallState() == 0)
        {
            conversation.resumeMyLiveSession();
            return;
        } else
        {
            Toast toast = Toast.makeText(getActivity(), 0x7f08038a, 0);
            toast.setGravity(17, 0, 0);
            toast.show();
            return;
        }
    }

    private void updateAvatarImage()
    {
        UiCallback uicallback = new UiCallback(this, new AsyncCallback() {

            final InCallFragment this$0;

            public final void done(AsyncResult asyncresult)
            {
                ImageView imageview = (ImageView)asyncresult.b();
                asyncresult = (Bitmap)asyncresult.a();
                if (asyncresult != null)
                {
                    imageview.setImageBitmap(asyncresult);
                    return;
                }
                if (isDialogCall())
                {
                    imageview.setImageDrawable(contactUtil.c(contact));
                    return;
                } else
                {
                    imageview.setImageDrawable(defaultAvatars.a(com.skype.android.res.DefaultAvatars.AvatarType.d, com.skype.android.res.DefaultAvatars.AvatarSize.c, conversation.getIdentityProp()));
                    return;
                }
            }

            
            {
                this$0 = InCallFragment.this;
                super();
            }
        });
        if (isDialogCall())
        {
            imageCache.b(contact, avatarImage, uicallback);
            return;
        } else
        {
            imageCache.a(conversation, avatarImage, uicallback);
            return;
        }
    }

    private void updateMicStatus()
    {
        setMicrophoneMuted(isMicrophoneMuted());
    }

    private void updateOnHoldOverlayVisibility()
    {
        boolean flag = ConversationUtil.s(conversation);
        ImageView imageview = onHoldOverlay;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
        onHoldOverlay.setFocusable(flag);
        if (flag)
        {
            com.skype.Conversation.LOCAL_LIVESTATUS local_livestatus = conversation.getLocalLiveStatusProp();
            ImageView imageview1 = onHoldOverlay;
            if (local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_REMOTELY)
            {
                i = 0x7f0800e3;
            } else
            {
                i = 0x7f0800e2;
            }
            imageview1.setContentDescription(getString(i, new Object[] {
                conversationUtil.m(conversation)
            }));
            AccessibilityUtil.a(new View[] {
                statusLabel
            });
            avatarImage.setVisibility(0);
        }
    }

    private void updateOptimalRemoteVideoCount()
    {
        if (videoView == null) goto _L2; else goto _L1
_L1:
        int i;
        if (isDialogCall())
        {
            i = 1;
        } else
        {
            i = conversation.getOptimalRemoteVideosInConferenceProp();
        }
        if (i != 0) goto _L4; else goto _L3
_L3:
        videoView.setMaxVideosOnStage(i);
        videoView.setShowVideoOnRibbon(false);
_L6:
        videoView.requestLayout();
_L2:
        return;
_L4:
        if (i == 1)
        {
            videoView.setMaxVideosOnStage(i);
            videoView.setShowVideoOnRibbon(true);
        } else
        if (i > 1)
        {
            int j = lib.getSetup().getInt("*Lib/Call/MaxNrOfVideosVisibleInUI");
            videoView.setMaxVideosOnStage(Math.min(j - 1, i - 1));
            videoView.setShowVideoOnRibbon(true);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void updateParticipantTileViewStatus(Participant participant, View view)
    {
        TextView textview = (TextView)view.findViewById(0x7f10023e);
        view = (SymbolView)view.findViewById(0x7f10023d);
        Object obj = conversationUtil.b(participant);
        obj = contactUtil.l(((Contact) (obj)));
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$Message$TYPE[];
            static final int $SwitchMap$com$skype$PROPKEY[];
            static final int $SwitchMap$com$skype$Participant$VOICE_STATUS[];

            static 
            {
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_OPTIMAL_REMOTE_VIDEOS_IN_CONFERENCE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                $SwitchMap$com$skype$Participant$VOICE_STATUS = new int[com.skype.Participant.VOICE_STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Participant$VOICE_STATUS[com.skype.Participant.VOICE_STATUS.EARLY_MEDIA.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$Participant$VOICE_STATUS[com.skype.Participant.VOICE_STATUS.VOICE_STOPPED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$Participant$VOICE_STATUS[com.skype.Participant.VOICE_STATUS.VOICE_UNKNOWN.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$Participant$VOICE_STATUS[com.skype.Participant.VOICE_STATUS.VOICE_CONNECTING.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                $SwitchMap$com$skype$Message$TYPE = new int[com.skype.Message.TYPE.values().length];
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_FLIK_MESSAGE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_TEXT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_SMS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_FILES.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2..SwitchMap.com.skype.Participant.VOICE_STATUS[participant.getVoiceStatusProp().ordinal()])
        {
        default:
            textview.setVisibility(4);
            view.setVisibility(4);
            return;

        case 2: // '\002'
        case 3: // '\003'
            textview.setText(getString(0x7f0801ae, new Object[] {
                obj
            }));
            textview.setVisibility(0);
            view.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.v);
            view.setVisibility(0);
            return;

        case 4: // '\004'
            textview.setText(getString(0x7f0801ad, new Object[] {
                obj
            }));
            break;
        }
        textview.setVisibility(0);
        view.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.I);
        view.setVisibility(0);
    }

    private void updateStatusLabel()
    {
        com.skype.Conversation.LOCAL_LIVESTATUS local_livestatus = conversation.getLocalLiveStatusProp();
        if (local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_REMOTELY)
        {
            setStatusLabel(getString(0x7f08046f), 0x7f0f00d3);
        } else
        {
            if (local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_LOCALLY)
            {
                setStatusLabel(getString(0x7f080440), 0x7f0f00d3);
                return;
            }
            if (local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE)
            {
                setStatusLabel("", 0x7f0f0135);
                return;
            }
            if (local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.NONE || local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.RECENTLY_LIVE)
            {
                setStatusLabel(getString(0x7f08029c), 0x7f0f0135);
                return;
            }
        }
    }

    private void updateVideoLayoutVisibility()
    {
        byte byte1 = 4;
        byte byte0 = byte1;
        if (videoFacade != null)
        {
            byte0 = byte1;
            if (videoFacade.isVideoDisplayed())
            {
                byte0 = byte1;
                if (!isCallOnHold())
                {
                    byte0 = 0;
                }
            }
        }
        videoFrameLayout.setVisibility(byte0);
    }

    public void addParticipantsToCall()
    {
        Intent intent = navigation.intentFor(conversation, com/skype/android/app/chat/AddParticipantsActivity);
        intent.putExtra("showMsgArea", false);
        intent.putExtra("addToCall", true);
        startActivityForResult(intent, 0);
    }

    public void bindTileView(View view, Participant participant)
    {
        final Contact contact = conversationUtil.b(participant);
        View view1 = view.findViewById(0x7f10023c);
        UiCallback uicallback = new UiCallback(this, new AsyncCallback() {

            final InCallFragment this$0;
            final Contact val$contact;

            public final void done(AsyncResult asyncresult)
            {
                View view2;
                view2 = (View)asyncresult.b();
                asyncresult = (Bitmap)asyncresult.a();
                if (asyncresult == null) goto _L2; else goto _L1
_L1:
                if (!(view2 instanceof ImageView)) goto _L4; else goto _L3
_L3:
                ((ImageView)view2).setImageBitmap(asyncresult);
_L6:
                return;
_L4:
                if (view2 instanceof RelativeLayout)
                {
                    asyncresult = new BitmapDrawable(asyncresult);
                    if (android.os.Build.VERSION.SDK_INT >= 16)
                    {
                        view2.setBackground(asyncresult);
                    } else
                    {
                        view2.setBackgroundDrawable(asyncresult);
                    }
                    view2.getBackground().setAlpha(25);
                    return;
                }
                continue; /* Loop/switch isn't completed */
_L2:
                if (view2 instanceof ImageView)
                {
                    ((ImageView)view2).setImageDrawable(contactUtil.a(contact, com.skype.android.res.DefaultAvatars.AvatarSize.b));
                    return;
                }
                if (view2 instanceof RelativeLayout)
                {
                    defaultAvatars.a(view2, account.getSkypenameProp());
                    view2.getBackground().setAlpha(25);
                    return;
                }
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                this$0 = InCallFragment.this;
                contact = contact1;
                super();
            }
        });
        imageCache.a(contact, view1, uicallback);
        updateParticipantTileViewStatus(participant, view);
    }

    public void callEnded()
    {
        removeVideoFrame();
        destroyVideoLayer();
        avatarImage.setVisibility(0);
    }

    public boolean canAddParticipants()
    {
        return conversation.getLiveCallTechnologyProp() == com.skype.Conversation.CALL_TECHNOLOGY.CALL_NGC && ConversationUtil.g(conversation);
    }

    public void cancelCallControlsAnimation()
    {
        callControlsPresenter.cancelAnimation();
    }

    public void clearPendingMessages()
    {
        if (incallPopup != null)
        {
            incallPopup.clearQueue();
        }
    }

    public View createCameraSwitchView()
    {
        SymbolView symbolview = new SymbolView(getContext());
        symbolview.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.ba);
        symbolview.setTextSize(2, getResources().getDimension(0x7f0c008c));
        symbolview.setTextColor(getResources().getColor(0x7f0f0135));
        symbolview.a();
        return symbolview;
    }

    public View createParticipantDisplayName(Participant participant)
    {
        View view = getActivity().getLayoutInflater().inflate(0x7f0300ca, (ViewGroup)getView(), false);
        TextView textview = (TextView)view.findViewById(0x7f100487);
        participant = conversationUtil.b(participant);
        textview.setText(contactUtil.l(participant));
        return view;
    }

    public View createParticipantPlusView()
    {
        callRibbonText = getActivity().getLayoutInflater().inflate(0x7f030033, (ViewGroup)getView(), false);
        callRibbonText.setOnClickListener(this);
        return callRibbonText;
    }

    public View createParticipantTileView()
    {
        return getActivity().getLayoutInflater().inflate(0x7f030032, (ViewGroup)getView(), false);
    }

    public View createTileView()
    {
        return getActivity().getLayoutInflater().inflate(0x7f030027, (ViewGroup)getView(), false);
    }

    public void endCall()
    {
        getActivityCallback().endCall();
    }

    protected ActivityCallback getActivityCallback()
    {
        if (getActivity() instanceof ActivityCallback)
        {
            return (ActivityCallback)getActivity();
        } else
        {
            return null;
        }
    }

    public AudioRoute getAudioRoute()
    {
        return conversationState.f();
    }

    public CameraFacing getCameraFacing()
    {
        return conversationState.e();
    }

    public EnumSet getPossibleCameraFacing()
    {
        EnumSet enumset = EnumSet.noneOf(com/skype/android/calling/CameraFacing);
        boolean flag;
        boolean flag1;
        if (ConversationUtil.u(conversation) || ConversationUtil.v(conversation) || ConversationUtil.t(conversation))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = conversationUtil.i(conversation);
        if (!isSkypeOutCall() && flag && flag1 && videoFacade != null)
        {
            enumset.addAll(videoFacade.getPossibleCameraFacing());
        }
        return enumset;
    }

    public boolean hasUnconsumedMessages()
    {
        return ConversationUtil.p(conversation);
    }

    void hideRoster()
    {
        if (isRosterShowing())
        {
            getFragmentManager().c();
        }
    }

    public void hideUnmuteButton()
    {
        if (unmuteButtonAnimation != null)
        {
            unmuteButtonAnimation.cancel();
            unmuteButtonAnimation.removeAllListeners();
        }
        if (isMicrophoneMuted())
        {
            unmuteButtonAnimation = animationUtil.a(mutedButton, 4);
        }
        mutedButton.bringToFront();
    }

    public boolean isAudioCall()
    {
        return videoFacade == null || !videoFacade.isVideoDisplayed();
    }

    public boolean isCallOnHold()
    {
        return ConversationUtil.s(conversation);
    }

    public boolean isDialogCall()
    {
        return conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG;
    }

    public boolean isDialpadShowing()
    {
        return dialpadView != null && dialpadView.getVisibility() == 0;
    }

    public boolean isMicrophoneMuted()
    {
        return conversation.getLiveIsMutedProp();
    }

    public boolean isPreCall()
    {
        return false;
    }

    boolean isRosterShowing()
    {
        return getFragmentManager().a(0x7f1003a5) != null;
    }

    boolean isSingleVideoFocused()
    {
        return !isDialogCall() && videoView != null && videoView.d();
    }

    public boolean isSkypeOutCall()
    {
        boolean flag = false;
        if (them != null)
        {
            com.skype.SkyLib.IDENTITYTYPE identitytype = lib.getIdentityType(them.getLiveIdentityProp());
            boolean flag1 = ContactUtil.a(identitytype);
            flag = flag1;
            if (!flag1)
            {
                flag = flag1;
                if (identitytype == com.skype.SkyLib.IDENTITYTYPE.SKYPE)
                {
                    String s = them.getLiveFwdIdentitiesProp();
                    flag = flag1;
                    if (s != null)
                    {
                        flag = flag1;
                        if (!s.isEmpty())
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    boolean onAcceptEvent(com.skype.android.gen.ParticipantListener.OnPropertyChange onpropertychange)
    {
        return ((Participant)onpropertychange.getSender()).getConvoIdProp() == conversation.getDbID() && (onpropertychange.getPropKey() == PROPKEY.PARTICIPANT_VOICE_STATUS || onpropertychange.getPropKey() == PROPKEY.PARTICIPANT_DEBUGINFO);
    }

    public void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public boolean onBackWasPressed()
    {
        if (isDialpadShowing())
        {
            callControls.showDialpad(false);
            return true;
        } else
        {
            return filterRoster.onInterceptBackButton();
        }
    }

    public void onClick(View view)
    {
        if (view instanceof DialpadButton)
        {
            sendDTMF(((DialpadButton)view).getDialKey().getDtmf());
        } else
        if (view.getId() == 0x7f10025d)
        {
            showRoster();
            return;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        callControls.initView();
        callControls.setSettings(this);
        if (isDialpadShowing())
        {
            coordinateDialpadAndActionBar(isDialpadShowing());
        }
        callControls.requestLayout();
        if (dialpadView != null)
        {
            dialpadView.whenConfigurationChanges();
        }
        handleVideoOrientationChange(configuration);
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)avatarImage.getLayoutParams();
        layoutparams.height = getResources().getDimensionPixelSize(0x7f0c0008);
        layoutparams.width = layoutparams.height;
        ((android.widget.RelativeLayout.LayoutParams)((View)avatarImage.getParent()).getLayoutParams()).topMargin = getResources().getDimensionPixelSize(0x7f0c0002);
        handleConfigChangeForTranscribedMessage(configuration);
    }

    public void onControlsClicked(boolean flag)
    {
        ActivityCallback activitycallback = getActivityCallback();
        if (flag && !isAudioCall())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        activitycallback.cancelCallControlsTimeout(flag);
    }

    public void onCreate(Bundle bundle)
    {
label0:
        {
            super.onCreate(bundle);
            getComponent().inject(this);
            conversation = (Conversation)getObjectInterface(com/skype/Conversation);
            setRetainInstance(true);
            proximitySensor = sensorManager.getDefaultSensor(8);
            conversationState = (ConversationViewState)stateManager.a(conversation, com/skype/android/util/ConversationViewState);
            me = conversationUtil.o(conversation);
            if (isDialogCall())
            {
                contact = conversationUtil.r(conversation);
                them = conversationUtil.a(conversation, conversation.getIdentityProp());
            }
            startWithMyVideo = getArguments().getBoolean("extraVideo", false);
            ringTranslated = getArguments().getBoolean("ringTranslated", false);
            outgoingVideo = startWithMyVideo;
            Object obj = getAudioRoute();
            if (obj != null)
            {
                bundle = ((Bundle) (obj));
                if (((AudioRoute) (obj)).c(audioManager).booleanValue())
                {
                    break label0;
                }
            }
            obj = audioManager;
            if (startWithMyVideo)
            {
                bundle = AudioRoute.c;
            } else
            {
                bundle = null;
            }
            bundle = AudioRoute.a(((AudioManager) (obj)), bundle);
        }
        setAudioRoute(bundle);
        networkStateReceiver = new NetworkStateReceiver();
        accessibilityMyVideoIsStarting = new State();
        accessibilityMyVideoIsStarting.a(Boolean.valueOf(false));
        accessibilityTheirVideoIsStarting = new State();
        accessibilityTheirVideoIsStarting.a(Boolean.valueOf(false));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030095, viewgroup, false);
    }

    public void onDestroyView()
    {
        if (incallPopup != null)
        {
            incallPopup.setListener(null);
        }
        if (callControls != null && callControlsPresenter != null)
        {
            callControlsPresenter.cancelAnimation();
        }
        removeVideoFrame();
        destroyVideoLayer();
        super.onDestroyView();
    }

    public void onDisplayedVideoCountChanged(int i)
    {
        refreshCallControls();
        boolean flag;
        if (i > 0 && !isCallOnHold())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        avatarImage.setVisibility(4);
_L4:
        if (videoFrameLayout != null)
        {
            updateVideoLayoutVisibility();
        }
        getActivityCallback().videoCountChanged(i);
        return;
_L2:
        if (!isDialpadShowing())
        {
            avatarImage.setVisibility(0);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onDragStarted()
    {
        getActivityCallback().setSwipingAllowed(false);
    }

    public void onDragStopped()
    {
        getActivityCallback().setSwipingAllowed(true);
    }

    public void onDragUpdated()
    {
        callControlsPresenter.animateOverlayWithCallControls();
    }

    public void onEvent(OnUITranscribedMessage onuitranscribedmessage)
    {
        if (isTranscribedMessageForThisCall(onuitranscribedmessage))
        {
            setupTranslatorTranscribedMessageViews();
            if (!TextUtils.isEmpty(onuitranscribedmessage.getOriginalForMe()))
            {
                ((TextView)transcribedMessagesContainer.findViewById(0x7f10039c)).setText(onuitranscribedmessage.getOriginalForMe());
            }
            if (!TextUtils.isEmpty(onuitranscribedmessage.getTranslationForMe()))
            {
                ((TextView)transcribedMessagesContainer.findViewById(0x7f10039a)).setText(onuitranscribedmessage.getTranslationForMe());
            }
        }
    }

    public void onEvent(OnAudioRouteChangedEvent onaudioroutechangedevent)
    {
        getActivityCallback().onAudioRouteChanged();
    }

    void onEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        if (onpropertychange.getSender().getObjectID() == conversation.getObjectID())
        {
            updateOnHoldOverlayVisibility();
            updateVideoLayoutVisibility();
            updateStatusLabel();
            updateMicStatus();
        }
        switch (_cls2..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            updateOptimalRemoteVideoCount();
            break;
        }
    }

    void onEvent(com.skype.android.gen.ParticipantListener.OnPropertyChange onpropertychange)
    {
        Participant participant;
        participant = (Participant)onpropertychange.getSender();
        onpropertychange = onpropertychange.getPropKey();
        if (onpropertychange != PROPKEY.PARTICIPANT_VOICE_STATUS) goto _L2; else goto _L1
_L1:
        _cls2..SwitchMap.com.skype.Participant.VOICE_STATUS[participant.getVoiceStatusProp().ordinal()];
        JVM INSTR tableswitch 1 1: default 52
    //                   1 84;
           goto _L3 _L4
_L3:
        if (participant.getObjectID() == me.getObjectID())
        {
            refreshCallControls();
            getActivityCallback().onVoiceStatusChanged();
        }
_L6:
        return;
_L4:
        if (isDialogCall())
        {
            sounds.c();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (onpropertychange != PROPKEY.PARTICIPANT_DEBUGINFO) goto _L6; else goto _L5
_L5:
        if (showTechInfo)
        {
            techInfo.setVisibility(0);
            techInfo.setText(participant.getDebuginfoProp());
            techInfo.bringToFront();
            return;
        }
        techInfo.setVisibility(8);
        return;
        if (true) goto _L3; else goto _L7
_L7:
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnMessage onmessage)
    {
        if (conversation.getObjectID() == onmessage.getConversationObjectID())
        {
            for (onmessage = (Message)map.a(onmessage.getMessageObjectID(), com/skype/Message); (long)onmessage.getTimestampProp() < resumeTime || onmessage.getAuthorProp().equalsIgnoreCase(account.getSkypenameProp()) || !visibleOnScreen;)
            {
                return;
            }

            com.skype.Message.TYPE type = onmessage.getTypeProp();
            switch (_cls2..SwitchMap.com.skype.Message.TYPE[type.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                break;
            }
            if (incallPopup == null)
            {
                incallPopup = (InCallMessagePopup)incallPopupStub.inflate();
                incallPopup.setOnClickListener(new android.view.View.OnClickListener() {

                    final InCallFragment this$0;

                    public final void onClick(View view)
                    {
                        showChat();
                    }

            
            {
                this$0 = InCallFragment.this;
                super();
            }
                });
                incallPopup.setListener(this);
                incallPopup.setVisibility(0);
            }
            incallPopup.addMessage(onmessage);
            popupShown = true;
            incallPopup.bringToFront();
            if (screenOff)
            {
                vibration.b();
            }
        }
        refreshCallControls();
    }

    public void onFocusModeChanged()
    {
        getActivity().supportInvalidateOptionsMenu();
    }

    public void onMessagePopupDismiss()
    {
        onMessagePopupVisibilityChanged(false);
    }

    public void onMessagePopupShown()
    {
        onMessagePopupVisibilityChanged(true);
    }

    public void onMinimizedParticipantCountChanged(int i)
    {
        if (videoView != null)
        {
            TextView textview = (TextView)callRibbonText.findViewById(0x7f10025d);
            if (isDialogCall() || i == 0)
            {
                textview.setVisibility(4);
            } else
            if (i > 0)
            {
                textview.setVisibility(0);
                textview.setText(String.format("%+d", new Object[] {
                    Integer.valueOf(i)
                }));
                return;
            }
        }
    }

    public void onOverlayLayoutChanged(int i, int j)
    {
    }

    public void onParticipantTileViewStatusChanged(Participant participant, View view)
    {
        updateParticipantTileViewStatus(participant, view);
    }

    public void onPause()
    {
        stopProximitySensorEventListener();
        getActivity().unregisterReceiver(networkStateReceiver);
        if (!handleOnPause)
        {
            super.onPause();
            handleOnPause = true;
            return;
        } else
        {
            adPlacer.b(AdParent.b);
            setVisibleOnScreen(false);
            super.onPause();
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        startProximitySensorEventListener();
        Object obj = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        getActivity().registerReceiver(networkStateReceiver, ((IntentFilter) (obj)));
        if (conversation.getLocalLiveStatusProp() == com.skype.Conversation.LOCAL_LIVESTATUS.NONE)
        {
            handleOnPause = false;
            return;
        }
        CameraFacing camerafacing = conversationState.e();
        conversationState.a(true);
        obj = camerafacing;
        if (camerafacing == null)
        {
            if (!startWithMyVideo)
            {
                obj = CameraFacing.c;
            } else
            {
                obj = getPossibleCameraFacing().iterator();
                if (((Iterator) (obj)).hasNext())
                {
                    obj = (CameraFacing)((Iterator) (obj)).next();
                } else
                {
                    obj = null;
                }
            }
        }
        if (videoFacade == null)
        {
            createVideoLayer();
        }
        setupCallControls();
        if (conversationState.j())
        {
            stopVideoMonitor();
        }
        conversationState.a(((CameraFacing) (obj)));
        if (videoFacade != null)
        {
            videoFacade.setCameraFacing(((CameraFacing) (obj)));
            videoFacade.start();
            attachVideoFrame();
        }
        setAudioRoute(getAudioRoute());
        showTechInfo = userPrefs.isCallTechInfoEnabled();
        setActivityTitle();
        adPlacer.a(AdParent.b);
        updateOnHoldOverlayVisibility();
        updateStatusLabel();
        getActivityCallback().callFragmentResumed(this);
        handleVideoOrientationChange(getResources().getConfiguration());
        setVisibleOnScreen(true);
        resumeTime = System.currentTimeMillis() / 1000L;
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        boolean flag = false;
        if (sensorevent.sensor.getType() == 8)
        {
            float f = proximitySensor.getMaximumRange();
            if (sensorevent.values[0] != f)
            {
                flag = true;
            }
            screenOff = flag;
        }
    }

    public void onSetCameraFacing(CameraFacing camerafacing)
    {
        conversationState.a(camerafacing);
    }

    public void onStop()
    {
        super.onStop();
        startVideoMonitor();
    }

    public void onUnhandledGesture()
    {
        getActivityCallback().onConfirmedTap();
    }

    public void onVideoDisplayChanged(String s, com.skype.Video.STATUS status)
    {
        if (s.equals(account.getSkypenameProp()))
        {
            outgoingVideo = isVideoRunning(status);
            AudioRoute audioroute = getAudioRoute();
            if (outgoingVideo && audioroute != null && audioroute.b().booleanValue())
            {
                setAudioRoute(AudioRoute.c);
            }
        }
        if (accessibility.a() && !userPrefs.isVideoMonitorEnabled())
        {
            handleAccessibilityForVideoChanges(s, status);
        }
        handleConfigChangeForTranscribedMessage(getResources().getConfiguration());
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ViewUtil.a(view);
        currentEffect = VideoEffect.NORMAL;
        if (isEffectPickerEnabled())
        {
            enableFilters();
        } else
        {
            disableFilters();
        }
        createVideoLayer();
        updateAvatarImage();
        if (getResources().getConfiguration().orientation == 1)
        {
            adPlacer.a(AdPlacement.d, adContainer);
        }
        if (getArguments().containsKey("userMuted"))
        {
            if (getArguments().getBoolean("userMuted", false))
            {
                setMicrophoneMuted(true);
            }
            getArguments().remove("userMuted");
        }
        mutedButton.setOnClickListener(new android.view.View.OnClickListener() {

            final InCallFragment this$0;

            public final void onClick(View view1)
            {
                boolean flag = isMicrophoneMuted();
                view1 = InCallFragment.this;
                if (!flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view1.setMicrophoneMuted(flag);
                refreshCallControls();
                animationUtil.d(mutedButton);
            }

            
            {
                this$0 = InCallFragment.this;
                super();
            }
        });
        onHoldOverlay.setClickable(true);
        view = new android.view.View.OnClickListener() {

            final InCallFragment this$0;

            public final void onClick(View view1)
            {
                if (conversation.getLocalLiveStatusProp() == com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_LOCALLY)
                {
                    unholdCall();
                }
            }

            
            {
                this$0 = InCallFragment.this;
                super();
            }
        };
        onHoldOverlay.setOnClickListener(view);
        statusLabel.setOnClickListener(view);
        if (ringTranslated)
        {
            setupTranslatorTranscribedMessageViews();
        }
    }

    public void refreshCallControls()
    {
        if (callControls != null)
        {
            callControls.refreshCallControls();
        }
    }

    void removeSingleVideoFocus()
    {
        if (videoView != null)
        {
            videoView.e();
        }
    }

    public void sendDTMF(com.skype.Participant.DTMF dtmf)
    {
        conversation.sendDTMF(dtmf, 200);
    }

    public void setAudioRoute(AudioRoute audioroute)
    {
label0:
        {
            callAgent.setAudioRoute(conversation, audioroute);
            if (callAgent.shouldUseProximity())
            {
                if (audioroute != AudioRoute.a)
                {
                    break label0;
                }
                startProximitySensorEventListener();
            }
            return;
        }
        stopProximitySensorEventListener();
    }

    public void setCameraFacing(CameraFacing camerafacing)
    {
        if (videoFacade != null)
        {
            videoFacade.setCameraFacing(camerafacing);
        }
    }

    public void setMicrophoneMuted(boolean flag)
    {
        if (flag)
        {
            conversation.muteMyMicrophone();
            return;
        } else
        {
            conversation.unmuteMyMicrophone();
            return;
        }
    }

    public void setStatusLabel(String s, int i)
    {
        boolean flag = false;
        TextView textview = statusLabel;
        byte byte0;
        if (TextUtils.isEmpty(s))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
        statusLabel.setText(s);
        statusLabel.setTextColor(getResources().getColor(i));
        textview = statusLabel;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        }
        textview.setFocusable(flag);
    }

    public void setVisibleOnScreen(boolean flag)
    {
        visibleOnScreen = flag;
        if (!flag && incallPopup != null)
        {
            incallPopup.dismiss();
        }
    }

    public void showChat()
    {
        getActivityCallback().showChat();
    }

    public boolean showControls(boolean flag, android.animation.Animator.AnimatorListener animatorlistener)
    {
        cancelCallControlsAnimation();
        if (!popupShown && callControlsPresenter != null)
        {
            refreshCallControls();
            if (flag || callControls.canHideControls())
            {
                callControlsPresenter.showControls(flag, animatorlistener);
                if (videoFacade != null)
                {
                    videoFacade.showControls(flag);
                }
                return true;
            }
        }
        return false;
    }

    public void showDialpad(boolean flag)
    {
        int i;
        if (flag)
        {
            initDialpad();
            i = 0;
        } else
        {
            i = 8;
        }
        if (dialpadView != null)
        {
            dialpadView.setVisibility(i);
            coordinateDialpadAndActionBar(flag);
            ImageView imageview = avatarImage;
            if (flag)
            {
                i = 4;
            } else
            {
                i = 0;
            }
            imageview.setVisibility(i);
        }
    }

    void showRoster()
    {
        if (!isRosterShowing())
        {
            CallRosterFragment callrosterfragment = new CallRosterFragment();
            Object obj = new Bundle();
            ((Bundle) (obj)).putInt("com.skype.objId", conversation.getObjectID());
            callrosterfragment.setArguments(((Bundle) (obj)));
            obj = getFragmentManager().a();
            ((o) (obj)).a(null);
            ((o) (obj)).a(callrosterfragment);
            ((o) (obj)).a();
        }
    }

    public void showUnmuteButton()
    {
        if (unmuteButtonAnimation != null)
        {
            unmuteButtonAnimation.cancel();
            unmuteButtonAnimation.removeAllListeners();
        }
        unmuteButtonAnimation = PropertyAnimationUtil.c(mutedButton);
        mutedButton.bringToFront();
    }






}
