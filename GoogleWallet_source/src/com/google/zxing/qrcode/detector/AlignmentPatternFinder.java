// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.zxing.qrcode.detector:
//            AlignmentPattern

final class AlignmentPatternFinder
{

    private final int crossCheckStateCount[] = new int[3];
    private final int height;
    private final BitMatrix image;
    private final float moduleSize;
    private final List possibleCenters = new ArrayList(5);
    private final ResultPointCallback resultPointCallback;
    private final int startX;
    private final int startY;
    private final int width;

    AlignmentPatternFinder(BitMatrix bitmatrix, int i, int j, int k, int l, float f, ResultPointCallback resultpointcallback)
    {
        image = bitmatrix;
        startX = i;
        startY = j;
        width = k;
        height = l;
        moduleSize = f;
        resultPointCallback = resultpointcallback;
    }

    private static float centerFromEnd(int ai[], int i)
    {
        return (float)(i - ai[2]) - (float)ai[1] / 2.0F;
    }

    private float crossCheckVertical(int i, int j, int k, int l)
    {
        BitMatrix bitmatrix = image;
        int j1 = bitmatrix.getHeight();
        int ai[] = crossCheckStateCount;
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        int i1;
        for (i1 = i; i1 >= 0 && bitmatrix.get(j, i1) && ai[1] <= k; i1--)
        {
            ai[1] = ai[1] + 1;
        }

        if (i1 >= 0 && ai[1] <= k)
        {
            for (; i1 >= 0 && !bitmatrix.get(j, i1) && ai[0] <= k; i1--)
            {
                ai[0] = ai[0] + 1;
            }

            if (ai[0] <= k)
            {
                for (i++; i < j1 && bitmatrix.get(j, i) && ai[1] <= k; i++)
                {
                    ai[1] = ai[1] + 1;
                }

                if (i != j1 && ai[1] <= k)
                {
                    for (; i < j1 && !bitmatrix.get(j, i) && ai[2] <= k; i++)
                    {
                        ai[2] = ai[2] + 1;
                    }

                    if (ai[2] <= k && Math.abs((ai[0] + ai[1] + ai[2]) - l) * 5 < l * 2 && foundPatternCross(ai))
                    {
                        return centerFromEnd(ai, i);
                    }
                }
            }
        }
        return (0.0F / 0.0F);
    }

    private boolean foundPatternCross(int ai[])
    {
        float f = moduleSize;
        float f1 = f / 2.0F;
        for (int i = 0; i < 3; i++)
        {
            if (Math.abs(f - (float)ai[i]) >= f1)
            {
                return false;
            }
        }

        return true;
    }

    private AlignmentPattern handlePossibleCenter(int ai[], int i, int j)
    {
        int k = ai[0];
        int l = ai[1];
        int i1 = ai[2];
        float f = centerFromEnd(ai, j);
        float f1 = crossCheckVertical(i, (int)f, ai[1] * 2, k + l + i1);
        if (!Float.isNaN(f1))
        {
            float f2 = (float)(ai[0] + ai[1] + ai[2]) / 3F;
            for (ai = possibleCenters.iterator(); ai.hasNext();)
            {
                AlignmentPattern alignmentpattern = (AlignmentPattern)ai.next();
                if (alignmentpattern.aboutEquals(f2, f1, f))
                {
                    return alignmentpattern.combineEstimate(f1, f, f2);
                }
            }

            ai = new AlignmentPattern(f, f1, f2);
            possibleCenters.add(ai);
            if (resultPointCallback != null)
            {
                ai = resultPointCallback;
            }
        }
        return null;
    }

    final AlignmentPattern find()
        throws NotFoundException
    {
        int ai[];
        int k;
        int i1;
        int j1;
        int k1;
        int l1;
        i1 = startX;
        j1 = height;
        k1 = i1 + width;
        l1 = startY;
        ai = new int[3];
        k = 0;
_L17:
        if (k >= j1) goto _L2; else goto _L1
_L1:
        int i;
        int l;
        int i2;
        if ((k & 1) == 0)
        {
            i = k + 1 >> 1;
        } else
        {
            i = -(k + 1 >> 1);
        }
        i2 = l1 + (j1 >> 1) + i;
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        for (i = i1; i < k1 && !image.get(i, i2); i++) { }
        boolean flag = false;
        l = i;
        i = ((flag) ? 1 : 0);
_L9:
        if (l >= k1) goto _L4; else goto _L3
_L3:
        if (!image.get(l, i2)) goto _L6; else goto _L5
_L5:
        if (i != 1) goto _L8; else goto _L7
_L7:
        ai[i] = ai[i] + 1;
_L15:
        l++;
          goto _L9
_L8:
        if (i != 2) goto _L11; else goto _L10
_L10:
        if (!foundPatternCross(ai)) goto _L13; else goto _L12
_L12:
        AlignmentPattern alignmentpattern = handlePossibleCenter(ai, i2, l);
        if (alignmentpattern == null) goto _L13; else goto _L14
_L14:
        return alignmentpattern;
_L13:
        ai[0] = ai[2];
        ai[1] = 1;
        ai[2] = 0;
        i = 1;
          goto _L15
_L11:
        i++;
        ai[i] = ai[i] + 1;
          goto _L15
_L6:
        int j = i;
        if (i == 1)
        {
            j = i + 1;
        }
        ai[j] = ai[j] + 1;
        i = j;
          goto _L15
_L4:
        AlignmentPattern alignmentpattern1;
        if (!foundPatternCross(ai))
        {
            continue; /* Loop/switch isn't completed */
        }
        alignmentpattern1 = handlePossibleCenter(ai, i2, k1);
        alignmentpattern = alignmentpattern1;
        if (alignmentpattern1 != null) goto _L14; else goto _L16
_L16:
        k++;
          goto _L17
_L2:
        if (!possibleCenters.isEmpty())
        {
            return (AlignmentPattern)possibleCenters.get(0);
        } else
        {
            throw NotFoundException.getNotFoundInstance();
        }
    }
}
