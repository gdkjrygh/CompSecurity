// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.b;

import android.animation.Animator;

// Referenced classes of package com.nineoldandroids.b:
//            d

class b
    implements android.animation.ator.AnimatorListener
{

    final d a;
    private final com.nineoldandroids.a.a b;

    public void onAnimationCancel(Animator animator)
    {
        b.c(null);
    }

    public void onAnimationEnd(Animator animator)
    {
        b.b(null);
    }

    public void onAnimationRepeat(Animator animator)
    {
        b.d(null);
    }

    public void onAnimationStart(Animator animator)
    {
        b.a(null);
    }

    (d d1, com.nineoldandroids.a. )
    {
        a = d1;
        b = ;
        super();
    }
}
