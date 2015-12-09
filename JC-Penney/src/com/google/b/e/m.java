// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.b.a;
import com.google.b.e;
import com.google.b.h;
import com.google.b.q;
import com.google.b.s;
import java.util.Map;

// Referenced classes of package com.google.b.e:
//            q

public final class m extends com.google.b.e.q
{

    static final int a[][];
    private static final int b[] = {
        6, 8, 10, 12, 14
    };
    private static final int d[] = {
        1, 1, 1, 1
    };
    private static final int e[] = {
        1, 1, 3
    };
    private int c;

    public m()
    {
        c = -1;
    }

    private static int a(int ai[])
    {
        float f = 0.38F;
        int j = -1;
        int k = a.length;
        for (int i = 0; i < k; i++)
        {
            float f1 = a(ai, a[i], 0.78F);
            if (f1 < f)
            {
                j = i;
                f = f1;
            }
        }

        if (j >= 0)
        {
            return j;
        } else
        {
            throw com.google.b.m.a();
        }
    }

    private void a(a a1, int i)
    {
        int j = c * 10;
        if (j >= i)
        {
            j = i;
        }
        i--;
        do
        {
            if (j <= 0 || i < 0 || a1.a(i))
            {
                if (j != 0)
                {
                    throw com.google.b.m.a();
                } else
                {
                    return;
                }
            }
            j--;
            i--;
        } while (true);
    }

    private static void a(a a1, int i, int j, StringBuilder stringbuilder)
    {
        int ai[] = new int[10];
        int ai1[] = new int[5];
        int ai2[] = new int[5];
        while (i < j) 
        {
            a(a1, i, ai);
            for (int k = 0; k < 5; k++)
            {
                int i1 = k * 2;
                ai1[k] = ai[i1];
                ai2[k] = ai[i1 + 1];
            }

            stringbuilder.append((char)(a(ai1) + 48));
            stringbuilder.append((char)(a(ai2) + 48));
            int j1 = ai.length;
            int l = 0;
            while (l < j1) 
            {
                i += ai[l];
                l++;
            }
        }
    }

    private static int c(a a1)
    {
        int i = a1.a();
        int j = a1.c(0);
        if (j == i)
        {
            throw com.google.b.m.a();
        } else
        {
            return j;
        }
    }

    private static int[] c(a a1, int i, int ai[])
    {
        int k1 = ai.length;
        int ai1[] = new int[k1];
        int l1 = a1.a();
        int j = i;
        int j1 = 0;
        int i1 = 0;
        int l = i;
        i = j;
        while (l < l1) 
        {
            int k;
            if ((a1.a(l) ^ i1) != 0)
            {
                ai1[j1] = ai1[j1] + 1;
                k = i1;
                i1 = i;
            } else
            {
                if (j1 == k1 - 1)
                {
                    if (a(ai1, ai, 0.78F) < 0.38F)
                    {
                        return (new int[] {
                            i, l
                        });
                    }
                    k = i + (ai1[0] + ai1[1]);
                    System.arraycopy(ai1, 2, ai1, 0, k1 - 2);
                    ai1[k1 - 2] = 0;
                    ai1[k1 - 1] = 0;
                    i = j1 - 1;
                } else
                {
                    j1++;
                    k = i;
                    i = j1;
                }
                ai1[i] = 1;
                if (i1 == 0)
                {
                    boolean flag = true;
                    i1 = k;
                    j1 = i;
                    k = ((flag) ? 1 : 0);
                } else
                {
                    boolean flag1 = false;
                    i1 = k;
                    j1 = i;
                    k = ((flag1) ? 1 : 0);
                }
            }
            l++;
            i = i1;
            i1 = k;
        }
        throw com.google.b.m.a();
    }

    public q a(int i, a a1, Map map)
    {
        int ai1[] = a(a1);
        int ai[] = b(a1);
        Object obj = new StringBuilder(20);
        a(a1, ai1[1], ai[0], ((StringBuilder) (obj)));
        obj = ((StringBuilder) (obj)).toString();
        com.google.b.a a2;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        if (map != null)
        {
            a1 = (int[])(int[])map.get(e.f);
        } else
        {
            a1 = null;
        }
        map = a1;
        if (a1 == null)
        {
            map = b;
        }
        i1 = ((String) (obj)).length();
        j1 = map.length;
        k = 0;
        j = 0;
        if (k >= j1) goto _L2; else goto _L1
_L1:
        l = map[k];
        if (i1 != l) goto _L4; else goto _L3
_L3:
        k = 1;
_L6:
        l = k;
        if (k == 0)
        {
            l = k;
            if (i1 > j)
            {
                l = 1;
            }
        }
        if (l == 0)
        {
            throw h.a();
        } else
        {
            a1 = new s(ai1[1], i);
            map = new s(ai[0], i);
            a2 = com.google.b.a.i;
            return new q(((String) (obj)), null, new s[] {
                a1, map
            }, a2);
        }
_L4:
        if (l > j)
        {
            j = l;
        }
        k++;
        break MISSING_BLOCK_LABEL_93;
_L2:
        k = 0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    int[] a(a a1)
    {
        int ai[] = c(a1, c(a1), d);
        c = (ai[1] - ai[0]) / 4;
        a(a1, ai[0]);
        return ai;
    }

    int[] b(a a1)
    {
        a1.e();
        int ai[];
        ai = c(a1, c(a1), e);
        a(a1, ai[0]);
        int i = ai[0];
        ai[0] = a1.a() - ai[1];
        ai[1] = a1.a() - i;
        a1.e();
        return ai;
        Exception exception;
        exception;
        a1.e();
        throw exception;
    }

    static 
    {
        int ai[] = {
            1, 1, 1, 3, 3
        };
        a = (new int[][] {
            new int[] {
                1, 1, 3, 3, 1
            }, new int[] {
                3, 1, 1, 1, 3
            }, new int[] {
                1, 3, 1, 1, 3
            }, new int[] {
                3, 3, 1, 1, 1
            }, new int[] {
                1, 1, 3, 1, 3
            }, new int[] {
                3, 1, 3, 1, 1
            }, new int[] {
                1, 3, 3, 1, 1
            }, ai, new int[] {
                3, 1, 1, 3, 1
            }, new int[] {
                1, 3, 1, 3, 1
            }
        });
    }
}
