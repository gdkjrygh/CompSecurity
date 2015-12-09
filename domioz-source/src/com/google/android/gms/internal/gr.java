// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zziz, zzit

public final class gr
{

    private final String a;
    private String b;
    private boolean c;
    private int d;
    private boolean e;
    private String f;
    private final List g = new ArrayList();
    private BitSet h;
    private String i;

    public gr(String s)
    {
        a = s;
        d = 1;
    }

    public final gr a()
    {
        c = true;
        return this;
    }

    public final gr a(int j)
    {
        if (h == null)
        {
            h = new BitSet();
        }
        h.set(j);
        return this;
    }

    public final gr a(String s)
    {
        b = s;
        return this;
    }

    public final gr b()
    {
        e = true;
        return this;
    }

    public final gr b(String s)
    {
        i = s;
        return this;
    }

    public final zziz c()
    {
        int j = 0;
        int ai[] = null;
        if (h != null)
        {
            int ai1[] = new int[h.cardinality()];
            int k = h.nextSetBit(0);
            do
            {
                ai = ai1;
                if (k < 0)
                {
                    break;
                }
                ai1[j] = k;
                k = h.nextSetBit(k + 1);
                j++;
            } while (true);
        }
        return new zziz(a, b, c, d, e, f, (zzit[])g.toArray(new zzit[g.size()]), ai, i);
    }
}
