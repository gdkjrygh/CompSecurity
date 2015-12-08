// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.personalization.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.LevelListDrawable;
import android.view.animation.DecelerateInterpolator;

// Referenced classes of package com.pandora.android.personalization.view:
//            b, d

public class c
    implements Animatable
{

    private LayerDrawable a;
    private LevelListDrawable b;
    private b c;
    private d d;
    private d e;
    private d f;
    private int g[];
    private ObjectAnimator h;
    private ObjectAnimator i;
    private ObjectAnimator j;
    private ValueAnimator k;
    private AnimatorSet l;

    public c(Context context, int i1)
    {
        context = context.obtainStyledAttributes(i1, com.pandora.android.R.styleable.StationPersonalizationThumbCircle);
        Drawable drawable = context.getDrawable(7);
        int j1 = context.getDimensionPixelSize(5, 1);
        int k1 = context.getDimensionPixelSize(6, 3);
        int l1 = context.getColor(0, 0x7f0b00b3);
        i1 = context.getColor(1, 0x7f0b00b7);
        c = new b(drawable);
        c.a(0.8F);
        b = new LevelListDrawable();
        a = new LayerDrawable(new Drawable[] {
            b, c
        });
        d = new d(l1, j1, k1, true);
        e = new d(i1, j1, k1, false);
        f = new d(i1, j1, k1, true);
        b.addLevel(0, 0, d);
        b.addLevel(0, 1, e);
        b.addLevel(0, 2, f);
        j1 = context.getColor(2, 0x7f0b00b7);
        k1 = context.getColor(3, 0x7f0b00b7);
        l1 = context.getColor(4, 0x7f0b00b7);
        g = (new int[] {
            i1, j1, k1, k1, k1, l1, l1, l1
        });
        context.recycle();
        c();
    }

    static LevelListDrawable a(c c1)
    {
        return c1.b;
    }

    public static c a(Context context, int i1)
    {
        return new c(context, i1);
    }

    static int[] b(c c1)
    {
        return c1.g;
    }

    static d c(c c1)
    {
        return c1.f;
    }

    private void c()
    {
        h = ObjectAnimator.ofFloat(c, "scale", new float[] {
            1.8F, 0.8F
        });
        h.setDuration(300L);
        h.setInterpolator(new DecelerateInterpolator(1.0F));
        i = ObjectAnimator.ofInt(b, "level", new int[] {
            0, 1
        });
        i.setDuration(150L);
        j = ObjectAnimator.ofInt(e, "level", new int[] {
            1, 100
        });
        j.addListener(new AnimatorListenerAdapter() {

            final c a;

            public void onAnimationEnd(Animator animator)
            {
                super.onAnimationEnd(animator);
                c.a(a).setLevel(2);
            }

            
            {
                a = c.this;
                super();
            }
        });
        j.setDuration(300L);
        k = ValueAnimator.ofInt(new int[] {
            0, g.length - 1, 2
        });
        k.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final c a;

            public void onAnimationUpdate(ValueAnimator valueanimator)
            {
                int i1 = ((Integer)valueanimator.getAnimatedValue()).intValue();
                valueanimator = c.c(a);
                boolean flag;
                if (i1 >= 5 && i1 <= 7)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                valueanimator.a(flag, c.b(a)[7]);
                c.c(a).a(c.b(a)[i1]);
            }

            
            {
                a = c.this;
                super();
            }
        });
        k.setInterpolator(new DecelerateInterpolator(1.0F));
        k.setDuration(300L);
        l = new AnimatorSet();
        l.play(h).with(j).after(i).before(k);
        l.addListener(new AnimatorListenerAdapter() {

            final c a;

            public void onAnimationEnd(Animator animator)
            {
                super.onAnimationEnd(animator);
                c.a(a).setLevel(0);
                c.d(a).setLevel(100);
                c.a(a).invalidateSelf();
            }

            
            {
                a = c.this;
                super();
            }
        });
    }

    static d d(c c1)
    {
        return c1.d;
    }

    public int a()
    {
        return c.getIntrinsicWidth();
    }

    public Drawable b()
    {
        return a;
    }

    public boolean isRunning()
    {
        return l.isRunning();
    }

    public void start()
    {
        if (isRunning())
        {
            stop();
        }
        l.start();
    }

    public void stop()
    {
        l.cancel();
    }
}
