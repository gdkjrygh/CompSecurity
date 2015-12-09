// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            ViewCompat, ViewCompatJB

static class odeProviderCompat extends 
{

    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
    {
        view = ((View) (ViewCompatJB.getAccessibilityNodeProvider(view)));
        if (view != null)
        {
            return new AccessibilityNodeProviderCompat(view);
        } else
        {
            return null;
        }
    }

    public int getImportantForAccessibility(View view)
    {
        return ViewCompatJB.getImportantForAccessibility(view);
    }

    public ViewParent getParentForAccessibility(View view)
    {
        return ViewCompatJB.getParentForAccessibility(view);
    }

    public boolean hasTransientState(View view)
    {
        return ViewCompatJB.hasTransientState(view);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
        return ViewCompatJB.performAccessibilityAction(view, i, bundle);
    }

    public void postInvalidateOnAnimation(View view)
    {
        ViewCompatJB.postInvalidateOnAnimation(view);
    }

    public void postInvalidateOnAnimation(View view, int i, int j, int k, int l)
    {
        ViewCompatJB.postInvalidateOnAnimation(view, i, j, k, l);
    }

    public void postOnAnimation(View view, Runnable runnable)
    {
        ViewCompatJB.postOnAnimation(view, runnable);
    }

    public void postOnAnimationDelayed(View view, Runnable runnable, long l)
    {
        ViewCompatJB.postOnAnimationDelayed(view, runnable, l);
    }

    public void setHasTransientState(View view, boolean flag)
    {
        ViewCompatJB.setHasTransientState(view, flag);
    }

    public void setImportantForAccessibility(View view, int i)
    {
        ViewCompatJB.setImportantForAccessibility(view, i);
    }

    odeProviderCompat()
    {
    }
}
