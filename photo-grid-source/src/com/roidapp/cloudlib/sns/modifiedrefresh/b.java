// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.modifiedrefresh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.drawable.shapes.OvalShape;

// Referenced classes of package com.roidapp.cloudlib.sns.modifiedrefresh:
//            a

final class b extends OvalShape
{

    final a a;
    private RadialGradient b;
    private Paint c;
    private int d;

    public b(a a1, int i, int j)
    {
        a = a1;
        super();
        c = new Paint();
        com.roidapp.cloudlib.sns.modifiedrefresh.a.a(a1, i);
        d = j;
        float f = d / 2;
        float f1 = d / 2;
        float f2 = com.roidapp.cloudlib.sns.modifiedrefresh.a.a(a1);
        a1 = android.graphics.Shader.TileMode.CLAMP;
        b = new RadialGradient(f, f1, f2, new int[] {
            0x3d000000, 0
        }, null, a1);
        c.setShader(b);
    }

    public final void draw(Canvas canvas, Paint paint)
    {
        int i = a.getWidth();
        int j = a.getHeight();
        canvas.drawCircle(i / 2, j / 2, d / 2 + com.roidapp.cloudlib.sns.modifiedrefresh.a.a(a), c);
        canvas.drawCircle(i / 2, j / 2, d / 2, paint);
    }
}
