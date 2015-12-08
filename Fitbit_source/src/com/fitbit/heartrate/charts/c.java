// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.charts;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.NinePatchDrawable;
import com.artfulbits.aiCharts.Base.e;
import com.artfulbits.aiCharts.a.a;
import com.fitbit.util.ap;
import com.fitbit.util.fonts.FitbitFont;

// Referenced classes of package com.fitbit.heartrate.charts:
//            d

public class c extends a
{

    private static final int c = (int)ap.b(5F);
    private static final int d = (int)ap.b(4F);
    private final Paint e = new Paint(1);
    private final String f;
    private final boolean g;
    private final NinePatchDrawable h;
    private final NinePatchDrawable i;
    private NinePatchDrawable j;

    public c(Context context, String s, boolean flag)
    {
        h = (NinePatchDrawable)context.getResources().getDrawable(0x7f02039a);
        i = (NinePatchDrawable)context.getResources().getDrawable(0x7f020399);
        NinePatchDrawable ninepatchdrawable;
        if (flag)
        {
            ninepatchdrawable = h;
        } else
        {
            ninepatchdrawable = i;
        }
        j = ninepatchdrawable;
        g = flag;
        f = s;
        e.setTypeface(FitbitFont.g.a(context, Typeface.DEFAULT));
        e.setTextSize(ap.a(16F));
        e.setColor(-1);
        e.setTextAlign(android.graphics.Paint.Align.LEFT);
    }

    public static c a(Context context, String s, int k, int l, boolean flag)
    {
        s = new d(s, k);
        context = new c(context, String.valueOf(l), flag);
        context.a(((com.artfulbits.aiCharts.a.b) (s)));
        return context;
    }

    public void a(Canvas canvas, e e1)
    {
        int k = 1;
        int i1 = 0;
        Rect rect = new Rect();
        e.getTextBounds(f, 0, f.length(), rect);
        float f1 = e.measureText(f);
        float f2 = Math.abs(rect.top);
        Rect rect1 = new Rect();
        j.getPadding(rect1);
        int j1 = (int)(f1 + (float)rect1.left + (float)rect1.right + (float)(c * 2));
        int k1 = (int)((float)rect1.top + f2 + (float)rect1.bottom + (float)(d * 2));
        e1 = ((d)b()).a(e1);
        int l = (int)((PointF) (e1)).x;
        boolean flag = g;
        if (g)
        {
            if (canvas.getWidth() - l < j1)
            {
                k = 0;
            }
            if (k == 0)
            {
                j = i;
                j.getPadding(rect1);
                flag = false;
            }
        } else
        {
            k = i1;
            if (l >= j1)
            {
                k = 1;
            }
            if (k == 0)
            {
                j = h;
                j.getPadding(rect1);
                flag = true;
            }
        }
        if (!flag)
        {
            k = (int)(((PointF) (e1)).x - (float)j1);
        } else
        {
            k = l;
        }
        l = (int)((float)(rect1.top + d) + f2 / 2.0F);
        l = (int)((PointF) (e1)).y - l;
        j.setBounds(k, l, k + j1, l + k1);
        j.draw(canvas);
        i1 = rect1.left;
        j1 = c;
        l = (int)((float)(l + rect1.top + d) + f2);
        canvas.drawText(f, (k + i1 + j1) - rect.left, l, e);
    }

}
