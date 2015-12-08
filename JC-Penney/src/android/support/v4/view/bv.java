// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            bu, cf, a, dn

class bv extends bu
{

    static boolean b = false;

    bv()
    {
    }

    public void a(View view, a a1)
    {
        if (a1 == null)
        {
            a1 = null;
        } else
        {
            a1 = ((a) (a1.a()));
        }
        cf.a(view, a1);
    }

    public boolean a(View view, int i)
    {
        return cf.a(view, i);
    }

    public dn k(View view)
    {
        if (a == null)
        {
            a = new WeakHashMap();
        }
        dn dn2 = (dn)a.get(view);
        dn dn1 = dn2;
        if (dn2 == null)
        {
            dn1 = new dn(view);
            a.put(view, dn1);
        }
        return dn1;
    }

}
