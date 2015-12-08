// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            bx, a, dq

class by extends bx
{

    static boolean b = false;

    by()
    {
    }

    public final void a(View view, a a1)
    {
        if (a1 == null)
        {
            a1 = null;
        } else
        {
            a1 = ((a) (a1.a));
        }
        view.setAccessibilityDelegate((android.view.View.AccessibilityDelegate)a1);
    }

    public final boolean a(View view, int i)
    {
        return view.canScrollHorizontally(i);
    }

    public final boolean b(View view, int i)
    {
        return view.canScrollVertically(i);
    }

    public final dq n(View view)
    {
        if (a == null)
        {
            a = new WeakHashMap();
        }
        dq dq2 = (dq)a.get(view);
        dq dq1 = dq2;
        if (dq2 == null)
        {
            dq1 = new dq(view);
            a.put(view, dq1);
        }
        return dq1;
    }

}
