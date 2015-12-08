// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;

// Referenced classes of package kik.android.widget:
//            w

public class p extends w
{

    protected Bitmap a;
    protected Bitmap b;
    private int c;
    private final int d;
    private long e;
    private final String f;
    private Paint g;
    private double h;
    private int i;
    private int j;
    private BitmapShader k;
    private BitmapShader l;
    private Matrix m;

    public p(Bitmap bitmap)
    {
        this(bitmap, null);
    }

    public p(Bitmap bitmap, String s)
    {
        c = 3;
        d = 200;
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setAntiAlias(true);
        g = paint;
        h = 0.0D;
        i = 0;
        j = 0;
        m = new Matrix();
        f = s;
        a = bitmap;
        l = a(a);
        c = 3;
        b(bitmap);
        invalidateSelf();
    }

    private static BitmapShader a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return null;
        } else
        {
            return new BitmapShader(bitmap, android.graphics.Shader.TileMode.MIRROR, android.graphics.Shader.TileMode.MIRROR);
        }
    }

    private void b(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            i = 0;
            j = 0;
        } else
        {
            i = bitmap.getHeight();
            j = bitmap.getWidth();
        }
        if (b == null || k == null || i == 0 || j == 0)
        {
            return;
        } else
        {
            m.reset();
            m.setScale((float)j / (float)b.getWidth(), (float)i / (float)b.getHeight());
            k.setLocalMatrix(m);
            return;
        }
    }

    private void b(Canvas canvas, Paint paint)
    {
        canvas.drawCircle(getBounds().right / 2, getBounds().bottom / 2, getBounds().right / 2, paint);
    }

    public void a(Bitmap bitmap, Bitmap bitmap1)
    {
        a = bitmap1;
        b = bitmap;
        l = a(a);
        k = a(b);
        c = 1;
        b(bitmap1);
        invalidateSelf();
    }

    protected void a(Canvas canvas)
    {
    }

    protected void a(Canvas canvas, Paint paint)
    {
        b(canvas, paint);
    }

    protected void b(Canvas canvas)
    {
    }

    public void draw(Canvas canvas)
    {
        if (a == null)
        {
            a(canvas);
            return;
        }
        c;
        JVM INSTR tableswitch 1 2: default 40
    //                   1 82
    //                   2 145;
           goto _L1 _L2 _L3
_L1:
        g.setAlpha(255);
        if (!a.isRecycled())
        {
            g.setShader(l);
            a(canvas, g);
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        e = System.currentTimeMillis();
        c = 2;
        g.setAlpha(255);
        g.setShader(k);
        if (b != null)
        {
            b(canvas, g);
        } else
        {
            b(canvas);
        }
        invalidateSelf();
        return;
_L3:
        double d1 = (e + 200L) - System.currentTimeMillis();
        if (d1 <= 0.0D)
        {
            c = 3;
            g.setAlpha(255);
            if (!a.isRecycled())
            {
                g.setShader(l);
                a(canvas, g);
            } else
            if (b != null)
            {
                g.setShader(k);
                b(canvas, g);
            } else
            {
                b(canvas);
            }
            invalidateSelf();
            return;
        }
        h = Math.sqrt(1.0D - d1 / 200D);
        g.setAlpha((int)((1.0D - h) * 255D));
        g.setShader(k);
        if (b != null)
        {
            b(canvas, g);
        } else
        {
            b(canvas);
        }
        g.setAlpha((int)(h * 255D));
        if (a.isRecycled()) goto _L5; else goto _L4
_L4:
        g.setShader(l);
        a(canvas, g);
_L7:
        invalidateSelf();
        return;
_L5:
        if (b != null)
        {
            g.setAlpha(255);
            g.setShader(k);
            b(canvas, g);
        }
        if (true) goto _L7; else goto _L6
_L6:
        if (b != null)
        {
            g.setShader(k);
            b(canvas, g);
            return;
        } else
        {
            b(canvas);
            return;
        }
    }

    public int getIntrinsicHeight()
    {
        return i;
    }

    public int getIntrinsicWidth()
    {
        return j;
    }

    public int getOpacity()
    {
        return -3;
    }

    public void setAlpha(int i1)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }

    public boolean setVisible(boolean flag, boolean flag1)
    {
        return super.setVisible(flag, flag1);
    }
}
