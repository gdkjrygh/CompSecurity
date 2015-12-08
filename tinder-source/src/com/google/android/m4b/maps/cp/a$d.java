// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cp;

import com.google.android.m4b.maps.cu.a;
import com.google.android.m4b.maps.cu.b;
import com.google.android.m4b.maps.cu.j;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.cp:
//            a

public static final class n extends b
{

    public long a;
    public byte b[];
    public long c;
    private long d;
    private String e;
    private int f;
    private int g;
    private boolean h;
    private r i[];
    private r j;
    private byte k[];
    private byte l[];
    private r o;
    private String p;
    private r q;
    private byte r[];

    public final void a(a a1)
    {
        if (a != 0L)
        {
            a1.a(1, a);
        }
        if (!e.equals(""))
        {
            a1.a(2, e);
        }
        if (i != null && i.length > 0)
        {
            for (int i1 = 0; i1 < i.length; i1++)
            {
                n n = i[i1];
                if (n != null)
                {
                    a1.c(3, 2);
                    a1.a(n);
                }
            }

        }
        if (!Arrays.equals(b, j.a))
        {
            a1.a(6, b);
        }
        if (!Arrays.equals(k, j.a))
        {
            a1.a(8, k);
        }
        if (!Arrays.equals(l, j.a))
        {
            a1.a(13, l);
        }
        if (!p.equals(""))
        {
            a1.a(14, p);
        }
        if (c != 0x2bf20L)
        {
            long l1 = c;
            a1.c(15, 0);
            a1.a(com.google.android.m4b.maps.cu.a.c(l1));
        }
        if (0L != 0L)
        {
            a1.a(17, 0L);
        }
        if (!Arrays.equals(r, j.a))
        {
            a1.a(18, r);
        }
        super.a(a1);
    }

    protected final int b()
    {
        int i1 = super.b();
        int j1 = i1;
        if (a != 0L)
        {
            j1 = i1 + com.google.android.m4b.maps.cu.a.b(1, a);
        }
        i1 = j1;
        if (!e.equals(""))
        {
            i1 = j1 + com.google.android.m4b.maps.cu.a.b(2, e);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1;
            if (i.length > 0)
            {
                for (j1 = 0; j1 < i.length;)
                {
                    r r1 = i[j1];
                    int k1 = i1;
                    if (r1 != null)
                    {
                        k1 = i1 + com.google.android.m4b.maps.cu.a.a(3, r1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (!Arrays.equals(b, j.a))
        {
            i1 = j1 + com.google.android.m4b.maps.cu.a.b(6, b);
        }
        j1 = i1;
        if (!Arrays.equals(k, j.a))
        {
            j1 = i1 + com.google.android.m4b.maps.cu.a.b(8, k);
        }
        i1 = j1;
        if (!Arrays.equals(l, j.a))
        {
            i1 = j1 + com.google.android.m4b.maps.cu.a.b(13, l);
        }
        j1 = i1;
        if (!p.equals(""))
        {
            j1 = i1 + com.google.android.m4b.maps.cu.a.b(14, p);
        }
        i1 = j1;
        if (c != 0x2bf20L)
        {
            long l1 = c;
            i1 = j1 + (com.google.android.m4b.maps.cu.a.a(15) + com.google.android.m4b.maps.cu.a.b(com.google.android.m4b.maps.cu.a.c(l1)));
        }
        j1 = i1;
        if (0L != 0L)
        {
            j1 = i1 + com.google.android.m4b.maps.cu.a.b(17, 0L);
        }
        i1 = j1;
        if (!Arrays.equals(r, j.a))
        {
            i1 = j1 + com.google.android.m4b.maps.cu.a.b(18, r);
        }
        return i1;
    }

    public ()
    {
        a = 0L;
        d = 0L;
        e = "";
        f = 0;
        g = 0;
        h = false;
        i = com.google.android.m4b.maps.cp.a();
        j = null;
        b = j.a;
        k = j.a;
        l = j.a;
        o = null;
        p = "";
        c = 0x2bf20L;
        q = null;
        r = j.a;
        m = null;
        n = -1;
    }
}
