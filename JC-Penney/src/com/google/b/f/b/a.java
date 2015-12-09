// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.f.b;

import com.google.b.b.b;
import com.google.b.c;
import com.google.b.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.b.f.b:
//            b

public final class a
{

    private static final int a[] = {
        0, 4, 1, 5
    };
    private static final int b[] = {
        6, 2, 7, 3
    };
    private static final int c[] = {
        8, 1, 1, 1, 1, 1, 1, 3
    };
    private static final int d[] = {
        7, 1, 1, 3, 1, 1, 1, 2, 1
    };

    private static float a(int ai[], int ai1[], float f)
    {
        int i;
        int l;
        int j1;
        j1 = ai.length;
        int j = 0;
        l = 0;
        i = 0;
        for (; j < j1; j++)
        {
            i += ai[j];
            l += ai1[j];
        }

        if (i >= l) goto _L2; else goto _L1
_L1:
        return (1.0F / 0.0F);
_L2:
        float f1;
        float f3 = (float)i / (float)l;
        f1 = 0.0F;
        int k = 0;
        do
        {
label0:
            {
                if (k >= j1)
                {
                    break label0;
                }
                int i1 = ai[k];
                float f2 = (float)ai1[k] * f3;
                if ((float)i1 > f2)
                {
                    f2 = (float)i1 - f2;
                } else
                {
                    f2 -= i1;
                }
                if (f2 > f * f3)
                {
                    continue; /* Loop/switch isn't completed */
                }
                f1 += f2;
                k++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return f1 / (float)i;
    }

    public static com.google.b.f.b.b a(c c1, Map map, boolean flag)
    {
        b b1 = c1.c();
        List list = a(flag, b1);
        map = list;
        c1 = b1;
        if (list.isEmpty())
        {
            c1 = b1.h();
            c1.b();
            map = a(flag, ((b) (c1)));
        }
        return new com.google.b.f.b.b(c1, map);
    }

    private static List a(boolean flag, b b1)
    {
        ArrayList arraylist;
        int i;
        int j;
        int k;
        arraylist = new ArrayList();
        j = 0;
        k = 0;
        i = 0;
_L8:
        if (i >= b1.g()) goto _L2; else goto _L1
_L1:
        Object obj = a(b1, i, k);
        if (obj[0] != null || obj[3] != null) goto _L4; else goto _L3
_L3:
        if (j != 0) goto _L5; else goto _L2
_L2:
        return arraylist;
_L5:
        obj = arraylist.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            s as[] = (s[])((Iterator) (obj)).next();
            j = i;
            if (as[1] != null)
            {
                j = (int)Math.max(i, as[1].b());
            }
            i = j;
            if (as[3] != null)
            {
                i = Math.max(j, (int)as[3].b());
            }
        } while (true);
        k = 0;
        i += 5;
        j = 0;
        continue; /* Loop/switch isn't completed */
_L4:
        arraylist.add(obj);
        if (!flag) goto _L2; else goto _L6
_L6:
        int l;
        if (obj[2] != null)
        {
            i = (int)obj[2].a();
            j = (int)obj[2].b();
        } else
        {
            i = (int)obj[4].a();
            j = (int)obj[4].b();
        }
        l = j;
        j = 1;
        k = i;
        i = l;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static void a(s as[], s as1[], int ai[])
    {
        for (int i = 0; i < ai.length; i++)
        {
            as[ai[i]] = as1[i];
        }

    }

    private static int[] a(b b1, int i, int j, int k, boolean flag, int ai[], int ai1[])
    {
        Arrays.fill(ai1, 0, ai1.length, 0);
        int k1 = ai.length;
        for (int l = 0; b1.a(i, j) && i > 0 && l < 3; l++)
        {
            i--;
        }

        boolean flag1 = false;
        int i1 = i;
        int j1 = i;
        i = i1;
        i1 = ((flag1) ? 1 : 0);
        while (j1 < k) 
        {
            if (b1.a(j1, j) ^ flag)
            {
                ai1[i1] = ai1[i1] + 1;
            } else
            {
                if (i1 == k1 - 1)
                {
                    if (a(ai1, ai, 0.8F) < 0.42F)
                    {
                        return (new int[] {
                            i, j1
                        });
                    }
                    i += ai1[0] + ai1[1];
                    System.arraycopy(ai1, 2, ai1, 0, k1 - 2);
                    ai1[k1 - 2] = 0;
                    ai1[k1 - 1] = 0;
                    i1--;
                } else
                {
                    i1++;
                }
                ai1[i1] = 1;
                if (!flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            j1++;
        }
        if (i1 == k1 - 1 && a(ai1, ai, 0.8F) < 0.42F)
        {
            return (new int[] {
                i, j1 - 1
            });
        } else
        {
            return null;
        }
    }

    private static s[] a(b b1, int i, int j)
    {
        int k = b1.g();
        int l = b1.f();
        s as[] = new s[8];
        a(as, a(b1, k, l, i, j, c), a);
        if (as[4] != null)
        {
            j = (int)as[4].a();
            i = (int)as[4].b();
        }
        a(as, a(b1, k, l, i, j, d), b);
        return as;
    }

    private static s[] a(b b1, int i, int j, int k, int l, int ai[])
    {
        s as[];
        int ai4[];
        as = new s[4];
        ai4 = new int[ai.length];
_L10:
        int ai1[];
        if (k >= i)
        {
            break MISSING_BLOCK_LABEL_354;
        }
        ai1 = a(b1, l, k, j, false, ai, ai4);
        if (ai1 == null) goto _L2; else goto _L1
_L1:
label0:
        {
            int i1 = k;
            do
            {
                k = i1;
                if (i1 <= 0)
                {
                    break label0;
                }
                i1--;
                int ai2[] = a(b1, l, i1, j, false, ai, ai4);
                if (ai2 == null)
                {
                    break;
                }
                ai1 = ai2;
            } while (true);
            k = i1 + 1;
        }
        as[0] = new s(ai1[0], k);
        as[1] = new s(ai1[1], k);
        boolean flag = true;
        l = k;
        k = ((flag) ? 1 : 0);
_L13:
        int j1;
        int k1;
        j1 = l + 1;
        k1 = j1;
        if (k == 0) goto _L4; else goto _L3
_L3:
        ai1 = new int[2];
        ai1[0] = (int)as[0].a();
        ai1[1] = (int)as[1].a();
        k = 0;
_L9:
        if (j1 >= i) goto _L6; else goto _L5
_L5:
        int ai3[] = a(b1, ai1[0], j1, j, false, ai, ai4);
        if (ai3 == null || Math.abs(ai1[0] - ai3[0]) >= 5 || Math.abs(ai1[1] - ai3[1]) >= 5) goto _L8; else goto _L7
_L7:
        k = 0;
        ai1 = ai3;
_L12:
        j1++;
          goto _L9
_L2:
        k += 5;
          goto _L10
_L8:
        if (k <= 25) goto _L11; else goto _L6
_L6:
        k1 = j1 - (k + 1);
        as[2] = new s(ai1[0], k1);
        as[3] = new s(ai1[1], k1);
          goto _L4
_L11:
        k++;
          goto _L12
_L4:
        if (k1 - l < 10)
        {
            for (i = 0; i < as.length; i++)
            {
                as[i] = null;
            }

        }
        return as;
        boolean flag1 = false;
        l = k;
        k = ((flag1) ? 1 : 0);
          goto _L13
    }

}
