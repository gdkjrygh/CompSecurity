// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            a, u, z, aa, 
//            y, x, w, v

public class t
{
    static class a extends i
    {

        public void a(View view, float f1)
        {
            u.a(view, f1);
        }

        a()
        {
        }
    }

    static class b
        implements j
    {

        WeakHashMap a;

        public int a(View view)
        {
            return 2;
        }

        long a()
        {
            return 10L;
        }

        public void a(View view, float f1)
        {
        }

        public void a(View view, int k, int l, int i1, int j1)
        {
            view.invalidate(k, l, i1, j1);
        }

        public void a(View view, int k, Paint paint)
        {
        }

        public void a(View view, Paint paint)
        {
        }

        public void a(View view, android.support.v4.view.a a1)
        {
        }

        public void a(View view, Runnable runnable)
        {
            view.postDelayed(runnable, a());
        }

        public void a(View view, boolean flag)
        {
        }

        public void a(ViewGroup viewgroup, boolean flag)
        {
        }

        public boolean a(View view, int k)
        {
            return false;
        }

        public void b(View view)
        {
            view.invalidate();
        }

        public void b(View view, float f1)
        {
        }

        public boolean b(View view, int k)
        {
            return false;
        }

        public int c(View view)
        {
            return 0;
        }

        public void c(View view, float f1)
        {
        }

        public void c(View view, int k)
        {
        }

        public int d(View view)
        {
            return 0;
        }

        public int e(View view)
        {
            return 0;
        }

        public ViewParent f(View view)
        {
            return view.getParent();
        }

        public boolean g(View view)
        {
            boolean flag1 = false;
            view = view.getBackground();
            boolean flag = flag1;
            if (view != null)
            {
                flag = flag1;
                if (view.getOpacity() == -1)
                {
                    flag = true;
                }
            }
            return flag;
        }

        public float h(View view)
        {
            return 0.0F;
        }

        public boolean i(View view)
        {
            return false;
        }

        b()
        {
            a = null;
        }
    }

    static class c extends b
    {

        public void a(ViewGroup viewgroup, boolean flag)
        {
            v.a(viewgroup, flag);
        }

        public boolean g(View view)
        {
            return v.a(view);
        }

        c()
        {
        }
    }

    static class d extends c
    {

        public int a(View view)
        {
            return w.a(view);
        }

        d()
        {
        }
    }

    static class e extends d
    {

        long a()
        {
            return x.a();
        }

        public void a(View view, int k, Paint paint)
        {
            x.a(view, k, paint);
        }

        public void a(View view, Paint paint)
        {
            a(view, d(view), paint);
            view.invalidate();
        }

        public void a(View view, boolean flag)
        {
            x.a(view, flag);
        }

        public void b(View view, float f1)
        {
            x.a(view, f1);
        }

        public void c(View view, float f1)
        {
            x.b(view, f1);
        }

        public int d(View view)
        {
            return x.a(view);
        }

        public float h(View view)
        {
            return x.b(view);
        }

        e()
        {
        }
    }

    static class f extends e
    {

        static boolean b = false;

        public void a(View view, android.support.v4.view.a a1)
        {
            if (a1 == null)
            {
                a1 = null;
            } else
            {
                a1 = ((android.support.v4.view.a) (a1.a()));
            }
            y.a(view, a1);
        }

        public boolean a(View view, int k)
        {
            return y.a(view, k);
        }

        public boolean b(View view, int k)
        {
            return y.b(view, k);
        }


        f()
        {
        }
    }

    static class g extends f
    {

        public void a(View view, int k, int l, int i1, int j1)
        {
            z.a(view, k, l, i1, j1);
        }

        public void a(View view, Runnable runnable)
        {
            z.a(view, runnable);
        }

        public void b(View view)
        {
            z.a(view);
        }

        public int c(View view)
        {
            return z.b(view);
        }

        public void c(View view, int k)
        {
            int l = k;
            if (k == 4)
            {
                l = 2;
            }
            z.a(view, l);
        }

        public ViewParent f(View view)
        {
            return z.c(view);
        }

        public boolean i(View view)
        {
            return z.d(view);
        }

        g()
        {
        }
    }

    static class h extends g
    {

        public void a(View view, Paint paint)
        {
            aa.a(view, paint);
        }

        public int e(View view)
        {
            return aa.a(view);
        }

        h()
        {
        }
    }

    static class i extends h
    {

        public void c(View view, int k)
        {
            z.a(view, k);
        }

        i()
        {
        }
    }

    static interface j
    {

        public abstract int a(View view);

        public abstract void a(View view, float f1);

        public abstract void a(View view, int k, int l, int i1, int j1);

        public abstract void a(View view, int k, Paint paint);

        public abstract void a(View view, Paint paint);

        public abstract void a(View view, android.support.v4.view.a a1);

        public abstract void a(View view, Runnable runnable);

        public abstract void a(View view, boolean flag);

        public abstract void a(ViewGroup viewgroup, boolean flag);

        public abstract boolean a(View view, int k);

        public abstract void b(View view);

        public abstract void b(View view, float f1);

        public abstract boolean b(View view, int k);

        public abstract int c(View view);

        public abstract void c(View view, float f1);

        public abstract void c(View view, int k);

        public abstract int d(View view);

        public abstract int e(View view);

        public abstract ViewParent f(View view);

        public abstract boolean g(View view);

        public abstract float h(View view);

        public abstract boolean i(View view);
    }


    static final j a;

    public static int a(View view)
    {
        return a.a(view);
    }

    public static void a(View view, float f1)
    {
        a.b(view, f1);
    }

    public static void a(View view, int k, int l, int i1, int j1)
    {
        a.a(view, k, l, i1, j1);
    }

    public static void a(View view, int k, Paint paint)
    {
        a.a(view, k, paint);
    }

    public static void a(View view, Paint paint)
    {
        a.a(view, paint);
    }

    public static void a(View view, android.support.v4.view.a a1)
    {
        a.a(view, a1);
    }

    public static void a(View view, Runnable runnable)
    {
        a.a(view, runnable);
    }

    public static void a(View view, boolean flag)
    {
        a.a(view, flag);
    }

    public static void a(ViewGroup viewgroup, boolean flag)
    {
        a.a(viewgroup, flag);
    }

    public static boolean a(View view, int k)
    {
        return a.a(view, k);
    }

    public static void b(View view)
    {
        a.b(view);
    }

    public static void b(View view, float f1)
    {
        a.c(view, f1);
    }

    public static boolean b(View view, int k)
    {
        return a.b(view, k);
    }

    public static int c(View view)
    {
        return a.c(view);
    }

    public static void c(View view, float f1)
    {
        a.a(view, f1);
    }

    public static void c(View view, int k)
    {
        a.c(view, k);
    }

    public static int d(View view)
    {
        return a.d(view);
    }

    public static int e(View view)
    {
        return a.e(view);
    }

    public static ViewParent f(View view)
    {
        return a.f(view);
    }

    public static boolean g(View view)
    {
        return a.g(view);
    }

    public static float h(View view)
    {
        return a.h(view);
    }

    public static boolean i(View view)
    {
        return a.i(view);
    }

    static 
    {
        int k = android.os.Build.VERSION.SDK_INT;
        if (k >= 21)
        {
            a = new a();
        } else
        if (k >= 19)
        {
            a = new i();
        } else
        if (k >= 17)
        {
            a = new h();
        } else
        if (k >= 16)
        {
            a = new g();
        } else
        if (k >= 14)
        {
            a = new f();
        } else
        if (k >= 11)
        {
            a = new e();
        } else
        if (k >= 9)
        {
            a = new d();
        } else
        if (k >= 7)
        {
            a = new c();
        } else
        {
            a = new b();
        }
    }
}
