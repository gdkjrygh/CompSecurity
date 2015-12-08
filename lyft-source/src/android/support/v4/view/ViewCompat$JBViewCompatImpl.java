// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            ViewCompatJB

class  extends 
{

    public void a(View view, int j, int l, int i1, int j1)
    {
        ViewCompatJB.a(view, j, l, i1, j1);
    }

    public void a(View view, Runnable runnable)
    {
        ViewCompatJB.a(view, runnable);
    }

    public void a(View view, Runnable runnable, long l)
    {
        ViewCompatJB.a(view, runnable, l);
    }

    public void c(View view, int j)
    {
        int l = j;
        if (j == 4)
        {
            l = 2;
        }
        ViewCompatJB.a(view, l);
    }

    public boolean c(View view)
    {
        return ViewCompatJB.a(view);
    }

    public void d(View view)
    {
        ViewCompatJB.b(view);
    }

    public int e(View view)
    {
        return ViewCompatJB.c(view);
    }

    public ViewParent i(View view)
    {
        return ViewCompatJB.d(view);
    }

    public boolean k(View view)
    {
        return ViewCompatJB.h(view);
    }

    public int o(View view)
    {
        return ViewCompatJB.e(view);
    }

    public int p(View view)
    {
        return ViewCompatJB.f(view);
    }

    public boolean s(View view)
    {
        return ViewCompatJB.g(view);
    }

    ()
    {
    }
}
