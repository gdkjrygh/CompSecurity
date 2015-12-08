// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            z, em, ap, bd, 
//            aq, at, ab

public final class do
{

    public final z a;
    public final em b;
    public final List c;
    public final int d;
    public final List e;
    public final List f;
    public final int g;
    public final long h;
    public final String i;
    public final boolean j;
    public final ap k;
    public final bd l;
    public final String m;
    public final aq n;
    public final at o;
    public final long p;
    public final ab q;
    public final long r;
    public final long s;
    public final long t;

    public do(z z, em em, List list, int i1, List list1, List list2, int j1, 
            long l1, String s1, boolean flag, ap ap, bd bd, String s2, 
            aq aq, at at, long l2, ab ab, long l3, 
            long l4, long l5)
    {
        a = z;
        b = em;
        if (list != null)
        {
            z = Collections.unmodifiableList(list);
        } else
        {
            z = null;
        }
        c = z;
        d = i1;
        if (list1 != null)
        {
            z = Collections.unmodifiableList(list1);
        } else
        {
            z = null;
        }
        e = z;
        if (list2 != null)
        {
            z = Collections.unmodifiableList(list2);
        } else
        {
            z = null;
        }
        f = z;
        g = j1;
        h = l1;
        i = s1;
        j = flag;
        k = ap;
        l = bd;
        m = s2;
        n = aq;
        o = at;
        p = l2;
        q = ab;
        r = l3;
        s = l4;
        t = l5;
    }
}
