// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            by

class bz extends by
{

    bz()
    {
    }

    public final void a(View view, int i, int k, int l, int i1)
    {
        view.postInvalidate(i, k, l, i1);
    }

    public final void a(View view, Runnable runnable)
    {
        view.postOnAnimation(runnable);
    }

    public final void a(View view, Runnable runnable, long l)
    {
        view.postOnAnimationDelayed(runnable, l);
    }

    public final void b(View view)
    {
        view.postInvalidateOnAnimation();
    }

    public final int c(View view)
    {
        return view.getImportantForAccessibility();
    }

    public void c(View view, int i)
    {
        int k = i;
        if (i == 4)
        {
            k = 2;
        }
        view.setImportantForAccessibility(k);
    }

    public final ViewParent f(View view)
    {
        return view.getParentForAccessibility();
    }

    public final boolean j(View view)
    {
        return view.hasOverlappingRendering();
    }

    public final int m(View view)
    {
        return view.getMinimumHeight();
    }

    public void p(View view)
    {
        view.requestFitSystemWindows();
    }

    public final boolean r(View view)
    {
        return view.getFitsSystemWindows();
    }
}
