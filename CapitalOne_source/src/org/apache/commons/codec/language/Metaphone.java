// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

public class Metaphone
    implements StringEncoder
{

    private static final String FRONTV = "EIY";
    private static final String VARSON = "CSPTG";
    private static final String VOWELS = "AEIOU";
    private int maxCodeLen;

    public Metaphone()
    {
        maxCodeLen = 4;
    }

    private boolean isLastChar(int i, int j)
    {
        return j + 1 == i;
    }

    private boolean isNextChar(StringBuilder stringbuilder, int i, char c)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (i >= 0)
            {
                flag = flag1;
                if (i < stringbuilder.length() - 1)
                {
                    if (stringbuilder.charAt(i + 1) != c)
                    {
                        break label0;
                    }
                    flag = true;
                }
            }
            return flag;
        }
        return false;
    }

    private boolean isPreviousChar(StringBuilder stringbuilder, int i, char c)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (i > 0)
            {
                flag = flag1;
                if (i < stringbuilder.length())
                {
                    if (stringbuilder.charAt(i - 1) != c)
                    {
                        break label0;
                    }
                    flag = true;
                }
            }
            return flag;
        }
        return false;
    }

    private boolean isVowel(StringBuilder stringbuilder, int i)
    {
        return "AEIOU".indexOf(stringbuilder.charAt(i)) >= 0;
    }

    private boolean regionMatch(StringBuilder stringbuilder, int i, String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (i >= 0)
        {
            flag = flag1;
            if ((s.length() + i) - 1 < stringbuilder.length())
            {
                flag = stringbuilder.substring(i, s.length() + i).equals(s);
            }
        }
        return flag;
    }

    public Object encode(Object obj)
        throws EncoderException
    {
        if (!(obj instanceof String))
        {
            throw new EncoderException("Parameter supplied to Metaphone encode is not of type java.lang.String");
        } else
        {
            return metaphone((String)obj);
        }
    }

    public String encode(String s)
    {
        return metaphone(s);
    }

    public int getMaxCodeLen()
    {
        return maxCodeLen;
    }

    public boolean isMetaphoneEqual(String s, String s1)
    {
        return metaphone(s).equals(metaphone(s1));
    }

    public String metaphone(String s)
    {
        StringBuilder stringbuilder;
        StringBuilder stringbuilder1;
        if (s == null || s.length() == 0)
        {
            return "";
        }
        if (s.length() == 1)
        {
            return s.toUpperCase(Locale.ENGLISH);
        }
        s = s.toUpperCase(Locale.ENGLISH).toCharArray();
        stringbuilder = new StringBuilder(40);
        stringbuilder1 = new StringBuilder(10);
        s[0];
        JVM INSTR lookupswitch 6: default 124
    //                   65: 251
    //                   71: 220
    //                   75: 220
    //                   80: 220
    //                   87: 282
    //                   88: 342;
           goto _L1 _L2 _L3 _L3 _L3 _L4 _L5
_L1:
        stringbuilder.append(s);
_L9:
        int k;
        k = stringbuilder.length();
_L8:
        char c;
        int i;
        for (i = 0; stringbuilder1.length() >= getMaxCodeLen() || i >= k;)
        {
            break MISSING_BLOCK_LABEL_1495;
        }

        c = stringbuilder.charAt(i);
        if (c == 'C' || !isPreviousChar(stringbuilder, i, c)) goto _L7; else goto _L6
_L6:
        int j = i + 1;
_L27:
        i = j;
        if (stringbuilder1.length() > getMaxCodeLen())
        {
            stringbuilder1.setLength(getMaxCodeLen());
            i = j;
        }
          goto _L8
_L3:
        if (s[1] == 'N')
        {
            stringbuilder.append(s, 1, s.length - 1);
        } else
        {
            stringbuilder.append(s);
        }
          goto _L9
_L2:
        if (s[1] == 'E')
        {
            stringbuilder.append(s, 1, s.length - 1);
        } else
        {
            stringbuilder.append(s);
        }
          goto _L9
_L4:
        if (s[1] == 'R')
        {
            stringbuilder.append(s, 1, s.length - 1);
        } else
        if (s[1] == 'H')
        {
            stringbuilder.append(s, 1, s.length - 1);
            stringbuilder.setCharAt(0, 'W');
        } else
        {
            stringbuilder.append(s);
        }
          goto _L9
_L5:
        s[0] = 'S';
        stringbuilder.append(s);
          goto _L9
_L7:
        c;
        JVM INSTR tableswitch 65 90: default 476
    //                   65 489
    //                   66 512
    //                   67 553
    //                   68 781
    //                   69 489
    //                   70 1115
    //                   71 854
    //                   72 1044
    //                   73 489
    //                   74 1115
    //                   75 1129
    //                   76 1115
    //                   77 1115
    //                   78 1115
    //                   79 489
    //                   80 1178
    //                   81 1219
    //                   82 1115
    //                   83 1234
    //                   84 1300
    //                   85 489
    //                   86 1397
    //                   87 1412
    //                   88 1457
    //                   89 1412
    //                   90 1480;
           goto _L10 _L11 _L12 _L13 _L14 _L11 _L15 _L16 _L17 _L11 _L15 _L18 _L15 _L15 _L15 _L11 _L19 _L20 _L15 _L21 _L22 _L11 _L23 _L24 _L25 _L24 _L26
_L26:
        break MISSING_BLOCK_LABEL_1480;
_L10:
        j = i;
_L28:
        j++;
          goto _L27
_L11:
        j = i;
        if (i == 0)
        {
            stringbuilder1.append(c);
            j = i;
        }
          goto _L28
_L12:
        if (!isPreviousChar(stringbuilder, i, 'M')) goto _L30; else goto _L29
_L29:
        j = i;
        if (isLastChar(k, i)) goto _L28; else goto _L30
_L30:
        stringbuilder1.append(c);
        j = i;
          goto _L28
_L13:
        if (!isPreviousChar(stringbuilder, i, 'S') || isLastChar(k, i)) goto _L32; else goto _L31
_L31:
        j = i;
        if ("EIY".indexOf(stringbuilder.charAt(i + 1)) >= 0) goto _L28; else goto _L32
_L32:
        if (regionMatch(stringbuilder, i, "CIA"))
        {
            stringbuilder1.append('X');
            j = i;
        } else
        if (!isLastChar(k, i) && "EIY".indexOf(stringbuilder.charAt(i + 1)) >= 0)
        {
            stringbuilder1.append('S');
            j = i;
        } else
        if (isPreviousChar(stringbuilder, i, 'S') && isNextChar(stringbuilder, i, 'H'))
        {
            stringbuilder1.append('K');
            j = i;
        } else
        if (isNextChar(stringbuilder, i, 'H'))
        {
            if (i == 0 && k >= 3 && isVowel(stringbuilder, 2))
            {
                stringbuilder1.append('K');
                j = i;
            } else
            {
                stringbuilder1.append('X');
                j = i;
            }
        } else
        {
            stringbuilder1.append('K');
            j = i;
        }
          goto _L28
_L14:
        if (!isLastChar(k, i + 1) && isNextChar(stringbuilder, i, 'G') && "EIY".indexOf(stringbuilder.charAt(i + 2)) >= 0)
        {
            stringbuilder1.append('J');
            j = i + 2;
        } else
        {
            stringbuilder1.append('T');
            j = i;
        }
          goto _L28
_L16:
        if (!isLastChar(k, i + 1)) goto _L34; else goto _L33
_L33:
        j = i;
        if (isNextChar(stringbuilder, i, 'H')) goto _L28; else goto _L34
_L34:
        if (isLastChar(k, i + 1) || !isNextChar(stringbuilder, i, 'H')) goto _L36; else goto _L35
_L35:
        j = i;
        if (!isVowel(stringbuilder, i + 2)) goto _L28; else goto _L36
_L36:
        if (i <= 0) goto _L38; else goto _L37
_L37:
        j = i;
        if (regionMatch(stringbuilder, i, "GN")) goto _L28; else goto _L39
_L39:
        j = i;
        if (regionMatch(stringbuilder, i, "GNED")) goto _L28; else goto _L38
_L38:
        if (isPreviousChar(stringbuilder, i, 'G'))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (!isLastChar(k, i) && "EIY".indexOf(stringbuilder.charAt(i + 1)) >= 0 && j == 0)
        {
            stringbuilder1.append('J');
            j = i;
        } else
        {
            stringbuilder1.append('K');
            j = i;
        }
          goto _L28
_L17:
        j = i;
        if (isLastChar(k, i)) goto _L28; else goto _L40
_L40:
        if (i <= 0) goto _L42; else goto _L41
_L41:
        j = i;
        if ("CSPTG".indexOf(stringbuilder.charAt(i - 1)) >= 0) goto _L28; else goto _L42
_L42:
        j = i;
        if (isVowel(stringbuilder, i + 1))
        {
            stringbuilder1.append('H');
            j = i;
        }
          goto _L28
_L15:
        stringbuilder1.append(c);
        j = i;
          goto _L28
_L18:
        if (i > 0)
        {
            j = i;
            if (!isPreviousChar(stringbuilder, i, 'C'))
            {
                stringbuilder1.append(c);
                j = i;
            }
        } else
        {
            stringbuilder1.append(c);
            j = i;
        }
          goto _L28
_L19:
        if (isNextChar(stringbuilder, i, 'H'))
        {
            stringbuilder1.append('F');
            j = i;
        } else
        {
            stringbuilder1.append(c);
            j = i;
        }
          goto _L28
_L20:
        stringbuilder1.append('K');
        j = i;
          goto _L28
_L21:
        if (regionMatch(stringbuilder, i, "SH") || regionMatch(stringbuilder, i, "SIO") || regionMatch(stringbuilder, i, "SIA"))
        {
            stringbuilder1.append('X');
            j = i;
        } else
        {
            stringbuilder1.append('S');
            j = i;
        }
          goto _L28
_L22:
        if (regionMatch(stringbuilder, i, "TIA") || regionMatch(stringbuilder, i, "TIO"))
        {
            stringbuilder1.append('X');
            j = i;
        } else
        {
            j = i;
            if (!regionMatch(stringbuilder, i, "TCH"))
            {
                if (regionMatch(stringbuilder, i, "TH"))
                {
                    stringbuilder1.append('0');
                    j = i;
                } else
                {
                    stringbuilder1.append('T');
                    j = i;
                }
            }
        }
          goto _L28
_L23:
        stringbuilder1.append('F');
        j = i;
          goto _L28
_L24:
        j = i;
        if (!isLastChar(k, i))
        {
            j = i;
            if (isVowel(stringbuilder, i + 1))
            {
                stringbuilder1.append(c);
                j = i;
            }
        }
          goto _L28
_L25:
        stringbuilder1.append('K');
        stringbuilder1.append('S');
        j = i;
          goto _L28
        stringbuilder1.append('S');
        j = i;
          goto _L28
        return stringbuilder1.toString();
          goto _L8
    }

    public void setMaxCodeLen(int i)
    {
        maxCodeLen = i;
    }
}
