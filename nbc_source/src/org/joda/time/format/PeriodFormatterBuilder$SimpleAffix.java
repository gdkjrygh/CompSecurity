// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;

// Referenced classes of package org.joda.time.format:
//            PeriodFormatterBuilder

static class iText extends ix
{

    private final String iText;

    public int calculatePrintedLength(int i)
    {
        return iText.length();
    }

    public String[] getAffixes()
    {
        return (new String[] {
            iText
        });
    }

    public int parse(String s, int i)
    {
        String s1 = iText;
        int j = s1.length();
        if (s.regionMatches(true, i, s1, 0, j) && !matchesOtherAffix(j, s, i))
        {
            return i + j;
        } else
        {
            return ~i;
        }
    }

    public void printTo(Writer writer, int i)
        throws IOException
    {
        writer.write(iText);
    }

    public void printTo(StringBuffer stringbuffer, int i)
    {
        stringbuffer.append(iText);
    }

    public int scan(String s, int i)
    {
        String s1;
        int j;
        int k;
        int l;
        s1 = iText;
        k = s1.length();
        l = s.length();
        j = i;
_L5:
        if (j >= l) goto _L2; else goto _L1
_L1:
        if (s.regionMatches(true, j, s1, 0, k) && !matchesOtherAffix(k, s, j))
        {
            return j;
        }
        s.charAt(j);
        JVM INSTR tableswitch 43 57: default 136
    //                   43 140
    //                   44 140
    //                   45 140
    //                   46 140
    //                   47 136
    //                   48 140
    //                   49 140
    //                   50 140
    //                   51 140
    //                   52 140
    //                   53 140
    //                   54 140
    //                   55 140
    //                   56 140
    //                   57 140;
           goto _L2 _L3 _L3 _L3 _L3 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3
_L2:
        return ~i;
_L3:
        j++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    ix(String s)
    {
        iText = s;
    }
}
