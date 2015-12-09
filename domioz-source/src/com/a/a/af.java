// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import b.a.a.a.a.b.l;
import b.a.a.a.f;
import b.a.a.a.q;
import java.io.File;

// Referenced classes of package com.a.a:
//            z, h, bk, bo

final class af
    implements Runnable
{

    final File a;
    final z b;

    af(z z1, File file)
    {
        b = z1;
        a = file;
        super();
    }

    public final void run()
    {
        if (l.m(z.c(b).w()))
        {
            f.c().a("Fabric", "Attempting to send crash report at time of crash...");
            Object obj = b.a.a.a.a.g.q.a().b();
            obj = z.c(b).a(((b.a.a.a.a.g.v) (obj)));
            if (obj != null)
            {
                (new bk(((aq) (obj)))).a(new bo(a, z.g()));
            }
        }
    }
}
