// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class WindowCallbackWrapper
    implements android.view.Window.Callback
{

    final android.view.Window.Callback mWrapped;

    public WindowCallbackWrapper(android.view.Window.Callback callback)
    {
        if (callback == null)
        {
            throw new IllegalArgumentException("Window callback may not be null");
        } else
        {
            mWrapped = callback;
            return;
        }
    }

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
    }

    public void onActionModeStarted(ActionMode actionmode)
    {
        mWrapped.onActionModeStarted(actionmode);
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
}
