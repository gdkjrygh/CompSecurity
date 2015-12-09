// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.destination.main.MainActivity;
import com.google.android.gms.games.ui.destination.sharedprefs.SharedPrefsConfig;
import com.google.android.gms.games.ui.destination.util.NavigationDrawerUtils;
import com.google.android.gms.games.util.PanoUtils;
import com.google.android.gms.people.Graph;
import com.google.android.gms.people.People;
import com.google.android.gms.people.accountswitcherview.AccountOrderingHelper;
import com.google.android.gms.people.accountswitcherview.AccountSwitcherView;
import com.google.android.gms.people.accountswitcherview.OwnersAvatarManager;
import com.google.android.gms.people.accountswitcherview.OwnersCoverPhotoManager;
import com.google.android.gms.people.accountswitcherview.OwnersImageManager;
import com.google.android.gms.people.accountswitcherview.OwnersListAdapter;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;
import com.google.android.gms.people.model.Owner;
import com.google.android.gms.people.model.OwnerBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.games.ui.destination:
//            DestinationFragmentActivityBase, SideDrawerAdapter

public abstract class DestinationFragmentActivity extends DestinationFragmentActivityBase
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.AccountChangeListener, com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.NavigationModeChangeListener
{
    private final class DestAppDrawerListener
        implements android.support.v4.widget.DrawerLayout.DrawerListener
    {

        final DestinationFragmentActivity this$0;

        public final void onDrawerClosed(View view)
        {
            mActionBarDrawerToggle.onDrawerClosed(view);
            DestinationFragmentActivity.this.onDrawerClosed();
        }

        public final void onDrawerOpened(View view)
        {
            mActionBarDrawerToggle.onDrawerOpened(view);
            if (!SharedPrefsConfig.getBoolean(DestinationFragmentActivity.this, "drawerHasBeenOpened", false))
            {
                SharedPrefsConfig.setBoolean(DestinationFragmentActivity.this, "drawerHasBeenOpened", true);
            }
            DestinationFragmentActivity.this.onDrawerOpened();
        }

        public final void onDrawerSlide(View view, float f)
        {
            mActionBarDrawerToggle.onDrawerSlide(view, f);
            DestinationFragmentActivity.onDrawerSlide$5359e7dd();
        }

        public final void onDrawerStateChanged(int i)
        {
            ActionBarDrawerToggle _tmp = mActionBarDrawerToggle;
        }

        private DestAppDrawerListener()
        {
            this$0 = DestinationFragmentActivity.this;
            super();
        }

        DestAppDrawerListener(byte byte0)
        {
            this();
        }
    }

    private static final class GamesDecorator
        implements com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.ViewDecorator
    {

        private DestinationFragmentActivity mActivity;

        public final void decorateView$625b805a(com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.ViewHolderItem viewholderitem, Owner owner)
        {
            if (PlatformVersion.checkVersion(11))
            {
                viewholderitem.coverPhoto.setOnClickListener(mActivity);
                viewholderitem.coverPhoto.setContentDescription(mActivity.getString(0x7f100100, new Object[] {
                    owner.getAccountName()
                }));
                viewholderitem.accountText.setOnClickListener(mActivity);
                return;
            } else
            {
                viewholderitem.selectedAvatar.setOnClickListener(mActivity);
                viewholderitem.selectedAccountDisplayName.setOnClickListener(mActivity);
                return;
            }
        }

        public GamesDecorator(DestinationFragmentActivity destinationfragmentactivity)
        {
            mActivity = destinationfragmentactivity;
        }
    }


    static final String TAG = com/google/android/gms/games/ui/destination/DestinationFragmentActivity.getSimpleName();
    SelectedAccountNavigationView mAccountSwitcher;
    private ActionBarDrawerToggle mActionBarDrawerToggle;
    OwnersAvatarManager mAvatarManager;
    String mCurrentAccountName;
    private DrawerLayout mDrawerContainer;
    private SideDrawerAdapter mDrawerListAdapter;
    private View mDrawerView;
    public boolean mLaunchHelpAndFeedback;
    private ListView mListView;
    OwnersListAdapter mOwnerAdapter;
    OwnerBuffer mOwnerBuffer;

    public DestinationFragmentActivity(int i)
    {
        this(i, 0);
    }

    public DestinationFragmentActivity(int i, int j)
    {
        this(i, j, false);
    }

    public DestinationFragmentActivity(int i, int j, boolean flag)
    {
        this(i, j, flag, true);
    }

    public DestinationFragmentActivity(int i, int j, boolean flag, boolean flag1)
    {
        super(i, j, flag, flag1);
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
    }

    private void loadOwnersList()
    {
        com.google.android.gms.people.Graph.LoadOwnersOptions loadownersoptions = new com.google.android.gms.people.Graph.LoadOwnersOptions();
        loadownersoptions.mIncludePlusPages = false;
        People.GraphApi.loadOwners(getGoogleApiClient(), loadownersoptions).setResultCallback(new ResultCallback() {

            final DestinationFragmentActivity this$0;

            public final volatile void onResult(Result result)
            {
                com.google.android.gms.people.Graph.LoadOwnersResult loadownersresult = (com.google.android.gms.people.Graph.LoadOwnersResult)result;
                DestinationFragmentActivity destinationfragmentactivity = DestinationFragmentActivity.this;
                if (!destinationfragmentactivity.getGoogleApiClient().isConnected())
                {
                    GamesLog.w(DestinationFragmentActivity.TAG, "onOwnersLoaded - trying to update owners when not connected...");
                } else
                {
                    result = loadownersresult.getStatus();
                    OwnerBuffer ownerbuffer = loadownersresult.getOwners();
                    if (result.isSuccess())
                    {
                        ArrayList arraylist = new ArrayList();
                        result = ownerbuffer.get(0);
                        int j = ownerbuffer.getCount();
                        int i = 0;
                        while (i < j) 
                        {
                            Owner owner = ownerbuffer.get(i);
                            if (owner.getAccountName().equals(destinationfragmentactivity.mCurrentAccountName))
                            {
                                result = owner;
                            } else
                            {
                                arraylist.add(owner);
                            }
                            i++;
                        }
                        if (destinationfragmentactivity.mOwnerAdapter == null)
                        {
                            destinationfragmentactivity.mOwnerAdapter = new OwnersListAdapter(destinationfragmentactivity);
                            destinationfragmentactivity.mOwnerAdapter.mAvatarLoader = destinationfragmentactivity.mAvatarManager;
                            OwnersListAdapter ownerslistadapter = destinationfragmentactivity.mOwnerAdapter;
                            if (!ownerslistadapter.mShowManageAccounts)
                            {
                                ownerslistadapter.mShowManageAccounts = true;
                                ownerslistadapter.notifyDataSetChanged();
                            }
                            ownerslistadapter = destinationfragmentactivity.mOwnerAdapter;
                            if (!ownerslistadapter.mShowAddAccount)
                            {
                                ownerslistadapter.mShowAddAccount = true;
                                ownerslistadapter.notifyDataSetChanged();
                            }
                        }
                        destinationfragmentactivity.mOwnerAdapter.setOwners(arraylist);
                        destinationfragmentactivity.mAccountSwitcher.bind(result);
                        if (destinationfragmentactivity.mOwnerBuffer != null)
                        {
                            destinationfragmentactivity.mOwnerBuffer.release();
                        }
                        destinationfragmentactivity.mOwnerBuffer = ownerbuffer;
                        return;
                    }
                    GamesLog.e(DestinationFragmentActivity.TAG, (new StringBuilder("onOwnersLoaded - failed to load owners status: ")).append(result).toString());
                    if (ownerbuffer != null)
                    {
                        ownerbuffer.release();
                        return;
                    }
                }
            }

            
            {
                this$0 = DestinationFragmentActivity.this;
                super();
            }
        });
    }

    protected static void onDrawerSlide$5359e7dd()
    {
    }

    private void setActionBarHomeIcon()
    {
        if (mActionBarDrawerToggle != null)
        {
            ActionBarDrawerToggle actionbardrawertoggle = mActionBarDrawerToggle;
            boolean flag = this instanceof MainActivity;
            if (flag != actionbardrawertoggle.mDrawerIndicatorEnabled)
            {
                if (flag)
                {
                    Drawable drawable = (Drawable)actionbardrawertoggle.mSlider;
                    int i;
                    if (actionbardrawertoggle.mDrawerLayout.isDrawerOpen$134632())
                    {
                        i = actionbardrawertoggle.mCloseDrawerContentDescRes;
                    } else
                    {
                        i = actionbardrawertoggle.mOpenDrawerContentDescRes;
                    }
                    actionbardrawertoggle.setActionBarUpIndicator(drawable, i);
                } else
                {
                    actionbardrawertoggle.setActionBarUpIndicator(actionbardrawertoggle.mHomeAsUpIndicator, 0);
                }
                actionbardrawertoggle.mDrawerIndicatorEnabled = flag;
            }
        }
    }

    private void syncActionBarIconState()
    {
        if (mActionBarDrawerToggle != null)
        {
            ActionBarDrawerToggle actionbardrawertoggle = mActionBarDrawerToggle;
            if (actionbardrawertoggle.mDrawerLayout.isDrawerOpen$134632())
            {
                actionbardrawertoggle.mSlider.setPosition(1.0F);
            } else
            {
                actionbardrawertoggle.mSlider.setPosition(0.0F);
            }
            if (actionbardrawertoggle.mDrawerIndicatorEnabled)
            {
                Drawable drawable = (Drawable)actionbardrawertoggle.mSlider;
                int i;
                if (actionbardrawertoggle.mDrawerLayout.isDrawerOpen$134632())
                {
                    i = actionbardrawertoggle.mCloseDrawerContentDescRes;
                } else
                {
                    i = actionbardrawertoggle.mOpenDrawerContentDescRes;
                }
                actionbardrawertoggle.setActionBarUpIndicator(drawable, i);
            }
        }
    }

    protected final void addApisToGoogleApiClient(com.google.android.gms.common.api.GoogleApiClient.Builder builder)
    {
        super.addApisToGoogleApiClient(builder);
        com.google.android.gms.people.People.PeopleOptions1p.Builder builder1 = new com.google.android.gms.people.People.PeopleOptions1p.Builder();
        builder1.clientApplicationId = 118;
        builder.addApi(People.API_1P, builder1.build());
    }

    public final void closeDrawer()
    {
        if (mDrawerContainer != null)
        {
            mDrawerContainer.closeDrawer(mDrawerView);
        }
    }

    public final void onAccountChange(Owner owner)
    {
        Object obj = getGoogleApiClient();
        if (((GoogleApiClient) (obj)).isConnected())
        {
            obj = Games.getCurrentAccountName(((GoogleApiClient) (obj)));
            if (owner.getAccountName().equals(obj))
            {
                mAccountSwitcher.bind(owner);
                GamesLog.w(TAG, "onChildClick - Trying to sign-in with an account we are already signed into...");
            }
        }
        switchAccount(owner.getAccountName());
    }

    public void onBackPressed()
    {
        logClickEvent(900);
        super.onBackPressed();
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            GamesLog.w(TAG, (new StringBuilder("onClick: unexpected view: ")).append(view).append(", id ").append(view.getId()).toString());
            return;

        case 2131558505: 
        case 2131558637: 
        case 2131559178: 
            NavigationDrawerUtils.onDrawerItemClicked(this, 100, view);
            mDrawerListAdapter.notifyDataSetChanged();
            closeDrawer();
            return;

        case 2131559234: 
            break;
        }
        int i;
        if (mAccountSwitcher.mNavigationMode == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        mAccountSwitcher.setNavigationMode(i);
        onNavigationModeChange(mAccountSwitcher);
    }

    public void onConnected(Bundle bundle)
    {
        super.onConnected(bundle);
        updateInboxCount();
        mCurrentAccountName = Games.getCurrentAccountName(getGoogleApiClient());
        loadOwnersList();
        bundle = mDrawerListAdapter;
        if (NavigationDrawerUtils.setUserPlusEnabled(super.mIsPlusEnabled, ((SideDrawerAdapter) (bundle)).mSideDrawerItems))
        {
            bundle.notifyDataSetChanged();
        }
        if (!super.mIsPlusEnabled)
        {
            int i;
            if (((Boolean)G.useIconInNavDrawerUpsell.get()).booleanValue())
            {
                i = 1;
            } else
            {
                i = 2;
            }
            logPlusUpgradeViewEvent(1, Integer.valueOf(i));
        }
        if (mResetHomePage)
        {
            mResetHomePage = false;
            restartGamesActivity();
        }
    }

    public void onCreate(Bundle bundle)
    {
        getIntent();
        super.onCreate(bundle);
        if (PanoUtils.isPano(this))
        {
            GamesLog.e(TAG, "Phone/tablet activity on an Android TV device; bailing out...");
            finish();
        }
        mDrawerContainer = (DrawerLayout)findViewById(0x7f0d0147);
        Asserts.checkNotNull(mDrawerContainer, "Missing 'drawer_container' in activity layout");
        if (mDrawerContainer == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        int i;
        obj = mDrawerContainer;
        obj1 = ((DrawerLayout) (obj)).getResources().getDrawable(0x7f0200bd);
        i = GravityCompat.getAbsoluteGravity(0x800003, ViewCompat.getLayoutDirection(((View) (obj))));
        if ((i & 3) == 3)
        {
            obj.mShadowLeft = ((Drawable) (obj1));
            ((DrawerLayout) (obj)).invalidate();
        }
        if ((i & 5) == 5)
        {
            obj.mShadowRight = ((Drawable) (obj1));
            ((DrawerLayout) (obj)).invalidate();
        }
        mDrawerContainer.mListener = new DestAppDrawerListener((byte)0);
        mDrawerView = getLayoutInflater().inflate(0x7f040134, mDrawerContainer, false);
        mDrawerContainer.addView(mDrawerView);
        mDrawerContainer.setFocusable(false);
        obj = (android.support.v4.widget.DrawerLayout.LayoutParams)mDrawerView.getLayoutParams();
        obj.gravity = 3;
        obj.width = (int)getResources().getDimension(0x7f0c01ca);
        mDrawerView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        mActionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerContainer);
        setActionBarHomeIcon();
        obj = mDrawerContainer;
        obj1 = getString(0x7f10010e);
        i = GravityCompat.getAbsoluteGravity(0x800003, ViewCompat.getLayoutDirection(((View) (obj))));
        if (i != 3) goto _L4; else goto _L3
_L3:
        obj.mTitleLeft = ((CharSequence) (obj1));
_L6:
        if (bundle == null && shouldDrawerBeOpenInitially())
        {
            mDrawerContainer.openDrawer(mDrawerView);
            onDrawerOpened();
        }
        syncActionBarIconState();
_L2:
        mListView = (ListView)findViewById(0x7f0d0349);
        mListView.setDivider(null);
        mListView.setDividerHeight(0);
        mAvatarManager = new OwnersAvatarManager(this, getGoogleApiClient());
        mAccountSwitcher = (SelectedAccountNavigationView)getLayoutInflater().inflate(0x7f040043, mListView, false);
        bundle = mAccountSwitcher;
        obj = new GamesDecorator(this);
        bundle.mLayoutResId = -1;
        bundle.mViewHolderItemCreator = null;
        bundle.mDecorator = ((com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.ViewDecorator) (obj));
        bundle = mAccountSwitcher;
        boolean flag;
        if (AccountSwitcherView.isAtLeastVersion(11))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.mForceFullHeight = flag;
        bundle.mShowRecents = ((SelectedAccountNavigationView) (bundle)).mForceFullHeight;
        bundle = mAccountSwitcher;
        bundle.mClient = getGoogleApiClient();
        if (((SelectedAccountNavigationView) (bundle)).mClient != null)
        {
            bundle.mCoverLoader = new OwnersCoverPhotoManager(bundle.getContext(), ((SelectedAccountNavigationView) (bundle)).mClient);
        }
        mAccountSwitcher.mAvatarLoader = mAvatarManager;
        mAccountSwitcher.mAccountChangeListener = this;
        mAccountSwitcher.mListener = this;
        mAccountSwitcher.setNavigationMode(0);
        mListView.addHeaderView(mAccountSwitcher);
        mDrawerListAdapter = new SideDrawerAdapter(this, NavigationDrawerUtils.getDrawerItems(this));
        mListView.setAdapter(mDrawerListAdapter);
        mListView.setOnItemClickListener(this);
        updateTaskDescription(null);
        return;
_L4:
        if (i == 5)
        {
            obj.mTitleRight = ((CharSequence) (obj1));
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onDestroy()
    {
        if (mAvatarManager != null)
        {
            OwnersAvatarManager ownersavatarmanager = mAvatarManager;
            if (((OwnersImageManager) (ownersavatarmanager)).mRunningRequest != null)
            {
                ((OwnersImageManager) (ownersavatarmanager)).mRunningRequest.canceled = true;
            }
            ((OwnersImageManager) (ownersavatarmanager)).mPendingRequests.clear();
            ownersavatarmanager.mClosed = true;
        }
        if (mOwnerAdapter != null)
        {
            OwnersListAdapter ownerslistadapter = mOwnerAdapter;
            if (ownerslistadapter.mAccountOrderingHelper != null)
            {
                ownerslistadapter.mAccountOrderingHelper.detach();
            }
        }
        if (mOwnerBuffer != null)
        {
            mOwnerBuffer.release();
        }
        super.onDestroy();
    }

    public void onDrawerClosed()
    {
        if (mLaunchHelpAndFeedback)
        {
            updateTaskDescription(getResources().getString(0x7f100103));
            PowerUpUtils.launchHelpAndFeedback(this);
        }
        if (mAccountSwitcher != null && mAccountSwitcher.mNavigationMode != 0)
        {
            mAccountSwitcher.setNavigationMode(0);
            onNavigationModeChange(mAccountSwitcher);
        }
    }

    public void onDrawerOpened()
    {
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (mOwnerAdapter != null && mAccountSwitcher != null)
        {
            i--;
            if (mOwnerAdapter.getItemViewType(i) == 0)
            {
                if (mOwnerAdapter.getCount() > i)
                {
                    mAccountSwitcher.bind(mOwnerAdapter.getItem(i));
                    onAccountChange(mOwnerAdapter.getItem(i));
                }
            } else
            {
                if (mOwnerAdapter.getItemViewType(i) == 1)
                {
                    adapterview = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
                    adapterview.putExtra("account_types", new String[] {
                        "com.google"
                    });
                    startActivity(adapterview);
                    return;
                }
                if (mOwnerAdapter.getItemViewType(i) == 2)
                {
                    adapterview = new Intent("android.settings.SYNC_SETTINGS");
                    adapterview.putExtra("settings", new String[] {
                        "google"
                    });
                    startActivity(adapterview);
                    return;
                }
            }
        }
    }

    public final void onNavigationModeChange(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        int i = selectedaccountnavigationview.mNavigationMode;
        if (i == 0)
        {
            if (mDrawerListAdapter != null)
            {
                mListView.setAdapter(mDrawerListAdapter);
            }
        } else
        if (i == 1)
        {
            if (mOwnerAdapter != null)
            {
                mListView.setAdapter(mOwnerAdapter);
                return;
            }
        } else
        {
            GamesLog.w(TAG, (new StringBuilder("Unknown navigation mode: ")).append(i).toString());
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        if (mActionBarDrawerToggle != null)
        {
            Object obj = mActionBarDrawerToggle;
            boolean flag = flag1;
            if (menuitem != null)
            {
                flag = flag1;
                if (menuitem.getItemId() == 0x102002c)
                {
                    flag = flag1;
                    if (((ActionBarDrawerToggle) (obj)).mDrawerIndicatorEnabled)
                    {
                        View view = ((ActionBarDrawerToggle) (obj)).mDrawerLayout.findDrawerWithGravity(0x800003);
                        if (view != null)
                        {
                            flag2 = DrawerLayout.isDrawerVisible(view);
                        }
                        if (flag2)
                        {
                            obj = ((ActionBarDrawerToggle) (obj)).mDrawerLayout;
                            View view1 = ((DrawerLayout) (obj)).findDrawerWithGravity(0x800003);
                            if (view1 == null)
                            {
                                throw new IllegalArgumentException((new StringBuilder("No drawer view found with gravity ")).append(DrawerLayout.gravityToString(0x800003)).toString());
                            }
                            ((DrawerLayout) (obj)).closeDrawer(view1);
                        } else
                        {
                            ((ActionBarDrawerToggle) (obj)).mDrawerLayout.openDrawer$13462e();
                        }
                        flag = true;
                    }
                }
            }
            if (flag)
            {
                return true;
            }
        }
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            logClickEvent(575);
            break;
        }
        onUpPressed();
        return true;
    }

    public void onPause()
    {
        super.onPause();
        if (mLaunchHelpAndFeedback)
        {
            mLaunchHelpAndFeedback = false;
            if (getDelegate().getSupportActionBar() != null && (this instanceof MainActivity))
            {
                NavigationDrawerUtils.updateCurrentTitle((MainActivity)this);
            }
        }
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        syncActionBarIconState();
    }

    public void onResume()
    {
        super.onResume();
        syncActionBarIconState();
        if (mDrawerListAdapter != null)
        {
            mDrawerListAdapter.notifyDataSetChanged();
        }
    }

    public final void onSetActionBar()
    {
        super.onSetActionBar();
        getDelegate().getSupportActionBar();
        getDelegate().getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setActionBarHomeIcon();
        syncActionBarIconState();
    }

    public void onStart()
    {
        super.onStart();
        if (getGoogleApiClient().isConnected())
        {
            loadOwnersList();
        }
    }

    public void onUpPressed()
    {
        super.onBackPressed();
    }

    protected final void restartGamesActivity()
    {
        super.restartGamesActivity();
        Intent intent = new Intent(this, com/google/android/gms/games/ui/destination/main/MainActivity);
        intent.addFlags(0x4000000);
        intent.putExtra("com.google.android.gms.games.ui.destination.main.MainActivity.restartedActivity", true);
        startActivity(intent);
        finish();
        overridePendingTransition(0, 0);
    }

    public boolean shouldDrawerBeOpenInitially()
    {
        return false;
    }

    protected final void switchAccount(String s)
    {
        super.switchAccount(s);
        mResetHomePage = true;
        closeDrawer();
        if (isGoogleApiClientCreated())
        {
            getGoogleApiClient().disconnect();
        }
        mAccountName = s;
        createGoogleApiClient();
        getGoogleApiClient().connect();
    }

    public final void updateInboxCount()
    {
        super.updateInboxCount();
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w(TAG, "updateInboxCount - trying to update count when not connected...");
        } else
        if (super.mIsPlusEnabled)
        {
            Games.Notifications.getInboxActivityCounts(googleapiclient).setResultCallback(new ResultCallback() {

                final DestinationFragmentActivity this$0;

                public final volatile void onResult(Result result)
                {
                    result = (com.google.android.gms.games.Notifications.InboxCountResult)result;
                    Object obj = result.getStatus();
                    if (((Status) (obj)).isSuccess())
                    {
                        if (mDrawerListAdapter != null)
                        {
                            obj = mDrawerListAdapter;
                            int i = result.getTotalCount();
                            boolean flag = result.hasNewActivity();
                            obj.mInboxCount = i;
                            obj.mInboxHasNewActivity = flag;
                            ((SideDrawerAdapter) (obj)).notifyDataSetChanged();
                        }
                        return;
                    } else
                    {
                        GamesLog.e(DestinationFragmentActivity.TAG, (new StringBuilder("updateInboxCount - failed with status:")).append(((Status) (obj)).mStatusCode).toString());
                        return;
                    }
                }

            
            {
                this$0 = DestinationFragmentActivity.this;
                super();
            }
            });
            return;
        }
    }




}
