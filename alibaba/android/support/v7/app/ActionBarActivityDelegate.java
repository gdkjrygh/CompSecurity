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
import android.support.v7.internal.app.WindowCallback;
import android.support.v7.internal.view.SupportMenuInflater;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateHC, ActionBarActivityDelegateBase, ActionBar, ActionBarActivity

abstract class ActionBarActivityDelegate
{
    class ActionBarDrawableToggleImpl
        implements a.e, ActionBarDrawerToggle.Delegate
    {

        final ActionBarActivityDelegate this$0;

        public Context getActionBarThemedContext()
        {
            return ActionBarActivityDelegate.this.getActionBarThemedContext();
        }

        public Drawable getThemeUpIndicator()
        {
            TypedArray typedarray = ActionBarActivityDelegate.this.getActionBarThemedContext().obtainStyledAttributes(new int[] {
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
    private ActionBar mActionBar;
    final ActionBarActivity mActivity;
    final WindowCallback mDefaultWindowCallback = new WindowCallback() {

        final ActionBarActivityDelegate this$0;

        public boolean onCreatePanelMenu(int i, Menu menu)
        {
            return mActivity.superOnCreatePanelMenu(i, menu);
        }

        public View onCreatePanelView(int i)
        {
            return null;
        }

        public boolean onMenuItemSelected(int i, MenuItem menuitem)
        {
            return mActivity.onMenuItemSelected(i, menuitem);
        }

        public boolean onMenuOpened(int i, Menu menu)
        {
            return mActivity.onMenuOpened(i, menu);
        }

        public void onPanelClosed(int i, Menu menu)
        {
            mActivity.onPanelClosed(i, menu);
        }

        public boolean onPreparePanel(int i, View view, Menu menu)
        {
            return mActivity.superOnPreparePanel(i, view, menu);
        }

        public ActionMode startActionMode(android.support.v7.view.ActionMode.Callback callback)
        {
            return startSupportActionModeFromWindow(callback);
        }

            
            {
                this$0 = ActionBarActivityDelegate.this;
                super();
            }
    };
    boolean mHasActionBar;
    private boolean mIsDestroyed;
    boolean mIsFloating;
    private MenuInflater mMenuInflater;
    boolean mOverlayActionBar;
    boolean mOverlayActionMode;
    private WindowCallback mWindowCallback;

    ActionBarActivityDelegate(ActionBarActivity actionbaractivity)
    {
        mActivity = actionbaractivity;
        mWindowCallback = mDefaultWindowCallback;
    }

    static ActionBarActivityDelegate createDelegate(ActionBarActivity actionbaractivity)
    {
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

    abstract View createView(String s, Context context, AttributeSet attributeset);

    final void destroy()
    {
        mIsDestroyed = true;
    }

    protected final Context getActionBarThemedContext()
    {
        Context context = null;
        Object obj = getSupportActionBar();
        if (obj != null)
        {
            context = ((ActionBar) (obj)).getThemedContext();
        }
        obj = context;
        if (context == null)
        {
            obj = mActivity;
        }
        return ((Context) (obj));
    }

    final a.e getDrawerToggleDelegate()
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
        if (mHasActionBar && mActionBar == null)
        {
            mActionBar = createSupportActionBar();
        }
        return mActionBar;
    }

    final String getUiOptionsFromMetadata()
    {
        String s = null;
        try
        {
            ActivityInfo activityinfo = mActivity.getPackageManager().getActivityInfo(mActivity.getComponentName(), 128);
            if (activityinfo.metaData != null)
            {
                s = activityinfo.metaData.getString("android.support.UI_OPTIONS");
            }
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Log.e("ActionBarActivityDelegate", (new StringBuilder()).append("getUiOptionsFromMetadata: Activity '").append(mActivity.getClass().getSimpleName()).append("' not in manifest").toString());
            return null;
        }
        return s;
    }

    final ActionBarDrawerToggle.Delegate getV7DrawerToggleDelegate()
    {
        return new ActionBarDrawableToggleImpl();
    }

    final WindowCallback getWindowCallback()
    {
        return mWindowCallback;
    }

    final boolean isDestroyed()
    {
        return mIsDestroyed;
    }

    abstract boolean onBackPressed();

    abstract void onConfigurationChanged(Configuration configuration);

    abstract void onContentChanged();

    void onCreate(Bundle bundle)
    {
        bundle = mActivity.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.Theme);
        if (!bundle.hasValue(android.support.v7.appcompat.R.styleable.Theme_windowActionBar))
        {
            bundle.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (bundle.getBoolean(android.support.v7.appcompat.R.styleable.Theme_windowActionBar, false))
        {
            mHasActionBar = true;
        }
        if (bundle.getBoolean(android.support.v7.appcompat.R.styleable.Theme_windowActionBarOverlay, false))
        {
            mOverlayActionBar = true;
        }
        if (bundle.getBoolean(android.support.v7.appcompat.R.styleable.Theme_windowActionModeOverlay, false))
        {
            mOverlayActionMode = true;
        }
        mIsFloating = bundle.getBoolean(android.support.v7.appcompat.R.styleable.Theme_android_windowIsFloating, false);
        bundle.recycle();
    }

    abstract boolean onCreatePanelMenu(int i, Menu menu);

    abstract View onCreatePanelView(int i);

    boolean onKeyDown(int i, KeyEvent keyevent)
    {
        return false;
    }

    abstract boolean onKeyShortcut(int i, KeyEvent keyevent);

    abstract boolean onMenuOpened(int i, Menu menu);

    abstract void onPanelClosed(int i, Menu menu);

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

    final ActionBar peekSupportActionBar()
    {
        return mActionBar;
    }

    abstract void setContentView(int i);

    abstract void setContentView(View view);

    abstract void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams);

    protected final void setSupportActionBar(ActionBar actionbar)
    {
        mActionBar = actionbar;
    }

    abstract void setSupportActionBar(Toolbar toolbar);

    abstract void setSupportProgress(int i);

    abstract void setSupportProgressBarIndeterminate(boolean flag);

    abstract void setSupportProgressBarIndeterminateVisibility(boolean flag);

    abstract void setSupportProgressBarVisibility(boolean flag);

    final void setWindowCallback(WindowCallback windowcallback)
    {
        if (windowcallback == null)
        {
            throw new IllegalArgumentException("callback can not be null");
        } else
        {
            mWindowCallback = windowcallback;
            return;
        }
    }

    abstract ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback);

    abstract ActionMode startSupportActionModeFromWindow(android.support.v7.view.ActionMode.Callback callback);

    abstract void supportInvalidateOptionsMenu();

    abstract boolean supportRequestWindowFeature(int i);
}
