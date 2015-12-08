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

    public static void a(View view)
    {
        view.animate().cancel();
    }

    public static void a(View view, float f)
    {
        view.animate().alpha(f);
    }

    public static void a(View view, long l)
    {
        view.animate().setDuration(l);
    }

    public static void a(View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener)
    {
        if (viewpropertyanimatorlistener != null)
        {
            view.animate().setListener(new AnimatorListenerAdapter(viewpropertyanimatorlistener, view) {

                final ViewPropertyAnimatorListener a;
                final View b;

                public void onAnimationCancel(Animator animator)
                {
                    a.onAnimationCancel(b);
                }

                public void onAnimationEnd(Animator animator)
                {
                    a.onAnimationEnd(b);
                }

                public void onAnimationStart(Animator animator)
                {
                    a.onAnimationStart(b);
                }

            
            {
                a = viewpropertyanimatorlistener;
                b = view;
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

    public static void a(View view, Interpolator interpolator)
    {
        view.animate().setInterpolator(interpolator);
    }

    public static void b(View view)
    {
        view.animate().start();
    }

    public static void b(View view, float f)
    {
        view.animate().translationX(f);
    }

    public static void c(View view, float f)
    {
        view.animate().translationY(f);
    }
}
