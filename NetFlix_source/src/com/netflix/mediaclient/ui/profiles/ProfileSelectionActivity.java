// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.profiles;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.android.widget.LoadingAndErrorWrapper;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.android.widget.StaticGridView;
import com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration;
import com.netflix.mediaclient.servicemgr.ErrorLogging;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.UserProfile;
import com.netflix.mediaclient.ui.RelaunchActivity;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.gfx.AnimationUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.util.Iterator;
import java.util.List;

public class ProfileSelectionActivity extends NetflixActivity
{
    private static class Holder
    {

        private final AdvancedImageView img;
        private final TextView title;



        public Holder(AdvancedImageView advancedimageview, TextView textview)
        {
            img = advancedimageview;
            title = textview;
            advancedimageview.setPressedStateHandlerEnabled(false);
        }
    }

    private class ProfileAvatarAdapter extends BaseAdapter
    {

        final ProfileSelectionActivity this$0;

        public int getCount()
        {
            return profiles.size();
        }

        public UserProfile getItem(int i)
        {
            return (UserProfile)profiles.get(i);
        }

        public volatile Object getItem(int i)
        {
            return getItem(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            viewgroup = view;
            if (view == null)
            {
                viewgroup = getLayoutInflater().inflate(0x7f030074, null, false);
                viewgroup.setTag(new Holder((AdvancedImageView)viewgroup.findViewById(0x7f07018b), (TextView)viewgroup.findViewById(0x7f07018c)));
            }
            view = (Holder)viewgroup.getTag();
            UserProfile userprofile = getItem(i);
            ((Holder) (view)).title.setText(userprofile.getProfileName());
            NetflixActivity.getImageLoader(ProfileSelectionActivity.this).showImg(((Holder) (view)).img, userprofile.getAvatarUrl(), com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.profileAvatar, userprofile.getFirstName(), true, true);
            return viewgroup;
        }

        public void notifyDataSetChanged()
        {
            super.notifyDataSetChanged();
            setupGridViewColumns();
        }

        private ProfileAvatarAdapter()
        {
            this$0 = ProfileSelectionActivity.this;
            super();
        }

    }


    private static final float ALPHA_CONTENT_FADE = 0.2F;
    private static final String EXTRA_KIDS_DOOR_NAME = "extra_kids_door_name";
    private static final String EXTRA_START_KIDS_BOOL = "extra_start_kids_bool";
    private static final String EXTRA_STOP_KIDS_BOOL = "extra_stop_kids_bool";
    private static final boolean HANG_ON_KIDS_LOADING_SCREEN = false;
    private static final String KEY_IS_LOADING = "is_loading";
    private static final String KEY_IS_SHOWING_KIDS_LOADING_SCREEN = "is_showing_kids_loading_screen";
    private static final String TAG = "ProfileSelectionActivity";
    private static final SparseArray maxNumGridColumns;
    private ProfileAvatarAdapter adapter;
    private int columnWidth;
    private View content;
    private final com.netflix.mediaclient.android.widget.ErrorWrapper.Callback errorCallback = new com.netflix.mediaclient.android.widget.ErrorWrapper.Callback() {

        final ProfileSelectionActivity this$0;

        public void onRetryRequested()
        {
        }

            
            {
                this$0 = ProfileSelectionActivity.this;
                super();
            }
    };
    private StaticGridView gridView;
    private boolean isLoading;
    private boolean isShowingKidsLoadingScreen;
    private View kidsLoadingScreen;
    private LoadingAndErrorWrapper leWrapper;
    private ServiceManager manager;
    private int numCols;
    private final android.widget.AdapterView.OnItemClickListener onAvatarClickListener = new android.widget.AdapterView.OnItemClickListener() {

        final ProfileSelectionActivity this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (profiles == null || i > profiles.size())
            {
                Log.d("ProfileSelectionActivity", "Invalid profiles set");
                return;
            } else
            {
                startChangeProfile((UserProfile)profiles.get(i));
                return;
            }
        }

            
            {
                this$0 = ProfileSelectionActivity.this;
                super();
            }
    };
    private List profiles;
    private boolean shouldShowKidsLoadingScreen;
    private boolean shouldStartKids;

    public ProfileSelectionActivity()
    {
    }

    private void adjustGridViewMargins()
    {
        int i = DeviceUtils.getScreenWidthInPixels(this);
        int j = columnWidth * numCols;
        int k = (i - j) / 2;
        if (Log.isLoggable("ProfileSelectionActivity", 2))
        {
            Log.v("ProfileSelectionActivity", String.format("screen: %d, grid: %d, padding: %d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k)
            }));
        }
        gridView.setPadding(k, 0, 0, 0);
    }

    public static Intent createStartIntent(Activity activity)
    {
        return (new Intent(activity, com/netflix/mediaclient/ui/profiles/ProfileSelectionActivity)).addFlags(0x20000);
    }

    public static Intent createSwitchFromKidsIntent(Activity activity, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName uiviewcommandname)
    {
        return createStartIntent(activity).putExtra("extra_stop_kids_bool", true).putExtra("extra_kids_door_name", uiviewcommandname.toString());
    }

    public static Intent createSwitchToKidsIntent(Activity activity, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName uiviewcommandname)
    {
        return createStartIntent(activity).putExtra("extra_start_kids_bool", true).putExtra("extra_kids_door_name", uiviewcommandname.toString());
    }

    private void handleManagerReady(boolean flag)
    {
        Object obj = manager.getAllProfiles();
        if (obj == null)
        {
            Log.w("ProfileSelectionActivity", "No profiles found for user!");
            manager.getClientLogging().getErrorLogging().logHandledException(new IllegalStateException("No profiles found for user!"));
        } else
        {
            shouldShowKidsLoadingScreen = KidsUtils.isUserInKopExperience(manager.getConfiguration());
            Log.v("ProfileSelectionActivity", (new StringBuilder()).append("handleManagerReady(), isLoading: ").append(isLoading).toString());
            UserProfile userprofile2;
            for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); Log.d("ProfileSelectionActivity", (new StringBuilder()).append("profile: ").append(userprofile2).toString()))
            {
                userprofile2 = (UserProfile)iterator.next();
            }

            profiles = ((List) (obj));
            if (!isLoading && ((List) (obj)).size() == 1)
            {
                if (Log.isLoggable("ProfileSelectionActivity", 3))
                {
                    Log.d("ProfileSelectionActivity", "Only one user profile, showing loading view");
                }
                obj = (UserProfile)((List) (obj)).get(0);
                isLoading = true;
                UserProfile userprofile1;
                Iterator iterator1;
                boolean flag1;
                if (shouldShowKidsLoadingScreen && ((UserProfile) (obj)).isKidsProfile())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                showLoadingViews(true, flag1);
                if (flag)
                {
                    if (Log.isLoggable("ProfileSelectionActivity", 3))
                    {
                        Log.d("ProfileSelectionActivity", (new StringBuilder()).append("Auto-selecting profile: ").append(((UserProfile) (obj)).getFirstName()).append(", id: ").append(((UserProfile) (obj)).getProfileId()).toString());
                    }
                    manager.selectProfile(((UserProfile) (obj)).getProfileId());
                }
            } else
            {
                if (Log.isLoggable("ProfileSelectionActivity", 3))
                {
                    Log.d("ProfileSelectionActivity", "More than one profile");
                }
                adapter = new ProfileAvatarAdapter();
                gridView.setAdapter(adapter);
                setupGridViewColumns();
                showContentView();
                if (isLoading)
                {
                    if (Log.isLoggable("ProfileSelectionActivity", 3))
                    {
                        Log.d("ProfileSelectionActivity", "We're in loading state - showing loading view");
                    }
                    boolean flag2;
                    if (shouldShowKidsLoadingScreen && isShowingKidsLoadingScreen)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    showLoadingViews(false, flag2);
                }
            }
            Log.v("ProfileSelectionActivity", String.format("shouldAutoSelectProfile: %s, shouldStartKids: %s, isInKoPEnabled: %s", new Object[] {
                Boolean.valueOf(flag), Boolean.valueOf(shouldStartKids), Boolean.valueOf(manager.getConfiguration().getKidsOnPhoneConfiguration().isKidsOnPhoneEnabled())
            }));
            if (flag && shouldStartKids && manager.getConfiguration().getKidsOnPhoneConfiguration().isKidsOnPhoneEnabled())
            {
                int i = 0;
                UserProfile userprofile = null;
                iterator1 = manager.getAllProfiles().iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    userprofile1 = (UserProfile)iterator1.next();
                    if (userprofile1.isKidsProfile())
                    {
                        userprofile = userprofile1;
                        i++;
                    }
                } while (true);
                if (i == 1)
                {
                    Log.v("ProfileSelectionActivity", (new StringBuilder()).append("Found one Kids profile - switching to: ").append(userprofile.getProfileName()).toString());
                    startChangeProfile(userprofile);
                    return;
                } else
                {
                    Log.v("ProfileSelectionActivity", (new StringBuilder()).append("Num Kids profiles found: ").append(i).toString());
                    return;
                }
            }
        }
    }

    private void logKidsEntryExit(Intent intent)
    {
        boolean flag = getIntent().getBooleanExtra("extra_start_kids_bool", false);
        boolean flag1 = getIntent().getBooleanExtra("extra_stop_kids_bool", false);
        intent = getIntent().getStringExtra("extra_kids_door_name");
        if ((Boolean.valueOf(flag).booleanValue() || Boolean.valueOf(flag1).booleanValue()) && StringUtils.isNotEmpty(intent))
        {
            LogUtils.reportUIViewCommandStarted(this, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName.valueOf(intent), com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.homeScreen, null);
            LogUtils.reportUIViewCommandEnded(this);
        }
    }

    private void setupGridViewColumns()
    {
        int i = DeviceUtils.getBasicScreenOrientation(this);
        int j = DeviceUtils.getScreenSizeCategory(this);
        j = ((SparseIntArray)maxNumGridColumns.get(i)).get(j);
        i = adapter.getCount();
        if (i > 3)
        {
            i -= 2;
        }
        numCols = Math.min(i, j);
        if (Log.isLoggable("ProfileSelectionActivity", 2))
        {
            Log.v("ProfileSelectionActivity", String.format("max cols: %d, limited cols: %d, num cols: %d", new Object[] {
                Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(numCols)
            }));
        }
        gridView.setNumColumns(numCols);
        adjustGridViewMargins();
    }

    private void showContentView()
    {
        Log.v("ProfileSelectionActivity", "Showing content view...");
        leWrapper.hide(false);
        content.setEnabled(true);
        if (content.getVisibility() == 0)
        {
            if (content.getAlpha() < 1.0F)
            {
                content.animate().alpha(1.0F).setDuration(150L).start();
            }
        } else
        {
            AnimationUtils.showView(content, false);
        }
        if (kidsLoadingScreen.getVisibility() == 0)
        {
            setRequestedOrientation(-1);
            AnimationUtils.hideView(kidsLoadingScreen, true);
            getNetflixActionBar().setLogoType(com.netflix.mediaclient.android.widget.NetflixActionBar.LogoType.FULL_SIZE);
        }
    }

    private void showLoadingViews(boolean flag, boolean flag1)
    {
        Log.v("ProfileSelectionActivity", "Showing loading view...");
        leWrapper.showLoadingView(false);
        content.setEnabled(false);
        if (flag)
        {
            content.animate().alpha(0.2F).setDuration(400L).start();
        } else
        {
            content.setAlpha(0.2F);
        }
        if (flag1)
        {
            setRequestedOrientation(1);
            AnimationUtils.showView(kidsLoadingScreen, false);
            getNetflixActionBar().setLogoType(com.netflix.mediaclient.android.widget.NetflixActionBar.LogoType.GONE);
        }
    }

    protected ManagerStatusListener createManagerStatusListener()
    {
        return new ManagerStatusListener() {

            final ProfileSelectionActivity this$0;

            public void onManagerReady(ServiceManager servicemanager, int i)
            {
                manager = servicemanager;
                handleManagerReady(true);
            }

            public void onManagerUnavailable(ServiceManager servicemanager, int i)
            {
                manager = null;
            }

            
            {
                this$0 = ProfileSelectionActivity.this;
                super();
            }
        };
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getUiScreen()
    {
        return com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.profilesGate;
    }

    protected void handleNetworkErrorDialog()
    {
        if (profiles != null && profiles.size() > 1)
        {
            Log.d("ProfileSelectionActivity", "relaunch onhandleProfileSelectionResult failed");
            finishAllActivities(this);
            startActivity(RelaunchActivity.createStartIntent(this, "handleNetwotkErrorDialog()"));
            return;
        } else
        {
            Log.d("ProfileSelectionActivity", "finish onhandleProfileSelectionResult failed");
            finishAllActivities(this);
            return;
        }
    }

    protected void handleProfileActivated()
    {
        long l = System.nanoTime();
        Log.d("ProfileSelectionActivity", (new StringBuilder()).append("Restarting app, time: ").append(l).toString());
        finishAllActivities(this);
        startActivity(RelaunchActivity.createStartIntent(this, (new StringBuilder()).append("handleProfileActivated() ").append(l).toString()).addFlags(0x4000000));
    }

    protected void handleProfileReadyToSelect()
    {
        Log.v("ProfileSelectionActivity", "handleProfileReadyToSelect()");
        isLoading = false;
        handleManagerReady(false);
    }

    protected void handleProfileSelectionResult(int i, String s)
    {
        if (i == 0)
        {
            Log.v("ProfileSelectionActivity", "Profile selection was successful.  Parent class should finish this activity in a moment...");
            return;
        } else
        {
            handleUserAgentErrors(this, i, s);
            return;
        }
    }

    protected boolean hasUpAction()
    {
        return false;
    }

    public boolean isLoadingData()
    {
        return isLoading || profiles == null || profiles.size() <= 0;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        columnWidth = getResources().getDimensionPixelSize(0x7f0a004a);
        setContentView(0x7f030073);
        leWrapper = new LoadingAndErrorWrapper(findViewById(0x7f070186), errorCallback);
        content = findViewById(0x7f070187);
        gridView = (StaticGridView)findViewById(0x7f070189);
        gridView.setOnItemClickListener(onAvatarClickListener);
        gridView.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final ProfileSelectionActivity this$0;

            public void onGlobalLayout()
            {
                adjustGridViewMargins();
            }

            
            {
                this$0 = ProfileSelectionActivity.this;
                super();
            }
        });
        kidsLoadingScreen = findViewById(0x7f0700d3);
        if (bundle == null)
        {
            logKidsEntryExit(getIntent());
            shouldStartKids = getIntent().getBooleanExtra("extra_start_kids_bool", false);
            return;
        } else
        {
            isLoading = bundle.getBoolean("is_loading", false);
            isShowingKidsLoadingScreen = bundle.getBoolean("is_showing_kids_loading_screen", false);
            Log.v("ProfileSelectionActivity", (new StringBuilder()).append("Recovered state, isLoading: ").append(isLoading).append(", isShowingKidsLoadingScreen: ").append(isShowingKidsLoadingScreen).toString());
            return;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        Log.v("ProfileSelectionActivity", (new StringBuilder()).append("Saving loading state: ").append(isLoading).toString());
        bundle.putBoolean("is_loading", isLoading);
        boolean flag;
        if (kidsLoadingScreen.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.putBoolean("is_showing_kids_loading_screen", flag);
    }

    public void performUpAction()
    {
    }

    protected void startChangeProfile(UserProfile userprofile)
    {
        if (manager == null || !manager.isReady())
        {
            Log.e("ProfileSelectionActivity", "Manager is not ready");
            return;
        }
        if (Log.isLoggable("ProfileSelectionActivity", 3))
        {
            Log.d("ProfileSelectionActivity", (new StringBuilder()).append("Selecting profile: ").append(userprofile.getFirstName()).append(", id: ").append(userprofile.getProfileId()).toString());
        }
        UserProfile userprofile1 = manager.getCurrentProfile();
        if (userprofile1 != null && StringUtils.safeEquals(userprofile1.getProfileId(), userprofile.getProfileId()))
        {
            Log.d("ProfileSelectionActivity", "Selected profile is the same as the current one - skipping profile change...");
            finish();
            return;
        }
        isLoading = true;
        boolean flag;
        if (shouldShowKidsLoadingScreen && userprofile.isKidsProfile())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        showLoadingViews(true, flag);
        manager.selectProfile(userprofile.getProfileId());
    }

    static 
    {
        maxNumGridColumns = new SparseArray(2);
        SparseIntArray sparseintarray = new SparseIntArray();
        sparseintarray.put(1, 1);
        sparseintarray.put(2, 2);
        sparseintarray.put(3, 2);
        sparseintarray.put(4, 2);
        maxNumGridColumns.put(1, sparseintarray);
        sparseintarray = new SparseIntArray();
        sparseintarray.put(1, 2);
        sparseintarray.put(2, 3);
        sparseintarray.put(3, 3);
        sparseintarray.put(4, 3);
        maxNumGridColumns.put(2, sparseintarray);
    }



/*
    static ServiceManager access$102(ProfileSelectionActivity profileselectionactivity, ServiceManager servicemanager)
    {
        profileselectionactivity.manager = servicemanager;
        return servicemanager;
    }

*/



}
