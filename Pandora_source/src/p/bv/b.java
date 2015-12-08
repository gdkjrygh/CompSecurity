// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bv;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;

public class b
{

    public static Animation a(long l, long l1)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setInterpolator(new DecelerateInterpolator());
        alphaanimation.setDuration(l);
        alphaanimation.setStartOffset(l1);
        return alphaanimation;
    }

    public static Animation a(long l, View view)
    {
        Animation animation = a(l, 0L);
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener(view) {

            final View a;

            public void onAnimationEnd(Animation animation1)
            {
                a.setVisibility(0);
            }

            public void onAnimationRepeat(Animation animation1)
            {
            }

            public void onAnimationStart(Animation animation1)
            {
                a.setVisibility(8);
            }

            
            {
                a = view;
                super();
            }
        });
        return animation;
    }

    public static Animation b(long l, long l1)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
        alphaanimation.setInterpolator(new AccelerateInterpolator());
        alphaanimation.setStartOffset(l1);
        alphaanimation.setDuration(l);
        return alphaanimation;
    }

    public static Animation b(long l, View view)
    {
        Animation animation = b(l, 0L);
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener(view) {

            final View a;

            public void onAnimationEnd(Animation animation1)
            {
                a.setVisibility(8);
            }

            public void onAnimationRepeat(Animation animation1)
            {
            }

            public void onAnimationStart(Animation animation1)
            {
                a.setVisibility(0);
            }

            
            {
                a = view;
                super();
            }
        });
        return animation;
    }
}
