// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.ak.a;
import com.google.android.m4b.maps.bo.bm;
import com.google.android.m4b.maps.bo.k;
import com.google.android.m4b.maps.bo.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            j

public static final class a
{

    final k a;
    final ArrayList b;
    final ArrayList c;
    final HashSet d;
    a e;
    private final String f[];

    public final float a()
    {
        Iterator iterator = b.iterator();
        float f1 = 0.0F;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (b)iterator.next();
            float f2 = Math.abs(a1.a);
            f2 = a1.b / 2.0F + f2;
            if (f2 > f1)
            {
                f1 = f2;
            }
        } while (true);
        iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a2 = (c)iterator.next();
            float f3 = Math.abs(a2.a);
            f3 = a2.b / 2.0F + f3;
            if (f3 > f1)
            {
                f1 = f3;
            }
        } while (true);
        return f1 * 2.0F;
    }

    public final void a(bm bm1)
    {
        float f1;
        t t1;
        int ai[] = bm1.g;
        int k = ai.length;
        for (int i = 0; i < k; i++)
        {
            int l = ai[i];
            if (l >= 0 && l < f.length)
            {
                d.add(f[l]);
            }
        }

        t1 = bm1.d;
        f1 = bm1.e;
        if (t1.b() != 1) goto _L2; else goto _L1
_L1:
        c.add(new <init>(f1, t1, 0));
_L4:
        if (bm1.f)
        {
            e = bm1.a;
        }
        return;
_L2:
        if (t1.b() > 1)
        {
            b.add(new <init>(f1, t1, 0));
            c.add(new <init>(f1, t1, 1));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final int b()
    {
        int l;
        int l2;
        l = 1;
        l2 = b.size() + c.size();
        if (l2 != 0) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        int ai[] = new int[l2];
        l = 0;
        while (l < l2) 
        {
            <init> <init>1;
            int i;
            if (l < b.size())
            {
                <init>1 = (b)b.get(l);
            } else
            {
                <init>1 = (b)c.get(l - b.size());
            }
            if (<init>1.d == null)
            {
                i = 1;
            } else
            {
                int ai1[] = <init>1.d;
                int k1 = ai1.length;
                int i1 = 0;
                int i2;
                for (i = 0; i1 < k1; i = i2 + i)
                {
                    i2 = ai1[i1];
                    i1++;
                }

                if (<init>1.d.length % 2 == 1)
                {
                    i *= 2;
                }
            }
            ai[l] = i;
            l++;
        }
        int k = ai[0];
        int l1 = 1;
        do
        {
            l = k;
            if (l1 >= l2)
            {
                continue;
            }
            int j1;
            int j2;
label0:
            {
                j2 = ai[l1];
                if (k > 0)
                {
                    l = j2;
                    j1 = k;
                    if (j2 > 0)
                    {
                        break label0;
                    }
                }
                throw new IllegalArgumentException("Greatest common divisor should be computed on numbers greater than zero.");
            }
            int k2;
            do
            {
                k2 = j1;
                if (l == 0)
                {
                    break;
                }
                j1 = l;
                l = k2 % l;
            } while (true);
            k = (k * j2) / k2;
            l1++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    private ()
    {
        b = new ArrayList(2);
        c = new ArrayList(2);
        d = new HashSet();
        a = null;
        f = null;
    }

    public f(bm bm1, String as[])
    {
        b = new ArrayList(2);
        c = new ArrayList(2);
        d = new HashSet();
        a = bm1.b;
        f = as;
        a(bm1);
    }
}
