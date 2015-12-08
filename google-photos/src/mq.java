// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;

class mq extends mp
{

    mq()
    {
    }

    public final void a(View view, Runnable runnable)
    {
        view.postOnAnimation(runnable);
    }

    public final void a(View view, Runnable runnable, long l)
    {
        view.postOnAnimationDelayed(runnable, l);
    }

    public final boolean a(View view, int j, Bundle bundle)
    {
        return view.performAccessibilityAction(j, bundle);
    }

    public void c(View view, int j)
    {
        int k = j;
        if (j == 4)
        {
            k = 2;
        }
        view.setImportantForAccessibility(k);
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

    public final ViewParent i(View view)
    {
        return view.getParentForAccessibility();
    }

    public final boolean n(View view)
    {
        return view.hasOverlappingRendering();
    }

    public final int q(View view)
    {
        return view.getMinimumWidth();
    }

    public final int r(View view)
    {
        return view.getMinimumHeight();
    }

    public void u(View view)
    {
        view.requestFitSystemWindows();
    }

    public final boolean w(View view)
    {
        return view.getFitsSystemWindows();
    }
}
