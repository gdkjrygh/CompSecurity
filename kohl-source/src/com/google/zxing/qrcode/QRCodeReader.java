// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.qrcode.decoder.Decoder;
import com.google.zxing.qrcode.decoder.QRCodeDecoderMetaData;
import com.google.zxing.qrcode.detector.Detector;
import java.util.Map;

public class QRCodeReader
    implements Reader
{

    private static final ResultPoint NO_POINTS[] = new ResultPoint[0];
    private final Decoder decoder = new Decoder();

    public QRCodeReader()
    {
    }

    private static BitMatrix extractPureBits(BitMatrix bitmatrix)
        throws NotFoundException
    {
        int ai[] = bitmatrix.getTopLeftOnBit();
        int ai1[] = bitmatrix.getBottomRightOnBit();
        if (ai == null || ai1 == null)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        float f = moduleSize(ai, bitmatrix);
        int k = ai[1];
        int i1 = ai1[1];
        int k2 = ai[0];
        int j = ai1[0];
        if (k2 >= j || k >= i1)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        int i = j;
        if (i1 - k != j - k2)
        {
            i = k2 + (i1 - k);
        }
        int k1 = Math.round((float)((i - k2) + 1) / f);
        int l1 = Math.round((float)((i1 - k) + 1) / f);
        if (k1 <= 0 || l1 <= 0)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        if (l1 != k1)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        int i2 = (int)(f / 2.0F);
        k += i2;
        j = k2 + i2;
        k2 = ((int)((float)(k1 - 1) * f) + j) - (i - 1);
        i = j;
        if (k2 > 0)
        {
            if (k2 > i2)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            i = j - k2;
        }
        i1 = ((int)((float)(l1 - 1) * f) + k) - (i1 - 1);
        j = k;
        if (i1 > 0)
        {
            if (i1 > i2)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            j = k - i1;
        }
        BitMatrix bitmatrix1 = new BitMatrix(k1, l1);
        for (int l = 0; l < l1; l++)
        {
            int j2 = (int)((float)l * f);
            for (int j1 = 0; j1 < k1; j1++)
            {
                if (bitmatrix.get((int)((float)j1 * f) + i, j + j2))
                {
                    bitmatrix1.set(j1, l);
                }
            }

        }

        return bitmatrix1;
    }

    private static float moduleSize(int ai[], BitMatrix bitmatrix)
        throws NotFoundException
    {
        int i1 = bitmatrix.getHeight();
        int j1 = bitmatrix.getWidth();
        int j = ai[0];
        int i = ai[1];
        boolean flag1 = true;
        int k = 0;
        do
        {
label0:
            {
label1:
                {
                    int l;
                    boolean flag;
                    if (j < j1 && i < i1)
                    {
                        flag = flag1;
                        l = k;
                        if (flag1 == bitmatrix.get(j, i))
                        {
                            break label0;
                        }
                        l = k + 1;
                        if (l != 5)
                        {
                            break label1;
                        }
                    }
                    if (j == j1 || i == i1)
                    {
                        throw NotFoundException.getNotFoundInstance();
                    } else
                    {
                        return (float)(j - ai[0]) / 7F;
                    }
                }
                if (!flag1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            j++;
            i++;
            flag1 = flag;
            k = l;
        } while (true);
    }

    public Result decode(BinaryBitmap binarybitmap)
        throws NotFoundException, ChecksumException, FormatException
    {
        return decode(binarybitmap, null);
    }

    public final Result decode(BinaryBitmap binarybitmap, Map map)
        throws NotFoundException, ChecksumException, FormatException
    {
        java.util.List list;
        if (map != null && map.containsKey(DecodeHintType.PURE_BARCODE))
        {
            binarybitmap = extractPureBits(binarybitmap.getBlackMatrix());
            binarybitmap = decoder.decode(binarybitmap, map);
            map = NO_POINTS;
        } else
        {
            DetectorResult detectorresult = (new Detector(binarybitmap.getBlackMatrix())).detect(map);
            binarybitmap = decoder.decode(detectorresult.getBits(), map);
            map = detectorresult.getPoints();
        }
        if (binarybitmap.getOther() instanceof QRCodeDecoderMetaData)
        {
            ((QRCodeDecoderMetaData)binarybitmap.getOther()).applyMirroredCorrection(map);
        }
        map = new Result(binarybitmap.getText(), binarybitmap.getRawBytes(), map, BarcodeFormat.QR_CODE);
        list = binarybitmap.getByteSegments();
        if (list != null)
        {
            map.putMetadata(ResultMetadataType.BYTE_SEGMENTS, list);
        }
        binarybitmap = binarybitmap.getECLevel();
        if (binarybitmap != null)
        {
            map.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, binarybitmap);
        }
        return map;
    }

    protected final Decoder getDecoder()
    {
        return decoder;
    }

    public void reset()
    {
    }

}
