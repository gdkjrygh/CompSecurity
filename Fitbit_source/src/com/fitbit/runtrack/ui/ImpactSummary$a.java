// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ImpactSummary

private static class e extends ShapeDrawable
{

    int a[];
    int b;
    float c;
    final float d;
    final Paint e = new Paint();

    public void a(int i, float f)
    {
        c = f;
        b = i;
    }

    public transient void a(int ai[])
    {
        a = ai;
    }

    public void draw(Canvas canvas)
    {
        Rect rect = getBounds();
        e.setStyle(android.graphics.KE);
        e.setStrokeWidth(c);
        e.setColor(b);
        float f = (float)rect.width() / 2.1F;
        canvas.drawCircle(rect.centerX(), rect.centerY(), f, e);
        e.setStyle(android.graphics.);
        f = (Math.min(d, getLevel()) / d) * f;
        float f1 = f / (float)a.length;
        int ai[] = a;
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            int k = ai[i];
            e.setColor(k);
            canvas.drawCircle(rect.centerX(), rect.centerY(), f, e);
            f -= f1;
            e.setStyle(android.graphics._AND_STROKE);
        }

    }

    public (int i)
    {
        d = i;
        e.setAntiAlias(true);
    }
}
