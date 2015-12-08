// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

class ViewPropertyAnimatorCompatJB
{

    ViewPropertyAnimatorCompatJB()
    {
    }

    public static void withEndAction(View view, Runnable runnable)
    {
        view.animate().withEndAction(runnable);
    }

    public static void withLayer(View view)
    {
        view.animate().withLayer();
    }

    public static void withStartAction(View view, Runnable runnable)
    {
        view.animate().withStartAction(runnable);
    }
}
