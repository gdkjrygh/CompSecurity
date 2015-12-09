// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//            dw, dv, dt, du, 
//            dr, dp, dx, ec

public class dn
{

    static final dx a;
    private WeakReference b;
    private Runnable c;
    private Runnable d;
    private int e;

    dn(View view)
    {
        c = null;
        d = null;
        e = -1;
        b = new WeakReference(view);
    }

    static int a(dn dn1, int i)
    {
        dn1.e = i;
        return i;
    }

    static Runnable a(dn dn1)
    {
        return dn1.c;
    }

    static Runnable b(dn dn1)
    {
        return dn1.d;
    }

    static int c(dn dn1)
    {
        return dn1.e;
    }

    public dn a(float f)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, f);
        }
        return this;
    }

    public dn a(ec ec)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, ec);
        }
        return this;
    }

    public void a()
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view);
        }
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new dw();
        } else
        if (i >= 19)
        {
            a = new dv();
        } else
        if (i >= 18)
        {
            a = new dt();
        } else
        if (i >= 16)
        {
            a = new du();
        } else
        if (i >= 14)
        {
            a = new dr();
        } else
        {
            a = new dp();
        }
    }
}
