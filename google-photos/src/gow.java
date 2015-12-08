// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.google.android.apps.photos.pager.ClippingImageView;

final class gow
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    private goq a;

    gow(goq goq1)
    {
        a = goq1;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        goq.c(a).a((Rect)valueanimator.getAnimatedValue("clip_rect"));
    }
}
