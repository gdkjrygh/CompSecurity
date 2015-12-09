// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.jcp.d;

public class CircularImageView extends ImageView
{

    private static final android.widget.ImageView.ScaleType a;
    private static final android.graphics.Bitmap.Config b;
    private final RectF c;
    private final RectF d;
    private final Matrix e;
    private final Paint f;
    private final Paint g;
    private int h;
    private int i;
    private Bitmap j;
    private BitmapShader k;
    private int l;
    private int m;
    private float n;
    private float o;
    private ColorFilter p;
    private boolean q;
    private boolean r;

    public CircularImageView(Context context)
    {
        super(context);
        c = new RectF();
        d = new RectF();
        e = new Matrix();
        f = new Paint();
        g = new Paint();
        h = 0xff000000;
        i = 0;
        a();
    }

    public CircularImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
        a();
    }

    public CircularImageView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        c = new RectF();
        d = new RectF();
        e = new Matrix();
        f = new Paint();
        g = new Paint();
        h = 0xff000000;
        i = 0;
        context = context.obtainStyledAttributes(attributeset, d.CircleImageView, i1, 0);
        i = context.getDimensionPixelSize(0, 0);
        h = context.getColor(1, 0xff000000);
        context.recycle();
        a();
    }

    private Bitmap a(Drawable drawable)
    {
        if (drawable == null)
        {
            return null;
        }
        if (drawable instanceof BitmapDrawable)
        {
            return ((BitmapDrawable)drawable).getBitmap();
        }
        Bitmap bitmap;
        if (!(drawable instanceof ColorDrawable))
        {
            break MISSING_BLOCK_LABEL_67;
        }
        bitmap = Bitmap.createBitmap(2, 2, b);
_L1:
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmap;
        try
        {
            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), b);
        }
        // Misplaced declaration of an exception variable
        catch (Drawable drawable)
        {
            return null;
        }
          goto _L1
    }

    private void a()
    {
        super.setScaleType(a);
        q = true;
        if (r)
        {
            b();
            r = false;
        }
    }

    private void b()
    {
        if (!q)
        {
            r = true;
        } else
        if (j != null)
        {
            k = new BitmapShader(j, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
            f.setAntiAlias(true);
            f.setShader(k);
            g.setStyle(android.graphics.Paint.Style.STROKE);
            g.setAntiAlias(true);
            g.setColor(h);
            g.setStrokeWidth(i);
            m = j.getHeight();
            l = j.getWidth();
            d.set(0.0F, 0.0F, getWidth(), getHeight());
            o = Math.min((d.height() - (float)i) / 2.0F, (d.width() - (float)i) / 2.0F);
            c.set(i, i, d.width() - (float)i, d.height() - (float)i);
            n = Math.min(c.height() / 2.0F, c.width() / 2.0F);
            c();
            invalidate();
            return;
        }
    }

    private void c()
    {
        float f1 = 0.0F;
        e.set(null);
        float f2;
        float f3;
        if ((float)l * c.height() > c.width() * (float)m)
        {
            f3 = c.height() / (float)m;
            f2 = (c.width() - (float)l * f3) * 0.5F;
        } else
        {
            f3 = c.width() / (float)l;
            f1 = c.height();
            float f4 = m;
            f2 = 0.0F;
            f1 = (f1 - f4 * f3) * 0.5F;
        }
        e.setScale(f3, f3);
        e.postTranslate((int)(f2 + 0.5F) + i, (int)(f1 + 0.5F) + i);
        k.setLocalMatrix(e);
    }

    public int getBorderColor()
    {
        return h;
    }

    public int getBorderWidth()
    {
        return i;
    }

    public android.widget.ImageView.ScaleType getScaleType()
    {
        return a;
    }

    protected void onDraw(Canvas canvas)
    {
        if (getDrawable() != null)
        {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, n, f);
            if (i != 0)
            {
                canvas.drawCircle(getWidth() / 2, getHeight() / 2, o, g);
                return;
            }
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        b();
    }

    public void setAdjustViewBounds(boolean flag)
    {
        if (flag)
        {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        } else
        {
            return;
        }
    }

    public void setBorderColor(int i1)
    {
        if (i1 == h)
        {
            return;
        } else
        {
            h = i1;
            g.setColor(h);
            invalidate();
            return;
        }
    }

    public void setBorderWidth(int i1)
    {
        if (i1 == i)
        {
            return;
        } else
        {
            i = i1;
            b();
            return;
        }
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        if (colorfilter == p)
        {
            return;
        } else
        {
            p = colorfilter;
            f.setColorFilter(p);
            invalidate();
            return;
        }
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        super.setImageBitmap(bitmap);
        j = bitmap;
        b();
    }

    public void setImageDrawable(Drawable drawable)
    {
        super.setImageDrawable(drawable);
        j = a(drawable);
        b();
    }

    public void setImageResource(int i1)
    {
        super.setImageResource(i1);
        j = a(getDrawable());
        b();
    }

    public void setImageURI(Uri uri)
    {
        super.setImageURI(uri);
        j = a(getDrawable());
        b();
    }

    public void setScaleType(android.widget.ImageView.ScaleType scaletype)
    {
        if (scaletype != a)
        {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[] {
                scaletype
            }));
        } else
        {
            return;
        }
    }

    static 
    {
        a = android.widget.ImageView.ScaleType.CENTER_CROP;
        b = android.graphics.Bitmap.Config.ARGB_8888;
    }
}
