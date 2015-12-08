// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;

// Referenced classes of package com.google.zxing:
//            Binarizer, LuminanceSource, NotFoundException

public final class BinaryBitmap
{

    private final Binarizer binarizer;
    private BitMatrix matrix;

    public BinaryBitmap(Binarizer binarizer1)
    {
        if (binarizer1 == null)
        {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        } else
        {
            binarizer = binarizer1;
            return;
        }
    }

    public BinaryBitmap crop(int i, int j, int k, int l)
    {
        LuminanceSource luminancesource = binarizer.getLuminanceSource().crop(i, j, k, l);
        return new BinaryBitmap(binarizer.createBinarizer(luminancesource));
    }

    public BitMatrix getBlackMatrix()
        throws NotFoundException
    {
        if (matrix == null)
        {
            matrix = binarizer.getBlackMatrix();
        }
        return matrix;
    }

    public BitArray getBlackRow(int i, BitArray bitarray)
        throws NotFoundException
    {
        return binarizer.getBlackRow(i, bitarray);
    }

    public int getHeight()
    {
        return binarizer.getHeight();
    }

    public int getWidth()
    {
        return binarizer.getWidth();
    }

    public boolean isCropSupported()
    {
        return binarizer.getLuminanceSource().isCropSupported();
    }

    public boolean isRotateSupported()
    {
        return binarizer.getLuminanceSource().isRotateSupported();
    }

    public BinaryBitmap rotateCounterClockwise()
    {
        LuminanceSource luminancesource = binarizer.getLuminanceSource().rotateCounterClockwise();
        return new BinaryBitmap(binarizer.createBinarizer(luminancesource));
    }

    public BinaryBitmap rotateCounterClockwise45()
    {
        LuminanceSource luminancesource = binarizer.getLuminanceSource().rotateCounterClockwise45();
        return new BinaryBitmap(binarizer.createBinarizer(luminancesource));
    }
}
