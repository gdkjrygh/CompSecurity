// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            bv, cg

class bw extends bv
{

    bw()
    {
    }

    public void a(View view, Runnable runnable)
    {
        cg.a(view, runnable);
    }

    public void a(View view, Runnable runnable, long l)
    {
        cg.a(view, runnable, l);
    }

    public void b(View view)
    {
        cg.a(view);
    }

    public void b(View view, int i)
    {
        int k = i;
        if (i == 4)
        {
            k = 2;
        }
        cg.a(view, k);
    }

    public int c(View view)
    {
        return cg.b(view);
    }

    public ViewParent f(View view)
    {
        return cg.c(view);
    }

    public boolean h(View view)
    {
        return cg.g(view);
    }

    public int j(View view)
    {
        return cg.d(view);
    }

    public void m(View view)
    {
        cg.e(view);
    }

    public boolean o(View view)
    {
        return cg.f(view);
    }
}
