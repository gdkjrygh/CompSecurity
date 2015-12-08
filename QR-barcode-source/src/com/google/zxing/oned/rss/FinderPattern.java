// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss;

import com.google.zxing.ResultPoint;

public final class FinderPattern
{

    private final ResultPoint resultPoints[];
    private final int startEnd[];
    private final int value;

    public FinderPattern(int i, int ai[], int j, int k, int l)
    {
        value = i;
        startEnd = ai;
        resultPoints = (new ResultPoint[] {
            new ResultPoint(j, l), new ResultPoint(k, l)
        });
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof FinderPattern)
        {
            if (value == ((FinderPattern) (obj = (FinderPattern)obj)).value)
            {
                return true;
            }
        }
        return false;
    }

    public ResultPoint[] getResultPoints()
    {
        return resultPoints;
    }

    public int[] getStartEnd()
    {
        return startEnd;
    }

    public int getValue()
    {
        return value;
    }

    public int hashCode()
    {
        return value;
    }
}
