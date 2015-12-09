// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ec

final class eb extends AnimatorListenerAdapter
{

    final ec a;
    final View b;

    eb(ec ec1, View view)
    {
        a = ec1;
        b = view;
        super();
    }

    public void onAnimationCancel(Animator animator)
    {
        a.c(b);
    }

    public void onAnimationEnd(Animator animator)
    {
        a.b(b);
    }

    public void onAnimationStart(Animator animator)
    {
        a.a(b);
    }
}
