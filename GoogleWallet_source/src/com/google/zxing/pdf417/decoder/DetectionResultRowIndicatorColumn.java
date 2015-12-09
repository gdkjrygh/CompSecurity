// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;

import com.google.zxing.ResultPoint;

// Referenced classes of package com.google.zxing.pdf417.decoder:
//            DetectionResultColumn, BoundingBox, BarcodeMetadata, Codeword, 
//            BarcodeValue

final class DetectionResultRowIndicatorColumn extends DetectionResultColumn
{

    private final boolean isLeft;

    DetectionResultRowIndicatorColumn(BoundingBox boundingbox, boolean flag)
    {
        super(boundingbox);
        isLeft = flag;
    }

    private int adjustIncompleteIndicatorColumnRowNumbers(BarcodeMetadata barcodemetadata)
    {
        Object obj1 = getBoundingBox();
        float f;
        Object obj;
        int k;
        int l;
        byte byte0;
        int i1;
        int k1;
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
        k1 = imageRowToCodewordIndex((int)((ResultPoint) (obj1)).getY());
        f = (float)(k1 - k) / (float)barcodemetadata.getRowCount();
        obj = getCodewords();
        byte0 = -1;
        l = 1;
        i1 = 0;
        while (k < k1) 
        {
            int j = byte0;
            int i = i1;
            int j1 = l;
            if (obj[k] != null)
            {
                obj1 = obj[k];
                ((Codeword) (obj1)).setRowNumberAsRowIndicatorColumn();
                i = ((Codeword) (obj1)).getRowNumber() - byte0;
                if (i == 0)
                {
                    i = i1 + 1;
                    j1 = l;
                    j = byte0;
                } else
                if (i == 1)
                {
                    j1 = Math.max(l, i1);
                    i = 1;
                    j = ((Codeword) (obj1)).getRowNumber();
                } else
                if (((Codeword) (obj1)).getRowNumber() >= barcodemetadata.getRowCount())
                {
                    obj[k] = null;
                    j = byte0;
                    i = i1;
                    j1 = l;
                } else
                {
                    j = ((Codeword) (obj1)).getRowNumber();
                    i = 1;
                    j1 = l;
                }
            }
            k++;
            byte0 = j;
            i1 = i;
            l = j1;
        }
        return (int)((double)f + 0.5D);
    }

    private void removeIncorrectCodewords(Codeword acodeword[], BarcodeMetadata barcodemetadata)
    {
        int i = 0;
_L7:
        if (i >= acodeword.length) goto _L2; else goto _L1
_L1:
        Codeword codeword = acodeword[i];
        if (acodeword[i] == null) goto _L4; else goto _L3
_L3:
        int k;
        int l;
        l = codeword.getValue() % 30;
        k = codeword.getRowNumber();
        if (k <= barcodemetadata.getRowCount()) goto _L6; else goto _L5
_L5:
        acodeword[i] = null;
_L4:
        i++;
          goto _L7
_L6:
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
        if (true) goto _L4; else goto _L2
_L2:
    }

    private void setRowNumbers()
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

    final int adjustCompleteIndicatorColumnRowNumbers(BarcodeMetadata barcodemetadata)
    {
        Codeword acodeword[] = getCodewords();
        setRowNumbers();
        removeIncorrectCodewords(acodeword, barcodemetadata);
        Object obj1 = getBoundingBox();
        float f;
        Object obj;
        int k;
        int l;
        int i1;
        int j1;
        int l1;
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
        l1 = imageRowToCodewordIndex((int)((ResultPoint) (obj1)).getY());
        f = (float)(l1 - k) / (float)barcodemetadata.getRowCount();
        i1 = -1;
        l = 1;
        j1 = 0;
        while (k < l1) 
        {
            int j = i1;
            int i = j1;
            int k1 = l;
            if (acodeword[k] != null)
            {
                obj = acodeword[k];
                j = ((Codeword) (obj)).getRowNumber() - i1;
                if (j == 0)
                {
                    i = j1 + 1;
                    k1 = l;
                    j = i1;
                } else
                if (j == 1)
                {
                    k1 = Math.max(l, j1);
                    i = 1;
                    j = ((Codeword) (obj)).getRowNumber();
                } else
                if (j < 0)
                {
                    acodeword[k] = null;
                    j = i1;
                    i = j1;
                    k1 = l;
                } else
                if (((Codeword) (obj)).getRowNumber() >= barcodemetadata.getRowCount())
                {
                    acodeword[k] = null;
                    j = i1;
                    i = j1;
                    k1 = l;
                } else
                if (j > k)
                {
                    acodeword[k] = null;
                    j = i1;
                    i = j1;
                    k1 = l;
                } else
                {
                    if (l > 2)
                    {
                        j = (l - 2) * j;
                    }
                    if (j >= k)
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    k1 = 1;
                    while (k1 <= j && i == 0) 
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
                        j = i1;
                        i = j1;
                        k1 = l;
                    } else
                    {
                        j = ((Codeword) (obj)).getRowNumber();
                        i = 1;
                        k1 = l;
                    }
                }
            }
            k++;
            i1 = j;
            j1 = i;
            l = k1;
        }
        return (int)((double)f + 0.5D);
    }

    final BarcodeMetadata getBarcodeMetadata()
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
_L8:
        Codeword codeword;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        codeword = acodeword[i];
        if (codeword == null) goto _L2; else goto _L1
_L1:
        int j;
        int i1;
        codeword.setRowNumberAsRowIndicatorColumn();
        i1 = codeword.getValue() % 30;
        int k = codeword.getRowNumber();
        j = k;
        if (!isLeft)
        {
            j = k + 2;
        }
        j % 3;
        JVM INSTR tableswitch 0 2: default 132
    //                   0 141
    //                   1 154
    //                   2 175;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_175;
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L2:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        barcodevalue.setValue(i1 * 3 + 1);
          goto _L2
_L5:
        barcodevalue2.setValue(i1 / 3);
        barcodevalue1.setValue(i1 % 3);
          goto _L2
        ((BarcodeValue) (obj)).setValue(i1 + 1);
          goto _L2
        if (((BarcodeValue) (obj)).getValue().length == 0 || barcodevalue.getValue().length == 0 || barcodevalue1.getValue().length == 0 || barcodevalue2.getValue().length == 0 || ((BarcodeValue) (obj)).getValue()[0] <= 0 || barcodevalue.getValue()[0] + barcodevalue1.getValue()[0] < 3 || barcodevalue.getValue()[0] + barcodevalue1.getValue()[0] > 90)
        {
            return null;
        } else
        {
            obj = new BarcodeMetadata(((BarcodeValue) (obj)).getValue()[0], barcodevalue.getValue()[0], barcodevalue1.getValue()[0], barcodevalue2.getValue()[0]);
            removeIncorrectCodewords(acodeword, ((BarcodeMetadata) (obj)));
            return ((BarcodeMetadata) (obj));
        }
    }

    final int[] getRowHeights()
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

    final boolean isLeft()
    {
        return isLeft;
    }

    public final String toString()
    {
        return (new StringBuilder("IsLeft: ")).append(isLeft).append('\n').append(super.toString()).toString();
    }
}
