// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;


class length
{

    private static final byte DIR_TYPE_CACHE[];
    private static final int DIR_TYPE_CACHE_SIZE = 1792;
    private int charIndex;
    private final boolean isHtml;
    private char lastChar;
    private final int length;
    private final String text;

    private static byte getCachedDirectionality(char c)
    {
        if (c < '\u0700')
        {
            return DIR_TYPE_CACHE[c];
        } else
        {
            return Character.getDirectionality(c);
        }
    }

    private byte skipEntityBackward()
    {
        int i = charIndex;
        do
        {
            if (charIndex <= 0)
            {
                break;
            }
            String s = text;
            int j = charIndex - 1;
            charIndex = j;
            lastChar = s.charAt(j);
            if (lastChar == '&')
            {
                return 12;
            }
        } while (lastChar != ';');
        charIndex = i;
        lastChar = ';';
        return 13;
    }

    private byte skipEntityForward()
    {
        char c;
        do
        {
            if (charIndex >= length)
            {
                break;
            }
            String s = text;
            int i = charIndex;
            charIndex = i + 1;
            c = s.charAt(i);
            lastChar = c;
        } while (c != ';');
        return 12;
    }

    private byte skipTagBackward()
    {
        int i = charIndex;
        do
        {
            if (charIndex <= 0)
            {
                break;
            }
            String s = text;
            int j = charIndex - 1;
            charIndex = j;
            lastChar = s.charAt(j);
            if (lastChar == '<')
            {
                return 12;
            }
            if (lastChar == '>')
            {
                break;
            }
            if (lastChar != '"' && lastChar != '\'')
            {
                break;
            }
            j = lastChar;
            char c;
            do
            {
                if (charIndex <= 0)
                {
                    break;
                }
                String s1 = text;
                int k = charIndex - 1;
                charIndex = k;
                c = s1.charAt(k);
                lastChar = c;
            } while (c != j);
        } while (true);
        charIndex = i;
        lastChar = '>';
        return 13;
    }

    private byte skipTagForward()
    {
        int i = charIndex;
        while (charIndex < length) 
        {
            String s = text;
            int j = charIndex;
            charIndex = j + 1;
            lastChar = s.charAt(j);
            if (lastChar == '>')
            {
                return 12;
            }
            if (lastChar != '"' && lastChar != '\'')
            {
                break;
            }
            j = lastChar;
            char c;
            do
            {
                if (charIndex >= length)
                {
                    break;
                }
                String s1 = text;
                int k = charIndex;
                charIndex = k + 1;
                c = s1.charAt(k);
                lastChar = c;
            } while (c != j);
        }
        charIndex = i;
        lastChar = '<';
        return 13;
    }

    byte dirTypeBackward()
    {
        lastChar = text.charAt(charIndex - 1);
        byte byte0;
        if (Character.isLowSurrogate(lastChar))
        {
            int i = Character.codePointBefore(text, charIndex);
            charIndex = charIndex - Character.charCount(i);
            byte0 = Character.getDirectionality(i);
        } else
        {
            charIndex = charIndex - 1;
            byte byte1 = getCachedDirectionality(lastChar);
            byte0 = byte1;
            if (isHtml)
            {
                if (lastChar == '>')
                {
                    return skipTagBackward();
                }
                byte0 = byte1;
                if (lastChar == ';')
                {
                    return skipEntityBackward();
                }
            }
        }
        return byte0;
    }

    byte dirTypeForward()
    {
        lastChar = text.charAt(charIndex);
        byte byte0;
        if (Character.isHighSurrogate(lastChar))
        {
            int i = Character.codePointAt(text, charIndex);
            charIndex = charIndex + Character.charCount(i);
            byte0 = Character.getDirectionality(i);
        } else
        {
            charIndex = charIndex + 1;
            byte byte1 = getCachedDirectionality(lastChar);
            byte0 = byte1;
            if (isHtml)
            {
                if (lastChar == '<')
                {
                    return skipTagForward();
                }
                byte0 = byte1;
                if (lastChar == '&')
                {
                    return skipEntityForward();
                }
            }
        }
        return byte0;
    }

    int getEntryDir()
    {
        int i;
        int j;
        byte byte0;
        charIndex = 0;
        j = 0;
        byte0 = 0;
        i = 0;
_L6:
        if (charIndex >= length || j != 0) goto _L2; else goto _L1
_L1:
        dirTypeForward();
        JVM INSTR tableswitch 0 18: default 120
    //                   0 152
    //                   1 163
    //                   2 163
    //                   3 120
    //                   4 120
    //                   5 120
    //                   6 120
    //                   7 120
    //                   8 120
    //                   9 11
    //                   10 120
    //                   11 120
    //                   12 120
    //                   13 120
    //                   14 125
    //                   15 125
    //                   16 134
    //                   17 134
    //                   18 143;
           goto _L3 _L4 _L5 _L5 _L3 _L3 _L3 _L3 _L3 _L3 _L6 _L3 _L3 _L3 _L3 _L7 _L7 _L8 _L8 _L9
_L3:
        j = i;
          goto _L6
_L7:
        i++;
        byte0 = -1;
          goto _L6
_L8:
        i++;
        byte0 = 1;
          goto _L6
_L9:
        i--;
        byte0 = 0;
          goto _L6
_L4:
        if (i != 0) goto _L11; else goto _L10
_L10:
        return -1;
_L11:
        j = i;
          goto _L6
_L5:
        if (i == 0)
        {
            return 1;
        }
        j = i;
          goto _L6
_L2:
        if (j == 0)
        {
            return 0;
        }
        if (byte0 != 0)
        {
            return byte0;
        }
_L14:
        if (charIndex <= 0) goto _L13; else goto _L12
_L12:
        dirTypeBackward();
        JVM INSTR tableswitch 14 18: default 232
    //                   14 235
    //                   15 235
    //                   16 247
    //                   17 247
    //                   18 261;
           goto _L14 _L15 _L15 _L16 _L16 _L17
_L15:
        if (j == i) goto _L10; else goto _L18
_L18:
        i--;
          goto _L14
_L16:
        if (j == i)
        {
            return 1;
        }
        i--;
          goto _L14
_L17:
        i++;
          goto _L14
_L13:
        return 0;
    }

    int getExitDir()
    {
        boolean flag = false;
        charIndex = length;
        int j = 0;
        int i = 0;
        do
        {
label0:
            {
label1:
                {
label2:
                    {
label3:
                        {
label4:
                            {
                                byte byte0 = flag;
                                if (charIndex > 0)
                                {
                                    switch (dirTypeBackward())
                                    {
                                    case 3: // '\003'
                                    case 4: // '\004'
                                    case 5: // '\005'
                                    case 6: // '\006'
                                    case 7: // '\007'
                                    case 8: // '\b'
                                    case 10: // '\n'
                                    case 11: // '\013'
                                    case 12: // '\f'
                                    case 13: // '\r'
                                    default:
                                        if (j == 0)
                                        {
                                            j = i;
                                        }
                                        continue;

                                    case 1: // '\001'
                                    case 2: // '\002'
                                        break label2;

                                    case 9: // '\t'
                                        continue;

                                    case 14: // '\016'
                                    case 15: // '\017'
                                        break label3;

                                    case 16: // '\020'
                                    case 17: // '\021'
                                        break label1;

                                    case 18: // '\022'
                                        break label0;

                                    case 0: // '\0'
                                        break;
                                    }
                                    if (i != 0)
                                    {
                                        break label4;
                                    }
                                    byte0 = -1;
                                }
                                return byte0;
                            }
                            if (j == 0)
                            {
                                j = i;
                            }
                            continue;
                        }
                        if (j == i)
                        {
                            return -1;
                        }
                        i--;
                        continue;
                    }
                    if (i == 0)
                    {
                        return 1;
                    }
                    if (j == 0)
                    {
                        j = i;
                    }
                    continue;
                }
                if (j == i)
                {
                    return 1;
                }
                i--;
                continue;
            }
            i++;
        } while (true);
    }

    static 
    {
        DIR_TYPE_CACHE = new byte[1792];
        for (int i = 0; i < 1792; i++)
        {
            DIR_TYPE_CACHE[i] = Character.getDirectionality(i);
        }

    }

    (String s, boolean flag)
    {
        text = s;
        isHtml = flag;
        length = s.length();
    }
}
