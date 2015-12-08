// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.view.View;

final class ism
    implements android.animation.Animator.AnimatorListener
{

    private boolean a;
    private View b;

    ism(isk isk, boolean flag, View view)
    {
        a = flag;
        b = view;
        super();
    }

    public final void onAnimationCancel(Animator animator)
    {
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (a)
        {
            b.setVisibility(8);
        }
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
        if (!a)
        {
            b.setVisibility(0);
        }
    }
}
