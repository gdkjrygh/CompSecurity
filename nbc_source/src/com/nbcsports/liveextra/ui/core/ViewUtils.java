// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewAnimationUtils;

public final class ViewUtils
{

    public ViewUtils()
    {
    }

    public static void hideView(View view, int i)
    {
        if (view.getVisibility() == i)
        {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            view.setVisibility(i);
            return;
        } else
        {
            Animator animator = ViewAnimationUtils.createCircularReveal(view, (view.getLeft() + view.getRight()) / 2, (view.getTop() + view.getBottom()) / 2, view.getWidth(), 0.0F);
            animator.addListener(new AnimatorListenerAdapter(view, i) {

                final View val$view;
                final int val$visibility;

                public void onAnimationEnd(Animator animator1)
                {
                    super.onAnimationEnd(animator1);
                    view.setVisibility(visibility);
                }

            
            {
                view = view1;
                visibility = i;
                super();
            }
            });
            animator.start();
            return;
        }
    }

    public static void showView(View view)
    {
        if (view.getVisibility() == 0)
        {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            view.setVisibility(0);
            return;
        } else
        {
            Animator animator = ViewAnimationUtils.createCircularReveal(view, (view.getLeft() + view.getRight()) / 2, (view.getTop() + view.getBottom()) / 2, 0.0F, Math.max(view.getWidth(), view.getHeight()));
            view.setVisibility(0);
            animator.start();
            return;
        }
    }
}
