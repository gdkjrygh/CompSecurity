// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorSet;

final class mmg extends mka
{

    private mme a;

    mmg(mme mme1)
    {
        a = mme1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (a(animator))
        {
            mme.b(a, null);
        } else
        {
            mme.a(a, mme.b(a), false);
            mme.c(a).cancel();
            mme.d(a);
            if (mme.e(a) != null)
            {
                mme.e(a).run();
                mme.b(a, null);
                return;
            }
        }
    }
}
