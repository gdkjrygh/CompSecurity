// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;


// Referenced classes of package com.netflix.mediaclient.util:
//            MathUtils

public static class Ints
{

    private final int end;
    private final int midpoint;
    private final int start;

    public boolean contains(int i)
    {
        return i >= start && i <= end;
    }

    public int getMidpoint()
    {
        return midpoint;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Range [start=").append(start).append(", end=").append(end).append("]").toString();
    }

    public (int i, int j)
    {
        start = i;
        end = j;
        midpoint = MathUtils.divideInts(i + j, 2);
    }
}
