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
import java.util.List;

// Referenced classes of package com.google.zxing.pdf417.decoder:
//            DetectionResultRowIndicatorColumn, BoundingBox, BarcodeValue, DetectionResult, 
//            DetectionResultColumn, Codeword, DecodedBitStreamParser, PDF417CodewordDecoder, 
//            BarcodeMetadata

public final class PDF417ScanningDecoder
{

    private static final ErrorCorrection errorCorrection = new ErrorCorrection();

    private static BoundingBox adjustBoundingBox(DetectionResultRowIndicatorColumn detectionresultrowindicatorcolumn)
        throws NotFoundException
    {
        if (detectionresultrowindicatorcolumn == null)
        {
            return null;
        }
        int ai[] = detectionresultrowindicatorcolumn.getRowHeights();
        int j1 = getMax(ai);
        int j = 0;
        int i1 = ai.length;
        int l = 0;
        int i;
        do
        {
            i = j;
            if (l >= i1)
            {
                break;
            }
            int k1 = ai[l];
            j += j1 - k1;
            i = j;
            if (k1 > 0)
            {
                break;
            }
            l++;
        } while (true);
        Codeword acodeword[] = detectionresultrowindicatorcolumn.getCodewords();
        j = 0;
        for (l = i; l > 0 && acodeword[j] == null; j++)
        {
            l--;
        }

        j = 0;
        i1 = ai.length - 1;
        do
        {
            i = j;
            if (i1 < 0)
            {
                break;
            }
            j += j1 - ai[i1];
            i = j;
            if (ai[i1] > 0)
            {
                break;
            }
            i1--;
        } while (true);
        for (int k = acodeword.length - 1; i > 0 && acodeword[k] == null; k--)
        {
            i--;
        }

        return detectionresultrowindicatorcolumn.getBoundingBox().addMissingRows(l, i, detectionresultrowindicatorcolumn.isLeft());
    }

    private static void adjustCodewordCount(DetectionResult detectionresult, BarcodeValue abarcodevalue[][])
        throws NotFoundException
    {
        int ai[] = abarcodevalue[0][1].getValue();
        int i = detectionresult.getBarcodeColumnCount() * detectionresult.getBarcodeRowCount() - getNumberOfECCodeWords(detectionresult.getBarcodeECLevel());
        if (ai.length == 0)
        {
            if (i <= 0 || i > 928)
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
        int j1 = detectionresult.length;
        for (int j = 0; j < j1;)
        {
            DetectionResultColumn detectionresultcolumn = detectionresult[j];
            int i1 = l + 1;
            if (detectionresultcolumn != null)
            {
                Codeword acodeword[] = detectionresultcolumn.getCodewords();
                int k1 = acodeword.length;
                for (l = 0; l < k1; l++)
                {
                    Codeword codeword = acodeword[l];
                    if (codeword != null && codeword.getRowNumber() != -1)
                    {
                        abarcodevalue[codeword.getRowNumber()][i1].setValue(codeword.getValue());
                    }
                }

            }
            j++;
            l = i1;
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
        int ai4[];
        int j;
        ai4 = new int[ai2.length];
        j = 100;
_L2:
        int k;
        k = j - 1;
        if (j <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        for (j = 0; j < ai4.length; j++)
        {
            ai[ai2[j]] = ai3[j][ai4[j]];
        }

        DecoderResult decoderresult = decodeCodewords(ai, i, ai1);
        return decoderresult;
        ChecksumException checksumexception;
        checksumexception;
        if (ai4.length == 0)
        {
            throw ChecksumException.getChecksumInstance();
        }
        j = 0;
        do
        {
            if (j >= ai4.length)
            {
                break;
            }
            if (ai4[j] < ai3[j].length - 1)
            {
                ai4[j] = ai4[j] + 1;
                j = k;
                continue; /* Loop/switch isn't completed */
            }
            ai4[j] = 0;
            if (j == ai4.length - 1)
            {
                throw ChecksumException.getChecksumInstance();
            }
            j++;
        } while (true);
        j = k;
        if (true) goto _L2; else goto _L1
_L1:
        throw ChecksumException.getChecksumInstance();
    }

    public static DecoderResult decode(BitMatrix bitmatrix, ResultPoint resultpoint, ResultPoint resultpoint1, ResultPoint resultpoint2, ResultPoint resultpoint3, int i, int j)
        throws NotFoundException, FormatException, ChecksumException
    {
        DetectionResult detectionresult;
        BoundingBox boundingbox;
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
        int l2 = detectionresult.getBarcodeColumnCount() + 1;
        detectionresult.setDetectionResultColumn(0, resultpoint5);
        detectionresult.setDetectionResultColumn(l2, resultpoint4);
        int l;
        boolean flag;
        boolean flag1;
        if (resultpoint5 != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag = true;
        l = i;
        for (i = ((flag) ? 1 : 0); i <= l2;)
        {
            int j1;
            int k1;
            int i2;
            if (flag1)
            {
                k1 = i;
            } else
            {
                k1 = l2 - i;
            }
            j1 = l;
            i2 = j;
            if (detectionresult.getDetectionResultColumn(k1) == null)
            {
                if (k1 == 0 || k1 == l2)
                {
                    int i1;
                    int l1;
                    int j2;
                    int k2;
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
label1:
                do
                {
label2:
                    {
label3:
                        {
                            j1 = l;
                            i2 = j;
                            if (l1 > boundingbox.getMaxY())
                            {
                                break label1;
                            }
                            i2 = getStartColumn(detectionresult, k1, l1, flag1);
                            if (i2 >= 0)
                            {
                                j1 = i2;
                                if (i2 <= boundingbox.getMaxX())
                                {
                                    break label3;
                                }
                            }
                            k2 = i1;
                            j2 = l;
                            i2 = j;
                            if (i1 == -1)
                            {
                                break label2;
                            }
                            j1 = i1;
                        }
                        resultpoint1 = detectCodeword(bitmatrix, boundingbox.getMinX(), boundingbox.getMaxX(), flag1, j1, l1, l, j);
                        k2 = i1;
                        j2 = l;
                        i2 = j;
                        if (resultpoint1 != null)
                        {
                            resultpoint.setCodeword(l1, resultpoint1);
                            j2 = Math.min(l, resultpoint1.getWidth());
                            i2 = Math.max(j, resultpoint1.getWidth());
                            k2 = j1;
                        }
                    }
                    l1++;
                    i1 = k2;
                    l = j2;
                    j = i2;
                } while (true);
            }
            i++;
            l = j1;
            j = i2;
        }

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
            k -= j;
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
        detectionresultrowindicatorcolumn = null;
_L6:
        return detectionresultrowindicatorcolumn;
_L4:
        return detectionresultrowindicatorcolumn1.getBarcodeMetadata();
_L2:
        if (detectionresultrowindicatorcolumn1 == null || detectionresultrowindicatorcolumn1.getBarcodeMetadata() == null)
        {
            if (detectionresultrowindicatorcolumn == null)
            {
                return null;
            } else
            {
                return detectionresultrowindicatorcolumn.getBarcodeMetadata();
            }
        }
        BarcodeMetadata barcodemetadata = detectionresultrowindicatorcolumn.getBarcodeMetadata();
        detectionresultrowindicatorcolumn1 = detectionresultrowindicatorcolumn1.getBarcodeMetadata();
        detectionresultrowindicatorcolumn = barcodemetadata;
        if (barcodemetadata.getColumnCount() != detectionresultrowindicatorcolumn1.getColumnCount())
        {
            detectionresultrowindicatorcolumn = barcodemetadata;
            if (barcodemetadata.getErrorCorrectionLevel() != detectionresultrowindicatorcolumn1.getErrorCorrectionLevel())
            {
                detectionresultrowindicatorcolumn = barcodemetadata;
                if (barcodemetadata.getRowCount() != detectionresultrowindicatorcolumn1.getRowCount())
                {
                    return null;
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static int[] getBitCountForCodeword(int i)
    {
        int ai[] = new int[8];
        int k = 0;
        int j = 7;
        do
        {
            int i1 = j;
            int l = k;
            if ((i & 1) != k)
            {
                l = i & 1;
                i1 = j - 1;
                if (i1 < 0)
                {
                    break;
                }
            }
            ai[i1] = ai[i1] + 1;
            i >>= 1;
            j = i1;
            k = l;
        } while (true);
        return ai;
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
        while ((flag && i1 < j || !flag && i1 >= i) && j1 < 8) 
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
        if (j1 == 8 || (flag && i1 == j || !flag && i1 == i) && j1 == 7)
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
