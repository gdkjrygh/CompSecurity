// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.widget.ImageView;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.roidapp.baselib.view:
//            e, g

final class f
    implements Runnable
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public final void run()
    {
        if (e.a(a) || e.b(a) == 0 && e.c(a) == 0)
        {
            return;
        }
        int j = a.getWidth();
        int l = a.getHeight();
        if (j > 0 && l > 0)
        {
            int i = e.b(a);
            int i1 = e.d(a).nextInt((e.c(a) - e.b(a)) + 1) + i;
            ImageView imageview;
            Object obj;
            int j1;
            if (i1 > (int)((float)e.c(a) * e.e(a)))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            j1 = e.d(a).nextInt(j - i1);
            imageview = new ImageView(a.getContext());
            obj = new android.widget.FrameLayout.LayoutParams(i1, i1);
            obj.leftMargin = j1;
            imageview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            imageview.setImageDrawable(e.f(a)[e.d(a).nextInt(e.f(a).length)]);
            if (e.g(a) != null)
            {
                imageview.setColorFilter(e.g(a)[e.d(a).nextInt(e.g(a).length)]);
            }
            obj = new AnimatorSet();
            if (e.h(a))
            {
                int k = j / 2;
                j = k;
                if (j1 > k)
                {
                    j = -k;
                }
                ((AnimatorSet) (obj)).playTogether(new Animator[] {
                    ObjectAnimator.ofFloat(imageview, "translationX", new float[] {
                        (float)j
                    })
                });
            }
            if (e.i(a))
            {
                ((AnimatorSet) (obj)).playTogether(new Animator[] {
                    ObjectAnimator.ofFloat(imageview, "translationY", new float[] {
                        (float)(-i1), (float)l
                    })
                });
            }
            if (e.j(a))
            {
                ((AnimatorSet) (obj)).playTogether(new Animator[] {
                    ObjectAnimator.ofFloat(imageview, "rotation", new float[] {
                        (float)(e.d(a).nextInt(361) * (e.d(a).nextInt(3) - 1)), (float)(e.d(a).nextInt(361) * (e.d(a).nextInt(3) - 1))
                    })
                });
            }
            j = l / e.k(a);
            if (i != 0)
            {
                i = j - e.d(a).nextInt(2) - 1;
            } else
            {
                i = e.d(a).nextInt(10) + j;
            }
            ((AnimatorSet) (obj)).setDuration(Math.max(1, i) * 1000);
            ((AnimatorSet) (obj)).setInterpolator(e.l(a));
            ((AnimatorSet) (obj)).addListener(new g(this, imageview));
            a.addView(imageview);
            ((AnimatorSet) (obj)).start();
            e.m(a).add(obj);
        }
        e.n(a);
    }
}
