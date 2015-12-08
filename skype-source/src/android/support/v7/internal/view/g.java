// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class g
    implements android.view.Window.Callback
{

    final android.view.Window.Callback d;

    public g(android.view.Window.Callback callback)
    {
        if (callback == null)
        {
            throw new IllegalArgumentException("Window callback may not be null");
        } else
        {
            d = callback;
            return;
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionevent)
    {
        return d.dispatchGenericMotionEvent(motionevent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return d.dispatchKeyEvent(keyevent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
    {
        return d.dispatchKeyShortcutEvent(keyevent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        return d.dispatchPopulateAccessibilityEvent(accessibilityevent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return d.dispatchTouchEvent(motionevent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionevent)
    {
        return d.dispatchTrackballEvent(motionevent);
    }

    public void onActionModeFinished(ActionMode actionmode)
    {
        d.onActionModeFinished(actionmode);
    }

    public void onActionModeStarted(ActionMode actionmode)
    {
        d.onActionModeStarted(actionmode);
    }

    public void onAttachedToWindow()
    {
        d.onAttachedToWindow();
    }

    public void onContentChanged()
    {
        d.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        return d.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i)
    {
        return d.onCreatePanelView(i);
    }

    public void onDetachedFromWindow()
    {
        d.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        return d.onMenuItemSelected(i, menuitem);
    }

    public boolean onMenuOpened(int i, Menu menu)
    {
        return d.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu)
    {
        d.onPanelClosed(i, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        return d.onPreparePanel(i, view, menu);
    }

    public boolean onSearchRequested()
    {
        return d.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchevent)
    {
        return d.onSearchRequested(searchevent);
    }

    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutparams)
    {
        d.onWindowAttributesChanged(layoutparams);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        d.onWindowFocusChanged(flag);
    }

    public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
    {
        return d.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i)
    {
        return d.onWindowStartingActionMode(callback, i);
    }
}
