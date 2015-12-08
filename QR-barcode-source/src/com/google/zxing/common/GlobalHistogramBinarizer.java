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
        boolean flag = false;
        int k2 = ai.length;
        int i = 0;
        int i1 = 0;
        int j = 0;
        int j1;
        int k1;
        for (j1 = 0; i < k2; j1 = k1)
        {
            int k = i1;
            if (ai[i] > i1)
            {
                k = ai[i];
                j = i;
            }
            k1 = j1;
            if (ai[i] > j1)
            {
                k1 = ai[i];
            }
            i++;
            i1 = k;
        }

        i1 = 0;
        i = 0;
        int l = ((flag) ? 1 : 0);
        while (l < k2) 
        {
            int l1 = l - j;
            l1 *= ai[l] * l1;
            int j2;
            if (l1 > i1)
            {
                i1 = l;
                i = l1;
            } else
            {
                int i2 = i;
                i = i1;
                i1 = i2;
            }
            l++;
            l1 = i1;
            i1 = i;
            i = l1;
        }
        if (j > i)
        {
            l1 = i;
            i1 = j;
        } else
        {
            i1 = i;
            l1 = j;
        }
        if (i1 - l1 <= k2 >> 4)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        j = i1 - 1;
        l = -1;
        i = i1 - 1;
        while (i > l1) 
        {
            j2 = i - l1;
            j2 = j2 * j2 * (i1 - i) * (j1 - ai[i]);
            if (j2 > l)
            {
                l = i;
                j = j2;
            } else
            {
                j2 = j;
                j = l;
                l = j2;
            }
            i--;
            j2 = l;
            l = j;
            j = j2;
        }
        return j << 3;
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
        int j = 1;
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
            int k = (abyte0[i] & 0xff) >> 3;
            ai[k] = ai[k] + 1;
        }

        int k1 = estimateBlackPoint(ai);
        int l = abyte0[0];
        i = abyte0[1] & 0xff;
        l &= 0xff;
        while (j < j1 - 1) 
        {
            int i1 = abyte0[j + 1] & 0xff;
            if ((i << 2) - l - i1 >> 1 < k1)
            {
                bitarray.set(j);
            }
            j++;
            l = i;
            i = i1;
        }
        return bitarray;
    }

}
