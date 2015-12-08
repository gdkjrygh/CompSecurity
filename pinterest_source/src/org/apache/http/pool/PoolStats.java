// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.pool;


public class PoolStats
{

    private final int available;
    private final int leased;
    private final int max;
    private final int pending;

    public PoolStats(int i, int j, int k, int l)
    {
        leased = i;
        pending = j;
        available = k;
        max = l;
    }

    public int getAvailable()
    {
        return available;
    }

    public int getLeased()
    {
        return leased;
    }

    public int getMax()
    {
        return max;
    }

    public int getPending()
    {
        return pending;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[leased: ");
        stringbuilder.append(leased);
        stringbuilder.append("; pending: ");
        stringbuilder.append(pending);
        stringbuilder.append("; available: ");
        stringbuilder.append(available);
        stringbuilder.append("; max: ");
        stringbuilder.append(max);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
