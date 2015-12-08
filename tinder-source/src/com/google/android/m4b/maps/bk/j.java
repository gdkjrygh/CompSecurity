// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bk;

import com.google.android.m4b.maps.r.b;
import com.google.android.m4b.maps.r.c;
import com.google.android.m4b.maps.r.d;

// Referenced classes of package com.google.android.m4b.maps.bk:
//            m, g, a

class j extends m
    implements c
{

    j(g g1)
    {
        super(g1);
        a(g1);
    }

    protected j(double ad[])
    {
        super(ad);
        a(a);
    }

    private j(double ad[], int ai[])
    {
        super(g.a(ad), ai);
    }

    private void a(a a1)
    {
        c = a1.a;
        b = new int[c];
        for (int i = 0; i < c; i++)
        {
            b[i] = i;
        }

        com.google.android.m4b.maps.r.b.a().a(this, 0, c - 1);
    }

    private int[] c(int i, int k)
    {
        int j1 = 0;
        int l = 0;
        if (i > k)
        {
            int i2 = i - k - 1;
            int ai[] = new int[c - i2];
            int ai2[] = b;
            int k2 = ai2.length;
            for (int k1 = 0; k1 < k2; k1++)
            {
                int i3 = ai2[k1];
                j1 = l;
                if (i3 <= k)
                {
                    ai[l] = i3;
                    j1 = l + 1;
                }
                l = j1;
                if (i3 >= i)
                {
                    ai[j1] = i3 - i2;
                    l = j1 + 1;
                }
            }

            return ai;
        }
        int ai1[] = new int[(k - i) + 1];
        int ai3[] = b;
        int j2 = ai3.length;
        for (int i1 = 0; i1 < j2;)
        {
            int l2 = ai3[i1];
            int l1 = j1;
            if (l2 >= i)
            {
                l1 = j1;
                if (l2 <= k)
                {
                    ai1[j1] = l2 - i;
                    l1 = j1 + 1;
                }
            }
            i1++;
            j1 = l1;
        }

        return ai1;
    }

    public final void a()
    {
        throw new UnsupportedOperationException("SortedVertexMapping is immutable.");
    }

    public final void a(int i)
    {
        throw new UnsupportedOperationException("SortedVertexMapping is immutable.");
    }

    public final boolean a(int i, int k)
    {
        int l = a.a(b[i], b[k]);
        if (l == 0) goto _L2; else goto _L1
_L1:
        if (l >= 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        int ai[];
        int ai3[];
        a.a a1;
        i = b[i];
        k = b[k];
        ai = new int[2];
        ai[0] = i;
        ai[1] = a.d(i);
        int ai1[] = new int[2];
        ai1[0] = k;
        ai1[1] = a.d(k);
        int ai2[] = new int[2];
        ai2[0] = i;
        ai2[1] = a.c(i);
        ai3 = new int[2];
        ai3[0] = k;
        ai3[1] = a.c(k);
        a1 = new a.a(a, i);
        if (a1.a(ai, ai1) < 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (a1.a(ai2, ai3) >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (a1.a(ai2, ai1) < 0 || i != 0) goto _L3; else goto _L5
_L5:
        return false;
        if (a1.a(ai, ai3) < 0 && i != 0) goto _L3; else goto _L6
_L6:
        return false;
    }

    public final void b()
    {
        throw new UnsupportedOperationException("SortedVertexMapping is immutable.");
    }

    public final void b(int i, int k)
    {
        int l = b[i];
        b[i] = b[k];
        b[k] = l;
    }

    public final transient void b(int ai[])
    {
        throw new UnsupportedOperationException("SortedVertexMapping is immutable.");
    }

    public final j d(int i, int k)
    {
        if (a.a() != 0)
        {
            throw new NullPointerException("Cannot create a sorted sublist when there are holes.");
        }
        if (i > k)
        {
            double ad[] = new double[((k + 1 + e()) - i) * 2];
            a.a(0, ad, 0, k + 1);
            a.a(i, ad, k + 1, e() - i);
            return new j(ad, c(i, k));
        } else
        {
            int l = (k - i) + 1;
            double ad1[] = new double[l * 2];
            a.a(i, ad1, 0, l);
            return new j(ad1, c(i, k));
        }
    }

    public final void e(int i, int k)
    {
        throw new UnsupportedOperationException("SortedVertexMapping is immutable.");
    }

    public final void f(int i, int k)
    {
        throw new UnsupportedOperationException("SortedVertexMapping is immutable.");
    }
}
