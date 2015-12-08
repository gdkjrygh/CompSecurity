// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded;

import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.DataCharacter;
import java.util.List;

// Referenced classes of package com.google.zxing.oned.rss.expanded:
//            ExpandedPair

final class BitArrayBuilder
{

    private BitArrayBuilder()
    {
    }

    static BitArray buildBitArray(List list)
    {
        int i = (list.size() << 1) - 1;
        if (((ExpandedPair)list.get(list.size() - 1)).getRightChar() == null)
        {
            i--;
        }
        BitArray bitarray = new BitArray(i * 12);
        int i1 = ((ExpandedPair)list.get(0)).getRightChar().getValue();
        int j = 11;
        for (i = 0; j >= 0; i++)
        {
            if ((1 << j & i1) != 0)
            {
                bitarray.set(i);
            }
            j--;
        }

        for (int j1 = 1; j1 < list.size();)
        {
            ExpandedPair expandedpair = (ExpandedPair)list.get(j1);
            int k1 = expandedpair.getLeftChar().getValue();
            for (int k = 11; k >= 0;)
            {
                if ((1 << k & k1) != 0)
                {
                    bitarray.set(i);
                }
                k--;
                i++;
            }

            int l = i;
            if (expandedpair.getRightChar() != null)
            {
                int i2 = expandedpair.getRightChar().getValue();
                int l1 = 11;
                do
                {
                    l = i;
                    if (l1 < 0)
                    {
                        break;
                    }
                    if ((1 << l1 & i2) != 0)
                    {
                        bitarray.set(i);
                    }
                    i++;
                    l1--;
                } while (true);
            }
            j1++;
            i = l;
        }

        return bitarray;
    }
}
