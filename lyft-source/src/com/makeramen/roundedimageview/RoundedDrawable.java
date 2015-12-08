// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.makeramen.roundedimageview;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

public class RoundedDrawable extends Drawable
{

    private final RectF a = new RectF();
    private final RectF b = new RectF();
    private final RectF c = new RectF();
    private final Bitmap d;
    private final Paint e = new Paint();
    private final int f;
    private final int g;
    private final RectF h = new RectF();
    private final Paint i = new Paint();
    private final Matrix j = new Matrix();
    private BitmapShader k;
    private android.graphics.Shader.TileMode l;
    private android.graphics.Shader.TileMode m;
    private boolean n;
    private float o;
    private boolean p;
    private float q;
    private ColorStateList r;
    private android.widget.ImageView.ScaleType s;

    public RoundedDrawable(Bitmap bitmap)
    {
        l = android.graphics.Shader.TileMode.CLAMP;
        m = android.graphics.Shader.TileMode.CLAMP;
        n = true;
        o = 0.0F;
        p = false;
        q = 0.0F;
        r = ColorStateList.valueOf(0xff000000);
        s = android.widget.ImageView.ScaleType.FIT_CENTER;
        d = bitmap;
        f = bitmap.getWidth();
        g = bitmap.getHeight();
        c.set(0.0F, 0.0F, f, g);
        e.setStyle(android.graphics.Paint.Style.FILL);
        e.setAntiAlias(true);
        i.setStyle(android.graphics.Paint.Style.STROKE);
        i.setAntiAlias(true);
        i.setColor(r.getColorForState(getState(), 0xff000000));
        i.setStrokeWidth(q);
    }

    public static Drawable a(Drawable drawable)
    {
        Drawable drawable1 = drawable;
        if (drawable == null) goto _L2; else goto _L1
_L1:
        if (!(drawable instanceof RoundedDrawable)) goto _L4; else goto _L3
_L3:
        drawable1 = drawable;
_L2:
        return drawable1;
_L4:
        if (drawable instanceof LayerDrawable)
        {
            drawable = (LayerDrawable)drawable;
            int j1 = drawable.getNumberOfLayers();
            int i1 = 0;
            do
            {
                drawable1 = drawable;
                if (i1 >= j1)
                {
                    continue; /* Loop/switch isn't completed */
                }
                drawable1 = drawable.getDrawable(i1);
                drawable.setDrawableByLayerId(drawable.getId(i1), a(drawable1));
                i1++;
            } while (true);
        }
        Bitmap bitmap = b(drawable);
        drawable1 = drawable;
        if (bitmap != null)
        {
            return new RoundedDrawable(bitmap);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public static RoundedDrawable a(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            return new RoundedDrawable(bitmap);
        } else
        {
            return null;
        }
    }

    private void a()
    {
        float f1 = 0.0F;
        class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[android.widget.ImageView.ScaleType.values().length];
                try
                {
                    a[android.widget.ImageView.ScaleType.CENTER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.FIT_END.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.FIT_START.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[s.ordinal()];
        JVM INSTR tableswitch 1 7: default 56
    //                   1 148
    //                   2 237
    //                   3 423
    //                   4 56
    //                   5 628
    //                   6 711
    //                   7 794;
           goto _L1 _L2 _L3 _L4 _L1 _L5 _L6 _L7
_L1:
        h.set(c);
        j.setRectToRect(c, a, android.graphics.Matrix.ScaleToFit.CENTER);
        j.mapRect(h);
        h.inset(q / 2.0F, q / 2.0F);
        j.setRectToRect(c, h, android.graphics.Matrix.ScaleToFit.FILL);
_L9:
        b.set(h);
        return;
_L2:
        h.set(a);
        h.inset(q / 2.0F, q / 2.0F);
        j.reset();
        j.setTranslate((int)((h.width() - (float)f) * 0.5F + 0.5F), (int)((h.height() - (float)g) * 0.5F + 0.5F));
        continue; /* Loop/switch isn't completed */
_L3:
        h.set(a);
        h.inset(q / 2.0F, q / 2.0F);
        j.reset();
        float f3;
        float f5;
        if ((float)f * h.height() > h.width() * (float)g)
        {
            f5 = h.height() / (float)g;
            f3 = (h.width() - (float)f * f5) * 0.5F;
        } else
        {
            f5 = h.width() / (float)f;
            f1 = h.height();
            float f7 = g;
            f3 = 0.0F;
            f1 = (f1 - f7 * f5) * 0.5F;
        }
        j.setScale(f5, f5);
        j.postTranslate((float)(int)(f3 + 0.5F) + q, (float)(int)(f1 + 0.5F) + q);
        continue; /* Loop/switch isn't completed */
_L4:
        j.reset();
        float f2;
        float f4;
        float f6;
        if ((float)f <= a.width() && (float)g <= a.height())
        {
            f2 = 1.0F;
        } else
        {
            f2 = Math.min(a.width() / (float)f, a.height() / (float)g);
        }
        f4 = (int)((a.width() - (float)f * f2) * 0.5F + 0.5F);
        f6 = (int)((a.height() - (float)g * f2) * 0.5F + 0.5F);
        j.setScale(f2, f2);
        j.postTranslate(f4, f6);
        h.set(c);
        j.mapRect(h);
        h.inset(q / 2.0F, q / 2.0F);
        j.setRectToRect(c, h, android.graphics.Matrix.ScaleToFit.FILL);
        continue; /* Loop/switch isn't completed */
_L5:
        h.set(c);
        j.setRectToRect(c, a, android.graphics.Matrix.ScaleToFit.END);
        j.mapRect(h);
        h.inset(q / 2.0F, q / 2.0F);
        j.setRectToRect(c, h, android.graphics.Matrix.ScaleToFit.FILL);
        continue; /* Loop/switch isn't completed */
_L6:
        h.set(c);
        j.setRectToRect(c, a, android.graphics.Matrix.ScaleToFit.START);
        j.mapRect(h);
        h.inset(q / 2.0F, q / 2.0F);
        j.setRectToRect(c, h, android.graphics.Matrix.ScaleToFit.FILL);
        continue; /* Loop/switch isn't completed */
_L7:
        h.set(a);
        h.inset(q / 2.0F, q / 2.0F);
        j.reset();
        j.setRectToRect(c, h, android.graphics.Matrix.ScaleToFit.FILL);
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static Bitmap b(Drawable drawable)
    {
        if (drawable instanceof BitmapDrawable)
        {
            return ((BitmapDrawable)drawable).getBitmap();
        }
        int i1 = Math.max(drawable.getIntrinsicWidth(), 2);
        int j1 = Math.max(drawable.getIntrinsicHeight(), 2);
        Bitmap bitmap;
        try
        {
            bitmap = Bitmap.createBitmap(i1, j1, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        }
        // Misplaced declaration of an exception variable
        catch (Drawable drawable)
        {
            drawable.printStackTrace();
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
        return bitmap;
    }

    public RoundedDrawable a(float f1)
    {
        o = f1;
        return this;
    }

    public RoundedDrawable a(ColorStateList colorstatelist)
    {
        if (colorstatelist == null)
        {
            colorstatelist = ColorStateList.valueOf(0);
        }
        r = colorstatelist;
        i.setColor(r.getColorForState(getState(), 0xff000000));
        return this;
    }

    public RoundedDrawable a(android.graphics.Shader.TileMode tilemode)
    {
        if (l != tilemode)
        {
            l = tilemode;
            n = true;
            invalidateSelf();
        }
        return this;
    }

    public RoundedDrawable a(android.widget.ImageView.ScaleType scaletype)
    {
        android.widget.ImageView.ScaleType scaletype1 = scaletype;
        if (scaletype == null)
        {
            scaletype1 = android.widget.ImageView.ScaleType.FIT_CENTER;
        }
        if (s != scaletype1)
        {
            s = scaletype1;
            a();
        }
        return this;
    }

    public RoundedDrawable a(boolean flag)
    {
        p = flag;
        return this;
    }

    public RoundedDrawable b(float f1)
    {
        q = f1;
        i.setStrokeWidth(q);
        return this;
    }

    public RoundedDrawable b(android.graphics.Shader.TileMode tilemode)
    {
        if (m != tilemode)
        {
            m = tilemode;
            n = true;
            invalidateSelf();
        }
        return this;
    }

    public void draw(Canvas canvas)
    {
        if (n)
        {
            k = new BitmapShader(d, l, m);
            if (l == android.graphics.Shader.TileMode.CLAMP && m == android.graphics.Shader.TileMode.CLAMP)
            {
                k.setLocalMatrix(j);
            }
            e.setShader(k);
            n = false;
        }
        if (p)
        {
            if (q > 0.0F)
            {
                canvas.drawOval(b, e);
                canvas.drawOval(h, i);
                return;
            } else
            {
                canvas.drawOval(b, e);
                return;
            }
        }
        if (q > 0.0F)
        {
            canvas.drawRoundRect(b, Math.max(o, 0.0F), Math.max(o, 0.0F), e);
            canvas.drawRoundRect(h, o, o, i);
            return;
        } else
        {
            canvas.drawRoundRect(b, o, o, e);
            return;
        }
    }

    public int getAlpha()
    {
        return e.getAlpha();
    }

    public ColorFilter getColorFilter()
    {
        return e.getColorFilter();
    }

    public int getIntrinsicHeight()
    {
        return g;
    }

    public int getIntrinsicWidth()
    {
        return f;
    }

    public int getOpacity()
    {
        return -3;
    }

    public boolean isStateful()
    {
        return r.isStateful();
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        a.set(rect);
        a();
    }

    protected boolean onStateChange(int ai[])
    {
        int i1 = r.getColorForState(ai, 0);
        if (i.getColor() != i1)
        {
            i.setColor(i1);
            return true;
        } else
        {
            return super.onStateChange(ai);
        }
    }

    public void setAlpha(int i1)
    {
        e.setAlpha(i1);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        e.setColorFilter(colorfilter);
        invalidateSelf();
    }

    public void setDither(boolean flag)
    {
        e.setDither(flag);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean flag)
    {
        e.setFilterBitmap(flag);
        invalidateSelf();
    }
}
