// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            bu

class bv extends bu
{

    bv()
    {
    }

    public final void a(View view, int i, int j, int k, int l)
    {
        view.postInvalidate(i, j, k, l);
    }

    public final void a(View view, Runnable runnable)
    {
        view.postOnAnimation(runnable);
    }

    public final void a(View view, Runnable runnable, long l)
    {
        view.postOnAnimationDelayed(runnable, l);
    }

    public void c(View view, int i)
    {
        int j = i;
        if (i == 4)
        {
            j = 2;
        }
        view.setImportantForAccessibility(j);
    }

    public final boolean c(View view)
    {
        return view.hasTransientState();
    }

    public final void d(View view)
    {
        view.postInvalidateOnAnimation();
    }

    public final int e(View view)
    {
        return view.getImportantForAccessibility();
    }

    public final int n(View view)
    {
        return view.getMinimumWidth();
    }

    public final int o(View view)
    {
        return view.getMinimumHeight();
    }

    public void r(View view)
    {
        view.requestFitSystemWindows();
    }

    public final boolean s(View view)
    {
        return view.getFitsSystemWindows();
    }
}
