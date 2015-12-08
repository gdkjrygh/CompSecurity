// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;

public final class euc extends AnimatorListenerAdapter
{

    private euc()
    {
    }

    public euc(byte byte0)
    {
        this();
    }

    private static void a(ObjectAnimator objectanimator)
    {
        if (objectanimator.getTarget() == null)
        {
            return;
        } else
        {
            ((View)objectanimator.getTarget()).setTranslationY(0.0F);
            return;
        }
    }

    public final void onAnimationCancel(Animator animator)
    {
        a((ObjectAnimator)animator);
    }

    public final void onAnimationEnd(Animator animator)
    {
        a((ObjectAnimator)animator);
    }
}
