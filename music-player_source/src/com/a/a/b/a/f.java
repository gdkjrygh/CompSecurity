// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;


public final class f
{

    private final int a;
    private final int b;

    public f(int i, int j)
    {
        a = i;
        b = j;
    }

    public f(int i, int j, int k)
    {
        if (k % 180 == 0)
        {
            a = i;
            b = j;
            return;
        } else
        {
            a = j;
            b = i;
            return;
        }
    }

    public final int a()
    {
        return a;
    }

    public final f a(float f1)
    {
        return new f((int)((float)a * f1), (int)((float)b * f1));
    }

    public final f a(int i)
    {
        return new f(a / i, b / i);
    }

    public final int b()
    {
        return b;
    }

    public final String toString()
    {
        return (new StringBuilder(9)).append(a).append("x").append(b).toString();
    }
}
