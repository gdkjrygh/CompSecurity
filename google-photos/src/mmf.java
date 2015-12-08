// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class mmf extends AnimatorListenerAdapter
{

    private mme a;

    mmf(mme mme1)
    {
        a = mme1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (mme.a(a) != null)
        {
            mme.a(a).run();
            mme.a(a, null);
        }
    }
}
