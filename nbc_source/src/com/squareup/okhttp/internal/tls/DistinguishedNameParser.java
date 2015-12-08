// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.tls;

import javax.security.auth.x500.X500Principal;

final class DistinguishedNameParser
{

    private int beg;
    private char chars[];
    private int cur;
    private final String dn;
    private int end;
    private final int length;
    private int pos;

    public DistinguishedNameParser(X500Principal x500principal)
    {
        dn = x500principal.getName("RFC2253");
        length = dn.length();
    }

    private String escapedAV()
    {
        beg = pos;
        end = pos;
        do
        {
label0:
            do
            {
                if (pos >= length)
                {
                    return new String(chars, beg, end - beg);
                }
                switch (chars[pos])
                {
                default:
                    char ac[] = chars;
                    int i = end;
                    end = i + 1;
                    ac[i] = chars[pos];
                    pos = pos + 1;
                    break;

                case 43: // '+'
                case 44: // ','
                case 59: // ';'
                    return new String(chars, beg, end - beg);

                case 92: // '\\'
                    char ac1[] = chars;
                    int j = end;
                    end = j + 1;
                    ac1[j] = getEscaped();
                    pos = pos + 1;
                    break;

                case 32: // ' '
                    cur = end;
                    pos = pos + 1;
                    char ac2[] = chars;
                    int k = end;
                    end = k + 1;
                    ac2[k] = ' ';
                    break label0;
                }
            } while (true);
            for (; pos < length && chars[pos] == ' '; pos = pos + 1)
            {
                char ac3[] = chars;
                int l = end;
                end = l + 1;
                ac3[l] = ' ';
            }

        } while (pos != length && chars[pos] != ',' && chars[pos] != '+' && chars[pos] != ';');
        return new String(chars, beg, cur - beg);
    }

    private int getByte(int i)
    {
        if (i + 1 >= length)
        {
            throw new IllegalStateException((new StringBuilder()).append("Malformed DN: ").append(dn).toString());
        }
        int j = chars[i];
        if (j >= 48 && j <= 57)
        {
            j -= 48;
        } else
        if (j >= 97 && j <= 102)
        {
            j -= 87;
        } else
        if (j >= 65 && j <= 70)
        {
            j -= 55;
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Malformed DN: ").append(dn).toString());
        }
_L6:
        i = chars[i + 1];
        if (i < 48 || i > 57) goto _L2; else goto _L1
_L1:
        i -= 48;
_L4:
        return (j << 4) + i;
_L2:
        if (i >= 97 && i <= 102)
        {
            i -= 87;
            continue; /* Loop/switch isn't completed */
        }
        if (i < 65 || i > 70)
        {
            break; /* Loop/switch isn't completed */
        }
        i -= 55;
        if (true) goto _L4; else goto _L3
_L3:
        throw new IllegalStateException((new StringBuilder()).append("Malformed DN: ").append(dn).toString());
        if (true) goto _L6; else goto _L5
_L5:
    }

    private char getEscaped()
    {
        pos = pos + 1;
        if (pos == length)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unexpected end of DN: ").append(dn).toString());
        }
        switch (chars[pos])
        {
        default:
            return getUTF8();

        case 32: // ' '
        case 34: // '"'
        case 35: // '#'
        case 37: // '%'
        case 42: // '*'
        case 43: // '+'
        case 44: // ','
        case 59: // ';'
        case 60: // '<'
        case 61: // '='
        case 62: // '>'
        case 92: // '\\'
        case 95: // '_'
            return chars[pos];
        }
    }

    private char getUTF8()
    {
        byte byte0;
        int i;
        byte0 = 63;
        i = getByte(pos);
        pos = pos + 1;
        if (i >= 128) goto _L2; else goto _L1
_L1:
        char c = (char)i;
_L4:
        return c;
_L2:
        c = byte0;
        if (i < 192) goto _L4; else goto _L3
_L3:
        c = byte0;
        if (i > 247) goto _L4; else goto _L5
_L5:
        int k;
        int j;
        int l;
        if (i <= 223)
        {
            j = 1;
            i &= 0x1f;
        } else
        if (i <= 239)
        {
            j = 2;
            i &= 0xf;
        } else
        {
            j = 3;
            i &= 7;
        }
        l = 0;
        k = i;
        i = l;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        pos = pos + 1;
        c = byte0;
        if (pos == length) goto _L4; else goto _L6
_L6:
        c = byte0;
        if (chars[pos] != '\\') goto _L4; else goto _L7
_L7:
        pos = pos + 1;
        l = getByte(pos);
        pos = pos + 1;
        c = byte0;
        if ((l & 0xc0) != 128) goto _L4; else goto _L8
_L8:
        k = (k << 6) + (l & 0x3f);
        i++;
        break MISSING_BLOCK_LABEL_76;
        return (char)k;
    }

    private String hexAV()
    {
        if (pos + 4 >= length)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unexpected end of DN: ").append(dn).toString());
        }
        beg = pos;
        pos = pos + 1;
_L6:
        if (pos != length && chars[pos] != '+' && chars[pos] != ',' && chars[pos] != ';') goto _L2; else goto _L1
_L1:
        end = pos;
_L4:
        int l;
        l = end - beg;
        if (l < 5 || (l & 1) == 0)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unexpected end of DN: ").append(dn).toString());
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (chars[pos] != ' ')
        {
            break; /* Loop/switch isn't completed */
        }
        end = pos;
        pos = pos + 1;
        while (pos < length && chars[pos] == ' ') 
        {
            pos = pos + 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (chars[pos] >= 'A' && chars[pos] <= 'F')
        {
            char ac[] = chars;
            int i = pos;
            ac[i] = (char)(ac[i] + 32);
        }
        pos = pos + 1;
        if (true) goto _L6; else goto _L5
_L5:
        byte abyte0[] = new byte[l / 2];
        int j = 0;
        int k = beg + 1;
        for (; j < abyte0.length; j++)
        {
            abyte0[j] = (byte)getByte(k);
            k += 2;
        }

        return new String(chars, beg, l);
    }

    private String nextAT()
    {
        for (; pos < length && chars[pos] == ' '; pos = pos + 1) { }
        if (pos == length)
        {
            return null;
        }
        beg = pos;
        for (pos = pos + 1; pos < length && chars[pos] != '=' && chars[pos] != ' '; pos = pos + 1) { }
        if (pos >= length)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unexpected end of DN: ").append(dn).toString());
        }
        end = pos;
        if (chars[pos] == ' ')
        {
            for (; pos < length && chars[pos] != '=' && chars[pos] == ' '; pos = pos + 1) { }
            if (chars[pos] != '=' || pos == length)
            {
                throw new IllegalStateException((new StringBuilder()).append("Unexpected end of DN: ").append(dn).toString());
            }
        }
        for (pos = pos + 1; pos < length && chars[pos] == ' '; pos = pos + 1) { }
        if (end - beg > 4 && chars[beg + 3] == '.' && (chars[beg] == 'O' || chars[beg] == 'o') && (chars[beg + 1] == 'I' || chars[beg + 1] == 'i') && (chars[beg + 2] == 'D' || chars[beg + 2] == 'd'))
        {
            beg = beg + 4;
        }
        return new String(chars, beg, end - beg);
    }

    private String quotedAV()
    {
        pos = pos + 1;
        beg = pos;
        end = beg;
        do
        {
            if (pos == length)
            {
                throw new IllegalStateException((new StringBuilder()).append("Unexpected end of DN: ").append(dn).toString());
            }
            if (chars[pos] == '"')
            {
                for (pos = pos + 1; pos < length && chars[pos] == ' '; pos = pos + 1) { }
                break;
            }
            if (chars[pos] == '\\')
            {
                chars[end] = getEscaped();
            } else
            {
                chars[end] = chars[pos];
            }
            pos = pos + 1;
            end = end + 1;
        } while (true);
        return new String(chars, beg, end - beg);
    }

    public String findMostSpecific(String s)
    {
        String s1;
        String s3;
        pos = 0;
        beg = 0;
        end = 0;
        cur = 0;
        chars = dn.toCharArray();
        s1 = nextAT();
        s3 = s1;
        if (s1 != null) goto _L2; else goto _L1
_L1:
        s1 = null;
_L8:
        return s1;
_L2:
        s1 = "";
        if (pos == length)
        {
            return null;
        }
        chars[pos];
        JVM INSTR lookupswitch 5: default 120
    //                   34: 146
    //                   35: 154
    //                   43: 125
    //                   44: 125
    //                   59: 125;
           goto _L3 _L4 _L5 _L6 _L6 _L6
_L3:
        s1 = escapedAV();
_L6:
        if (s.equalsIgnoreCase(s3)) goto _L8; else goto _L7
_L4:
        s1 = quotedAV();
          goto _L6
_L5:
        s1 = hexAV();
          goto _L6
          goto _L8
_L7:
        if (pos >= length)
        {
            return null;
        }
        if (chars[pos] == ',' || chars[pos] == ';' || chars[pos] == '+')
        {
            pos = pos + 1;
            String s2 = nextAT();
            s3 = s2;
            if (s2 == null)
            {
                throw new IllegalStateException((new StringBuilder()).append("Malformed DN: ").append(dn).toString());
            }
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Malformed DN: ").append(dn).toString());
        }
          goto _L2
    }
}
