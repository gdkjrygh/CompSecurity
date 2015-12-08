// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateICS

class mWrapped
    implements android.view.ckWrapper
{

    final android.view.ckWrapper.mWrapped mWrapped;
    final ActionBarActivityDelegateICS this$0;

    public boolean dispatchGenericMotionEvent(MotionEvent motionevent)
    {
        return mWrapped.mWrapped(motionevent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return mWrapped.mWrapped(keyevent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
    {
        return mWrapped.mWrapped(keyevent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        return mWrapped.mWrapped(accessibilityevent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return mWrapped.mWrapped(motionevent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionevent)
    {
        return mWrapped.mWrapped(motionevent);
    }

    public void onActionModeFinished(ActionMode actionmode)
    {
        mWrapped.mWrapped(actionmode);
        ActionBarActivityDelegateICS.this.onActionModeFinished(actionmode);
    }

    public void onActionModeStarted(ActionMode actionmode)
    {
        mWrapped.mWrapped(actionmode);
        ActionBarActivityDelegateICS.this.onActionModeStarted(actionmode);
    }

    public void onAttachedToWindow()
    {
        mWrapped.mWrapped();
    }

    public void onContentChanged()
    {
        mWrapped.mWrapped();
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        return mWrapped.mWrapped(i, menu);
    }

    public View onCreatePanelView(int i)
    {
        return mWrapped.mWrapped(i);
    }

    public void onDetachedFromWindow()
    {
        mWrapped.mWrapped();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        return mWrapped.mWrapped(i, menuitem);
    }

    public boolean onMenuOpened(int i, Menu menu)
    {
        return mWrapped.mWrapped(i, menu);
    }

    public void onPanelClosed(int i, Menu menu)
    {
        mWrapped.mWrapped(i, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        return mWrapped.mWrapped(i, view, menu);
    }

    public boolean onSearchRequested()
    {
        return mWrapped.mWrapped();
    }

    public void onWindowAttributesChanged(android.view.ckWrapper ckwrapper)
    {
        mWrapped.mWrapped(ckwrapper);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        mWrapped.mWrapped(flag);
    }

    public ActionMode onWindowStartingActionMode(android.view.ckWrapper ckwrapper)
    {
        return mWrapped.mWrapped(ckwrapper);
    }

    public (android.view.ckWrapper ckwrapper)
    {
        this$0 = ActionBarActivityDelegateICS.this;
        super();
        mWrapped = ckwrapper;
    }
}
