// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

// Referenced classes of package android.support.v4.widget:
//            k

public class j
{
    static interface a
    {

        public abstract int a(Object obj);

        public abstract Object a(Context context, Interpolator interpolator);

        public abstract void a(Object obj, int i, int k, int l, int i1, int j1);

        public abstract int b(Object obj);

        public abstract boolean c(Object obj);

        public abstract void d(Object obj);

        public abstract int e(Object obj);

        public abstract int f(Object obj);
    }

    static class b
        implements a
    {

        public int a(Object obj)
        {
            return ((Scroller)obj).getCurrX();
        }

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

        public void a(Object obj, int i, int k, int l, int i1, int j1)
        {
            ((Scroller)obj).startScroll(i, k, l, i1, j1);
        }

        public int b(Object obj)
        {
            return ((Scroller)obj).getCurrY();
        }

        public boolean c(Object obj)
        {
            return ((Scroller)obj).computeScrollOffset();
        }

        public void d(Object obj)
        {
            ((Scroller)obj).abortAnimation();
        }

        public int e(Object obj)
        {
            return ((Scroller)obj).getFinalX();
        }

        public int f(Object obj)
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

        public int a(Object obj)
        {
            return k.a(obj);
        }

        public Object a(Context context, Interpolator interpolator)
        {
            return k.a(context, interpolator);
        }

        public void a(Object obj, int i, int l, int i1, int j1, int k1)
        {
            k.a(obj, i, l, i1, j1, k1);
        }

        public int b(Object obj)
        {
            return k.b(obj);
        }

        public boolean c(Object obj)
        {
            return k.c(obj);
        }

        public void d(Object obj)
        {
            k.d(obj);
        }

        public int e(Object obj)
        {
            return k.e(obj);
        }

        public int f(Object obj)
        {
            return k.f(obj);
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

    private j(int i, Context context, Interpolator interpolator)
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

    j(Context context, Interpolator interpolator)
    {
        this(android.os.Build.VERSION.SDK_INT, context, interpolator);
    }

    public static j a(Context context, Interpolator interpolator)
    {
        return new j(context, interpolator);
    }

    public int a()
    {
        return b.a(a);
    }

    public void a(int i, int k, int l, int i1, int j1)
    {
        b.a(a, i, k, l, i1, j1);
    }

    public int b()
    {
        return b.b(a);
    }

    public int c()
    {
        return b.e(a);
    }

    public int d()
    {
        return b.f(a);
    }

    public boolean e()
    {
        return b.c(a);
    }

    public void f()
    {
        b.d(a);
    }
}
