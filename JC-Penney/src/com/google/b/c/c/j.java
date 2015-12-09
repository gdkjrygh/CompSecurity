// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.c;

import com.google.b.f;
import java.util.Arrays;

// Referenced classes of package com.google.b.c.c:
//            a, c, m, n, 
//            f, b, h, g, 
//            k, l

public final class j
{

    private static char a(char c1, int l)
    {
        c1 = (l * 149) % 253 + 1 + c1;
        if (c1 <= '\376')
        {
            return (char)c1;
        } else
        {
            return (char)(c1 - 254);
        }
    }

    public static int a(CharSequence charsequence, int l)
    {
        int j1 = 0;
        boolean flag = false;
        int l1 = charsequence.length();
        if (l < l1)
        {
            char c1 = charsequence.charAt(l);
            int i1 = l;
            l = ((flag) ? 1 : 0);
            do
            {
                j1 = l;
                if (!a(c1))
                {
                    break;
                }
                j1 = l;
                if (i1 >= l1)
                {
                    break;
                }
                j1 = l + 1;
                int k1 = i1 + 1;
                l = j1;
                i1 = k1;
                if (k1 < l1)
                {
                    c1 = charsequence.charAt(k1);
                    l = j1;
                    i1 = k1;
                }
            } while (true);
        }
        return j1;
    }

    static int a(CharSequence charsequence, int l, int i1)
    {
        boolean flag = false;
        if (l < charsequence.length()) goto _L2; else goto _L1
_L1:
        return i1;
_L2:
        float af[];
        int ai[];
        if (i1 == 0)
        {
            af = new float[6];
            af;
            af[0] = 0.0F;
            af[1] = 1.0F;
            af[2] = 1.0F;
            af[3] = 1.0F;
            af[4] = 1.0F;
            af[5] = 1.25F;
        } else
        {
            af = new float[6];
            af;
            af[0] = 1.0F;
            af[1] = 2.0F;
            af[2] = 2.0F;
            af[3] = 2.0F;
            af[4] = 2.0F;
            af[5] = 2.25F;
            af[i1] = 0.0F;
        }
        i1 = 0;
_L5:
        int ai1[];
        byte abyte0[];
        int k1;
        int l1;
        do
        {
            if (l + i1 == charsequence.length())
            {
                charsequence = new byte[6];
                ai = new int[6];
                l = a(af, ai, 0x7fffffff, ((byte []) (charsequence)));
                int j1 = a(((byte []) (charsequence)));
                i1 = ((flag) ? 1 : 0);
                if (ai[0] != l)
                {
                    if (j1 == 1 && charsequence[5] > 0)
                    {
                        return 5;
                    }
                    if (j1 == 1 && charsequence[4] > 0)
                    {
                        return 4;
                    }
                    if (j1 == 1 && charsequence[2] > 0)
                    {
                        return 2;
                    }
                    return j1 != 1 || charsequence[3] <= 0 ? 1 : 3;
                }
                continue; /* Loop/switch isn't completed */
            }
            char c1 = charsequence.charAt(l + i1);
            k1 = i1 + 1;
            if (a(c1))
            {
                af[0] = (float)((double)af[0] + 0.5D);
            } else
            if (b(c1))
            {
                af[0] = (int)Math.ceil(af[0]);
                af[0] = af[0] + 2.0F;
            } else
            {
                af[0] = (int)Math.ceil(af[0]);
                af[0] = af[0] + 1.0F;
            }
            if (d(c1))
            {
                af[1] = af[1] + 0.6666667F;
            } else
            if (b(c1))
            {
                af[1] = af[1] + 2.666667F;
            } else
            {
                af[1] = af[1] + 1.333333F;
            }
            if (e(c1))
            {
                af[2] = af[2] + 0.6666667F;
            } else
            if (b(c1))
            {
                af[2] = af[2] + 2.666667F;
            } else
            {
                af[2] = af[2] + 1.333333F;
            }
            if (f(c1))
            {
                af[3] = af[3] + 0.6666667F;
            } else
            if (b(c1))
            {
                af[3] = af[3] + 4.333333F;
            } else
            {
                af[3] = af[3] + 3.333333F;
            }
            if (h(c1))
            {
                af[4] = af[4] + 0.75F;
            } else
            if (b(c1))
            {
                af[4] = af[4] + 4.25F;
            } else
            {
                af[4] = af[4] + 3.25F;
            }
            if (i(c1))
            {
                af[5] = af[5] + 4F;
            } else
            {
                af[5] = af[5] + 1.0F;
            }
            i1 = k1;
        } while (k1 < 4);
        ai1 = new int[6];
        abyte0 = new byte[6];
        a(af, ai1, 0x7fffffff, abyte0);
        l1 = a(abyte0);
        if (ai1[0] >= ai1[5] || ai1[0] >= ai1[1] || ai1[0] >= ai1[2] || ai1[0] >= ai1[3])
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = ((flag) ? 1 : 0);
        if (ai1[0] < ai1[4]) goto _L1; else goto _L3
_L3:
        if (ai1[5] < ai1[0] || abyte0[1] + abyte0[2] + abyte0[3] + abyte0[4] == 0)
        {
            return 5;
        }
        if (l1 == 1 && abyte0[4] > 0)
        {
            return 4;
        }
        if (l1 == 1 && abyte0[2] > 0)
        {
            return 2;
        }
        if (l1 == 1 && abyte0[3] > 0)
        {
            return 3;
        }
        i1 = k1;
        if (ai1[1] + 1 >= ai1[0]) goto _L5; else goto _L4
_L4:
        i1 = k1;
        if (ai1[1] + 1 >= ai1[5]) goto _L5; else goto _L6
_L6:
        i1 = k1;
        if (ai1[1] + 1 >= ai1[4]) goto _L5; else goto _L7
_L7:
        i1 = k1;
        if (ai1[1] + 1 >= ai1[2]) goto _L5; else goto _L8
_L8:
        if (ai1[1] < ai1[3])
        {
            return 1;
        }
        i1 = k1;
        if (ai1[1] != ai1[3]) goto _L5; else goto _L9
_L9:
        l = l + k1 + 1;
        do
        {
label0:
            {
                if (l < charsequence.length())
                {
                    char c2 = charsequence.charAt(l);
                    if (g(c2))
                    {
                        return 3;
                    }
                    if (f(c2))
                    {
                        break label0;
                    }
                }
                return 1;
            }
            l++;
        } while (true);
        if (true) goto _L1; else goto _L10
_L10:
    }

    private static int a(byte abyte0[])
    {
        int l = 0;
        int i1 = 0;
        for (; l < 6; l++)
        {
            i1 += abyte0[l];
        }

        return i1;
    }

    private static int a(float af[], int ai[], int l, byte abyte0[])
    {
        Arrays.fill(abyte0, (byte)0);
        boolean flag = false;
        int i1 = l;
        for (l = ((flag) ? 1 : 0); l < 6;)
        {
            ai[l] = (int)Math.ceil(af[l]);
            int k1 = ai[l];
            int j1 = i1;
            if (i1 > k1)
            {
                Arrays.fill(abyte0, (byte)0);
                j1 = k1;
            }
            if (j1 == k1)
            {
                abyte0[l] = (byte)(abyte0[l] + 1);
            }
            l++;
            i1 = j1;
        }

        return i1;
    }

    public static String a(String s, l l, f f1, f f2)
    {
        h h1;
        a a1;
        c c1;
        m m1;
        n n1;
        com.google.b.c.c.f f3;
        b b1;
        boolean flag;
        flag = false;
        a1 = new a();
        c1 = new c();
        m1 = new m();
        n1 = new n();
        f3 = new com.google.b.c.c.f();
        b1 = new b();
        h1 = new h(s);
        h1.a(l);
        h1.a(f1, f2);
        if (!s.startsWith("[)>\03605\035") || !s.endsWith("\036\004")) goto _L2; else goto _L1
_L1:
        int i1;
        h1.a('\354');
        h1.a(2);
        h1.a = h1.a + "[)>\03605\035".length();
        i1 = ((flag) ? 1 : 0);
_L4:
        if (!h1.g())
        {
            break; /* Loop/switch isn't completed */
        }
        (new g[] {
            a1, c1, m1, n1, f3, b1
        })[i1].a(h1);
        if (h1.e() >= 0)
        {
            i1 = h1.e();
            h1.f();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        i1 = ((flag) ? 1 : 0);
        if (s.startsWith("[)>\03606\035"))
        {
            i1 = ((flag) ? 1 : 0);
            if (s.endsWith("\036\004"))
            {
                h1.a('\355');
                h1.a(2);
                h1.a = h1.a + "[)>\03606\035".length();
                i1 = ((flag) ? 1 : 0);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        int j1 = h1.d();
        h1.j();
        int k1 = h1.i().h();
        if (j1 < k1 && i1 != 0 && i1 != 5)
        {
            h1.a('\376');
        }
        s = h1.c();
        if (s.length() < k1)
        {
            s.append('\201');
        }
        for (; s.length() < k1; s.append(a('\201', s.length() + 1))) { }
        return h1.c().toString();
    }

    static boolean a(char c1)
    {
        return c1 >= '0' && c1 <= '9';
    }

    static boolean b(char c1)
    {
        return c1 >= '\200' && c1 <= '\377';
    }

    static void c(char c1)
    {
        String s = Integer.toHexString(c1);
        s = (new StringBuilder()).append("0000".substring(0, 4 - s.length())).append(s).toString();
        throw new IllegalArgumentException((new StringBuilder()).append("Illegal character: ").append(c1).append(" (0x").append(s).append(')').toString());
    }

    private static boolean d(char c1)
    {
        return c1 == ' ' || c1 >= '0' && c1 <= '9' || c1 >= 'A' && c1 <= 'Z';
    }

    private static boolean e(char c1)
    {
        return c1 == ' ' || c1 >= '0' && c1 <= '9' || c1 >= 'a' && c1 <= 'z';
    }

    private static boolean f(char c1)
    {
        return g(c1) || c1 == ' ' || c1 >= '0' && c1 <= '9' || c1 >= 'A' && c1 <= 'Z';
    }

    private static boolean g(char c1)
    {
        return c1 == '\r' || c1 == '*' || c1 == '>';
    }

    private static boolean h(char c1)
    {
        return c1 >= ' ' && c1 <= '^';
    }

    private static boolean i(char c1)
    {
        return false;
    }
}
