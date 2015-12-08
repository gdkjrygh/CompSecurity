// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import air.com.nbcuni.com.nbcsports.liveextra.MainSupportWrapperActivity;
import air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.configuration.Sport;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.library.tve.PlaybackDelegate;
import com.nbcsports.liveextra.ui.core.BaseActivity;
import com.nbcsports.liveextra.ui.main.core.DefaultItemView;
import com.nbcsports.liveextra.ui.main.core.HeaderViewHolder;
import com.nbcsports.liveextra.ui.main.core.Section;
import com.nbcsports.liveextra.ui.main.core.SectionSelector;
import com.nbcsports.liveextra.ui.main.favorites.FavoritesListView;
import com.nbcsports.liveextra.ui.main.highlights.HighlightsListView;
import com.nbcsports.liveextra.ui.main.home.HomeListView;
import com.nbcsports.liveextra.ui.main.replay.FullEventReplayListView;
import com.nbcsports.liveextra.ui.main.schedule.ScheduleListView;
import com.nbcsports.liveextra.ui.main.showcase.ShowcasePagerView;
import com.nbcsports.liveextra.ui.tutorial.TutorialDialogFragment;
import com.phunware.nbc.sochi.content.AlertOption;
import com.phunware.nbc.sochi.data.ListViewAdapter;
import com.phunware.nbc.sochi.fragments.DetailActionDialogFragment;
import com.phunware.nbc.sochi.fragments.EventReplayFragment;
import com.phunware.nbc.sochi.fragments.FavoritesFragment;
import com.phunware.nbc.sochi.fragments.HighlightsFragment;
import com.phunware.nbc.sochi.fragments.HomeFragment;
import com.phunware.nbc.sochi.fragments.LiveUpcomingListMenuDialog;
import com.phunware.nbc.sochi.fragments.LocationDisabledDialogFragment;
import com.phunware.nbc.sochi.fragments.PlayerActionDialogFragment;
import com.phunware.nbc.sochi.fragments.ScheduleFragment;
import com.phunware.nbc.sochi.fragments.ShowcaseFragment;
import com.phunware.nbc.sochi.fragments.SochiApplicationSettingsFragment;
import com.phunware.nbc.sochi.fragments.SportFilterListFragment;
import com.phunware.nbc.sochi.fragments.SportGridTabletFragment;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import com.phunware.nbc.sochi.system.AppSharedPreferences;
import com.phunware.nbc.sochi.system.NBCSystem;
import com.phunware.nbc.sochi.utils.DialogUtil;
import com.urbanairship.push.PushManager;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import timber.log.Timber;

// Referenced classes of package com.phunware.nbc.sochi:
//            DaggerMainNavigationContentActivity_Component, NBCSportsApplication, RateDialog

public class MainNavigationContentActivity extends BaseActivity
    implements com.phunware.nbc.sochi.fragments.LiveUpcomingListMenuDialog.LiveUpcomingListMenuDialogListener, com.phunware.nbc.sochi.fragments.NationalAlertsWizardFragment3.NaWizardCallback3, com.phunware.nbc.sochi.fragments.SportFilterListFragment.Callback
{
    public static interface Component
    {

        public abstract MainNavigationContentActivity activity();

        public abstract Configuration configuration();

        public abstract Context context();

        public abstract void inject(PlaybackDelegate playbackdelegate);

        public abstract void inject(DefaultItemView defaultitemview);

        public abstract void inject(HeaderViewHolder headerviewholder);

        public abstract void inject(FavoritesListView favoriteslistview);

        public abstract void inject(HighlightsListView highlightslistview);

        public abstract void inject(HomeListView homelistview);

        public abstract void inject(FullEventReplayListView fulleventreplaylistview);

        public abstract void inject(ScheduleListView schedulelistview);

        public abstract void inject(ShowcasePagerView showcasepagerview);

        public abstract void inject(TutorialDialogFragment tutorialdialogfragment);

        public abstract void inject(MainNavigationContentActivity mainnavigationcontentactivity);

        public abstract void inject(DetailActionDialogFragment detailactiondialogfragment);

        public abstract void inject(EventReplayFragment eventreplayfragment);

        public abstract void inject(FavoritesFragment favoritesfragment);

        public abstract void inject(HighlightsFragment highlightsfragment);

        public abstract void inject(HomeFragment homefragment);

        public abstract void inject(PlayerActionDialogFragment playeractiondialogfragment);

        public abstract void inject(ScheduleFragment schedulefragment);

        public abstract void inject(ShowcaseFragment showcasefragment);

        public abstract void inject(SochiApplicationSettingsFragment sochiapplicationsettingsfragment);

        public abstract void inject(SportFilterListFragment sportfilterlistfragment);

        public abstract void inject(SportGridTabletFragment sportgridtabletfragment);
    }

    private class DrawerItemClickListener
        implements android.widget.AdapterView.OnItemClickListener
    {

        final MainNavigationContentActivity this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            selectItem(i);
            mDrawerList.clearChoices();
        }

        private DrawerItemClickListener()
        {
            this$0 = MainNavigationContentActivity.this;
            super();
        }

    }

    public class Module
    {

        private final MainNavigationContentActivity activity;
        final MainNavigationContentActivity this$0;

        MainNavigationContentActivity activity()
        {
            return activity;
        }

        Context context()
        {
            return activity;
        }

        Sport sport()
        {
            return selectedSport;
        }

        public Module(MainNavigationContentActivity mainnavigationcontentactivity1)
        {
            this$0 = MainNavigationContentActivity.this;
            super();
            activity = mainnavigationcontentactivity1;
        }
    }


    public static final String ARGS_DEELPLINK_HOME = "args_deeplink_home";
    public static final String ARGS_DEELPLINK_HOME_BOOL = "args_deeplink_home_bool";
    public static final String ARGS_DEEPLINK_SCHEDULE_ONTV = "args_deeplink_schedule_ontv";
    public static final String ARGS_DEEPLINK_SCHEDULE_ONTV_BOOL = "args_deeplink_schedule_ontv_bool";
    public static final String ARGS_DEEPLINK_SPORT = "args_deeplink_sport";
    public static final String ARGS_DEEPLINK_SPORTS_BOOL = "args_deeplink_sports_bool";
    public static final String DEEP_LINKING_ENABLED = "DEEP_LINKING_ENABLED";
    public static final String GOTHAM_SSM_BOLD = "GothamSSm-Bold";
    public static final String GOTHAM_SSM_BOOK = "GothamSSm-Book";
    public static final int REQUEST_AUTHENTICATION_DETAIL = 100;
    public static final int REQUEST_AUTHENTICATION_PLAYBACK = 200;
    private static Component component;
    Configuration config;
    private Bundle mArgs;
    public int mCurrentView;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ListViewAdapter mDrawerListAdapter;
    private ActionBarDrawerToggle mDrawerToggle;
    private boolean mIsDeepLinking;
    AuthService pass;
    public Sport selectedSport;
    SectionSelector selector;
    private Integer sportPosition;
    TrackingHelper trackingHelper;

    public MainNavigationContentActivity()
    {
        mCurrentView = 1;
        mIsDeepLinking = false;
    }

    public static Component component()
    {
        return component;
    }

    private Fragment getFragment(int i)
    {
        Section section = selector.getSection(i, selectedSport, config);
        if (section.getSport() != null)
        {
            selectedSport = section.getSport();
        }
        mCurrentView = section.getIndex();
        Fragment fragment = section.getFragment();
        Bundle bundle1 = fragment.getArguments();
        Bundle bundle = bundle1;
        if (bundle1 == null)
        {
            bundle = new Bundle();
        }
        if (selectedSport != null)
        {
            bundle.putParcelable("sport", selectedSport);
        }
        fragment.setArguments(bundle);
        if (getSupportActionBar() != null)
        {
            ActionBar actionbar = getSupportActionBar();
            if (section.getIcon() == 0)
            {
                i = 0x7f030000;
            } else
            {
                i = section.getIcon();
            }
            actionbar.setIcon(i);
            if (section.getTitle() != null)
            {
                getSupportActionBar().setTitle(section.getTitle());
            } else
            {
                getSupportActionBar().setTitle(getString(0x7f070059));
            }
        }
        if (section.getPageInfo() != null)
        {
            trackingHelper.trackPageEvent(section.getPageInfo());
        }
        return fragment;
    }

    private void inject()
    {
        if (component == null)
        {
            component = DaggerMainNavigationContentActivity_Component.builder().applicationComponent(NBCSportsApplication.component()).module(new Module(this)).build();
        }
        component.inject(this);
    }

    private void loadDeepLinkingActivity(Bundle bundle)
    {
        if (!bundle.getBoolean("args_deeplink_sports_bool")) goto _L2; else goto _L1
_L1:
        bundle = (Sport)bundle.getParcelable("args_deeplink_sport");
        if (bundle.getName().contains("PGA"))
        {
            MainSupportWrapperActivity.IS_DEEPLINKING_PGA = true;
        }
        Log.d("DEEPLINKING", (new StringBuilder()).append("sportName: ").append(bundle.getName()).toString());
        selectedSport = bundle;
        selectedSport = bundle;
        showFragment(Integer.valueOf(1));
_L4:
        mIsDeepLinking = false;
        mArgs = null;
        return;
_L2:
        if (bundle.getBoolean("args_deeplink_home_bool"))
        {
            showFragment(Integer.valueOf(1));
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            if (bundle.getBoolean("args_deeplink_schedule_ontv_bool") && bundle.getBoolean("args_deeplink_schedule_ontv"))
            {
                showFragment(Integer.valueOf(4));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle) { }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void resetDrawerTitle()
    {
        String s;
        if (selectedSport != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        s = getString(0x7f0700d1);
_L1:
        ((com.phunware.nbc.sochi.data.ListViewAdapter.ListViewItemModel)mDrawerListAdapter.getItem(0)).title = s;
        mDrawerListAdapter.notifyDataSetChanged();
        return;
        try
        {
            s = selectedSport.getName();
        }
        catch (NullPointerException nullpointerexception)
        {
            Timber.w(nullpointerexception, "Problem resetting drawer title", new Object[0]);
            return;
        }
          goto _L1
    }

    private void selectItem(int i)
    {
        showFragment(Integer.valueOf(i));
        if (mDrawerList == null || mDrawerLayout == null)
        {
            return;
        } else
        {
            mDrawerList.setItemChecked(i, true);
            mDrawerLayout.closeDrawer(mDrawerList);
            return;
        }
    }

    private void setDrawerOptions()
    {
        String s = getString(0x7f0700d1);
        mDrawerListAdapter = new ListViewAdapter(this);
        mDrawerListAdapter.addHeader(s);
        String as[] = getResources().getStringArray(0x7f0d0009);
        int l = as.length;
        for (int i = 0; i < l; i++)
        {
            String s1 = as[i];
            mDrawerListAdapter.addItem(s1);
        }

        as = getResources().getStringArray(0x7f0d000c);
        if (as != null && as.length > 0)
        {
            mDrawerListAdapter.addHeader(getString(0x7f0700d4));
            l = as.length;
            for (int j = 0; j < l; j++)
            {
                String s2 = as[j];
                mDrawerListAdapter.addItem(s2);
            }

        }
        mDrawerListAdapter.addHeader(getString(0x7f0700d2));
        as = getResources().getStringArray(0x7f0d000a);
        l = as.length;
        for (int k = 0; k < l; k++)
        {
            String s3 = as[k];
            mDrawerListAdapter.addItem(s3);
        }

        mDrawerLayout = (DrawerLayout)findViewById(0x7f0f0132);
        mDrawerList = (ListView)findViewById(0x7f0f0134);
        if (!NBCSystem.SDK_IS_JELLY_BEAN_PLUS)
        {
            mDrawerList.setCacheColorHint(getResources().getColor(0x106000d));
            mDrawerList.setScrollingCacheEnabled(false);
        }
        mDrawerLayout.setDrawerShadow(0x7f020078, 0x800003);
        mDrawerList.setAdapter(mDrawerListAdapter);
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, 0x7f0700d5, 0x7f0700d0) {

            final MainNavigationContentActivity this$0;

            public void onDrawerClosed(View view)
            {
                supportInvalidateOptionsMenu();
                if (NBCSystem.SDK_IS_JELLY_BEAN_PLUS)
                {
                    onPrepareOptionsMenu(null);
                }
            }

            public void onDrawerOpened(View view)
            {
                supportInvalidateOptionsMenu();
                if (NBCSystem.SDK_IS_JELLY_BEAN_PLUS)
                {
                    onPrepareOptionsMenu(null);
                }
            }

            
            {
                this$0 = MainNavigationContentActivity.this;
                super(activity, drawerlayout, i, j);
            }
        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);
    }

    private void showFragment(Integer integer)
    {
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        fragmenttransaction.replace(0x7f0f0133, getFragment(integer.intValue()), (new StringBuilder()).append("").append(integer).toString());
        fragmenttransaction.commitAllowingStateLoss();
        resetDrawerTitle();
        supportInvalidateOptionsMenu();
        if (NBCSystem.SDK_IS_JELLY_BEAN_PLUS)
        {
            onPrepareOptionsMenu(null);
        }
    }

    private void start()
    {
        String s;
        if (!"nbclive".equals("nbclive"))
        {
            break MISSING_BLOCK_LABEL_68;
        }
        s = AppSharedPreferences.getSetting(this, "PREFS_TUTORIAL_FIRST_LAUNCH");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (s.equalsIgnoreCase("true"))
        {
            break MISSING_BLOCK_LABEL_68;
        }
        if (!mIsDeepLinking)
        {
            AppSharedPreferences.addSetting(this, "PREFS_TUTORIAL_FIRST_LAUNCH", "true");
            (new TutorialDialogFragment()).show(getSupportFragmentManager(), "Tutorial Screens");
        }
        if (!NBCSystem.IS_GEO_LOCATION_ENABLED)
        {
            (new LocationDisabledDialogFragment()).show(getSupportFragmentManager(), "locationdisabled");
            return;
        }
        try
        {
            if (!mIsDeepLinking)
            {
                showNationalAlertsWizard();
                return;
            }
        }
        catch (Exception exception)
        {
            Timber.d("Location Dialog exception", new Object[] {
                exception
            });
        }
        return;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i != 200 && i != 100)
        {
            return;
        }
        switch (j)
        {
        default:
            return;

        case -1: 
            PlayerActionDialogFragment.getInstance((Asset)intent.getParcelableExtra("asset"), (com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo)intent.getParcelableExtra("pageInfo")).show(getSupportFragmentManager(), "dialog");
            break;
        }
    }

    public void onBackPressed()
    {
        if (mDrawerList != null)
        {
            int i = mDrawerList.getCheckedItemPosition();
            if ((i == -1 || i != 0) && mCurrentView != 1)
            {
                supportInvalidateOptionsMenu();
                if (NBCSystem.SDK_IS_JELLY_BEAN_PLUS)
                {
                    onPrepareOptionsMenu(null);
                }
                selectItem(0);
                return;
            }
            if (mCurrentView == 1 && selectedSport != null)
            {
                selectedSport = null;
                selectItem(0);
                return;
            }
        }
        super.onBackPressed();
    }

    public void onConfigurationChanged(android.content.res.Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (mDrawerToggle != null)
        {
            mDrawerToggle.onConfigurationChanged(configuration);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040066);
        keepScreenOn(false);
        Object obj = findViewById(0x7f0f0132);
        ((View) (obj)).setVisibility(0);
        ((View) (obj)).findViewById(0x7f0f0133).setVisibility(0);
        obj = getIntent().getExtras();
        if (obj != null)
        {
            mArgs = ((Bundle) (obj));
            if (mArgs.getBoolean("DEEP_LINKING_ENABLED"))
            {
                mIsDeepLinking = true;
                NBCSystem.IS_DEEPLINKING_ACTIVE = true;
            }
        }
        if (!NBCSystem.isNetworkAvailable(getApplicationContext()))
        {
            DialogUtil.showNetworkNotAvailableDialog(this);
            return;
        }
        inject();
        if (!pass.isStarted())
        {
            startActivity(new Intent(this, air/com/nbcuni/com/nbcsports/liveextra/MainSupportWrapperActivity));
            return;
        }
        setOrientation();
        setDrawerOptions();
        if (bundle != null)
        {
            mCurrentView = bundle.getInt("current_view");
            selectedSport = (Sport)bundle.getParcelable("selected_sport");
            sportPosition = Integer.valueOf(bundle.getInt("sport_position"));
            mIsDeepLinking = bundle.getBoolean("is_deep_linking");
            return;
        } else
        {
            RateDialog.appLaunched(getApplicationContext(), getSupportFragmentManager());
            start();
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f100004, menu);
        MenuItem menuitem = menu.findItem(0x7f0f0203);
        boolean flag;
        if (selectedSport != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setVisible(flag);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        component = null;
    }

    public void onLiveAndUpcoming(View view)
    {
        if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(mDrawerList))
        {
            mDrawerLayout.closeDrawer(mDrawerList);
        }
        (new LiveUpcomingListMenuDialog()).show(getSupportFragmentManager(), "liveupcomingmenu");
    }

    public void onLiveMenuSelected(String s, int i)
    {
        if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(mDrawerList))
        {
            mDrawerLayout.closeDrawer(mDrawerList);
        }
        if (i >= 0)
        {
            selectItem(i);
            if (i == 0)
            {
                showFragment(Integer.valueOf(1));
            } else
            {
                if (i == 1)
                {
                    showFragment(Integer.valueOf(2));
                    return;
                }
                if (i == 2)
                {
                    showFragment(Integer.valueOf(3));
                    return;
                }
                if (i == 3)
                {
                    showFragment(Integer.valueOf(4));
                    return;
                }
            }
        }
    }

    public void onNationalAlertOptionsChosen(List list, List list1)
    {
        Set set = PushManager.shared().getTags();
        Log.d("Alerts", "onNationalAlertOptionsChosen()");
        Log.d("Alerts", (new StringBuilder()).append("AlertOptions chosen: ").append(list).toString());
        Log.d("Alerts", (new StringBuilder()).append("AlertOptions NOT chosen: ").append(list1).toString());
        Log.d("Alerts", (new StringBuilder()).append("About to modify tags: ").append(set).toString());
        list1 = list1.iterator();
        do
        {
            if (!list1.hasNext())
            {
                break;
            }
            AlertOption alertoption = (AlertOption)list1.next();
            set.remove(alertoption.getTag());
            if (alertoption.getTag().equals("dont_miss_9_11_ET"))
            {
                set.remove("full_event_9_11_ET");
                set.remove("on_tv");
            }
        } while (true);
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            list1 = (AlertOption)list.next();
            set.add(list1.getTag());
            if (list1.getTag().equals("dont_miss_9_11_ET"))
            {
                set.add("full_event_9_11_ET");
                set.add("on_tv");
            }
        } while (true);
        Log.d("Alerts", (new StringBuilder()).append("Subscribing to tags: ").append(set).toString());
        PushManager.shared().setTags(set);
        PushManager.shared().updateApidIfNecessary();
        Toast.makeText(this, "Your alerts have been saved", 0).show();
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        if (intent != null && intent.getExtras() != null)
        {
            mArgs = intent.getExtras();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        if (mDrawerToggle != null && mDrawerToggle.onOptionsItemSelected(menuitem))
        {
            return true;
        }
        if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(mDrawerList))
        {
            mDrawerLayout.closeDrawer(mDrawerList);
        }
        if (i == 0x7f0f0203)
        {
            selectedSport = null;
            sportPosition = null;
            menuitem.setVisible(false);
            showFragment(Integer.valueOf(mCurrentView));
            return true;
        }
        if (i == 0x7f0f0202)
        {
            if (NBCSystem.IS_TAB)
            {
                menuitem = new SportGridTabletFragment();
            } else
            {
                menuitem = new SportFilterListFragment();
            }
            menuitem.show(getSupportFragmentManager(), "sport_filter");
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPause()
    {
        super.onPause();
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        if (mDrawerToggle != null)
        {
            mDrawerLayout.post(new Runnable() {

                final MainNavigationContentActivity this$0;

                public void run()
                {
                    mDrawerToggle.syncState();
                }

            
            {
                this$0 = MainNavigationContentActivity.this;
                super();
            }
            });
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        if (menu == null)
        {
            return super.onPrepareOptionsMenu(menu);
        }
        MenuItem menuitem = menu.findItem(0x7f0f0203);
        if (menuitem == null)
        {
            return super.onPrepareOptionsMenu(menu);
        }
        boolean flag;
        if (selectedSport != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setVisible(flag);
        return true;
    }

    public void onRegionalAlertOptionsChosen(List list, List list1)
    {
    }

    protected void onResume()
    {
        super.onResume();
        if (NBCSystem.IS_TAB)
        {
            setDrawerOptions();
        }
        if (mArgs != null)
        {
            Timber.d((new StringBuilder()).append("DEEPLINKING: ").append(mArgs.getBoolean("DEEP_LINKING_ENABLED")).toString(), new Object[0]);
        }
        if (mArgs != null && mArgs.getBoolean("DEEP_LINKING_ENABLED"))
        {
            Timber.d("DEEPLINKING: CALLING LOAD DEEP", new Object[0]);
            mIsDeepLinking = true;
            loadDeepLinkingActivity(mArgs);
        }
        if (!NBCSystem.isNetworkAvailable(getApplicationContext()))
        {
            DialogUtil.showNetworkNotAvailableDialog(this);
        } else
        {
            if (mDrawerToggle != null)
            {
                if (!mDrawerToggle.isDrawerIndicatorEnabled())
                {
                    mDrawerToggle.setDrawerIndicatorEnabled(true);
                }
                mDrawerLayout.post(new Runnable() {

                    final MainNavigationContentActivity this$0;

                    public void run()
                    {
                        mDrawerToggle.syncState();
                    }

            
            {
                this$0 = MainNavigationContentActivity.this;
                super();
            }
                });
            }
            if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(mDrawerList))
            {
                mDrawerLayout.closeDrawer(mDrawerList);
            }
            if (NBCSystem.GEO_LOCATION_RETRY)
            {
                NBCSystem.resetGeoTrackingService(getBaseContext());
                NBCSystem.GEO_LOCATION_RETRY = false;
            }
            if (!mIsDeepLinking)
            {
                selectItem(mCurrentView);
                return;
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (sportPosition != null)
        {
            bundle.putInt("sport_position", sportPosition.intValue());
        }
        if (selectedSport != null)
        {
            bundle.putParcelable("selected_sport", selectedSport);
        }
        bundle.putInt("current_view", mCurrentView);
        bundle.putBoolean("is_deep_linking", mIsDeepLinking);
    }

    public void onShowFullEventReplays(View view)
    {
        showFragment(Integer.valueOf(3));
    }

    public void onShowGolfChannel(View view)
    {
        view = getBaseContext().getPackageManager().getLaunchIntentForPackage("com.tour.pgatour");
        if (view != null)
        {
            startActivity(view);
            finish();
            return;
        }
        view = new Intent("android.intent.action.VIEW");
        view.setData(Uri.parse("com.tour.pgatour://"));
        if (getPackageManager().resolveActivity(view, 0) != null)
        {
            startActivity(view);
            finish();
            return;
        } else
        {
            view.setData(Uri.parse("market://details?id=com.tour.pgatour"));
            startActivity(view);
            finish();
            return;
        }
    }

    public void onShowHighlights(View view)
    {
        showFragment(Integer.valueOf(2));
    }

    public void onShowLiveUpcoming(View view)
    {
        showFragment(Integer.valueOf(1));
    }

    public void onShowSchedule(View view)
    {
        showFragment(Integer.valueOf(4));
    }

    public void onSportSelected(Sport sport)
    {
        selectedSport = sport;
        showFragment(Integer.valueOf(mCurrentView));
    }

    public void showNationalAlertsWizard()
    {
        String s = AppSharedPreferences.getSetting(this, "PREFS_NATIONAL_ALERTS_FIRST_LAUNCH");
        if (s == null || !s.equalsIgnoreCase("true"))
        {
            AppSharedPreferences.addSetting(this, "PREFS_NATIONAL_ALERTS_FIRST_LAUNCH", "true");
            startActivity(new Intent(this, air/com/nbcuni/com/nbcsports/liveextra/NationalAlertsWizardActivity));
        }
    }



}
