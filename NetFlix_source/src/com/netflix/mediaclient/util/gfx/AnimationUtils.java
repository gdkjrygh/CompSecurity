// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util.gfx;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.GridLayoutAnimationController;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;

public class AnimationUtils
{
    public static class HideViewOnAnimationEnd
        implements android.view.animation.Animation.AnimationListener
    {

        private final View view;

        public void onAnimationEnd(Animation animation)
        {
            view.setVisibility(8);
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        public HideViewOnAnimationEnd(View view1)
        {
            view = view1;
        }
    }

    public static class HideViewOnAnimatorEnd
        implements android.animation.Animator.AnimatorListener
    {

        private final View view;

        public void onAnimationCancel(Animator animator)
        {
        }

        public void onAnimationEnd(Animator animator)
        {
            view.setVisibility(8);
        }

        public void onAnimationRepeat(Animator animator)
        {
        }

        public void onAnimationStart(Animator animator)
        {
        }

        public HideViewOnAnimatorEnd(View view1)
        {
            view = view1;
        }
    }

    private static class ShowViewOnAnimationStart
        implements android.view.animation.Animation.AnimationListener
    {

        private final View view;

        public void onAnimationEnd(Animation animation)
        {
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
            view.setVisibility(0);
        }

        public ShowViewOnAnimationStart(View view1)
        {
            view = view1;
        }
    }


    public static final int ANIM_DURATION_MS = 125;
    private static final float LAYOUT_ANIMATION_DELAY_FRACTION = 0.25F;
    public static final float NO_ALPHA = 1F;
    public static final float ON_CLICK_ALPHA_VALUE = 0.65F;

    public AnimationUtils()
    {
    }

    private static void animateView(View view, int i, int j, android.view.animation.Animation.AnimationListener animationlistener)
    {
        Animation animation = android.view.animation.AnimationUtils.loadAnimation(view.getContext(), i);
        animation.setAnimationListener(animationlistener);
        animation.setDuration(j);
        view.startAnimation(animation);
    }

    public static LayoutAnimationController createGridLayoutAnimator(Context context)
    {
        context = new GridLayoutAnimationController(android.view.animation.AnimationUtils.loadAnimation(context, 0x10a0000));
        context.setColumnDelay(0.25F);
        context.setRowDelay(0.25F);
        context.setDirection(0);
        return context;
    }

    public static void hideView(View view, boolean flag)
    {
        if (view == null)
        {
            return;
        }
        view.clearAnimation();
        if (flag)
        {
            animateView(view, 0x10a0001, 62, new HideViewOnAnimationEnd(view));
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    public static void setImageBitmapWithPropertyFade(ImageView imageview, Bitmap bitmap)
    {
        imageview.clearAnimation();
        imageview.setAlpha(0.0F);
        imageview.setImageBitmap(bitmap);
        imageview.animate().alpha(1.0F).setDuration(125L).start();
    }

    public static void setImageBitmapWithTransitionFade(ImageView imageview, Bitmap bitmap)
    {
        imageview.clearAnimation();
        bitmap = new BitmapDrawable(imageview.getResources(), bitmap);
        Drawable drawable = imageview.getDrawable();
        if (drawable == null)
        {
            imageview.setImageDrawable(bitmap);
            return;
        } else
        {
            bitmap = new TransitionDrawable(new Drawable[] {
                drawable, bitmap
            });
            bitmap.setCrossFadeEnabled(true);
            imageview.setImageDrawable(bitmap);
            bitmap.startTransition(125);
            return;
        }
    }

    public static void showView(View view, boolean flag)
    {
        if (view == null)
        {
            return;
        }
        view.clearAnimation();
        if (flag)
        {
            animateView(view, 0x10a0000, 125, new ShowViewOnAnimationStart(view));
            return;
        } else
        {
            view.setVisibility(0);
            return;
        }
    }

    public static void showViewIfHidden(View view, boolean flag)
    {
        while (view == null || view.getVisibility() == 0) 
        {
            return;
        }
        showView(view, flag);
    }

    public static void startAlphaFadeInAnimation(View view)
    {
        view.clearAnimation();
        view.setAlpha(0.65F);
        view.animate().alpha(1.0F).setDuration(125L).start();
    }
}
