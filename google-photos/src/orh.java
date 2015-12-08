// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

final class orh extends Drawable
{

    final Paint a = new Paint();
    String b;
    int c;
    boolean d;
    private final int e;
    private final Paint f = new Paint(1);
    private android.graphics.Paint.FontMetricsInt g;
    private final RectF h = new RectF();

    public orh(Context context, float f1, int i, int j)
    {
        b = "";
        context = context.getResources();
        f.setColor(i);
        a.setColor(j);
        a.setTextAlign(android.graphics.Paint.Align.LEFT);
        a.setTextSize(context.getDimension(b.Iw) * f1);
        g = a.getFontMetricsInt();
        e = (int)(context.getDimension(b.Ix) * f1);
    }

    public final void draw(Canvas canvas)
    {
        Rect rect = getBounds();
        int i = rect.width();
        int j = rect.height();
        int k = j / 2;
        canvas.translate(rect.left, rect.top);
        h.set(0.0F, 0.0F, i, j);
        canvas.drawRoundRect(h, k, k, f);
        h.top = k;
        if (d)
        {
            h.right = h.left + (float)k;
        } else
        {
            h.left = h.right - (float)k;
        }
        canvas.drawRect(h, f);
        canvas.drawText(b, e, (e + g.leading) - g.ascent, a);
    }

    public final int getAlpha()
    {
        return a.getAlpha();
    }

    public final int getIntrinsicHeight()
    {
        return ((e * 2 + g.leading) - g.ascent) + g.descent;
    }

    public final int getIntrinsicWidth()
    {
        return e * 2 + c;
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final void setAlpha(int i)
    {
        a.setAlpha(i);
        f.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }
}
