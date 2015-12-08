// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.internal.view.k;
import android.support.v7.internal.view.menu.i;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            q

class r extends k
{

    final q a;

    r(q q1, android.view.Window.Callback callback)
    {
        a = q1;
        super(callback);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return a.a(keyevent) || super.dispatchKeyEvent(keyevent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
    {
        return super.dispatchKeyShortcutEvent(keyevent) || a.a(keyevent.getKeyCode(), keyevent);
    }

    public void onContentChanged()
    {
    }

    public boolean onCreatePanelMenu(int j, Menu menu)
    {
        if (j == 0 && !(menu instanceof i))
        {
            return false;
        } else
        {
            return super.onCreatePanelMenu(j, menu);
        }
    }

    public boolean onMenuOpened(int j, Menu menu)
    {
        return super.onMenuOpened(j, menu) || a.d(j);
    }

    public void onPanelClosed(int j, Menu menu)
    {
        super.onPanelClosed(j, menu);
        a.c(j);
    }

    public boolean onPreparePanel(int j, View view, Menu menu)
    {
        i l;
        boolean flag;
        if (menu instanceof i)
        {
            l = (i)menu;
        } else
        {
            l = null;
        }
        if (j == 0 && l == null)
        {
            flag = false;
        } else
        {
            if (l != null)
            {
                l.k = true;
            }
            boolean flag1 = super.onPreparePanel(j, view, menu);
            flag = flag1;
            if (l != null)
            {
                l.k = false;
                return flag1;
            }
        }
        return flag;
    }
}
