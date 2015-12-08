// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.kik.android.a.a;
import com.kik.android.a.b;
import com.kik.android.a.c;

// Referenced classes of package kik.android.util:
//            az, ay, ba, cv, 
//            aw, bb, bd, ax, 
//            bc

public final class av
{

    public static int a(Context context, int i)
    {
        if (context != null && context.getTheme() != null)
        {
            TypedValue typedvalue = new TypedValue();
            context.getTheme().resolveAttribute(0x10100ae, typedvalue, true);
            context = context.obtainStyledAttributes(typedvalue.resourceId, new int[] {
                i
            });
            if (context != null)
            {
                i = context.getResourceId(0, 0);
                context.recycle();
                return i;
            }
        }
        return 0;
    }

    public static void a(View view)
    {
        if (view == null)
        {
            return;
        } else
        {
            android.graphics.drawable.Drawable drawable = view.getBackground();
            a a1 = new a(view);
            a1.setDuration(300L);
            a1.setAnimationListener(new az(view, drawable));
            view.startAnimation(a1);
            return;
        }
    }

    public static void a(View view, int i)
    {
        if (view != null && (view.getMeasuredHeight() != i || view.getMeasuredWidth() != -1)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j;
        int k;
        Animation animation = view.getAnimation();
        if (!(animation instanceof b))
        {
            break; /* Loop/switch isn't completed */
        }
        j = ((b)animation).a();
        k = ((b)animation).b();
        if (j == i && k == -1) goto _L1; else goto _L3
_L3:
        b b1 = new b(view, view.getMeasuredHeight(), i, view.getMeasuredWidth());
        b1.setDuration(300L);
        b1.setAnimationListener(new ay(view));
        view.startAnimation(b1);
        return;
    }

    public static void a(View view, int i, int j)
    {
        a(view, i, j, 300, null);
    }

    public static void a(View view, int i, int j, int k, android.view.animation.Animation.AnimationListener animationlistener)
    {
        if (view == null)
        {
            return;
        }
        c c1 = new c(view, i, j, 0);
        c1.setDuration(k);
        if (animationlistener != null)
        {
            c1.setAnimationListener(new ba(animationlistener));
        }
        view.startAnimation(c1);
    }

    public static void a(View view, int i, long l, android.animation.Animator.AnimatorListener animatorlistener)
    {
        if (view == null)
        {
            return;
        }
        kik.android.util.cv.b(new View[] {
            view
        });
        view = ObjectAnimator.ofFloat(view, View.ALPHA, new float[] {
            0.0F, 1.0F
        });
        view.setDuration(i);
        view.setStartDelay(l);
        if (animatorlistener != null)
        {
            view.addListener(animatorlistener);
        }
        view.start();
    }

    public static void a(View view, int i, android.view.animation.Animation.AnimationListener animationlistener)
    {
        if (view == null)
        {
            return;
        } else
        {
            AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation.setDuration(i);
            alphaanimation.setAnimationListener(new aw(animationlistener, view));
            view.startAnimation(alphaanimation);
            return;
        }
    }

    public static transient void a(View aview[])
    {
        ObjectAnimator aobjectanimator[] = new ObjectAnimator[aview.length];
        int i = 0;
        while (i < aview.length) 
        {
            View view = aview[i];
            if (view != null)
            {
                float f;
                if (view.getAlpha() != 1.0F)
                {
                    f = view.getAlpha();
                } else
                {
                    f = 0.0F;
                }
                aobjectanimator[i] = ObjectAnimator.ofFloat(view, View.ALPHA, new float[] {
                    f, 1.0F
                });
                aobjectanimator[i].setInterpolator(new AccelerateInterpolator());
            }
            i++;
        }
        kik.android.util.cv.b(aview);
        aview = new AnimatorSet();
        aview.playTogether(aobjectanimator);
        aview.setDuration(200L);
        aview.start();
    }

    public static void b(View view)
    {
        if (view == null)
        {
            return;
        } else
        {
            TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 1, -1F, 1, 0.0F, 1, 0.0F);
            translateanimation.setDuration(400L);
            translateanimation.setAnimationListener(new bb(view, translateanimation));
            view.startAnimation(translateanimation);
            return;
        }
    }

    public static void b(View view, int i)
    {
        if (view == null)
        {
            return;
        } else
        {
            AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation.setDuration(i);
            alphaanimation.setAnimationListener(new bd(view));
            view.startAnimation(alphaanimation);
            return;
        }
    }

    public static void b(View view, int i, android.view.animation.Animation.AnimationListener animationlistener)
    {
        if (view == null)
        {
            return;
        } else
        {
            view.setVisibility(0);
            c c1 = new c(view, i, com.kik.android.a.c.a.a, 51);
            c1.setDuration(150L);
            c1.setAnimationListener(new ax(view, i, animationlistener));
            view.startAnimation(c1);
            return;
        }
    }

    public static transient void b(View aview[])
    {
        ObjectAnimator aobjectanimator[] = new ObjectAnimator[aview.length];
        int i = 0;
        while (i < aview.length) 
        {
            View view = aview[i];
            if (view != null)
            {
                float f;
                if (view.getAlpha() != 0.0F)
                {
                    f = view.getAlpha();
                } else
                {
                    f = 1.0F;
                }
                aobjectanimator[i] = ObjectAnimator.ofFloat(view, View.ALPHA, new float[] {
                    f, 0.0F
                });
                aobjectanimator[i].setInterpolator(new AccelerateInterpolator());
            }
            i++;
        }
        kik.android.util.cv.b(aview);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(aobjectanimator);
        animatorset.setDuration(200L);
        animatorset.addListener(new bc(aview));
        animatorset.start();
    }

    public static void c(View view)
    {
        b(view, 500);
    }
}
