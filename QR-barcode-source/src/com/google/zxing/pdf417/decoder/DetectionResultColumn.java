// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;

import java.util.Formatter;

// Referenced classes of package com.google.zxing.pdf417.decoder:
//            BoundingBox, Codeword

class DetectionResultColumn
{

    private static final int MAX_NEARBY_DISTANCE = 5;
    private final BoundingBox boundingBox;
    private final Codeword codewords[];

    DetectionResultColumn(BoundingBox boundingbox)
    {
        boundingBox = new BoundingBox(boundingbox);
        codewords = new Codeword[(boundingbox.getMaxY() - boundingbox.getMinY()) + 1];
    }

    final int codewordIndexToImageRow(int i)
    {
        return boundingBox.getMinY() + i;
    }

    final BoundingBox getBoundingBox()
    {
        return boundingBox;
    }

    final Codeword getCodeword(int i)
    {
        return codewords[imageRowToCodewordIndex(i)];
    }

    final Codeword getCodewordNearby(int i)
    {
        Codeword codeword = getCodeword(i);
        if (codeword == null) goto _L2; else goto _L1
_L1:
        return codeword;
_L2:
        int j = 1;
_L7:
        if (j >= 5) goto _L4; else goto _L3
_L3:
        Codeword codeword1;
        int k = imageRowToCodewordIndex(i) - j;
        if (k < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        codeword1 = codewords[k];
        codeword = codeword1;
        if (codeword1 != null) goto _L1; else goto _L5
_L5:
        int l = imageRowToCodewordIndex(i) + j;
        if (l >= codewords.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        codeword1 = codewords[l];
        codeword = codeword1;
        if (codeword1 != null) goto _L1; else goto _L6
_L6:
        j++;
          goto _L7
_L4:
        return null;
    }

    final Codeword[] getCodewords()
    {
        return codewords;
    }

    final int imageRowToCodewordIndex(int i)
    {
        return i - boundingBox.getMinY();
    }

    final void setCodeword(int i, Codeword codeword)
    {
        codewords[imageRowToCodewordIndex(i)] = codeword;
    }

    public String toString()
    {
        Formatter formatter = new Formatter();
        Codeword acodeword[] = codewords;
        int i1 = acodeword.length;
        int j = 0;
        int i = 0;
        while (j < i1) 
        {
            Codeword codeword = acodeword[j];
            if (codeword == null)
            {
                int k = i + 1;
                formatter.format("%3d:    |   \n", new Object[] {
                    Integer.valueOf(i)
                });
                i = k;
            } else
            {
                int l = i + 1;
                formatter.format("%3d: %3d|%3d\n", new Object[] {
                    Integer.valueOf(i), Integer.valueOf(codeword.getRowNumber()), Integer.valueOf(codeword.getValue())
                });
                i = l;
            }
            j++;
        }
        String s = formatter.toString();
        formatter.close();
        return s;
    }
}
