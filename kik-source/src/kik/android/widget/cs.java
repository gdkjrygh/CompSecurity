// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

// Referenced classes of package kik.android.widget:
//            w

public final class cs extends w
{

    protected Bitmap a;
    protected Bitmap b;
    private int c;
    private final int d = 300;
    private long e;
    private final String f;
    private Paint g;
    private double h;
    private int i;
    private int j;

    public cs(Bitmap bitmap, String s)
    {
        c = 3;
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setAntiAlias(true);
        g = paint;
        h = 0.0D;
        i = 0;
        j = 0;
        f = s;
        a = bitmap;
        c = 3;
        a(bitmap);
        invalidateSelf();
    }

    private void a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            i = 0;
            j = 0;
            return;
        } else
        {
            i = bitmap.getHeight();
            j = bitmap.getWidth();
            return;
        }
    }

    public final void a(Bitmap bitmap, Bitmap bitmap1)
    {
        a = bitmap1;
        b = bitmap;
        c = 1;
        a(bitmap1);
        invalidateSelf();
    }

    public final void draw(Canvas canvas)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        double d1;
        switch (c)
        {
        default:
            g.setAlpha(255);
            if (!a.isRecycled())
            {
                canvas.drawBitmap(a, null, getBounds(), g);
                return;
            }
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            e = System.currentTimeMillis();
            c = 2;
            if (b != null)
            {
                g.setAlpha(255);
                canvas.drawBitmap(b, null, getBounds(), g);
            }
            invalidateSelf();
            return;

        case 2: // '\002'
            d1 = (e + 300L) - System.currentTimeMillis();
            break;
        }
        if (d1 > 0.0D) goto _L4; else goto _L3
_L3:
        c = 3;
        g.setAlpha(255);
        if (a.isRecycled()) goto _L6; else goto _L5
_L5:
        canvas.drawBitmap(a, null, getBounds(), g);
_L7:
        invalidateSelf();
        return;
_L6:
        if (b != null)
        {
            g.setAlpha(255);
            canvas.drawBitmap(b, null, getBounds(), g);
        }
        if (true) goto _L7; else goto _L4
_L4:
        h = 1.0D - d1 / 300D;
        if (b != null)
        {
            g.setAlpha(255);
            canvas.drawBitmap(b, null, getBounds(), g);
        }
        h = Math.sqrt(h);
        g.setAlpha((int)(255D * h));
        if (a.isRecycled()) goto _L9; else goto _L8
_L8:
        canvas.drawBitmap(a, null, getBounds(), g);
_L11:
        invalidateSelf();
        return;
_L9:
        if (b != null)
        {
            g.setAlpha(255);
            canvas.drawBitmap(b, null, getBounds(), g);
        }
        if (true) goto _L11; else goto _L10
_L10:
        if (b == null) goto _L1; else goto _L12
_L12:
        canvas.drawBitmap(b, null, getBounds(), g);
        return;
    }

    public final int getIntrinsicHeight()
    {
        return i;
    }

    public final int getIntrinsicWidth()
    {
        return j;
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final void setAlpha(int k)
    {
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }

    public final boolean setVisible(boolean flag, boolean flag1)
    {
        return super.setVisible(flag, flag1);
    }
}
