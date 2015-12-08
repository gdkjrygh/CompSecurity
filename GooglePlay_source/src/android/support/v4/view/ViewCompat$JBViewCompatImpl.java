// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            ViewCompat

static class  extends 
{

    public final boolean getFitsSystemWindows(View view)
    {
        return view.getFitsSystemWindows();
    }

    public final int getImportantForAccessibility(View view)
    {
        return view.getImportantForAccessibility();
    }

    public final int getMinimumHeight(View view)
    {
        return view.getMinimumHeight();
    }

    public final int getMinimumWidth(View view)
    {
        return view.getMinimumWidth();
    }

    public final ViewParent getParentForAccessibility(View view)
    {
        return view.getParentForAccessibility();
    }

    public final boolean hasTransientState(View view)
    {
        return view.hasTransientState();
    }

    public final void postInvalidateOnAnimation(View view)
    {
        view.postInvalidateOnAnimation();
    }

    public final void postInvalidateOnAnimation(View view, int i, int j, int k, int l)
    {
        view.postInvalidate(i, j, k, l);
    }

    public final void postOnAnimation(View view, Runnable runnable)
    {
        view.postOnAnimation(runnable);
    }

    public final void postOnAnimationDelayed(View view, Runnable runnable, long l)
    {
        view.postOnAnimationDelayed(runnable, l);
    }

    public void requestApplyInsets(View view)
    {
        view.requestFitSystemWindows();
    }

    public void setImportantForAccessibility(View view, int i)
    {
        int j = i;
        if (i == 4)
        {
            j = 2;
        }
        view.setImportantForAccessibility(j);
    }

    ()
    {
    }
}
