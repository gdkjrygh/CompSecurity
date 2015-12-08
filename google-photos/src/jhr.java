// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class jhr extends AnimatorListenerAdapter
{

    private jhp a;

    jhr(jhp jhp1)
    {
        a = jhp1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.d = true;
        jhm.c(a.e).a = false;
        if (a.c)
        {
            jhm.h(a.e);
        }
    }
}
