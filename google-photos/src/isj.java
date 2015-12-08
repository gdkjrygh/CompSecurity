// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;

public final class isj extends View
    implements oiz
{

    Paint a;
    Paint b;
    Paint c;
    private Path d;
    private Path e;

    public isj(Context context)
    {
        this(context, null);
    }

    private isj(Context context, AttributeSet attributeset)
    {
        this(context, null, 0);
    }

    private isj(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, 0);
        d = new Path();
        e = new Path();
        a = new Paint(1);
        b = new Paint(1);
        c = new Paint(1);
        a.setStyle(android.graphics.Paint.Style.STROKE);
        a.setStrokeWidth(getResources().getDimension(b.Ac));
        b.setStyle(android.graphics.Paint.Style.STROKE);
        b.setStrokeWidth(getResources().getDimension(b.Ad));
        c.setStyle(android.graphics.Paint.Style.FILL);
    }

    private static PointF a(float f, float f1, float f2)
    {
        f2 = 180F + f2;
        return new PointF((float)((double)f + Math.sin(Math.toRadians(-f2)) * (double)f1), (float)((double)f + Math.cos(Math.toRadians(-f2)) * (double)f1));
    }

    public final void ax_()
    {
    }

    public final void onDraw(Canvas canvas)
    {
        canvas.drawPath(d, c);
        canvas.drawPath(d, a);
        canvas.drawPath(e, b);
    }

    public final void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        float f = (float)Math.min(getMeasuredWidth(), getMeasuredHeight()) / 2.0F;
        float f1 = f - a.getStrokeWidth() / 2.0F;
        d.addCircle(f, f, f1, android.graphics.Path.Direction.CW);
        PointF pointf = a(f, 0.5F * f1, 90F);
        PointF pointf1 = a(f, f1 * 0.74F, 0.0F);
        e.moveTo(pointf1.x, pointf1.y);
        e.lineTo(f, f);
        e.lineTo(pointf.x, pointf.y);
    }
}
