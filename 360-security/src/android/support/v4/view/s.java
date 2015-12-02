// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            a, t, u, v, 
//            w, x, y

public class s
{
    static class a
        implements i
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

        public void a(View view, int j, int k, int l, int i1)
        {
            view.invalidate(j, k, l, i1);
        }

        public void a(View view, int j, Paint paint)
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

        public boolean a(View view, int j)
        {
            return false;
        }

        public void b(View view)
        {
            view.invalidate();
        }

        public boolean b(View view, int j)
        {
            return false;
        }

        public int c(View view)
        {
            return 0;
        }

        public void c(View view, int j)
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

        a()
        {
            a = null;
        }
    }

    static class b extends a
    {

        public boolean g(View view)
        {
            return t.a(view);
        }

        b()
        {
        }
    }

    static class c extends b
    {

        public int a(View view)
        {
            return u.a(view);
        }

        c()
        {
        }
    }

    static class d extends c
    {

        long a()
        {
            return v.a();
        }

        public void a(View view, int j, Paint paint)
        {
            v.a(view, j, paint);
        }

        public void a(View view, Paint paint)
        {
            a(view, d(view), paint);
            view.invalidate();
        }

        public int d(View view)
        {
            return v.a(view);
        }

        d()
        {
        }
    }

    static class e extends d
    {

        public void a(View view, android.support.v4.view.a a1)
        {
            w.a(view, a1.a());
        }

        public boolean a(View view, int j)
        {
            return w.a(view, j);
        }

        public boolean b(View view, int j)
        {
            return w.b(view, j);
        }

        e()
        {
        }
    }

    static class f extends e
    {

        public void a(View view, int j, int k, int l, int i1)
        {
            x.a(view, j, k, l, i1);
        }

        public void a(View view, Runnable runnable)
        {
            x.a(view, runnable);
        }

        public void b(View view)
        {
            x.a(view);
        }

        public int c(View view)
        {
            return x.b(view);
        }

        public void c(View view, int j)
        {
            int k = j;
            if (j == 4)
            {
                k = 2;
            }
            x.a(view, k);
        }

        public ViewParent f(View view)
        {
            return x.c(view);
        }

        f()
        {
        }
    }

    static class g extends f
    {

        public void a(View view, Paint paint)
        {
            y.a(view, paint);
        }

        public int e(View view)
        {
            return y.a(view);
        }

        g()
        {
        }
    }

    static class h extends g
    {

        public void c(View view, int j)
        {
            x.a(view, j);
        }

        h()
        {
        }
    }

    static interface i
    {

        public abstract int a(View view);

        public abstract void a(View view, int j, int k, int l, int i1);

        public abstract void a(View view, int j, Paint paint);

        public abstract void a(View view, Paint paint);

        public abstract void a(View view, android.support.v4.view.a a1);

        public abstract void a(View view, Runnable runnable);

        public abstract boolean a(View view, int j);

        public abstract void b(View view);

        public abstract boolean b(View view, int j);

        public abstract int c(View view);

        public abstract void c(View view, int j);

        public abstract int d(View view);

        public abstract int e(View view);

        public abstract ViewParent f(View view);

        public abstract boolean g(View view);
    }


    static final i a;

    public static int a(View view)
    {
        return a.a(view);
    }

    public static void a(View view, int j, int k, int l, int i1)
    {
        a.a(view, j, k, l, i1);
    }

    public static void a(View view, int j, Paint paint)
    {
        a.a(view, j, paint);
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

    public static boolean a(View view, int j)
    {
        return a.a(view, j);
    }

    public static void b(View view)
    {
        a.b(view);
    }

    public static boolean b(View view, int j)
    {
        return a.b(view, j);
    }

    public static int c(View view)
    {
        return a.c(view);
    }

    public static void c(View view, int j)
    {
        a.c(view, j);
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

    static 
    {
        int j = android.os.Build.VERSION.SDK_INT;
        if (j >= 19)
        {
            a = new h();
        } else
        if (j >= 17)
        {
            a = new g();
        } else
        if (j >= 16)
        {
            a = new f();
        } else
        if (j >= 14)
        {
            a = new e();
        } else
        if (j >= 11)
        {
            a = new d();
        } else
        if (j >= 9)
        {
            a = new c();
        } else
        {
            a = new a();
        }
    }
}
