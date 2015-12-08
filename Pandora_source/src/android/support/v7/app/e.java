// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.internal.view.menu.n;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import p.g.b;

// Referenced classes of package android.support.v7.app:
//            a, j, ActionBarActivity, ActionBar

class e extends android.support.v7.app.a
{
    class a
        implements android.view.Window.Callback
    {

        final android.view.Window.Callback b;
        final e c;

        public boolean dispatchGenericMotionEvent(MotionEvent motionevent)
        {
            return b.dispatchGenericMotionEvent(motionevent);
        }

        public boolean dispatchKeyEvent(KeyEvent keyevent)
        {
            return b.dispatchKeyEvent(keyevent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
        {
            return b.dispatchKeyShortcutEvent(keyevent);
        }

        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
            return b.dispatchPopulateAccessibilityEvent(accessibilityevent);
        }

        public boolean dispatchTouchEvent(MotionEvent motionevent)
        {
            return b.dispatchTouchEvent(motionevent);
        }

        public boolean dispatchTrackballEvent(MotionEvent motionevent)
        {
            return b.dispatchTrackballEvent(motionevent);
        }

        public void onActionModeFinished(ActionMode actionmode)
        {
            b.onActionModeFinished(actionmode);
            c.b(actionmode);
        }

        public void onActionModeStarted(ActionMode actionmode)
        {
            b.onActionModeStarted(actionmode);
            c.a(actionmode);
        }

        public void onAttachedToWindow()
        {
            b.onAttachedToWindow();
        }

        public void onContentChanged()
        {
            b.onContentChanged();
        }

        public boolean onCreatePanelMenu(int i, Menu menu)
        {
            return b.onCreatePanelMenu(i, menu);
        }

        public View onCreatePanelView(int i)
        {
            return b.onCreatePanelView(i);
        }

        public void onDetachedFromWindow()
        {
            b.onDetachedFromWindow();
        }

        public boolean onMenuItemSelected(int i, MenuItem menuitem)
        {
            return b.onMenuItemSelected(i, menuitem);
        }

        public boolean onMenuOpened(int i, Menu menu)
        {
            return b.onMenuOpened(i, menu);
        }

        public void onPanelClosed(int i, Menu menu)
        {
            b.onPanelClosed(i, menu);
        }

        public boolean onPreparePanel(int i, View view, Menu menu)
        {
            return b.onPreparePanel(i, view, menu);
        }

        public boolean onSearchRequested()
        {
            return b.onSearchRequested();
        }

        public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutparams)
        {
            b.onWindowAttributesChanged(layoutparams);
        }

        public void onWindowFocusChanged(boolean flag)
        {
            b.onWindowFocusChanged(flag);
        }

        public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
        {
            return b.onWindowStartingActionMode(callback);
        }

        public a(android.view.Window.Callback callback)
        {
            c = e.this;
            super();
            b = callback;
        }
    }


    Menu d;

    e(ActionBarActivity actionbaractivity)
    {
        super(actionbaractivity);
    }

    public ActionBar a()
    {
        return new j(a, a);
    }

    android.view.Window.Callback a(android.view.Window.Callback callback)
    {
        return new a(callback);
    }

    b a(Context context, ActionMode actionmode)
    {
        return new b(context, actionmode);
    }

    public void a(int i)
    {
        a.a(i);
    }

    public void a(Configuration configuration)
    {
    }

    public void a(Bundle bundle)
    {
        if ("splitActionBarWhenNarrow".equals(i()))
        {
            a.getWindow().setUiOptions(1, 1);
        }
        super.a(bundle);
        if (b)
        {
            a.requestWindowFeature(8);
        }
        if (c)
        {
            a.requestWindowFeature(9);
        }
        bundle = a.getWindow();
        bundle.setCallback(a(bundle.getCallback()));
    }

    public void a(ActionMode actionmode)
    {
        a.a(a(j(), actionmode));
    }

    public void a(View view)
    {
        a.a(view);
    }

    public void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        a.a(view, layoutparams);
    }

    public void a(CharSequence charsequence)
    {
    }

    void a(boolean flag)
    {
        a.setProgressBarIndeterminateVisibility(flag);
    }

    public boolean a(int i, Menu menu)
    {
        if (i == 0 || i == 8)
        {
            if (d == null)
            {
                d = n.a(menu);
            }
            return a.a(i, d);
        } else
        {
            return a.a(i, menu);
        }
    }

    public boolean a(int i, MenuItem menuitem)
    {
        MenuItem menuitem1 = menuitem;
        if (i == 0)
        {
            menuitem1 = n.a(menuitem);
        }
        return a.a(i, menuitem1);
    }

    public boolean a(int i, View view, Menu menu)
    {
        if (i == 0 || i == 8)
        {
            return a.a(i, view, d);
        } else
        {
            return a.a(i, view, menu);
        }
    }

    public View b(int i)
    {
        return null;
    }

    public void b(ActionMode actionmode)
    {
        a.b(a(j(), actionmode));
    }

    public void b(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        a.b(view, layoutparams);
    }

    public void d()
    {
    }

    public void e()
    {
    }

    public void f()
    {
        d = null;
    }

    public boolean g()
    {
        return false;
    }

    public void h()
    {
        a.j();
    }
}
