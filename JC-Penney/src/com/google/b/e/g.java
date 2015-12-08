// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.b.a;
import com.google.b.d;
import com.google.b.h;
import com.google.b.m;
import com.google.b.q;
import com.google.b.s;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.b.e:
//            q

public final class g extends com.google.b.e.q
{

    private static final char a[] = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
    private static final int b[] = {
        276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 
        424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 
        282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 
        406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 
        366, 374, 430, 294, 474, 470, 306, 350
    };
    private static final int c = b[47];
    private final StringBuilder d = new StringBuilder(20);
    private final int e[] = new int[6];

    public g()
    {
    }

    private static char a(int i)
    {
        for (int j = 0; j < b.length; j++)
        {
            if (b[j] == i)
            {
                return a[j];
            }
        }

        throw m.a();
    }

    private static int a(int ai[])
    {
        int i2 = ai.length;
        int j = ai.length;
        int i = 0;
        int i1;
        int j1;
        for (i1 = 0; i < j; i1 = j1 + i1)
        {
            j1 = ai[i];
            i++;
        }

        int k1 = 0;
        i = 0;
        do
        {
            int j2;
label0:
            {
                int k = i;
                if (k1 < i2)
                {
                    j2 = Math.round(((float)ai[k1] * 9F) / (float)i1);
                    if (j2 >= 1 && j2 <= 4)
                    {
                        break label0;
                    }
                    k = -1;
                }
                return k;
            }
            int l;
            if ((k1 & 1) == 0)
            {
                int l1 = 0;
                do
                {
                    l = i;
                    if (l1 >= j2)
                    {
                        break;
                    }
                    l1++;
                    i = i << 1 | 1;
                } while (true);
            } else
            {
                l = i << j2;
            }
            k1++;
            i = l;
        } while (true);
    }

    private static String a(CharSequence charsequence)
    {
        StringBuilder stringbuilder;
        int i;
        int j;
        j = charsequence.length();
        stringbuilder = new StringBuilder(j);
        i = 0;
_L9:
        char c1;
        char c2;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        c1 = charsequence.charAt(i);
        if (c1 < 'a' || c1 > 'd')
        {
            break MISSING_BLOCK_LABEL_268;
        }
        if (i >= j - 1)
        {
            throw h.a();
        }
        c2 = charsequence.charAt(i + 1);
        c1;
        JVM INSTR tableswitch 97 100: default 100
    //                   97 147
    //                   98 175
    //                   99 227
    //                   100 119;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        c1 = '\0';
_L6:
        stringbuilder.append(c1);
        i++;
_L7:
        i++;
        continue; /* Loop/switch isn't completed */
_L5:
        if (c2 >= 'A' && c2 <= 'Z')
        {
            c1 = (char)(c2 + 32);
        } else
        {
            throw h.a();
        }
          goto _L6
_L2:
        if (c2 >= 'A' && c2 <= 'Z')
        {
            c1 = (char)(c2 - 64);
        } else
        {
            throw h.a();
        }
          goto _L6
_L3:
        if (c2 >= 'A' && c2 <= 'E')
        {
            c1 = (char)(c2 - 38);
        } else
        if (c2 >= 'F' && c2 <= 'W')
        {
            c1 = (char)(c2 - 11);
        } else
        {
            throw h.a();
        }
          goto _L6
_L4:
        if (c2 >= 'A' && c2 <= 'O')
        {
            c1 = (char)(c2 - 32);
        } else
        if (c2 == 'Z')
        {
            c1 = ':';
        } else
        {
            throw h.a();
        }
          goto _L6
        stringbuilder.append(c1);
          goto _L7
        return stringbuilder.toString();
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static void a(CharSequence charsequence, int i, int j)
    {
        int k = 1;
        int i1 = i - 1;
        int l = 0;
        do
        {
            int j1 = k;
            if (i1 < 0)
            {
                break;
            }
            int l1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charsequence.charAt(i1));
            int k1 = j1 + 1;
            k = k1;
            if (k1 > j)
            {
                k = 1;
            }
            i1--;
            l = l1 * j1 + l;
        } while (true);
        if (charsequence.charAt(i) != a[l % 47])
        {
            throw com.google.b.d.a();
        } else
        {
            return;
        }
    }

    private int[] a(a a1)
    {
        int i1 = a1.a();
        int i = a1.c(0);
        Arrays.fill(e, 0);
        int ai[] = e;
        int j1 = ai.length;
        int k = i;
        boolean flag = false;
        int l = 0;
        while (k < i1) 
        {
            int j;
            if (a1.a(k) ^ flag)
            {
                ai[l] = ai[l] + 1;
                j = ((flag) ? 1 : 0);
            } else
            {
                if (l == j1 - 1)
                {
                    if (a(ai) == c)
                    {
                        return (new int[] {
                            i, k
                        });
                    }
                    i += ai[0] + ai[1];
                    System.arraycopy(ai, 2, ai, 0, j1 - 2);
                    ai[j1 - 2] = 0;
                    ai[j1 - 1] = 0;
                    j = l - 1;
                } else
                {
                    j = l + 1;
                }
                ai[j] = 1;
                if (!flag)
                {
                    boolean flag1 = true;
                    l = j;
                    j = ((flag1) ? 1 : 0);
                } else
                {
                    boolean flag2 = false;
                    l = j;
                    j = ((flag2) ? 1 : 0);
                }
            }
            k++;
            flag = j;
        }
        throw m.a();
    }

    private static void b(CharSequence charsequence)
    {
        int i = charsequence.length();
        a(charsequence, i - 2, 20);
        a(charsequence, i - 1, 15);
    }

    public q a(int i, a a1, Map map)
    {
        map = a(a1);
        int j = a1.c(map[1]);
        int l1 = a1.a();
        int ai[] = e;
        Arrays.fill(ai, 0);
        Object obj = d;
        ((StringBuilder) (obj)).setLength(0);
        do
        {
            a(a1, j, ai);
            int k = a(ai);
            if (k < 0)
            {
                throw m.a();
            }
            char c1 = a(k);
            ((StringBuilder) (obj)).append(c1);
            int k1 = ai.length;
            k = 0;
            int i1 = j;
            for (; k < k1; k++)
            {
                i1 += ai[k];
            }

            k1 = a1.c(i1);
            if (c1 == '*')
            {
                ((StringBuilder) (obj)).deleteCharAt(((StringBuilder) (obj)).length() - 1);
                int j1 = 0;
                int i2 = ai.length;
                for (int l = 0; l < i2; l++)
                {
                    j1 += ai[l];
                }

                if (k1 == l1 || !a1.a(k1))
                {
                    throw m.a();
                }
                if (((StringBuilder) (obj)).length() < 2)
                {
                    throw m.a();
                } else
                {
                    b(((CharSequence) (obj)));
                    ((StringBuilder) (obj)).setLength(((StringBuilder) (obj)).length() - 2);
                    a1 = a(((CharSequence) (obj)));
                    float f = (float)(map[1] + map[0]) / 2.0F;
                    float f1 = j;
                    float f2 = (float)j1 / 2.0F;
                    map = new s(f, i);
                    s s1 = new s(f1 + f2, i);
                    obj = com.google.b.a.d;
                    return new q(a1, null, new s[] {
                        map, s1
                    }, ((com.google.b.a) (obj)));
                }
            }
            j = k1;
        } while (true);
    }

}
