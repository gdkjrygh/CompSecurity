// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.a.b.l;
import a.a.a.a.a.g.q;
import a.a.a.a.f;
import java.io.File;

// Referenced classes of package com.b.a.c:
//            aa, h, br, bv

final class ag
    implements Runnable
{

    final File a;
    final aa b;

    ag(aa aa1, File file)
    {
        b = aa1;
        a = file;
        super();
    }

    public final void run()
    {
        if (l.m(aa.c(b).v()))
        {
            f.d();
            Object obj = q.a().b();
            obj = aa.c(b).a(((a.a.a.a.a.g.v) (obj)));
            if (obj != null)
            {
                (new br(((ar) (obj)))).a(new bv(a, com.b.a.c.aa.f()));
            }
        }
    }
}
