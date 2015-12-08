// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.l;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.Participant;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.calling.state.CallControlsStateContext;
import com.skype.android.app.chat.ChatFragment;
import com.skype.android.app.chat.ChatFragmentProvider;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.event.EventBus;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.DeviceFeatures;
import com.skype.android.util.PerformanceLog;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.cache.ContactMoodCache;
import com.skype.android.widget.ViewPagerWrapper;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.calling:
//            CallConstants, CallPagerAdapter, InCallFragment, b, 
//            CallControlsView, OnCallScreenForegroundChanged, CallRosterFragment, OnUpdateCallDurationEvent

public class CallActivity extends SkypeActivity
    implements android.os.Handler.Callback, android.support.v4.view.ViewPager.f, android.view.View.OnClickListener, CallConstants, CallRosterFragment.CallRosterFragmentCallback, InCallFragment.ActivityCallback, ChatFragmentProvider
{
    static interface a
    {

        public abstract void onCallDurationUpdated(Conversation conversation1);
    }

    private final class b
        implements a
    {

        final CallActivity this$0;

        public final void onCallDurationUpdated(Conversation conversation1)
        {
            actionBarCustomizer.updateCallDuration(conversation1);
        }

        private b()
        {
            this$0 = CallActivity.this;
            super();
        }

    }


    private static final Logger log = Logger.getLogger("CallActivity");
    AccessibilityUtil accessibility;
    ActionBarCustomizer actionBarCustomizer;
    private CallPagerAdapter adapter;
    private CallControlsStateContext callControlStateContext;
    com.skype.android.app.calling.b callEndedOverlay;
    private Contact contact;
    ContactUtil contactUtil;
    private Conversation conversation;
    ConversationUtil conversationUtil;
    EventBus eventBus;
    private Handler handler;
    InputMethodManager ime;
    private boolean isCallControlsVisible;
    LayoutExperience layoutExperience;
    SkyLib lib;
    ObjectIdMap map;
    private Participant me;
    Navigation navigation;
    private View ngcCallIndicator;
    private a onCallDurationUpdateListener;
    private HashSet participants;
    ContactMoodCache spannedText;
    TimeUtil timeUtil;
    UserPreferences userPreferences;
    ViewPagerWrapper viewPager;

    public CallActivity()
    {
        callControlStateContext = new CallControlsStateContext(accessibility, layoutExperience);
    }

    private void checkConversationState()
    {
        com.skype.Conversation.LOCAL_LIVESTATUS local_livestatus = conversation.getLocalLiveStatusProp();
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[];
            static final int $SwitchMap$com$skype$Conversation$TYPE[];
            static final int $SwitchMap$com$skype$PROPKEY[];

            static 
            {
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_LIVE_CALL_TECHNOLOGY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_LOCAL_LIVESTATUS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS = new int[com.skype.Conversation.LOCAL_LIVESTATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.NONE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.RECENTLY_LIVE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.OTHERS_ARE_LIVE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                $SwitchMap$com$skype$Conversation$TYPE = new int[com.skype.Conversation.TYPE.values().length];
                try
                {
                    $SwitchMap$com$skype$Conversation$TYPE[com.skype.Conversation.TYPE.DIALOG.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$TYPE[com.skype.Conversation.TYPE.CONFERENCE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Conversation$TYPE[com.skype.Conversation.TYPE.LEGACY_VOICE_CONFERENCE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2..SwitchMap.com.skype.Conversation.LOCAL_LIVESTATUS[local_livestatus.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            endCall();
            break;
        }
    }

    private Fragment getFragmentPage(int i)
    {
        String s = adapter.getTag(i);
        return getSupportFragmentManager().a(s);
    }

    private void handleParticipantAdded(Participant participant)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (participant.getObjectID() == me.getObjectID())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag2 = conversation.getLiveHostProp().equals(participant.getIdentityProp());
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.CONFERENCE)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 && !flag && !flag2)
        {
            participant = conversationUtil.b(participant);
            Toast.makeText(this, getString(0x7f080409, new Object[] {
                contactUtil.l(participant)
            }), 0).show();
        }
        updateTitle();
    }

    private boolean isLandscape()
    {
        return getResources().getConfiguration().orientation == 2;
    }

    private void updateActionBarLayout()
    {
        boolean flag = isLandscape();
        if (!getResources().getBoolean(0x7f0d0003))
        {
            ActionBarCustomizer actionbarcustomizer = actionBarCustomizer;
            byte byte0;
            if (flag)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            actionbarcustomizer.setSubtitleVisiblity(byte0);
        }
        switch (viewPager.b())
        {
        default:
            return;

        case 0: // '\0'
            actionBarCustomizer.setSubtitleCompoundDrawable(0);
            actionBarCustomizer.setTitleCompoundDrawable(0);
            return;

        case 1: // '\001'
            break;
        }
        if (!flag || getResources().getBoolean(0x7f0d0003))
        {
            actionBarCustomizer.setTitleCompoundDrawable(0);
            actionBarCustomizer.setSubtitleCompoundDrawable(0x7f020056);
            return;
        } else
        {
            actionBarCustomizer.setTitleCompoundDrawable(0x7f020056);
            actionBarCustomizer.setSubtitleCompoundDrawable(0);
            return;
        }
    }

    private void updateTitle()
    {
        spannedText.a(conversation.getObjectID());
        actionBarCustomizer.updateTitleFromLiveConversation();
    }

    public void callFragmentResumed(InCallFragment incallfragment)
    {
        callControlStateContext.onCallFragmentResumed(this, incallfragment);
    }

    public void cancelCallControlsTimeout(boolean flag)
    {
        handler.removeMessages(2);
        if (flag)
        {
            handler.sendEmptyMessageDelayed(2, 3000L);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag = super.dispatchTouchEvent(motionevent);
        if (!flag)
        {
            motionevent = (InCallFragment)getFragmentPage(0);
            callControlStateContext.onConfirmedCallViewTap(this, motionevent);
        }
        return flag;
    }

    public void endCall()
    {
        InCallFragment incallfragment = (InCallFragment)getFragmentPage(0);
        callControlStateContext.onCallEnded(this, incallfragment);
        if (incallfragment != null)
        {
            incallfragment.callEnded();
        }
        if (!handler.hasMessages(4))
        {
            conversation.leaveLiveSession(false);
            callEndedOverlay.setOverlayVisible(true);
            handler.sendEmptyMessageDelayed(4, 1500L);
        }
    }

    public ChatFragment getChatFragment()
    {
        return (ChatFragment)getFragmentPage(1);
    }

    public boolean handleMessage(Message message)
    {
        if (isFinishing()) goto _L2; else goto _L1
_L1:
        message.what;
        JVM INSTR tableswitch 2 4: default 36
    //                   2 38
    //                   3 36
    //                   4 59;
           goto _L2 _L3 _L2 _L4
_L2:
        return false;
_L3:
        message = (InCallFragment)getFragmentPage(0);
        callControlStateContext.onCallControlsDisplayTimerExpired(this, message);
        return true;
_L4:
        message = EnumSet.of(com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_LOCALLY, com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_REMOTELY);
        message = conversationUtil.a(message);
        if (message.size() > 0)
        {
            navigation.toOngoingCall((Conversation)message.get(0));
        }
        finish();
        return true;
    }

    boolean onAcceptEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getSender().getObjectID() == conversation.getObjectID() && (onpropertychange.getPropKey() == PROPKEY.CONVERSATION_LOCAL_LIVESTATUS || onpropertychange.getPropKey() == PROPKEY.CONVERSATION_LIVE_CALL_TECHNOLOGY);
    }

    boolean onAcceptEvent(com.skype.android.gen.ParticipantListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getPropKey() == PROPKEY.PARTICIPANT_VOICE_STATUS;
    }

    public void onAudioRouteChanged()
    {
        InCallFragment incallfragment = (InCallFragment)getFragmentPage(0);
        callControlStateContext.onAudioRouteChanged(this, incallfragment);
    }

    public void onBackPressed()
    {
        if (!callEndedOverlay.isOverlayVisible()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        InCallFragment incallfragment;
        if (viewPager.b() == 1)
        {
            viewPager.setCurrentItem(0);
            return;
        }
        if (viewPager.b() != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        incallfragment = (InCallFragment)getFragmentPage(0);
        if (incallfragment != null && incallfragment.onBackWasPressed()) goto _L1; else goto _L3
_L3:
        super.onBackPressed();
        return;
    }

    public void onCallRosterDismissed(CallRosterFragment callrosterfragment)
    {
        actionBarCustomizer.setTitleFromOngoingConversation(conversation, 0, this);
        actionBarCustomizer.setWhiteTheme(true);
        actionBarCustomizer.updateCallDuration(conversation);
        InCallFragment incallfragment = (InCallFragment)getFragmentPage(0);
        callControlStateContext.onCallRosterDismissed(this, incallfragment, callrosterfragment);
        viewPager.setSwipingAllowed(true);
    }

    public void onCallRosterDisplayed(CallRosterFragment callrosterfragment)
    {
        final InCallFragment fragment = (InCallFragment)getFragmentPage(0);
        callControlStateContext.onCallRosterDisplayed(this, fragment, callrosterfragment);
        viewPager.setSwipingAllowed(false);
        actionBarCustomizer.setTitleFromOngoingConversation(conversation, 0, new android.view.View.OnClickListener() {

            final CallActivity this$0;
            final InCallFragment val$fragment;

            public final void onClick(View view)
            {
                if (fragment != null)
                {
                    fragment.hideRoster();
                }
            }

            
            {
                this$0 = CallActivity.this;
                fragment = incallfragment;
                super();
            }
        });
        actionBarCustomizer.setWhiteTheme(true);
    }

    public void onClick(View view)
    {
        com.skype.Conversation.TYPE type;
        InCallFragment incallfragment;
        type = conversation.getTypeProp();
        incallfragment = (InCallFragment)getFragmentPage(0);
        view.getId();
        JVM INSTR tableswitch 2131756369 2131756370: default 44
    //                   2131756369 104
    //                   2131756370 124;
           goto _L1 _L2 _L3
_L1:
        _cls2..SwitchMap.com.skype.Conversation.TYPE[type.ordinal()];
        JVM INSTR tableswitch 1 3: default 80
    //                   1 143
    //                   2 155
    //                   3 155;
           goto _L4 _L5 _L6 _L6
_L4:
        log.warning((new StringBuilder("Not supported type of conference: ")).append(type).toString());
_L8:
        return;
_L2:
        viewPager.setCurrentItem(0);
        if (incallfragment != null)
        {
            incallfragment.callControls.toggleCameraDirection();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (viewPager.b() == 0)
        {
            viewPager.setCurrentItem(1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        navigation.profile(contact);
        return;
_L6:
        viewPager.setCurrentItem(0);
        if (incallfragment != null)
        {
            incallfragment.showRoster();
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        updateActionBarLayout();
    }

    public void onConfirmedTap()
    {
        InCallFragment incallfragment = (InCallFragment)getFragmentPage(0);
        callControlStateContext.onConfirmedCallViewTap(this, incallfragment);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        conversation = (Conversation)getObjectInterface(com/skype/Conversation);
        lifecycleSupport.addListener(actionBarCustomizer);
        setVolumeControlStream(0);
        getWindow().addFlags(0x688480);
        getWindow().getDecorView().setSystemUiVisibility(1);
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
        {
            contact = conversationUtil.r(conversation);
        }
        if (Build.HARDWARE.equalsIgnoreCase("SQW100-1"))
        {
            setRequestedOrientation(1);
        }
        me = conversationUtil.o(conversation);
        participants = new HashSet(conversationUtil.a(conversation, com.skype.Conversation.PARTICIPANTFILTER.CONSUMERS));
        handler = new Handler(this);
        actionBarCustomizer.setTitleFromOngoingConversation(conversation, 0, this);
        actionBarCustomizer.setWhiteTheme(true);
        adapter = new CallPagerAdapter(this, conversation);
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(this);
        viewPager.setPassThroughStrategy(com.skype.android.widget.GestureTracker.PassThroughStrategy.c);
        onCallDurationUpdateListener = new b();
        callControlStateContext = new CallControlsStateContext(accessibility, layoutExperience);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f110016, menu);
        return true;
    }

    public void onEvent(OnUpdateCallDurationEvent onupdatecalldurationevent)
    {
        if (!callEndedOverlay.isOverlayVisible())
        {
            onCallDurationUpdateListener.onCallDurationUpdated(conversation);
        }
    }

    public void onEvent(com.skype.android.gen.ConversationListener.OnParticipantListChange onparticipantlistchange)
    {
        if (onparticipantlistchange.getSender().getObjectID() == conversation.getObjectID())
        {
            participants.addAll(conversationUtil.a(conversation, com.skype.Conversation.PARTICIPANTFILTER.CONSUMERS));
            updateTitle();
        }
    }

    void onEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        boolean flag = false;
        _cls2..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 37
    //                   2 89;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (ngcCallIndicator != null)
        {
            int i;
            if (conversation.getLiveCallTechnologyProp() == com.skype.Conversation.CALL_TECHNOLOGY.CALL_NGC)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            onpropertychange = ngcCallIndicator;
            if (i != 0)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 8;
            }
            onpropertychange.setVisibility(i);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (!isFinishing())
        {
            onpropertychange = (InCallFragment)getFragmentPage(0);
            if (onpropertychange != null)
            {
                callControlStateContext.onConversationLiveStatusChanged(this, onpropertychange);
            }
            checkConversationState();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    void onEvent(com.skype.android.gen.ConversationListener.OnSpawnConference onspawnconference)
    {
        if (onspawnconference.getSender().getObjectID() == conversation.getObjectID() && !isFinishing())
        {
            onspawnconference = (Conversation)map.a(onspawnconference.getSpawnedObjectID(), com/skype/Conversation);
            if (conversation.getLiveIsMutedProp())
            {
                onspawnconference.muteMyMicrophone();
            }
            onspawnconference = navigation.intentFor(onspawnconference, com/skype/android/app/calling/CallActivity);
            finish();
            startActivity(onspawnconference);
        }
    }

    public void onEvent(com.skype.android.gen.ParticipantListener.OnPropertyChange onpropertychange)
    {
        onpropertychange = (Participant)onpropertychange.getSender();
        com.skype.Participant.VOICE_STATUS voice_status = onpropertychange.getVoiceStatusProp();
        if (voice_status == com.skype.Participant.VOICE_STATUS.LISTENING || voice_status == com.skype.Participant.VOICE_STATUS.SPEAKING)
        {
            handleParticipantAdded(onpropertychange);
        } else
        if (!ConversationUtil.a(conversation, onpropertychange))
        {
            updateTitle();
            return;
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        int i = intent.getIntExtra("com.skype.objId", -1);
        if (i != -1 && conversation.getObjectID() != i)
        {
            finish();
            startActivity(intent);
            return;
        } else
        {
            viewPager.setCurrentItem(0);
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = true;
        menuitem.getItemId();
        JVM INSTR lookupswitch 4: default 52
    //                   16908332: 60
    //                   2131756503: 120
    //                   2131756514: 133
    //                   2131756520: 146;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        flag = super.onOptionsItemSelected(menuitem);
_L7:
        return flag;
_L2:
        if (viewPager.b() == 1)
        {
            viewPager.setCurrentItem(0);
            return true;
        }
        menuitem = (InCallFragment)getFragmentPage(0);
        if (menuitem != null && menuitem.isRosterShowing())
        {
            menuitem.hideRoster();
            return true;
        } else
        {
            navigation.upToHome();
            finish();
            return true;
        }
_L3:
        navigation.profile(contact);
        return true;
_L4:
        navigation.groupProfile(conversation);
        return true;
_L5:
        menuitem = (InCallFragment)getFragmentPage(0);
        if (menuitem != null)
        {
            menuitem.removeSingleVideoFocus();
            return true;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onPageScrollStateChanged(int i)
    {
        if (i == 1)
        {
            InCallFragment incallfragment = (InCallFragment)getFragmentPage(0);
            callControlStateContext.onViewPagerScrollStateChanged(this, incallfragment, i);
        }
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        InCallFragment incallfragment;
        ChatFragment chatfragment;
        incallfragment = (InCallFragment)getFragmentPage(0);
        callControlStateContext.onViewPagerPageSelected(this, incallfragment, i);
        supportInvalidateOptionsMenu();
        updateActionBarLayout();
        chatfragment = (ChatFragment)getFragmentPage(1);
        i;
        JVM INSTR tableswitch 0 1: default 60
    //                   0 61
    //                   1 137;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        actionBarCustomizer.setWhiteTheme(true);
        ime.hideSoftInputFromWindow(viewPager.getWindowToken(), 0);
        incallfragment.refreshCallControls();
        incallfragment.clearPendingMessages();
        chatfragment.setVisibleOnScreen(false);
        incallfragment.setVisibleOnScreen(true);
        if (chatfragment.getChatListView() != null && accessibility.a())
        {
            chatfragment.getChatListView().setVisibility(8);
        }
        SkypeDialogFragment.dismiss(getSupportFragmentManager());
        return;
_L3:
        actionBarCustomizer.setBlueTheme(true);
        chatfragment.removeFocusFromMessageArea();
        chatfragment.setVisibleOnScreen(true);
        incallfragment.setVisibleOnScreen(false);
        if (chatfragment.getChatListView() != null && accessibility.a())
        {
            chatfragment.getChatListView().setVisibility(0);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onParticipantSelected(CallRosterFragment callrosterfragment, Participant participant)
    {
        getFragmentPage(0);
    }

    protected void onPause()
    {
        super.onPause();
        ViewUtil.b(getWindow().getDecorView());
        eventBus.a(new OnCallScreenForegroundChanged(false));
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        boolean flag3 = false;
        Object obj;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (viewPager.b() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj = menu.findItem(0x7f1005d7);
        if (flag && flag1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ((MenuItem) (obj)).setVisible(flag2);
        obj = menu.findItem(0x7f1005e2);
        if (flag && !flag1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ((MenuItem) (obj)).setVisible(flag2);
        obj = (InCallFragment)getFragmentPage(0);
        menu = menu.findItem(0x7f1005e8);
        flag2 = flag3;
        if (!flag)
        {
            flag2 = flag3;
            if (obj != null)
            {
                flag2 = flag3;
                if (((InCallFragment) (obj)).isSingleVideoFocused())
                {
                    flag2 = true;
                }
            }
        }
        menu.setVisible(flag2);
        return true;
    }

    protected void onResume()
    {
        super.onResume();
        PerformanceLog.d.a("CallSetupTime:connected;");
        ViewUtil.a(getWindow().getDecorView());
        eventBus.a(new OnCallScreenForegroundChanged(true));
        checkConversationState();
        updateActionBarLayout();
        updateTitle();
        onCallDurationUpdateListener.onCallDurationUpdated(conversation);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }

    public void onVoiceStatusChanged()
    {
        InCallFragment incallfragment = (InCallFragment)getFragmentPage(0);
        callControlStateContext.onVoiceStatusChanged(this, incallfragment);
    }

    public void setCallControlsVisible(boolean flag)
    {
        isCallControlsVisible = flag;
    }

    public void setSwipingAllowed(boolean flag)
    {
        viewPager.setSwipingAllowed(flag);
    }

    public void showChat()
    {
        if (DeviceFeatures.c())
        {
            viewPager.setCurrentItem(1, false);
            return;
        } else
        {
            viewPager.setCurrentItem(1);
            return;
        }
    }

    public void videoCountChanged(int i)
    {
        InCallFragment incallfragment = (InCallFragment)getFragmentPage(0);
        callControlStateContext.onVideoCountChanged(this, incallfragment, i);
    }

}
