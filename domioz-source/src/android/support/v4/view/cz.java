// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            dh, do, cy, da, 
//            dq

class cz
    implements dh
{

    WeakHashMap a;

    cz()
    {
        a = null;
    }

    static void a(cz cz1, cy cy1, View view)
    {
        cz1.d(cy1, view);
    }

    private void d(cy cy1, View view)
    {
        Object obj = view.getTag(0x7e000000);
        Runnable runnable;
        if (obj instanceof do)
        {
            obj = (do)obj;
        } else
        {
            obj = null;
        }
        runnable = cy.a(cy1);
        cy1 = cy.b(cy1);
        if (runnable != null)
        {
            runnable.run();
        }
        if (obj != null)
        {
            ((do) (obj)).a(view);
            ((do) (obj)).b(view);
        }
        if (cy1 != null)
        {
            cy1.run();
        }
        if (a != null)
        {
            a.remove(view);
        }
    }

    private void e(cy cy1, View view)
    {
        Runnable runnable = null;
        if (a != null)
        {
            runnable = (Runnable)a.get(view);
        }
        Object obj = runnable;
        if (runnable == null)
        {
            obj = new da(this, cy1, view, (byte)0);
            if (a == null)
            {
                a = new WeakHashMap();
            }
            a.put(view, obj);
        }
        view.removeCallbacks(((Runnable) (obj)));
        view.post(((Runnable) (obj)));
    }

    public void a(cy cy1, View view)
    {
        e(cy1, view);
    }

    public void a(cy cy1, View view, float f)
    {
        e(cy1, view);
    }

    public void a(cy cy1, View view, do do1)
    {
        view.setTag(0x7e000000, do1);
    }

    public void a(View view, long l)
    {
    }

    public void a(View view, dq dq)
    {
    }

    public void a(View view, Interpolator interpolator)
    {
    }

    public void b(cy cy1, View view)
    {
        e(cy1, view);
    }

    public void b(cy cy1, View view, float f)
    {
        e(cy1, view);
    }

    public void c(cy cy1, View view)
    {
        if (a != null)
        {
            Runnable runnable = (Runnable)a.get(view);
            if (runnable != null)
            {
                view.removeCallbacks(runnable);
            }
        }
        d(cy1, view);
    }

    public void c(cy cy1, View view, float f)
    {
        e(cy1, view);
    }
}
