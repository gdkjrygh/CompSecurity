// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.app.ActionBar;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.FrameLayout;
import com.analytics.AnalyticsMain;
import com.fsr.tracker.TrackerEventListener;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingActivity;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.WindowUtils;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.ui.components.SlidingUpViewHelper;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.listener.HamburgerCloseListener;
import com.kohls.mcommerce.opal.framework.view.adapter.NavigationDrawerAdapter;
import com.kohls.mcommerce.opal.framework.view.component.views.BottomBarDrawer;
import com.kohls.mcommerce.opal.framework.view.fragment.HamburgerListFragment;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;

public abstract class BaseActivityWithSlider extends SlidingActivity
    implements TrackerEventListener
{

    private int mActionBarHeight;
    private ActionBarHelper mActionBarHelper;
    private HamburgerCloseListener mHamburgerCloseListener;
    private boolean mIsHamburgerVisible;
    private HamburgerListFragment mMenuFragment;
    private SlidingUpViewHelper mSlidingViewHelper;
    private boolean mWasInSideOnStart;

    public BaseActivityWithSlider()
    {
    }

    private void initLeftSlidMenu()
    {
        Object obj = new FrameLayout(this);
        ((FrameLayout) (obj)).setId("LEFT".hashCode());
        setBehindContentView(((android.view.View) (obj)));
        setSlidingActionBarEnabled(true);
        obj = getFragmentManager().beginTransaction();
        mMenuFragment = new HamburgerListFragment();
        ((FragmentTransaction) (obj)).replace("LEFT".hashCode(), mMenuFragment, HamburgerListFragment.TAG);
        ((FragmentTransaction) (obj)).commit();
        obj = getSlidingMenu();
        ((SlidingMenu) (obj)).setMode(0);
        ((SlidingMenu) (obj)).setShadowDrawable(0x7f0201b5);
        ((SlidingMenu) (obj)).setShadowWidth(30);
        setSlidingMenuOffset(true);
        ((SlidingMenu) (obj)).setFadeDegree(0.9F);
        ((SlidingMenu) (obj)).setTouchModeAbove(1);
        ((SlidingMenu) (obj)).setOnOpenListener(new com.jeremyfeinstein.slidingmenu.lib.app.SlidingMenu.OnOpenListener() {

            final BaseActivityWithSlider this$0;

            public void onOpen()
            {
                setIsHamburgerVisible(true);
                AnalyticsHelper.sendAnalyticsOnShopMenuVisibility();
                UtilityMethods.hideKeyboard(BaseActivityWithSlider.this, mActionBarHelper.getItemView());
                if (mHamburgerCloseListener != null)
                {
                    mWasInSideOnStart = false;
                    mHamburgerCloseListener.onHamburgerMenuOpened();
                }
            }

            
            {
                this$0 = BaseActivityWithSlider.this;
                super();
            }
        });
        ((SlidingMenu) (obj)).setOnClosedListener(new com.jeremyfeinstein.slidingmenu.lib.app.SlidingMenu.OnClosedListener() {

            final BaseActivityWithSlider this$0;

            public void onClosed()
            {
                setIsHamburgerVisible(false);
                if (mHamburgerCloseListener != null && !mWasInSideOnStart)
                {
                    mWasInSideOnStart = false;
                    mHamburgerCloseListener.onHamburgerMenuClose();
                }
            }

            
            {
                this$0 = BaseActivityWithSlider.this;
                super();
            }
        });
    }

    private void setSlidingMenuOffset(boolean flag)
    {
        byte byte0 = 2;
        if (getResources().getConfiguration().orientation != 2)
        {
            byte0 = 3;
        }
        getSlidingMenu().setBehindOffset(WindowUtils.getDisplayMetrics(this).widthPixels / byte0 - 10);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        KohlsPhoneApplication.getInstance().getAuthenticationUtils().resetIdleTimer();
        boolean flag;
        try
        {
            flag = super.dispatchTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            motionevent.printStackTrace();
            return false;
        }
        return flag;
    }

    public int getActionBarHeight()
    {
        return mActionBarHeight;
    }

    public ActionBarHelper getActionBarHelper()
    {
        return mActionBarHelper;
    }

    public HamburgerListFragment getMenuFragment()
    {
        return mMenuFragment;
    }

    public SlidingUpViewHelper getSlidingViewHelper()
    {
        return mSlidingViewHelper;
    }

    public void hideSlider()
    {
        toggle();
    }

    protected void initActionBar()
    {
        getActionBar().setBackgroundDrawable(null);
        mActionBarHelper = new ActionBarHelper(this, getActionBar());
        mActionBarHelper.initActionBarWithCustomView();
    }

    public abstract void initContent();

    public boolean isIsHamburgerVisible()
    {
        return mIsHamburgerVisible;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030059);
        getWindow().setBackgroundDrawable(null);
        initActionBar();
        initLeftSlidMenu();
        initContent();
        mActionBarHeight = UtilityMethods.getActionBarHeight(this);
        mSlidingViewHelper = new SlidingUpViewHelper((BottomBarDrawer)findViewById(0x7f0d0205), this, getActionBarHeight());
        mSlidingViewHelper.initSlidingUpLayout();
        UtilityMethods.clearEditTextViewFocusOnOutsideTouch(getWindow().getDecorView(), this);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            break;
        }
        if (getSlidingMenu().isSlidingEnabled())
        {
            UtilityMethods.hideKeyboard(this, getWindow().getDecorView());
            toggle();
        } else
        {
            onBackPressed();
        }
        return true;
    }

    protected void onPause()
    {
        KohlsPhoneApplication.getInstance().setApplicationBackground();
        KohlsPhoneApplication.getInstance().getAnalytics().pauseCollectingLifeCycleData();
        super.onPause();
    }

    protected void onResume()
    {
        if (KohlsPhoneApplication.getInstance().isAppBackground())
        {
            UtilityMethods.getFlushTimes();
            KohlsPhoneApplication.getInstance().getConfigurationUtils().fetchAppConfigFromApi(null);
        }
        KohlsPhoneApplication.getInstance().setApplicationForeground();
        KohlsPhoneApplication.getInstance().getAnalytics().startCollectingLifeCycleData(this);
        mMenuFragment.mDrawerAdapter.notifyDataSetChanged();
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        mWasInSideOnStart = true;
        updateActionBarViews();
    }

    public void removeHamburgerCloseListener()
    {
        mHamburgerCloseListener = null;
    }

    public void setHamburgerCloseListener(HamburgerCloseListener hamburgercloselistener)
    {
        mHamburgerCloseListener = hamburgercloselistener;
    }

    public void setIsHamburgerVisible(boolean flag)
    {
        mIsHamburgerVisible = flag;
    }

    protected abstract void updateActionBarViews();





/*
    static boolean access$202(BaseActivityWithSlider baseactivitywithslider, boolean flag)
    {
        baseactivitywithslider.mWasInSideOnStart = flag;
        return flag;
    }

*/
}
