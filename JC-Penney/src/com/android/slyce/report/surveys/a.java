// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.surveys;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.android.slyce.report.surveys:
//            CardCarouselLayout

class a
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

    public void onAnimationEnd(Animation animation)
    {
        a.setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
