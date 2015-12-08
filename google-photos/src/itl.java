// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class itl extends AnimatorListenerAdapter
{

    private itf a;

    itl(itf itf1)
    {
        a = itf1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        itf.a(a, iua.c);
    }

    public final void onAnimationStart(Animator animator)
    {
        itf.a(a, iua.g);
    }
}
