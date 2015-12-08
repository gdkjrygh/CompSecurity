// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.fragments:
//            bd

final class a
    implements android.animation.Animator.AnimatorUpdateListener
{

    final ImageView a;
    final bd b;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        if (ad.a)
        {
            a.setImageAlpha(((Integer)valueanimator.getAnimatedValue()).intValue());
            return;
        } else
        {
            a.setAlpha(valueanimator.getAnimatedFraction());
            return;
        }
    }

    mator(bd bd1, ImageView imageview)
    {
        b = bd1;
        a = imageview;
        super();
    }
}
