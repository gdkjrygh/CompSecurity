// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.util.DisplayMetrics;

// Referenced classes of package com.microsoft.advertising.android:
//            af, AdControl, j, d, 
//            aw

final class f
{

    private final AdControl a;
    private final boolean b = false;
    private Context c;
    private DisplayMetrics d;

    public f(AdControl adcontrol)
    {
        c = null;
        d = null;
        boolean flag;
        if (adcontrol != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        af.a(flag, "ad control cannot be null");
        a = adcontrol;
    }

    public final void a(d d1)
    {
        a.w().b(d1);
    }

    public final boolean a()
    {
        return b;
    }

    final boolean a(AdControl.a a1)
    {
        return a.a(a1);
    }

    public final boolean a(boolean flag)
    {
        return a.w().a(flag);
    }

    final AdControl b()
    {
        return a;
    }

    public final Context c()
    {
        if (a != null)
        {
            return a.getContext().getApplicationContext();
        } else
        {
            return c;
        }
    }

    public final aw d()
    {
        return a.p();
    }

    final void e()
    {
        a.setVisibility(0);
    }

    public final int f()
    {
        return a.getWindowVisibility();
    }

    public final boolean g()
    {
        return a.getParent() != null;
    }

    public final boolean h()
    {
        return a.r();
    }

    public final Context i()
    {
        return a.getContext();
    }

    final int j()
    {
        return a.s();
    }

    public final boolean k()
    {
        return a.v();
    }

    public final boolean l()
    {
        return a.n();
    }

    public final j m()
    {
        return a.w();
    }

    public final void n()
    {
        a.f();
    }

    public final String o()
    {
        if (a != null)
        {
            return Integer.toHexString(a.hashCode());
        } else
        {
            return "null";
        }
    }

    public final void p()
    {
        j j1 = a.w();
        if (j1 != null)
        {
            j1.c();
        }
    }

    public final void q()
    {
        j j1 = a.w();
        if (j1 != null)
        {
            j1.d();
        }
    }
}
