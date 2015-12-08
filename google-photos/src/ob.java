// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.lang.ref.WeakReference;

public final class ob
{

    public static final ok b;
    public WeakReference a;
    private Runnable c;
    private Runnable d;
    private int e;

    ob(View view)
    {
        c = null;
        d = null;
        e = -1;
        a = new WeakReference(view);
    }

    static int a(ob ob1, int i)
    {
        ob1.e = -1;
        return -1;
    }

    static Runnable a(ob ob1)
    {
        return null;
    }

    static Runnable b(ob ob1)
    {
        return null;
    }

    static int c(ob ob1)
    {
        return ob1.e;
    }

    public final ob a(float f)
    {
        View view = (View)a.get();
        if (view != null)
        {
            b.a(this, view, f);
        }
        return this;
    }

    public final ob a(long l)
    {
        View view = (View)a.get();
        if (view != null)
        {
            b.a(view, l);
        }
        return this;
    }

    public final ob a(oo oo)
    {
        View view = (View)a.get();
        if (view != null)
        {
            b.a(this, view, oo);
        }
        return this;
    }

    public final ob a(oq oq)
    {
        View view = (View)a.get();
        if (view != null)
        {
            b.a(view, oq);
        }
        return this;
    }

    public final void a()
    {
        View view = (View)a.get();
        if (view != null)
        {
            b.a(this, view);
        }
    }

    public final ob b(float f)
    {
        View view = (View)a.get();
        if (view != null)
        {
            b.b(this, view, f);
        }
        return this;
    }

    public final void b()
    {
        View view = (View)a.get();
        if (view != null)
        {
            b.b(this, view);
        }
    }

    public final ob c(float f)
    {
        View view = (View)a.get();
        if (view != null)
        {
            b.c(this, view, f);
        }
        return this;
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            b = new oj();
        } else
        if (i >= 19)
        {
            b = new oi();
        } else
        if (i >= 18)
        {
            b = new og();
        } else
        if (i >= 16)
        {
            b = new oh();
        } else
        if (i >= 14)
        {
            b = new oe();
        } else
        {
            b = new oc();
        }
    }
}
