// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;


final class Codeword
{

    private static final int BARCODE_ROW_UNKNOWN = -1;
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

    int getBucket()
    {
        return bucket;
    }

    int getEndX()
    {
        return endX;
    }

    int getRowNumber()
    {
        return rowNumber;
    }

    int getStartX()
    {
        return startX;
    }

    int getValue()
    {
        return value;
    }

    int getWidth()
    {
        return endX - startX;
    }

    boolean hasValidRowNumber()
    {
        return isValidRowNumber(rowNumber);
    }

    boolean isValidRowNumber(int i)
    {
        return i != -1 && bucket == (i % 3) * 3;
    }

    void setRowNumber(int i)
    {
        rowNumber = i;
    }

    void setRowNumberAsRowIndicatorColumn()
    {
        rowNumber = (value / 30) * 3 + bucket / 3;
    }

    public String toString()
    {
        return (new StringBuilder()).append(rowNumber).append("|").append(value).toString();
    }
}
