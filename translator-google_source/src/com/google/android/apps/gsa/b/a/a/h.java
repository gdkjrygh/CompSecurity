// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.b.a.a;

import com.google.android.apps.gsa.shared.io.a;
import com.google.android.apps.gsa.shared.io.b;
import com.google.android.apps.gsa.shared.io.c;
import com.google.android.apps.gsa.shared.io.d;
import com.google.android.apps.gsa.shared.io.g;
import com.google.android.apps.gsa.shared.io.k;
import com.google.android.apps.gsa.shared.io.l;
import com.google.android.apps.gsa.shared.io.m;
import com.google.common.base.p;
import com.google.common.base.s;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.gsa.b.a.a:
//            q, i, d, k, 
//            l

public abstract class h
    implements com.google.android.apps.gsa.shared.io.h
{

    public final Executor a;
    public final k b;
    public final s c;
    public final b d;

    protected h(Executor executor, k k1, s s1, b b1)
    {
        a = (Executor)p.a(executor);
        b = (k)p.a(k1);
        c = (s)p.a(s1);
        d = (b)p.a(b1);
    }

    private com.google.android.apps.gsa.b.a.a.d a(l l1, d d1)
    {
        boolean flag = ((Boolean)c.get()).booleanValue();
        Object obj = l1;
        if (!flag)
        {
            obj = l1;
            if (l1.r)
            {
                obj = new m(l1);
                ((m) (obj)).b("Cache-Control", "only-if-cached");
                int i1 = l1.n;
                if (i1 > 0)
                {
                    ((m) (obj)).a("Cache-Control", (new StringBuilder(21)).append("max-stale=").append(i1).toString());
                }
                obj = ((m) (obj)).a();
                p.b(((l) (obj)).r);
            }
        }
        com.google.android.apps.gsa.shared.io.j j = b.a(((l) (obj)));
        if (!flag && !((l) (obj)).r)
        {
            l1 = j.a(0x40010, null);
            com.google.common.util.concurrent.t t = e.a(l1);
            q q1 = new q();
            q1.a(new a(l1));
            l1 = new i(this, t, q1);
        } else
        {
            l1 = a(((l) (obj)), d1, ((c) (j)));
        }
        return new com.google.android.apps.gsa.b.a.a.d(((l) (obj)), d1, l1, j);
    }

    private g b(l l1, d d1)
    {
        d1 = a(l1, d1);
        l1 = new com.google.android.apps.gsa.b.a.a.k(l1, d1);
        return (g)p.a(l1);
        l1;
        d1.a();
        throw l1;
    }

    protected abstract com.google.android.apps.gsa.b.a.a.l a(l l1, d d1, c c1);

    public final g a(l l1)
    {
        com.google.android.apps.gsa.b.a.a.d d1;
        q q1;
        p.a(l1);
        q1 = new q();
        d1 = a(l1, ((d) (q1)));
        l1 = new com.google.android.apps.gsa.b.a.a.k(l1, d1, d, q1);
        return (g)p.a(l1);
        l1;
        d1.a();
        throw l1;
    }

    public final g b(l l1)
    {
        p.a(l1);
        return b(l1, com.google.android.apps.gsa.shared.io.e.a);
    }
}
