// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

public class ako
{

    public final PointF a;
    public final PointF b;
    public final PointF c;
    public final PointF d;

    public ako(float f, float f1, float f2, float f3, float f4, float f5, float f6, 
            float f7)
    {
        a = new PointF(f, f1);
        b = new PointF(f2, f3);
        c = new PointF(f4, f5);
        d = new PointF(f6, f7);
    }

    public ako(PointF pointf, PointF pointf1, PointF pointf2, PointF pointf3)
    {
        a = pointf;
        b = pointf1;
        c = pointf2;
        d = pointf3;
    }

    public static ako a(float f, float f1, float f2, float f3)
    {
        return new ako(new PointF(0.0F, 0.0F), new PointF(f2 + 0.0F, 0.0F), new PointF(0.0F, f3 + 0.0F), new PointF(f2 + 0.0F, 0.0F + f3));
    }

    public static ako a(PointF pointf, PointF pointf1, float f)
    {
        PointF pointf2 = new PointF(pointf1.x - pointf.x, pointf1.y - pointf.y);
        float f1 = pointf2.length();
        pointf2 = new PointF((pointf2.y / f1) * f, (pointf2.x / f1) * f);
        PointF pointf3 = new PointF(pointf.x - pointf2.x, pointf.y + pointf2.y);
        f = pointf1.x;
        f1 = pointf2.x;
        float f2 = pointf1.y;
        return new ako(pointf, pointf1, pointf3, new PointF(f - f1, pointf2.y + f2));
    }

    public static ako a(RectF rectf)
    {
        return new ako(new PointF(rectf.left, rectf.top), new PointF(rectf.right, rectf.top), new PointF(rectf.left, rectf.bottom), new PointF(rectf.right, rectf.bottom));
    }

    public static Matrix a(ako ako1, ako ako2)
    {
        Matrix matrix = new Matrix();
        matrix.setPolyToPoly(ako1.b(), 0, ako2.b(), 0, 3);
        return matrix;
    }

    public static PointF a(PointF pointf, PointF pointf1, float f, float f1)
    {
        return new PointF(((pointf.x - pointf1.x) * f - (pointf.y - pointf1.y) * f1) + pointf1.x, (pointf.x - pointf1.x) * f1 + (pointf.y - pointf1.y) * f + pointf1.y);
    }

    public final ako a(float f)
    {
        PointF pointf = a();
        float f1 = a.x;
        float f2 = pointf.x;
        float f3 = pointf.x;
        float f4 = a.y;
        float f5 = pointf.y;
        float f6 = pointf.y;
        float f7 = b.x;
        float f8 = pointf.x;
        float f9 = pointf.x;
        float f10 = b.y;
        float f11 = pointf.y;
        float f12 = pointf.y;
        float f13 = c.x;
        float f14 = pointf.x;
        float f15 = pointf.x;
        float f16 = c.y;
        float f17 = pointf.y;
        float f18 = pointf.y;
        float f19 = d.x;
        float f20 = pointf.x;
        float f21 = pointf.x;
        float f22 = d.y;
        float f23 = pointf.y;
        return new ako((f1 - f2) * f + f3, (f4 - f5) * f + f6, (f7 - f8) * f + f9, (f10 - f11) * f + f12, (f13 - f14) * f + f15, (f16 - f17) * f + f18, (f19 - f20) * f + f21, pointf.y + (f22 - f23) * f);
    }

    public final PointF a()
    {
        return new PointF((a.x + d.x) / 2.0F, (a.y + d.y) / 2.0F);
    }

    public final float[] b()
    {
        return (new float[] {
            a.x, a.y, b.x, b.y, c.x, c.y, d.x, d.y
        });
    }

    public final PointF c()
    {
        return new PointF(b.x - a.x, b.y - a.y);
    }

    public final PointF d()
    {
        return new PointF(c.x - a.x, c.y - a.y);
    }

    public String toString()
    {
        float f = a.x;
        float f1 = a.y;
        float f2 = b.x;
        float f3 = b.y;
        float f4 = c.x;
        float f5 = c.y;
        float f6 = d.x;
        float f7 = d.y;
        return (new StringBuilder(140)).append("Quad(").append(f).append(", ").append(f1).append(", ").append(f2).append(", ").append(f3).append(", ").append(f4).append(", ").append(f5).append(", ").append(f6).append(", ").append(f7).append(")").toString();
    }
}
