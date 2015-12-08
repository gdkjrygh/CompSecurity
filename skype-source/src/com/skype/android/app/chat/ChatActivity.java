// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.l;
import android.support.v4.view.k;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import com.skype.Contact;
import com.skype.ContactGroup;
import com.skype.Conversation;
import com.skype.Message;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.ExperimentEvent;
import com.skype.android.analytics.ExperimentTag;
import com.skype.android.analytics.ExperimentTelemetryEvent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.calling.CallQualityFeedbackManager;
import com.skype.android.app.chat.picker.OnTranslatorEnabled;
import com.skype.android.app.contacts.ContactAddNumberActivity;
import com.skype.android.app.contacts.ContactBlockConfirmDialog;
import com.skype.android.app.contacts.ContactEditActivity;
import com.skype.android.app.contacts.ContactProfileActivity;
import com.skype.android.app.contacts.ContactRemoveConfirmDialog;
import com.skype.android.app.contacts.OnContactBlocked;
import com.skype.android.app.contacts.OnContactRemoved;
import com.skype.android.app.main.EditPropertyActivity;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.transfer.InstalledAppVerifier;
import com.skype.android.app.vim.VideoMessagePromotionActivity;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.telemetry.TelemetryHelper;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.DeviceFeatures;
import com.skype.android.util.StartupTimeReporter;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.permission.Permission;
import com.skype.android.util.permission.PermissionHandlerAdapter;
import com.skype.android.util.permission.PermissionRequest;
import com.skype.android.widget.CallActionSpinner;
import java.util.HashSet;

// Referenced classes of package com.skype.android.app.chat:
//            ChatFragmentProvider, SideBarFragment, ChatFragment, ParticipantActivity

public class ChatActivity extends SkypeActivity
    implements android.widget.AdapterView.OnItemSelectedListener, ChatFragmentProvider
{

    public static final String EXTRA_IS_WRITING = "is_writing";
    public static final String EXTRA_WERE_PENDING_AUTH = "were_pending_auth";
    private static final String NOTIFICATION_MUTE_OFF = "";
    private static final String NOTIFICATION_MUTE_ON = "=";
    private static final int REQUEST_CODE_VIM_PROM = 1;
    private static final int REQUEST_LAUNCH_PROFILE = 2;
    private static final String VIM_ICON_LENS = "Lens";
    private static final String VIM_ICON_TAPE = "Tape";
    AccessibilityUtil accessibility;
    ActionBarCustomizer actionBarCustomizer;
    Analytics analytics;
    AudioManager audioManager;
    private ChatFragment chat;
    private Contact contact;
    ContactUtil contactUtil;
    private Conversation conversation;
    ConversationUtil conversationUtil;
    CallQualityFeedbackManager cqfManager;
    EcsConfiguration ecsConfiguration;
    LayoutExperience layoutExperience;
    ObjectIdMap map;
    Navigation navigation;
    private HashSet participants;
    PermissionRequest permissionRequest;
    private SideBarFragment sidebar;
    private CallActionSpinner spinner;
    TelemetryHelper telemetryHelper;
    ImageView translatorGlobe;
    private boolean upIsBack;
    UserPreferences userPreferences;
    private String vimIconEcsConfig;
    private boolean werePendingAuth;

    public ChatActivity()
    {
    }

    private boolean canShowTranslatorSettingGlobe()
    {
        boolean flag;
        boolean flag1;
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = layoutExperience.isMultipane();
        return ecsConfiguration.isTranslatorEnabled() && flag && !flag1 && !ContactUtil.e(contact) && !ContactUtil.f(contact) && !ContactUtil.a(contact) && !ContactUtil.p(contact);
    }

    private void handleLiveConversation(boolean flag)
    {
        com.skype.Conversation.LOCAL_LIVESTATUS local_livestatus = conversation.getLocalLiveStatusProp();
        if (local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE || local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_LOCALLY || local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_REMOTELY)
        {
            finish();
            if (flag)
            {
                navigation.toOngoingCall(conversation);
            }
        }
    }

    private boolean isSideBarShown()
    {
        return sidebar != null && sidebar.isInLayout();
    }

    private void navigateToHub()
    {
        if (upIsBack)
        {
            if (isTaskRoot())
            {
                navigation.upToHome();
                return;
            } else
            {
                finish();
                return;
            }
        } else
        {
            navigation.upToHome();
            finish();
            return;
        }
    }

    private void scheduleCall()
    {
        Object obj = ecsConfiguration.getExperimentCalendarIntegrationGroupTag();
        if (obj == ExperimentTag.e)
        {
            scheduleCallInAnyCalendar();
        }
        if (obj == ExperimentTag.g)
        {
            scheduleCallInOutlookCalendar();
        }
        obj = new ExperimentTelemetryEvent(ExperimentEvent.c, ecsConfiguration.getExperimentCalendarIntegrationGroupTag());
        analytics.a(((ExperimentTelemetryEvent) (obj)));
    }

    private void scheduleCallInAnyCalendar()
    {
        navigation.scheduleCallInAnyCalendar(conversationUtil.r(conversation).getDisplaynameProp());
    }

    private void scheduleCallInOutlookCalendar()
    {
        String s = conversationUtil.r(conversation).getDisplaynameProp();
        if (InstalledAppVerifier.customPackageExists(getApplicationContext(), "com.microsoft.office.outlook"))
        {
            navigation.scheduleCallInOutlookCalendar(s);
            return;
        } else
        {
            navigation.outlookNotInstalled(s);
            return;
        }
    }

    private void setVisible(Menu menu, int i, boolean flag)
    {
        menu = menu.findItem(i);
        if (menu != null)
        {
            menu.setVisible(flag);
        }
    }

    private void setupToolbar()
    {
        Object obj = (AppBarLayout)findViewById(0x7f1002ce);
        Object obj1 = (Toolbar)((AppBarLayout) (obj)).findViewById(0x7f1002cf);
        ((Toolbar) (obj1)).setNavigationIcon(0x7f020049);
        setSupportActionBar(((Toolbar) (obj1)));
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            ((AppBarLayout) (obj)).setElevation(0.0F);
        }
        obj1 = ((AppBarLayout) (obj)).findViewById(0x7f1002d0);
        obj = ((AppBarLayout) (obj)).findViewById(0x7f1002d2);
        if (canShowTranslatorSettingGlobe())
        {
            ((View) (obj1)).setVisibility(0);
            ((View) (obj)).setVisibility(8);
            obj = conversationUtil.C(conversation);
            translatorGlobe.setSelected(((com.skype.android.util.ConversationUtil.TranslatorSetting) (obj)).a);
            translatorGlobe.setOnClickListener(new android.view.View.OnClickListener() {

                final ChatActivity this$0;

                public final void onClick(View view)
                {
                    chat.showTranslatorSetting();
                }

            
            {
                this$0 = ChatActivity.this;
                super();
            }
            });
            return;
        } else
        {
            ((View) (obj1)).setVisibility(8);
            ((View) (obj)).setVisibility(0);
            return;
        }
    }

    private void updateActionBarForGroup()
    {
        if (!ConversationUtil.w(conversation))
        {
            actionBarCustomizer.setTitleCompoundDrawable(0);
            return;
        } else
        {
            actionBarCustomizer.setTitleCompoundDrawable(0x7f02010d);
            return;
        }
    }

    private void updateTitle()
    {
        if (isSideBarShown())
        {
            actionBarCustomizer.setTitleFromConversation(conversation, true, false);
            actionBarCustomizer.setWhiteTheme(true);
            getSupportActionBar().d().setOnTouchListener(new android.view.View.OnTouchListener() {

                final ChatActivity this$0;

                public final boolean onTouch(View view, MotionEvent motionevent)
                {
                    view = chat.getView();
                    if (view != null && motionevent.getRawX() > (float)view.getLeft())
                    {
                        view.dispatchTouchEvent(motionevent);
                        return true;
                    } else
                    {
                        return false;
                    }
                }

            
            {
                this$0 = ChatActivity.this;
                super();
            }
            });
            return;
        } else
        {
            actionBarCustomizer.setTitleFromConversation(conversation, true, true, 2, false);
            return;
        }
    }

    public ChatFragment getChatFragment()
    {
        return chat;
    }

    boolean onAcceptEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getSender().getObjectID() == conversation.getObjectID() && (onpropertychange.getPropKey() == PROPKEY.CONVERSATION_LOCAL_LIVESTATUS || onpropertychange.getPropKey() == PROPKEY.CONVERSATION_ALERT_STRING || onpropertychange.getPropKey() == PROPKEY.CONVERSATION_DISPLAYNAME);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1 && j == -1)
        {
            navigation.videoMessage(conversation);
        }
    }

    public void onBackPressed()
    {
        if (chat != null && !chat.handleBackPressed())
        {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        actionBarCustomizer.setToolbarLayoutId(0x7f1002cf);
        conversation = (Conversation)getObjectInterface(com/skype/Conversation);
        if (conversation == null)
        {
            navigation.home();
            return;
        }
        AnalyticsEvent analyticsevent;
        Object obj;
        String s1;
        boolean flag;
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
        {
            contact = conversationUtil.r(conversation);
        } else
        {
            analytics.c(AnalyticsEvent.P);
        }
        if (!layoutExperience.isMultipane() || !ViewUtil.a(this))
        {
            setupToolbar();
        }
        lifecycleSupport.addListener(actionBarCustomizer);
        chat = (ChatFragment)getSupportFragmentManager().a(0x7f10026c);
        sidebar = (SideBarFragment)getSupportFragmentManager().a(0x7f10026d);
        if (ecsConfiguration.isViMPromoEnabled() && ecsConfiguration.isViMIconVisibleInChatPage() && conversationUtil.j(conversation) && conversation.getUnconsumedNormalMessagesProp() <= 0)
        {
            if (!userPreferences.vimPromotionHasBeenShown())
            {
                String s = contactUtil.l(contact);
                Intent intent = new Intent(this, com/skype/android/app/vim/VideoMessagePromotionActivity);
                intent.putExtra("contactName", s);
                startActivityForResult(intent, 1);
                userPreferences.setVimPromotionHasBeenShown();
                analytics.c(AnalyticsEvent.H);
            } else
            {
                analytics.c(AnalyticsEvent.G);
            }
        }
        s1 = ecsConfiguration.getExperimentName();
        obj = null;
        analyticsevent = obj;
        try
        {
            if (!TextUtils.isEmpty(s1))
            {
                analyticsevent = AnalyticsEvent.valueOf(s1);
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            illegalargumentexception.printStackTrace();
            illegalargumentexception = obj;
        }
        catch (NullPointerException nullpointerexception)
        {
            nullpointerexception.printStackTrace();
            nullpointerexception = obj;
        }
        if (analyticsevent != null)
        {
            analytics.c(analyticsevent);
        }
        participants = new HashSet(conversationUtil.a(conversation, com.skype.Conversation.PARTICIPANTFILTER.CONSUMERS));
        upIsBack = getIntent().getBooleanExtra("com.skype.upIsBack", false);
        getSupportActionBar().b(true);
        if (getLastCustomNonConfigurationInstance() == null)
        {
            handleLiveConversation(true);
        }
        if (bundle != null && bundle.containsKey("were_pending_auth"))
        {
            flag = bundle.getBoolean("were_pending_auth");
        } else
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG && contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.UNKNOWN_OR_PENDINGAUTH_BUDDIES))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        werePendingAuth = flag;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        if (!isSideBarShown())
        {
            MenuInflater menuinflater = getMenuInflater();
            int i;
            if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
            {
                i = 0x7f110010;
            } else
            {
                i = 0x7f110014;
            }
            menuinflater.inflate(i, menu);
            actionBarCustomizer.setChildrenGravity(16);
            return true;
        } else
        {
            return false;
        }
    }

    void onEvent(OnTranslatorEnabled ontranslatorenabled)
    {
        if (conversation.getObjectID() == ontranslatorenabled.getConversation().getObjectID())
        {
            translatorGlobe.setSelected(ontranslatorenabled.isEnabled());
        }
    }

    public void onEvent(OnContactBlocked oncontactblocked)
    {
        if (contact != null && contact.equals(oncontactblocked.getContact()))
        {
            finish();
        }
    }

    public void onEvent(OnContactRemoved oncontactremoved)
    {
        if (contact != null && contact.equals(oncontactremoved.getContact()))
        {
            finish();
        }
    }

    void onEvent(com.skype.android.gen.ContactGroupListener.OnChange onchange)
    {
        if (contact == null || contact.getObjectID() != onchange.getContactObjectID()) goto _L2; else goto _L1
_L1:
        static final class _cls7
        {

            static final int $SwitchMap$com$skype$ContactGroup$TYPE[];
            static final int $SwitchMap$com$skype$Message$TYPE[];

            static 
            {
                $SwitchMap$com$skype$ContactGroup$TYPE = new int[com.skype.ContactGroup.TYPE.values().length];
                try
                {
                    $SwitchMap$com$skype$ContactGroup$TYPE[com.skype.ContactGroup.TYPE.ALL_BUDDIES.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                $SwitchMap$com$skype$Message$TYPE = new int[com.skype.Message.TYPE.values().length];
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.BLOCKED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls7..SwitchMap.com.skype.ContactGroup.TYPE[onchange.getSender().getTypeProp().ordinal()];
        JVM INSTR tableswitch 1 1: default 56
    //                   1 57;
           goto _L2 _L3
_L2:
        return;
_L3:
        supportInvalidateOptionsMenu();
        return;
    }

    void onEvent(com.skype.android.gen.ConversationListener.OnCapabilitiesChanged oncapabilitieschanged)
    {
        supportInvalidateOptionsMenu();
    }

    void onEvent(com.skype.android.gen.ConversationListener.OnParticipantListChange onparticipantlistchange)
    {
        if (onparticipantlistchange.getSender().getObjectID() == conversation.getObjectID())
        {
            participants.addAll(conversationUtil.a(conversation, com.skype.Conversation.PARTICIPANTFILTER.CONSUMERS));
            updateTitle();
        }
    }

    void onEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        onpropertychange = onpropertychange.getPropKey();
        if (onpropertychange == PROPKEY.CONVERSATION_LOCAL_LIVESTATUS)
        {
            supportInvalidateOptionsMenu();
        } else
        {
            if (onpropertychange == PROPKEY.CONVERSATION_ALERT_STRING)
            {
                updateActionBarForGroup();
                return;
            }
            if (onpropertychange == PROPKEY.CONVERSATION_DISPLAYNAME)
            {
                updateTitle();
                return;
            }
        }
    }

    void onEvent(com.skype.android.gen.SkyLibListener.OnMessage onmessage)
    {
        if (onmessage.getConversationObjectID() != conversation.getObjectID()) goto _L2; else goto _L1
_L1:
        onmessage = (Message)map.a(onmessage.getMessageObjectID(), com/skype/Message);
        _cls7..SwitchMap.com.skype.Message.TYPE[onmessage.getTypeProp().ordinal()];
        JVM INSTR tableswitch 1 1: default 68
    //                   1 69;
           goto _L2 _L3
_L2:
        return;
_L3:
        finish();
        return;
    }

    void onEvent(com.skype.android.gen.SkyLibListener.OnObjectPropertyChangeWithValue onobjectpropertychangewithvalue)
    {
        if (onobjectpropertychangewithvalue.getPropKey() == PROPKEY.CONTACT_DISPLAYNAME && conversation.getTypeProp() == com.skype.Conversation.TYPE.CONFERENCE)
        {
            updateTitle();
        }
    }

    public void onItemSelected(final AdapterView item, View view, int i, long l1)
    {
        if (item != null)
        {
            item = (com.skype.android.widget.ActionSpinner.Item)item.getAdapter().getItem(i);
            permissionRequest.a(Permission.n, true, new PermissionHandlerAdapter() {

                final ChatActivity this$0;
                final com.skype.android.widget.ActionSpinner.Item val$item;

                public final void onGranted()
                {
                    PROPKEY propkey;
label0:
                    {
                        if (item != null)
                        {
                            propkey = (PROPKEY)item.c();
                            if (propkey != PROPKEY.CONTACT_SKYPENAME)
                            {
                                break label0;
                            }
                            analytics.c(AnalyticsEvent.n);
                            navigation.placeCall(contact);
                        }
                        return;
                    }
                    if (propkey == PROPKEY.CONVERSATION_IDENTITY)
                    {
                        analytics.c(AnalyticsEvent.n);
                        navigation.placeCall(conversation);
                        return;
                    } else
                    {
                        analytics.c(AnalyticsEvent.m);
                        navigation.placeCall(contact, propkey);
                        return;
                    }
                }

            
            {
                this$0 = ChatActivity.this;
                item = item1;
                super();
            }
            });
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR lookupswitch 23: default 200
    //                   16908332: 202
    //                   2131756491: 329
    //                   2131756493: 350
    //                   2131756494: 501
    //                   2131756495: 511
    //                   2131756496: 492
    //                   2131756497: 569
    //                   2131756498: 593
    //                   2131756499: 466
    //                   2131756500: 479
    //                   2131756501: 521
    //                   2131756502: 208
    //                   2131756503: 228
    //                   2131756504: 271
    //                   2131756505: 293
    //                   2131756506: 307
    //                   2131756507: 387
    //                   2131756512: 396
    //                   2131756513: 433
    //                   2131756514: 371
    //                   2131756515: 417
    //                   2131756516: 541
    //                   2131756517: 555;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24
_L1:
        return false;
_L2:
        navigateToHub();
        return true;
_L13:
        startActivity(navigation.intentFor(contact, com/skype/android/app/contacts/ContactAddNumberActivity));
        return false;
_L14:
        menuitem = navigation.intentFor(contact, com/skype/android/app/contacts/ContactProfileActivity);
        if (layoutExperience.isMultipane())
        {
            menuitem.putExtra("were_pending_auth", werePendingAuth);
        }
        startActivity(menuitem);
        return true;
_L15:
        ((ContactBlockConfirmDialog)SkypeDialogFragment.create(contact, com/skype/android/app/contacts/ContactBlockConfirmDialog)).show(getSupportFragmentManager());
        return true;
_L16:
        contact.setBlocked(false, false);
        return true;
_L17:
        ((ContactRemoveConfirmDialog)SkypeDialogFragment.create(contact, com/skype/android/app/contacts/ContactRemoveConfirmDialog)).show(getSupportFragmentManager());
        return true;
_L3:
        permissionRequest.a(Permission.k, true, new PermissionHandlerAdapter() {

            final ChatActivity this$0;

            public final void onGranted()
            {
                analytics.c(AnalyticsEvent.l);
                if (conversation.getTypeProp() == com.skype.Conversation.TYPE.CONFERENCE)
                {
                    navigation.placeCallWithVideo(conversation);
                    return;
                } else
                {
                    navigation.placeCallWithVideo(contact);
                    return;
                }
            }

            
            {
                this$0 = ChatActivity.this;
                super();
            }
        });
        return true;
_L4:
        permissionRequest.a(Permission.l, true, new PermissionHandlerAdapter() {

            final ChatActivity this$0;

            public final void onGranted()
            {
                analytics.c(AnalyticsEvent.s);
                navigation.videoMessage(conversation);
            }

            
            {
                this$0 = ChatActivity.this;
                super();
            }
        });
        return true;
_L21:
        navigation.startIntentFor(conversation, com/skype/android/app/chat/ParticipantActivity);
        return true;
_L18:
        chat.showRingtoneOptions();
        return true;
_L19:
        permissionRequest.a(Permission.k, true, new PermissionHandlerAdapter() {

            final ChatActivity this$0;

            public final void onGranted()
            {
                if (DeviceFeatures.d() && audioManager.getMode() != 3)
                {
                    audioManager.setMode(3);
                }
                navigation.joinCall(conversation);
            }

            
            {
                this$0 = ChatActivity.this;
                super();
            }
        });
        return true;
_L22:
        conversation.retireFrom();
        finish();
        return true;
_L20:
        menuitem = navigation.intentFor(conversation, com/skype/android/app/main/EditPropertyActivity);
        menuitem.putExtra("com.skype.propkey", PROPKEY.CONVERSATION_META_TOPIC);
        startActivity(menuitem);
        return true;
_L10:
        conversationUtil.a(conversation);
        return true;
_L11:
        conversationUtil.b(conversation);
        return true;
_L7:
        chat.addParticipants();
        return true;
_L5:
        chat.toggleMessageAreaForSMS(true);
        return true;
_L6:
        chat.toggleMessageAreaForSMS(false);
        return true;
_L12:
        startActivity(navigation.intentFor(contact, com/skype/android/app/contacts/ContactEditActivity));
        return true;
_L23:
        conversation.setAlertString("");
        return true;
_L24:
        conversation.setAlertString("=");
        return true;
_L8:
        chat.setMarkedUnread(true);
        conversation.markUnread();
        navigateToHub();
        return true;
_L9:
        if (contact != null)
        {
            scheduleCall();
            return true;
        }
        if (true) goto _L1; else goto _L25
_L25:
    }

    protected void onPause()
    {
        super.onPause();
        supportInvalidateOptionsMenu();
        chat.setVisibleOnScreen(false);
        if (spinner != null)
        {
            spinner.onDetachedFromWindow();
        }
        chat.setMyTextStatusToReading();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        int i;
        boolean flag;
        boolean flag3;
        Object obj;
        boolean flag1;
        boolean flag4;
        if (conversation.getTypeProp() != com.skype.Conversation.TYPE.DIALOG)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        flag3 = conversationUtil.i(conversation);
        flag4 = conversationUtil.f(conversation);
        if (ConversationUtil.g(conversation) && !ContactUtil.g(contact))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (conversation.getLocalLiveStatusProp() == com.skype.Conversation.LOCAL_LIVESTATUS.OTHERS_ARE_LIVE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag3 && !flag)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        setVisible(menu, 0x7f1005cb, flag3);
        if (conversationUtil.j(conversation) && !ecsConfiguration.isViMIconVisibleInChatPage())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        setVisible(menu, 0x7f1005cd, flag3);
        if (flag4 && !flag)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        setVisible(menu, 0x7f1005cc, flag3);
        setVisible(menu, 0x7f1005d0, flag1);
        setVisible(menu, 0x7f1005d1, ConversationUtil.c(conversation));
        if (conversation.getPinnedOrderProp() > 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag4)
        {
            spinner = (CallActionSpinner)k.a(menu.findItem(0x7f1005cc));
            spinner.setContact(contact, conversation, conversationUtil, contactUtil);
            spinner.setOnItemSelectedListener(this);
            spinner.setVisibility(0);
        }
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_833;
        }
        flag = ContactUtil.g(contact);
        if (!contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.ALL_BUDDIES) || contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.UNKNOWN_OR_PENDINGAUTH_BUDDIES)) goto _L2; else goto _L1
_L1:
        setVisible(menu, 0x7f1005d0, flag1);
        obj = menu.findItem(0x7f1005d3);
        if (!flag3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((MenuItem) (obj)).setVisible(flag);
        menu.findItem(0x7f1005d4).setVisible(flag3);
        if (contact.getType() != com.skype.Contact.TYPE.SKYPE || ContactUtil.a(contact))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L4; else goto _L3
_L3:
        setVisible(menu, 0x7f1005d9, false);
_L6:
        i = 0x7f1005d8;
        flag = false;
_L7:
        setVisible(menu, i, flag);
        if (!ContactUtil.a(contact) && !ContactUtil.p(contact))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setVisible(menu, 0x7f1005d5, flag);
_L8:
        obj = ecsConfiguration.getExperimentCalendarIntegrationGroupTag();
        if (obj != ExperimentTag.a)
        {
            setVisible(menu, 0x7f1005d2, true);
            obj = new ExperimentTelemetryEvent(ExperimentEvent.b, ((ExperimentTag) (obj)));
            analytics.a(((ExperimentTelemetryEvent) (obj)));
        }
_L9:
        if (accessibility.a())
        {
            AccessibilityUtil.a(menu.findItem(0x7f1005cb), 0x7f080096);
        }
        if (layoutExperience.isMultipane() && ViewUtil.a(this))
        {
            AccessibilityUtil.a(menu.findItem(0x7f1005d0), 0x7f08010d);
        }
        flag1 = chat.isSendSMSOptionAvailable();
        boolean flag2;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        if (!chat.isInSMSMode() && flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setVisible(menu, 0x7f1005ce, flag);
        if (chat.isInSMSMode() && flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setVisible(menu, 0x7f1005cf, flag);
        setVisible(menu, 0x7f1005db, ConversationUtil.a(conversation, com.skype.Conversation.CAPABILITY.CAN_RING));
        return true;
_L4:
        flag = ContactUtil.h(contact);
        setVisible(menu, 0x7f1005d9, flag);
        if (flag) goto _L6; else goto _L5
_L5:
        i = 0x7f1005d8;
        flag = true;
          goto _L7
_L2:
        setVisible(menu, 0x7f1005d7, true);
        if (!contactUtil.i(contact))
        {
            setVisible(menu, 0x7f1005d6, flag);
        }
        setVisible(menu, 0x7f1005d3, false);
        setVisible(menu, 0x7f1005d4, flag3);
        setVisible(menu, 0x7f1005d9, false);
        setVisible(menu, 0x7f1005d8, false);
        setVisible(menu, 0x7f1005d5, false);
        setVisible(menu, 0x7f1005da, false);
        setVisible(menu, 0x7f1005d0, false);
          goto _L8
        flag2 = conversation.getIsP2pMigratedProp();
        flag5 = ConversationUtil.a(conversation, com.skype.Conversation.CAPABILITY.CAN_CHANGE_TOPIC);
        flag6 = ConversationUtil.a(conversation, com.skype.Conversation.CAPABILITY.CAN_RETIRE);
        flag7 = ConversationUtil.w(conversation);
        if (!flag3 && !flag2 && layoutExperience.isMultipane())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        setVisible(menu, 0x7f1005d3, flag2);
        if (flag3 && layoutExperience.isMultipane())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        setVisible(menu, 0x7f1005d4, flag2);
        setVisible(menu, 0x7f1005e0, flag);
        setVisible(menu, 0x7f1005e1, flag5);
        setVisible(menu, 0x7f1005e3, flag6);
        setVisible(menu, 0x7f1005e4, flag7);
        if (!flag7)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setVisible(menu, 0x7f1005e5, flag);
          goto _L9
    }

    protected void onResume()
    {
        super.onResume();
        supportInvalidateOptionsMenu();
        updateTitle();
        if (accessibility.a())
        {
            setTitle(getString(0x7f080072, new Object[] {
                conversationUtil.m(conversation)
            }));
        }
        if (!isFinishing())
        {
            handleLiveConversation(false);
        }
        chat.setVisibleOnScreen(true);
        if (conversation.getTypeProp() != com.skype.Conversation.TYPE.DIALOG)
        {
            updateActionBarForGroup();
        }
        if (chat.isMessageAreaEmpty())
        {
            if (getIntent().getBooleanExtra("is_writing", false))
            {
                chat.setMyTextStatusToWriting();
                chat.showKeyboard();
                getIntent().removeExtra("is_writing");
            } else
            {
                chat.setMyTextStatusToReading();
            }
        } else
        {
            chat.setMyTextStatusToWriting();
        }
        StartupTimeReporter.a().a(com.skype.android.util.StartupTimeReporter.CheckPoint.f, telemetryHelper);
    }

    public Object onRetainCustomNonConfigurationInstance()
    {
        return Boolean.valueOf(true);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("were_pending_auth", werePendingAuth);
    }

    protected void onStart()
    {
        super.onStart();
        cqfManager.uploadSubmittedAndExpired();
    }

    protected void onStop()
    {
        super.onStop();
        cqfManager.uploadSubmittedAndExpired();
    }



}
