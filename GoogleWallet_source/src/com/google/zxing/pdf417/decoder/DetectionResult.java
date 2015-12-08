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
        do
        {
            j = l;
            if (i >= barcodeColumnCount + 1)
            {
                continue;
            }
            Codeword acodeword[] = detectionResultColumns[i].getCodewords();
            for (int k = 0; k < acodeword.length; k++)
            {
                if (acodeword[k] != null && !acodeword[k].hasValidRowNumber())
                {
                    adjustRowNumbers(i, k, acodeword);
                }
            }

            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
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
        i = 0;
        do
        {
            if (i >= 14 || adjustRowNumber(codeword, acodeword3[i]))
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
                    for (int j = 1; j <= barcodeColumnCount; j++)
                    {
                        Codeword codeword = detectionResultColumns[j].getCodewords()[i];
                        if (codeword == null)
                        {
                            continue;
                        }
                        codeword.setRowNumber(acodeword[i].getRowNumber());
                        if (!codeword.hasValidRowNumber())
                        {
                            detectionResultColumns[j].getCodewords()[i] = null;
                        }
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
        int i = 0;
        Codeword acodeword[] = detectionResultColumns[0].getCodewords();
        int j = 0;
        do
        {
            k = i;
            if (j >= acodeword.length)
            {
                continue;
            }
            int j1 = i;
            if (acodeword[j] != null)
            {
                int l1 = acodeword[j].getRowNumber();
                int i1 = 0;
                int l = 1;
                do
                {
                    j1 = i;
                    if (l >= barcodeColumnCount + 1)
                    {
                        break;
                    }
                    j1 = i;
                    if (i1 >= 2)
                    {
                        break;
                    }
                    Codeword codeword = detectionResultColumns[l].getCodewords()[j];
                    j1 = i1;
                    int k1 = i;
                    if (codeword != null)
                    {
                        i1 = adjustRowNumberIfValid(l1, i1, codeword);
                        j1 = i1;
                        k1 = i;
                        if (!codeword.hasValidRowNumber())
                        {
                            k1 = i + 1;
                            j1 = i1;
                        }
                    }
                    l++;
                    i1 = j1;
                    i = k1;
                } while (true);
            }
            j++;
            i = j1;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int adjustRowNumbersFromRRI()
    {
        if (detectionResultColumns[barcodeColumnCount + 1] != null) goto _L2; else goto _L1
_L1:
        int k = 0;
_L4:
        return k;
_L2:
        int i = 0;
        Codeword acodeword[] = detectionResultColumns[barcodeColumnCount + 1].getCodewords();
        int j = 0;
        do
        {
            k = i;
            if (j >= acodeword.length)
            {
                continue;
            }
            int j1 = i;
            if (acodeword[j] != null)
            {
                int l1 = acodeword[j].getRowNumber();
                int i1 = 0;
                int l = barcodeColumnCount + 1;
                do
                {
                    j1 = i;
                    if (l <= 0)
                    {
                        break;
                    }
                    j1 = i;
                    if (i1 >= 2)
                    {
                        break;
                    }
                    Codeword codeword = detectionResultColumns[l].getCodewords()[j];
                    j1 = i1;
                    int k1 = i;
                    if (codeword != null)
                    {
                        i1 = adjustRowNumberIfValid(l1, i1, codeword);
                        j1 = i1;
                        k1 = i;
                        if (!codeword.hasValidRowNumber())
                        {
                            k1 = i + 1;
                            j1 = i1;
                        }
                    }
                    l--;
                    i1 = j1;
                    i = k1;
                } while (true);
            }
            j++;
            i = j1;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    final int getBarcodeColumnCount()
    {
        return barcodeColumnCount;
    }

    final int getBarcodeECLevel()
    {
        return barcodeMetadata.getErrorCorrectionLevel();
    }

    final int getBarcodeRowCount()
    {
        return barcodeMetadata.getRowCount();
    }

    final BoundingBox getBoundingBox()
    {
        return boundingBox;
    }

    final DetectionResultColumn getDetectionResultColumn(int i)
    {
        return detectionResultColumns[i];
    }

    final DetectionResultColumn[] getDetectionResultColumns()
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

    public final void setBoundingBox(BoundingBox boundingbox)
    {
        boundingBox = boundingbox;
    }

    final void setDetectionResultColumn(int i, DetectionResultColumn detectionresultcolumn)
    {
        detectionResultColumns[i] = detectionresultcolumn;
    }

    public final String toString()
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
