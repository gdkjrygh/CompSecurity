// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.f.c;

import com.google.b.b.d;
import com.google.b.v;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;

// Referenced classes of package com.google.b.f.c:
//            c

final class g
{

    private static final byte a[] = {
        48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
        38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 
        43, 37, 42, 61, 94, 0, 32, 0, 0, 0
    };
    private static final byte b[] = {
        59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 
        33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 
        34, 124, 42, 40, 41, 63, 123, 125, 39, 0
    };
    private static final byte c[];
    private static final byte d[];
    private static final Charset e = Charset.forName("ISO-8859-1");

    private static int a(CharSequence charsequence, int i)
    {
        int k = 0;
        boolean flag = false;
        int i1 = charsequence.length();
        if (i < i1)
        {
            char c1 = charsequence.charAt(i);
            int j = i;
            i = ((flag) ? 1 : 0);
            do
            {
                k = i;
                if (!a(c1))
                {
                    break;
                }
                k = i;
                if (j >= i1)
                {
                    break;
                }
                k = i + 1;
                int l = j + 1;
                i = k;
                j = l;
                if (l < i1)
                {
                    c1 = charsequence.charAt(l);
                    i = k;
                    j = l;
                }
            } while (true);
        }
        return k;
    }

    private static int a(CharSequence charsequence, int i, int j, StringBuilder stringbuilder, int k)
    {
        StringBuilder stringbuilder1;
        int l;
        stringbuilder1 = new StringBuilder(j);
        l = 0;
_L8:
        char c1 = charsequence.charAt(i + l);
        k;
        JVM INSTR tableswitch 0 2: default 52
    //                   0 151
    //                   1 260
    //                   2 378;
           goto _L1 _L2 _L3 _L4
_L1:
        if (!e(c1))
        {
            break MISSING_BLOCK_LABEL_512;
        }
        stringbuilder1.append((char)d[c1]);
_L6:
        int i1;
        i1 = l + 1;
        l = i1;
        if (i1 >= j)
        {
            i1 = stringbuilder1.length();
            i = 0;
            j = 0;
            while (i < i1) 
            {
                if (i % 2 != 0)
                {
                    l = 1;
                } else
                {
                    l = 0;
                }
                if (l != 0)
                {
                    c1 = (char)(j * 30 + stringbuilder1.charAt(i));
                    stringbuilder.append(c1);
                    j = c1;
                } else
                {
                    j = stringbuilder1.charAt(i);
                }
                i++;
            }
            break; /* Loop/switch isn't completed */
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (b(c1))
        {
            if (c1 == ' ')
            {
                stringbuilder1.append('\032');
            } else
            {
                stringbuilder1.append((char)(c1 - 65));
            }
            continue; /* Loop/switch isn't completed */
        }
        if (c(c1))
        {
            stringbuilder1.append('\033');
            k = 1;
        } else
        if (d(c1))
        {
            k = 2;
            stringbuilder1.append('\034');
        } else
        {
            stringbuilder1.append('\035');
            stringbuilder1.append((char)d[c1]);
            continue; /* Loop/switch isn't completed */
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (c(c1))
        {
            if (c1 == ' ')
            {
                stringbuilder1.append('\032');
            } else
            {
                stringbuilder1.append((char)(c1 - 97));
            }
            continue; /* Loop/switch isn't completed */
        }
        if (b(c1))
        {
            stringbuilder1.append('\033');
            stringbuilder1.append((char)(c1 - 65));
            continue; /* Loop/switch isn't completed */
        }
        if (d(c1))
        {
            k = 2;
            stringbuilder1.append('\034');
        } else
        {
            stringbuilder1.append('\035');
            stringbuilder1.append((char)d[c1]);
            continue; /* Loop/switch isn't completed */
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (d(c1))
        {
            stringbuilder1.append((char)c[c1]);
            continue; /* Loop/switch isn't completed */
        }
        if (b(c1))
        {
            stringbuilder1.append('\034');
            k = 0;
            continue; /* Loop/switch isn't completed */
        }
        if (c(c1))
        {
            stringbuilder1.append('\033');
            k = 1;
            continue; /* Loop/switch isn't completed */
        }
        if (i + l + 1 < j && e(charsequence.charAt(i + l + 1)))
        {
            k = 3;
            stringbuilder1.append('\031');
            continue; /* Loop/switch isn't completed */
        }
        stringbuilder1.append('\035');
        stringbuilder1.append((char)d[c1]);
        if (true) goto _L6; else goto _L5
_L5:
        break; /* Loop/switch isn't completed */
        stringbuilder1.append('\035');
        k = 0;
        if (true) goto _L8; else goto _L7
_L7:
        if (i1 % 2 != 0)
        {
            stringbuilder.append((char)(j * 30 + 29));
        }
        return k;
    }

    private static int a(CharSequence charsequence, byte abyte0[], int i)
    {
        int i1 = charsequence.length();
        int k = i;
        do
        {
            if (k >= i1)
            {
                break;
            }
            char c1 = charsequence.charAt(k);
            int j = 0;
label0:
            do
            {
                int l;
label1:
                {
                    l = j;
                    if (j < 13)
                    {
                        l = j;
                        if (a(c1))
                        {
                            j++;
                            l = k + j;
                            if (l < i1)
                            {
                                break label1;
                            }
                            l = j;
                        }
                    }
                    if (l >= 13)
                    {
                        return k - i;
                    }
                    break label0;
                }
                c1 = charsequence.charAt(l);
            } while (true);
            c1 = charsequence.charAt(k);
            if (abyte0[k] == 63 && c1 != '?')
            {
                throw new v((new StringBuilder()).append("Non-encodable character detected: ").append(c1).append(" (Unicode: ").append(c1).append(')').toString());
            }
            k++;
        } while (true);
        return k - i;
    }

    static String a(String s, c c1, Charset charset)
    {
        StringBuilder stringbuilder = new StringBuilder(s.length());
        Charset charset1;
        int k1;
        if (charset == null)
        {
            charset1 = e;
        } else
        {
            charset1 = charset;
            if (!e.equals(charset))
            {
                d d1 = com.google.b.b.d.a(charset.name());
                charset1 = charset;
                if (d1 != null)
                {
                    a(d1.a(), stringbuilder);
                    charset1 = charset;
                }
            }
        }
        k1 = s.length();
        charset = null;
        if (c1 == c.b)
        {
            a(((CharSequence) (s)), 0, k1, stringbuilder, 0);
        } else
        if (c1 == c.c)
        {
            s = s.getBytes(charset1);
            a(((byte []) (s)), 0, s.length, 1, stringbuilder);
        } else
        if (c1 == com.google.b.f.c.c.d)
        {
            stringbuilder.append('\u0386');
            a(s, 0, k1, stringbuilder);
        } else
        {
            byte byte0 = 0;
            int i = 0;
            int j = 0;
            c1 = charset;
            while (j < k1) 
            {
                int k = a(((CharSequence) (s)), j);
                if (k >= 13)
                {
                    stringbuilder.append('\u0386');
                    byte0 = 2;
                    a(s, j, k, stringbuilder);
                    j += k;
                    i = 0;
                } else
                {
                    int i1 = b(s, j);
                    if (i1 >= 5 || k == k1)
                    {
                        byte byte1 = byte0;
                        if (byte0 != 0)
                        {
                            stringbuilder.append('\u0384');
                            byte1 = 0;
                            i = 0;
                        }
                        i = a(((CharSequence) (s)), j, i1, stringbuilder, i);
                        j += i1;
                        byte0 = byte1;
                    } else
                    {
                        charset = c1;
                        if (c1 == null)
                        {
                            charset = s.getBytes(charset1);
                        }
                        int j1 = a(((CharSequence) (s)), ((byte []) (charset)), j);
                        int l = j1;
                        if (j1 == 0)
                        {
                            l = 1;
                        }
                        if (l == 1 && byte0 == 0)
                        {
                            a(((byte []) (charset)), j, 1, 0, stringbuilder);
                        } else
                        {
                            a(((byte []) (charset)), j, l, byte0, stringbuilder);
                            byte0 = 1;
                            i = 0;
                        }
                        j += l;
                        c1 = charset;
                    }
                }
            }
        }
        return stringbuilder.toString();
    }

    private static void a(int i, StringBuilder stringbuilder)
    {
        if (i >= 0 && i < 900)
        {
            stringbuilder.append('\u039F');
            stringbuilder.append((char)i);
            return;
        }
        if (i < 0xc5f94)
        {
            stringbuilder.append('\u039E');
            stringbuilder.append((char)(i / 900 - 1));
            stringbuilder.append((char)(i % 900));
            return;
        }
        if (i < 0xc6318)
        {
            stringbuilder.append('\u039D');
            stringbuilder.append((char)(0xc5f94 - i));
            return;
        } else
        {
            throw new v((new StringBuilder()).append("ECI number not in valid range from 0..811799, but was ").append(i).toString());
        }
    }

    private static void a(String s, int i, int j, StringBuilder stringbuilder)
    {
        StringBuilder stringbuilder1 = new StringBuilder(j / 3 + 1);
        BigInteger biginteger2 = BigInteger.valueOf(900L);
        BigInteger biginteger3 = BigInteger.valueOf(0L);
        int i1;
        for (int k = 0; k < j; k += i1)
        {
            stringbuilder1.setLength(0);
            i1 = Math.min(44, j - k);
            BigInteger biginteger = new BigInteger((new StringBuilder()).append('1').append(s.substring(i + k, i + k + i1)).toString());
            BigInteger biginteger1;
            do
            {
                stringbuilder1.append((char)biginteger.mod(biginteger2).intValue());
                biginteger1 = biginteger.divide(biginteger2);
                biginteger = biginteger1;
            } while (!biginteger1.equals(biginteger3));
            for (int l = stringbuilder1.length() - 1; l >= 0; l--)
            {
                stringbuilder.append(stringbuilder1.charAt(l));
            }

        }

    }

    private static void a(byte abyte0[], int i, int j, int k, StringBuilder stringbuilder)
    {
        int l;
        if (j == 1 && k == 0)
        {
            stringbuilder.append('\u0391');
        } else
        {
            if (j % 6 == 0)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (k != 0)
            {
                stringbuilder.append('\u039C');
            } else
            {
                stringbuilder.append('\u0385');
            }
        }
        if (j >= 6)
        {
            char ac[] = new char[5];
            k = i;
            do
            {
                l = k;
                if ((i + j) - k < 6)
                {
                    break;
                }
                long l1 = 0L;
                for (l = 0; l < 6; l++)
                {
                    l1 = (l1 << 8) + (long)(abyte0[k + l] & 0xff);
                }

                for (l = 0; l < 5; l++)
                {
                    ac[l] = (char)(int)(l1 % 900L);
                    l1 /= 900L;
                }

                for (l = ac.length - 1; l >= 0; l--)
                {
                    stringbuilder.append(ac[l]);
                }

                k += 6;
            } while (true);
        } else
        {
            l = i;
        }
        for (; l < i + j; l++)
        {
            stringbuilder.append((char)(abyte0[l] & 0xff));
        }

    }

    private static boolean a(char c1)
    {
        return c1 >= '0' && c1 <= '9';
    }

    private static int b(CharSequence charsequence, int i)
    {
        int i1 = charsequence.length();
        int j = i;
        do
        {
label0:
            {
                int k = j;
                if (j < i1)
                {
                    char c1 = charsequence.charAt(j);
                    int l = 0;
                    for (k = j; l < 13 && a(c1) && k < i1;)
                    {
                        l++;
                        j = k + 1;
                        if (j < i1)
                        {
                            c1 = charsequence.charAt(j);
                            k = j;
                        } else
                        {
                            k = j;
                        }
                    }

                    if (l >= 13)
                    {
                        return k - i - l;
                    }
                    j = k;
                    if (l > 0)
                    {
                        continue;
                    }
                    if (f(charsequence.charAt(k)))
                    {
                        break label0;
                    }
                }
                return k - i;
            }
            j = k + 1;
        } while (true);
    }

    private static boolean b(char c1)
    {
        return c1 == ' ' || c1 >= 'A' && c1 <= 'Z';
    }

    private static boolean c(char c1)
    {
        return c1 == ' ' || c1 >= 'a' && c1 <= 'z';
    }

    private static boolean d(char c1)
    {
        return c[c1] != -1;
    }

    private static boolean e(char c1)
    {
        return d[c1] != -1;
    }

    private static boolean f(char c1)
    {
        return c1 == '\t' || c1 == '\n' || c1 == '\r' || c1 >= ' ' && c1 <= '~';
    }

    static 
    {
        boolean flag = false;
        c = new byte[128];
        d = new byte[128];
        Arrays.fill(c, (byte)-1);
        for (byte byte0 = 0; byte0 < a.length; byte0++)
        {
            byte byte2 = a[byte0];
            if (byte2 > 0)
            {
                c[byte2] = byte0;
            }
        }

        Arrays.fill(d, (byte)-1);
        for (byte byte1 = flag; byte1 < b.length; byte1++)
        {
            byte byte3 = b[byte1];
            if (byte3 > 0)
            {
                d[byte3] = byte1;
            }
        }

    }
}
