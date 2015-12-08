// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.decoder;


// Referenced classes of package com.google.zxing.datamatrix.decoder:
//            Version

final class DataBlock
{

    private final byte codewords[];
    private final int numDataCodewords;

    private DataBlock(int i, byte abyte0[])
    {
        numDataCodewords = i;
        codewords = abyte0;
    }

    static DataBlock[] getDataBlocks(byte abyte0[], Version version)
    {
        Version.ECBlocks ecblocks = version.getECBlocks();
        Version.ECB aecb[] = ecblocks.getECBlocks();
        int l = aecb.length;
        int i = 0;
        int j = 0;
        for (; i < l; i++)
        {
            j += aecb[i].getCount();
        }

        DataBlock adatablock[] = new DataBlock[j];
        int i1 = aecb.length;
        j = 0;
        i = 0;
        for (; j < i1; j++)
        {
            Version.ECB ecb = aecb[j];
            for (l = 0; l < ecb.getCount();)
            {
                int k1 = ecb.getDataCodewords();
                adatablock[i] = new DataBlock(k1, new byte[ecblocks.getECCodewords() + k1]);
                l++;
                i++;
            }

        }

        int j2 = adatablock[0].codewords.length - ecblocks.getECCodewords();
        l = 0;
        j = 0;
        for (; l < j2 - 1; l++)
        {
            for (int j1 = 0; j1 < i;)
            {
                adatablock[j1].codewords[l] = abyte0[j];
                j1++;
                j++;
            }

        }

        boolean flag;
        int l1;
        if (version.getVersionNumber() == 24)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            l = 8;
        } else
        {
            l = i;
        }
        for (l1 = 0; l1 < l;)
        {
            adatablock[l1].codewords[j2 - 1] = abyte0[j];
            l1++;
            j++;
        }

        int l2 = adatablock[0].codewords.length;
        l = j;
        for (int k = j2; k < l2; k++)
        {
            int i2 = 0;
            while (i2 < i) 
            {
                int k2;
                if (flag && i2 > 7)
                {
                    k2 = k - 1;
                } else
                {
                    k2 = k;
                }
                adatablock[i2].codewords[k2] = abyte0[l];
                i2++;
                l++;
            }
        }

        if (l != abyte0.length)
        {
            throw new IllegalArgumentException();
        } else
        {
            return adatablock;
        }
    }

    byte[] getCodewords()
    {
        return codewords;
    }

    int getNumDataCodewords()
    {
        return numDataCodewords;
    }
}
