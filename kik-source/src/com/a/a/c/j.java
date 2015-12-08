// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import b.a.a.a.d;
import b.a.a.a.o;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.a.a.c:
//            g

final class j
    implements Callable
{

    final g a;

    j(g g1)
    {
        a = g1;
        super();
    }

    private Boolean a()
    {
        boolean flag;
        try
        {
            flag = g.a(a).delete();
            d.c();
        }
        catch (Exception exception)
        {
            d.c().b("Fabric", "Problem encountered deleting Crashlytics initialization marker.", exception);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public final Object call()
    {
        return a();
    }
}
