// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;

// Referenced classes of package org.joda.time.format:
//            PeriodFormatterBuilder

static class iPluralText extends ix
{

    private final String iPluralText;
    private final String iSingularText;

    public int calculatePrintedLength(int i)
    {
        String s;
        if (i == 1)
        {
            s = iSingularText;
        } else
        {
            s = iPluralText;
        }
        return s.length();
    }

    public String[] getAffixes()
    {
        return (new String[] {
            iSingularText, iPluralText
        });
    }

    public int parse(String s, int i)
    {
        String s2 = iPluralText;
        String s1 = iSingularText;
        String s3;
        if (s2.length() < s1.length())
        {
            s3 = s2;
            s2 = s1;
        } else
        {
            s3 = s1;
        }
        if (s.regionMatches(true, i, s2, 0, s2.length()) && !matchesOtherAffix(s2.length(), s, i))
        {
            return s2.length() + i;
        }
        if (s.regionMatches(true, i, s3, 0, s3.length()) && !matchesOtherAffix(s3.length(), s, i))
        {
            return s3.length() + i;
        } else
        {
            return ~i;
        }
    }

    public void printTo(Writer writer, int i)
        throws IOException
    {
        String s;
        if (i == 1)
        {
            s = iSingularText;
        } else
        {
            s = iPluralText;
        }
        writer.write(s);
    }

    public void printTo(StringBuffer stringbuffer, int i)
    {
        String s;
        if (i == 1)
        {
            s = iSingularText;
        } else
        {
            s = iPluralText;
        }
        stringbuffer.append(s);
    }

    public int scan(String s, int i)
    {
        String s1 = iPluralText;
        String s2 = iSingularText;
        int k;
        int l;
        int i1;
        if (s1.length() >= s2.length())
        {
            String s3 = s2;
            s2 = s1;
            s1 = s3;
        }
        k = s2.length();
        l = s1.length();
        i1 = s.length();
        for (int j = i; j < i1; j++)
        {
            while (s.regionMatches(true, j, s2, 0, k) && !matchesOtherAffix(s2.length(), s, j) || s.regionMatches(true, j, s1, 0, l) && !matchesOtherAffix(s1.length(), s, j)) 
            {
                return j;
            }
        }

        return ~i;
    }

    ix(String s, String s1)
    {
        iSingularText = s;
        iPluralText = s1;
    }
}
