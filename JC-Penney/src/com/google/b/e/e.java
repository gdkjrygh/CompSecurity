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

public final class e extends com.google.b.e.q
{

    static final int a[] = {
        52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 
        265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 
        259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 
        385, 193, 448, 145, 400, 208, 133, 388, 196, 148, 
        168, 162, 138, 42
    };
    private static final char b[] = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".toCharArray();
    private static final int c = a[39];
    private final boolean d;
    private final boolean e;
    private final StringBuilder f;
    private final int g[];

    public e()
    {
        this(false);
    }

    public e(boolean flag)
    {
        this(flag, false);
    }

    public e(boolean flag, boolean flag1)
    {
        d = flag;
        e = flag1;
        f = new StringBuilder(20);
        g = new int[9];
    }

    private static char a(int i)
    {
        for (int j = 0; j < a.length; j++)
        {
            if (a[j] == i)
            {
                return b[j];
            }
        }

        throw m.a();
    }

    private static int a(int ai[])
    {
        int l3 = ai.length;
        int j = 0;
        do
        {
            int i = 0x7fffffff;
            int j2 = ai.length;
            for (int k = 0; k < j2;)
            {
                int k1 = ai[k];
                int i1 = i;
                if (k1 < i)
                {
                    i1 = i;
                    if (k1 > j)
                    {
                        i1 = k1;
                    }
                }
                k++;
                i = i1;
            }

            int l1 = 0;
            j = 0;
            int j1 = 0;
            int l;
            int k2;
            for (l = 0; l1 < l3; l = k2)
            {
                int i4 = ai[l1];
                int k3 = j;
                int i3 = j1;
                k2 = l;
                if (i4 > i)
                {
                    k3 = j | 1 << l3 - 1 - l1;
                    k2 = l + 1;
                    i3 = j1 + i4;
                }
                l1++;
                j = k3;
                j1 = i3;
            }

            if (l == 3)
            {
                int i2 = l;
                l = 0;
                do
                {
                    int l2;
label0:
                    {
                        l2 = j;
                        if (l < l3)
                        {
                            l2 = j;
                            if (i2 > 0)
                            {
                                int j3 = ai[l];
                                l2 = i2;
                                if (j3 <= i)
                                {
                                    break label0;
                                }
                                l2 = i2 - 1;
                                if (j3 * 2 < j1)
                                {
                                    break label0;
                                }
                                l2 = -1;
                            }
                        }
                        return l2;
                    }
                    l++;
                    i2 = l2;
                } while (true);
            }
            if (l <= 3)
            {
                return -1;
            }
            j = i;
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
            break MISSING_BLOCK_LABEL_289;
        }
        c1 = charsequence.charAt(i);
        if (c1 != '+' && c1 != '$' && c1 != '%' && c1 != '/')
        {
            break MISSING_BLOCK_LABEL_280;
        }
        c2 = charsequence.charAt(i + 1);
        c1;
        JVM INSTR lookupswitch 4: default 112
    //                   36: 159
    //                   37: 187
    //                   43: 131
    //                   47: 239;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        c1 = '\0';
_L6:
        stringbuilder.append(c1);
        i++;
_L7:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
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
_L5:
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

    private static int[] a(a a1, int ai[])
    {
        int j1 = a1.a();
        int i = a1.c(0);
        int k1 = ai.length;
        int k = i;
        int l = 0;
        int i1 = 0;
        while (k < j1) 
        {
            int j;
            if ((a1.a(k) ^ l) != 0)
            {
                ai[i1] = ai[i1] + 1;
                j = l;
                l = i;
            } else
            {
                if (i1 == k1 - 1)
                {
                    if (a(ai) == c && a1.a(Math.max(0, i - (k - i) / 2), i, false))
                    {
                        return (new int[] {
                            i, k
                        });
                    }
                    j = i + (ai[0] + ai[1]);
                    System.arraycopy(ai, 2, ai, 0, k1 - 2);
                    ai[k1 - 2] = 0;
                    ai[k1 - 1] = 0;
                    i = i1 - 1;
                } else
                {
                    i1++;
                    j = i;
                    i = i1;
                }
                ai[i] = 1;
                if (l == 0)
                {
                    boolean flag = true;
                    l = j;
                    i1 = i;
                    j = ((flag) ? 1 : 0);
                } else
                {
                    boolean flag1 = false;
                    l = j;
                    i1 = i;
                    j = ((flag1) ? 1 : 0);
                }
            }
            k++;
            i = l;
            l = j;
        }
        throw m.a();
    }

    public q a(int i, a a1, Map map)
    {
        int ai[] = g;
        Arrays.fill(ai, 0);
        Object obj = f;
        ((StringBuilder) (obj)).setLength(0);
        map = a(a1, ai);
        int j = a1.c(map[1]);
        int i2 = a1.a();
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
            int l1 = ai.length;
            k = 0;
            int i1 = j;
            for (; k < l1; k++)
            {
                i1 += ai[k];
            }

            l1 = a1.c(i1);
            if (c1 == '*')
            {
                ((StringBuilder) (obj)).setLength(((StringBuilder) (obj)).length() - 1);
                int l = 0;
                int k2 = ai.length;
                for (int j1 = 0; j1 < k2; j1++)
                {
                    l += ai[j1];
                }

                if (l1 != i2 && (l1 - j - l) * 2 < l)
                {
                    throw m.a();
                }
                if (d)
                {
                    int j2 = ((StringBuilder) (obj)).length() - 1;
                    l1 = 0;
                    for (int k1 = 0; k1 < j2; k1++)
                    {
                        l1 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(f.charAt(k1));
                    }

                    if (((StringBuilder) (obj)).charAt(j2) != b[l1 % 43])
                    {
                        throw com.google.b.d.a();
                    }
                    ((StringBuilder) (obj)).setLength(j2);
                }
                if (((StringBuilder) (obj)).length() == 0)
                {
                    throw m.a();
                }
                float f1;
                float f2;
                float f3;
                s s1;
                if (e)
                {
                    a1 = a(((CharSequence) (obj)));
                } else
                {
                    a1 = ((StringBuilder) (obj)).toString();
                }
                f1 = (float)(map[1] + map[0]) / 2.0F;
                f2 = j;
                f3 = (float)l / 2.0F;
                map = new s(f1, i);
                s1 = new s(f2 + f3, i);
                obj = com.google.b.a.c;
                return new q(a1, null, new s[] {
                    map, s1
                }, ((com.google.b.a) (obj)));
            }
            j = l1;
        } while (true);
    }

}
