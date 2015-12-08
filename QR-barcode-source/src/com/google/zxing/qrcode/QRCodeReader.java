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
        int j2 = ai[1];
        int l = ai1[1];
        int k = ai[0];
        int j = ai1[0];
        if (k >= j || j2 >= l)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        int i = j;
        if (l - j2 != j - k)
        {
            i = (l - j2) + k;
        }
        int j1 = Math.round((float)((i - k) + 1) / f);
        int k1 = Math.round((float)((l - j2) + 1) / f);
        if (j1 <= 0 || k1 <= 0)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        if (k1 != j1)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        int l1 = (int)(f / 2.0F);
        j = j2 + l1;
        k += l1;
        i = ((int)((float)(j1 - 1) * f) + k) - (i - 1);
        BitMatrix bitmatrix1;
        if (i > 0)
        {
            if (i > l1)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            i = k - i;
        } else
        {
            i = k;
        }
        k = ((int)((float)(k1 - 1) * f) + j) - (l - 1);
        if (k > 0)
        {
            if (k > l1)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            j -= k;
        }
        bitmatrix1 = new BitMatrix(j1, k1);
        for (k = 0; k < k1; k++)
        {
            int i2 = (int)((float)k * f);
            for (int i1 = 0; i1 < j1; i1++)
            {
                if (bitmatrix.get((int)((float)i1 * f) + i, j + i2))
                {
                    bitmatrix1.set(i1, k);
                }
            }

        }

        return bitmatrix1;
    }

    private static float moduleSize(int ai[], BitMatrix bitmatrix)
        throws NotFoundException
    {
        int l = bitmatrix.getHeight();
        int i1 = bitmatrix.getWidth();
        int j = ai[0];
        int i = ai[1];
        boolean flag = true;
        int k = 0;
        do
        {
label0:
            {
label1:
                {
                    if (j < i1 && i < l)
                    {
                        if (flag == bitmatrix.get(j, i))
                        {
                            break label0;
                        }
                        k++;
                        if (k != 5)
                        {
                            break label1;
                        }
                    }
                    if (j == i1 || i == l)
                    {
                        throw NotFoundException.getNotFoundInstance();
                    } else
                    {
                        return (float)(j - ai[0]) / 7F;
                    }
                }
                if (!flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            j++;
            i++;
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
