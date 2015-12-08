// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;

public class ad
{

    public static void a(View view, View view1)
    {
        view.setAlpha(0.0F);
        view1.setAlpha(1.0F);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.setDuration(view.getResources().getInteger(0x10e0001));
        animatorset.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[] {
                (float)view.getHeight(), 0.0F
            }), ObjectAnimator.ofFloat(view, View.ALPHA, new float[] {
                0.0F, 1.0F
            }), ObjectAnimator.ofFloat(view1, View.ALPHA, new float[] {
                1.0F, 0.0F
            })
        });
        animatorset.start();
    }

    public static void a(View view, View view1, View view2)
    {
        view.setVisibility(0);
        view1.setAlpha(0.0F);
        if (view2 != null)
        {
            view2.setAlpha(0.0F);
        }
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.setDuration(view.getResources().getInteger(0x7f0c0008));
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[] {
            0.0F, (float)(-view.getHeight())
        });
        view = ObjectAnimator.ofFloat(view, View.ALPHA, new float[] {
            1.0F, 0.0F
        });
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(view1, View.TRANSLATION_Y, new float[] {
            (float)view1.getHeight(), 0.0F
        });
        view1 = ObjectAnimator.ofFloat(view1, View.ALPHA, new float[] {
            0.0F, 1.0F
        });
        if (view2 != null)
        {
            animatorset.playTogether(new Animator[] {
                objectanimator, view, objectanimator1, view1, ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[] {
                    (float)view2.getHeight(), 0.0F
                }), ObjectAnimator.ofFloat(view2, View.ALPHA, new float[] {
                    0.0F, 1.0F
                })
            });
        } else
        {
            animatorset.playTogether(new Animator[] {
                objectanimator, view, objectanimator1, view1
            });
        }
        animatorset.start();
    }
}
