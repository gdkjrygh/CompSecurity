// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

// Referenced classes of package com.google.zxing.pdf417.encoder:
//            BarcodeRow

public final class BarcodeMatrix
{

    private int currentRow;
    private final int height;
    private final BarcodeRow matrix[];
    private final int width;

    BarcodeMatrix(int i, int j)
    {
        matrix = new BarcodeRow[i];
        int k = 0;
        for (int l = matrix.length; k < l; k++)
        {
            matrix[k] = new BarcodeRow((j + 4) * 17 + 1);
        }

        width = j * 17;
        height = i;
        currentRow = -1;
    }

    BarcodeRow getCurrentRow()
    {
        return matrix[currentRow];
    }

    public byte[][] getMatrix()
    {
        return getScaledMatrix(1, 1);
    }

    public byte[][] getScaledMatrix(int i, int j)
    {
        int k = height;
        int i1 = width;
        byte abyte0[][] = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            k * j, i1 * i
        });
        i1 = height * j;
        for (int l = 0; l < i1; l++)
        {
            abyte0[i1 - l - 1] = matrix[l / j].getScaledRow(i);
        }

        return abyte0;
    }

    void set(int i, int j, byte byte0)
    {
        matrix[j].set(i, byte0);
    }

    void startRow()
    {
        currentRow = currentRow + 1;
    }
}
