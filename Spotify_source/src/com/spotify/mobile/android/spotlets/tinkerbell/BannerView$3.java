// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.tinkerbell;

import android.animation.ValueAnimator;

// Referenced classes of package com.spotify.mobile.android.spotlets.tinkerbell:
//            BannerView

final class a
    implements android.animation..AnimatorUpdateListener
{

    private BannerView a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        BannerView.a(a, ((Float)valueanimator.getAnimatedValue()).floatValue());
        a.requestLayout();
    }

    A(BannerView bannerview)
    {
        a = bannerview;
        super();
    }
}
