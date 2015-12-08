// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui.animation;

import Gg;
import Jo;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

public class DismissAnimationView extends FrameLayout
{

    public final AnimatorSet a;

    public DismissAnimationView(Context context)
    {
        super(context);
        a = new AnimatorSet();
        a(context);
    }

    public DismissAnimationView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new AnimatorSet();
        a(context);
    }

    public DismissAnimationView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new AnimatorSet();
        a(context);
    }

    private void a(Context context)
    {
        Gg gg = new Gg(getResources().getColor(0x7f0c006a));
        ImageView imageview = new ImageView(context);
        Jo.a(imageview, gg);
        int i = Jo.a(context);
        int j = Jo.b(context);
        float f = (float)Math.sqrt(i * i + j * j) * 0.5F;
        float f1 = i;
        float f2 = j;
        addView(imageview, (int)f * 2, (int)f * 2);
        imageview.setX(f1 * 0.5F - f);
        imageview.setY(f2 * 0.5F - f);
        a.setDuration(300L);
        a.setInterpolator(new AccelerateDecelerateInterpolator());
        context = new ArrayList(3);
        context.add(ObjectAnimator.ofFloat(imageview, View.SCALE_X, new float[] {
            1.0F, 0.0F
        }));
        context.add(ObjectAnimator.ofFloat(imageview, View.SCALE_Y, new float[] {
            1.0F, 0.0F
        }));
        context.add(ObjectAnimator.ofFloat(imageview, View.ALPHA, new float[] {
            1.0F, 0.0F
        }));
        a.playTogether(context);
        a.addListener(new android.animation.Animator.AnimatorListener() {

            private DismissAnimationView a;

            public final void onAnimationCancel(Animator animator)
            {
                a.setVisibility(8);
            }

            public final void onAnimationEnd(Animator animator)
            {
                a.setVisibility(8);
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
                a.setVisibility(0);
            }

            
            {
                a = DismissAnimationView.this;
                super();
            }
        });
    }
}
