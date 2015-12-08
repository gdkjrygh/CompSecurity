// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.millennialmedia.android:
//            AdViewOverlayView

private static class paint extends Drawable
{

    protected boolean enabled;
    protected final Paint paint = new Paint();

    public void draw(Canvas canvas)
    {
        Rect rect = copyBounds();
        int i = rect.right - rect.left;
        int j = rect.bottom - rect.top;
        float f = (float)i / 6F;
        paint.setStrokeWidth(f);
        char c;
        if (enabled)
        {
            c = '\377';
        } else
        {
            c = 'P';
        }
        paint.setARGB(255, c, c, c);
        canvas.drawLine(f / 2.0F, f / 2.0F, (float)i - f / 2.0F, (float)j - f / 2.0F, paint);
        canvas.drawLine((float)i - f / 2.0F, f / 2.0F, f / 2.0F, (float)j - f / 2.0F, paint);
    }

    public int getOpacity()
    {
        return -3;
    }

    public void setAlpha(int i)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }

    A(boolean flag)
    {
        enabled = true;
        enabled = flag;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.seDrawable.paint);
    }
}
