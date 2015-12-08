// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.drawable.shapes.OvalShape;

// Referenced classes of package android.support.v4.widget:
//            a

private class b extends OvalShape
{

    final a a;
    private RadialGradient b;
    private Paint c;
    private int d;

    public void draw(Canvas canvas, Paint paint)
    {
        int i = a.getWidth();
        int j = a.getHeight();
        canvas.drawCircle(i / 2, j / 2, d / 2 + android.support.v4.widget.a.a(a), c);
        canvas.drawCircle(i / 2, j / 2, d / 2, paint);
    }

    public de(a a1, int i, int j)
    {
        a = a1;
        super();
        c = new Paint();
        android.support.v4.widget.a.a(a1, i);
        d = j;
        float f = d / 2;
        float f1 = d / 2;
        float f2 = android.support.v4.widget.a.a(a1);
        a1 = android.graphics.er.TileMode.CLAMP;
        b = new RadialGradient(f, f1, f2, new int[] {
            0x3d000000, 0
        }, null, a1);
        c.setShader(b);
    }
}
