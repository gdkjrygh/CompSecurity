// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;

import java.util.Formatter;

// Referenced classes of package com.google.zxing.pdf417.decoder:
//            BarcodeMetadata, DetectionResultColumn, DetectionResultRowIndicatorColumn, Codeword, 
//            BoundingBox

final class DetectionResult
{

    private static final int ADJUST_ROW_NUMBER_SKIP = 2;
    private final int barcodeColumnCount;
    private final BarcodeMetadata barcodeMetadata;
    private BoundingBox boundingBox;
    private final DetectionResultColumn detectionResultColumns[];

    DetectionResult(BarcodeMetadata barcodemetadata, BoundingBox boundingbox)
    {
        barcodeMetadata = barcodemetadata;
        barcodeColumnCount = barcodemetadata.getColumnCount();
        boundingBox = boundingbox;
        detectionResultColumns = new DetectionResultColumn[barcodeColumnCount + 2];
    }

    private void adjustIndicatorColumnRowNumbers(DetectionResultColumn detectionresultcolumn)
    {
        if (detectionresultcolumn != null)
        {
            ((DetectionResultRowIndicatorColumn)detectionresultcolumn).adjustCompleteIndicatorColumnRowNumbers(barcodeMetadata);
        }
    }

    private static boolean adjustRowNumber(Codeword codeword, Codeword codeword1)
    {
        while (codeword1 == null || !codeword1.hasValidRowNumber() || codeword1.getBucket() != codeword.getBucket()) 
        {
            return false;
        }
        codeword.setRowNumber(codeword1.getRowNumber());
        return true;
    }

    private static int adjustRowNumberIfValid(int i, int j, Codeword codeword)
    {
        if (codeword == null)
        {
            return j;
        }
        int k = j;
        if (!codeword.hasValidRowNumber())
        {
            if (codeword.isValidRowNumber(i))
            {
                codeword.setRowNumber(i);
                k = 0;
            } else
            {
                k = j + 1;
            }
        }
        return k;
    }

    private int adjustRowNumbers()
    {
        int l = adjustRowNumbersByRow();
        if (l != 0) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        int i = 1;
_L5:
        j = l;
        if (i >= barcodeColumnCount + 1) goto _L4; else goto _L3
_L3:
        Codeword acodeword[] = detectionResultColumns[i].getCodewords();
        int k = 0;
        do
        {
            if (k >= acodeword.length)
            {
                break;
            }
            if (acodeword[k] != null && !acodeword[k].hasValidRowNumber())
            {
                adjustRowNumbers(i, k, acodeword);
            }
            k++;
        } while (true);
        i++;
          goto _L5
    }

    private void adjustRowNumbers(int i, int j, Codeword acodeword[])
    {
        Codeword codeword = acodeword[j];
        Codeword acodeword2[] = detectionResultColumns[i - 1].getCodewords();
        Codeword acodeword1[] = acodeword2;
        if (detectionResultColumns[i + 1] != null)
        {
            acodeword1 = detectionResultColumns[i + 1].getCodewords();
        }
        Codeword acodeword3[] = new Codeword[14];
        acodeword3[2] = acodeword2[j];
        acodeword3[3] = acodeword1[j];
        if (j > 0)
        {
            acodeword3[0] = acodeword[j - 1];
            acodeword3[4] = acodeword2[j - 1];
            acodeword3[5] = acodeword1[j - 1];
        }
        if (j > 1)
        {
            acodeword3[8] = acodeword[j - 2];
            acodeword3[10] = acodeword2[j - 2];
            acodeword3[11] = acodeword1[j - 2];
        }
        if (j < acodeword.length - 1)
        {
            acodeword3[1] = acodeword[j + 1];
            acodeword3[6] = acodeword2[j + 1];
            acodeword3[7] = acodeword1[j + 1];
        }
        if (j < acodeword.length - 2)
        {
            acodeword3[9] = acodeword[j + 2];
            acodeword3[12] = acodeword2[j + 2];
            acodeword3[13] = acodeword1[j + 2];
        }
        j = acodeword3.length;
        i = 0;
        do
        {
            if (i >= j || adjustRowNumber(codeword, acodeword3[i]))
            {
                return;
            }
            i++;
        } while (true);
    }

    private int adjustRowNumbersByRow()
    {
        adjustRowNumbersFromBothRI();
        int i = adjustRowNumbersFromLRI();
        return adjustRowNumbersFromRRI() + i;
    }

    private void adjustRowNumbersFromBothRI()
    {
        if (detectionResultColumns[0] != null && detectionResultColumns[barcodeColumnCount + 1] != null)
        {
            Codeword acodeword[] = detectionResultColumns[0].getCodewords();
            Codeword acodeword1[] = detectionResultColumns[barcodeColumnCount + 1].getCodewords();
            int i = 0;
            while (i < acodeword.length) 
            {
                if (acodeword[i] != null && acodeword1[i] != null && acodeword[i].getRowNumber() == acodeword1[i].getRowNumber())
                {
                    int j = 1;
                    while (j <= barcodeColumnCount) 
                    {
                        Codeword codeword = detectionResultColumns[j].getCodewords()[i];
                        if (codeword != null)
                        {
                            codeword.setRowNumber(acodeword[i].getRowNumber());
                            if (!codeword.hasValidRowNumber())
                            {
                                detectionResultColumns[j].getCodewords()[i] = null;
                            }
                        }
                        j++;
                    }
                }
                i++;
            }
        }
    }

    private int adjustRowNumbersFromLRI()
    {
        if (detectionResultColumns[0] != null) goto _L2; else goto _L1
_L1:
        int k = 0;
_L4:
        return k;
_L2:
        Codeword acodeword[];
        int i;
        int j;
        i = 0;
        acodeword = detectionResultColumns[0].getCodewords();
        j = 0;
_L7:
        k = i;
        if (j >= acodeword.length) goto _L4; else goto _L3
_L3:
        if (acodeword[j] != null) goto _L6; else goto _L5
_L5:
        int i1 = i;
_L9:
        j++;
        i = i1;
          goto _L7
_L6:
        int l;
        int l1;
        l1 = acodeword[j].getRowNumber();
        l = 0;
        k = 1;
_L11:
        i1 = i;
        if (k >= barcodeColumnCount + 1) goto _L9; else goto _L8
_L8:
        i1 = i;
        if (l >= 2) goto _L9; else goto _L10
_L10:
        Codeword codeword = detectionResultColumns[k].getCodewords()[j];
        int j1 = l;
        int k1 = i;
        if (codeword != null)
        {
            l = adjustRowNumberIfValid(l1, l, codeword);
            j1 = l;
            k1 = i;
            if (!codeword.hasValidRowNumber())
            {
                k1 = i + 1;
                j1 = l;
            }
        }
        k++;
        l = j1;
        i = k1;
          goto _L11
    }

    private int adjustRowNumbersFromRRI()
    {
        if (detectionResultColumns[barcodeColumnCount + 1] != null) goto _L2; else goto _L1
_L1:
        int k = 0;
_L4:
        return k;
_L2:
        Codeword acodeword[];
        int i;
        int j;
        i = 0;
        acodeword = detectionResultColumns[barcodeColumnCount + 1].getCodewords();
        j = 0;
_L7:
        k = i;
        if (j >= acodeword.length) goto _L4; else goto _L3
_L3:
        if (acodeword[j] != null) goto _L6; else goto _L5
_L5:
        int i1 = i;
_L9:
        j++;
        i = i1;
          goto _L7
_L6:
        int l;
        int l1;
        l1 = acodeword[j].getRowNumber();
        l = 0;
        k = barcodeColumnCount + 1;
_L11:
        i1 = i;
        if (k <= 0) goto _L9; else goto _L8
_L8:
        i1 = i;
        if (l >= 2) goto _L9; else goto _L10
_L10:
        Codeword codeword = detectionResultColumns[k].getCodewords()[j];
        int j1 = l;
        int k1 = i;
        if (codeword != null)
        {
            l = adjustRowNumberIfValid(l1, l, codeword);
            j1 = l;
            k1 = i;
            if (!codeword.hasValidRowNumber())
            {
                k1 = i + 1;
                j1 = l;
            }
        }
        k--;
        l = j1;
        i = k1;
          goto _L11
    }

    int getBarcodeColumnCount()
    {
        return barcodeColumnCount;
    }

    int getBarcodeECLevel()
    {
        return barcodeMetadata.getErrorCorrectionLevel();
    }

    int getBarcodeRowCount()
    {
        return barcodeMetadata.getRowCount();
    }

    BoundingBox getBoundingBox()
    {
        return boundingBox;
    }

    DetectionResultColumn getDetectionResultColumn(int i)
    {
        return detectionResultColumns[i];
    }

    DetectionResultColumn[] getDetectionResultColumns()
    {
        adjustIndicatorColumnRowNumbers(detectionResultColumns[0]);
        adjustIndicatorColumnRowNumbers(detectionResultColumns[barcodeColumnCount + 1]);
        int i = 928;
        char c;
        int j;
        do
        {
            c = i;
            j = adjustRowNumbers();
            if (j <= 0)
            {
                break;
            }
            i = j;
        } while (j < c);
        return detectionResultColumns;
    }

    public void setBoundingBox(BoundingBox boundingbox)
    {
        boundingBox = boundingbox;
    }

    void setDetectionResultColumn(int i, DetectionResultColumn detectionresultcolumn)
    {
        detectionResultColumns[i] = detectionresultcolumn;
    }

    public String toString()
    {
        Object obj1 = detectionResultColumns[0];
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = detectionResultColumns[barcodeColumnCount + 1];
        }
        obj1 = new Formatter();
        for (int i = 0; i < ((DetectionResultColumn) (obj)).getCodewords().length; i++)
        {
            ((Formatter) (obj1)).format("CW %3d:", new Object[] {
                Integer.valueOf(i)
            });
            int j = 0;
            while (j < barcodeColumnCount + 2) 
            {
                if (detectionResultColumns[j] == null)
                {
                    ((Formatter) (obj1)).format("    |   ", new Object[0]);
                } else
                {
                    Codeword codeword = detectionResultColumns[j].getCodewords()[i];
                    if (codeword == null)
                    {
                        ((Formatter) (obj1)).format("    |   ", new Object[0]);
                    } else
                    {
                        ((Formatter) (obj1)).format(" %3d|%3d", new Object[] {
                            Integer.valueOf(codeword.getRowNumber()), Integer.valueOf(codeword.getValue())
                        });
                    }
                }
                j++;
            }
            ((Formatter) (obj1)).format("\n", new Object[0]);
        }

        obj = ((Formatter) (obj1)).toString();
        ((Formatter) (obj1)).close();
        return ((String) (obj));
    }
}
