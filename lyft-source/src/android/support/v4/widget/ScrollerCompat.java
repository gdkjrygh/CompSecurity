// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;

public class ScrollerCompat
{

    Object a;
    ScrollerCompatImpl b;

    private ScrollerCompat(int i, Context context, Interpolator interpolator)
    {
        if (i >= 14)
        {
            b = new ScrollerCompatImplIcs();
        } else
        if (i >= 9)
        {
            b = new ScrollerCompatImplGingerbread();
        } else
        {
            b = new ScrollerCompatImplBase();
        }
        a = b.a(context, interpolator);
    }

    ScrollerCompat(Context context, Interpolator interpolator)
    {
        this(android.os.Build.VERSION.SDK_INT, context, interpolator);
    }

    public static ScrollerCompat a(Context context, Interpolator interpolator)
    {
        return new ScrollerCompat(context, interpolator);
    }

    public void a(int i, int j, int k, int l)
    {
        b.a(a, i, j, k, l);
    }

    public void a(int i, int j, int k, int l, int i1)
    {
        b.a(a, i, j, k, l, i1);
    }

    public void a(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        b.a(a, i, j, k, l, i1, j1, k1, l1);
    }

    public void a(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2)
    {
        b.a(a, i, j, k, l, i1, j1, k1, l1, i2, j2);
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
        return b.g(a);
    }

    public int e()
    {
        return b.h(a);
    }

    public float f()
    {
        return b.d(a);
    }

    public boolean g()
    {
        return b.e(a);
    }

    public void h()
    {
        b.f(a);
    }

    private class ScrollerCompatImplIcs extends ScrollerCompatImplGingerbread
    {
        private class ScrollerCompatImplGingerbread
            implements ScrollerCompatImpl
        {

            public Object a(Context context, Interpolator interpolator)
            {
                return ScrollerCompatGingerbread.a(context, interpolator);
            }

            public void a(Object obj, int i, int j, int k, int l)
            {
                ScrollerCompatGingerbread.a(obj, i, j, k, l);
            }

            public void a(Object obj, int i, int j, int k, int l, int i1)
            {
                ScrollerCompatGingerbread.a(obj, i, j, k, l, i1);
            }

            public void a(Object obj, int i, int j, int k, int l, int i1, int j1, 
                    int k1, int l1)
            {
                ScrollerCompatGingerbread.a(obj, i, j, k, l, i1, j1, k1, l1);
            }

            public void a(Object obj, int i, int j, int k, int l, int i1, int j1, 
                    int k1, int l1, int i2, int j2)
            {
                ScrollerCompatGingerbread.a(obj, i, j, k, l, i1, j1, k1, l1, i2, j2);
            }

            public boolean a(Object obj)
            {
                return ScrollerCompatGingerbread.a(obj);
            }

            public int b(Object obj)
            {
                return ScrollerCompatGingerbread.b(obj);
            }

            public int c(Object obj)
            {
                return ScrollerCompatGingerbread.c(obj);
            }

            public float d(Object obj)
            {
                return 0.0F;
            }

            public boolean e(Object obj)
            {
                return ScrollerCompatGingerbread.d(obj);
            }

            public void f(Object obj)
            {
                ScrollerCompatGingerbread.e(obj);
            }

            public int g(Object obj)
            {
                return ScrollerCompatGingerbread.f(obj);
            }

            public int h(Object obj)
            {
                return ScrollerCompatGingerbread.g(obj);
            }

            ScrollerCompatImplGingerbread()
            {
            }
        }


        public float d(Object obj)
        {
            return ScrollerCompatIcs.a(obj);
        }

        ScrollerCompatImplIcs()
        {
        }
    }


    private class ScrollerCompatImpl
    {

        public abstract Object a(Context context, Interpolator interpolator);

        public abstract void a(Object obj, int i, int j, int k, int l);

        public abstract void a(Object obj, int i, int j, int k, int l, int i1);

        public abstract void a(Object obj, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1);

        public abstract void a(Object obj, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1, int i2, int j2);

        public abstract boolean a(Object obj);

        public abstract int b(Object obj);

        public abstract int c(Object obj);

        public abstract float d(Object obj);

        public abstract boolean e(Object obj);

        public abstract void f(Object obj);

        public abstract int g(Object obj);

        public abstract int h(Object obj);
    }


    private class ScrollerCompatImplBase
        implements ScrollerCompatImpl
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

        public void a(Object obj, int i, int j, int k, int l)
        {
            ((Scroller)obj).startScroll(i, j, k, l);
        }

        public void a(Object obj, int i, int j, int k, int l, int i1)
        {
            ((Scroller)obj).startScroll(i, j, k, l, i1);
        }

        public void a(Object obj, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1)
        {
            ((Scroller)obj).fling(i, j, k, l, i1, j1, k1, l1);
        }

        public void a(Object obj, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1, int i2, int j2)
        {
            ((Scroller)obj).fling(i, j, k, l, i1, j1, k1, l1);
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

        public float d(Object obj)
        {
            return 0.0F;
        }

        public boolean e(Object obj)
        {
            return ((Scroller)obj).computeScrollOffset();
        }

        public void f(Object obj)
        {
            ((Scroller)obj).abortAnimation();
        }

        public int g(Object obj)
        {
            return ((Scroller)obj).getFinalX();
        }

        public int h(Object obj)
        {
            return ((Scroller)obj).getFinalY();
        }

        ScrollerCompatImplBase()
        {
        }
    }

}
