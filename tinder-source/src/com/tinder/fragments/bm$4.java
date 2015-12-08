// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tinder.model.User;
import com.tinder.utils.aa;
import com.tinder.utils.ad;
import com.tinder.utils.o;
import com.viewpagerindicator.CirclePageIndicator;

// Referenced classes of package com.tinder.fragments:
//            bm

final class a
    implements android.animation.Animator.AnimatorUpdateListener
{

    final boolean a;
    final bm b;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f;
        f = valueanimator.getAnimatedFraction();
        if (bm.g() != null)
        {
            bm.q(b).setTranslationY((float)bm.g().d * f);
            ad.c(bm.q(b), o.a(f, 0.0F, 1.0F, 1.0F, bm.g().h));
            bm.n(b).setTranslationY(bm.g().i * f);
            if (com.tinder.fragments.bm.o(b))
            {
                bm.p(b).setTranslationY(bm.g().g * f);
            }
        }
        bm.s(b).setAlpha(1.0F - f);
        if (bm.b(b) != null)
        {
            bm.b(b).setTranslationX((float)(-b.c) * f);
            bm.b(b).setRotation(-180F * f);
        }
        if (!a) goto _L2; else goto _L1
_L1:
        bm.d(b).setTranslationY(100F * f);
_L4:
        if (bm.c(b) != null)
        {
            bm.c(b).setTranslationX((float)b.c * f);
            bm.c(b).setRotation(f * 180F);
        }
        return;
_L2:
        if (bm.m(b) != null && bm.m(b).isSuperLike())
        {
            bm.r(b).setAlpha(f);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    mator(bm bm1, boolean flag)
    {
        b = bm1;
        a = flag;
        super();
    }
}
