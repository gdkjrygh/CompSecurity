// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.util;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

public final class AnimUtils
{
    public static interface ItemRemovalCallback
    {

        public abstract void onAnimationComplete(int i);
    }

    public static class SimpleAnimationListener
        implements android.view.animation.Animation.AnimationListener
    {

        public void onAnimationEnd(Animation animation)
        {
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        public SimpleAnimationListener()
        {
        }
    }


    public static final String TAG = com/soundcloud/android/util/AnimUtils.getSimpleName();

    private AnimUtils()
    {
    }

    public static void clearAllAnimations()
    {
        try
        {
            android/animation/ValueAnimator.getMethod("clearAllAnimations", new Class[0]).invoke(null, new Object[0]);
            return;
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            logFailureToClearAnimations();
            return;
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            logFailureToClearAnimations();
            return;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            logFailureToClearAnimations();
        }
    }

    public static void hideView(final View view, final int hiddenVisibility, boolean flag)
    {
        view.clearAnimation();
        if (view.getVisibility() == hiddenVisibility)
        {
            return;
        }
        view.clearAnimation();
        if (!flag)
        {
            view.setVisibility(hiddenVisibility);
            return;
        } else
        {
            hideView(view, ((android.view.animation.Animation.AnimationListener) (new _cls1())));
            return;
        }
    }

    public static void hideView(View view, android.view.animation.Animation.AnimationListener animationlistener)
    {
        if (view.getVisibility() == 8)
        {
            return;
        } else
        {
            view.clearAnimation();
            Animation animation = AnimationUtils.loadAnimation(view.getContext(), com.soundcloud.androidkit.R.anim.ak_fade_out);
            animation.setAnimationListener(animationlistener);
            view.startAnimation(animation);
            return;
        }
    }

    public static void hideView(View view, boolean flag)
    {
        hideView(view, 8, flag);
    }

    public static void hideViews(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); hideView((View)iterable.next(), true)) { }
    }

    private static void logFailureToClearAnimations()
    {
    }

    private static void removeItemAnimated(final View removeView, final int position, final ItemRemovalCallback callback)
    {
        final android.view.ViewGroup.LayoutParams removeParams = removeView.getLayoutParams();
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            removeView.getHeight(), 0
        }).setDuration(removeView.getResources().getInteger(0x10e0000));
        ViewCompat.setHasTransientState(removeView, true);
        removeView.setAlpha(0.0F);
        valueanimator.addListener(new _cls2());
        valueanimator.addUpdateListener(new _cls3());
        valueanimator.start();
    }

    public static void removeItemFromList(ListView listview, int i, ItemRemovalCallback itemremovalcallback)
    {
        int j = listview.getFirstVisiblePosition();
        int k = listview.getChildCount();
        if (i >= j && i <= (k + j) - 1)
        {
            removeItemAnimated(listview.getChildAt((i - listview.getFirstVisiblePosition()) + listview.getHeaderViewsCount()), i, itemremovalcallback);
            return;
        } else
        {
            itemremovalcallback.onAnimationComplete(i);
            return;
        }
    }

    public static Animation runFadeInAnimationOn(View view)
    {
        Animation animation = AnimationUtils.loadAnimation(view.getContext(), 0x10a0000);
        view.startAnimation(animation);
        return animation;
    }

    public static Animation runSpinClockwiseAnimationOn(View view)
    {
        Animation animation = AnimationUtils.loadAnimation(view.getContext(), com.soundcloud.androidkit.R.anim.ak_spin_clockwise);
        view.startAnimation(animation);
        return animation;
    }

    public static void showView(View view, boolean flag)
    {
        if (view.getVisibility() != 0)
        {
            view.clearAnimation();
            view.setVisibility(0);
            if (flag)
            {
                view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), com.soundcloud.androidkit.R.anim.ak_fade_in));
            }
        }
    }

    public static void showViews(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); showView((View)iterable.next(), true)) { }
    }


    private class _cls1 extends SimpleAnimationListener
    {

        final int val$hiddenVisibility;
        final View val$view;

        public final void onAnimationEnd(Animation animation)
        {
            if (animation == view.getAnimation())
            {
                view.setVisibility(hiddenVisibility);
            }
        }

        _cls1()
        {
            view = view1;
            hiddenVisibility = i;
            super();
        }
    }


    private class _cls2 extends AnimatorListenerAdapter
    {

        final ItemRemovalCallback val$callback;
        final int val$position;
        final android.view.ViewGroup.LayoutParams val$removeParams;
        final View val$removeView;

        public final void onAnimationEnd(Animator animator)
        {
            callback.onAnimationComplete(position);
            removeParams.height = -2;
            removeView.setLayoutParams(removeParams);
            removeView.setAlpha(1.0F);
            ViewCompat.setHasTransientState(removeView, false);
        }

        _cls2()
        {
            callback = itemremovalcallback;
            position = i;
            removeParams = layoutparams;
            removeView = view;
            super();
        }
    }


    private class _cls3
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        final android.view.ViewGroup.LayoutParams val$removeParams;
        final View val$removeView;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            removeParams.height = ((Integer)valueanimator.getAnimatedValue()).intValue();
            removeView.setLayoutParams(removeParams);
        }

        _cls3()
        {
            removeParams = layoutparams;
            removeView = view;
            super();
        }
    }

}
