// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.translate.e:
//            p, u, t

final class r extends AnimatorListenerAdapter
{

    final int a;
    final p b;

    r(p p1, int i)
    {
        b = p1;
        a = i;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        p.a(b);
        if (p.b(b) == 0)
        {
            Collections.sort(p.c(b));
            animator = new int[p.c(b).size()];
            for (int i = p.c(b).size() - 1; i >= 0; i--)
            {
                animator[i] = ((u)p.c(b).get(i)).a;
            }

            p.d(b).a(animator);
            u u1;
            android.view.ViewGroup.LayoutParams layoutparams;
            for (animator = p.c(b).iterator(); animator.hasNext(); u1.b.setLayoutParams(layoutparams))
            {
                u1 = (u)animator.next();
                u1.b.setAlpha(1.0F);
                u1.b.setTranslationX(0.0F);
                layoutparams = u1.b.getLayoutParams();
                layoutparams.height = a;
            }

            p.c(b).clear();
        }
    }
}
