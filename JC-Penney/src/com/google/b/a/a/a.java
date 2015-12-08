// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.a.a;

import com.google.b.b.b;
import com.google.b.b.b.c;
import com.google.b.b.b.e;
import com.google.b.h;
import java.util.Arrays;

// Referenced classes of package com.google.b.a.a:
//            c, b

public final class a
{

    private static final String a[] = {
        "CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", 
        "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
        "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", 
        "CTRL_DL", "CTRL_BS"
    };
    private static final String b[] = {
        "CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", 
        "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", 
        "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", 
        "CTRL_DL", "CTRL_BS"
    };
    private static final String c[] = {
        "CTRL_PS", " ", "\001", "\002", "\003", "\004", "\005", "\006", "\007", "\b", 
        "\t", "\n", "\013", "\f", "\r", "\033", "\034", "\035", "\036", "\037", 
        "@", "\\", "^", "_", "`", "|", "~", "\177", "CTRL_LL", "CTRL_UL", 
        "CTRL_PL", "CTRL_BS"
    };
    private static final String d[] = {
        "", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", 
        "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", 
        "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", 
        "}", "CTRL_UL"
    };
    private static final String e[] = {
        "CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", 
        "8", "9", ",", ".", "CTRL_UL", "CTRL_US"
    };
    private com.google.b.a.a f;

    public a()
    {
    }

    private static int a(int i, boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 88;
        } else
        {
            byte0 = 112;
        }
        return (byte0 + i * 16) * i;
    }

    private static int a(boolean aflag[], int i, int j)
    {
        int k = 0;
        for (int l = i; l < i + j; l++)
        {
            int i1 = k << 1;
            k = i1;
            if (aflag[l])
            {
                k = i1 | 1;
            }
        }

        return k;
    }

    private static com.google.b.a.a.c a(char c1)
    {
        switch (c1)
        {
        default:
            return c.a;

        case 76: // 'L'
            return com.google.b.a.a.c.b;

        case 80: // 'P'
            return com.google.b.a.a.c.e;

        case 77: // 'M'
            return com.google.b.a.a.c.c;

        case 68: // 'D'
            return c.d;

        case 66: // 'B'
            return c.f;
        }
    }

    private static String a(com.google.b.a.a.c c1, int i)
    {
        switch (b.a[c1.ordinal()])
        {
        default:
            throw new IllegalStateException("Bad table");

        case 1: // '\001'
            return a[i];

        case 2: // '\002'
            return b[i];

        case 3: // '\003'
            return c[i];

        case 4: // '\004'
            return d[i];

        case 5: // '\005'
            return e[i];
        }
    }

    private static String a(boolean aflag[])
    {
        com.google.b.a.a.c c1;
        com.google.b.a.a.c c2;
        StringBuilder stringbuilder;
        int i;
        int j1;
        j1 = aflag.length;
        c1 = c.a;
        c2 = c.a;
        stringbuilder = new StringBuilder(20);
        i = 0;
_L9:
        if (i >= j1) goto _L2; else goto _L1
_L1:
        if (c2 != c.f) goto _L4; else goto _L3
_L3:
        if (j1 - i >= 5) goto _L5; else goto _L2
_L2:
        return stringbuilder.toString();
_L5:
        int j;
        int k = a(aflag, i, 5);
        int k1 = i + 5;
        j = k;
        i = k1;
        if (k != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j1 - k1 < 11)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = a(aflag, k1, 11) + 31;
        i = k1 + 11;
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L6
_L6:
        int l = 0;
        do
        {
label0:
            {
                if (l < j)
                {
                    if (j1 - i >= 8)
                    {
                        break label0;
                    }
                    i = j1;
                }
                c2 = c1;
                continue; /* Loop/switch isn't completed */
            }
            stringbuilder.append((char)a(aflag, i, 8));
            l++;
            i += 8;
        } while (true);
_L4:
        if (c2 == c.d)
        {
            j = 4;
        } else
        {
            j = 5;
        }
        if (j1 - i < j) goto _L2; else goto _L7
_L7:
        int i1 = a(aflag, i, j);
        i += j;
        String s = a(c2, i1);
        if (s.startsWith("CTRL_"))
        {
            com.google.b.a.a.c c3 = a(s.charAt(5));
            c2 = c3;
            if (s.charAt(6) == 'L')
            {
                c1 = c3;
                c2 = c3;
            }
        } else
        {
            stringbuilder.append(s);
            c2 = c1;
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    private boolean[] b(boolean aflag[])
    {
        byte byte0 = 8;
        com.google.b.b.b.a a1;
        int l;
        int k1;
        if (f.a() <= 2)
        {
            byte0 = 6;
            a1 = com.google.b.b.b.a.c;
        } else
        if (f.a() <= 8)
        {
            a1 = com.google.b.b.b.a.g;
        } else
        if (f.a() <= 22)
        {
            byte0 = 10;
            a1 = com.google.b.b.b.a.b;
        } else
        {
            byte0 = 12;
            a1 = com.google.b.b.b.a.a;
        }
        k1 = f.b();
        l = aflag.length / byte0;
        if (l < k1)
        {
            throw h.a();
        }
        int i = aflag.length;
        int ai[] = new int[l];
        i %= byte0;
        for (int j = 0; j < l;)
        {
            ai[j] = a(aflag, i, byte0);
            j++;
            i += byte0;
        }

        int k;
        int l1;
        try
        {
            (new c(a1)).a(ai, l - k1);
        }
        // Misplaced declaration of an exception variable
        catch (boolean aflag[])
        {
            throw h.a(aflag);
        }
        l1 = (1 << byte0) - 1;
        i = 0;
        int i1;
        for (k = 0; i < k1; k = i1)
        {
label0:
            {
                int i2 = ai[i];
                if (i2 == 0 || i2 == l1)
                {
                    throw h.a();
                }
                if (i2 != 1)
                {
                    i1 = k;
                    if (i2 != l1 - 1)
                    {
                        break label0;
                    }
                }
                i1 = k + 1;
            }
            i++;
        }

        aflag = new boolean[k1 * byte0 - k];
        k = 0;
        i = 0;
        while (k < k1) 
        {
            int j2 = ai[k];
            if (j2 == 1 || j2 == l1 - 1)
            {
                boolean flag;
                if (j2 > 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Arrays.fill(aflag, i, (i + byte0) - 1, flag);
                i = (byte0 - 1) + i;
            } else
            {
                int j1 = byte0 - 1;
                while (j1 >= 0) 
                {
                    boolean flag1;
                    if ((1 << j1 & j2) != 0)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    aflag[i] = flag1;
                    j1--;
                    i++;
                }
            }
            k++;
        }
        return aflag;
    }

    public com.google.b.b.e a(com.google.b.a.a a1)
    {
        f = a1;
        return new com.google.b.b.e(null, a(b(a(a1.d()))), null, null);
    }

    boolean[] a(b b1)
    {
        boolean flag = f.c();
        int i3 = f.a();
        int ai[];
        boolean aflag[];
        int i;
        if (flag)
        {
            i = i3 * 4 + 11;
        } else
        {
            i = i3 * 4 + 14;
        }
        ai = new int[i];
        aflag = new boolean[a(i3, flag)];
        if (flag)
        {
            for (int j = 0; j < ai.length; j++)
            {
                ai[j] = j;
            }

        } else
        {
            int k = (i / 2 - 1) / 15;
            int j1 = i / 2;
            int l1 = (i + 1 + k * 2) / 2;
            for (int l = 0; l < j1; l++)
            {
                int j2 = l / 15 + l;
                ai[j1 - l - 1] = l1 - j2 - 1;
                ai[j1 + l] = j2 + l1 + 1;
            }

        }
        int k1 = 0;
        for (int i1 = 0; i1 < i3; i1++)
        {
            int i2;
            int j3;
            int k3;
            if (flag)
            {
                i2 = (i3 - i1) * 4 + 9;
            } else
            {
                i2 = (i3 - i1) * 4 + 12;
            }
            j3 = i1 * 2;
            k3 = i - 1 - j3;
            for (int k2 = 0; k2 < i2; k2++)
            {
                int l3 = k2 * 2;
                for (int l2 = 0; l2 < 2; l2++)
                {
                    aflag[k1 + l3 + l2] = b1.a(ai[j3 + l2], ai[j3 + k2]);
                    aflag[i2 * 2 + k1 + l3 + l2] = b1.a(ai[j3 + k2], ai[k3 - l2]);
                    aflag[i2 * 4 + k1 + l3 + l2] = b1.a(ai[k3 - l2], ai[k3 - k2]);
                    aflag[i2 * 6 + k1 + l3 + l2] = b1.a(ai[k3 - k2], ai[j3 + l2]);
                }

            }

            k1 = i2 * 8 + k1;
        }

        return aflag;
    }

}
