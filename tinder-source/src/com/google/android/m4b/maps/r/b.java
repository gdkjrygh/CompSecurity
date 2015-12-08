// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.r;


// Referenced classes of package com.google.android.m4b.maps.r:
//            d, c, a

public final class b
    implements d
{

    private static final d a = new b();

    private b()
    {
    }

    private static int a(c c1, int i, int j, int k)
    {
        if (!c1.a(i, j)) goto _L2; else goto _L1
_L1:
        if (!c1.a(j, k)) goto _L4; else goto _L3
_L3:
        return j;
_L4:
        if (c1.a(i, k))
        {
            return k;
        } else
        {
            return i;
        }
_L2:
        if (!c1.a(k, j))
        {
            if (c1.a(k, i))
            {
                return k;
            } else
            {
                return i;
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public static d a()
    {
        return a;
    }

    private static void b(c c1, int i, int j, int k)
    {
        for (int l = 0; l < k; l++)
        {
            c1.b(i + l, j + l);
        }

    }

    public final void a(c c1, int i, int j)
    {
        do
        {
            if (j - i < 8)
            {
                break;
            }
            int k;
            int l;
            int i1;
            int i2;
            int k2;
            if ((j - i) + 1 > 100)
            {
                k = (j - i) / 8;
                k = a(c1, a(c1, k * 0 + i, k * 1 + i, k * 2 + i), a(c1, k * 3 + i, k * 4 + i, k * 5 + i), a(c1, k * 6 + i, k * 7 + i, k * 8 + i));
            } else
            {
                k = a(c1, i, (i + j) / 2, j);
            }
            k2 = j;
            i2 = j;
            l = i;
            i1 = i;
            do
            {
                int l1 = k;
                int j1 = k2;
                int j2 = i2;
                if (l <= i2)
                {
                    l1 = k;
                    j1 = k2;
                    j2 = i2;
                    if (!c1.a(k, l))
                    {
                        if (!c1.a(l, k))
                        {
                            c1.b(i1, l);
                            k = i1 + 1;
                        } else
                        {
                            int k1 = k;
                            k = i1;
                            i1 = k1;
                        }
                        j1 = l + 1;
                        l = k;
                        k = i1;
                        i1 = l;
                        l = j1;
                        continue;
                    }
                }
                while (l <= j2 && !c1.a(j2, l1)) 
                {
                    if (!c1.a(l1, j2))
                    {
                        c1.b(j2, j1);
                        k = j1 - 1;
                    } else
                    {
                        k = j1;
                        j1 = l1;
                    }
                    j2--;
                    l1 = j1;
                    j1 = k;
                }
                if (l > j2)
                {
                    break;
                }
                if (l == l1)
                {
                    k = j2;
                } else
                {
                    k = l1;
                    if (j2 == l1)
                    {
                        k = l;
                    }
                }
                c1.b(l, j2);
                l++;
                i2 = j2 - 1;
                k2 = j1;
            } while (true);
            k = Math.min(i1 - i, l - i1);
            b(c1, i, l - k, k);
            k = Math.min(j1 - j2, j - j1);
            b(c1, l, (j + 1) - k, k);
            k = ((l - i1) + i) - 1;
            l = (j + 1) - (j1 - j2);
            if (k - i < j - l)
            {
                j1 = l;
                i1 = j;
                l = i;
            } else
            {
                i1 = k;
                k = j;
                j1 = i;
            }
            j = i1;
            i = j1;
            if (l < k)
            {
                a(c1, l, k);
                j = i1;
                i = j1;
            }
        } while (true);
        com.google.android.m4b.maps.r.a.a().a(c1, i, j);
    }

}
