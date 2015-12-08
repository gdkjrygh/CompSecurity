// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import java.util.Arrays;

// Referenced classes of package com.google.zxing.oned:
//            OneDimensionalCodeWriter, CodaBarReader

public final class CodaBarWriter extends OneDimensionalCodeWriter
{

    private static final char ALT_START_END_CHARS[] = {
        'T', 'N', '*', 'E'
    };
    private static final char START_END_CHARS[] = {
        'A', 'B', 'C', 'D'
    };

    public CodaBarWriter()
    {
    }

    public boolean[] encode(String s)
    {
        boolean aflag[];
        int l;
        int i1;
        if (s.length() < 2)
        {
            throw new IllegalArgumentException("Codabar should start/end with start/stop symbols");
        }
        char c = Character.toUpperCase(s.charAt(0));
        char c2 = Character.toUpperCase(s.charAt(s.length() - 1));
        boolean flag;
        boolean flag1;
        if (CodaBarReader.arrayContains(START_END_CHARS, c) && CodaBarReader.arrayContains(START_END_CHARS, c2))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (CodaBarReader.arrayContains(ALT_START_END_CHARS, c) && CodaBarReader.arrayContains(ALT_START_END_CHARS, c2))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag && !flag1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Codabar should start/end with ").append(Arrays.toString(START_END_CHARS)).append(", or start/end with ").append(Arrays.toString(ALT_START_END_CHARS)).toString());
        }
        int i = 20;
        l = 1;
        while (l < s.length() - 1) 
        {
            if (Character.isDigit(s.charAt(l)) || s.charAt(l) == '-' || s.charAt(l) == '$')
            {
                i += 9;
            } else
            {
                char c1 = s.charAt(l);
                if (CodaBarReader.arrayContains(new char[] {
    '/', ':', '+', '.'
}, c1))
                {
                    i += 10;
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Cannot encode : '").append(s.charAt(l)).append('\'').toString());
                }
            }
            l++;
        }
        aflag = new boolean[i + (s.length() - 1)];
        l = 0;
        i1 = 0;
_L11:
        if (i1 >= s.length()) goto _L2; else goto _L1
_L1:
        int j;
        char c3;
        c3 = Character.toUpperCase(s.charAt(i1));
        j = c3;
        if (i1 != s.length() - 1) goto _L4; else goto _L3
_L3:
        c3;
        JVM INSTR lookupswitch 4: default 404
    //                   42: 528
    //                   69: 535
    //                   78: 521
    //                   84: 514;
           goto _L5 _L6 _L7 _L8 _L9
_L5:
        j = c3;
_L4:
        int k1;
        boolean flag2;
        flag2 = false;
        k1 = 0;
_L10:
        int j1 = ((flag2) ? 1 : 0);
        if (k1 < CodaBarReader.ALPHABET.length)
        {
            if (j != CodaBarReader.ALPHABET[k1])
            {
                break MISSING_BLOCK_LABEL_542;
            }
            j1 = CodaBarReader.CHARACTER_ENCODINGS[k1];
        }
        boolean flag3 = true;
        j = 0;
        for (k1 = 0; k1 < 7;)
        {
            aflag[l] = flag3;
            l++;
            if ((j1 >> 6 - k1 & 1) == 0 || j == true)
            {
                if (!flag3)
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                k1++;
                j = 0;
            } else
            {
                j++;
            }
        }

        break MISSING_BLOCK_LABEL_566;
_L9:
        j = 65;
          goto _L4
_L8:
        j = 66;
          goto _L4
_L6:
        j = 67;
          goto _L4
_L7:
        j = 68;
          goto _L4
        k1++;
          goto _L10
        int k = l;
        if (i1 < s.length() - 1)
        {
            aflag[l] = false;
            k = l + 1;
        }
        i1++;
        l = k;
          goto _L11
_L2:
        return aflag;
    }

}
