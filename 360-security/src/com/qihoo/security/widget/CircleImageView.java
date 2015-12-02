// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.content.Context;
import android.content.res.Resources;
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

public class CircleImageView extends ImageView
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
    private android.graphics.Paint.Style j;
    private Bitmap k;
    private BitmapShader l;
    private int m;
    private int n;
    private float o;
    private float p;
    private ColorFilter q;
    private boolean r;
    private boolean s;
    private boolean t;

    public CircleImageView(Context context)
    {
        super(context);
        c = new RectF();
        d = new RectF();
        e = new Matrix();
        f = new Paint();
        g = new Paint();
        h = 0xff000000;
        i = 0;
        j = android.graphics.Paint.Style.FILL;
        a();
    }

    public CircleImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        c = new RectF();
        d = new RectF();
        e = new Matrix();
        f = new Paint();
        g = new Paint();
        h = 0xff000000;
        i = 0;
        j = android.graphics.Paint.Style.FILL;
        attributeset = context.obtainStyledAttributes(attributeset, com.qihoo.security.lite.a.a.CircleImageView, i1, 0);
        i = attributeset.getDimensionPixelSize(0, 0);
        h = attributeset.getColor(1, 0xff000000);
        t = attributeset.getBoolean(3, false);
        if (attributeset.getInt(2, 0) == 0)
        {
            context = android.graphics.Paint.Style.FILL;
        } else
        {
            context = android.graphics.Paint.Style.STROKE;
        }
        j = context;
        attributeset.recycle();
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
        r = true;
        if (s)
        {
            b();
            s = false;
        }
    }

    private void b()
    {
        if (!r)
        {
            s = true;
        } else
        if (k != null)
        {
            l = new BitmapShader(k, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
            f.setAntiAlias(true);
            f.setShader(l);
            g.setStyle(j);
            g.setAntiAlias(true);
            g.setColor(h);
            g.setStrokeWidth(i);
            n = k.getHeight();
            m = k.getWidth();
            d.set(0.0F, 0.0F, getWidth(), getHeight());
            p = Math.min((d.height() - (float)i) / 2.0F, (d.width() - (float)i) / 2.0F);
            c.set(d);
            if (!t)
            {
                c.inset(i, i);
            }
            o = Math.min(c.height() / 2.0F, c.width() / 2.0F);
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
        if ((float)m * c.height() > c.width() * (float)n)
        {
            f3 = c.height() / (float)n;
            f2 = (c.width() - (float)m * f3) * 0.5F;
        } else
        {
            f3 = c.width() / (float)m;
            f1 = c.height();
            float f4 = n;
            f2 = 0.0F;
            f1 = (f1 - f4 * f3) * 0.5F;
        }
        if (a.equals(android.widget.ImageView.ScaleType.CENTER_INSIDE))
        {
            e.setScale(1.0F, 1.0F);
            e.postTranslate((c.width() - (float)m) / 2.0F + c.left, (c.height() - (float)n) / 2.0F + c.top);
        } else
        {
            e.setScale(f3, f3);
            e.postTranslate((float)(int)(f2 + 0.5F) + c.left, (float)(int)(f1 + 0.5F) + c.top);
        }
        l.setLocalMatrix(e);
    }

    public int getBorderColor()
    {
        return h;
    }

    public android.graphics.Paint.Style getBorderStyle()
    {
        return j;
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
        if (getDrawable() == null)
        {
            return;
        }
        if (i != 0)
        {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, p, g);
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, o, f);
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

    public void setBorderColorResource(int i1)
    {
        setBorderColor(getContext().getResources().getColor(i1));
    }

    public void setBorderOverlay(boolean flag)
    {
        if (flag == t)
        {
            return;
        } else
        {
            t = flag;
            b();
            return;
        }
    }

    public void setBorderStyle(android.graphics.Paint.Style style)
    {
        if (style.equals(j))
        {
            return;
        } else
        {
            j = style;
            b();
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
        if (colorfilter == q)
        {
            return;
        } else
        {
            q = colorfilter;
            f.setColorFilter(q);
            invalidate();
            return;
        }
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        super.setImageBitmap(bitmap);
        k = bitmap;
        b();
    }

    public void setImageDrawable(Drawable drawable)
    {
        super.setImageDrawable(drawable);
        k = a(drawable);
        b();
    }

    public void setImageResource(int i1)
    {
        super.setImageResource(i1);
        k = a(getDrawable());
        b();
    }

    public void setImageURI(Uri uri)
    {
        super.setImageURI(uri);
        k = a(getDrawable());
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
        a = android.widget.ImageView.ScaleType.CENTER_INSIDE;
        b = android.graphics.Bitmap.Config.ARGB_8888;
    }
}
