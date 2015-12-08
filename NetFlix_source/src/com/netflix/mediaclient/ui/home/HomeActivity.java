// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.home;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.widget.DrawerLayout;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.FragmentHostActivity;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.osp.ActionBarDrawerToggle;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.service.webclient.model.leafs.ListOfGenreSummary;
import com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging;
import com.netflix.mediaclient.servicemgr.GenreList;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.IPushNotification;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.ui.kids.lolomo.KidsHomeActivity;
import com.netflix.mediaclient.ui.kids.lolomo.KidsSlidingMenuAdapter;
import com.netflix.mediaclient.ui.lolomo.LoLoMoFrag;
import com.netflix.mediaclient.ui.mdx.MdxMenu;
import com.netflix.mediaclient.ui.search.SearchMenu;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.StringUtils;
import java.util.Collection;
import java.util.LinkedList;

// Referenced classes of package com.netflix.mediaclient.ui.home:
//            SlidingMenuAdapter, SocialOptInDialogFrag

public class HomeActivity extends FragmentHostActivity
    implements SocialOptInDialogFrag.OptInResponseHandler, com.netflix.mediaclient.android.widget.ViewRecycler.ViewRecyclerProvider
{

    private static final long ACTIVITY_RESUME_TIMEOUT_MS = 0x1b77400L;
    private static final String EXTRA_BACK_STACK_INTENTS = "extra_back_stack_intents";
    private static final String EXTRA_GENRE_ID = "genre_id";
    private static final String EXTRA_GENRE_PARCEL = "genre_parcel";
    public static final String REFRESH_HOME_LOLOMO = "com.netflix.mediaclient.intent.action.REFRESH_HOME_LOLOMO";
    private static final String TAG = "HomeActivity";
    private final LinkedList backStackIntents = new LinkedList();
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggler;
    private GenreList genre;
    private String genreId;
    private MenuItem kidsEntryItem;
    private long mStartedTimeMs;
    private ServiceManager manager;
    private final ManagerStatusListener managerStatusListener = new ManagerStatusListener() {

        final HomeActivity this$0;

        public void onManagerReady(ServiceManager servicemanager, int i)
        {
            Log.v("HomeActivity", "ServiceManager ready");
            manager = servicemanager;
            showProfileToast();
            reportUiViewChanged(getCurrentViewType());
            getPrimaryFrag().onManagerReady(servicemanager, i);
            slidingMenuAdapter.onManagerReady(servicemanager, i);
            KidsUtils.updateKidsMenuItem(HomeActivity.this, kidsEntryItem);
            setLoadingStatusCallback(new com.netflix.mediaclient.android.app.LoadingStatus.LoadingStatusCallback() {

                final _cls2 this$1;

                public void onDataLoaded(int i)
                {
                    Log.d("HomeActivity", "LOLOMO is loaded, report UI browse startup session ended in case this was on UI startup");
                    long l;
                    long l1;
                    boolean flag;
                    if (i >= 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    l = SystemClock.elapsedRealtime();
                    l1 = mStartedTimeMs;
                    getServiceManager().getClientLogging().getApplicationPerformanceMetricsLogging().endUiBrowseStartupSession(l - l1, flag, null);
                    setLoadingStatusCallback(null);
                }

            
            {
                this$1 = _cls2.this;
                super();
            }
            });
            if (shouldDisplayOptInDialog())
            {
                Log.d("HomeActivity", "Displaying opt-in dialog");
                servicemanager = SocialOptInDialogFrag.newInstance();
                servicemanager.setCancelable(false);
                showDialog(servicemanager);
            }
        }

        public void onManagerUnavailable(ServiceManager servicemanager, int i)
        {
            Log.w("HomeActivity", "ServiceManager unavailable");
            KidsUtils.updateKidsMenuItem(HomeActivity.this, kidsEntryItem);
            manager = null;
            getPrimaryFrag().onManagerUnavailable(servicemanager, i);
            slidingMenuAdapter.onManagerUnavailable(servicemanager, i);
            Log.d("HomeActivity", "LOLOMO failed, report UI startup session ended in case this was on UI startup");
        }

            
            {
                this$0 = HomeActivity.this;
                super();
            }
    };
    private long pauseTimeMs;
    private final BroadcastReceiver refreshHomeReceiver = new BroadcastReceiver() {

        final HomeActivity this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (intent == null)
            {
                Log.w("HomeActivity", "Received null intent");
            } else
            {
                context = intent.getAction();
                Log.i("HomeActivity", (new StringBuilder()).append("RefreshHomeReceiver inovoked and received Intent with Action ").append(context).toString());
                if ("com.netflix.mediaclient.intent.action.REFRESH_HOME_LOLOMO".equals(context))
                {
                    clearAllStateAndRefresh();
                    return;
                }
            }
        }

            
            {
                this$0 = HomeActivity.this;
                super();
            }
    };
    private SlidingMenuAdapter slidingMenuAdapter;
    private ViewRecycler viewRecycler;

    public HomeActivity()
    {
    }

    private void clearAllStateAndRefresh()
    {
        getServiceManager().flushCaches();
        getPrimaryFrag().refresh();
        slidingMenuAdapter.refresh();
    }

    public static Intent createShowIntent(NetflixActivity netflixactivity)
    {
        boolean flag = KidsUtils.shouldShowKidsExperience(netflixactivity);
        if (Log.isLoggable("HomeActivity", 2))
        {
            Log.v("HomeActivity", (new StringBuilder()).append("Creating home activity, showing kids experience: ").append(flag).toString());
        }
        Object obj;
        if (flag)
        {
            obj = com/netflix/mediaclient/ui/kids/lolomo/KidsHomeActivity;
        } else
        {
            obj = com/netflix/mediaclient/ui/home/HomeActivity;
        }
        return (new Intent(netflixactivity, ((Class) (obj)))).addFlags(0x4000000);
    }

    public static Intent createStartIntent(NetflixActivity netflixactivity)
    {
        return createShowIntent(netflixactivity).putExtra("genre_id", "lolomo");
    }

    private com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getCurrentViewType()
    {
        if (StringUtils.isEmpty(genreId))
        {
            return com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.homeScreen;
        }
        if ("lolomo".equals(genreId))
        {
            return com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.homeScreen;
        } else
        {
            return com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.browseTitles;
        }
    }

    private boolean handleNewIntent(Intent intent)
    {
        String s;
        boolean flag1;
        flag1 = true;
        s = intent.getStringExtra("genre_id");
        if (StringUtils.isEmpty(s))
        {
            Log.d("HomeActivity", "No new genre ID to show");
            return false;
        }
        if (Log.isLoggable("HomeActivity", 2))
        {
            Log.v("HomeActivity", (new StringBuilder()).append("Curr genre: ").append(genreId).append(", new genre: ").append(s).toString());
        }
        if (!s.equals(genreId)) goto _L2; else goto _L1
_L1:
        boolean flag;
        Log.i("HomeActivity", (new StringBuilder()).append("Asked to show genre that we're already showing - skipping: ").append(genreId).toString());
        flag = false;
_L4:
        if ("lolomo".equals(s))
        {
            backStackIntents.clear();
        }
        genreId = s;
        genre = (ListOfGenreSummary)intent.getParcelableExtra("genre_parcel");
        setIntent(intent);
        reportUiViewChanged(getCurrentViewType());
        return flag;
_L2:
        flag = flag1;
        if ("lolomo".equals(genreId))
        {
            Log.v("HomeActivity", (new StringBuilder()).append("Adding genre to back stack: ").append(genreId).toString());
            backStackIntents.add(getIntent());
            flag = flag1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void lockSlidingDrawer()
    {
        drawerLayout.setDrawerLockMode(1);
    }

    private void onResumeAfterTimeout()
    {
        Toast.makeText(this, 0x7f0c016e, 1).show();
        clearAllStateAndRefresh();
    }

    private void registerRefreshHomeReceiver()
    {
        registerReceiverWithAutoUnregister(refreshHomeReceiver, "com.netflix.mediaclient.intent.action.REFRESH_HOME_LOLOMO");
    }

    private boolean shouldDisplayOptInDialog()
    {
        if (manager.getPushNotification().wasNotificationOptInDisplayed())
        {
            Log.d("HomeActivity", "User was already prompted for opt-in to social");
            return false;
        }
        if (isDialogFragmentVisible())
        {
            Log.w("HomeActivity", "Dialog fragment is already displayed. There should only be one visible at time. Do NOT display opt-in to social.");
            return false;
        } else
        {
            Log.d("HomeActivity", "User was NOT prompted for opt-in to social and no dialogs are visible.");
            return true;
        }
    }

    public static void showGenreList(NetflixActivity netflixactivity, GenreList genrelist)
    {
        boolean flag = KidsUtils.shouldShowKidsExperience(netflixactivity);
        if (Log.isLoggable("HomeActivity", 2))
        {
            Log.v("HomeActivity", (new StringBuilder()).append("Showing genres list, kids experience: ").append(flag).toString());
        }
        Object obj;
        if (flag)
        {
            obj = com/netflix/mediaclient/ui/kids/lolomo/KidsHomeActivity;
        } else
        {
            obj = com/netflix/mediaclient/ui/home/HomeActivity;
        }
        netflixactivity.startActivity((new Intent(netflixactivity, ((Class) (obj)))).addFlags(0x4000000).putExtra("genre_id", genrelist.getId()).putExtra("genre_parcel", genrelist));
    }

    private void showNewFrag()
    {
        updateActionBar();
        setPrimaryFrag(createPrimaryFrag());
        getFragmentManager().beginTransaction().replace(0x7f0700b7, getPrimaryFrag(), "primary").setTransition(4099).commit();
        getFragmentManager().executePendingTransactions();
        getPrimaryFrag().onManagerReady(manager, 0);
    }

    private void toggleDrawer()
    {
        if (drawerLayout.isDrawerOpen(3))
        {
            LogUtils.reportUIViewCommand(this, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName.slidingMenuClosed, getUiScreen(), getDataContext());
            drawerLayout.closeDrawers();
            return;
        } else
        {
            LogUtils.reportUIViewCommand(this, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName.slidingMenuOpened, getUiScreen(), getDataContext());
            drawerLayout.openDrawer(3);
            return;
        }
    }

    private void unlockSlidingDrawerIfPossible()
    {
        if (isForKids())
        {
            lockSlidingDrawer();
            return;
        } else
        {
            drawerLayout.setDrawerLockMode(0);
            return;
        }
    }

    private void updateActionBar()
    {
        Object obj;
        NetflixActionBar netflixactionbar;
        if (genre == null)
        {
            obj = null;
        } else
        {
            obj = genre.getTitle();
        }
        Log.v("HomeActivity", (new StringBuilder()).append("Updating action bar, genre: ").append(((String) (obj))).toString());
        netflixactionbar = getNetflixActionBar();
        if (netflixactionbar != null)
        {
            netflixactionbar.setTitle(((String) (obj)));
            if (StringUtils.isEmpty(((String) (obj))))
            {
                obj = com.netflix.mediaclient.android.widget.NetflixActionBar.LogoType.FULL_SIZE;
            } else
            {
                obj = com.netflix.mediaclient.android.widget.NetflixActionBar.LogoType.GONE;
            }
            netflixactionbar.setLogoType(((com.netflix.mediaclient.android.widget.NetflixActionBar.LogoType) (obj)));
        }
    }

    protected ManagerStatusListener createManagerStatusListener()
    {
        return managerStatusListener;
    }

    protected volatile Fragment createPrimaryFrag()
    {
        return createPrimaryFrag();
    }

    protected NetflixFrag createPrimaryFrag()
    {
        return LoLoMoFrag.create(genreId, genre);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (getPrimaryFrag().dispatchKeyEvent(keyevent))
        {
            return true;
        } else
        {
            return super.dispatchKeyEvent(keyevent);
        }
    }

    protected int getContentLayoutId()
    {
        return 0x7f03002f;
    }

    public volatile Fragment getPrimaryFrag()
    {
        return getPrimaryFrag();
    }

    public LoLoMoFrag getPrimaryFrag()
    {
        return (LoLoMoFrag)super.getPrimaryFrag();
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getUiScreen()
    {
        return com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.homeScreen;
    }

    public ViewRecycler getViewRecycler()
    {
        return viewRecycler;
    }

    protected boolean handleBackPressed()
    {
        if (drawerLayout != null && drawerLayout.isDrawerOpen(3))
        {
            Log.v("HomeActivity", "Sliding drawer was open, closing...");
            drawerLayout.closeDrawer(3);
            return true;
        }
        Log.v("HomeActivity", (new StringBuilder()).append("Back pressed, backStack size: ").append(backStackIntents.size()).toString());
        if (backStackIntents.size() > 0)
        {
            onNewIntent((Intent)backStackIntents.removeLast());
            return true;
        } else
        {
            Log.v("HomeActivity", "No more items in back stack, finishing...");
            return false;
        }
    }

    public boolean isKidsGenre()
    {
        return genre != null && genre.isKidsGenre();
    }

    public void onAccept()
    {
        if (destroyed())
        {
            return;
        } else
        {
            Log.v("HomeActivity", "Sending PUSH_OPTIN...");
            Intent intent = new Intent("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTIN");
            intent.addCategory("com.netflix.mediaclient.intent.category.PUSH");
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
            Log.v("HomeActivity", "Sending PUSH_OPTIN done.");
            return;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        drawerToggler.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        mStartedTimeMs = SystemClock.elapsedRealtime();
        if (bundle != null)
        {
            backStackIntents.addAll((Collection)bundle.getSerializable("extra_back_stack_intents"));
        }
        registerRefreshHomeReceiver();
        handleNewIntent(getIntent());
        viewRecycler = new ViewRecycler();
        super.onCreate(bundle);
        showFetchErrorsToast();
        drawerLayout = (DrawerLayout)findViewById(0x7f0700b9);
        unlockSlidingDrawerIfPossible();
        if (isForKids())
        {
            bundle = new KidsSlidingMenuAdapter(this, drawerLayout);
        } else
        {
            bundle = new SlidingMenuAdapter(this, drawerLayout);
        }
        slidingMenuAdapter = bundle;
        drawerToggler = new ActionBarDrawerToggle(this, drawerLayout, 0x7f0200bc, 0x7f0c0147, 0x7f0c0147);
        drawerLayout.setDrawerListener(drawerToggler);
        drawerLayout.setFocusable(false);
        updateActionBar();
        pauseTimeMs = SystemClock.elapsedRealtime();
    }

    protected void onCreateOptionsMenu(Menu menu, Menu menu1)
    {
        MdxMenu.addSelectPlayTarget(getMdxMiniPlayerFrag(), menu);
        SearchMenu.addSearchNavigation(this, menu);
        kidsEntryItem = KidsUtils.createKidsMenuItem(this, menu);
        if (menu1 != null)
        {
            menu1.add("Dump LoLoMo Data").setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() {

                final HomeActivity this$0;

                public boolean onMenuItemClick(MenuItem menuitem)
                {
                    ServiceManager servicemanager = manager;
                    String s = genreId;
                    if (genre == null)
                    {
                        menuitem = "lolomo";
                    } else
                    {
                        menuitem = genre.getTitle();
                    }
                    servicemanager.dumpHomeLoLoMosAndVideos(s, menuitem);
                    return false;
                }

            
            {
                this$0 = HomeActivity.this;
                super();
            }
            });
        }
        super.onCreateOptionsMenu(menu, menu1);
    }

    public void onDecline()
    {
        if (destroyed())
        {
            return;
        } else
        {
            Log.v("HomeActivity", "Sending PUSH_OPTOUT...");
            Intent intent = new Intent("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTOUT");
            intent.addCategory("com.netflix.mediaclient.intent.category.PUSH");
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
            Log.v("HomeActivity", "Sending PUSH_OPTOUT done.");
            return;
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        if (handleNewIntent(intent))
        {
            showNewFrag();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (drawerToggler.onOptionsItemSelected(menuitem))
        {
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPause()
    {
        super.onPause();
        if (Log.isLoggable("HomeActivity", 3))
        {
            Log.d("HomeActivity", "onResumedAfterTimeout() will fire if activity not resumed within: 28800 seconds");
        }
        pauseTimeMs = SystemClock.elapsedRealtime();
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        drawerToggler.syncState();
    }

    protected void onResume()
    {
        super.onResume();
        slidingMenuAdapter.onActivityResume();
        if (SystemClock.elapsedRealtime() - pauseTimeMs > 0x1b77400L)
        {
            Log.d("HomeActivity", "Activity resume timeout reached");
            onResumeAfterTimeout();
            return;
        } else
        {
            Log.d("HomeActivity", "Activity resume timeout NOT reached");
            return;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("extra_back_stack_intents", backStackIntents);
    }

    protected void onSlidingPanelCollapsed(View view)
    {
        unlockSlidingDrawerIfPossible();
    }

    protected void onSlidingPanelExpanded(View view)
    {
        lockSlidingDrawer();
    }

    public void performUpAction()
    {
        toggleDrawer();
    }

    public boolean shouldApplyPaddingToSlidingPanel()
    {
        return false;
    }

    protected void showProfileToast()
    {
    }





/*
    static ServiceManager access$202(HomeActivity homeactivity, ServiceManager servicemanager)
    {
        homeactivity.manager = servicemanager;
        return servicemanager;
    }

*/







}
