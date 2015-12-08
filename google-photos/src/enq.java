// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.GradientDrawable;

final class enq extends AnimatorListenerAdapter
{

    private enp a;

    enq(enp enp1)
    {
        a = enp1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.e.setVisible(false, false);
    }
}
