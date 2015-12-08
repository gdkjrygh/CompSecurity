// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.mixpanel.android.surveys:
//            CardCarouselLayout

final class a
    implements android.view.animation.Animation.AnimationListener
{

    final View a;
    final CardCarouselLayout b;

    a(CardCarouselLayout cardcarousellayout, View view)
    {
        b = cardcarousellayout;
        a = view;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        a.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
