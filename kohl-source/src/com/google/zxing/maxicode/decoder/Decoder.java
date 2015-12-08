// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.maxicode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;

// Referenced classes of package com.google.zxing.maxicode.decoder:
//            BitMatrixParser, DecodedBitStreamParser

public final class Decoder
{

    private static final int ALL = 0;
    private static final int EVEN = 1;
    private static final int ODD = 2;
    private final ReedSolomonDecoder rsDecoder;

    public Decoder()
    {
        rsDecoder = new ReedSolomonDecoder(GenericGF.MAXICODE_FIELD_64);
    }

    private void correctErrors(byte abyte0[], int i, int j, int k, int l)
        throws ChecksumException
    {
        int k1 = j + k;
        int ai[];
        int i1;
        if (l == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        ai = new int[k1 / i1];
        for (int j1 = 0; j1 < k1; j1++)
        {
            if (l == 0 || j1 % 2 == l - 1)
            {
                ai[j1 / i1] = abyte0[j1 + i] & 0xff;
            }
        }

        try
        {
            rsDecoder.decode(ai, k / i1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw ChecksumException.getChecksumInstance();
        }
        for (k = 0; k < j; k++)
        {
            if (l == 0 || k % 2 == l - 1)
            {
                abyte0[k + i] = (byte)ai[k / i1];
            }
        }

    }

    public DecoderResult decode(BitMatrix bitmatrix)
        throws ChecksumException, FormatException
    {
        return decode(bitmatrix, null);
    }

    public DecoderResult decode(BitMatrix bitmatrix, Map map)
        throws FormatException, ChecksumException
    {
        int i;
        map = (new BitMatrixParser(bitmatrix)).readCodewords();
        correctErrors(map, 0, 10, 10, 0);
        i = map[0] & 0xf;
        i;
        JVM INSTR tableswitch 2 5: default 60
    //                   2 64
    //                   3 64
    //                   4 64
    //                   5 122;
           goto _L1 _L2 _L2 _L2 _L3
_L1:
        throw FormatException.getFormatInstance();
_L2:
        correctErrors(map, 20, 84, 40, 1);
        correctErrors(map, 20, 84, 40, 2);
        bitmatrix = new byte[94];
_L5:
        System.arraycopy(map, 0, bitmatrix, 0, 10);
        System.arraycopy(map, 20, bitmatrix, 10, bitmatrix.length - 10);
        return DecodedBitStreamParser.decode(bitmatrix, i);
_L3:
        correctErrors(map, 20, 68, 56, 1);
        correctErrors(map, 20, 68, 56, 2);
        bitmatrix = new byte[78];
        if (true) goto _L5; else goto _L4
_L4:
    }
}
