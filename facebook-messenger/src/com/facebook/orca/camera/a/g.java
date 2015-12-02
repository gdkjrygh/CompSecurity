// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera.a;

import android.net.Uri;
import java.util.Arrays;
import java.util.PriorityQueue;

// Referenced classes of package com.facebook.orca.camera.a:
//            d, i, k, j, 
//            c

public class g
    implements d
{

    private static final Class a = com/facebook/orca/camera/a/g;
    private final d b[];
    private final PriorityQueue c;
    private long d[];
    private int e;
    private int f[];
    private int g;

    public g(d ad[], int l)
    {
        b = (d[])ad.clone();
        int i1;
        if (l == 1)
        {
            ad = new i(null);
        } else
        {
            ad = new j(null);
        }
        c = new PriorityQueue(4, ad);
        d = new long[16];
        e = 0;
        f = new int[b.length];
        g = -1;
        c.clear();
        i1 = b.length;
        for (l = 0; l < i1; l++)
        {
            ad = new k(b[l], l);
            if (ad.a())
            {
                c.add(ad);
            }
        }

    }

    private k c()
    {
        k k1 = (k)c.poll();
        if (k1 == null)
        {
            return null;
        }
        if (k1.a == g)
        {
            int l = e - 1;
            long al[] = d;
            al[l] = al[l] + 1L;
            return k1;
        }
        g = k1.a;
        if (d.length == e)
        {
            long al1[] = new long[e * 2];
            System.arraycopy(d, 0, al1, 0, e);
            d = al1;
        }
        long al2[] = d;
        int i1 = e;
        e = i1 + 1;
        al2[i1] = (long)g << 32 | 1L;
        return k1;
    }

    public c a(int l)
    {
        int i1;
        int j1;
        int i2;
        i1 = 0;
        if (l < 0 || l > b())
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("index ").append(l).append(" out of range max is ").append(b()).toString());
        }
        Arrays.fill(f, 0);
        i2 = e;
        j1 = 0;
_L10:
        int l1 = i1;
        if (j1 >= i2) goto _L2; else goto _L1
_L1:
        int j2;
        long l2 = d[j1];
        l1 = (int)(-1L & l2);
        j2 = (int)(l2 >> 32);
        if (i1 + l1 <= l) goto _L4; else goto _L3
_L3:
        Object obj;
        j1 = f[j2];
        obj = b[j2].a((l - i1) + j1);
_L8:
        return ((c) (obj));
_L4:
        obj = f;
        obj[j2] = obj[j2] + l1;
        j1++;
        i1 += l1;
        continue; /* Loop/switch isn't completed */
_L6:
        k k1;
        if (k1.a())
        {
            c.add(k1);
        }
        l1++;
_L2:
        k1 = c();
        if (k1 == null)
        {
            return null;
        }
        if (l1 != l) goto _L6; else goto _L5
_L5:
        c c1;
        c1 = k1.c;
        obj = c1;
        if (!k1.a()) goto _L8; else goto _L7
_L7:
        c.add(k1);
        return c1;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public c a(Uri uri)
    {
        d ad[] = b;
        int i1 = ad.length;
        for (int l = 0; l < i1; l++)
        {
            c c1 = ad[l].a(uri);
            if (c1 != null)
            {
                return c1;
            }
        }

        return null;
    }

    public void a()
    {
        int l = 0;
        for (int i1 = b.length; l < i1; l++)
        {
            b[l].a();
        }

    }

    public int b()
    {
        int l = 0;
        d ad[] = b;
        int j1 = ad.length;
        int i1 = 0;
        for (; l < j1; l++)
        {
            i1 += ad[l].b();
        }

        return i1;
    }

}
