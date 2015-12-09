// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.personalization.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

public class a
{

    public static AnimatorSet a(View view, View view1, Rect rect)
    {
        View view2 = view.findViewById(0x7f100213);
        View view3 = view.findViewById(0x7f100216);
        view = new ArrayList();
        int i = ((android.widget.RelativeLayout.LayoutParams)view1.getLayoutParams()).leftMargin;
        view.addAll(a(view2, rect, i));
        view.addAll(c(view3, rect, i));
        view1 = new AnimatorSet();
        view1.playTogether(view);
        view1.setInterpolator(new DecelerateInterpolator());
        return view1;
    }

    protected static ObjectAnimator a(View view, float f, float f1)
    {
        return ObjectAnimator.ofFloat(view, "alpha", new float[] {
            f, f1
        });
    }

    private static ValueAnimator a(View view, View view1, int i)
    {
        Object obj = view.getResources();
        if (i == 0)
        {
            obj = ValueAnimator.ofInt(new int[] {
                view.getMeasuredHeight(), ((Resources) (obj)).getDimensionPixelSize(0x7f090142)
            });
        } else
        {
            obj = ValueAnimator.ofInt(new int[] {
                ((Resources) (obj)).getDimensionPixelSize(0x7f090142), view.getMeasuredHeight()
            });
        }
        ((ValueAnimator) (obj)).addListener(new AnimatorListenerAdapter(view1) {

            final View a;

            public void onAnimationEnd(Animator animator)
            {
                super.onAnimationEnd(animator);
                a.setVisibility(0);
            }

            public void onAnimationStart(Animator animator)
            {
                super.onAnimationStart(animator);
                a.setVisibility(4);
            }

            
            {
                a = view;
                super();
            }
        });
        ((ValueAnimator) (obj)).addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(view) {

            final View a;

            public void onAnimationUpdate(ValueAnimator valueanimator)
            {
                int j = ((Integer)valueanimator.getAnimatedValue()).intValue();
                valueanimator = a.getLayoutParams();
                valueanimator.width = j;
                a.setLayoutParams(valueanimator);
            }

            
            {
                a = view;
                super();
            }
        });
        ((ValueAnimator) (obj)).setStartDelay(150L);
        ((ValueAnimator) (obj)).setInterpolator(new DecelerateInterpolator(4F));
        return ((ValueAnimator) (obj));
    }

    public static List a(View view, Rect rect, int i)
    {
        ArrayList arraylist = new ArrayList(3);
        View view2 = view.findViewById(0x7f100214);
        view2.setRotation(180F);
        View view1 = view.findViewById(0x7f100215);
        arraylist.add(b(view, (rect.centerX() - view.getRight()) + i, 0.0F));
        rect = ObjectAnimator.ofFloat(view2, "rotation", new float[] {
            180F, 0.0F
        });
        rect.setStartDelay(150L);
        arraylist.add(rect);
        arraylist.add(a(view, view1, 0));
        return arraylist;
    }

    public static AnimatorSet b(View view, View view1, Rect rect)
    {
        View view2 = view.findViewById(0x7f100213);
        View view3 = view.findViewById(0x7f100216);
        view = new ArrayList();
        int i = ((android.widget.RelativeLayout.LayoutParams)view1.getLayoutParams()).leftMargin;
        view.addAll(b(view2, rect, i));
        view.addAll(d(view3, rect, i));
        view1 = new AnimatorSet();
        view1.playTogether(view);
        view1.setInterpolator(new DecelerateInterpolator());
        return view1;
    }

    protected static ObjectAnimator b(View view, float f, float f1)
    {
        return ObjectAnimator.ofFloat(view, "translationX", new float[] {
            f, f1
        });
    }

    public static List b(View view, Rect rect, int i)
    {
        ArrayList arraylist = new ArrayList(3);
        View view1 = view.findViewById(0x7f100214);
        view1.setRotation(0.0F);
        View view2 = view.findViewById(0x7f100215);
        arraylist.add(a(view2, 1.0F, 0.0F));
        arraylist.add(b(view, 0.0F, (rect.centerX() - view.getRight()) + i));
        arraylist.add(ObjectAnimator.ofFloat(view1, "rotation", new float[] {
            0.0F, 180F
        }));
        arraylist.add(a(view, view2, 1));
        return arraylist;
    }

    protected static ObjectAnimator c(View view, float f, float f1)
    {
        return ObjectAnimator.ofFloat(view, "translationY", new float[] {
            f, f1
        });
    }

    private static List c(View view, Rect rect, int i)
    {
        ArrayList arraylist = new ArrayList(2);
        View view1 = view.findViewById(0x7f100217);
        arraylist.add(b(view, -((view.getLeft() - rect.centerX()) + i), 0.0F));
        arraylist.add(a(view, view1, 0));
        return arraylist;
    }

    private static List d(View view, Rect rect, int i)
    {
        ArrayList arraylist = new ArrayList(2);
        View view1 = view.findViewById(0x7f100217);
        arraylist.add(a(view1, 1.0F, 0.0F));
        arraylist.add(b(view, 0.0F, -((view.getLeft() - rect.centerX()) + i)));
        arraylist.add(a(view, view1, 1));
        return arraylist;
    }
}
