// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.i.a;

import com.facebook.auth.c.a;
import com.facebook.auth.c.b;
import com.facebook.auth.c.c;
import com.facebook.auth.c.d;

// Referenced classes of package com.facebook.i.a:
//            d, b

class h extends c
{

    final com.facebook.i.a.d a;

    h(com.facebook.i.a.d d1)
    {
        a = d1;
        super();
    }

    public Class a()
    {
        return com/facebook/auth/c/d;
    }

    public volatile void a(a a1)
    {
        a((d)a1);
    }

    public void a(d d1)
    {
        d.j(a).b(d.i(a));
        d1 = d.g(a);
        com.facebook.debug.log.b.b(com/facebook/i/a/d, "User %s logged in, start to connect to other peers.", new Object[] {
            d1
        });
        if (d1 == null)
        {
            d.k(a).a(com/facebook/i/a/b.getSimpleName(), "userId is still null after AuthLoggedInEvent fired");
        }
    }

    public volatile void a(com.facebook.c.a.a a1)
    {
        a((d)a1);
    }
}
