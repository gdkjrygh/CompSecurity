// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.encoder;


public final class Dimensions
{

    private final int maxCols;
    private final int maxRows;
    private final int minCols;
    private final int minRows;

    public Dimensions(int i, int j, int k, int l)
    {
        minCols = i;
        maxCols = j;
        minRows = k;
        maxRows = l;
    }

    public int getMaxCols()
    {
        return maxCols;
    }

    public int getMaxRows()
    {
        return maxRows;
    }

    public int getMinCols()
    {
        return minCols;
    }

    public int getMinRows()
    {
        return minRows;
    }
}
