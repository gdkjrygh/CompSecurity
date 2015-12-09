// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            dx, ec, dn, dq

class dp
    implements dx
{

    WeakHashMap a;

    dp()
    {
        a = null;
    }

    static void a(dp dp1, dn dn1, View view)
    {
        dp1.b(dn1, view);
    }

    private void b(dn dn1, View view)
    {
        Object obj = view.getTag(0x7e000000);
        Runnable runnable;
        if (obj instanceof ec)
        {
            obj = (ec)obj;
        } else
        {
            obj = null;
        }
        runnable = dn.a(dn1);
        dn1 = dn.b(dn1);
        if (runnable != null)
        {
            runnable.run();
        }
        if (obj != null)
        {
            ((ec) (obj)).a(view);
            ((ec) (obj)).b(view);
        }
        if (dn1 != null)
        {
            dn1.run();
        }
        if (a != null)
        {
            a.remove(view);
        }
    }

    private void c(dn dn1, View view)
    {
        Runnable runnable;
        Object obj;
        if (a != null)
        {
            runnable = (Runnable)a.get(view);
        } else
        {
            runnable = null;
        }
        obj = runnable;
        if (runnable == null)
        {
            obj = new dq(this, dn1, view, null);
            if (a == null)
            {
                a = new WeakHashMap();
            }
            a.put(view, obj);
        }
        view.removeCallbacks(((Runnable) (obj)));
        view.post(((Runnable) (obj)));
    }

    public void a(dn dn1, View view)
    {
        c(dn1, view);
    }

    public void a(dn dn1, View view, float f)
    {
        c(dn1, view);
    }

    public void a(dn dn1, View view, ec ec1)
    {
        view.setTag(0x7e000000, ec1);
    }
}
