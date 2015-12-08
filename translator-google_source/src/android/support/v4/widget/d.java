// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.drawable.shapes.OvalShape;

// Referenced classes of package android.support.v4.widget:
//            CircleImageView

final class d extends OvalShape
{

    final CircleImageView a;
    private RadialGradient b;
    private Paint c;
    private int d;

    public d(CircleImageView circleimageview, int i, int j)
    {
        a = circleimageview;
        super();
        c = new Paint();
        CircleImageView.a(circleimageview, i);
        d = j;
        float f = d / 2;
        float f1 = d / 2;
        float f2 = CircleImageView.a(circleimageview);
        circleimageview = android.graphics.Shader.TileMode.CLAMP;
        b = new RadialGradient(f, f1, f2, new int[] {
            0x3d000000, 0
        }, null, circleimageview);
        c.setShader(b);
    }

    public final void draw(Canvas canvas, Paint paint)
    {
        int i = a.getWidth();
        int j = a.getHeight();
        canvas.drawCircle(i / 2, j / 2, d / 2 + CircleImageView.a(a), c);
        canvas.drawCircle(i / 2, j / 2, d / 2, paint);
    }
}
