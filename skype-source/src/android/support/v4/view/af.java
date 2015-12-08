// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            aj, al, x

public final class af
{
    static class a
        implements g
    {

        WeakHashMap a;

        static void a(a a1, af af1, View view)
        {
            a1.e(af1, view);
        }

        private void e(af af1, View view)
        {
            Object obj = view.getTag(0x7e000000);
            aj aj1 = null;
            if (obj instanceof aj)
            {
                aj1 = (aj)obj;
            }
            obj = af.a(af1);
            af1 = af.b(af1);
            if (obj != null)
            {
                ((Runnable) (obj)).run();
            }
            if (aj1 != null)
            {
                aj1.a(view);
                aj1.b(view);
            }
            if (af1 != null)
            {
                af1.run();
            }
            if (a != null)
            {
                a.remove(view);
            }
        }

        private void f(af af1, View view)
        {
            Runnable runnable = null;
            if (a != null)
            {
                runnable = (Runnable)a.get(view);
            }
            Object obj = runnable;
            if (runnable == null)
            {
                obj = new a(this, af1, view, (byte)0);
                if (a == null)
                {
                    a = new WeakHashMap();
                }
                a.put(view, obj);
            }
            view.removeCallbacks(((Runnable) (obj)));
            view.post(((Runnable) (obj)));
        }

        public long a(View view)
        {
            return 0L;
        }

        public void a(af af1, View view)
        {
            f(af1, view);
        }

        public void a(af af1, View view, float f1)
        {
            f(af1, view);
        }

        public void a(af af1, View view, aj aj1)
        {
            view.setTag(0x7e000000, aj1);
        }

        public void a(View view, long l)
        {
        }

        public void a(View view, al al)
        {
        }

        public void a(View view, Interpolator interpolator)
        {
        }

        public void b(af af1, View view)
        {
            f(af1, view);
        }

        public void b(af af1, View view, float f1)
        {
            f(af1, view);
        }

        public void b(View view, long l)
        {
        }

        public void c(af af1, View view)
        {
            f(af1, view);
        }

        public void c(af af1, View view, float f1)
        {
            f(af1, view);
        }

        public void d(af af1, View view)
        {
            if (a != null)
            {
                Runnable runnable = (Runnable)a.get(view);
                if (runnable != null)
                {
                    view.removeCallbacks(runnable);
                }
            }
            e(af1, view);
        }

        a()
        {
            a = null;
        }
    }

    final class a.a
        implements Runnable
    {

        WeakReference a;
        af b;
        final a c;

        public final void run()
        {
            View view = (View)a.get();
            if (view != null)
            {
                a.a(c, b, view);
            }
        }

        private a.a(a a1, af af1, View view)
        {
            c = a1;
            super();
            a = new WeakReference(view);
            b = af1;
        }

        a.a(a a1, af af1, View view, byte byte0)
        {
            this(a1, af1, view);
        }
    }

    static class b extends a
    {

        WeakHashMap b;

        public final long a(View view)
        {
            return view.animate().getDuration();
        }

        public final void a(af af1, View view)
        {
            view.animate().scaleX(1.0F);
        }

        public final void a(af af1, View view, float f1)
        {
            view.animate().alpha(f1);
        }

        public void a(af af1, View view, aj aj)
        {
            view.setTag(0x7e000000, aj);
            af1 = new a(af1);
            view.animate().setListener(new ag._cls1(af1, view));
        }

        public final void a(View view, long l)
        {
            view.animate().setDuration(l);
        }

        public final void a(View view, Interpolator interpolator)
        {
            view.animate().setInterpolator(interpolator);
        }

        public final void b(af af1, View view)
        {
            view.animate().scaleY(1.0F);
        }

        public final void b(af af1, View view, float f1)
        {
            view.animate().translationX(f1);
        }

        public final void b(View view, long l)
        {
            view.animate().setStartDelay(l);
        }

        public final void c(af af1, View view)
        {
            view.animate().cancel();
        }

        public final void c(af af1, View view, float f1)
        {
            view.animate().translationY(f1);
        }

        public final void d(af af1, View view)
        {
            view.animate().start();
        }

        b()
        {
            b = null;
        }
    }

    static final class b.a
        implements aj
    {

        af a;

        public final void a(View view)
        {
            if (af.d(a) >= 0)
            {
                x.a(view, 2, null);
            }
            if (af.a(a) != null)
            {
                af.a(a).run();
            }
            Object obj = view.getTag(0x7e000000);
            aj aj1 = null;
            if (obj instanceof aj)
            {
                aj1 = (aj)obj;
            }
            if (aj1 != null)
            {
                aj1.a(view);
            }
        }

        public final void b(View view)
        {
            if (af.d(a) >= 0)
            {
                x.a(view, af.d(a), null);
                af.c(a);
            }
            if (af.b(a) != null)
            {
                af.b(a).run();
            }
            Object obj = view.getTag(0x7e000000);
            aj aj1 = null;
            if (obj instanceof aj)
            {
                aj1 = (aj)obj;
            }
            if (aj1 != null)
            {
                aj1.b(view);
            }
        }

        public final void c(View view)
        {
            Object obj = view.getTag(0x7e000000);
            aj aj1 = null;
            if (obj instanceof aj)
            {
                aj1 = (aj)obj;
            }
            if (aj1 != null)
            {
                aj1.c(view);
            }
        }

        b.a(af af1)
        {
            a = af1;
        }
    }

    static class c extends d
    {

        c()
        {
        }
    }

    static class d extends b
    {

        public final void a(af af1, View view, aj aj)
        {
            if (aj != null)
            {
                view.animate().setListener(new ah._cls1(aj, view));
                return;
            } else
            {
                view.animate().setListener(null);
                return;
            }
        }

        d()
        {
        }
    }

    static class e extends c
    {

        public final void a(View view, al al)
        {
            view.animate().setUpdateListener(new ai._cls1(al, view));
        }

        e()
        {
        }
    }

    static final class f extends e
    {

        f()
        {
        }
    }

    static interface g
    {

        public abstract long a(View view);

        public abstract void a(af af1, View view);

        public abstract void a(af af1, View view, float f1);

        public abstract void a(af af1, View view, aj aj);

        public abstract void a(View view, long l);

        public abstract void a(View view, al al);

        public abstract void a(View view, Interpolator interpolator);

        public abstract void b(af af1, View view);

        public abstract void b(af af1, View view, float f1);

        public abstract void b(View view, long l);

        public abstract void c(af af1, View view);

        public abstract void c(af af1, View view, float f1);

        public abstract void d(af af1, View view);
    }


    static final g a;
    private WeakReference b;
    private Runnable c;
    private Runnable d;
    private int e;

    af(View view)
    {
        c = null;
        d = null;
        e = -1;
        b = new WeakReference(view);
    }

    static Runnable a(af af1)
    {
        return af1.c;
    }

    static Runnable b(af af1)
    {
        return af1.d;
    }

    static int c(af af1)
    {
        af1.e = -1;
        return -1;
    }

    static int d(af af1)
    {
        return af1.e;
    }

    public final long a()
    {
        View view = (View)b.get();
        if (view != null)
        {
            return a.a(view);
        } else
        {
            return 0L;
        }
    }

    public final af a(float f1)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, f1);
        }
        return this;
    }

    public final af a(long l)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(view, l);
        }
        return this;
    }

    public final af a(aj aj)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, aj);
        }
        return this;
    }

    public final af a(al al)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(view, al);
        }
        return this;
    }

    public final af a(Interpolator interpolator)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(view, interpolator);
        }
        return this;
    }

    public final af b()
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view);
        }
        return this;
    }

    public final af b(float f1)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.b(this, view, f1);
        }
        return this;
    }

    public final af b(long l)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.b(view, l);
        }
        return this;
    }

    public final af c()
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.b(this, view);
        }
        return this;
    }

    public final af c(float f1)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.c(this, view, f1);
        }
        return this;
    }

    public final void d()
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.c(this, view);
        }
    }

    public final void e()
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.d(this, view);
        }
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new f();
        } else
        if (i >= 19)
        {
            a = new e();
        } else
        if (i >= 18)
        {
            a = new c();
        } else
        if (i >= 16)
        {
            a = new d();
        } else
        if (i >= 14)
        {
            a = new b();
        } else
        {
            a = new a();
        }
    }
}
