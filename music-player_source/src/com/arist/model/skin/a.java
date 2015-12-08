// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.skin;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class a extends Drawable
{

    private int a;
    private Paint b;
    private Paint c;
    private Paint d;
    private int e;
    private int f;
    private Bitmap g;

    public a(int i)
    {
        a = 10;
        b = new Paint();
        c = new Paint();
        d = new Paint();
        a = i;
        c.setColor(-1);
        d.setColor(0xffcbcbcb);
    }

    public final void draw(Canvas canvas)
    {
        canvas.drawBitmap(g, null, getBounds(), b);
    }

    public final int getOpacity()
    {
        return 0;
    }

    protected final void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        int i = rect.height();
        e = (int)Math.ceil(rect.width() / a);
        f = (int)Math.ceil(i / a);
        if (getBounds().width() > 0 && getBounds().height() > 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Canvas canvas;
        Rect rect1;
        boolean flag;
        int j;
        g = Bitmap.createBitmap(getBounds().width(), getBounds().height(), android.graphics.Bitmap.Config.ARGB_8888);
        canvas = new Canvas(g);
        rect1 = new Rect();
        j = 0;
        flag = true;
_L4:
        if (j > f) goto _L1; else goto _L3
_L3:
        boolean flag1;
        int k;
        k = 0;
        flag1 = flag;
_L5:
label0:
        {
            if (k <= e)
            {
                break label0;
            }
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            j++;
        }
          goto _L4
          goto _L1
        rect1.top = a * j;
        rect1.left = a * k;
        rect1.bottom = rect1.top + a;
        rect1.right = rect1.left + a;
        if (flag1)
        {
            rect = c;
        } else
        {
            rect = d;
        }
        canvas.drawRect(rect1, rect);
        if (flag1)
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        k++;
          goto _L5
    }

    public final void setAlpha(int i)
    {
        throw new UnsupportedOperationException("Alpha is not supported by this drawwable.");
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        throw new UnsupportedOperationException("ColorFilter is not supported by this drawwable.");
    }
}
