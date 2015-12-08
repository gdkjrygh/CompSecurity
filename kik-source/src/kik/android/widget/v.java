// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public final class v extends Drawable
{

    protected Bitmap a;
    protected Bitmap b;
    private int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private long h;
    private final String i;
    private Paint j;
    private double k;

    public v()
    {
        this(null, null);
    }

    public v(Bitmap bitmap, String s)
    {
        c = 3;
        d = 1;
        e = 2;
        f = 3;
        g = 500;
        k = 0.0D;
        i = s;
        j = new Paint();
        j.setDither(true);
        j.setFilterBitmap(true);
        a = bitmap;
        c = 3;
        invalidateSelf();
    }

    public final boolean a()
    {
        return a == null;
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
            if (!a.isRecycled())
            {
                j.setAlpha(255);
                canvas.drawBitmap(a, null, getBounds(), j);
                return;
            }
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            h = System.currentTimeMillis();
            c = 2;
            if (b != null)
            {
                j.setAlpha(255);
                canvas.drawBitmap(b, null, getBounds(), j);
            }
            invalidateSelf();
            return;

        case 2: // '\002'
            d1 = (h + 500L) - System.currentTimeMillis();
            break;
        }
        if (d1 > 0.0D) goto _L4; else goto _L3
_L3:
        c = 3;
        j.setAlpha(255);
        if (a.isRecycled()) goto _L6; else goto _L5
_L5:
        canvas.drawBitmap(a, null, getBounds(), j);
_L7:
        invalidateSelf();
        return;
_L6:
        if (b != null)
        {
            j.setAlpha(255);
            canvas.drawBitmap(b, null, getBounds(), j);
        }
        if (true) goto _L7; else goto _L4
_L4:
        k = 1.0D - d1 / 500D;
        if (b != null)
        {
            j.setAlpha(255);
            canvas.drawBitmap(b, null, getBounds(), j);
        }
        j.setAlpha((int)(255D * k));
        if (a.isRecycled()) goto _L9; else goto _L8
_L8:
        canvas.drawBitmap(a, null, getBounds(), j);
_L11:
        invalidateSelf();
        return;
_L9:
        if (b != null)
        {
            j.setAlpha(255);
            canvas.drawBitmap(b, null, getBounds(), j);
        }
        if (true) goto _L11; else goto _L10
_L10:
        if (b == null) goto _L1; else goto _L12
_L12:
        j.setAlpha(255);
        canvas.drawBitmap(b, null, getBounds(), j);
        return;
    }

    public final int getIntrinsicHeight()
    {
        if (a == null || a.getHeight() == -1)
        {
            return 156;
        } else
        {
            return a.getHeight();
        }
    }

    public final int getIntrinsicWidth()
    {
        if (a == null || a.getWidth() == -1)
        {
            return 100;
        } else
        {
            return a.getWidth();
        }
    }

    public final int getMinimumHeight()
    {
        if (a == null)
        {
            return 156;
        } else
        {
            return a.getHeight();
        }
    }

    public final int getMinimumWidth()
    {
        if (a == null)
        {
            return 100;
        } else
        {
            return a.getWidth();
        }
    }

    public final int getOpacity()
    {
        return 0;
    }

    public final void setAlpha(int l)
    {
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }
}
