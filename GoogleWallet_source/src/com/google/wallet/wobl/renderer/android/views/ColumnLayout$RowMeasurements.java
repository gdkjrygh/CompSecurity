// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android.views;


// Referenced classes of package com.google.wallet.wobl.renderer.android.views:
//            ColumnLayout

static class heights
{

    final int count;
    final int heights[];
    final int positions[];
    int totalHeight;

    void align(int i, int j)
    {
        int k = i - totalHeight;
        if (k >= 0) goto _L2; else goto _L1
_L1:
label0:
        {
            j = count - 1;
            do
            {
                if (j < 0)
                {
                    break label0;
                }
                k += heights[j];
                positions[j + 1] = i;
                if (k >= 0)
                {
                    break;
                }
                heights[j] = 0;
                j--;
            } while (true);
            heights[j] = k;
        }
_L4:
        return;
_L2:
        if (k <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        switch (j)
        {
        default:
            i = 0;
            break;

        case 16: // '\020'
            break; /* Loop/switch isn't completed */

        case 80: // 'P'
            break MISSING_BLOCK_LABEL_149;
        }
_L5:
        if (i > 0)
        {
            j = 0;
            while (j < positions.length) 
            {
                int ai[] = positions;
                ai[j] = ai[j] + i;
                j++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        i = k >> 1;
          goto _L5
        i = k;
          goto _L5
    }

    (int i)
    {
        count = i;
        positions = new int[i + 1];
        heights = new int[i];
    }
}
