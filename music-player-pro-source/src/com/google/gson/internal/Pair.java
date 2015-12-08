// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;


public final class Pair
{

    public final Object first;
    public final Object second;

    public Pair(Object obj, Object obj1)
    {
        first = obj;
        second = obj1;
    }

    private static boolean equal(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Pair)
        {
            if (equal(first, ((Pair) (obj = (Pair)obj)).first) && equal(second, ((Pair) (obj)).second))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (first != null)
        {
            i = first.hashCode();
        } else
        {
            i = 0;
        }
        if (second != null)
        {
            j = second.hashCode();
        }
        return i * 17 + j * 17;
    }

    public String toString()
    {
        return String.format("{%s,%s}", new Object[] {
            first, second
        });
    }
}
