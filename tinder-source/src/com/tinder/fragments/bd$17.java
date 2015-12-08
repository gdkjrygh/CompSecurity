// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.ValueAnimator;
import com.tinder.cards.CardStackLayout;

// Referenced classes of package com.tinder.fragments:
//            bd

final class a
    implements android.animation.nimator.AnimatorUpdateListener
{

    final bd a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        bd.b(a).a(valueanimator.getAnimatedFraction());
    }

    ator(bd bd1)
    {
        a = bd1;
        super();
    }
}
