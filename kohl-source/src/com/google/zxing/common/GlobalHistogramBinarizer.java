// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;

// Referenced classes of package com.google.zxing.common:
//            BitMatrix, BitArray

public class GlobalHistogramBinarizer extends Binarizer
{

    private static final byte EMPTY[] = new byte[0];
    private static final int LUMINANCE_BITS = 5;
    private static final int LUMINANCE_BUCKETS = 32;
    private static final int LUMINANCE_SHIFT = 3;
    private final int buckets[] = new int[32];
    private byte luminances[];

    public GlobalHistogramBinarizer(LuminanceSource luminancesource)
    {
        super(luminancesource);
        luminances = EMPTY;
    }

    private static int estimateBlackPoint(int ai[])
        throws NotFoundException
    {
        int k3 = ai.length;
        int l1 = 0;
        int i = 0;
        int i2 = 0;
        for (int k = 0; k < k3;)
        {
            int i1 = i2;
            if (ai[k] > i2)
            {
                i = k;
                i1 = ai[k];
            }
            int j2 = l1;
            if (ai[k] > l1)
            {
                j2 = ai[k];
            }
            k++;
            i2 = i1;
            l1 = j2;
        }

        int l = 0;
        i2 = 0;
        for (int j1 = 0; j1 < k3;)
        {
            int k2 = j1 - i;
            int i3 = ai[j1] * k2 * k2;
            k2 = i2;
            if (i3 > i2)
            {
                l = j1;
                k2 = i3;
            }
            j1++;
            i2 = k2;
        }

        i2 = i;
        int k1 = l;
        if (i > l)
        {
            k1 = i;
            i2 = l;
        }
        if (k1 - i2 <= k3 >> 4)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        int j3 = k1 - 1;
        l = -1;
        for (int j = k1 - 1; j > i2;)
        {
            int l2 = j - i2;
            int l3 = l2 * l2 * (k1 - j) * (l1 - ai[j]);
            l2 = l;
            if (l3 > l)
            {
                j3 = j;
                l2 = l3;
            }
            j--;
            l = l2;
        }

        return j3 << 3;
    }

    private void initArrays(int i)
    {
        if (luminances.length < i)
        {
            luminances = new byte[i];
        }
        for (i = 0; i < 32; i++)
        {
            buckets[i] = 0;
        }

    }

    public Binarizer createBinarizer(LuminanceSource luminancesource)
    {
        return new GlobalHistogramBinarizer(luminancesource);
    }

    public BitMatrix getBlackMatrix()
        throws NotFoundException
    {
        LuminanceSource luminancesource = getLuminanceSource();
        int i1 = luminancesource.getWidth();
        int j1 = luminancesource.getHeight();
        BitMatrix bitmatrix = new BitMatrix(i1, j1);
        initArrays(i1);
        int ai[] = buckets;
        for (int i = 1; i < 5; i++)
        {
            byte abyte1[] = luminancesource.getRow((j1 * i) / 5, luminances);
            int k1 = (i1 << 2) / 5;
            for (int k = i1 / 5; k < k1; k++)
            {
                int i2 = (abyte1[k] & 0xff) >> 3;
                ai[i2] = ai[i2] + 1;
            }

        }

        int l1 = estimateBlackPoint(ai);
        byte abyte0[] = luminancesource.getMatrix();
        for (int j = 0; j < j1; j++)
        {
            for (int l = 0; l < i1; l++)
            {
                if ((abyte0[j * i1 + l] & 0xff) < l1)
                {
                    bitmatrix.set(l, j);
                }
            }

        }

        return bitmatrix;
    }

    public BitArray getBlackRow(int i, BitArray bitarray)
        throws NotFoundException
    {
        LuminanceSource luminancesource = getLuminanceSource();
        int j1 = luminancesource.getWidth();
        byte abyte0[];
        int ai[];
        if (bitarray == null || bitarray.getSize() < j1)
        {
            bitarray = new BitArray(j1);
        } else
        {
            bitarray.clear();
        }
        initArrays(j1);
        abyte0 = luminancesource.getRow(i, luminances);
        ai = buckets;
        for (i = 0; i < j1; i++)
        {
            int j = (abyte0[i] & 0xff) >> 3;
            ai[j] = ai[j] + 1;
        }

        int k1 = estimateBlackPoint(ai);
        int l = abyte0[0] & 0xff;
        i = abyte0[1] & 0xff;
        for (int k = 1; k < j1 - 1; k++)
        {
            int i1 = abyte0[k + 1] & 0xff;
            if ((i << 2) - l - i1 >> 1 < k1)
            {
                bitarray.set(k);
            }
            l = i;
            i = i1;
        }

        return bitarray;
    }

}
