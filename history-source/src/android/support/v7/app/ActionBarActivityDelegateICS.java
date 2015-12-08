// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.internal.view.ActionModeWrapper;
import android.support.v7.internal.view.menu.MenuWrapperFactory;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegate, ActionBarActivity, ActionBarImplICS, ActionBar

class ActionBarActivityDelegateICS extends ActionBarActivityDelegate
{
    class WindowCallbackWrapper
        implements android.view.Window.Callback
    {

        final android.view.Window.Callback mWrapped;
        final ActionBarActivityDelegateICS this$0;

        public boolean dispatchGenericMotionEvent(MotionEvent motionevent)
        {
            return mWrapped.dispatchGenericMotionEvent(motionevent);
        }

        public boolean dispatchKeyEvent(KeyEvent keyevent)
        {
            return mWrapped.dispatchKeyEvent(keyevent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
        {
            return mWrapped.dispatchKeyShortcutEvent(keyevent);
        }

        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
            return mWrapped.dispatchPopulateAccessibilityEvent(accessibilityevent);
        }

        public boolean dispatchTouchEvent(MotionEvent motionevent)
        {
            return mWrapped.dispatchTouchEvent(motionevent);
        }

        public boolean dispatchTrackballEvent(MotionEvent motionevent)
        {
            return mWrapped.dispatchTrackballEvent(motionevent);
        }

        public void onActionModeFinished(ActionMode actionmode)
        {
            mWrapped.onActionModeFinished(actionmode);
            ActionBarActivityDelegateICS.this.onActionModeFinished(actionmode);
        }

        public void onActionModeStarted(ActionMode actionmode)
        {
            mWrapped.onActionModeStarted(actionmode);
            ActionBarActivityDelegateICS.this.onActionModeStarted(actionmode);
        }

        public void onAttachedToWindow()
        {
            mWrapped.onAttachedToWindow();
        }

        public void onContentChanged()
        {
            mWrapped.onContentChanged();
        }

        public boolean onCreatePanelMenu(int i, Menu menu)
        {
            return mWrapped.onCreatePanelMenu(i, menu);
        }

        public View onCreatePanelView(int i)
        {
            return mWrapped.onCreatePanelView(i);
        }

        public void onDetachedFromWindow()
        {
            mWrapped.onDetachedFromWindow();
        }

        public boolean onMenuItemSelected(int i, MenuItem menuitem)
        {
            return mWrapped.onMenuItemSelected(i, menuitem);
        }

        public boolean onMenuOpened(int i, Menu menu)
        {
            return mWrapped.onMenuOpened(i, menu);
        }

        public void onPanelClosed(int i, Menu menu)
        {
            mWrapped.onPanelClosed(i, menu);
        }

        public boolean onPreparePanel(int i, View view, Menu menu)
        {
            return mWrapped.onPreparePanel(i, view, menu);
        }

        public boolean onSearchRequested()
        {
            return mWrapped.onSearchRequested();
        }

        public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutparams)
        {
            mWrapped.onWindowAttributesChanged(layoutparams);
        }

        public void onWindowFocusChanged(boolean flag)
        {
            mWrapped.onWindowFocusChanged(flag);
        }

        public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
        {
            return mWrapped.onWindowStartingActionMode(callback);
        }

        public WindowCallbackWrapper(android.view.Window.Callback callback)
        {
            this$0 = ActionBarActivityDelegateICS.this;
            super();
            mWrapped = callback;
        }
    }


    Menu mMenu;

    ActionBarActivityDelegateICS(ActionBarActivity actionbaractivity)
    {
        super(actionbaractivity);
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        mActivity.superAddContentView(view, layoutparams);
    }

    android.support.v7.internal.view.ActionModeWrapper.CallbackWrapper createActionModeCallbackWrapper(Context context, android.support.v7.view.ActionMode.Callback callback)
    {
        return new android.support.v7.internal.view.ActionModeWrapper.CallbackWrapper(context, callback);
    }

    ActionModeWrapper createActionModeWrapper(Context context, ActionMode actionmode)
    {
        return new ActionModeWrapper(context, actionmode);
    }

    public ActionBar createSupportActionBar()
    {
        return new ActionBarImplICS(mActivity, mActivity);
    }

    android.view.Window.Callback createWindowCallbackWrapper(android.view.Window.Callback callback)
    {
        return new WindowCallbackWrapper(callback);
    }

    int getHomeAsUpIndicatorAttrId()
    {
        return 0x101030b;
    }

    public void onActionModeFinished(ActionMode actionmode)
    {
        mActivity.onSupportActionModeFinished(createActionModeWrapper(getActionBarThemedContext(), actionmode));
    }

    public void onActionModeStarted(ActionMode actionmode)
    {
        mActivity.onSupportActionModeStarted(createActionModeWrapper(getActionBarThemedContext(), actionmode));
    }

    public boolean onBackPressed()
    {
        return false;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    }

    public void onContentChanged()
    {
        mActivity.onSupportContentChanged();
    }

    public void onCreate(Bundle bundle)
    {
        if ("splitActionBarWhenNarrow".equals(getUiOptionsFromMetadata()))
        {
            mActivity.getWindow().setUiOptions(1, 1);
        }
        super.onCreate(bundle);
        if (mHasActionBar)
        {
            mActivity.requestWindowFeature(8);
        }
        if (mOverlayActionBar)
        {
            mActivity.requestWindowFeature(9);
        }
        bundle = mActivity.getWindow();
        bundle.setCallback(createWindowCallbackWrapper(bundle.getCallback()));
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        if (i == 0 || i == 8)
        {
            if (mMenu == null)
            {
                mMenu = MenuWrapperFactory.createMenuWrapper(menu);
            }
            return mActivity.superOnCreatePanelMenu(i, mMenu);
        } else
        {
            return mActivity.superOnCreatePanelMenu(i, menu);
        }
    }

    public View onCreatePanelView(int i)
    {
        return null;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        MenuItem menuitem1 = menuitem;
        if (i == 0)
        {
            menuitem1 = MenuWrapperFactory.createMenuItemWrapper(menuitem);
        }
        return mActivity.superOnMenuItemSelected(i, menuitem1);
    }

    public void onPostResume()
    {
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        if (i == 0 || i == 8)
        {
            return mActivity.superOnPreparePanel(i, view, mMenu);
        } else
        {
            return mActivity.superOnPreparePanel(i, view, menu);
        }
    }

    public void onStop()
    {
    }

    public void onTitleChanged(CharSequence charsequence)
    {
    }

    public void setContentView(int i)
    {
        mActivity.superSetContentView(i);
    }

    public void setContentView(View view)
    {
        mActivity.superSetContentView(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        mActivity.superSetContentView(view, layoutparams);
    }

    void setSupportProgress(int i)
    {
        mActivity.setProgress(i);
    }

    void setSupportProgressBarIndeterminate(boolean flag)
    {
        mActivity.setProgressBarIndeterminate(flag);
    }

    void setSupportProgressBarIndeterminateVisibility(boolean flag)
    {
        mActivity.setProgressBarIndeterminateVisibility(flag);
    }

    void setSupportProgressBarVisibility(boolean flag)
    {
        mActivity.setProgressBarVisibility(flag);
    }

    public android.support.v7.view.ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        if (callback == null)
        {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        Context context = getActionBarThemedContext();
        android.support.v7.internal.view.ActionModeWrapper.CallbackWrapper callbackwrapper = createActionModeCallbackWrapper(context, callback);
        callback = null;
        ActionMode actionmode = mActivity.startActionMode(callbackwrapper);
        if (actionmode != null)
        {
            callback = createActionModeWrapper(context, actionmode);
            callbackwrapper.setLastStartedActionMode(callback);
        }
        return callback;
    }

    public void supportInvalidateOptionsMenu()
    {
        mMenu = null;
    }

    public boolean supportRequestWindowFeature(int i)
    {
        return mActivity.requestWindowFeature(i);
    }
}
