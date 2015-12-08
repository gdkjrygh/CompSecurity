// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorListener

class ViewPropertyAnimatorCompatICS
{

    public static void alpha(View view, float f)
    {
        view.animate().alpha(f);
    }

    public static void cancel(View view)
    {
        view.animate().cancel();
    }

    public static void scaleY(View view, float f)
    {
        view.animate().scaleY(f);
    }

    public static void setDuration(View view, long l)
    {
        view.animate().setDuration(l);
    }

    public static void setInterpolator(View view, Interpolator interpolator)
    {
        view.animate().setInterpolator(interpolator);
    }

    public static void setListener(View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener)
    {
        if (viewpropertyanimatorlistener != null)
        {
            view.animate().setListener(new AnimatorListenerAdapter(viewpropertyanimatorlistener, view) {

                final ViewPropertyAnimatorListener val$listener;
                final View val$view;

                public void onAnimationCancel(Animator animator)
                {
                    listener.onAnimationCancel(view);
                }

                public void onAnimationEnd(Animator animator)
                {
                    listener.onAnimationEnd(view);
                }

                public void onAnimationStart(Animator animator)
                {
                    listener.onAnimationStart(view);
                }

            
            {
                listener = viewpropertyanimatorlistener;
                view = view1;
                super();
            }
            });
            return;
        } else
        {
            view.animate().setListener(null);
            return;
        }
    }

    public static void start(View view)
    {
        view.animate().start();
    }

    public static void translationX(View view, float f)
    {
        view.animate().translationX(f);
    }

    public static void translationY(View view, float f)
    {
        view.animate().translationY(f);
    }
}
