// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal;

import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.internal.app.ActionBarWrapper;
import com.actionbarsherlock.internal.view.menu.MenuItemWrapper;
import com.actionbarsherlock.internal.view.menu.MenuWrapper;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.MenuInflater;

public class ActionBarSherlockNative extends ActionBarSherlock
{
    private class ActionModeCallbackWrapper
        implements android.view.ActionMode.Callback
    {

        private final com.actionbarsherlock.view.ActionMode.Callback mCallback;
        final ActionBarSherlockNative this$0;

        public boolean onActionItemClicked(android.view.ActionMode actionmode, MenuItem menuitem)
        {
            return mCallback.onActionItemClicked(mActionMode, mActionMode.getMenu().findItem(menuitem));
        }

        public boolean onCreateActionMode(android.view.ActionMode actionmode, Menu menu)
        {
            mActionMode = new ActionModeWrapper(actionmode);
            return mCallback.onCreateActionMode(mActionMode, mActionMode.getMenu());
        }

        public void onDestroyActionMode(android.view.ActionMode actionmode)
        {
            mCallback.onDestroyActionMode(mActionMode);
            if (
// JavaClassFileOutputException: get_constant: invalid tag

        public boolean onPrepareActionMode(android.view.ActionMode actionmode, Menu menu)
        {
            return mCallback.onPrepareActionMode(mActionMode, mActionMode.getMenu());
        }

        public ActionModeCallbackWrapper(com.actionbarsherlock.view.ActionMode.Callback callback)
        {
            this$0 = ActionBarSherlockNative.this;
            super();
            mCallback = callback;
        }
    }

    private class ActionModeWrapper extends ActionMode
    {

        private final android.view.ActionMode mActionMode;
        private MenuWrapper mMenu;
        final ActionBarSherlockNative this$0;

        public void finish()
        {
            mActionMode.finish();
        }

        public View getCustomView()
        {
            return mActionMode.getCustomView();
        }

        public MenuWrapper getMenu()
        {
            if (mMenu == null)
            {
                mMenu = new MenuWrapper(mActionMode.getMenu());
            }
            return mMenu;
        }

        public volatile com.actionbarsherlock.view.Menu getMenu()
        {
            return getMenu();
        }

        public MenuInflater getMenuInflater()
        {
            return ActionBarSherlockNative.this.getMenuInflater();
        }

        public CharSequence getSubtitle()
        {
            return mActionMode.getSubtitle();
        }

        public Object getTag()
        {
            return mActionMode.getTag();
        }

        public CharSequence getTitle()
        {
            return mActionMode.getTitle();
        }

        public void invalidate()
        {
            mActionMode.invalidate();
            if (mMenu != null)
            {
                mMenu.invalidate();
            }
        }

        public void setCustomView(View view)
        {
            mActionMode.setCustomView(view);
        }

        public void setSubtitle(int i)
        {
            mActionMode.setSubtitle(i);
        }

        public void setSubtitle(CharSequence charsequence)
        {
            mActionMode.setSubtitle(charsequence);
        }

        public void setTag(Object obj)
        {
            mActionMode.setTag(obj);
        }

        public void setTitle(int i)
        {
            mActionMode.setTitle(i);
        }

        public void setTitle(CharSequence charsequence)
        {
            mActionMode.setTitle(charsequence);
        }

        ActionModeWrapper(android.view.ActionMode actionmode)
        {
            this$0 = ActionBarSherlockNative.this;
            super();
            mMenu = null;
            mActionMode = actionmode;
        }
    }


    private ActionBarWrapper mActionBar;
    private ActionModeWrapper mActionMode;
    private MenuWrapper mMenu;

    public ActionBarSherlockNative(Activity activity, int i)
    {
        ActionBarSherlock(activity, i);
    }

    private void initActionBar()
    {
        if (mActionBar != null || mActivity.getActionBar() == null)
        {
            return;
        } else
        {
            mActionBar = new ActionBarWrapper(mActivity);
            return;
        }
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        mActivity.getWindow().addContentView(view, layoutparams);
        initActionBar();
    }

    public boolean dispatchCreateOptionsMenu(Menu menu)
    {
        if (mMenu == null || menu != mMenu.unwrap())
        {
            mMenu = new MenuWrapper(menu);
        }
        return callbackCreateOptionsMenu(mMenu);
    }

    public void dispatchInvalidateOptionsMenu()
    {
        mActivity.getWindow().invalidatePanelMenu(0);
        if (mMenu != null)
        {
            mMenu.invalidate();
        }
    }

    public boolean dispatchOptionsItemSelected(MenuItem menuitem)
    {
        if (mMenu == null)
        {
            if (menuitem.getItemId() != 0x102002c)
            {
                throw new IllegalStateException((new StringBuilder("Non-home action item clicked before onCreateOptionsMenu with ID ")).append(menuitem.getItemId()).toString());
            }
            menuitem = new MenuItemWrapper(menuitem);
        } else
        {
            menuitem = mMenu.findItem(menuitem);
        }
        return callbackOptionsItemSelected(menuitem);
    }

    public boolean dispatchPrepareOptionsMenu(Menu menu)
    {
        return callbackPrepareOptionsMenu(mMenu);
    }

    public ActionBar getActionBar()
    {
        initActionBar();
        return mActionBar;
    }

    protected Context getThemedContext()
    {
        Activity activity = mActivity;
        TypedValue typedvalue = new TypedValue();
        mActivity.getTheme().resolveAttribute(0x1010397, typedvalue, true);
        Object obj = activity;
        if (typedvalue.resourceId != 0)
        {
            obj = new ContextThemeWrapper(activity, typedvalue.resourceId);
        }
        return ((Context) (obj));
    }

    public boolean hasFeature(int i)
    {
        return mActivity.getWindow().hasFeature(i);
    }

    public boolean requestFeature(int i)
    {
        return mActivity.getWindow().requestFeature(i);
    }

    public void setContentView(int i)
    {
        mActivity.getWindow().setContentView(i);
        initActionBar();
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        mActivity.getWindow().setContentView(view, layoutparams);
        initActionBar();
    }

    public void setProgress(int i)
    {
        mActivity.setProgress(i);
    }

    public void setProgressBarIndeterminate(boolean flag)
    {
        mActivity.setProgressBarIndeterminate(flag);
    }

    public void setProgressBarIndeterminateVisibility(boolean flag)
    {
        mActivity.setProgressBarIndeterminateVisibility(flag);
    }

    public void setProgressBarVisibility(boolean flag)
    {
        mActivity.setProgressBarVisibility(flag);
    }

    public void setSecondaryProgress(int i)
    {
        mActivity.setSecondaryProgress(i);
    }

    public void setTitle(CharSequence charsequence)
    {
        mActivity.getWindow().setTitle(charsequence);
    }

    public void setUiOptions(int i)
    {
        mActivity.getWindow().setUiOptions(i);
    }

    public void setUiOptions(int i, int j)
    {
        mActivity.getWindow().setUiOptions(i, j);
    }

    public ActionMode startActionMode(com.actionbarsherlock.view.ActionMode.Callback callback)
    {
        if (mActionMode != null)
        {
            mActionMode.finish();
        }
        ActionModeCallbackWrapper actionmodecallbackwrapper = null;
        if (callback != null)
        {
            actionmodecallbackwrapper = new ActionModeCallbackWrapper(callback);
        }
        if (mActivity.startActionMode(actionmodecallbackwrapper) == null)
        {
            mActionMode = null;
        }
        if ((mActivity instanceof com.actionbarsherlock.ActionBarSherlock.OnActionModeStartedListener) && mActionMode != null)
        {
            ((com.actionbarsherlock.ActionBarSherlock.OnActionModeStartedListener)mActivity).onActionModeStarted(mActionMode);
        }
        return mActionMode;
    }



}
