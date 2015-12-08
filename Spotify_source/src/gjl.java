// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class gjl
    implements android.view.Window.Callback
{

    private android.view.Window.Callback a;

    public gjl(android.view.Window.Callback callback)
    {
        a = callback;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionevent)
    {
        return a.dispatchGenericMotionEvent(motionevent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return a.dispatchKeyEvent(keyevent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
    {
        return a.dispatchKeyShortcutEvent(keyevent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        return a.dispatchPopulateAccessibilityEvent(accessibilityevent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return a.dispatchTouchEvent(motionevent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionevent)
    {
        return a.dispatchTrackballEvent(motionevent);
    }

    public void onActionModeFinished(ActionMode actionmode)
    {
        a.onActionModeFinished(actionmode);
    }

    public void onActionModeStarted(ActionMode actionmode)
    {
        a.onActionModeStarted(actionmode);
    }

    public void onAttachedToWindow()
    {
        a.onAttachedToWindow();
    }

    public void onContentChanged()
    {
        a.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        return a.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i)
    {
        return a.onCreatePanelView(i);
    }

    public void onDetachedFromWindow()
    {
        a.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        return a.onMenuItemSelected(i, menuitem);
    }

    public boolean onMenuOpened(int i, Menu menu)
    {
        return a.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu)
    {
        a.onPanelClosed(i, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        return a.onPreparePanel(i, view, menu);
    }

    public boolean onSearchRequested()
    {
        return a.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchevent)
    {
        return a.onSearchRequested(searchevent);
    }

    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutparams)
    {
        a.onWindowAttributesChanged(layoutparams);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        a.onWindowFocusChanged(flag);
    }

    public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
    {
        return a.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i)
    {
        return a.onWindowStartingActionMode(callback, i);
    }
}
