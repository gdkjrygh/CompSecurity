// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            af, aj, al

static class a
    implements a
{
    final class a
        implements Runnable
    {

        WeakReference a;
        af b;
        final af.a c;

        public final void run()
        {
            View view = (View)a.get();
            if (view != null)
            {
                c.c(b, view);
            }
        }

        private a(af af1, View view)
        {
            c = af.a.this;
            super();
            a = new WeakReference(view);
            b = af1;
        }

        a(af af1, View view, byte byte0)
        {
            this(af1, view);
        }
    }


    WeakHashMap a;

    private void d(af af1, View view)
    {
        Runnable runnable = null;
        if (a != null)
        {
            runnable = (Runnable)a.get(view);
        }
        Object obj = runnable;
        if (runnable == null)
        {
            obj = new a(af1, view, (byte)0);
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
        d(af1, view);
    }

    public void a(af af1, View view, float f)
    {
        d(af1, view);
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
        if (a != null)
        {
            Runnable runnable = (Runnable)a.get(view);
            if (runnable != null)
            {
                view.removeCallbacks(runnable);
            }
        }
        c(af1, view);
    }

    public void b(af af1, View view, float f)
    {
        d(af1, view);
    }

    public void b(View view, long l)
    {
    }

    final void c(af af1, View view)
    {
        Object obj = view.getTag(0x7e000000);
        Runnable runnable;
        if (obj instanceof aj)
        {
            obj = (aj)obj;
        } else
        {
            obj = null;
        }
        runnable = af.a(af1);
        af1 = af.b(af1);
        if (runnable != null)
        {
            runnable.run();
        }
        if (obj != null)
        {
            ((aj) (obj)).onAnimationStart(view);
            ((aj) (obj)).onAnimationEnd(view);
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

    public void c(af af1, View view, float f)
    {
        d(af1, view);
    }

    a()
    {
        a = null;
    }
}
