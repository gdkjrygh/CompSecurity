// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.support.v4.view.animation.a;
import android.support.v4.view.animation.c;
import android.view.View;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.Interpolator;

public class PropertyAnimationUtil
{
    public static class HeightAnimation
    {

        private final View a;
        private final int b;
        private int c;
        private final Interpolator d = new a();
        private final Interpolator e = new c();

        static View a(HeightAnimation heightanimation)
        {
            return heightanimation.a;
        }

        private void a(ValueAnimator valueanimator)
        {
            valueanimator.setDuration(c);
            valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(this) {

                final HeightAnimation a;

                public final void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    valueanimator = (Integer)valueanimator.getAnimatedValue();
                    com.skype.android.util.HeightAnimation.a(a).getLayoutParams().height = valueanimator.intValue();
                    com.skype.android.util.HeightAnimation.a(a).requestLayout();
                }

            
            {
                a = heightanimation;
                super();
            }
            });
            valueanimator.start();
        }

        public final void a()
        {
            ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
                0, b
            });
            valueanimator.setInterpolator(d);
            a(valueanimator);
        }

        public final void a(int i)
        {
            c = i;
        }

        public final void b()
        {
            ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
                b, 0
            });
            valueanimator.setInterpolator(e);
            a(valueanimator);
        }

        public HeightAnimation(View view)
        {
            a = view;
            b = view.getLayoutParams().height;
            c = 160;
        }
    }


    public PropertyAnimationUtil()
    {
    }

    public static ObjectAnimator c(View view)
    {
        if (view.getVisibility() == 0)
        {
            return null;
        } else
        {
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(view, "alpha", new float[] {
                0.0F, 1.0F
            }).setDuration(300L);
            objectanimator.start();
            view.setVisibility(0);
            return objectanimator;
        }
    }

    public static HeightAnimation e(View view)
    {
        return new HeightAnimation(view);
    }

    public final ObjectAnimator a(View view, int i)
    {
        if (view.getVisibility() == i)
        {
            return null;
        } else
        {
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(view, "alpha", new float[] {
                1.0F, 0.0F
            }).setDuration(300L);
            objectanimator.addListener(new android.animation.Animator.AnimatorListener(view, i) {

                final View a;
                final int b;
                final PropertyAnimationUtil c;

                public final void onAnimationCancel(Animator animator)
                {
                }

                public final void onAnimationEnd(Animator animator)
                {
                    a.setVisibility(b);
                }

                public final void onAnimationRepeat(Animator animator)
                {
                }

                public final void onAnimationStart(Animator animator)
                {
                }

            
            {
                c = PropertyAnimationUtil.this;
                a = view;
                b = i;
                super();
            }
            });
            objectanimator.start();
            return objectanimator;
        }
    }

    public final void a(View view)
    {
        if (view.getVisibility() == 0)
        {
            return;
        } else
        {
            ObjectAnimator objectanimator = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[] {
                PropertyValuesHolder.ofFloat("scaleX", new float[] {
                    0.0F, 1.0F
                }), PropertyValuesHolder.ofFloat("scaleY", new float[] {
                    0.0F, 1.0F
                }), PropertyValuesHolder.ofFloat("alpha", new float[] {
                    0.0F, 1.0F
                })
            });
            objectanimator.setDuration(300L);
            objectanimator.setInterpolator(new AnticipateOvershootInterpolator());
            view.setVisibility(0);
            objectanimator.addListener(new android.animation.Animator.AnimatorListener(view) {

                final View a;
                final PropertyAnimationUtil b;

                public final void onAnimationCancel(Animator animator)
                {
                }

                public final void onAnimationEnd(Animator animator)
                {
                    a.requestLayout();
                }

                public final void onAnimationRepeat(Animator animator)
                {
                }

                public final void onAnimationStart(Animator animator)
                {
                }

            
            {
                b = PropertyAnimationUtil.this;
                a = view;
                super();
            }
            });
            objectanimator.start();
            return;
        }
    }

    public final void a(View view, boolean flag)
    {
        if (flag)
        {
            c(view);
            return;
        } else
        {
            a(view, 4);
            return;
        }
    }

    public final void b(View view)
    {
        if (view.getVisibility() == 8)
        {
            return;
        } else
        {
            ObjectAnimator objectanimator = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[] {
                PropertyValuesHolder.ofFloat("scaleX", new float[] {
                    1.0F, 0.0F
                }), PropertyValuesHolder.ofFloat("scaleY", new float[] {
                    1.0F, 0.0F
                }), PropertyValuesHolder.ofFloat("alpha", new float[] {
                    1.0F, 0.0F
                })
            });
            objectanimator.setDuration(300L);
            objectanimator.setInterpolator(new AnticipateOvershootInterpolator());
            objectanimator.addListener(new android.animation.Animator.AnimatorListener(view) {

                final View a;
                final PropertyAnimationUtil b;

                public final void onAnimationCancel(Animator animator)
                {
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
                b = PropertyAnimationUtil.this;
                a = view;
                super();
            }
            });
            objectanimator.start();
            return;
        }
    }

    public final ObjectAnimator d(View view)
    {
        return a(view, 4);
    }
}
