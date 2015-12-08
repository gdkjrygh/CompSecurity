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
        DataBlock adatablock[];
        int i;
        int k;
        int l;
        if (abyte0.length != version.getTotalCodewords())
        {
            throw new IllegalArgumentException();
        }
        version = version.getECBlocksForLevel(errorcorrectionlevel);
        errorcorrectionlevel = version.getECBlocks();
        l = errorcorrectionlevel.length;
        i = 0;
        k = 0;
        for (; i < l; i++)
        {
            k += errorcorrectionlevel[i].getCount();
        }

        adatablock = new DataBlock[k];
        int j1 = errorcorrectionlevel.length;
        l = 0;
        for (k = 0; l < j1; k = i)
        {
            Version.ECB ecb = errorcorrectionlevel[l];
            i = k;
            for (k = 0; k < ecb.getCount();)
            {
                int j2 = ecb.getDataCodewords();
                adatablock[i] = new DataBlock(j2, new byte[version.getECCodewordsPerBlock() + j2]);
                k++;
                i++;
            }

            l++;
        }

        l = adatablock[0].codewords.length;
        i = adatablock.length - 1;
_L6:
        if (i >= 0 && adatablock[i].codewords.length != l) goto _L2; else goto _L1
_L1:
        int k2;
        int i3;
        i3 = i + 1;
        k2 = l - version.getECCodewordsPerBlock();
        l = 0;
        i = 0;
_L4:
        if (l >= k2)
        {
            break; /* Loop/switch isn't completed */
        }
        for (int k1 = 0; k1 < k;)
        {
            adatablock[k1].codewords[l] = abyte0[i];
            k1++;
            i++;
        }

        l++;
        continue; /* Loop/switch isn't completed */
_L2:
        i--;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        int l1 = i3;
        int i1;
        for (i1 = i; l1 < k; i1++)
        {
            adatablock[l1].codewords[k2] = abyte0[i1];
            l1++;
        }

        int j3 = adatablock[0].codewords.length;
        for (int j = k2; j < j3; j++)
        {
            int i2 = 0;
            while (i2 < k) 
            {
                int l2;
                if (i2 < i3)
                {
                    l2 = j;
                } else
                {
                    l2 = j + 1;
                }
                adatablock[i2].codewords[l2] = abyte0[i1];
                i2++;
                i1++;
            }
        }

        return adatablock;
        if (true) goto _L6; else goto _L5
_L5:
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
