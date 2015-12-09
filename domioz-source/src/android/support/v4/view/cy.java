// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//            dg, df, dd, de, 
//            db, cz, dh, do, 
//            dq

public final class cy
{

    static final dh a;
    private WeakReference b;
    private Runnable c;
    private Runnable d;
    private int e;

    cy(View view)
    {
        c = null;
        d = null;
        e = -1;
        b = new WeakReference(view);
    }

    static Runnable a(cy cy1)
    {
        return cy1.c;
    }

    static Runnable b(cy cy1)
    {
        return cy1.d;
    }

    static int c(cy cy1)
    {
        cy1.e = -1;
        return -1;
    }

    static int d(cy cy1)
    {
        return cy1.e;
    }

    public final cy a()
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view);
        }
        return this;
    }

    public final cy a(float f)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, f);
        }
        return this;
    }

    public final cy a(long l)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(view, l);
        }
        return this;
    }

    public final cy a(do do1)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, do1);
        }
        return this;
    }

    public final cy a(dq dq)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(view, dq);
        }
        return this;
    }

    public final cy a(Interpolator interpolator)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(view, interpolator);
        }
        return this;
    }

    public final cy b(float f)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.b(this, view, f);
        }
        return this;
    }

    public final void b()
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.b(this, view);
        }
    }

    public final cy c(float f)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.c(this, view, f);
        }
        return this;
    }

    public final void c()
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.c(this, view);
        }
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new dg();
        } else
        if (i >= 19)
        {
            a = new df();
        } else
        if (i >= 18)
        {
            a = new dd();
        } else
        if (i >= 16)
        {
            a = new de();
        } else
        if (i >= 14)
        {
            a = new db();
        } else
        {
            a = new cz();
        }
    }
}
