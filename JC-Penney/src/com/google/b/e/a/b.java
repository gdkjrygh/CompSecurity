// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e.a;


public class b
{

    private final int a;
    private final int b;

    public b(int i, int j)
    {
        a = i;
        b = j;
    }

    public final int a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof b)
        {
            if (a == ((b) (obj = (b)obj)).a && b == ((b) (obj)).b)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return a ^ b;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append("(").append(b).append(')').toString();
    }
}
