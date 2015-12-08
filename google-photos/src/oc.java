// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

class oc
    implements ok
{

    private WeakHashMap a;

    oc()
    {
        a = null;
    }

    private void d(ob ob1, View view)
    {
        Runnable runnable = null;
        if (a != null)
        {
            runnable = (Runnable)a.get(view);
        }
        Object obj = runnable;
        if (runnable == null)
        {
            obj = new od(this, ob1, view);
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

    public void a(View view, long l)
    {
    }

    public void a(View view, Interpolator interpolator)
    {
    }

    public void a(View view, oq oq)
    {
    }

    public void a(ob ob1, View view)
    {
        d(ob1, view);
    }

    public void a(ob ob1, View view, float f)
    {
        d(ob1, view);
    }

    public void a(ob ob1, View view, oo oo1)
    {
        view.setTag(0x7e000000, oo1);
    }

    public void b(View view, long l)
    {
    }

    public void b(ob ob1, View view)
    {
        if (a != null)
        {
            Runnable runnable = (Runnable)a.get(view);
            if (runnable != null)
            {
                view.removeCallbacks(runnable);
            }
        }
        c(ob1, view);
    }

    public void b(ob ob1, View view, float f)
    {
        d(ob1, view);
    }

    void c(ob ob1, View view)
    {
        Object obj = view.getTag(0x7e000000);
        Runnable runnable;
        if (obj instanceof oo)
        {
            obj = (oo)obj;
        } else
        {
            obj = null;
        }
        runnable = ob.a(ob1);
        ob1 = ob.b(ob1);
        if (runnable != null)
        {
            runnable.run();
        }
        if (obj != null)
        {
            ((oo) (obj)).a(view);
            ((oo) (obj)).b(view);
        }
        if (ob1 != null)
        {
            ob1.run();
        }
        if (a != null)
        {
            a.remove(view);
        }
    }

    public void c(ob ob1, View view, float f)
    {
        d(ob1, view);
    }
}
