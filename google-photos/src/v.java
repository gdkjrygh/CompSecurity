// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;

final class v
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    private o a;
    private u b;

    v(u u, o o1)
    {
        b = u;
        a = o1;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        a.a(b);
    }
}
