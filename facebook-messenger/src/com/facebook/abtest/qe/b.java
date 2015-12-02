// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe;

import com.facebook.common.time.a;
import com.facebook.prefs.shared.d;
import com.google.common.a.fi;
import com.google.common.a.fk;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Set;

public class b
{

    private static long a = 0x6c258c00L;
    private final a b;
    private final com.facebook.common.l.a c;
    private final long d;
    private final Set e;
    private final d f;

    b(a a1, com.facebook.common.l.a a2, long l, d d1, Set set)
    {
        b = (a)Preconditions.checkNotNull(a1);
        c = (com.facebook.common.l.a)Preconditions.checkNotNull(a2);
        d = ((Long)Preconditions.checkNotNull(Long.valueOf(l))).longValue();
        f = (d)Preconditions.checkNotNull(d1);
        a1 = fi.e();
        for (a2 = set.iterator(); a2.hasNext();)
        {
            d1 = ((com.facebook.abtest.qe.f.b)a2.next()).a().iterator();
            while (d1.hasNext()) 
            {
                set = (com.facebook.abtest.qe.f.a)d1.next();
                if (!((com.facebook.abtest.qe.f.a) (set)).b)
                {
                    a1.b(((com.facebook.abtest.qe.f.a) (set)).a);
                }
            }
        }

        e = a1.b();
    }

    public b(a a1, com.facebook.common.l.a a2, d d1, Set set)
    {
        this(a1, a2, a, d1, set);
    }

    public boolean a(String s)
    {
        while (e.contains(s) || f.a(com.facebook.abtest.qe.data.a.e, 0L) + (b.a() - c.c) <= d) 
        {
            return false;
        }
        return true;
    }

}
