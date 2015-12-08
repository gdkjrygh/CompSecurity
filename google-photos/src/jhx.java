// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;

final class jhx
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    private jhw a;

    jhx(jhw jhw1)
    {
        a = jhw1;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        a.c = ((Float)valueanimator.getAnimatedValue()).floatValue();
        a.a.a(a.c);
        a.b.a(a.c);
    }
}
