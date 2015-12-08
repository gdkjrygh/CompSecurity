// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jeremyfeinstein.slidingmenu.lib.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;

// Referenced classes of package com.jeremyfeinstein.slidingmenu.lib.app:
//            SlidingMenu

public class SlidingActivityHelper
{

    private Activity mActivity;
    private boolean mBroadcasting;
    private boolean mEnableSlide;
    private boolean mOnPostCreateCalled;
    private SlidingMenu mSlidingMenu;
    private View mViewAbove;
    private View mViewBehind;

    public SlidingActivityHelper(Activity activity)
    {
        mBroadcasting = false;
        mOnPostCreateCalled = false;
        mEnableSlide = true;
        mActivity = activity;
    }

    public View findViewById(int i)
    {
        if (mSlidingMenu != null)
        {
            View view = mSlidingMenu.findViewById(i);
            if (view != null)
            {
                return view;
            }
        }
        return null;
    }

    public SlidingMenu getSlidingMenu()
    {
        return mSlidingMenu;
    }

    public void onCreate(Bundle bundle)
    {
        mSlidingMenu = (SlidingMenu)LayoutInflater.from(mActivity).inflate(com.jeremyfeinstein.slidingmenu.lib.R.layout.slidingmenumain, null);
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (i == 4 && mSlidingMenu.isMenuShowing())
        {
            showContent();
            return true;
        } else
        {
            return false;
        }
    }

    public void onPostCreate(Bundle bundle)
    {
        int i = 1;
        if (mViewBehind == null || mViewAbove == null)
        {
            throw new IllegalStateException("Both setBehindContentView must be called in onCreate in addition to setContentView.");
        }
        mOnPostCreateCalled = true;
        SlidingMenu slidingmenu = mSlidingMenu;
        Activity activity = mActivity;
        if (mEnableSlide)
        {
            i = 0;
        }
        slidingmenu.attachToActivity(activity, i);
        boolean flag;
        boolean flag1;
        if (bundle != null)
        {
            flag = bundle.getBoolean("SlidingActivityHelper.open");
            flag1 = bundle.getBoolean("SlidingActivityHelper.secondary");
        } else
        {
            flag = false;
            flag1 = false;
        }
        (new Handler()).post(new _cls1(flag, flag1));
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("SlidingActivityHelper.open", mSlidingMenu.isMenuShowing());
        bundle.putBoolean("SlidingActivityHelper.secondary", mSlidingMenu.isSecondaryMenuShowing());
    }

    public void registerAboveContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (!mBroadcasting)
        {
            mViewAbove = view;
        }
    }

    public void setBehindContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        mViewBehind = view;
        mSlidingMenu.setMenu(mViewBehind);
    }

    public void setContentView(View view)
    {
        mBroadcasting = true;
        mActivity.setContentView(view);
    }

    public void setSlidingActionBarEnabled(boolean flag)
    {
        if (mOnPostCreateCalled)
        {
            throw new IllegalStateException("enableSlidingActionBar must be called in onCreate.");
        } else
        {
            mEnableSlide = flag;
            return;
        }
    }

    public void showContent()
    {
        mSlidingMenu.showContent();
    }

    public void showMenu()
    {
        mSlidingMenu.showMenu();
    }

    public void showSecondaryMenu()
    {
        mSlidingMenu.showSecondaryMenu();
    }

    public void toggle()
    {
        mSlidingMenu.toggle();
    }


    /* member class not found */
    class _cls1 {}

}
