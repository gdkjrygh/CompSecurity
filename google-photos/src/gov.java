// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class gov extends AnimatorListenerAdapter
{

    private goq a;

    gov(goq goq1)
    {
        a = goq1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
label0:
        {
            if (goq.r(a) != null)
            {
                goq.r(a).setVisibility(0);
                goq.a(a, null);
            }
            if (goq.o(a) != null)
            {
                if (!goq.f(a))
                {
                    break label0;
                }
                goq.o(a).l();
                goq.c(a, false);
            }
            return;
        }
        if (goq.g(a))
        {
            goq.o(a).n();
            goq.d(a, false);
            return;
        } else
        {
            goq.o(a).o();
            return;
        }
    }

    public final void onAnimationStart(Animator animator)
    {
        boolean flag2;
label0:
        {
            flag2 = true;
            boolean flag = true;
            if (goq.o(a) != null)
            {
                if (!goq.f(a))
                {
                    break label0;
                }
                animator = goq.o(a);
                if (goq.p(a) != gpb.b)
                {
                    flag = false;
                }
                animator.b(flag);
            }
            return;
        }
        if (goq.g(a))
        {
            animator = goq.o(a);
            boolean flag1;
            if (goq.p(a) == gpb.a)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            animator.c(flag1);
            return;
        } else
        {
            goq.o(a).j();
            return;
        }
    }
}
