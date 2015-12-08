// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompatJB, ViewPropertyAnimatorListener

final class b extends AnimatorListenerAdapter
{

    final ViewPropertyAnimatorListener a;
    final View b;

    public void onAnimationCancel(Animator animator)
    {
        a.onAnimationCancel(b);
    }

    public void onAnimationEnd(Animator animator)
    {
        a.onAnimationEnd(b);
    }

    public void onAnimationStart(Animator animator)
    {
        a.onAnimationStart(b);
    }

    (ViewPropertyAnimatorListener viewpropertyanimatorlistener, View view)
    {
        a = viewpropertyanimatorlistener;
        b = view;
        super();
    }
}
