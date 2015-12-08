// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;

// Referenced classes of package com.google.zxing.qrcode.decoder:
//            BitMatrixParser, FormatInformation, DataBlock, DecodedBitStreamParser, 
//            QRCodeDecoderMetaData

public final class Decoder
{

    private final ReedSolomonDecoder rsDecoder;

    public Decoder()
    {
        rsDecoder = new ReedSolomonDecoder(GenericGF.QR_CODE_FIELD_256);
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

    private DecoderResult decode(BitMatrixParser bitmatrixparser, Map map)
        throws FormatException, ChecksumException
    {
        Version version = bitmatrixparser.readVersion();
        ErrorCorrectionLevel errorcorrectionlevel = bitmatrixparser.readFormatInformation().getErrorCorrectionLevel();
        bitmatrixparser = DataBlock.getDataBlocks(bitmatrixparser.readCodewords(), version, errorcorrectionlevel);
        int k = 0;
        int i1 = bitmatrixparser.length;
        for (int i = 0; i < i1; i++)
        {
            k += bitmatrixparser[i].getNumDataCodewords();
        }

        byte abyte0[] = new byte[k];
        int j = 0;
        int k1 = bitmatrixparser.length;
        for (int l = 0; l < k1; l++)
        {
            DataBlock datablock = bitmatrixparser[l];
            byte abyte1[] = datablock.getCodewords();
            int l1 = datablock.getNumDataCodewords();
            correctErrors(abyte1, l1);
            for (int j1 = 0; j1 < l1;)
            {
                abyte0[j] = abyte1[j1];
                j1++;
                j++;
            }

        }

        return DecodedBitStreamParser.decode(abyte0, version, errorcorrectionlevel, map);
    }

    public DecoderResult decode(BitMatrix bitmatrix)
        throws ChecksumException, FormatException
    {
        return decode(bitmatrix, null);
    }

    public DecoderResult decode(BitMatrix bitmatrix, Map map)
        throws FormatException, ChecksumException
    {
        FormatException formatexception;
        BitMatrixParser bitmatrixparser;
        bitmatrixparser = new BitMatrixParser(bitmatrix);
        formatexception = null;
        bitmatrix = null;
        DecoderResult decoderresult = decode(bitmatrixparser, map);
        return decoderresult;
        formatexception;
_L1:
        try
        {
            bitmatrixparser.remask();
            bitmatrixparser.setMirror(true);
            bitmatrixparser.readVersion();
            bitmatrixparser.readFormatInformation();
            bitmatrixparser.mirror();
            map = decode(bitmatrixparser, map);
            map.setOther(new QRCodeDecoderMetaData(true));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
label0:
            {
                if (formatexception != null)
                {
                    throw formatexception;
                }
                break label0;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            if (formatexception != null)
            {
                throw formatexception;
            }
            if (bitmatrix != null)
            {
                throw bitmatrix;
            } else
            {
                throw map;
            }
        }
        return map;
        bitmatrix;
          goto _L1
        if (bitmatrix != null)
        {
            throw bitmatrix;
        } else
        {
            throw map;
        }
    }

    public DecoderResult decode(boolean aflag[][])
        throws ChecksumException, FormatException
    {
        return decode(aflag, null);
    }

    public DecoderResult decode(boolean aflag[][], Map map)
        throws ChecksumException, FormatException
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

        return decode(bitmatrix, map);
    }
}
