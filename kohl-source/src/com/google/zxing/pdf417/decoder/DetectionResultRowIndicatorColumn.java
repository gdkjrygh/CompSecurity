// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;

import com.google.zxing.ResultPoint;

// Referenced classes of package com.google.zxing.pdf417.decoder:
//            DetectionResultColumn, Codeword, BarcodeMetadata, BoundingBox, 
//            BarcodeValue

final class DetectionResultRowIndicatorColumn extends DetectionResultColumn
{

    private final boolean isLeft;

    DetectionResultRowIndicatorColumn(BoundingBox boundingbox, boolean flag)
    {
        super(boundingbox);
        isLeft = flag;
    }

    private void removeIncorrectCodewords(Codeword acodeword[], BarcodeMetadata barcodemetadata)
    {
        int i = 0;
_L5:
        if (i >= acodeword.length) goto _L2; else goto _L1
_L1:
        Codeword codeword = acodeword[i];
        if (acodeword[i] != null) goto _L4; else goto _L3
_L3:
        i++;
          goto _L5
_L4:
        int l = codeword.getValue() % 30;
        int k = codeword.getRowNumber();
        if (k > barcodemetadata.getRowCount())
        {
            acodeword[i] = null;
            continue; /* Loop/switch isn't completed */
        }
        int j = k;
        if (!isLeft)
        {
            j = k + 2;
        }
        switch (j % 3)
        {
        case 0: // '\0'
            if (l * 3 + 1 != barcodemetadata.getRowCountUpperPart())
            {
                acodeword[i] = null;
            }
            break;

        case 1: // '\001'
            if (l / 3 != barcodemetadata.getErrorCorrectionLevel() || l % 3 != barcodemetadata.getRowCountLowerPart())
            {
                acodeword[i] = null;
            }
            break;

        case 2: // '\002'
            if (l + 1 != barcodemetadata.getColumnCount())
            {
                acodeword[i] = null;
            }
            break;
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    int adjustCompleteIndicatorColumnRowNumbers(BarcodeMetadata barcodemetadata)
    {
        Codeword acodeword[] = getCodewords();
        setRowNumbers();
        removeIncorrectCodewords(acodeword, barcodemetadata);
        Object obj = getBoundingBox();
        float f;
        ResultPoint resultpoint;
        int j;
        int k;
        int l;
        int i1;
        int l1;
        if (isLeft)
        {
            resultpoint = ((BoundingBox) (obj)).getTopLeft();
        } else
        {
            resultpoint = ((BoundingBox) (obj)).getTopRight();
        }
        if (isLeft)
        {
            obj = ((BoundingBox) (obj)).getBottomLeft();
        } else
        {
            obj = ((BoundingBox) (obj)).getBottomRight();
        }
        k = imageRowToCodewordIndex((int)resultpoint.getY());
        l1 = imageRowToCodewordIndex((int)((ResultPoint) (obj)).getY());
        f = (float)(l1 - k) / (float)barcodemetadata.getRowCount();
        j = -1;
        l = 1;
        i1 = 0;
        while (k < l1) 
        {
            int i;
            if (acodeword[k] == null)
            {
                i = i1;
            } else
            {
                Codeword codeword = acodeword[k];
                int j1 = codeword.getRowNumber() - j;
                if (j1 == 0)
                {
                    i = i1 + 1;
                } else
                if (j1 == 1)
                {
                    l = Math.max(l, i1);
                    i = 1;
                    j = codeword.getRowNumber();
                } else
                if (j1 < 0 || codeword.getRowNumber() >= barcodemetadata.getRowCount() || j1 > k)
                {
                    acodeword[k] = null;
                    i = i1;
                } else
                {
                    if (l > 2)
                    {
                        j1 = (l - 2) * j1;
                    }
                    int k1;
                    if (j1 >= k)
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    k1 = 1;
                    while (k1 <= j1 && i == 0) 
                    {
                        if (acodeword[k - k1] != null)
                        {
                            i = 1;
                        } else
                        {
                            i = 0;
                        }
                        k1++;
                    }
                    if (i != 0)
                    {
                        acodeword[k] = null;
                        i = i1;
                    } else
                    {
                        j = codeword.getRowNumber();
                        i = 1;
                    }
                }
            }
            k++;
            i1 = i;
        }
        return (int)((double)f + 0.5D);
    }

    int adjustIncompleteIndicatorColumnRowNumbers(BarcodeMetadata barcodemetadata)
    {
        Object obj1 = getBoundingBox();
        float f;
        Object obj;
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (isLeft)
        {
            obj = ((BoundingBox) (obj1)).getTopLeft();
        } else
        {
            obj = ((BoundingBox) (obj1)).getTopRight();
        }
        if (isLeft)
        {
            obj1 = ((BoundingBox) (obj1)).getBottomLeft();
        } else
        {
            obj1 = ((BoundingBox) (obj1)).getBottomRight();
        }
        k = imageRowToCodewordIndex((int)((ResultPoint) (obj)).getY());
        i1 = imageRowToCodewordIndex((int)((ResultPoint) (obj1)).getY());
        f = (float)(i1 - k) / (float)barcodemetadata.getRowCount();
        obj = getCodewords();
        j = -1;
        l = 1;
        i = 0;
        while (k < i1) 
        {
            if (obj[k] != null)
            {
                Codeword codeword = obj[k];
                codeword.setRowNumberAsRowIndicatorColumn();
                int j1 = codeword.getRowNumber() - j;
                if (j1 == 0)
                {
                    i++;
                } else
                if (j1 == 1)
                {
                    l = Math.max(l, i);
                    i = 1;
                    j = codeword.getRowNumber();
                } else
                if (codeword.getRowNumber() >= barcodemetadata.getRowCount())
                {
                    obj[k] = null;
                } else
                {
                    j = codeword.getRowNumber();
                    i = 1;
                }
            }
            k++;
        }
        return (int)((double)f + 0.5D);
    }

    BarcodeMetadata getBarcodeMetadata()
    {
        Codeword acodeword[];
        Object obj;
        BarcodeValue barcodevalue;
        BarcodeValue barcodevalue1;
        BarcodeValue barcodevalue2;
        int i;
        int l;
        acodeword = getCodewords();
        obj = new BarcodeValue();
        barcodevalue = new BarcodeValue();
        barcodevalue1 = new BarcodeValue();
        barcodevalue2 = new BarcodeValue();
        l = acodeword.length;
        i = 0;
_L5:
        if (i >= l) goto _L2; else goto _L1
_L1:
        Codeword codeword = acodeword[i];
        if (codeword != null) goto _L4; else goto _L3
_L3:
        i++;
          goto _L5
_L4:
        codeword.setRowNumberAsRowIndicatorColumn();
        int i1 = codeword.getValue() % 30;
        int k = codeword.getRowNumber();
        int j = k;
        if (!isLeft)
        {
            j = k + 2;
        }
        switch (j % 3)
        {
        case 0: // '\0'
            barcodevalue.setValue(i1 * 3 + 1);
            break;

        case 1: // '\001'
            barcodevalue2.setValue(i1 / 3);
            barcodevalue1.setValue(i1 % 3);
            break;

        case 2: // '\002'
            ((BarcodeValue) (obj)).setValue(i1 + 1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (((BarcodeValue) (obj)).getValue().length == 0 || barcodevalue.getValue().length == 0 || barcodevalue1.getValue().length == 0 || barcodevalue2.getValue().length == 0 || ((BarcodeValue) (obj)).getValue()[0] < 1 || barcodevalue.getValue()[0] + barcodevalue1.getValue()[0] < 3 || barcodevalue.getValue()[0] + barcodevalue1.getValue()[0] > 90)
        {
            return null;
        } else
        {
            obj = new BarcodeMetadata(((BarcodeValue) (obj)).getValue()[0], barcodevalue.getValue()[0], barcodevalue1.getValue()[0], barcodevalue2.getValue()[0]);
            removeIncorrectCodewords(acodeword, ((BarcodeMetadata) (obj)));
            return ((BarcodeMetadata) (obj));
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    int[] getRowHeights()
    {
        Object obj = getBarcodeMetadata();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return ((int []) (obj));
_L2:
        adjustIncompleteIndicatorColumnRowNumbers(((BarcodeMetadata) (obj)));
        int ai[] = new int[((BarcodeMetadata) (obj)).getRowCount()];
        Codeword acodeword[] = getCodewords();
        int j = acodeword.length;
        int i = 0;
        do
        {
            obj = ai;
            if (i >= j)
            {
                continue;
            }
            obj = acodeword[i];
            if (obj != null)
            {
                int k = ((Codeword) (obj)).getRowNumber();
                ai[k] = ai[k] + 1;
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    boolean isLeft()
    {
        return isLeft;
    }

    void setRowNumbers()
    {
        Codeword acodeword[] = getCodewords();
        int j = acodeword.length;
        for (int i = 0; i < j; i++)
        {
            Codeword codeword = acodeword[i];
            if (codeword != null)
            {
                codeword.setRowNumberAsRowIndicatorColumn();
            }
        }

    }

    public String toString()
    {
        return (new StringBuilder()).append("IsLeft: ").append(isLeft).append('\n').append(super.toString()).toString();
    }
}
