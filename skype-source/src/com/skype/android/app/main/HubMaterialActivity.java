// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.k;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.a;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Property;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.ConversationImpl;
import com.skype.SkyLib;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.ads.AdParent;
import com.skype.android.ads.AdPlacer;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.app.ListItemMenuDialog;
import com.skype.android.app.Navigation;
import com.skype.android.app.chat.AddParticipantsAccessibilityFragment;
import com.skype.android.app.chat.AddParticipantsActivity;
import com.skype.android.app.chat.ChatServiceMonitor;
import com.skype.android.app.contacts.ContactDirectorySearchActivity;
import com.skype.android.app.contacts.ContactPickerFragment;
import com.skype.android.app.contacts.ConversationAdapter;
import com.skype.android.app.contacts.PickerActivity;
import com.skype.android.app.data.OnUserEventListener;
import com.skype.android.app.dialer.DialpadActivity;
import com.skype.android.app.recents.EditModeBar;
import com.skype.android.app.recents.EditModeBarProvider;
import com.skype.android.app.recents.EditModeListener;
import com.skype.android.app.recents.Recent;
import com.skype.android.app.search.AgentProvisioningServiceClient;
import com.skype.android.app.search.AgentSyncWaiter;
import com.skype.android.app.search.ContactSearchResultAdapter;
import com.skype.android.app.search.ConversationsSearchResultAdapter;
import com.skype.android.app.search.MessagesSearchResultAdapter;
import com.skype.android.app.search.SearchMultipleSourceAdapter;
import com.skype.android.app.search.SearchWidget;
import com.skype.android.app.search.SuggestedAgentsAdapter;
import com.skype.android.app.settings.SnoozeNotificationHelper;
import com.skype.android.app.shortcircuit.PromotedSCDContactsManager;
import com.skype.android.app.vim.VideoMessageRecorderActivity;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.update.UpdateManager;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.PropertyAnimationUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.PendingKeyboardDismissal;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.ViewPagerWrapper;
import com.skype.android.widget.fabmenu.FabMenu;
import com.skype.android.widget.fabmenu.FabMenuItem;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.app.main:
//            AbstractHubActivity, HubPagerAdapterMaterial, OnDrawerVisibilityChanged, HubSectionMaterial

public class HubMaterialActivity extends AbstractHubActivity
    implements android.support.v4.view.ViewPager.f, android.support.v4.widget.DrawerLayout.f, OnUserEventListener, EditModeBarProvider, EditModeListener, AsyncCallback, com.skype.android.widget.fabmenu.FabMenu.FabMenuCallback
{

    private static final int DRAWER_PARALLAX_INTENSITY = 6;
    private static final String FAB_ANALYTICS_MENU_CHAT = "Chat";
    private static final String FAB_ANALYTICS_MENU_VIDEO_CALL = "Video Call";
    private static final String FAB_ANALYTICS_MENU_VIDEO_MESSAGE = "Video Message";
    private static final String FAB_ANALYTICS_MENU_VOICE_CALL = "Voice Call";
    public static final int REQUEST_AUDIO_CALL_RESULT = 3;
    public static final int REQUEST_VIDEO_CALL_RESULT = 4;
    public static final int REQUEST_VIDEO_RECORD_RESULT = 1;
    public static final int REQUEST_VIDEO_REVIEW_RESULT = 2;
    private static final int SEARCH_ANIMATION_DURATION = 160;
    AgentProvisioningServiceClient agentProvisioningServiceClient;
    AgentSyncWaiter agentSyncWaiter;
    AppBarLayout appBarLayout;
    AsyncService async;
    ChatServiceMonitor chatServiceMonitor;
    ContactSearchResultAdapter contactSearchResultAdapter;
    PromotedSCDContactsManager contactsManager;
    ConversationAdapter conversationAdapter;
    ConversationsSearchResultAdapter conversationsSearchResultAdapter;
    CoordinatorLayout coordinatorLayout;
    DrawerLayout drawerLayout;
    private a drawerToggle;
    EcsConfiguration ecsConfiguration;
    EditModeBar editModeBar;
    EventBus eventBus;
    FabMenu fabMenu;
    InputMethodManager imm;
    ObjectIdMap map;
    MessagesSearchResultAdapter messagesSearchResultAdapter;
    TextView notificationBanner;
    private MenuItem searchMenuItem;
    SearchMultipleSourceAdapter searchMultipleSourceAdapter;
    private SearchView searchView;
    SearchWidget searchWidget;
    View shadowLine;
    SymbolView skypeLogo;
    private ObjectAnimator skypeLogoAnimator;
    private SnoozeNotificationHelper snoozeNotificationHelper;
    SuggestedAgentsAdapter suggestedAgentsAdapter;
    TabLayout tabLayout;
    private com.skype.android.util.PropertyAnimationUtil.HeightAnimation tabLayoutAnimation;
    Toolbar toolBar;
    private int unreadCount;
    ViewPagerWrapper viewPager;

    public HubMaterialActivity()
    {
    }

    private transient void callContactsByConversation(int i, int ai[])
    {
label0:
        {
            String as[] = new String[ai.length];
            for (int j = 0; j < ai.length; j++)
            {
                as[j] = ((Contact)map.a(ai[j], com/skype/Contact)).getIdentity();
            }

            ai = new ConversationImpl();
            if (lib.getConversationByParticipants(as, ai, true))
            {
                if (i != 3)
                {
                    break label0;
                }
                navigation.placeCall(ai);
            }
            return;
        }
        navigation.placeCallWithVideo(ai);
    }

    private void cancelSearchMode(int i)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofObject(toolBar, "backgroundColor", new ArgbEvaluator(), new Object[] {
            Integer.valueOf(getResources().getColor(0x7f0f0135)), Integer.valueOf(getResources().getColor(0x7f0f00d3))
        });
        objectanimator.setDuration(i);
        objectanimator.start();
        searchWidget.setVisibility(8);
        tabLayoutAnimation.a(i);
        tabLayoutAnimation.a();
        viewPager.setVisibility(0);
        fabMenu.setVisibility(0);
        ((android.support.design.widget.AppBarLayout.LayoutParams)toolBar.getLayoutParams()).a(5);
    }

    private void configureViewPagerTabs(HubPagerAdapterMaterial hubpageradaptermaterial)
    {
        viewPager.a(new android.support.v4.view.ViewPager.f() {

            final HubMaterialActivity this$0;

            public final void onPageScrollStateChanged(int j)
            {
            }

            public final void onPageScrolled(int j, float f, int l)
            {
            }

            public final void onPageSelected(int j)
            {
                handlePageAnalytics(j);
                android.support.design.widget.TabLayout.c c1 = tabLayout.a(j);
                if (c1 != null)
                {
                    c1.e();
                }
            }

            
            {
                this$0 = HubMaterialActivity.this;
                super();
            }
        });
        for (int i = 0; i < tabLayout.a(); i++)
        {
            android.support.design.widget.TabLayout.c c = tabLayout.a(i);
            if (c == null)
            {
                continue;
            }
            View view = hubpageradaptermaterial.getView(i);
            c.a(view);
            if (i == 0)
            {
                view.setSelected(true);
                ((ViewGroup)view.getParent()).setOnLongClickListener(new android.view.View.OnLongClickListener() {

                    final HubMaterialActivity this$0;

                    public final boolean onLongClick(View view1)
                    {
                        ListItemMenuDialog.create(new com.skype.android.app.ListItemMenuDialog.MenuCallback() {

                            final _cls5 this$1;

                            public final boolean onContextItemSelected(MenuItem menuitem, int i)
                            {
                                switch (menuitem.getItemId())
                                {
                                default:
                                    return false;

                                case 2131756536: 
                                    lib.consumeAllConversations();
                                    break;
                                }
                                return true;
                            }

                            public final void onCreateContextMenu(Menu menu, int i)
                            {
                                getMenuInflater().inflate(0x7f11001f, menu);
                                menu = menu.findItem(0x7f1005f8);
                                boolean flag;
                                if (unreadCount != 0)
                                {
                                    flag = true;
                                } else
                                {
                                    flag = false;
                                }
                                menu.setEnabled(flag);
                            }

            
            {
                this$1 = _cls5.this;
                super();
            }
                        }, getResources().getQuantityString(0x7f0b0003, unreadCount, new Object[] {
                            Integer.valueOf(unreadCount)
                        }), 0).show(getSupportFragmentManager());
                        return false;
                    }

            
            {
                this$0 = HubMaterialActivity.this;
                super();
            }
                });
            }
        }

    }

    private void handleIntent(Intent intent)
    {
        if (intent.hasExtra("com.skype.index") && viewPager != null)
        {
            viewPager.setCurrentItem(intent.getIntExtra("com.skype.index", 0));
        }
    }

    private void handleNotificationBanner(com.skype.android.app.chat.ChatServiceMonitor.ChatServiceEventProp chatserviceeventprop, boolean flag)
    {
        if (flag)
        {
            notificationBanner.setText(getString(chatserviceeventprop.getTextId()));
            notificationBanner.setBackgroundColor(getResources().getColor(chatserviceeventprop.getColorId()));
            notificationBanner.setVisibility(0);
            return;
        } else
        {
            notificationBanner.setVisibility(8);
            return;
        }
    }

    private void recordVideoMessageFirst()
    {
        Intent intent = navigation.intentFor(null, com/skype/android/app/vim/VideoMessageRecorderActivity);
        intent.putExtra("EXTRA_RECORD_VIDEO_FIRST", true);
        startActivityForResult(intent, 1);
    }

    private void sendFABMenuItemTapEvent(String s)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.S, s);
        analytics.a(AnalyticsEvent.y, analyticsparametercontainer);
    }

    private void setupSearch(Menu menu)
    {
        new PropertyAnimationUtil();
        tabLayoutAnimation = PropertyAnimationUtil.e(tabLayout);
        searchMenuItem = menu.findItem(0x7f1005e9);
        k.a(searchMenuItem, new android.support.v4.view.k.e() {

            final HubMaterialActivity this$0;

            public final boolean onMenuItemActionCollapse(MenuItem menuitem)
            {
                if (searchWidget.onInterceptBackButton())
                {
                    return false;
                } else
                {
                    cancelSearchMode(160);
                    return true;
                }
            }

            public final boolean onMenuItemActionExpand(MenuItem menuitem)
            {
                switchToSearchMode(160);
                return true;
            }

            
            {
                this$0 = HubMaterialActivity.this;
                super();
            }
        });
        searchView = (SearchView)searchMenuItem.getActionView();
        searchWidget.setSearchView(searchView);
    }

    private void switchToSearchMode(int i)
    {
        if (searchWidget.getVisibility() != 0)
        {
            ObjectAnimator objectanimator = ObjectAnimator.ofObject(toolBar, "backgroundColor", new ArgbEvaluator(), new Object[] {
                Integer.valueOf(getResources().getColor(0x7f0f00d3)), Integer.valueOf(getResources().getColor(0x7f0f0135))
            });
            objectanimator.setDuration(i);
            objectanimator.start();
            searchWidget.setVisibility(0);
            searchWidget.resetSearch();
            tabLayoutAnimation.a(i);
            tabLayoutAnimation.b();
            viewPager.setVisibility(8);
            fabMenu.setVisibility(8);
            ((android.support.design.widget.AppBarLayout.LayoutParams)toolBar.getLayoutParams()).a(0);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
label0:
        {
label1:
            {
                if (keyevent.getKeyCode() != 82)
                {
                    break label0;
                }
                if (1 == keyevent.getAction())
                {
                    if (!drawerLayout.c())
                    {
                        break label1;
                    }
                    drawerLayout.b();
                }
                return true;
            }
            drawerLayout.a();
            return true;
        }
        return super.dispatchKeyEvent(keyevent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        try
        {
            flag = super.dispatchTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            return false;
        }
        return flag;
    }

    public void done(AsyncResult asyncresult)
    {
        asyncresult = (List)asyncresult.a();
        conversationAdapter.setData(asyncresult, searchView.e());
    }

    public EditModeBar getEditModeBar()
    {
        return editModeBar;
    }

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 1: // '\001'
            int i = ((Integer)message.obj).intValue();
            if (unreadCount != i)
            {
                unreadCount = i;
                message = tabLayout.a(0);
                if (message != null)
                {
                    message = (TextView)message.a().findViewById(0x7f100543);
                    message.setText(Integer.toString(unreadCount));
                    if (unreadCount == 0)
                    {
                        message.setVisibility(8);
                    } else
                    {
                        message.setVisibility(0);
                    }
                }
            }
            return true;

        case 2: // '\002'
            return true;

        case 3: // '\003'
            break;
        }
        if (accessibility.a())
        {
            message = tabLayout.a(0);
            if (message != null)
            {
                message = (SymbolView)message.a().findViewById(0x7f100542);
                String s = (new StringBuilder()).append(getString(0x7f080312)).append(", ").append(getResources().getQuantityString(0x7f0b0003, unreadCount, new Object[] {
                    Integer.valueOf(unreadCount)
                })).toString();
                message.setContentDescription(s);
                AccessibilityUtil.b(message, s);
            }
        }
        return true;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        i;
        JVM INSTR tableswitch 1 4: default 32
    //                   1 40
    //                   2 61
    //                   3 85
    //                   4 85;
           goto _L1 _L2 _L3 _L4 _L4
_L1:
        super.onActivityResult(i, j, intent);
_L6:
        return;
_L2:
        if (j == -1)
        {
            intent.putExtra("EXTRA_RECORD_VIDEO_FIRST", true);
            startActivityForResult(intent, 2);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (j == 0 && intent != null && intent.getBooleanExtra("EXTRA_RERECORD_VIDEO", false))
        {
            recordVideoMessageFirst();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (j == -1)
        {
            intent = intent.getIntArrayExtra("com.skype.objIds");
            if (intent != null && intent.length > 0)
            {
                if (ConversationUtil.b(lib))
                {
                    callContactsByConversation(i, intent);
                    return;
                } else
                {
                    callContactsByConversation(i, new int[] {
                        intent[0]
                    });
                    return;
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onBackPressed()
    {
        if (drawerLayout.c())
        {
            drawerLayout.b();
        } else
        {
            if (editModeBar.getVisibility() == 0)
            {
                editModeBar.dismiss();
                return;
            }
            if (!fabMenu.a())
            {
                super.onBackPressed();
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        if (!getResources().getBoolean(0x7f0d0003))
        {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
        getComponent().inject(this);
        toolBar.setNavigationIcon(0x7f020180);
        toolBar.setTitle("");
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            bundle = (android.support.design.widget.CoordinatorLayout.d)shadowLine.getLayoutParams();
            shadowLine.setVisibility(0);
            bundle.a();
            bundle.d = 80;
            bundle.c = 80;
            shadowLine.setLayoutParams(bundle);
        }
        fabMenu.setCallback(this);
        setSupportActionBar(toolBar);
        drawerLayout.setDrawerListener(this);
        drawerLayout.setScrimColor(getResources().getColor(0x7f0f0022));
        drawerToggle = new a(this, drawerLayout, toolBar, 0, 0) {

            final HubMaterialActivity this$0;

            public final void onDrawerClosed(View view)
            {
                super.onDrawerClosed(view);
            }

            public final void onDrawerOpened(View view)
            {
                super.onDrawerOpened(view);
            }

            
            {
                this$0 = HubMaterialActivity.this;
                super(activity, drawerlayout, toolbar, i, j);
            }
        };
        bundle = new HubPagerAdapterMaterial(this, getSupportFragmentManager());
        viewPager.setAdapter(bundle);
        viewPager.a(this);
        viewPager.setOffscreenPageLimit(2);
        tabLayout.setupWithViewPager(viewPager);
        configureViewPagerTabs(bundle);
        updateManager.a(this);
        handleIntent(getIntent());
        for (int i = 0; i < appBarLayout.getChildCount(); i++)
        {
            bundle = appBarLayout.getChildAt(i);
            if (!bundle.isClickable())
            {
                bundle.setOnTouchListener(new android.view.View.OnTouchListener() {

                    final HubMaterialActivity this$0;

                    public final boolean onTouch(View view, MotionEvent motionevent)
                    {
                        return true;
                    }

            
            {
                this$0 = HubMaterialActivity.this;
                super();
            }
                });
            }
        }

        skypeLogo.setOnTouchListener(new android.view.View.OnTouchListener() {

            final HubMaterialActivity this$0;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                boolean flag = true;
                motionevent.getAction();
                JVM INSTR tableswitch 0 3: default 36
            //                           0 40
            //                           1 142
            //                           2 36
            //                           3 142;
                   goto _L1 _L2 _L3 _L1 _L3
_L1:
                flag = false;
_L5:
                return flag;
_L2:
                analytics.c(AnalyticsEvent.dg);
                if (skypeLogoAnimator != null)
                {
                    skypeLogoAnimator.cancel();
                }
                skypeLogo.animate().scaleX(1.25F).scaleY(1.25F).setDuration(200L).setInterpolator(new DecelerateInterpolator());
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    skypeLogo.animate().withEndAction(new Runnable() {

                        final _cls3 this$1;

                        public final void run()
                        {
                            PropertyValuesHolder propertyvaluesholder = PropertyValuesHolder.ofFloat(View.SCALE_X.getName(), new float[] {
                                1.25F, 1.15F
                            });
                            PropertyValuesHolder propertyvaluesholder1 = PropertyValuesHolder.ofFloat(View.SCALE_Y.getName(), new float[] {
                                1.25F, 1.15F
                            });
                            if (skypeLogoAnimator != null)
                            {
                                skypeLogoAnimator.cancel();
                            }
                            skypeLogoAnimator = ObjectAnimator.ofPropertyValuesHolder(skypeLogo, new PropertyValuesHolder[] {
                                propertyvaluesholder, propertyvaluesholder1
                            });
                            skypeLogoAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                            skypeLogoAnimator.setRepeatMode(2);
                            skypeLogoAnimator.setRepeatCount(-1);
                            skypeLogoAnimator.setDuration(500L);
                            skypeLogoAnimator.start();
                        }

            
            {
                this$1 = _cls3.this;
                super();
            }
                    });
                    return true;
                }
                continue; /* Loop/switch isn't completed */
_L3:
                if (skypeLogoAnimator != null)
                {
                    skypeLogoAnimator.cancel();
                }
                skypeLogo.animate().scaleX(1.0F).scaleY(1.0F).setInterpolator(new BounceInterpolator()).setDuration(600L);
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    skypeLogo.animate().withEndAction(null);
                    return true;
                }
                if (true) goto _L5; else goto _L4
_L4:
            }

            
            {
                this$0 = HubMaterialActivity.this;
                super();
            }
        });
        searchWidget.init(contactUtil, imageCache, userPrefs, navigation, contactsManager, eventBus, searchMultipleSourceAdapter, conversationsSearchResultAdapter, contactSearchResultAdapter, messagesSearchResultAdapter, async, lib, imm, agentProvisioningServiceClient, suggestedAgentsAdapter, ecsConfiguration, agentSyncWaiter);
        snoozeNotificationHelper = new SnoozeNotificationHelper(getApplicationContext());
        snoozeNotificationHelper.createNotificationBannerView(notificationBanner, false);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f110018, menu);
        setupSearch(menu);
        return true;
    }

    public void onDrawerClosed(View view)
    {
        EventBusInstance.a().a(new OnDrawerVisibilityChanged(false));
        snoozeNotificationHelper.handleSnoozeNotificationBanner(notificationBanner, false);
    }

    public void onDrawerOpened(View view)
    {
        EventBusInstance.a().a(new OnDrawerVisibilityChanged(true));
    }

    public void onDrawerSlide(View view, float f)
    {
        f = (float)(viewPager.getWidth() / 6) * f;
        coordinatorLayout.setTranslationX(f);
        fabMenu.setTranslationX(f);
    }

    public void onDrawerStateChanged(int i)
    {
    }

    public void onEditModeChanged(boolean flag)
    {
        byte byte1 = 8;
        boolean flag1 = false;
        Object obj = tabLayout;
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((TabLayout) (obj)).setVisibility(byte0);
        obj = editModeBar;
        byte0 = byte1;
        if (flag)
        {
            byte0 = 0;
        }
        ((EditModeBar) (obj)).setVisibility(byte0);
        obj = viewPager;
        if (!flag)
        {
            flag1 = true;
        }
        ((ViewPagerWrapper) (obj)).setSwipingAllowed(flag1);
    }

    void onEvent(com.skype.android.app.chat.ChatServiceMonitor.ChatServiceMonitorEvent chatservicemonitorevent)
    {
        handleNotificationBanner(chatservicemonitorevent.getProp(), chatservicemonitorevent.getShow());
    }

    public void onFabMenuItemSelected(int i)
    {
        i;
        JVM INSTR tableswitch 2131755920 2131755923: default 32
    //                   2131755920 41
    //                   2131755921 126
    //                   2131755922 205
    //                   2131755923 284;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        fabMenu.setExpanded(false);
        return;
_L2:
        sendFABMenuItemTapEvent("Chat");
        if (accessibility.a())
        {
            Intent intent = new Intent(this, com/skype/android/app/contacts/PickerActivity);
            intent.putExtra("fragmentClass", com/skype/android/app/chat/AddParticipantsAccessibilityFragment);
            intent.putExtra("CHECKBOX_MODE", true);
            intent.putExtra("CUSTOM_ACTION", com.skype.android.widget.SymbolElement.SymbolCode.aK);
            startActivity(intent);
        } else
        {
            startActivity(new Intent(this, com/skype/android/app/chat/AddParticipantsActivity));
        }
        continue; /* Loop/switch isn't completed */
_L3:
        sendFABMenuItemTapEvent("Voice Call");
        Intent intent1 = new Intent(this, com/skype/android/app/contacts/PickerActivity);
        intent1.putExtra("fragmentClass", com/skype/android/app/contacts/ContactPickerFragment);
        if (ConversationUtil.b(lib))
        {
            intent1.putExtra("CHECKBOX_MODE", true);
        }
        intent1.putExtra("CUSTOM_ACTION", com.skype.android.widget.SymbolElement.SymbolCode.u);
        intent1.putExtra("CUSTOM_TITLE", 0x7f08023e);
        startActivityForResult(intent1, 3);
        continue; /* Loop/switch isn't completed */
_L4:
        sendFABMenuItemTapEvent("Video Call");
        Intent intent2 = new Intent(this, com/skype/android/app/contacts/PickerActivity);
        intent2.putExtra("fragmentClass", com/skype/android/app/contacts/ContactPickerFragment);
        if (ConversationUtil.b(lib))
        {
            intent2.putExtra("CHECKBOX_MODE", true);
        }
        intent2.putExtra("CUSTOM_ACTION", com.skype.android.widget.SymbolElement.SymbolCode.w);
        intent2.putExtra("CUSTOM_TITLE", 0x7f08023e);
        startActivityForResult(intent2, 4);
        continue; /* Loop/switch isn't completed */
_L5:
        sendFABMenuItemTapEvent("Video Message");
        recordVideoMessageFirst();
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void onFabMenuStateChange(boolean flag)
    {
    }

    public volatile void onItemChecked(android.support.v7.widget.RecyclerView.v v, Object obj, boolean flag)
    {
        onItemChecked((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, obj, flag);
    }

    public void onItemChecked(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, Object obj, boolean flag)
    {
    }

    public volatile void onItemClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
    {
        onItemClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
    }

    public void onItemClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
    {
        i = ((Recent)obj).getConversationObjectId();
        (new PendingKeyboardDismissal(searchView, i) {

            final HubMaterialActivity this$0;
            final int val$objectId;

            protected final void proceed()
            {
                ConversationImpl conversationimpl = new ConversationImpl();
                lib.getConversation(objectId, conversationimpl);
                navigation.chat(conversationimpl);
            }

            
            {
                this$0 = HubMaterialActivity.this;
                objectId = i;
                super(final_inputmethodmanager, view);
            }
        }).hideKeyboardAndProceed();
    }

    public volatile boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
    {
        return onItemLongClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
    }

    public boolean onItemLongClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
    {
        return false;
    }

    public void onMainFabClick()
    {
        HubSectionMaterial hubsectionmaterial = HubSectionMaterial.forIndex(viewPager.b());
        static final class _cls9
        {

            static final int $SwitchMap$com$skype$android$app$main$HubSectionMaterial[];

            static 
            {
                $SwitchMap$com$skype$android$app$main$HubSectionMaterial = new int[HubSectionMaterial.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$main$HubSectionMaterial[HubSectionMaterial.RECENTS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$main$HubSectionMaterial[HubSectionMaterial.CONTACTS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$main$HubSectionMaterial[HubSectionMaterial.DIALER.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls9..SwitchMap.com.skype.android.app.main.HubSectionMaterial[hubsectionmaterial.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            fabMenu.b();
            return;

        case 2: // '\002'
            analytics.c(AnalyticsEvent.z);
            startActivity(new Intent(this, com/skype/android/app/contacts/ContactDirectorySearchActivity));
            return;

        case 3: // '\003'
            analytics.c(AnalyticsEvent.A);
            break;
        }
        startActivity(new Intent(this, com/skype/android/app/dialer/DialpadActivity));
    }

    public void onNewIntent(Intent intent)
    {
        handleIntent(intent);
    }

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        fabMenu.c().animate().scaleY(0.0F).scaleX(0.0F).setInterpolator(new AccelerateInterpolator()).setDuration(100L).setListener(new AnimatorListenerAdapter() {

            final HubMaterialActivity this$0;

            public final void onAnimationEnd(Animator animator)
            {
                animator = HubSectionMaterial.forIndex(viewPager.b());
                _cls9..SwitchMap.com.skype.android.app.main.HubSectionMaterial[animator.ordinal()];
                JVM INSTR tableswitch 1 3: default 48
            //                           1 91
            //                           2 135
            //                           3 179;
                   goto _L1 _L2 _L3 _L4
_L1:
                fabMenu.c().animate().scaleY(1.0F).scaleX(1.0F).setListener(null).setDuration(100L).setInterpolator(new DecelerateInterpolator());
                return;
_L2:
                fabMenu.c().setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.cc);
                fabMenu.c().setContentDescription(getResources().getString(0x7f08006e));
                continue; /* Loop/switch isn't completed */
_L3:
                fabMenu.c().setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.an);
                fabMenu.c().setContentDescription(getResources().getString(0x7f08004b));
                continue; /* Loop/switch isn't completed */
_L4:
                fabMenu.c().setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.y);
                fabMenu.c().setContentDescription(getResources().getString(0x7f080118));
                if (true) goto _L1; else goto _L5
_L5:
            }

            
            {
                this$0 = HubMaterialActivity.this;
                super();
            }
        });
        adPlacer.a(AdParent.a, HubSectionMaterial.forIndex(viewPager.b()).getAdPlacement());
    }

    public void onPause()
    {
        if (viewPager != null)
        {
            handlePageAnalytics(-2);
        }
        super.onPause();
    }

    public void onPrepareFabMenu(List list)
    {
        HubSectionMaterial hubsectionmaterial = HubSectionMaterial.forIndex(viewPager.b());
        _cls9..SwitchMap.com.skype.android.app.main.HubSectionMaterial[hubsectionmaterial.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 45
    //                   2 103
    //                   3 103;
           goto _L1 _L2 _L3 _L3
_L1:
        return;
_L2:
        list = list.iterator();
        while (list.hasNext()) 
        {
            FabMenuItem fabmenuitem = (FabMenuItem)list.next();
            if (fabmenuitem.getId() == 0x7f100393)
            {
                fabmenuitem.setEnabled(ecsConfiguration.isViMFABButtonEnabled());
            } else
            {
                fabmenuitem.setEnabled(true);
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        list = list.iterator();
        while (list.hasNext()) 
        {
            ((FabMenuItem)list.next()).setEnabled(false);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void onResume()
    {
        super.onResume();
        if (viewPager != null)
        {
            handlePageAnalytics(viewPager.b());
        }
        com.skype.android.app.chat.ChatServiceMonitor.ChatServiceMonitorEvent chatservicemonitorevent = chatServiceMonitor.getCurrentBanner();
        handleNotificationBanner(chatservicemonitorevent.getProp(), chatservicemonitorevent.getShow());
        snoozeNotificationHelper.handleSnoozeNotificationBanner(notificationBanner, false);
    }

    protected void onStop()
    {
        if (searchMenuItem != null)
        {
            cancelSearchMode(0);
            searchMenuItem.collapseActionView();
        }
        super.onStop();
    }

    protected void updateAvailability()
    {
    }

    protected void updateAvatar()
    {
    }

    protected void updateMood()
    {
    }



/*
    static ObjectAnimator access$002(HubMaterialActivity hubmaterialactivity, ObjectAnimator objectanimator)
    {
        hubmaterialactivity.skypeLogoAnimator = objectanimator;
        return objectanimator;
    }

*/



}
