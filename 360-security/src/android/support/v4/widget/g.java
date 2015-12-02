// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

// Referenced classes of package android.support.v4.widget:
//            h

public class g
{
    static interface a
    {

        public abstract Object a(Context context, Interpolator interpolator);

        public abstract void a(Object obj, int i, int j, int k, int l, int i1);

        public abstract boolean a(Object obj);

        public abstract int b(Object obj);

        public abstract int c(Object obj);

        public abstract boolean d(Object obj);

        public abstract void e(Object obj);

        public abstract int f(Object obj);

        public abstract int g(Object obj);
    }

    static class b
        implements a
    {

        public Object a(Context context, Interpolator interpolator)
        {
            if (interpolator != null)
            {
                return new Scroller(context, interpolator);
            } else
            {
                return new Scroller(context);
            }
        }

        public void a(Object obj, int i, int j, int k, int l, int i1)
        {
            ((Scroller)obj).startScroll(i, j, k, l, i1);
        }

        public boolean a(Object obj)
        {
            return ((Scroller)obj).isFinished();
        }

        public int b(Object obj)
        {
            return ((Scroller)obj).getCurrX();
        }

        public int c(Object obj)
        {
            return ((Scroller)obj).getCurrY();
        }

        public boolean d(Object obj)
        {
            return ((Scroller)obj).computeScrollOffset();
        }

        public void e(Object obj)
        {
            ((Scroller)obj).abortAnimation();
        }

        public int f(Object obj)
        {
            return ((Scroller)obj).getFinalX();
        }

        public int g(Object obj)
        {
            return ((Scroller)obj).getFinalY();
        }

        b()
        {
        }
    }

    static class c
        implements a
    {

        public Object a(Context context, Interpolator interpolator)
        {
            return h.a(context, interpolator);
        }

        public void a(Object obj, int i, int j, int k, int l, int i1)
        {
            h.a(obj, i, j, k, l, i1);
        }

        public boolean a(Object obj)
        {
            return h.a(obj);
        }

        public int b(Object obj)
        {
            return h.b(obj);
        }

        public int c(Object obj)
        {
            return h.c(obj);
        }

        public boolean d(Object obj)
        {
            return h.d(obj);
        }

        public void e(Object obj)
        {
            h.e(obj);
        }

        public int f(Object obj)
        {
            return h.f(obj);
        }

        public int g(Object obj)
        {
            return h.g(obj);
        }

        c()
        {
        }
    }

    static class d extends c
    {

        d()
        {
        }
    }


    Object a;
    a b;

    private g(int i, Context context, Interpolator interpolator)
    {
        if (i >= 14)
        {
            b = new d();
        } else
        if (i >= 9)
        {
            b = new c();
        } else
        {
            b = new b();
        }
        a = b.a(context, interpolator);
    }

    g(Context context, Interpolator interpolator)
    {
        this(android.os.Build.VERSION.SDK_INT, context, interpolator);
    }

    public static g a(Context context, Interpolator interpolator)
    {
        return new g(context, interpolator);
    }

    public void a(int i, int j, int k, int l, int i1)
    {
        b.a(a, i, j, k, l, i1);
    }

    public boolean a()
    {
        return b.a(a);
    }

    public int b()
    {
        return b.b(a);
    }

    public int c()
    {
        return b.c(a);
    }

    public int d()
    {
        return b.f(a);
    }

    public int e()
    {
        return b.g(a);
    }

    public boolean f()
    {
        return b.d(a);
    }

    public void g()
    {
        b.e(a);
    }
}
