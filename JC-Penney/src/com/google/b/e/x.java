// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.b.a;
import com.google.b.d;
import com.google.b.e;
import com.google.b.h;
import com.google.b.m;
import com.google.b.p;
import com.google.b.q;
import com.google.b.r;
import com.google.b.s;
import com.google.b.t;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.b.e:
//            q, w, l

public abstract class x extends com.google.b.e.q
{

    static final int b[] = {
        1, 1, 1
    };
    static final int c[] = {
        1, 1, 1, 1, 1
    };
    static final int d[][];
    static final int e[][];
    private final StringBuilder a = new StringBuilder(20);
    private final w f = new w();
    private final l g = new l();

    protected x()
    {
    }

    static int a(a a1, int ai[], int i, int ai1[][])
    {
        a(a1, i, ai);
        float f1 = 0.48F;
        int j = -1;
        int k = ai1.length;
        for (i = 0; i < k; i++)
        {
            float f2 = a(ai, ai1[i], 0.7F);
            if (f2 < f1)
            {
                j = i;
                f1 = f2;
            }
        }

        if (j >= 0)
        {
            return j;
        } else
        {
            throw m.a();
        }
    }

    static boolean a(CharSequence charsequence)
    {
        int i1 = charsequence.length();
        if (i1 != 0)
        {
            int i = i1 - 2;
            int k = 0;
            for (; i >= 0; i -= 2)
            {
                int k1 = charsequence.charAt(i) - 48;
                if (k1 < 0 || k1 > 9)
                {
                    throw h.a();
                }
                k += k1;
            }

            k *= 3;
            for (int j = i1 - 1; j >= 0; j -= 2)
            {
                int j1 = charsequence.charAt(j) - 48;
                if (j1 < 0 || j1 > 9)
                {
                    throw h.a();
                }
                k += j1;
            }

            if (k % 10 == 0)
            {
                return true;
            }
        }
        return false;
    }

    static int[] a(a a1)
    {
        int ai2[] = new int[b.length];
        int i = 0;
        int ai[] = null;
        boolean flag = false;
        do
        {
            if (flag)
            {
                break;
            }
            Arrays.fill(ai2, 0, b.length, 0);
            int ai1[] = a(a1, i, false, b, ai2);
            int k = ai1[0];
            int j = ai1[1];
            int i1 = k - (j - k);
            i = j;
            ai = ai1;
            if (i1 >= 0)
            {
                flag = a1.a(i1, k, false);
                i = j;
                ai = ai1;
            }
        } while (true);
        return ai;
    }

    static int[] a(a a1, int i, boolean flag, int ai[])
    {
        return a(a1, i, flag, ai, new int[ai.length]);
    }

    private static int[] a(a a1, int i, boolean flag, int ai[], int ai1[])
    {
        int j1 = ai.length;
        int k1 = a1.a();
        int j;
        int k;
        if (flag)
        {
            i = a1.d(i);
        } else
        {
            i = a1.c(i);
        }
        k = i;
        j = 0;
        while (k < k1) 
        {
            int i1;
            if (a1.a(k) ^ flag)
            {
                ai1[j] = ai1[j] + 1;
                i1 = j;
                j = i;
            } else
            {
                if (j == j1 - 1)
                {
                    if (a(ai1, ai, 0.7F) < 0.48F)
                    {
                        return (new int[] {
                            i, k
                        });
                    }
                    i1 = i + (ai1[0] + ai1[1]);
                    System.arraycopy(ai1, 2, ai1, 0, j1 - 2);
                    ai1[j1 - 2] = 0;
                    ai1[j1 - 1] = 0;
                    i = j - 1;
                    j = i1;
                } else
                {
                    i1 = j + 1;
                    j = i;
                    i = i1;
                }
                ai1[i] = 1;
                if (!flag)
                {
                    flag = true;
                    i1 = i;
                } else
                {
                    flag = false;
                    i1 = i;
                }
            }
            k++;
            i = j;
            j = i1;
        }
        throw m.a();
    }

    protected abstract int a(a a1, int ai[], StringBuilder stringbuilder);

    public q a(int i, a a1, Map map)
    {
        return a(i, a1, a(a1), map);
    }

    public q a(int i, a a1, int ai[], Map map)
    {
        Object obj;
        Object obj1;
        int ai1[];
        int j;
        int i1;
        if (map == null)
        {
            obj = null;
        } else
        {
            obj = (t)map.get(e.j);
        }
        if (obj != null)
        {
            ((t) (obj)).a(new s((float)(ai[0] + ai[1]) / 2.0F, i));
        }
        obj1 = a;
        ((StringBuilder) (obj1)).setLength(0);
        j = a(a1, ai, ((StringBuilder) (obj1)));
        if (obj != null)
        {
            ((t) (obj)).a(new s(j, i));
        }
        ai1 = a(a1, j);
        if (obj != null)
        {
            ((t) (obj)).a(new s((float)(ai1[0] + ai1[1]) / 2.0F, i));
        }
        j = ai1[1];
        i1 = (j - ai1[0]) + j;
        if (i1 >= a1.a() || !a1.a(j, i1, false))
        {
            throw m.a();
        }
        obj = ((StringBuilder) (obj1)).toString();
        if (((String) (obj)).length() < 8)
        {
            throw h.a();
        }
        if (!a(((String) (obj))))
        {
            throw com.google.b.d.a();
        }
        float f1 = (float)(ai[1] + ai[0]) / 2.0F;
        float f2 = (float)(ai1[1] + ai1[0]) / 2.0F;
        obj1 = b();
        ai = new q(((String) (obj)), null, new s[] {
            new s(f1, i), new s(f2, i)
        }, ((com.google.b.a) (obj1)));
        try
        {
            a1 = f.a(i, a1, ai1[1]);
            ai.a(r.h, a1.a());
            ai.a(a1.e());
            ai.a(a1.c());
            i = a1.a().length();
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            i = 0;
        }
        if (map == null)
        {
            a1 = null;
        } else
        {
            a1 = (int[])(int[])map.get(e.k);
        }
        if (a1 != null)
        {
            boolean flag1 = false;
            int j1 = a1.length;
            int k = 0;
label0:
            do
            {
label1:
                {
                    boolean flag = flag1;
                    if (k < j1)
                    {
                        if (i != a1[k])
                        {
                            break label1;
                        }
                        flag = true;
                    }
                    if (!flag)
                    {
                        throw m.a();
                    }
                    break label0;
                }
                k++;
            } while (true);
        }
        if (obj1 == com.google.b.a.h || obj1 == com.google.b.a.o)
        {
            a1 = g.a(((String) (obj)));
            if (a1 != null)
            {
                ai.a(r.g, a1);
            }
        }
        return ai;
    }

    boolean a(String s1)
    {
        return a(((CharSequence) (s1)));
    }

    int[] a(a a1, int i)
    {
        return a(a1, i, false, b);
    }

    abstract com.google.b.a b();

    static 
    {
        int ai[] = {
            3, 2, 1, 1
        };
        int ai2[] = {
            1, 4, 1, 1
        };
        int ai4[] = {
            1, 2, 1, 3
        };
        d = (new int[][] {
            ai, new int[] {
                2, 2, 2, 1
            }, new int[] {
                2, 1, 2, 2
            }, ai2, new int[] {
                1, 1, 3, 2
            }, new int[] {
                1, 2, 3, 1
            }, new int[] {
                1, 1, 1, 4
            }, new int[] {
                1, 3, 1, 2
            }, ai4, new int[] {
                3, 1, 1, 2
            }
        });
        e = new int[20][];
        System.arraycopy(d, 0, e, 0, 10);
        for (int i = 10; i < 20; i++)
        {
            int ai1[] = d[i - 10];
            int ai3[] = new int[ai1.length];
            for (int j = 0; j < ai1.length; j++)
            {
                ai3[j] = ai1[ai1.length - j - 1];
            }

            e[i] = ai3;
        }

    }
}
