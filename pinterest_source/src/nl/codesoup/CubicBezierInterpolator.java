// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package nl.codesoup;

import android.graphics.PointF;
import android.view.animation.Interpolator;

public class CubicBezierInterpolator
    implements Interpolator
{

    protected PointF a;
    protected PointF b;
    protected PointF c;
    protected PointF d;
    protected PointF e;

    public CubicBezierInterpolator(float f)
    {
        this(new PointF(0.0F, 0.55F), new PointF(f, 1.0F));
    }

    private CubicBezierInterpolator(PointF pointf, PointF pointf1)
    {
        c = new PointF();
        d = new PointF();
        e = new PointF();
        if (pointf.x < 0.0F || pointf.x > 1.0F)
        {
            throw new IllegalArgumentException("startX value must be in the range [0, 1]");
        }
        if (pointf1.x < 0.0F || pointf1.x > 1.0F)
        {
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        } else
        {
            a = pointf;
            b = pointf1;
            return;
        }
    }

    public float getInterpolation(float f)
    {
        int i = 1;
        float f1 = f;
        do
        {
            if (i >= 14)
            {
                break;
            }
            e.x = a.x * 3F;
            d.x = (b.x - a.x) * 3F - e.x;
            c.x = 1.0F - e.x - d.x;
            float f2 = (e.x + (d.x + c.x * f1) * f1) * f1 - f;
            if ((double)Math.abs(f2) < 0.001D)
            {
                break;
            }
            f1 -= f2 / (e.x + (2.0F * d.x + c.x * 3F * f1) * f1);
            i++;
        } while (true);
        e.y = a.y * 3F;
        d.y = (b.y - a.y) * 3F - e.y;
        c.y = 1.0F - e.y - d.y;
        return (e.y + (d.y + c.y * f1) * f1) * f1;
    }
}
