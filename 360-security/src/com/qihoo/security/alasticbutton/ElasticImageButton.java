// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.alasticbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.c;
import com.nineoldandroids.a.k;
import com.qihoo.security.ui.b.b;

public class ElasticImageButton extends FrameLayout
    implements android.view.animation.Animation.AnimationListener
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();

        public abstract void c();

        public abstract void d();

        public abstract void e();

        public abstract void f();
    }


    static final LinearInterpolator a = new LinearInterpolator();
    private final Context b;
    private final long c;
    private final long d;
    private LayoutInflater e;
    private View f;
    private View g;
    private FrameLayout h;
    private ScaleAnimation i;
    private ScaleAnimation j;
    private boolean k;
    private long l;
    private a m;

    public ElasticImageButton(Context context)
    {
        super(context);
        c = 0L;
        d = 300L;
        l = 0L;
        b = context;
        d();
        c();
    }

    public ElasticImageButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 0L;
        d = 300L;
        l = 0L;
        b = context;
        d();
        c();
    }

    public ElasticImageButton(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        c = 0L;
        d = 300L;
        l = 0L;
        b = context;
        d();
        c();
    }

    static a a(ElasticImageButton elasticimagebutton)
    {
        return elasticimagebutton.m;
    }

    static boolean a(ElasticImageButton elasticimagebutton, boolean flag)
    {
        elasticimagebutton.k = flag;
        return flag;
    }

    private void c()
    {
        e = LayoutInflater.from(b);
        h = (FrameLayout)e.inflate(0x7f03006a, this);
        f = h.findViewById(0x7f0b015b);
        k = true;
    }

    private void d()
    {
        i = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 0.5F, 1, 0.5F);
        i.setDuration(0L);
        i.setAnimationListener(this);
        j = new ScaleAnimation(1.0F, 0.0F, 1.0F, 0.0F, 1, 0.5F, 1, 0.5F);
        j.setDuration(300L);
        j.setAnimationListener(this);
    }

    public void a()
    {
        h.removeView(g);
        g = null;
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            if (!k)
            {
                return;
            } else
            {
                k = false;
                h.startAnimation(i);
                return;
            }
        } else
        {
            h.setVisibility(0);
            return;
        }
    }

    public void b()
    {
        if (Math.abs(System.currentTimeMillis() - l) >= 1500L)
        {
            l = System.currentTimeMillis();
            if (k)
            {
                k = false;
                if (m != null)
                {
                    m.a();
                }
                Object obj = com.nineoldandroids.a.k.a(f, "scaleX", new float[] {
                    1.0F, 1.0F
                });
                ((k) (obj)).c(0L);
                k k1 = com.nineoldandroids.a.k.a(f, "scaleY", new float[] {
                    1.0F, 1.0F
                });
                k1.c(0L);
                c c1 = new c();
                c1.a(new LinearInterpolator());
                c1.a(new com.nineoldandroids.a.a[] {
                    obj, k1
                });
                obj = null;
                if (g != null)
                {
                    k k2 = com.nineoldandroids.a.k.a(g, "scaleX", new float[] {
                        1.0F, 1.0F
                    });
                    k2.c(0L);
                    k k3 = com.nineoldandroids.a.k.a(g, "scaleY", new float[] {
                        1.0F, 1.0F
                    });
                    k3.c(0L);
                    obj = new c();
                    ((c) (obj)).a(new LinearInterpolator());
                    ((c) (obj)).a(new com.nineoldandroids.a.a[] {
                        k2, k3
                    });
                }
                c1.a(new com.nineoldandroids.a.b() {

                    final ElasticImageButton a;

                    public void a(com.nineoldandroids.a.a a1)
                    {
                        com.qihoo.security.ui.b.b.a(0, a);
                    }

                    public void b(com.nineoldandroids.a.a a1)
                    {
                        com.qihoo.security.alasticbutton.ElasticImageButton.a(a, true);
                        com.qihoo.security.ui.b.b.c(0);
                        if (com.qihoo.security.alasticbutton.ElasticImageButton.a(a) != null)
                        {
                            com.qihoo.security.alasticbutton.ElasticImageButton.a(a).b();
                        }
                        a.b(true);
                    }

            
            {
                a = ElasticImageButton.this;
                super();
            }
                });
                c1.a();
                if (obj != null)
                {
                    ((c) (obj)).a();
                    return;
                }
            }
        }
    }

    public void b(boolean flag)
    {
        if (flag)
        {
            if (!k)
            {
                return;
            } else
            {
                k = false;
                h.startAnimation(j);
                return;
            }
        } else
        {
            h.setVisibility(8);
            h.clearAnimation();
            return;
        }
    }

    public View getTopView()
    {
        return g;
    }

    public void invalidate()
    {
        super.invalidate();
    }

    public void onAnimationEnd(Animation animation)
    {
        if (animation == i)
        {
            com.qihoo.security.ui.b.b.c(2);
            if (m != null)
            {
                m.d();
            }
            k = true;
        } else
        if (animation == j)
        {
            com.qihoo.security.ui.b.b.c(1);
            if (m != null)
            {
                m.f();
            }
            k = true;
            h.setVisibility(8);
            h.clearAnimation();
            return;
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        if (animation == i)
        {
            com.qihoo.security.ui.b.b.a(2, this);
            if (m != null)
            {
                m.c();
            }
            h.setVisibility(0);
        } else
        if (animation == j)
        {
            com.qihoo.security.ui.b.b.a(1, this);
            if (m != null)
            {
                m.e();
                return;
            }
        }
    }

    public void setButtonAnimatorListener(a a1)
    {
        m = a1;
    }

    public void setTopView(View view)
    {
        g = view;
        view = new android.widget.FrameLayout.LayoutParams(-1, -1);
        view.gravity = 17;
        g.setLayoutParams(view);
        h.addView(g);
    }

}
