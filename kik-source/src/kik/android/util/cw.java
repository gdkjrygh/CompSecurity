// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.animation.Animator;
import android.view.View;

// Referenced classes of package kik.android.util:
//            cv

final class cw
    implements Runnable
{

    final View a;
    final int b;
    final android.animation.ValueAnimator.AnimatorUpdateListener c;
    final android.animation.Animator.AnimatorListener d;
    final long e = 300L;
    final long f = 250L;

    cw(View view, int i, android.animation.ValueAnimator.AnimatorUpdateListener animatorupdatelistener, android.animation.Animator.AnimatorListener animatorlistener)
    {
        a = view;
        b = i;
        c = animatorupdatelistener;
        d = animatorlistener;
        super();
    }

    public final void run()
    {
        cv.a(a, b, c, d, e, f).start();
    }
}
