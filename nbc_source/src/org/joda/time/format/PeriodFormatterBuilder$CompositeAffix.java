// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package org.joda.time.format:
//            PeriodFormatterBuilder

static class iLeftRightCombinations extends iLeftRightCombinations
{

    private final x iLeft;
    private final String iLeftRightCombinations[];
    private final x iRight;

    public int calculatePrintedLength(int i)
    {
        return iLeft.calculatePrintedLength(i) + iRight.calculatePrintedLength(i);
    }

    public String[] getAffixes()
    {
        return (String[])iLeftRightCombinations.clone();
    }

    public int parse(String s, int i)
    {
        int k = iLeft.parse(s, i);
        int j = k;
        if (k >= 0)
        {
            k = iRight.parse(s, k);
            j = k;
            if (k >= 0)
            {
                j = k;
                if (matchesOtherAffix(parse(s, k) - k, s, i))
                {
                    j = ~i;
                }
            }
        }
        return j;
    }

    public void printTo(Writer writer, int i)
        throws IOException
    {
        iLeft.printTo(writer, i);
        iRight.printTo(writer, i);
    }

    public void printTo(StringBuffer stringbuffer, int i)
    {
        iLeft.printTo(stringbuffer, i);
        iRight.printTo(stringbuffer, i);
    }

    public int scan(String s, int i)
    {
        int j = iLeft.scan(s, i);
        if (j >= 0)
        {
            int k = iRight.scan(s, iLeft.parse(s, j));
            if (k < 0 || !matchesOtherAffix(iRight.parse(s, k) - j, s, i))
            {
                if (j > 0)
                {
                    return j;
                } else
                {
                    return k;
                }
            }
        }
        return ~i;
    }

    x(x x, x x1)
    {
        iLeft = x;
        iRight = x1;
        x = new HashSet();
        x1 = iLeft.getAffixes();
        int k = x1.length;
        for (int i = 0; i < k; i++)
        {
            String s = x1[i];
            String as[] = iRight.getAffixes();
            int l = as.length;
            for (int j = 0; j < l; j++)
            {
                String s1 = as[j];
                x.add((new StringBuilder()).append(s).append(s1).toString());
            }

        }

        iLeftRightCombinations = (String[])x.toArray(new String[x.size()]);
    }
}
