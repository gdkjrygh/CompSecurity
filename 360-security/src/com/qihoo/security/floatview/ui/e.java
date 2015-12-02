// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.floatview.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nineoldandroids.a.a;
import com.qihoo.security.ui.opti.sysclear.rocket.Star;
import com.qihoo.security.ui.opti.sysclear.rocket.b;
import com.qihoo.security.ui.opti.sysclear.rocket.c;
import com.qihoo.security.ui.opti.sysclear.rocket.d;
import java.util.Random;

public class e extends LinearLayout
{

    d a;
    c b;
    b c;
    Random d;
    private ImageView e;
    private ImageView f;
    private TextView g;

    public e(Context context)
    {
        super(context);
        d = new Random();
        a(context);
    }

    private void a(Context context)
    {
        LayoutInflater.from(context).inflate(0x7f030051, this);
        f = (ImageView)findViewById(0x7f0b011c);
        e = (ImageView)findViewById(0x7f0b011b);
        g = (TextView)findViewById(0x7f0b011d);
    }

    static void a(e e1)
    {
        e1.e();
    }

    private void a(float af[], Drawable drawable)
    {
        while (af.length < 7 || a == null) 
        {
            return;
        }
        a.a(drawable, af[0], af[1], af[2], af[3], (int)af[4], af[5], (int)af[6]).getAnimator().a();
    }

    static TextView b(e e1)
    {
        return e1.g;
    }

    static ImageView c(e e1)
    {
        return e1.e;
    }

    private void d()
    {
        a = new d(getContext());
        postDelayed(new Runnable() {

            final e a;

            public void run()
            {
                a.b();
                com.qihoo.security.floatview.ui.e.a(a);
                AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
                alphaanimation.setInterpolator(new AccelerateInterpolator());
                alphaanimation.setDuration(500L);
                alphaanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener(this) {

                    final _cls1 a;

                    public void onAnimationEnd(Animation animation)
                    {
                    }

                    public void onAnimationRepeat(Animation animation)
                    {
                    }

                    public void onAnimationStart(Animation animation)
                    {
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
            }

            
            {
                a = e.this;
                super();
            }
        }, 100L);
    }

    private void e()
    {
        int i = 0;
        float f1 = getWidth() / 2;
        float f2 = getHeight() / 2;
        float f3 = getResources().getDisplayMetrics().density;
        Drawable drawable = getResources().getDrawable(0x7f020128);
        float af[][] = new float[7][];
        af[0] = (new float[] {
            f1, f2, 60F * f3, 30F, 105F, 0.2F, (float)20000
        });
        af[1] = (new float[] {
            f1, f2, 190F * f3, 330F, 105F, 0.5F, (float)20000
        });
        af[2] = (new float[] {
            f1, f2, 200F * f3, 290F, 105F, 0.33F, (float)20000
        });
        af[3] = (new float[] {
            f1, f2, 100F * f3, 255F, 105F, 1.0F, (float)20000
        });
        af[4] = (new float[] {
            f1, f2, 240F * f3, 225F, 155F, 0.33F, (float)20000
        });
        af[5] = (new float[] {
            f1, f2, 160F * f3, 150F, 80F, 0.4F, (float)20000
        });
        af[6] = (new float[] {
            f1, f2, 240F * f3, 60F, 55F, 0.6F, (float)20000
        });
        for (; i < af.length; i++)
        {
            a(af[i], drawable);
        }

    }

    private void f()
    {
        if (a != null)
        {
            a.b();
            a = null;
        }
    }

    private void g()
    {
        e.setImageDrawable(null);
        if (b != null)
        {
            b.a();
            b = null;
        }
        e.setVisibility(8);
    }

    private int getDuration()
    {
        return (int)((0.69999999999999996D + (double)d.nextFloat() * 0.80000000000000004D) * 1000D);
    }

    private float getStarY()
    {
        return (float)(-0.29999999999999999D - (double)d.nextFloat() * 1.2D) * 700F;
    }

    private int getStartSize()
    {
        return d.nextInt(2) + 1;
    }

    private float getStartX()
    {
        return d.nextFloat() * (float)getWidth();
    }

    private void h()
    {
        f.setImageDrawable(null);
        if (c != null)
        {
            c.b();
        }
        c = null;
        f.setVisibility(8);
    }

    public void a()
    {
        f();
        g();
        h();
    }

    public void a(float f1, float f2, com.qihoo.security.ui.opti.sysclear.rocket.a a1)
    {
        d();
        c = new b(getContext());
        c.setBounds(0, 0, getWidth(), getHeight());
        c.a(a1);
        f.setImageDrawable(c);
        c.a(f1, f2, true, this);
        f.setVisibility(0);
    }

    public void a(boolean flag)
    {
        if (g != null)
        {
            if (flag)
            {
                c();
                if (g.getVisibility() != 0)
                {
                    g.setVisibility(0);
                }
            } else
            if (g.getVisibility() == 0)
            {
                AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
                alphaanimation.setInterpolator(new AccelerateInterpolator());
                alphaanimation.setDuration(500L);
                alphaanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                    final e a;

                    public void onAnimationEnd(Animation animation)
                    {
                        com.qihoo.security.floatview.ui.e.b(a).setVisibility(8);
                    }

                    public void onAnimationRepeat(Animation animation)
                    {
                    }

                    public void onAnimationStart(Animation animation)
                    {
                    }

            
            {
                a = e.this;
                super();
            }
                });
                g.clearAnimation();
                g.startAnimation(alphaanimation);
                return;
            }
        }
    }

    public void b()
    {
        if (a != null)
        {
            float f1 = getWidth();
            float f2 = getHeight();
            int j = getStartSize();
            Drawable drawable = getResources().getDrawable(0x7f0200c0);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            for (int i = 0; i < j; i++)
            {
                Star star = a.a(drawable, getStartX(), getStarY(), 90F, 255, 1.0F, f1, f2, getDuration());
                if (star != null)
                {
                    star.start();
                }
            }

        }
    }

    public void b(boolean flag)
    {
        if (flag)
        {
            e.setVisibility(0);
            postDelayed(new Runnable() {

                final e a;

                public void run()
                {
                    if (a.b == null)
                    {
                        a.b = new c(a.getContext());
                        com.qihoo.security.floatview.ui.e.c(a).setImageDrawable(a.b);
                    }
                    float f1 = a.getResources().getDimensionPixelSize(0x7f09006f);
                    a.b.a(a.getWidth() / 2, (float)a.getHeight() - f1);
                }

            
            {
                a = e.this;
                super();
            }
            }, 100L);
        } else
        if (b != null)
        {
            b.a();
            e.setVisibility(8);
            return;
        }
    }

    public void c()
    {
        if (g != null)
        {
            String s = com.qihoo.security.locale.d.a().a(0x7f0c0080);
            g.setText(s);
        }
    }
}
