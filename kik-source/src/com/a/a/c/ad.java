// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import b.a.a.a.a.b.j;
import b.a.a.a.a.g.q;
import b.a.a.a.d;
import java.io.File;

// Referenced classes of package com.a.a.c:
//            x, g, aw, az

final class ad
    implements Runnable
{

    final File a;
    final x b;

    ad(x x1, File file)
    {
        b = x1;
        a = file;
        super();
    }

    public final void run()
    {
        if (j.n(com.a.a.c.x.d(b).v()))
        {
            d.c();
            Object obj = q.a().b();
            obj = com.a.a.c.x.d(b).a(((b.a.a.a.a.g.t) (obj)));
            if (obj != null)
            {
                (new aw(((an) (obj)))).a(new az(a, x.g()));
            }
        }
    }
}
