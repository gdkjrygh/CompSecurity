// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package org.joda.time.format:
//            PeriodFormatterBuilder

static class LENGTH_DESC_COMPARATOR extends fix
{

    private static final Comparator LENGTH_DESC_COMPARATOR = new Comparator() {

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((String)obj, (String)obj1);
        }

        public int compare(String s, String s1)
        {
            return s1.length() - s.length();
        }

    };
    private final Pattern iPatterns[];
    private final String iSuffixes[];
    private final String iSuffixesSortedDescByLength[];

    private int selectSuffixIndex(int i)
    {
        for (int j = 0; j < iPatterns.length; j++)
        {
            if (iPatterns[j].matcher(String.valueOf(i)).matches())
            {
                return j;
            }
        }

        return iPatterns.length - 1;
    }

    public int calculatePrintedLength(int i)
    {
        return iSuffixes[selectSuffixIndex(i)].length();
    }

    public String[] getAffixes()
    {
        return (String[])iSuffixes.clone();
    }

    public int parse(String s, int i)
    {
        String as[] = iSuffixesSortedDescByLength;
        int k = as.length;
        for (int j = 0; j < k; j++)
        {
            String s1 = as[j];
            if (s.regionMatches(true, i, s1, 0, s1.length()) && !matchesOtherAffix(s1.length(), s, i))
            {
                return s1.length() + i;
            }
        }

        return ~i;
    }

    public void printTo(Writer writer, int i)
        throws IOException
    {
        writer.write(iSuffixes[selectSuffixIndex(i)]);
    }

    public void printTo(StringBuffer stringbuffer, int i)
    {
        stringbuffer.append(iSuffixes[selectSuffixIndex(i)]);
    }

    public int scan(String s, int i)
    {
        int l = s.length();
        for (int j = i; j < l; j++)
        {
            String as[] = iSuffixesSortedDescByLength;
            int i1 = as.length;
            for (int k = 0; k < i1; k++)
            {
                String s1 = as[k];
                if (s.regionMatches(true, j, s1, 0, s1.length()) && !matchesOtherAffix(s1.length(), s, j))
                {
                    return j;
                }
            }

        }

        return ~i;
    }


    _cls1(String as[], String as1[])
    {
        iSuffixes = (String[])as1.clone();
        iPatterns = new Pattern[as.length];
        for (int i = 0; i < as.length; i++)
        {
            Pattern pattern = (Pattern)PeriodFormatterBuilder.access$200().get(as[i]);
            as1 = pattern;
            if (pattern == null)
            {
                as1 = Pattern.compile(as[i]);
                PeriodFormatterBuilder.access$200().putIfAbsent(as[i], as1);
            }
            iPatterns[i] = as1;
        }

        iSuffixesSortedDescByLength = (String[])iSuffixes.clone();
        Arrays.sort(iSuffixesSortedDescByLength, LENGTH_DESC_COMPARATOR);
    }
}
