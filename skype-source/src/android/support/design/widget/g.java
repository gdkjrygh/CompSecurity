// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.graphics.drawable.a;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

// Referenced classes of package android.support.design.widget:
//            i, o, a, l, 
//            m

class g extends i
{
    private abstract class a extends Animation
    {

        final g a;
        private float b;
        private float c;

        protected abstract float a();

        protected void applyTransformation(float f, Transformation transformation)
        {
            transformation = a.a;
            transformation.a(b + c * f, ((l) (transformation)).h);
        }

        public void reset()
        {
            super.reset();
            b = a.a.j;
            c = a() - b;
        }

        private a()
        {
            a = g.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    private final class b extends a
    {

        final g b;

        protected final float a()
        {
            return android.support.design.widget.g.a(b) + g.b(b);
        }

        private b()
        {
            b = g.this;
            super((byte)0);
        }

        b(byte byte0)
        {
            this();
        }
    }

    private final class c extends a
    {

        final g b;

        protected final float a()
        {
            return android.support.design.widget.g.a(b);
        }

        private c()
        {
            b = g.this;
            super((byte)0);
        }

        c(byte byte0)
        {
            this();
        }
    }


    l a;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private float j;
    private float k;
    private int l;
    private o m;
    private boolean n;

    g(View view, m m1)
    {
        super(view, m1);
        l = view.getResources().getInteger(0x10e0000);
        m = new o();
        m.a(view);
        m.a(b, a(new b((byte)0)));
        m.a(c, a(new b((byte)0)));
        m.a(d, a(new c((byte)0)));
    }

    static float a(g g1)
    {
        return g1.j;
    }

    private Animation a(Animation animation)
    {
        animation.setInterpolator(android.support.design.widget.a.b);
        animation.setDuration(l);
        return animation;
    }

    static boolean a(g g1, boolean flag)
    {
        g1.n = flag;
        return flag;
    }

    static float b(g g1)
    {
        return g1.k;
    }

    private static ColorStateList b(int i1)
    {
        return new ColorStateList(new int[][] {
            c, b, new int[0]
        }, new int[] {
            i1, i1, 0
        });
    }

    private void e()
    {
        Rect rect = new Rect();
        a.getPadding(rect);
        f.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    void a()
    {
        m.a();
    }

    void a(float f)
    {
        if (j != f && a != null)
        {
            a.a(f, k + f);
            j = f;
            e();
        }
    }

    void a(int i1)
    {
        android.support.v4.graphics.drawable.a.a(h, b(i1));
    }

    void a(ColorStateList colorstatelist)
    {
        android.support.v4.graphics.drawable.a.a(g, colorstatelist);
        if (i != null)
        {
            android.support.v4.graphics.drawable.a.a(i, colorstatelist);
        }
    }

    void a(android.graphics.PorterDuff.Mode mode)
    {
        android.support.v4.graphics.drawable.a.a(g, mode);
    }

    void a(Drawable drawable, ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode, int i1, int j1)
    {
        g = android.support.v4.graphics.drawable.a.c(drawable.mutate());
        android.support.v4.graphics.drawable.a.a(g, colorstatelist);
        if (mode != null)
        {
            android.support.v4.graphics.drawable.a.a(g, mode);
        }
        drawable = new GradientDrawable();
        drawable.setShape(1);
        drawable.setColor(-1);
        drawable.setCornerRadius(f.a());
        h = android.support.v4.graphics.drawable.a.c(drawable);
        android.support.v4.graphics.drawable.a.a(h, b(i1));
        android.support.v4.graphics.drawable.a.a(h, android.graphics.PorterDuff.Mode.MULTIPLY);
        if (j1 > 0)
        {
            i = a(j1, colorstatelist);
            drawable = new Drawable[3];
            drawable[0] = i;
            drawable[1] = g;
            drawable[2] = h;
        } else
        {
            i = null;
            drawable = new Drawable[2];
            drawable[0] = g;
            drawable[1] = h;
        }
        a = new l(e.getResources(), new LayerDrawable(drawable), f.a(), j, j + k);
        a.a();
        f.a(a);
        e();
    }

    void a(int ai[])
    {
        m.a(ai);
    }

    void b()
    {
        if (n || e.getVisibility() != 0)
        {
            return;
        } else
        {
            Animation animation = AnimationUtils.loadAnimation(e.getContext(), android.support.design.a.a.design_fab_out);
            animation.setInterpolator(android.support.design.widget.a.b);
            animation.setDuration(200L);
            animation.setAnimationListener(new a.a() {

                final g a;

                public final void onAnimationEnd(Animation animation1)
                {
                    android.support.design.widget.g.a(a, false);
                    a.e.setVisibility(8);
                }

                public final void onAnimationStart(Animation animation1)
                {
                    android.support.design.widget.g.a(a, true);
                }

            
            {
                a = g.this;
                super();
            }
            });
            e.startAnimation(animation);
            return;
        }
    }

    void b(float f)
    {
        if (k != f && a != null)
        {
            k = f;
            l l1 = a;
            float f1 = j;
            l1.a(l1.j, f1 + f);
            e();
        }
    }

    void c()
    {
        if (e.getVisibility() != 0 || n)
        {
            e.clearAnimation();
            e.setVisibility(0);
            Animation animation = AnimationUtils.loadAnimation(e.getContext(), android.support.design.a.a.design_fab_in);
            animation.setDuration(200L);
            animation.setInterpolator(android.support.design.widget.a.b);
            e.startAnimation(animation);
        }
    }
}
