// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;

// Referenced classes of package com.google.zxing:
//            NotFoundException, Binarizer, LuminanceSource

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

    public final BitMatrix getBlackMatrix()
        throws NotFoundException
    {
        if (matrix == null)
        {
            matrix = binarizer.getBlackMatrix();
        }
        return matrix;
    }

    public final BitArray getBlackRow(int i, BitArray bitarray)
        throws NotFoundException
    {
        return binarizer.getBlackRow(i, bitarray);
    }

    public final int getHeight()
    {
        return binarizer.getHeight();
    }

    public final int getWidth()
    {
        return binarizer.getWidth();
    }

    public final boolean isRotateSupported()
    {
        binarizer.getLuminanceSource();
        return LuminanceSource.isRotateSupported();
    }

    public final BinaryBitmap rotateCounterClockwise()
    {
        binarizer.getLuminanceSource();
        LuminanceSource luminancesource = LuminanceSource.rotateCounterClockwise();
        return new BinaryBitmap(binarizer.createBinarizer(luminancesource));
    }
}
