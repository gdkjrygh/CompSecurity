// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.photos.pager.ClippingImageView;

final class gou
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    private goq a;

    gou(goq goq1)
    {
        a = goq1;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        goq.n(a).setBackgroundColor(((Integer)valueanimator.getAnimatedValue("background")).intValue());
        float f = ((Float)valueanimator.getAnimatedValue("scale")).floatValue();
        goq.c(a).setScaleX(f);
        goq.c(a).setScaleY(f);
        goq.c(a).setTranslationX(((Float)valueanimator.getAnimatedValue("translate_x")).floatValue());
        goq.c(a).setTranslationY(((Float)valueanimator.getAnimatedValue("translate_y")).floatValue());
        goq.c(a).setRotation(((Float)valueanimator.getAnimatedValue("rotate")).floatValue());
        goq.c(a).a((Rect)valueanimator.getAnimatedValue("clip_rect"));
        goq.c(a).setAlpha(((Float)valueanimator.getAnimatedValue("alpha")).floatValue());
        if (goq.o(a) != null)
        {
            gpc gpc1 = goq.o(a);
            float f2 = ((Float)valueanimator.getAnimatedValue("listener_position")).floatValue();
            float f1 = f2;
            if (goq.g(a))
            {
                if (goq.p(a) == gpb.a)
                {
                    f1 = f2 * (1.0F - goq.q(a)) + goq.q(a);
                } else
                {
                    f1 = goq.q(a) - (1.0F - f2) * goq.q(a);
                }
            }
            gpc1.a(f1);
        }
    }
}
