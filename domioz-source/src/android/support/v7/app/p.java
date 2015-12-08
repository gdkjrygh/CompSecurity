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
//            o

class p extends k
{

    final o a;

    p(o o1, android.view.Window.Callback callback)
    {
        a = o1;
        super(callback);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (super.dispatchKeyEvent(keyevent))
        {
            return true;
        } else
        {
            return a.a(keyevent);
        }
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
    {
        o o1 = a;
        keyevent.getKeyCode();
        if (o1.b(keyevent))
        {
            return true;
        } else
        {
            return super.dispatchKeyShortcutEvent(keyevent);
        }
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
        if (a.c(j))
        {
            return true;
        } else
        {
            return super.onMenuOpened(j, menu);
        }
    }

    public void onPanelClosed(int j, Menu menu)
    {
        if (a.b(j))
        {
            return;
        } else
        {
            super.onPanelClosed(j, menu);
            return;
        }
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
                l.c(true);
            }
            boolean flag1 = super.onPreparePanel(j, view, menu);
            flag = flag1;
            if (l != null)
            {
                l.c(false);
                return flag1;
            }
        }
        return flag;
    }
}
