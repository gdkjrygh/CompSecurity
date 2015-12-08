// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.ValueAnimator;
import com.tinder.utils.ad;
import com.tinder.utils.o;

// Referenced classes of package com.tinder.fragments:
//            bd

final class a
    implements android.animation.nimator.AnimatorUpdateListener
{

    final ValueAnimator a;
    final bd b;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        ad.c(bd.y(b), o.a(valueanimator.getAnimatedFraction(), 0.0F, 1.0F, 1.0F, 0.75F));
        a.start();
    }

    ator(bd bd1, ValueAnimator valueanimator)
    {
        b = bd1;
        a = valueanimator;
        super();
    }
}
