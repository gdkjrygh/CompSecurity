// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.fitbit.util.fonts.FitbitFont;

// Referenced classes of package com.fitbit.runtrack.ui:
//            RecentSummary

private static class ion extends Drawable
{

    private final Paint a = new Paint();
    private final Paint b = new Paint();
    private final String c;
    private final String d;
    private final String e;
    private int f;
    private int g;
    private int h;

    public void draw(Canvas canvas)
    {
        canvas.drawText(c, 0.0F, f, a);
        canvas.drawText(d, 0.0F, g, b);
        canvas.drawText(e, 0.0F, h, b);
    }

    public int getOpacity()
    {
        return -3;
    }

    protected void onBoundsChange(Rect rect)
    {
        rect = new Rect();
        a.getTextBounds(c, 0, c.length(), rect);
        g = f * 2 + rect.height();
        b.getTextBounds(d, 0, d.length(), rect);
        int i = g;
        h = rect.height() + i + f;
    }

    public void setAlpha(int i)
    {
        a.setAlpha(i);
        b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        a.setColorFilter(colorfilter);
        b.setColorFilter(colorfilter);
    }

    public (Context context, String s, String s1, String s2, boolean flag)
    {
        a.setTextSize(context.getResources().getDimension(0x7f0a00b4));
        b.setTextSize(context.getResources().getDimension(0x7f0a00b3));
        a.setColor(context.getResources().getColor(0x7f0f007a));
        b.setColor(0xff000000);
        a.setAntiAlias(true);
        b.setAntiAlias(true);
        a.setTextAlign(android.graphics.ER);
        b.setTextAlign(android.graphics.ER);
        if (flag)
        {
            a.setColor(0xff000000);
            a.setTypeface(FitbitFont.g.a(context, Typeface.DEFAULT));
            b.setTypeface(FitbitFont.g.a(context, Typeface.DEFAULT));
        } else
        {
            a.setTypeface(FitbitFont.h.a(context, Typeface.DEFAULT));
            b.setTypeface(FitbitFont.h.a(context, Typeface.DEFAULT));
        }
        c = s;
        d = s1;
        e = s2;
        f = (int)context.getResources().getDimension(0x7f0a00b8);
    }
}
