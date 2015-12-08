// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import java.util.ArrayList;

public final class un extends rv
{

    xp a;
    boolean b;
    public android.view.Window.Callback c;
    vs d;
    private boolean e;
    private boolean f;
    private ArrayList g;
    private final Runnable h = new uo(this);
    private final abk i = new up(this);

    public un(Toolbar toolbar, CharSequence charsequence, android.view.Window.Callback callback)
    {
        g = new ArrayList();
        a = new yk(toolbar, false);
        c = new ut(this, callback);
        a.a(c);
        toolbar.n = i;
        a.a(charsequence);
    }

    private void a(int k, int l)
    {
        int i1 = a.m();
        a.a(i1 & ~l | k & l);
    }

    public final View a()
    {
        return a.p();
    }

    public final void a(float f1)
    {
        mk.d(a.a(), f1);
    }

    public final void a(int k)
    {
        a(LayoutInflater.from(a.b()).inflate(k, a.a(), false));
    }

    public final void a(Configuration configuration)
    {
        super.a(configuration);
    }

    public final void a(Drawable drawable)
    {
        a.a(null);
    }

    public final void a(View view)
    {
        a(view, new rw(-2, -2));
    }

    public final void a(View view, rw rw1)
    {
        if (view != null)
        {
            view.setLayoutParams(rw1);
        }
        a.a(view);
    }

    public final void a(SpinnerAdapter spinneradapter, rx rx)
    {
        a.a(spinneradapter, new um(rx));
    }

    public final void a(CharSequence charsequence)
    {
        a.b(charsequence);
    }

    public final void a(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 2);
    }

    public final boolean a(int k, KeyEvent keyevent)
    {
        Menu menu = j();
        if (menu != null)
        {
            int l;
            boolean flag;
            if (keyevent != null)
            {
                l = keyevent.getDeviceId();
            } else
            {
                l = -1;
            }
            if (KeyCharacterMap.load(l).getKeyboardType() != 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            menu.setQwertyMode(flag);
            menu.performShortcut(k, keyevent, 0);
        }
        return true;
    }

    public final CharSequence b()
    {
        return a.e();
    }

    public final void b(int k)
    {
        switch (a.n())
        {
        default:
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");

        case 1: // '\001'
            a.c(k);
            break;
        }
    }

    public final void b(Drawable drawable)
    {
        a.c(drawable);
    }

    public final void b(CharSequence charsequence)
    {
        a.a(charsequence);
    }

    public final void b(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 4);
    }

    public final int c()
    {
        return a.m();
    }

    public final void c(int k)
    {
        xp xp1 = a;
        CharSequence charsequence;
        if (k != 0)
        {
            charsequence = a.b().getText(k);
        } else
        {
            charsequence = null;
        }
        xp1.b(charsequence);
    }

    public final void c(Drawable drawable)
    {
        a.b(drawable);
    }

    public final void c(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 8);
    }

    public final void d()
    {
        a.f(0);
    }

    public final void d(int k)
    {
        if (k == 2)
        {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        } else
        {
            a.b(k);
            return;
        }
    }

    public final void d(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 16;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 16);
    }

    public final void e()
    {
        a.f(8);
    }

    public final void e(int k)
    {
        a.d(k);
    }

    public final void e(boolean flag)
    {
    }

    public final void f(int k)
    {
        a.e(k);
    }

    public final void f(boolean flag)
    {
    }

    public final boolean f()
    {
        return a.q() == 0;
    }

    public final Context g()
    {
        return a.b();
    }

    public final void g(boolean flag)
    {
        if (flag != f)
        {
            f = flag;
            int l = g.size();
            int k = 0;
            while (k < l) 
            {
                g.get(k);
                k++;
            }
        }
    }

    public final boolean h()
    {
        a.a().removeCallbacks(h);
        mk.a(a.a(), h);
        return true;
    }

    public final boolean i()
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

    Menu j()
    {
        if (!e)
        {
            a.a(new uq(this), new ur(this));
            e = true;
        }
        return a.r();
    }
}
