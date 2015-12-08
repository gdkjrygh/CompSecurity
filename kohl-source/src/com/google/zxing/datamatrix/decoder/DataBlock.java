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
        int i1 = 0;
        Version.ECB aecb[] = ecblocks.getECBlocks();
        int j1 = aecb.length;
        for (int i = 0; i < j1; i++)
        {
            i1 += aecb[i].getCount();
        }

        DataBlock adatablock[] = new DataBlock[i1];
        i1 = 0;
        int k1 = aecb.length;
        for (int j = 0; j < k1; j++)
        {
            Version.ECB ecb = aecb[j];
            for (j1 = 0; j1 < ecb.getCount();)
            {
                int i2 = ecb.getDataCodewords();
                adatablock[i1] = new DataBlock(i2, new byte[ecblocks.getECCodewords() + i2]);
                j1++;
                i1++;
            }

        }

        int l2 = adatablock[0].codewords.length - ecblocks.getECCodewords();
        int k = 0;
        for (j1 = 0; j1 < l2 - 1; j1++)
        {
            for (int l1 = 0; l1 < i1;)
            {
                adatablock[l1].codewords[j1] = abyte0[k];
                l1++;
                k++;
            }

        }

        boolean flag;
        int j2;
        if (version.getVersionNumber() == 24)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            j1 = 8;
        } else
        {
            j1 = i1;
        }
        for (j2 = 0; j2 < j1;)
        {
            adatablock[j2].codewords[l2 - 1] = abyte0[k];
            j2++;
            k++;
        }

        int j3 = adatablock[0].codewords.length;
        j2 = l2;
        j1 = k;
        for (int l = j2; l < j3; l++)
        {
            int k2 = 0;
            while (k2 < i1) 
            {
                int i3;
                if (flag && k2 > 7)
                {
                    i3 = l - 1;
                } else
                {
                    i3 = l;
                }
                adatablock[k2].codewords[i3] = abyte0[j1];
                k2++;
                j1++;
            }
        }

        if (j1 != abyte0.length)
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
