// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import b.a.a.a.f;
import b.a.a.a.q;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.a.a:
//            h

final class k
    implements Callable
{

    final h a;

    k(h h1)
    {
        a = h1;
        super();
    }

    private Boolean a()
    {
        boolean flag;
        try
        {
            flag = h.a(a).delete();
            f.c().a("Fabric", (new StringBuilder("Initialization marker file removed: ")).append(flag).toString());
        }
        catch (Exception exception)
        {
            f.c().c("Fabric", "Problem encountered deleting Crashlytics initialization marker.", exception);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public final Object call()
    {
        return a();
    }
}
