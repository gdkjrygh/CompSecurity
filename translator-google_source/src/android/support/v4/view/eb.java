// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            eg

final class eb extends AnimatorListenerAdapter
{

    final eg a;
    final View b;

    eb(eg eg1, View view)
    {
        a = eg1;
        b = view;
        super();
    }

    public final void onAnimationCancel(Animator animator)
    {
        a.c(b);
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.b(b);
    }

    public final void onAnimationStart(Animator animator)
    {
        a.a(b);
    }
}
