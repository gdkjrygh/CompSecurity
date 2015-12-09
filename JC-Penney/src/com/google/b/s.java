// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.b.b.a.a;

public class s
{

    private final float a;
    private final float b;

    public s(float f, float f1)
    {
        a = f;
        b = f1;
    }

    public static float a(s s1, s s2)
    {
        return com.google.b.b.a.a.a(s1.a, s1.b, s2.a, s2.b);
    }

    private static float a(s s1, s s2, s s3)
    {
        float f = s2.a;
        float f1 = s2.b;
        float f2 = s3.a;
        float f3 = s1.b;
        float f4 = s3.b;
        return (f2 - f) * (f3 - f1) - (s1.a - f) * (f4 - f1);
    }

    public static void a(s as[])
    {
        float f = a(as[0], as[1]);
        float f1 = a(as[1], as[2]);
        float f2 = a(as[0], as[2]);
        s s1;
        s s2;
        s s3;
        if (f1 >= f && f1 >= f2)
        {
            s3 = as[0];
            s2 = as[1];
            s1 = as[2];
        } else
        if (f2 >= f1 && f2 >= f)
        {
            s3 = as[1];
            s2 = as[0];
            s1 = as[2];
        } else
        {
            s3 = as[2];
            s2 = as[0];
            s1 = as[1];
        }
        if (a(s2, s3, s1) >= 0.0F)
        {
            s s4 = s1;
            s1 = s2;
            s2 = s4;
        }
        as[0] = s1;
        as[1] = s3;
        as[2] = s2;
    }

    public final float a()
    {
        return a;
    }

    public final float b()
    {
        return b;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof s)
        {
            obj = (s)obj;
            flag = flag1;
            if (a == ((s) (obj)).a)
            {
                flag = flag1;
                if (b == ((s) (obj)).b)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return Float.floatToIntBits(a) * 31 + Float.floatToIntBits(b);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(25);
        stringbuilder.append('(');
        stringbuilder.append(a);
        stringbuilder.append(',');
        stringbuilder.append(b);
        stringbuilder.append(')');
        return stringbuilder.toString();
    }
}
