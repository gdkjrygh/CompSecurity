// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.app:
//            ActionBarDrawerToggle, ActionBarDrawerToggleHoneycomb

private static class <init>
    implements <init>
{

    final Activity mActivity;
    torInfo mSetIndicatorInfo;

    public Context getActionBarThemedContext()
    {
        ActionBar actionbar = mActivity.getActionBar();
        if (actionbar != null)
        {
            return actionbar.getThemedContext();
        } else
        {
            return mActivity;
        }
    }

    public Drawable getThemeUpIndicator()
    {
        return ActionBarDrawerToggleHoneycomb.getThemeUpIndicator(mActivity);
    }

    public boolean isNavigationVisible()
    {
        ActionBar actionbar = mActivity.getActionBar();
        return actionbar != null && (actionbar.getDisplayOptions() & 4) != 0;
    }

    public void setActionBarDescription(int i)
    {
        mSetIndicatorInfo = ActionBarDrawerToggleHoneycomb.setActionBarDescription(mSetIndicatorInfo, mActivity, i);
    }

    public void setActionBarUpIndicator(Drawable drawable, int i)
    {
        mActivity.getActionBar().setDisplayShowHomeEnabled(true);
        mSetIndicatorInfo = ActionBarDrawerToggleHoneycomb.setActionBarUpIndicator(mSetIndicatorInfo, mActivity, drawable, i);
        mActivity.getActionBar().setDisplayShowHomeEnabled(false);
    }

    private torInfo(Activity activity)
    {
        mActivity = activity;
    }

    mActivity(Activity activity, mActivity mactivity)
    {
        this(activity);
    }
}
