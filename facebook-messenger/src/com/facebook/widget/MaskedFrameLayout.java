// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.q;

public class MaskedFrameLayout extends FrameLayout
{

    private static final PorterDuffXfermode a;
    private Drawable b;
    private Bitmap c;
    private Bitmap d;
    private Paint e;
    private boolean f;

    public MaskedFrameLayout(Context context)
    {
        this(context, null);
    }

    public MaskedFrameLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MaskedFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.obtainStyledAttributes(attributeset, q.MaskedFrameLayout, i, 0);
        attributeset = context.getDrawable(q.MaskedFrameLayout_mask);
        if (attributeset != null)
        {
            setMaskDrawable(attributeset);
        }
        setUsesFboToMask(context.getBoolean(q.MaskedFrameLayout_usesFboToMask, false));
        context.recycle();
        e = new Paint();
        e.setXfermode(a);
        e.setAntiAlias(true);
        e.setDither(true);
        e.setFilterBitmap(true);
    }

    private static Bitmap a(int i, int j)
    {
        Bitmap bitmap;
        try
        {
            bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            System.gc();
            return Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        }
        return bitmap;
    }

    private void a()
    {
        if (c != null)
        {
            c.recycle();
            c = null;
        }
    }

    private void a(Canvas canvas)
    {
        canvas.saveLayer(0.0F, 0.0F, getWidth(), getHeight(), null, 31);
        c(canvas);
        canvas.restore();
    }

    private void b()
    {
        if (d != null)
        {
            d.recycle();
            d = null;
        }
    }

    private void b(Canvas canvas)
    {
        Bitmap bitmap = c();
        Canvas canvas1 = new Canvas(bitmap);
        canvas1.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        c(canvas1);
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, null);
    }

    private Bitmap c()
    {
        if (d == null)
        {
            d = a(getWidth(), getHeight());
        }
        return d;
    }

    private void c(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        Paint paint = getMaskDrawablePaint();
        if (paint != null)
        {
            android.graphics.Xfermode xfermode = paint.getXfermode();
            paint.setXfermode(a);
            b.setBounds(0, 0, getWidth(), getHeight());
            b.draw(canvas);
            paint.setXfermode(xfermode);
            return;
        } else
        {
            canvas.drawBitmap(getMaskBitmap(), 0.0F, 0.0F, e);
            return;
        }
    }

    private Bitmap getMaskBitmap()
    {
        if (c != null)
        {
            return c;
        } else
        {
            int i = getWidth();
            int j = getHeight();
            c = a(i, j);
            Canvas canvas = new Canvas(c);
            b.setBounds(0, 0, i, j);
            b.draw(canvas);
            return c;
        }
    }

    private Paint getMaskDrawablePaint()
    {
        if (b instanceof BitmapDrawable)
        {
            return ((BitmapDrawable)b).getPaint();
        }
        if (b instanceof NinePatchDrawable)
        {
            return ((NinePatchDrawable)b).getPaint();
        }
        if (b instanceof ShapeDrawable)
        {
            return ((ShapeDrawable)b).getPaint();
        } else
        {
            return null;
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
        if (b == null)
        {
            super.dispatchDraw(canvas);
            return;
        }
        if (f)
        {
            a(canvas);
            return;
        } else
        {
            b(canvas);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        a();
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        a();
        b();
    }

    public void setMaskDrawable(Drawable drawable)
    {
        b = drawable;
        a();
        invalidate();
    }

    public void setUsesFboToMask(boolean flag)
    {
        f = flag;
        if (f)
        {
            b();
        }
        invalidate();
    }

    static 
    {
        a = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN);
    }
}
