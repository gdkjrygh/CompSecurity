// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.decoder;


// Referenced classes of package com.google.zxing.qrcode.decoder:
//            Version, ErrorCorrectionLevel

final class DataBlock
{

    private final byte codewords[];
    private final int numDataCodewords;

    private DataBlock(int i, byte abyte0[])
    {
        numDataCodewords = i;
        codewords = abyte0;
    }

    static DataBlock[] getDataBlocks(byte abyte0[], Version version, ErrorCorrectionLevel errorcorrectionlevel)
    {
        if (abyte0.length != version.getTotalCodewords())
        {
            throw new IllegalArgumentException();
        }
        version = version.getECBlocksForLevel(errorcorrectionlevel);
        int i1 = 0;
        errorcorrectionlevel = version.getECBlocks();
        int j1 = errorcorrectionlevel.length;
        for (int i = 0; i < j1; i++)
        {
            i1 += errorcorrectionlevel[i].getCount();
        }

        DataBlock adatablock[] = new DataBlock[i1];
        j1 = 0;
        int k1 = errorcorrectionlevel.length;
        for (int j = 0; j < k1; j++)
        {
            Version.ECB ecb = errorcorrectionlevel[j];
            for (i1 = 0; i1 < ecb.getCount();)
            {
                int i2 = ecb.getDataCodewords();
                adatablock[j1] = new DataBlock(i2, new byte[version.getECCodewordsPerBlock() + i2]);
                i1++;
                j1++;
            }

        }

        i1 = adatablock[0].codewords.length;
        int k;
        for (k = adatablock.length - 1; k >= 0 && adatablock[k].codewords.length != i1; k--) { }
        int l2 = k + 1;
        int j2 = i1 - version.getECCodewordsPerBlock();
        k = 0;
        for (i1 = 0; i1 < j2; i1++)
        {
            for (k1 = 0; k1 < j1;)
            {
                adatablock[k1].codewords[i1] = abyte0[k];
                k1++;
                k++;
            }

        }

        for (i1 = l2; i1 < j1;)
        {
            adatablock[i1].codewords[j2] = abyte0[k];
            i1++;
            k++;
        }

        int i3 = adatablock[0].codewords.length;
        k1 = j2;
        i1 = k;
        for (int l = k1; l < i3; l++)
        {
            int l1 = 0;
            while (l1 < j1) 
            {
                int k2;
                if (l1 < l2)
                {
                    k2 = l;
                } else
                {
                    k2 = l + 1;
                }
                adatablock[l1].codewords[k2] = abyte0[i1];
                l1++;
                i1++;
            }
        }

        return adatablock;
    }

    final byte[] getCodewords()
    {
        return codewords;
    }

    final int getNumDataCodewords()
    {
        return numDataCodewords;
    }
}
