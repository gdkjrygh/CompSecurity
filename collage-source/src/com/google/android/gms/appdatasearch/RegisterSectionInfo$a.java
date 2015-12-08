// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            RegisterSectionInfo, Feature

public static final class d
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

    public d a(String s)
    {
        b = s;
        return this;
    }

    public b a(boolean flag)
    {
        c = flag;
        return this;
    }

    public RegisterSectionInfo a()
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
        return new RegisterSectionInfo(a, b, c, d, e, f, (Feature[])g.toArray(new Feature[g.size()]), ai, i);
    }

    public (String s)
    {
        a = s;
        d = 1;
    }
}
