// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

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

// Referenced classes of package com.fitbit.ui.charts:
//            j

public class i extends a
{

    private static final int c = (int)ap.b(5F);
    private static final int d = (int)ap.b(4F);
    private final Paint e = new Paint(1);
    private final String f;
    private NinePatchDrawable g;
    private final Rect h = new Rect();
    private final Rect i = new Rect();

    public i(Context context, String s)
    {
        f = s;
        g = (NinePatchDrawable)context.getResources().getDrawable(0x7f020399);
        e.setTypeface(FitbitFont.h.a(context, Typeface.DEFAULT));
        e.setTextSize(ap.a(15F));
        e.setColor(-1);
        e.setTextAlign(android.graphics.Paint.Align.LEFT);
    }

    public static i a(Context context, String s, int k, int l, String s1)
    {
        s = new j(s, k, l);
        context = new i(context, s1);
        context.a(((com.artfulbits.aiCharts.a.b) (s)));
        return context;
    }

    public void a(Canvas canvas, e e1)
    {
        e.getTextBounds(f, 0, f.length(), h);
        float f1 = e.measureText(f);
        float f2 = Math.abs(h.top);
        g.getPadding(i);
        int i1 = (int)(f1 + (float)i.left + (float)i.right + (float)(c * 2));
        int j1 = (int)((float)i.top + f2 + (float)i.bottom + (float)(d * 2));
        e1 = ((j)b()).a(e1);
        int k = (int)((PointF) (e1)).x;
        int l = (int)((PointF) (e1)).y - i.top - (int)(f2 / 2.0F) - d;
        g.setBounds(k, l, i1 + k, j1 + l);
        g.draw(canvas);
        i1 = i.left;
        j1 = c;
        l = (int)((float)(l + i.top + d) + f2);
        canvas.drawText(f, (i1 + k + j1) - h.left, l, e);
    }

}
