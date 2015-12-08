// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

class sx extends vl
{

    private sv a;

    sx(sv sv1, android.view.Window.Callback callback)
    {
        a = sv1;
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

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        if (i == 0 && !(menu instanceof vu))
        {
            return false;
        } else
        {
            return super.onCreatePanelMenu(i, menu);
        }
    }

    public boolean onMenuOpened(int i, Menu menu)
    {
        return super.onMenuOpened(i, menu) || a.d(i);
    }

    public void onPanelClosed(int i, Menu menu)
    {
        super.onPanelClosed(i, menu);
        a.c(i);
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        vu vu1;
        boolean flag;
        if (menu instanceof vu)
        {
            vu1 = (vu)menu;
        } else
        {
            vu1 = null;
        }
        if (i == 0 && vu1 == null)
        {
            flag = false;
        } else
        {
            if (vu1 != null)
            {
                vu1.j = true;
            }
            boolean flag1 = super.onPreparePanel(i, view, menu);
            flag = flag1;
            if (vu1 != null)
            {
                vu1.j = false;
                return flag1;
            }
        }
        return flag;
    }
}
