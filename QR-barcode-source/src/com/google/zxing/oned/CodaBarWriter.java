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
        int k;
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
        k = 1;
        while (k < s.length() - 1) 
        {
            if (Character.isDigit(s.charAt(k)) || s.charAt(k) == '-' || s.charAt(k) == '$')
            {
                i += 9;
            } else
            {
                char c1 = s.charAt(k);
                if (CodaBarReader.arrayContains(new char[] {
    '/', ':', '+', '.'
}, c1))
                {
                    i += 10;
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Cannot encode : '").append(s.charAt(k)).append('\'').toString());
                }
            }
            k++;
        }
        aflag = new boolean[(s.length() - 1) + i];
        i1 = 0;
        k = 0;
_L10:
        if (i1 >= s.length()) goto _L2; else goto _L1
_L1:
        int j;
        int l;
        l = Character.toUpperCase(s.charAt(i1));
        j = l;
        if (i1 != s.length() - 1) goto _L4; else goto _L3
_L3:
        l;
        JVM INSTR lookupswitch 4: default 404
    //                   42: 525
    //                   69: 532
    //                   78: 518
    //                   84: 511;
           goto _L5 _L6 _L7 _L8 _L9
_L5:
        int j1;
        boolean flag2;
        j = l;
        break; /* Loop/switch isn't completed */
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
_L4:
        l = 0;
        do
        {
            if (l >= CodaBarReader.ALPHABET.length)
            {
                break MISSING_BLOCK_LABEL_602;
            }
            int k1;
            if (j == CodaBarReader.ALPHABET[l])
            {
                j1 = CodaBarReader.CHARACTER_ENCODINGS[l];
                break MISSING_BLOCK_LABEL_439;
            }
            l++;
        } while (true);
_L11:
        k1 = 0;
        l = 0;
        flag2 = true;
        j = k;
        while (k1 < 7) 
        {
            aflag[j] = flag2;
            j++;
            if ((j1 >> 6 - k1 & 1) == 0 || l == 1)
            {
                if (!flag2)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                k1++;
                l = 0;
            } else
            {
                l++;
            }
        }
        k = j;
        if (i1 < s.length() - 1)
        {
            aflag[j] = false;
            k = j + 1;
        }
        i1++;
          goto _L10
_L2:
        return aflag;
        j1 = 0;
          goto _L11
    }

}
