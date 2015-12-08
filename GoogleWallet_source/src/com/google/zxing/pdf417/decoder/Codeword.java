// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;


final class Codeword
{

    private final int bucket;
    private final int endX;
    private int rowNumber;
    private final int startX;
    private final int value;

    Codeword(int i, int j, int k, int l)
    {
        rowNumber = -1;
        startX = i;
        endX = j;
        bucket = k;
        value = l;
    }

    final int getBucket()
    {
        return bucket;
    }

    final int getEndX()
    {
        return endX;
    }

    final int getRowNumber()
    {
        return rowNumber;
    }

    final int getStartX()
    {
        return startX;
    }

    final int getValue()
    {
        return value;
    }

    final int getWidth()
    {
        return endX - startX;
    }

    final boolean hasValidRowNumber()
    {
        return isValidRowNumber(rowNumber);
    }

    final boolean isValidRowNumber(int i)
    {
        return i != -1 && bucket == (i % 3) * 3;
    }

    final void setRowNumber(int i)
    {
        rowNumber = i;
    }

    final void setRowNumberAsRowIndicatorColumn()
    {
        rowNumber = (value / 30) * 3 + bucket / 3;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(rowNumber).append("|").append(value).toString();
    }
}
