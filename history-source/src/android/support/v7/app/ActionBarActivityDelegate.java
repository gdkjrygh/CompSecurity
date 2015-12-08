// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.internal.view.SupportMenuInflater;
import android.support.v7.view.ActionMode;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateApi20, ActionBarActivityDelegateJBMR2, ActionBarActivityDelegateJB, ActionBarActivityDelegateICS, 
//            ActionBarActivityDelegateHC, ActionBarActivityDelegateBase, ActionBar, ActionBarActivity

abstract class ActionBarActivityDelegate
{
    private class ActionBarDrawableToggleImpl
        implements android.support.v4.app.ActionBarDrawerToggle.Delegate
    {

        final ActionBarActivityDelegate this$0;

        public Drawable getThemeUpIndicator()
        {
            TypedArray typedarray = mActivity.obtainStyledAttributes(new int[] {
                getHomeAsUpIndicatorAttrId()
            });
            Drawable drawable = typedarray.getDrawable(0);
            typedarray.recycle();
            return drawable;
        }

        public void setActionBarDescription(int i)
        {
            ActionBar actionbar = getSupportActionBar();
            if (actionbar != null)
            {
                actionbar.setHomeActionContentDescription(i);
            }
        }

        public void setActionBarUpIndicator(Drawable drawable, int i)
        {
            ActionBar actionbar = getSupportActionBar();
            if (actionbar != null)
            {
                actionbar.setHomeAsUpIndicator(drawable);
                actionbar.setHomeActionContentDescription(i);
            }
        }

        private ActionBarDrawableToggleImpl()
        {
            this$0 = ActionBarActivityDelegate.this;
            super();
        }

    }


    static final String METADATA_UI_OPTIONS = "android.support.UI_OPTIONS";
    private static final String TAG = "ActionBarActivityDelegate";
    static final String UIOPTION_SPLIT_ACTION_BAR_WHEN_NARROW = "splitActionBarWhenNarrow";
    private ActionBar mActionBar;
    final ActionBarActivity mActivity;
    private boolean mEnableDefaultActionBarUp;
    boolean mHasActionBar;
    private MenuInflater mMenuInflater;
    boolean mOverlayActionBar;

    ActionBarActivityDelegate(ActionBarActivity actionbaractivity)
    {
        mActivity = actionbaractivity;
    }

    static ActionBarActivityDelegate createDelegate(ActionBarActivity actionbaractivity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            return new ActionBarActivityDelegateApi20(actionbaractivity);
        }
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            return new ActionBarActivityDelegateJBMR2(actionbaractivity);
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new ActionBarActivityDelegateJB(actionbaractivity);
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new ActionBarActivityDelegateICS(actionbaractivity);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return new ActionBarActivityDelegateHC(actionbaractivity);
        } else
        {
            return new ActionBarActivityDelegateBase(actionbaractivity);
        }
    }

    abstract void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams);

    abstract ActionBar createSupportActionBar();

    protected final Context getActionBarThemedContext()
    {
        Object obj = mActivity;
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            obj = actionbar.getThemedContext();
        }
        return ((Context) (obj));
    }

    final android.support.v4.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
    {
        return new ActionBarDrawableToggleImpl();
    }

    abstract int getHomeAsUpIndicatorAttrId();

    MenuInflater getMenuInflater()
    {
        if (mMenuInflater == null)
        {
            mMenuInflater = new SupportMenuInflater(getActionBarThemedContext());
        }
        return mMenuInflater;
    }

    final ActionBar getSupportActionBar()
    {
        if (mHasActionBar || mOverlayActionBar)
        {
            if (mActionBar == null)
            {
                mActionBar = createSupportActionBar();
                if (mEnableDefaultActionBarUp)
                {
                    mActionBar.setDisplayHomeAsUpEnabled(true);
                }
            }
        } else
        {
            mActionBar = null;
        }
        return mActionBar;
    }

    protected final String getUiOptionsFromMetadata()
    {
        String s;
        ActivityInfo activityinfo;
        try
        {
            activityinfo = mActivity.getPackageManager().getActivityInfo(mActivity.getComponentName(), 128);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Log.e("ActionBarActivityDelegate", (new StringBuilder()).append("getUiOptionsFromMetadata: Activity '").append(mActivity.getClass().getSimpleName()).append("' not in manifest").toString());
            return null;
        }
        s = null;
        if (activityinfo.metaData != null)
        {
            s = activityinfo.metaData.getString("android.support.UI_OPTIONS");
        }
        return s;
    }

    abstract boolean onBackPressed();

    abstract void onConfigurationChanged(Configuration configuration);

    abstract void onContentChanged();

    void onCreate(Bundle bundle)
    {
label0:
        {
            bundle = mActivity.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.ActionBarWindow);
            if (!bundle.hasValue(0))
            {
                bundle.recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            mHasActionBar = bundle.getBoolean(0, false);
            mOverlayActionBar = bundle.getBoolean(1, false);
            bundle.recycle();
            if (NavUtils.getParentActivityName(mActivity) != null)
            {
                if (mActionBar != null)
                {
                    break label0;
                }
                mEnableDefaultActionBarUp = true;
            }
            return;
        }
        mActionBar.setDisplayHomeAsUpEnabled(true);
    }

    abstract boolean onCreatePanelMenu(int i, Menu menu);

    abstract View onCreatePanelView(int i);

    abstract boolean onMenuItemSelected(int i, MenuItem menuitem);

    abstract void onPostResume();

    boolean onPrepareOptionsPanel(View view, Menu menu)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            return mActivity.onPrepareOptionsMenu(menu);
        } else
        {
            return mActivity.superOnPrepareOptionsPanel(view, menu);
        }
    }

    abstract boolean onPreparePanel(int i, View view, Menu menu);

    abstract void onStop();

    abstract void onTitleChanged(CharSequence charsequence);

    abstract void setContentView(int i);

    abstract void setContentView(View view);

    abstract void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams);

    abstract void setSupportProgress(int i);

    abstract void setSupportProgressBarIndeterminate(boolean flag);

    abstract void setSupportProgressBarIndeterminateVisibility(boolean flag);

    abstract void setSupportProgressBarVisibility(boolean flag);

    abstract ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback);

    abstract void supportInvalidateOptionsMenu();

    abstract boolean supportRequestWindowFeature(int i);
}
