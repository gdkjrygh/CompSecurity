// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.a.b;
import com.android.slyce.a.a.c;
import com.android.slyce.a.a.f;
import com.android.slyce.a.ag;
import com.android.slyce.a.c.b.a;
import com.android.slyce.a.r;

// Referenced classes of package com.android.slyce.a.c:
//            u, i, a, r

class e
    implements c
{

    boolean a;
    final u b;
    final i c;
    final a d;
    final com.android.slyce.a.c.r e;
    final int f;
    final com.android.slyce.a.c.a g;

    e(com.android.slyce.a.c.a a1, u u1, i j, a a2, com.android.slyce.a.c.r r1, int k)
    {
        g = a1;
        b = u1;
        c = j;
        d = a2;
        e = r1;
        f = k;
        super();
    }

    public void a(Exception exception, ag ag1)
    {
        if (a && ag1 != null)
        {
            ag1.a(new f());
            ag1.b(new b());
            ag1.d();
            throw new AssertionError("double connect callback");
        }
        a = true;
        b.b("socket connected");
        if (c.isCancelled())
        {
            if (ag1 != null)
            {
                ag1.d();
            }
            return;
        }
        if (c.c != null)
        {
            g.e.a(c.b);
        }
        if (exception != null)
        {
            com.android.slyce.a.c.a.a(g, c, exception, null, b, d);
            return;
        } else
        {
            e.e = ag1;
            c.a = ag1;
            com.android.slyce.a.c.a.a(g, b, f, c, d, e);
            return;
        }
    }
}
