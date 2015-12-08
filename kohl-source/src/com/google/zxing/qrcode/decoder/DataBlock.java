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
        int k;
        int i1;
        int l1;
        if (abyte0.length != version.getTotalCodewords())
        {
            throw new IllegalArgumentException();
        }
        version = version.getECBlocksForLevel(errorcorrectionlevel);
        i1 = 0;
        errorcorrectionlevel = version.getECBlocks();
        l1 = errorcorrectionlevel.length;
        for (int i = 0; i < l1; i++)
        {
            i1 += errorcorrectionlevel[i].getCount();
        }

        adatablock = new DataBlock[i1];
        l1 = 0;
        int i2 = errorcorrectionlevel.length;
        for (int j = 0; j < i2; j++)
        {
            Version.ECB ecb = errorcorrectionlevel[j];
            for (i1 = 0; i1 < ecb.getCount();)
            {
                int i3 = ecb.getDataCodewords();
                adatablock[l1] = new DataBlock(i3, new byte[version.getECCodewordsPerBlock() + i3]);
                i1++;
                l1++;
            }

        }

        i1 = adatablock[0].codewords.length;
        k = adatablock.length - 1;
_L6:
        if (k >= 0 && adatablock[k].codewords.length != i1) goto _L2; else goto _L1
_L1:
        int j3;
        int l3;
        l3 = k + 1;
        j3 = i1 - version.getECCodewordsPerBlock();
        k = 0;
        i1 = 0;
_L4:
        if (i1 >= j3)
        {
            break; /* Loop/switch isn't completed */
        }
        for (int j2 = 0; j2 < l1;)
        {
            adatablock[j2].codewords[i1] = abyte0[k];
            j2++;
            k++;
        }

        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        k--;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        for (int j1 = l3; j1 < l1;)
        {
            adatablock[j1].codewords[j3] = abyte0[k];
            j1++;
            k++;
        }

        int i4 = adatablock[0].codewords.length;
        int k2 = j3;
        int k1 = k;
        for (int l = k2; l < i4; l++)
        {
            int l2 = 0;
            while (l2 < l1) 
            {
                int k3;
                if (l2 < l3)
                {
                    k3 = l;
                } else
                {
                    k3 = l + 1;
                }
                adatablock[l2].codewords[k3] = abyte0[k1];
                l2++;
                k1++;
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
