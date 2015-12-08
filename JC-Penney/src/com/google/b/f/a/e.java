// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.f.a;

import com.google.b.b.d;
import com.google.b.f.c;
import com.google.b.h;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;

// Referenced classes of package com.google.b.f.a:
//            g, f

final class e
{

    private static final char a[] = {
        ';', '<', '>', '@', '[', '\\', ']', '_', '`', '~', 
        '!', '\r', '\t', ',', ':', '\n', '-', '.', '$', '/', 
        '"', '|', '*', '(', ')', '?', '{', '}', '\''
    };
    private static final char b[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        '&', '\r', '\t', ',', ':', '#', '-', '.', '$', '/', 
        '+', '%', '*', '=', '^'
    };
    private static final Charset c = Charset.forName("ISO-8859-1");
    private static final BigInteger d[];

    private static int a(int i, int ai[], Charset charset, int j, StringBuilder stringbuilder)
    {
label0:
        {
            {
                ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                if (i != 901)
                {
                    break label0;
                }
                boolean flag1 = false;
                long l1 = 0L;
                int ai1[] = new int[6];
                boolean flag = false;
                int l = ai[j];
                i = j + 1;
                j = ((flag1) ? 1 : 0);
                while (i < ai[0] && !flag) 
                {
                    int i1 = j + 1;
                    ai1[j] = l;
                    l1 = l1 * 900L + (long)l;
                    j = i + 1;
                    l = ai[i];
                    int k;
                    int j1;
                    long l2;
                    if (l == 900 || l == 901 || l == 902 || l == 924 || l == 928 || l == 923 || l == 922)
                    {
                        flag = true;
                        i = j - 1;
                        j = i1;
                    } else
                    if (i1 % 5 == 0 && i1 > 0)
                    {
                        for (i = 0; i < 6; i++)
                        {
                            bytearrayoutputstream.write((byte)(int)(l1 >> (5 - i) * 8));
                        }

                        l1 = 0L;
                        i1 = 0;
                        i = j;
                        j = i1;
                    } else
                    {
                        i = j;
                        j = i1;
                    }
                }
                k = j;
                if (i == ai[0])
                {
                    k = j;
                    if (l < 900)
                    {
                        ai1[j] = l;
                        k = j + 1;
                    }
                }
                for (j = 0; j < k; j++)
                {
                    bytearrayoutputstream.write((byte)ai1[j]);
                }

                l = i;
            }
            stringbuilder.append(new String(bytearrayoutputstream.toByteArray(), charset));
            return l;
        }
        l = j;
        if (i != 924)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        i = 0;
        l1 = 0L;
        i1 = 0;
        k = j;
        j = i;
        do
        {
            l = k;
            if (k >= ai[0])
            {
                break MISSING_BLOCK_LABEL_273;
            }
            l = k;
            if (i1 != 0)
            {
                break MISSING_BLOCK_LABEL_273;
            }
            i = k + 1;
            k = ai[k];
            if (k < 900)
            {
                j1 = j + 1;
                l2 = l1 * 900L + (long)k;
                l = i1;
            } else
            if (k == 900 || k == 901 || k == 902 || k == 924 || k == 928 || k == 923 || k == 922)
            {
                i--;
                l = 1;
                j1 = j;
                l2 = l1;
            } else
            {
                l = i1;
                j1 = j;
                l2 = l1;
            }
            i1 = l;
            j = j1;
            l1 = l2;
            k = i;
            if (j1 % 5 == 0)
            {
                i1 = l;
                j = j1;
                l1 = l2;
                k = i;
                if (j1 > 0)
                {
                    for (j = 0; j < 6; j++)
                    {
                        bytearrayoutputstream.write((byte)(int)(l2 >> (5 - j) * 8));
                    }

                    l1 = 0L;
                    j = 0;
                    i1 = l;
                    k = i;
                }
            }
        } while (true);
    }

    private static int a(int ai[], int i, c c1)
    {
        if (i + 2 > ai[0])
        {
            throw h.a();
        }
        int ai1[] = new int[2];
        for (int j = 0; j < 2;)
        {
            ai1[j] = ai[i];
            j++;
            i++;
        }

        c1.a(Integer.parseInt(a(ai1, 2)));
        StringBuilder stringbuilder = new StringBuilder();
        int k = a(ai, i, stringbuilder);
        c1.a(stringbuilder.toString());
        if (ai[k] == 923)
        {
            i = k + 1;
            int ai2[] = new int[ai[0] - i];
            k = 0;
            for (boolean flag = false; i < ai[0] && !flag;)
            {
                int l = i + 1;
                i = ai[i];
                if (i < 900)
                {
                    ai2[k] = i;
                    k++;
                    i = l;
                } else
                {
                    switch (i)
                    {
                    default:
                        throw h.a();

                    case 922: 
                        c1.a(true);
                        break;
                    }
                    i = l + 1;
                    flag = true;
                }
            }

            c1.a(Arrays.copyOf(ai2, k));
        } else
        {
            i = k;
            if (ai[k] == 922)
            {
                c1.a(true);
                return k + 1;
            }
        }
        return i;
    }

    private static int a(int ai[], int i, StringBuilder stringbuilder)
    {
        int ai1[] = new int[(ai[0] - i) * 2];
        int ai2[] = new int[(ai[0] - i) * 2];
        boolean flag = false;
        int j = 0;
label0:
        do
        {
            while (i < ai[0] && !flag) 
            {
                int k = i + 1;
                i = ai[i];
                if (i < 900)
                {
                    ai1[j] = i / 30;
                    ai1[j + 1] = i % 30;
                    j += 2;
                    i = k;
                } else
                {
                    switch (i)
                    {
                    default:
                        i = k;
                        break;

                    case 900: 
                        ai1[j] = 900;
                        j++;
                        i = k;
                        break;

                    case 901: 
                    case 902: 
                    case 922: 
                    case 923: 
                    case 924: 
                    case 928: 
                        i = k - 1;
                        flag = true;
                        break;

                    case 913: 
                        ai1[j] = 913;
                        i = k + 1;
                        ai2[j] = ai[k];
                        j++;
                        break;
                    }
                    continue label0;
                }
            }
            a(ai1, ai2, j, stringbuilder);
            return i;
        } while (true);
    }

    static com.google.b.b.e a(int ai[], String s)
    {
        Charset charset;
        c c1;
        StringBuilder stringbuilder;
        int i;
        int j;
        stringbuilder = new StringBuilder(ai.length * 2);
        charset = c;
        i = 2;
        j = ai[1];
        c1 = new c();
_L11:
        if (i >= ai[0])
        {
            break MISSING_BLOCK_LABEL_309;
        }
        j;
        JVM INSTR lookupswitch 11: default 140
    //                   900: 178
    //                   901: 191
    //                   902: 231
    //                   913: 207
    //                   922: 301
    //                   923: 301
    //                   924: 191
    //                   925: 280
    //                   926: 271
    //                   927: 244
    //                   928: 289;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L6 _L3 _L7 _L8 _L9 _L10
_L1:
        i = a(ai, i - 1, stringbuilder);
_L12:
        if (i < ai.length)
        {
            int i1 = i + 1;
            j = ai[i];
            i = i1;
        } else
        {
            throw h.a();
        }
        if (true) goto _L11; else goto _L2
_L2:
        i = a(ai, i, stringbuilder);
          goto _L12
_L3:
        i = a(j, ai, charset, i, stringbuilder);
          goto _L12
_L5:
        int k = i + 1;
        stringbuilder.append((char)ai[i]);
        i = k;
          goto _L12
_L4:
        i = b(ai, i, stringbuilder);
          goto _L12
_L9:
        int l = i + 1;
        charset = Charset.forName(com.google.b.b.d.a(ai[i]).name());
        i = l;
          goto _L12
_L8:
        i += 2;
          goto _L12
_L7:
        i++;
          goto _L12
_L10:
        i = a(ai, i, c1);
          goto _L12
_L6:
        throw h.a();
        if (stringbuilder.length() == 0)
        {
            throw h.a();
        } else
        {
            ai = new com.google.b.b.e(null, stringbuilder.toString(), null, s);
            ai.a(c1);
            return ai;
        }
    }

    private static String a(int ai[], int i)
    {
        BigInteger biginteger = BigInteger.ZERO;
        for (int j = 0; j < i; j++)
        {
            biginteger = biginteger.add(d[i - j - 1].multiply(BigInteger.valueOf(ai[j])));
        }

        ai = biginteger.toString();
        if (ai.charAt(0) != '1')
        {
            throw h.a();
        } else
        {
            return ai.substring(1);
        }
    }

    private static void a(int ai[], int ai1[], int i, StringBuilder stringbuilder)
    {
        g g1;
        g g2;
        int j;
        g1 = g.a;
        g2 = g.a;
        j = 0;
_L10:
        if (j >= i) goto _L2; else goto _L1
_L1:
        boolean flag;
        int k;
        k = ai[j];
        flag = false;
        f.a[g1.ordinal()];
        JVM INSTR tableswitch 1 6: default 76
    //                   1 109
    //                   2 283
    //                   3 461
    //                   4 658
    //                   5 764
    //                   6 836;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        char c1;
        g g3;
        g3 = g2;
        c1 = flag;
_L11:
        if (c1 != 0)
        {
            stringbuilder.append(c1);
        }
        j++;
        g2 = g3;
          goto _L10
_L4:
        if (k < 26)
        {
            c1 = (char)(k + 65);
            g3 = g2;
        } else
        if (k == 26)
        {
            c1 = ' ';
            g3 = g2;
        } else
        if (k == 27)
        {
            g1 = g.b;
            c1 = flag;
            g3 = g2;
        } else
        if (k == 28)
        {
            g1 = com.google.b.f.a.g.c;
            c1 = flag;
            g3 = g2;
        } else
        if (k == 29)
        {
            g2 = g.f;
            c1 = flag;
            g3 = g1;
            g1 = g2;
        } else
        if (k == 913)
        {
            stringbuilder.append((char)ai1[j]);
            c1 = flag;
            g3 = g2;
        } else
        {
            c1 = flag;
            g3 = g2;
            if (k == 900)
            {
                g1 = g.a;
                c1 = flag;
                g3 = g2;
            }
        }
          goto _L11
_L5:
        if (k < 26)
        {
            c1 = (char)(k + 97);
            g3 = g2;
        } else
        if (k == 26)
        {
            c1 = ' ';
            g3 = g2;
        } else
        if (k == 27)
        {
            g2 = g.e;
            c1 = flag;
            g3 = g1;
            g1 = g2;
        } else
        if (k == 28)
        {
            g1 = com.google.b.f.a.g.c;
            c1 = flag;
            g3 = g2;
        } else
        if (k == 29)
        {
            g2 = g.f;
            c1 = flag;
            g3 = g1;
            g1 = g2;
        } else
        if (k == 913)
        {
            stringbuilder.append((char)ai1[j]);
            c1 = flag;
            g3 = g2;
        } else
        {
            c1 = flag;
            g3 = g2;
            if (k == 900)
            {
                g1 = g.a;
                c1 = flag;
                g3 = g2;
            }
        }
          goto _L11
_L6:
        if (k < 25)
        {
            c1 = b[k];
            g3 = g2;
        } else
        if (k == 25)
        {
            g1 = com.google.b.f.a.g.d;
            c1 = flag;
            g3 = g2;
        } else
        if (k == 26)
        {
            c1 = ' ';
            g3 = g2;
        } else
        if (k == 27)
        {
            g1 = g.b;
            c1 = flag;
            g3 = g2;
        } else
        if (k == 28)
        {
            g1 = g.a;
            c1 = flag;
            g3 = g2;
        } else
        if (k == 29)
        {
            g2 = g.f;
            c1 = flag;
            g3 = g1;
            g1 = g2;
        } else
        if (k == 913)
        {
            stringbuilder.append((char)ai1[j]);
            c1 = flag;
            g3 = g2;
        } else
        {
            c1 = flag;
            g3 = g2;
            if (k == 900)
            {
                g1 = g.a;
                c1 = flag;
                g3 = g2;
            }
        }
          goto _L11
_L7:
        if (k < 29)
        {
            c1 = a[k];
            g3 = g2;
        } else
        if (k == 29)
        {
            g1 = g.a;
            c1 = flag;
            g3 = g2;
        } else
        if (k == 913)
        {
            stringbuilder.append((char)ai1[j]);
            c1 = flag;
            g3 = g2;
        } else
        {
            c1 = flag;
            g3 = g2;
            if (k == 900)
            {
                g1 = g.a;
                c1 = flag;
                g3 = g2;
            }
        }
          goto _L11
_L8:
        if (k < 26)
        {
            c1 = (char)(k + 65);
            g1 = g2;
            g3 = g2;
        } else
        if (k == 26)
        {
            c1 = ' ';
            g1 = g2;
            g3 = g2;
        } else
        {
            if (k != 900)
            {
                break MISSING_BLOCK_LABEL_943;
            }
            g1 = g.a;
            c1 = flag;
            g3 = g2;
        }
          goto _L11
_L9:
        if (k < 29)
        {
            c1 = a[k];
            g1 = g2;
            g3 = g2;
        } else
        if (k == 29)
        {
            g1 = g.a;
            c1 = flag;
            g3 = g2;
        } else
        if (k == 913)
        {
            stringbuilder.append((char)ai1[j]);
            g1 = g2;
            c1 = flag;
            g3 = g2;
        } else
        {
            if (k != 900)
            {
                break MISSING_BLOCK_LABEL_943;
            }
            g1 = g.a;
            c1 = flag;
            g3 = g2;
        }
          goto _L11
_L2:
        return;
        g1 = g2;
        c1 = flag;
        g3 = g2;
          goto _L11
    }

    private static int b(int ai[], int i, StringBuilder stringbuilder)
    {
        int ai1[] = new int[15];
        boolean flag1 = false;
        int j = 0;
        int l = i;
        do
        {
            if (l >= ai[0] || flag1)
            {
                break;
            }
            i = l + 1;
            l = ai[l];
            boolean flag = flag1;
            if (i == ai[0])
            {
                flag = true;
            }
            int k;
            if (l < 900)
            {
                ai1[j] = l;
                k = j + 1;
            } else
            if (l == 900 || l == 901 || l == 924 || l == 928 || l == 923 || l == 922)
            {
                i--;
                flag = true;
                k = j;
            } else
            {
                k = j;
            }
            if (k % 15 != 0 && l != 902)
            {
                flag1 = flag;
                j = k;
                l = i;
                if (!flag)
                {
                    continue;
                }
            }
            flag1 = flag;
            j = k;
            l = i;
            if (k > 0)
            {
                stringbuilder.append(a(ai1, k));
                j = 0;
                flag1 = flag;
                l = i;
            }
        } while (true);
        return l;
    }

    static 
    {
        d = new BigInteger[16];
        d[0] = BigInteger.ONE;
        BigInteger biginteger = BigInteger.valueOf(900L);
        d[1] = biginteger;
        for (int i = 2; i < d.length; i++)
        {
            d[i] = d[i - 1].multiply(biginteger);
        }

    }
}
