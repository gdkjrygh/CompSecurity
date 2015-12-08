// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.pdf417.PDF417Common;
import com.google.zxing.pdf417.decoder.ec.ErrorCorrection;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Formatter;
import java.util.List;

// Referenced classes of package com.google.zxing.pdf417.decoder:
//            DetectionResultRowIndicatorColumn, BoundingBox, BarcodeValue, DetectionResult, 
//            DetectionResultColumn, Codeword, DecodedBitStreamParser, PDF417CodewordDecoder, 
//            BarcodeMetadata

public final class PDF417ScanningDecoder
{

    private static final int CODEWORD_SKEW_SIZE = 2;
    private static final int MAX_EC_CODEWORDS = 512;
    private static final int MAX_ERRORS = 3;
    private static final ErrorCorrection errorCorrection = new ErrorCorrection();

    private PDF417ScanningDecoder()
    {
    }

    private static BoundingBox adjustBoundingBox(DetectionResultRowIndicatorColumn detectionresultrowindicatorcolumn)
        throws NotFoundException
    {
        int ai[];
        if (detectionresultrowindicatorcolumn != null)
        {
            if ((ai = detectionresultrowindicatorcolumn.getRowHeights()) != null)
            {
                int j1 = getMax(ai);
                int i = 0;
                int i1 = ai.length;
                int l = 0;
                Codeword acodeword[];
label0:
                do
                {
label1:
                    {
                        int j = i;
                        if (l < i1)
                        {
                            j = ai[l];
                            i += j1 - j;
                            if (j <= 0)
                            {
                                break label1;
                            }
                            j = i;
                        }
                        acodeword = detectionresultrowindicatorcolumn.getCodewords();
                        i = 0;
                        for (l = j; l > 0 && acodeword[i] == null; i++)
                        {
                            l--;
                        }

                        break label0;
                    }
                    l++;
                } while (true);
                int k = 0;
                i1 = ai.length - 1;
label2:
                do
                {
label3:
                    {
                        i = k;
                        if (i1 >= 0)
                        {
                            i = k + (j1 - ai[i1]);
                            if (ai[i1] <= 0)
                            {
                                break label3;
                            }
                        }
                        for (k = acodeword.length - 1; i > 0 && acodeword[k] == null; k--)
                        {
                            i--;
                        }

                        break label2;
                    }
                    i1--;
                    k = i;
                } while (true);
                return detectionresultrowindicatorcolumn.getBoundingBox().addMissingRows(l, i, detectionresultrowindicatorcolumn.isLeft());
            }
        }
        return null;
    }

    private static void adjustCodewordCount(DetectionResult detectionresult, BarcodeValue abarcodevalue[][])
        throws NotFoundException
    {
        int ai[] = abarcodevalue[0][1].getValue();
        int i = detectionresult.getBarcodeColumnCount() * detectionresult.getBarcodeRowCount() - getNumberOfECCodeWords(detectionresult.getBarcodeECLevel());
        if (ai.length == 0)
        {
            if (i < 1 || i > 928)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            abarcodevalue[0][1].setValue(i);
        } else
        if (ai[0] != i)
        {
            abarcodevalue[0][1].setValue(i);
            return;
        }
    }

    private static int adjustCodewordStartColumn(BitMatrix bitmatrix, int i, int j, boolean flag, int k, int l)
    {
        int j1 = k;
        int i1;
        int k1;
        boolean flag1;
        if (flag)
        {
            i1 = -1;
        } else
        {
            i1 = 1;
        }
        flag1 = false;
        k1 = i1;
        i1 = ((flag1) ? 1 : 0);
        while (i1 < 2) 
        {
            for (; (flag && j1 >= i || !flag && j1 < j) && flag == bitmatrix.get(j1, l); j1 += k1)
            {
                if (Math.abs(k - j1) > 2)
                {
                    return k;
                }
            }

            k1 = -k1;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i1++;
        }
        return j1;
    }

    private static boolean checkCodewordSkew(int i, int j, int k)
    {
        return j - 2 <= i && i <= k + 2;
    }

    private static int correctErrors(int ai[], int ai1[], int i)
        throws ChecksumException
    {
        if (ai1 != null && ai1.length > i / 2 + 3 || i < 0 || i > 512)
        {
            throw ChecksumException.getChecksumInstance();
        } else
        {
            return errorCorrection.decode(ai, i, ai1);
        }
    }

    private static BarcodeValue[][] createBarcodeMatrix(DetectionResult detectionresult)
    {
        BarcodeValue abarcodevalue[][] = (BarcodeValue[][])Array.newInstance(com/google/zxing/pdf417/decoder/BarcodeValue, new int[] {
            detectionresult.getBarcodeRowCount(), detectionresult.getBarcodeColumnCount() + 2
        });
        for (int i = 0; i < abarcodevalue.length; i++)
        {
            for (int k = 0; k < abarcodevalue[i].length; k++)
            {
                abarcodevalue[i][k] = new BarcodeValue();
            }

        }

        int l = -1;
        detectionresult = detectionresult.getDetectionResultColumns();
        int k1 = detectionresult.length;
        int j = 0;
        while (j < k1) 
        {
            DetectionResultColumn detectionresultcolumn = detectionresult[j];
            int j1 = l + 1;
            if (detectionresultcolumn != null)
            {
                Codeword acodeword[] = detectionresultcolumn.getCodewords();
                int l1 = acodeword.length;
                int i1 = 0;
                while (i1 < l1) 
                {
                    Codeword codeword = acodeword[i1];
                    if (codeword != null && codeword.getRowNumber() != -1)
                    {
                        abarcodevalue[codeword.getRowNumber()][j1].setValue(codeword.getValue());
                    }
                    i1++;
                }
            }
            j++;
            l = j1;
        }
        return abarcodevalue;
    }

    private static DecoderResult createDecoderResult(DetectionResult detectionresult)
        throws FormatException, ChecksumException, NotFoundException
    {
        Object aobj[][] = createBarcodeMatrix(detectionresult);
        adjustCodewordCount(detectionresult, ((BarcodeValue [][]) (aobj)));
        ArrayList arraylist = new ArrayList();
        int ai[] = new int[detectionresult.getBarcodeRowCount() * detectionresult.getBarcodeColumnCount()];
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        for (int i = 0; i < detectionresult.getBarcodeRowCount(); i++)
        {
            int k = 0;
            while (k < detectionresult.getBarcodeColumnCount()) 
            {
                int ai1[] = aobj[i][k + 1].getValue();
                int l = detectionresult.getBarcodeColumnCount() * i + k;
                if (ai1.length == 0)
                {
                    arraylist.add(Integer.valueOf(l));
                } else
                if (ai1.length == 1)
                {
                    ai[l] = ai1[0];
                } else
                {
                    arraylist2.add(Integer.valueOf(l));
                    arraylist1.add(ai1);
                }
                k++;
            }
        }

        aobj = new int[arraylist1.size()][];
        for (int j = 0; j < aobj.length; j++)
        {
            aobj[j] = (int[])arraylist1.get(j);
        }

        return createDecoderResultFromAmbiguousValues(detectionresult.getBarcodeECLevel(), ai, PDF417Common.toIntArray(arraylist), PDF417Common.toIntArray(arraylist2), ((int [][]) (aobj)));
    }

    private static DecoderResult createDecoderResultFromAmbiguousValues(int i, int ai[], int ai1[], int ai2[], int ai3[][])
        throws FormatException, ChecksumException
    {
        int ai4[] = new int[ai2.length];
        int j = 100;
label0:
        do
        {
            if (j > 0)
            {
                for (int k = 0; k < ai4.length; k++)
                {
                    ai[ai2[k]] = ai3[k][ai4[k]];
                }

                DecoderResult decoderresult;
                try
                {
                    decoderresult = decodeCodewords(ai, i, ai1);
                }
                catch (ChecksumException checksumexception)
                {
                    if (ai4.length == 0)
                    {
                        throw ChecksumException.getChecksumInstance();
                    }
                    int l = 0;
                    do
                    {
label1:
                        {
                            if (l < ai4.length)
                            {
                                if (ai4[l] >= ai3[l].length - 1)
                                {
                                    break label1;
                                }
                                ai4[l] = ai4[l] + 1;
                            }
                            j--;
                            continue label0;
                        }
                        ai4[l] = 0;
                        if (l == ai4.length - 1)
                        {
                            throw ChecksumException.getChecksumInstance();
                        }
                        l++;
                    } while (true);
                }
                return decoderresult;
            }
            throw ChecksumException.getChecksumInstance();
        } while (true);
    }

    public static DecoderResult decode(BitMatrix bitmatrix, ResultPoint resultpoint, ResultPoint resultpoint1, ResultPoint resultpoint2, ResultPoint resultpoint3, int i, int j)
        throws NotFoundException, FormatException, ChecksumException
    {
        DetectionResult detectionresult;
        BoundingBox boundingbox;
        int l;
        int j1;
        int k1;
        int i2;
        int k2;
        boolean flag1;
        {
            ResultPoint resultpoint4;
            ResultPoint resultpoint5;
label0:
            {
                boundingbox = new BoundingBox(bitmatrix, resultpoint, resultpoint1, resultpoint2, resultpoint3);
                resultpoint3 = null;
                resultpoint1 = null;
                detectionresult = null;
                int k = 0;
                do
                {
                    resultpoint5 = resultpoint3;
                    resultpoint4 = resultpoint1;
                    if (k >= 2)
                    {
                        break label0;
                    }
                    if (resultpoint != null)
                    {
                        resultpoint3 = getRowIndicatorColumn(bitmatrix, boundingbox, resultpoint, true, i, j);
                    }
                    if (resultpoint2 != null)
                    {
                        resultpoint1 = getRowIndicatorColumn(bitmatrix, boundingbox, resultpoint2, false, i, j);
                    }
                    detectionresult = merge(resultpoint3, resultpoint1);
                    if (detectionresult == null)
                    {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    if (k != 0 || detectionresult.getBoundingBox() == null || detectionresult.getBoundingBox().getMinY() >= boundingbox.getMinY() && detectionresult.getBoundingBox().getMaxY() <= boundingbox.getMaxY())
                    {
                        break;
                    }
                    boundingbox = detectionresult.getBoundingBox();
                    k++;
                } while (true);
                detectionresult.setBoundingBox(boundingbox);
                resultpoint4 = resultpoint1;
                resultpoint5 = resultpoint3;
            }
            k2 = detectionresult.getBarcodeColumnCount() + 1;
            detectionresult.setDetectionResultColumn(0, resultpoint5);
            detectionresult.setDetectionResultColumn(k2, resultpoint4);
            boolean flag;
            if (resultpoint5 != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag = true;
            l = i;
            i = ((flag) ? 1 : 0);
        }
        if (i > k2)
        {
            break MISSING_BLOCK_LABEL_505;
        }
        if (flag1)
        {
            k1 = i;
        } else
        {
            k1 = k2 - i;
        }
        if (detectionresult.getDetectionResultColumn(k1) == null) goto _L2; else goto _L1
_L1:
        j1 = j;
        i2 = l;
_L4:
        i++;
        l = i2;
        j = j1;
        break MISSING_BLOCK_LABEL_211;
_L2:
        int i1;
        int l1;
        int j2;
        if (k1 == 0 || k1 == k2)
        {
            boolean flag2;
            if (k1 == 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            resultpoint = new DetectionResultRowIndicatorColumn(boundingbox, flag2);
        } else
        {
            resultpoint = new DetectionResultColumn(boundingbox);
        }
        detectionresult.setDetectionResultColumn(k1, resultpoint);
        i1 = -1;
        l1 = boundingbox.getMinY();
        i2 = l;
        j1 = j;
        if (l1 > boundingbox.getMaxY()) goto _L4; else goto _L3
_L3:
        i2 = getStartColumn(detectionresult, k1, l1, flag1);
        if (i2 >= 0)
        {
            j1 = i2;
            if (i2 <= boundingbox.getMaxX())
            {
                break MISSING_BLOCK_LABEL_432;
            }
        }
        if (i1 != -1) goto _L6; else goto _L5
_L5:
        j2 = j;
        i2 = l;
_L8:
        l1++;
        l = i2;
        j = j2;
        break MISSING_BLOCK_LABEL_328;
_L6:
        j1 = i1;
        resultpoint1 = detectCodeword(bitmatrix, boundingbox.getMinX(), boundingbox.getMaxX(), flag1, j1, l1, l, j);
        i2 = l;
        j2 = j;
        if (resultpoint1 != null)
        {
            resultpoint.setCodeword(l1, resultpoint1);
            i1 = j1;
            i2 = Math.min(l, resultpoint1.getWidth());
            j2 = Math.max(j, resultpoint1.getWidth());
        }
        if (true) goto _L8; else goto _L7
_L7:
        return createDecoderResult(detectionresult);
    }

    private static DecoderResult decodeCodewords(int ai[], int i, int ai1[])
        throws FormatException, ChecksumException
    {
        if (ai.length == 0)
        {
            throw FormatException.getFormatInstance();
        } else
        {
            int j = 1 << i + 1;
            int k = correctErrors(ai, ai1, j);
            verifyCodewordCount(ai, j);
            ai = DecodedBitStreamParser.decode(ai, String.valueOf(i));
            ai.setErrorsCorrected(Integer.valueOf(k));
            ai.setErasures(Integer.valueOf(ai1.length));
            return ai;
        }
    }

    private static Codeword detectCodeword(BitMatrix bitmatrix, int i, int j, boolean flag, int k, int l, int i1, int j1)
    {
        k = adjustCodewordStartColumn(bitmatrix, i, j, flag, k, l);
        bitmatrix = getModuleBitCount(bitmatrix, i, j, flag, k, l);
        if (bitmatrix == null)
        {
            return null;
        }
        j = PDF417Common.getBitCountSum(bitmatrix);
        if (flag)
        {
            i = k + j;
        } else
        {
            for (i = 0; i < bitmatrix.length >> 1; i++)
            {
                l = bitmatrix[i];
                bitmatrix[i] = bitmatrix[bitmatrix.length - 1 - i];
                bitmatrix[bitmatrix.length - 1 - i] = l;
            }

            i = k;
            k = i - j;
        }
        if (!checkCodewordSkew(j, i1, j1))
        {
            return null;
        }
        j = PDF417CodewordDecoder.getDecodedValue(bitmatrix);
        l = PDF417Common.getCodeword(j);
        if (l == -1)
        {
            return null;
        } else
        {
            return new Codeword(k, i, getCodewordBucketNumber(j), l);
        }
    }

    private static BarcodeMetadata getBarcodeMetadata(DetectionResultRowIndicatorColumn detectionresultrowindicatorcolumn, DetectionResultRowIndicatorColumn detectionresultrowindicatorcolumn1)
    {
        if (detectionresultrowindicatorcolumn != null && detectionresultrowindicatorcolumn.getBarcodeMetadata() != null) goto _L2; else goto _L1
_L1:
        if (detectionresultrowindicatorcolumn1 != null) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        return detectionresultrowindicatorcolumn1.getBarcodeMetadata();
_L2:
        if (detectionresultrowindicatorcolumn1 != null && detectionresultrowindicatorcolumn1.getBarcodeMetadata() != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (detectionresultrowindicatorcolumn != null)
        {
            return detectionresultrowindicatorcolumn.getBarcodeMetadata();
        }
        if (true) goto _L3; else goto _L5
_L5:
        detectionresultrowindicatorcolumn = detectionresultrowindicatorcolumn.getBarcodeMetadata();
        detectionresultrowindicatorcolumn1 = detectionresultrowindicatorcolumn1.getBarcodeMetadata();
        if (detectionresultrowindicatorcolumn.getColumnCount() == detectionresultrowindicatorcolumn1.getColumnCount() || detectionresultrowindicatorcolumn.getErrorCorrectionLevel() == detectionresultrowindicatorcolumn1.getErrorCorrectionLevel() || detectionresultrowindicatorcolumn.getRowCount() == detectionresultrowindicatorcolumn1.getRowCount())
        {
            return detectionresultrowindicatorcolumn;
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    private static int[] getBitCountForCodeword(int i)
    {
        int ai[] = new int[8];
        int l = 0;
        int k = ai.length - 1;
        do
        {
            int j = k;
            int i1 = l;
            if ((i & 1) != l)
            {
                i1 = i & 1;
                k--;
                j = k;
                if (k < 0)
                {
                    return ai;
                }
            }
            ai[j] = ai[j] + 1;
            i >>= 1;
            k = j;
            l = i1;
        } while (true);
    }

    private static int getCodewordBucketNumber(int i)
    {
        return getCodewordBucketNumber(getBitCountForCodeword(i));
    }

    private static int getCodewordBucketNumber(int ai[])
    {
        return ((((ai[0] - ai[2]) + ai[4]) - ai[6]) + 9) % 9;
    }

    private static int getMax(int ai[])
    {
        int j = -1;
        int k = ai.length;
        for (int i = 0; i < k; i++)
        {
            j = Math.max(j, ai[i]);
        }

        return j;
    }

    private static int[] getModuleBitCount(BitMatrix bitmatrix, int i, int j, boolean flag, int k, int l)
    {
        int i1 = k;
        int ai[] = new int[8];
        int j1 = 0;
        boolean flag1;
        if (flag)
        {
            k = 1;
        } else
        {
            k = -1;
        }
        flag1 = flag;
        while ((flag && i1 < j || !flag && i1 >= i) && j1 < ai.length) 
        {
            if (bitmatrix.get(i1, l) == flag1)
            {
                ai[j1] = ai[j1] + 1;
                i1 += k;
            } else
            {
                j1++;
                if (!flag1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
            }
        }
        if (j1 == ai.length || (flag && i1 == j || !flag && i1 == i) && j1 == ai.length - 1)
        {
            return ai;
        } else
        {
            return null;
        }
    }

    private static int getNumberOfECCodeWords(int i)
    {
        return 2 << i;
    }

    private static DetectionResultRowIndicatorColumn getRowIndicatorColumn(BitMatrix bitmatrix, BoundingBox boundingbox, ResultPoint resultpoint, boolean flag, int i, int j)
    {
        DetectionResultRowIndicatorColumn detectionresultrowindicatorcolumn = new DetectionResultRowIndicatorColumn(boundingbox, flag);
        for (int l = 0; l < 2; l++)
        {
            int k;
            int i1;
            int j1;
            if (l == 0)
            {
                i1 = 1;
            } else
            {
                i1 = -1;
            }
            k = (int)resultpoint.getX();
            j1 = (int)resultpoint.getY();
            while (j1 <= boundingbox.getMaxY() && j1 >= boundingbox.getMinY()) 
            {
                Codeword codeword = detectCodeword(bitmatrix, 0, bitmatrix.getWidth(), flag, k, j1, i, j);
                if (codeword != null)
                {
                    detectionresultrowindicatorcolumn.setCodeword(j1, codeword);
                    if (flag)
                    {
                        k = codeword.getStartX();
                    } else
                    {
                        k = codeword.getEndX();
                    }
                }
                j1 += i1;
            }
        }

        return detectionresultrowindicatorcolumn;
    }

    private static int getStartColumn(DetectionResult detectionresult, int i, int j, boolean flag)
    {
        Codeword codeword;
        int k;
        if (flag)
        {
            k = 1;
        } else
        {
            k = -1;
        }
        codeword = null;
        if (isValidBarcodeColumn(detectionresult, i - k))
        {
            codeword = detectionresult.getDetectionResultColumn(i - k).getCodeword(j);
        }
        if (codeword != null)
        {
            if (flag)
            {
                return codeword.getEndX();
            } else
            {
                return codeword.getStartX();
            }
        }
        codeword = detectionresult.getDetectionResultColumn(i).getCodewordNearby(j);
        if (codeword != null)
        {
            if (flag)
            {
                return codeword.getStartX();
            } else
            {
                return codeword.getEndX();
            }
        }
        if (isValidBarcodeColumn(detectionresult, i - k))
        {
            codeword = detectionresult.getDetectionResultColumn(i - k).getCodewordNearby(j);
        }
        if (codeword != null)
        {
            if (flag)
            {
                return codeword.getEndX();
            } else
            {
                return codeword.getStartX();
            }
        }
        boolean flag1 = false;
        j = i;
        i = ((flag1) ? 1 : 0);
        int l;
        for (; isValidBarcodeColumn(detectionresult, j - k); j = l)
        {
            l = j - k;
            Codeword acodeword[] = detectionresult.getDetectionResultColumn(l).getCodewords();
            int i1 = acodeword.length;
            for (j = 0; j < i1; j++)
            {
                Codeword codeword1 = acodeword[j];
                if (codeword1 != null)
                {
                    if (flag)
                    {
                        j = codeword1.getEndX();
                    } else
                    {
                        j = codeword1.getStartX();
                    }
                    return j + k * i * (codeword1.getEndX() - codeword1.getStartX());
                }
            }

            i++;
        }

        if (flag)
        {
            return detectionresult.getBoundingBox().getMinX();
        } else
        {
            return detectionresult.getBoundingBox().getMaxX();
        }
    }

    private static boolean isValidBarcodeColumn(DetectionResult detectionresult, int i)
    {
        return i >= 0 && i <= detectionresult.getBarcodeColumnCount() + 1;
    }

    private static DetectionResult merge(DetectionResultRowIndicatorColumn detectionresultrowindicatorcolumn, DetectionResultRowIndicatorColumn detectionresultrowindicatorcolumn1)
        throws NotFoundException
    {
        BarcodeMetadata barcodemetadata;
        if (detectionresultrowindicatorcolumn != null || detectionresultrowindicatorcolumn1 != null)
        {
            if ((barcodemetadata = getBarcodeMetadata(detectionresultrowindicatorcolumn, detectionresultrowindicatorcolumn1)) != null)
            {
                return new DetectionResult(barcodemetadata, BoundingBox.merge(adjustBoundingBox(detectionresultrowindicatorcolumn), adjustBoundingBox(detectionresultrowindicatorcolumn1)));
            }
        }
        return null;
    }

    public static String toString(BarcodeValue abarcodevalue[][])
    {
        Formatter formatter = new Formatter();
        for (int i = 0; i < abarcodevalue.length; i++)
        {
            formatter.format("Row %2d: ", new Object[] {
                Integer.valueOf(i)
            });
            int j = 0;
            while (j < abarcodevalue[i].length) 
            {
                BarcodeValue barcodevalue = abarcodevalue[i][j];
                if (barcodevalue.getValue().length == 0)
                {
                    formatter.format("        ", (Object[])null);
                } else
                {
                    formatter.format("%4d(%2d)", new Object[] {
                        Integer.valueOf(barcodevalue.getValue()[0]), barcodevalue.getConfidence(barcodevalue.getValue()[0])
                    });
                }
                j++;
            }
            formatter.format("\n", new Object[0]);
        }

        abarcodevalue = formatter.toString();
        formatter.close();
        return abarcodevalue;
    }

    private static void verifyCodewordCount(int ai[], int i)
        throws FormatException
    {
label0:
        {
            if (ai.length < 4)
            {
                throw FormatException.getFormatInstance();
            }
            int j = ai[0];
            if (j > ai.length)
            {
                throw FormatException.getFormatInstance();
            }
            if (j == 0)
            {
                if (i >= ai.length)
                {
                    break label0;
                }
                ai[0] = ai.length - i;
            }
            return;
        }
        throw FormatException.getFormatInstance();
    }

}
