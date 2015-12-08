// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v4.view.bt;
import android.support.v7.app.a;
import android.support.v7.internal.widget.y;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.a:
//            c, d

public final class b extends a
{

    y a;
    android.view.Window.Callback b;
    private boolean c;
    private boolean d;
    private ArrayList e;
    private final Runnable f;

    public final int a()
    {
        return a.m();
    }

    public final void a(Configuration configuration)
    {
        super.a(configuration);
    }

    public final void a(CharSequence charsequence)
    {
        a.a(charsequence);
    }

    public final void a(boolean flag)
    {
    }

    public final boolean a(int i, KeyEvent keyevent)
    {
        if (!c)
        {
            a.a(new c(this), new d(this));
            c = true;
        }
        Menu menu = a.o();
        if (menu != null)
        {
            int j;
            boolean flag;
            if (keyevent != null)
            {
                j = keyevent.getDeviceId();
            } else
            {
                j = -1;
            }
            if (KeyCharacterMap.load(j).getKeyboardType() != 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            menu.setQwertyMode(flag);
            menu.performShortcut(i, keyevent, 0);
        }
        return true;
    }

    public final Context b()
    {
        return a.b();
    }

    public final void b(boolean flag)
    {
    }

    public final void c(boolean flag)
    {
        if (flag != d)
        {
            d = flag;
            int j = e.size();
            int i = 0;
            while (i < j) 
            {
                e.get(i);
                i++;
            }
        }
    }

    public final boolean c()
    {
        a.a().removeCallbacks(f);
        bt.a(a.a(), f);
        return true;
    }

    public final boolean d()
    {
        if (a.c())
        {
            a.d();
            return true;
        } else
        {
            return false;
        }
    }
}
