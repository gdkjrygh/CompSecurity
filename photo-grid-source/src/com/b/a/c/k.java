// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.f;
import a.a.a.a.s;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.b.a.c:
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
            f.d();
        }
        catch (Exception exception)
        {
            f.d().b("CrashlyticsCore", "Problem encountered deleting Crashlytics initialization marker.", exception);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public final Object call()
    {
        return a();
    }
}
