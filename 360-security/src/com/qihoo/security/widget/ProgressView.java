// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;

public class ProgressView extends FrameLayout
{

    private static final String a = com/qihoo/security/widget/ProgressView.getSimpleName();
    private float b;
    private Scroller c;
    private View d;
    private View e;
    private Drawable f;
    private boolean g;
    private boolean h;

    public ProgressView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 0.0F;
        c = null;
        e = null;
        f = null;
        g = false;
        h = true;
        b();
    }

    private Drawable a(Drawable drawable)
    {
        Object obj = drawable;
        if (drawable instanceof AnimationDrawable)
        {
            drawable = (AnimationDrawable)drawable;
            int j = drawable.getNumberOfFrames();
            obj = new AnimationDrawable();
            ((AnimationDrawable) (obj)).setOneShot(drawable.isOneShot());
            for (int i = 0; i < j; i++)
            {
                Drawable drawable1 = b(drawable.getFrame(i));
                drawable1.setLevel(10000);
                ((AnimationDrawable) (obj)).addFrame(drawable1, drawable.getDuration(i));
            }

            ((AnimationDrawable) (obj)).setLevel(10000);
        }
        return ((Drawable) (obj));
    }

    private void a()
    {
        if (h && getVisibility() == 0 && !g)
        {
            ((Animatable)f).start();
            g = true;
        } else
        if (g)
        {
            ((Animatable)f).stop();
            g = false;
            return;
        }
    }

    private Drawable b(Drawable drawable)
    {
        Object obj = drawable;
        if (drawable instanceof BitmapDrawable)
        {
            drawable = ((BitmapDrawable)drawable).getBitmap();
            obj = new ShapeDrawable(getDrawableShape());
            drawable = new BitmapShader(drawable, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.MIRROR);
            ((ShapeDrawable) (obj)).getPaint().setShader(drawable);
        }
        return ((Drawable) (obj));
    }

    private void b()
    {
        LayoutInflater.from(getContext()).inflate(0x7f030088, this);
        setBackgroundResource(0x7f0200e5);
        c = new Scroller(getContext(), new LinearInterpolator());
        d = findViewById(0x7f0b01bf);
        e = findViewById(0x7f0b01c0);
        f = getResources().getDrawable(0x7f0200e9);
        f = a(f);
        f.setCallback(this);
        a();
    }

    public void a(float f1, int i)
    {
        b = f1;
        if (!c.isFinished())
        {
            c.abortAnimation();
        }
        int j = (int)((float)(e.getMeasuredWidth() - d.getMeasuredWidth()) * (1.0F - b) - (float)e.getScrollX());
        if (j >= 0);
        if (e.getMeasuredWidth() == 0 || d.getMeasuredWidth() == 0)
        {
            e.scrollTo((int)((float)(e.getMeasuredWidth() - d.getMeasuredWidth()) * (1.0F - b)), 0);
        } else
        if (i < 0)
        {
            c.startScroll(e.getScrollX(), 0, j, 0, Math.abs(j * 3));
            invalidate();
        } else
        if (i == 0)
        {
            e.scrollTo((int)((float)(e.getMeasuredWidth() - d.getMeasuredWidth()) * (1.0F - b)), 0);
        } else
        {
            c.startScroll(e.getScrollX(), 0, j, 0, Math.abs(i));
            invalidate();
        }
        invalidate();
    }

    public void computeScroll()
    {
        if (c.computeScrollOffset())
        {
            e.scrollTo(c.getCurrX(), c.getCurrY());
            postInvalidate();
        }
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
    }

    Shape getDrawableShape()
    {
        return new RoundRectShape(new float[] {
            15F, 15F, 15F, 15F, 15F, 15F, 15F, 15F
        }, null, null);
    }

    public float getProgress()
    {
        return b;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.save();
        f.draw(canvas);
        canvas.restore();
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        e.scrollTo((int)((float)(e.getMeasuredWidth() - d.getMeasuredWidth()) * (1.0F - b)), 0);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        if (f != null)
        {
            f.setBounds(0, 0, i, j);
        }
    }

    public void onWindowFocusChanged(boolean flag)
    {
        if (getVisibility() == 0 && g && h)
        {
            if (flag)
            {
                ((Animatable)f).start();
            } else
            {
                ((Animatable)f).stop();
            }
        } else
        {
            ((Animatable)f).stop();
        }
        super.onWindowFocusChanged(flag);
    }

    public void setAnimation(boolean flag)
    {
        h = flag;
        a();
    }

    public void setProgress(float f1)
    {
        a(f1, -1);
    }

    public void setVisibility(int i)
    {
        super.setVisibility(i);
        a();
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return drawable == f || super.verifyDrawable(drawable);
    }

}
