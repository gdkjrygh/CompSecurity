// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v4.view.t;
import android.util.DisplayMetrics;
import android.widget.ImageView;

class android.support.v4.widget.a extends ImageView
{
    private class a extends OvalShape
    {

        final android.support.v4.widget.a a;
        private RadialGradient b;
        private Paint c;
        private int d;

        public void draw(Canvas canvas, Paint paint)
        {
            int i = a.getWidth();
            int j = a.getHeight();
            canvas.drawCircle(i / 2, j / 2, d / 2 + android.support.v4.widget.a.a(a), c);
            canvas.drawCircle(i / 2, j / 2, d / 2, paint);
        }

        public a(int i, int j)
        {
            a = android.support.v4.widget.a.this;
            super();
            c = new Paint();
            android.support.v4.widget.a.a(android.support.v4.widget.a.this, i);
            d = j;
            float f = d / 2;
            float f1 = d / 2;
            float f2 = android.support.v4.widget.a.a(android.support.v4.widget.a.this);
            a1 = android.graphics.Shader.TileMode.CLAMP;
            b = new RadialGradient(f, f1, f2, new int[] {
                0x3d000000, 0
            }, null, android.support.v4.widget.a.this);
            c.setShader(b);
        }
    }


    private android.view.animation.Animation.AnimationListener a;
    private int b;

    public android.support.v4.widget.a(Context context, int i, float f)
    {
        super(context);
        float f1 = getContext().getResources().getDisplayMetrics().density;
        int j = (int)(f * f1 * 2.0F);
        int k = (int)(1.75F * f1);
        int l = (int)(0.0F * f1);
        b = (int)(3.5F * f1);
        if (a())
        {
            context = new ShapeDrawable(new OvalShape());
            t.c(this, f1 * 4F);
        } else
        {
            context = new ShapeDrawable(new a(b, j));
            t.a(this, 1, context.getPaint());
            context.getPaint().setShadowLayer(b, l, k, 0x1e000000);
            j = b;
            setPadding(j, j, j, j);
        }
        context.getPaint().setColor(i);
        setBackgroundDrawable(context);
    }

    static int a(android.support.v4.widget.a a1)
    {
        return a1.b;
    }

    static int a(android.support.v4.widget.a a1, int i)
    {
        a1.b = i;
        return i;
    }

    private boolean a()
    {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }

    public void a(android.view.animation.Animation.AnimationListener animationlistener)
    {
        a = animationlistener;
    }

    public void onAnimationEnd()
    {
        super.onAnimationEnd();
        if (a != null)
        {
            a.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart()
    {
        super.onAnimationStart();
        if (a != null)
        {
            a.onAnimationStart(getAnimation());
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (!a())
        {
            setMeasuredDimension(getMeasuredWidth() + b * 2, getMeasuredHeight() + b * 2);
        }
    }

    public void setBackgroundColor(int i)
    {
        if (getBackground() instanceof ShapeDrawable)
        {
            ((ShapeDrawable)getBackground()).getPaint().setColor(i);
        }
    }
}
