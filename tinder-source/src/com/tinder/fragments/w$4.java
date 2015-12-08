// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.fragments:
//            w

final class d
    implements android.view.animation.ation.AnimationListener
{

    final ViewGroup a;
    final ViewGroup b;
    final ImageView c;
    final ImageView d;
    final w e;

    public final void onAnimationEnd(Animation animation)
    {
        animation = c.getDrawable();
        android.graphics.drawable.Drawable drawable = d.getDrawable();
        c.setImageDrawable(drawable);
        d.setImageDrawable(animation);
        if (ad.a())
        {
            ad.b(a, 1.0F);
            ad.b(b, 1.0F);
            return;
        }
        animation = ObjectAnimator.ofFloat(a, "alpha", new float[] {
            1.0F
        });
        if (animation == null)
        {
            animation.setDuration(100L);
        }
        ObjectAnimator.ofFloat(a, "alpha", new float[] {
            1.0F
        }).setDuration(100L).start();
        ObjectAnimator.ofFloat(b, "alpha", new float[] {
            1.0F
        }).setDuration(100L).start();
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        if (ad.a())
        {
            ad.b(a, 0.2F);
            ad.b(b, 0.2F);
            return;
        } else
        {
            ObjectAnimator.ofFloat(a, "alpha", new float[] {
                0.2F
            }).setDuration(50L).start();
            ObjectAnimator.ofFloat(b, "alpha", new float[] {
                0.2F
            }).setDuration(50L).start();
            return;
        }
    }

    imation(w w1, ViewGroup viewgroup, ViewGroup viewgroup1, ImageView imageview, ImageView imageview1)
    {
        e = w1;
        a = viewgroup;
        b = viewgroup1;
        c = imageview;
        d = imageview1;
        super();
    }
}
