// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//            dy, dx, dv, dw, 
//            dt, dr, dz, eg, 
//            ei

public final class dq
{

    public static final dz b;
    public WeakReference a;
    private Runnable c;
    private Runnable d;
    private int e;

    dq(View view)
    {
        c = null;
        d = null;
        e = -1;
        a = new WeakReference(view);
    }

    static Runnable a(dq dq1)
    {
        return dq1.c;
    }

    static Runnable b(dq dq1)
    {
        return dq1.d;
    }

    static int c(dq dq1)
    {
        dq1.e = -1;
        return -1;
    }

    static int d(dq dq1)
    {
        return dq1.e;
    }

    public final dq a(float f)
    {
        View view = (View)a.get();
        if (view != null)
        {
            b.a(this, view, f);
        }
        return this;
    }

    public final dq a(long l)
    {
        View view = (View)a.get();
        if (view != null)
        {
            b.a(view, l);
        }
        return this;
    }

    public final dq a(eg eg)
    {
        View view = (View)a.get();
        if (view != null)
        {
            b.a(this, view, eg);
        }
        return this;
    }

    public final dq a(ei ei)
    {
        View view = (View)a.get();
        if (view != null)
        {
            b.a(view, ei);
        }
        return this;
    }

    public final dq a(Interpolator interpolator)
    {
        View view = (View)a.get();
        if (view != null)
        {
            b.a(view, interpolator);
        }
        return this;
    }

    public final void a()
    {
        View view = (View)a.get();
        if (view != null)
        {
            b.c(this, view);
        }
    }

    public final dq b(float f)
    {
        View view = (View)a.get();
        if (view != null)
        {
            b.b(this, view, f);
        }
        return this;
    }

    public final dq b(long l)
    {
        View view = (View)a.get();
        if (view != null)
        {
            b.b(view, l);
        }
        return this;
    }

    public final void b()
    {
        View view = (View)a.get();
        if (view != null)
        {
            b.d(this, view);
        }
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            b = new dy();
        } else
        if (i >= 19)
        {
            b = new dx();
        } else
        if (i >= 18)
        {
            b = new dv();
        } else
        if (i >= 16)
        {
            b = new dw();
        } else
        if (i >= 14)
        {
            b = new dt();
        } else
        {
            b = new dr();
        }
    }
}
