// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.C;
import com.facebook.GraphRequest;

// Referenced classes of package com.facebook.share.internal:
//            c, p

final class o
    implements c.k
{

    final c a;

    o(c c1)
    {
        a = c1;
        super();
    }

    public final void a()
    {
        c.f f = new c.f(a, c.i(a), c.j(a));
        c.d d = new c.d(a, c.i(a), c.j(a));
        C c1 = new C();
        f.a(c1);
        d.a(c1);
        c1.a(new p(this, f, d));
        GraphRequest.b(c1);
    }
}
