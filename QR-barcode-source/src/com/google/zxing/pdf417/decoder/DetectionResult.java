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
        while (codeword == null || codeword.hasValidRowNumber()) 
        {
            return j;
        }
        if (codeword.isValidRowNumber(i))
        {
            codeword.setRowNumber(i);
            return 0;
        } else
        {
            return j + 1;
        }
    }

    private int adjustRowNumbers()
    {
        int k = adjustRowNumbersByRow();
        if (k == 0)
        {
            return 0;
        }
label0:
        for (int i = 1; i < barcodeColumnCount + 1; i++)
        {
            Codeword acodeword[] = detectionResultColumns[i].getCodewords();
            int j = 0;
            do
            {
                if (j >= acodeword.length)
                {
                    continue label0;
                }
                if (acodeword[j] != null && !acodeword[j].hasValidRowNumber())
                {
                    adjustRowNumbers(i, j, acodeword);
                }
                j++;
            } while (true);
        }

        return k;
    }

    private void adjustRowNumbers(int i, int j, Codeword acodeword[])
    {
        Codeword codeword = acodeword[j];
        Codeword acodeword2[] = detectionResultColumns[i - 1].getCodewords();
        Codeword acodeword1[];
        Codeword acodeword3[];
        if (detectionResultColumns[i + 1] != null)
        {
            acodeword1 = detectionResultColumns[i + 1].getCodewords();
        } else
        {
            acodeword1 = acodeword2;
        }
        acodeword3 = new Codeword[14];
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
        return adjustRowNumbersFromLRI() + adjustRowNumbersFromRRI();
    }

    private int adjustRowNumbersFromBothRI()
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
        return 0;
    }

    private int adjustRowNumbersFromLRI()
    {
        if (detectionResultColumns[0] == null)
        {
            return 0;
        }
        Codeword acodeword[] = detectionResultColumns[0].getCodewords();
        int j = 0;
        int i = 0;
        while (j < acodeword.length) 
        {
            if (acodeword[j] != null)
            {
                int k1 = acodeword[j].getRowNumber();
                int k = 1;
                int j1 = 0;
                while (k < barcodeColumnCount + 1 && j1 < 2) 
                {
                    Codeword codeword = detectionResultColumns[k].getCodewords()[j];
                    int l = j1;
                    int i1 = i;
                    if (codeword != null)
                    {
                        j1 = adjustRowNumberIfValid(k1, j1, codeword);
                        l = j1;
                        i1 = i;
                        if (!codeword.hasValidRowNumber())
                        {
                            i1 = i + 1;
                            l = j1;
                        }
                    }
                    k++;
                    j1 = l;
                    i = i1;
                }
            }
            j++;
        }
        return i;
    }

    private int adjustRowNumbersFromRRI()
    {
        if (detectionResultColumns[barcodeColumnCount + 1] == null)
        {
            return 0;
        }
        Codeword acodeword[] = detectionResultColumns[barcodeColumnCount + 1].getCodewords();
        int j = 0;
        int i = 0;
        while (j < acodeword.length) 
        {
            if (acodeword[j] != null)
            {
                int k1 = acodeword[j].getRowNumber();
                int k = barcodeColumnCount + 1;
                int j1 = 0;
                while (k > 0 && j1 < 2) 
                {
                    Codeword codeword = detectionResultColumns[k].getCodewords()[j];
                    int l = j1;
                    int i1 = i;
                    if (codeword != null)
                    {
                        j1 = adjustRowNumberIfValid(k1, j1, codeword);
                        l = j1;
                        i1 = i;
                        if (!codeword.hasValidRowNumber())
                        {
                            i1 = i + 1;
                            l = j1;
                        }
                    }
                    k--;
                    j1 = l;
                    i = i1;
                }
            }
            j++;
        }
        return i;
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
        do
        {
            int j = adjustRowNumbers();
            if (j <= 0 || j >= i)
            {
                return detectionResultColumns;
            }
            i = j;
        } while (true);
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
