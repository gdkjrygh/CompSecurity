// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            dz, ds, eg, dq, 
//            ei

class dr
    implements dz
{

    WeakHashMap a;

    dr()
    {
        a = null;
    }

    private void f(dq dq1, View view)
    {
        Runnable runnable = null;
        if (a != null)
        {
            runnable = (Runnable)a.get(view);
        }
        Object obj = runnable;
        if (runnable == null)
        {
            obj = new ds(this, dq1, view);
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

    public void a(dq dq1, View view)
    {
        f(dq1, view);
    }

    public void a(dq dq1, View view, float f1)
    {
        f(dq1, view);
    }

    public void a(dq dq1, View view, eg eg1)
    {
        view.setTag(0x7e000000, eg1);
    }

    public void a(View view, long l)
    {
    }

    public void a(View view, ei ei)
    {
    }

    public void a(View view, Interpolator interpolator)
    {
    }

    public void b(dq dq1, View view)
    {
        f(dq1, view);
    }

    public void b(dq dq1, View view, float f1)
    {
        f(dq1, view);
    }

    public void b(View view, long l)
    {
    }

    public void c(dq dq1, View view)
    {
        f(dq1, view);
    }

    public void d(dq dq1, View view)
    {
        if (a != null)
        {
            Runnable runnable = (Runnable)a.get(view);
            if (runnable != null)
            {
                view.removeCallbacks(runnable);
            }
        }
        e(dq1, view);
    }

    final void e(dq dq1, View view)
    {
        Object obj = view.getTag(0x7e000000);
        Runnable runnable;
        if (obj instanceof eg)
        {
            obj = (eg)obj;
        } else
        {
            obj = null;
        }
        runnable = dq.a(dq1);
        dq1 = dq.b(dq1);
        if (runnable != null)
        {
            runnable.run();
        }
        if (obj != null)
        {
            ((eg) (obj)).a(view);
            ((eg) (obj)).b(view);
        }
        if (dq1 != null)
        {
            dq1.run();
        }
        if (a != null)
        {
            a.remove(view);
        }
    }
}
