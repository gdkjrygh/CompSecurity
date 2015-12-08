// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class GridImageView extends View
{

    private int a;
    private int b;
    private int c;
    private int d;
    private Matrix e;
    private Drawable f;
    private Context g;
    private int h;

    public GridImageView(Context context)
    {
        super(context);
        e = new Matrix();
        h = 0;
        g = context;
    }

    public GridImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = new Matrix();
        h = 0;
        g = context;
    }

    public GridImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        e = new Matrix();
        h = 0;
        g = context;
    }

    public final Drawable a()
    {
        return f;
    }

    public final void a(int i)
    {
        h = i;
    }

    public final void a(int i, int j)
    {
        c = i;
        d = j;
    }

    public final void a(Bitmap bitmap)
    {
        a(((Drawable) (new BitmapDrawable(g.getResources(), bitmap))));
    }

    public final void a(Drawable drawable)
    {
        float f1;
        f1 = 0.0F;
        if (f != null)
        {
            f.setCallback(null);
            unscheduleDrawable(f);
        }
        f = drawable;
        drawable.setCallback(this);
        if (drawable.isStateful())
        {
            drawable.setState(getDrawableState());
        }
        drawable.setLevel(0);
        a = drawable.getIntrinsicWidth();
        b = drawable.getIntrinsicHeight();
        f.setBounds(0, 0, a, b);
        h;
        JVM INSTR tableswitch 0 1: default 116
    //                   0 121
    //                   1 256;
           goto _L1 _L2 _L3
_L1:
        invalidate();
        return;
_L2:
        float f3;
        float f5;
        if (a * d > c * b)
        {
            f5 = (float)d / (float)b;
            f3 = ((float)c - (float)a * f5) * 0.5F;
        } else
        {
            f5 = (float)c / (float)a;
            f1 = d;
            float f7 = b;
            f3 = 0.0F;
            f1 = (f1 - f7 * f5) * 0.5F;
        }
        e.reset();
        e.setScale(f5, f5);
        e.postTranslate((int)(f3 + 0.5F), (int)(f1 + 0.5F));
        continue; /* Loop/switch isn't completed */
_L3:
        float f2;
        float f4;
        float f6;
        if (a <= c && b <= d)
        {
            f2 = 1.0F;
        } else
        {
            f2 = Math.min((float)c / (float)a, (float)d / (float)b);
        }
        f4 = (int)(((float)c - (float)a * f2) * 0.5F + 0.5F);
        f6 = (int)(((float)d - (float)b * f2) * 0.5F + 0.5F);
        e.reset();
        e.setScale(f2, f2);
        e.postTranslate(f4, f6);
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (f != null)
        {
            Drawable drawable = f;
            boolean flag;
            if (getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            drawable.setVisible(flag, false);
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (f != null)
        {
            f.setVisible(false, false);
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (e != null)
        {
            canvas.concat(e);
        }
        if (f != null)
        {
            f.draw(canvas);
        }
    }
}
