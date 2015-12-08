// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;

import com.google.zxing.common.detector.MathUtils;

public class ResultPoint
{

    private final float x;
    private final float y;

    public ResultPoint(float f, float f1)
    {
        x = f;
        y = f1;
    }

    private static float crossProductZ(ResultPoint resultpoint, ResultPoint resultpoint1, ResultPoint resultpoint2)
    {
        float f = resultpoint1.x;
        float f1 = resultpoint1.y;
        float f2 = resultpoint2.x;
        float f3 = resultpoint.y;
        float f4 = resultpoint2.y;
        return (f2 - f) * (f3 - f1) - (resultpoint.x - f) * (f4 - f1);
    }

    public static float distance(ResultPoint resultpoint, ResultPoint resultpoint1)
    {
        return MathUtils.distance(resultpoint.x, resultpoint.y, resultpoint1.x, resultpoint1.y);
    }

    public static void orderBestPatterns(ResultPoint aresultpoint[])
    {
        float f = distance(aresultpoint[0], aresultpoint[1]);
        float f1 = distance(aresultpoint[1], aresultpoint[2]);
        float f2 = distance(aresultpoint[0], aresultpoint[2]);
        ResultPoint resultpoint;
        ResultPoint resultpoint1;
        ResultPoint resultpoint2;
        if (f1 >= f && f1 >= f2)
        {
            resultpoint2 = aresultpoint[0];
            resultpoint1 = aresultpoint[1];
            resultpoint = aresultpoint[2];
        } else
        if (f2 >= f1 && f2 >= f)
        {
            resultpoint2 = aresultpoint[1];
            resultpoint1 = aresultpoint[0];
            resultpoint = aresultpoint[2];
        } else
        {
            resultpoint2 = aresultpoint[2];
            resultpoint1 = aresultpoint[0];
            resultpoint = aresultpoint[1];
        }
        if (crossProductZ(resultpoint1, resultpoint2, resultpoint) >= 0.0F)
        {
            ResultPoint resultpoint3 = resultpoint;
            resultpoint = resultpoint1;
            resultpoint1 = resultpoint3;
        }
        aresultpoint[0] = resultpoint;
        aresultpoint[1] = resultpoint2;
        aresultpoint[2] = resultpoint1;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ResultPoint)
        {
            obj = (ResultPoint)obj;
            flag = flag1;
            if (x == ((ResultPoint) (obj)).x)
            {
                flag = flag1;
                if (y == ((ResultPoint) (obj)).y)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final float getX()
    {
        return x;
    }

    public final float getY()
    {
        return y;
    }

    public final int hashCode()
    {
        return Float.floatToIntBits(x) * 31 + Float.floatToIntBits(y);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(25);
        stringbuilder.append('(');
        stringbuilder.append(x);
        stringbuilder.append(',');
        stringbuilder.append(y);
        stringbuilder.append(')');
        return stringbuilder.toString();
    }
}
