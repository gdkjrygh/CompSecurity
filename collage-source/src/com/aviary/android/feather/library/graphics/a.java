// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.graphics;

import android.graphics.PointF;
import android.graphics.RectF;

public class a
{

    public a()
    {
    }

    public static double a(double d)
    {
        if (d < 0.0D)
        {
            return d % -360D + 360D;
        } else
        {
            return d % 360D;
        }
    }

    public static double a(float f, float f1, float f2, float f3)
    {
        return Math.sqrt(Math.pow(f - f2, 2D) + Math.pow(f1 - f3, 2D));
    }

    public static double a(float f, float f1, float f2, float f3, float f4)
    {
        if (f == f2 && f1 == f3)
        {
            return 0.0D;
        }
        double d = Math.atan2(f - f2, f1 - f3);
        if (f4 > 0.0F)
        {
            return (double)((float)Math.round(d / (double)f4) * f4);
        } else
        {
            return a(b(d));
        }
    }

    public static double a(PointF pointf, PointF pointf1)
    {
        return a(pointf, pointf1, 0.0F);
    }

    public static double a(PointF pointf, PointF pointf1, float f)
    {
        return a(pointf.x, pointf.y, pointf1.x, pointf1.y, f);
    }

    public static double a(RectF rectf)
    {
        return Math.sqrt(Math.pow(rectf.right - rectf.left, 2D) + Math.pow(rectf.bottom - rectf.top, 2D));
    }

    public static double a(float af[], float af1[])
    {
        return a(af[0], af[1], af1[0], af1[1], 0.0F);
    }

    public static PointF a(PointF apointf[], PointF apointf1[])
    {
        float f = apointf[0].x;
        float f1 = apointf[0].y;
        float f2 = apointf[1].x;
        float f3 = apointf[1].y;
        float f4 = apointf1[0].x;
        float f5 = apointf1[0].y;
        float f6 = apointf1[1].x;
        float f7 = apointf1[1].y;
        return new PointF(((f * f3 - f1 * f2) * (f4 - f6) - (f - f2) * (f4 * f7 - f5 * f6)) / ((f - f2) * (f5 - f7) - (f1 - f3) * (f4 - f6)), ((f * f3 - f1 * f2) * (f5 - f7) - (f1 - f3) * (f4 * f7 - f5 * f6)) / ((f - f2) * (f5 - f7) - (f1 - f3) * (f4 - f6)));
    }

    public static void a(PointF pointf, double d)
    {
        float f = pointf.x;
        float f1 = pointf.y;
        double d1 = Math.cos(d);
        d = Math.sin(d);
        pointf.x = (float)((double)f * d1 - (double)f1 * d);
        double d2 = f;
        pointf.y = (float)((double)f1 * d1 + d * d2);
    }

    public static void a(PointF pointf, float f, float f1)
    {
        pointf.x = pointf.x + f;
        pointf.y = pointf.y + f1;
    }

    public static void a(PointF pointf, PointF pointf1, float f, PointF pointf2)
    {
        pointf2.set(pointf.x + (pointf1.x - pointf.x) * f, pointf.y + (pointf1.y - pointf.y) * f);
    }

    public static void a(RectF rectf, float f, float f1)
    {
        rectf.left = rectf.left - f / 2.0F;
        rectf.top = rectf.top - f1 / 2.0F;
        rectf.right = rectf.right + f / 2.0F;
        rectf.bottom = rectf.bottom + f1 / 2.0F;
    }

    public static void a(PointF apointf[], double d)
    {
        for (int i = 0; i < apointf.length; i++)
        {
            a(apointf[i], d);
        }

    }

    public static void a(PointF apointf[], float f, float f1)
    {
        for (int i = 0; i < apointf.length; i++)
        {
            a(apointf[i], f, f1);
        }

    }

    public static double b(double d)
    {
        return 57.295779513082323D * d;
    }

    public static double b(PointF pointf, PointF pointf1)
    {
        return a(pointf.x, pointf.y, pointf1.x, pointf1.y);
    }

    public static double b(float af[], float af1[])
    {
        return a(af[0], af[1], af1[0], af1[1]);
    }

    public static double c(double d)
    {
        return 0.017453292519943295D * d;
    }
}
