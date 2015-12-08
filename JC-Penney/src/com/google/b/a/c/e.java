// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.a.c;

import java.util.Comparator;

// Referenced classes of package com.google.b.a.c:
//            g, d

class e
    implements Comparator
{

    final d a;

    e(d d)
    {
        a = d;
        super();
    }

    public int a(g g1, g g2)
    {
        return g1.c() - g2.c();
    }

    public int compare(Object obj, Object obj1)
    {
        return a((g)obj, (g)obj1);
    }
}
