// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

// Referenced classes of package com.google.zxing.datamatrix.decoder:
//            BitMatrixParser, DataBlock, DecodedBitStreamParser

public final class Decoder
{

    private final ReedSolomonDecoder rsDecoder;

    public Decoder()
    {
        rsDecoder = new ReedSolomonDecoder(GenericGF.DATA_MATRIX_FIELD_256);
    }

    private void correctErrors(byte abyte0[], int i)
        throws ChecksumException
    {
        int l = abyte0.length;
        int ai[] = new int[l];
        for (int j = 0; j < l; j++)
        {
            ai[j] = abyte0[j] & 0xff;
        }

        int k = abyte0.length;
        try
        {
            rsDecoder.decode(ai, k - i);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw ChecksumException.getChecksumInstance();
        }
        for (k = 0; k < i; k++)
        {
            abyte0[k] = (byte)ai[k];
        }

    }

    public DecoderResult decode(BitMatrix bitmatrix)
        throws FormatException, ChecksumException
    {
        bitmatrix = new BitMatrixParser(bitmatrix);
        Version version = bitmatrix.getVersion();
        bitmatrix = DataBlock.getDataBlocks(bitmatrix.readCodewords(), version);
        int i1 = bitmatrix.length;
        int k = 0;
        int j1 = bitmatrix.length;
        for (int i = 0; i < j1; i++)
        {
            k += bitmatrix[i].getNumDataCodewords();
        }

        byte abyte0[] = new byte[k];
        for (int j = 0; j < i1; j++)
        {
            DataBlock datablock = bitmatrix[j];
            byte abyte1[] = datablock.getCodewords();
            int k1 = datablock.getNumDataCodewords();
            correctErrors(abyte1, k1);
            for (int l = 0; l < k1; l++)
            {
                abyte0[l * i1 + j] = abyte1[l];
            }

        }

        return DecodedBitStreamParser.decode(abyte0);
    }

    public DecoderResult decode(boolean aflag[][])
        throws FormatException, ChecksumException
    {
        int k = aflag.length;
        BitMatrix bitmatrix = new BitMatrix(k);
        for (int i = 0; i < k; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if (aflag[i][j])
                {
                    bitmatrix.set(j, i);
                }
            }

        }

        return decode(bitmatrix);
    }
}
