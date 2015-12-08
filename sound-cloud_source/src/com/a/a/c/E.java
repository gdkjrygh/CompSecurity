// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import b.a.a.a.a.b.j;
import b.a.a.a.a.g.q;
import b.a.a.a.d;
import b.a.a.a.l;
import java.io.File;

// Referenced classes of package com.a.a.c:
//            x, g, aa, ad

final class E
    implements Runnable
{

    final File a;
    final x b;

    E(x x1, File file)
    {
        b = x1;
        a = file;
        super();
    }

    public final void run()
    {
        if (j.n(((l) (x.f(b))).n))
        {
            d.a();
            Object obj = b.a.a.a.a.g.q.a.a().a();
            obj = x.f(b).a(((b.a.a.a.a.g.t) (obj)));
            if (obj != null)
            {
                (new aa(((O) (obj)))).a(new ad(a, x.b()));
            }
        }
    }
}
