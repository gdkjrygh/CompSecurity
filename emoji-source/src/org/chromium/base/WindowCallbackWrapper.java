// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

class WindowCallbackWrapper
    implements android.view.Window.Callback
{

    private final android.view.Window.Callback mCallback;

    public WindowCallbackWrapper(android.view.Window.Callback callback)
    {
        mCallback = callback;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionevent)
    {
        return mCallback.dispatchGenericMotionEvent(motionevent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return mCallback.dispatchKeyEvent(keyevent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
    {
        return mCallback.dispatchKeyShortcutEvent(keyevent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        return mCallback.dispatchPopulateAccessibilityEvent(accessibilityevent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return mCallback.dispatchTouchEvent(motionevent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionevent)
    {
        return mCallback.dispatchTrackballEvent(motionevent);
    }

    public void onActionModeFinished(ActionMode actionmode)
    {
        mCallback.onActionModeFinished(actionmode);
    }

    public void onActionModeStarted(ActionMode actionmode)
    {
        mCallback.onActionModeStarted(actionmode);
    }

    public void onAttachedToWindow()
    {
        mCallback.onAttachedToWindow();
    }

    public void onContentChanged()
    {
        mCallback.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        return mCallback.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i)
    {
        return mCallback.onCreatePanelView(i);
    }

    public void onDetachedFromWindow()
    {
        mCallback.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        return mCallback.onMenuItemSelected(i, menuitem);
    }

    public boolean onMenuOpened(int i, Menu menu)
    {
        return mCallback.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu)
    {
        mCallback.onPanelClosed(i, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        return mCallback.onPreparePanel(i, view, menu);
    }

    public boolean onSearchRequested()
    {
        return mCallback.onSearchRequested();
    }

    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutparams)
    {
        mCallback.onWindowAttributesChanged(layoutparams);
    }

    public void onWindowDismissed()
    {
    }

    public void onWindowFocusChanged(boolean flag)
    {
        mCallback.onWindowFocusChanged(flag);
    }

    public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
    {
        return mCallback.onWindowStartingActionMode(callback);
    }
}
