// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;


public final class f
{

    private final int a;
    private final int b;

    public f(int i, int j)
    {
        if (i < 0 || j < 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            a = i;
            b = j;
            return;
        }
    }

    public int a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof f)
        {
            obj = (f)obj;
            flag = flag1;
            if (a == ((f) (obj)).a)
            {
                flag = flag1;
                if (b == ((f) (obj)).b)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return a * 32713 + b;
    }

    public String toString()
    {
        return (new StringBuilder()).append(a).append("x").append(b).toString();
    }
}
