// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.animation.ValueAnimator;

// Referenced classes of package com.google.android.play.search:
//            PlaySearchNavigationButton, ArrowOrBurgerDrawable

final class this._cls0
    implements android.animation.istener
{

    final PlaySearchNavigationButton this$0;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        PlaySearchNavigationButton.access$200(PlaySearchNavigationButton.this).setHowArrowIsTheBurger(((Float)valueanimator.getAnimatedValue()).floatValue());
    }

    A()
    {
        this$0 = PlaySearchNavigationButton.this;
        super();
    }
}
