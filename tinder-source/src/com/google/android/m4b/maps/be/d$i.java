// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.be;

import com.google.android.m4b.maps.au.a;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.be:
//            d

static final class g
{

    final int a[];
    final int b[];
    final int c[];
    final int d[];
    final int e[];
    int f;
    int g;

    final int a(Set set)
    {
        int k = 0x7fffffff;
        int i1 = -1;
        for (int j = 0; j < f;)
        {
            int l;
            int j1;
label0:
            {
                j1 = i1;
                l = k;
                if (!b(j))
                {
                    break label0;
                }
                j1 = i1;
                l = k;
                if (e[j] != 0)
                {
                    break label0;
                }
                j1 = i1;
                l = k;
                if (a[j] >= k)
                {
                    break label0;
                }
                if (set != null)
                {
                    j1 = i1;
                    l = k;
                    if (set.contains(Integer.valueOf(j)))
                    {
                        break label0;
                    }
                }
                l = a[j];
                j1 = j;
            }
            j++;
            i1 = j1;
            k = l;
        }

        return i1;
    }

    final long a()
    {
        int j = 0;
        long l = 0L;
        while (j < f) 
        {
            long l1;
            if (b[j] > 0)
            {
                l1 = b[j];
            } else
            {
                l1 = 0L;
            }
            l += l1;
            j++;
        }
        return l;
    }

    final void a(int j)
    {
        a[j] = 0;
        c[j] = 0;
        d[j] = 0;
        if (e[j] > 0)
        {
            g = g - 1;
        }
        e[j] = 0;
        b[j] = -1;
    }

    final void a(a a1)
    {
        int j = 0;
        byte abyte0[] = new byte[8192];
        int k = 0;
        for (; j < a.length; j++)
        {
            com.google.android.m4b.maps.be.d.a(abyte0, k, a[j]);
            int l = k + 4;
            com.google.android.m4b.maps.be.d.a(abyte0, l, b[j]);
            l += 4;
            com.google.android.m4b.maps.be.d.b(abyte0, l, c[j]);
            l += 2;
            com.google.android.m4b.maps.be.d.b(abyte0, l, d[j]);
            l += 2;
            com.google.android.m4b.maps.be.d.a(abyte0, l, e[j]);
            l += 4;
            com.google.android.m4b.maps.be.d.a(abyte0, l, com.google.android.m4b.maps.be.d.c(abyte0, l - 16, 16));
            k += 20;
        }

        a1.a(abyte0);
    }

    final void a(e e1)
    {
        int j = 0;
        int k = e1.b;
        if (e[k] > 0)
        {
            g = g - 1;
        }
        a[k] = 0;
        b[k] = e1.a();
        c[k] = e1.c;
        d[k] = 0;
        e[k] = 0;
        for (; j < e1.c; j++)
        {
            if (e1.b(j) == -1L)
            {
                continue;
            }
            int ai[] = d;
            ai[k] = ai[k] + 1;
            if (e1.d(j) > 0)
            {
                int ai1[] = e;
                ai1[k] = ai1[k] + 1;
            }
        }

        if (d[k] > 0 && k >= f)
        {
            f = k + 1;
        }
        if (e[k] > 0)
        {
            g = g + 1;
        }
    }

    final int b()
    {
        int j = 0;
        int k = 0;
        while (j < f) 
        {
            int l;
            if (b(j))
            {
                l = 1;
            } else
            {
                l = 0;
            }
            k += l;
            j++;
        }
        return k;
    }

    final void b(a a1)
    {
        int j = 0;
        byte abyte0[] = new byte[8192];
        a1.b(abyte0);
        f = 0;
        g = 0;
        int k = 0;
        while (j < a.length) 
        {
            a[j] = com.google.android.m4b.maps.be.d.a(abyte0, k);
            k += 4;
            b[j] = com.google.android.m4b.maps.be.d.a(abyte0, k);
            k += 4;
            c[j] = com.google.android.m4b.maps.be.d.b(abyte0, k);
            k += 2;
            d[j] = com.google.android.m4b.maps.be.d.b(abyte0, k);
            k += 2;
            e[j] = com.google.android.m4b.maps.be.d.a(abyte0, k);
            k += 4;
            if (com.google.android.m4b.maps.be.d.a(abyte0, k) != com.google.android.m4b.maps.be.d.c(abyte0, k - 16, 16))
            {
                a(j);
            } else
            {
                if (d[j] > 0)
                {
                    f = j + 1;
                }
                if (e[j] > 0)
                {
                    g = g + 1;
                }
            }
            k += 4;
            j++;
        }
    }

    final boolean b(int j)
    {
        return d[j] != 0;
    }

    (int j)
    {
        a = new int[j];
        b = new int[j];
        c = new int[j];
        d = new int[j];
        e = new int[j];
        f = 0;
        g = 0;
    }
}
