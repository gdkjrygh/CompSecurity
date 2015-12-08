// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.f;
import a.a.a.a.s;
import java.util.concurrent.Callable;

// Referenced classes of package com.b.a.c:
//            u

final class w
    implements Callable
{

    final Callable a;
    final u b;

    w(u u, Callable callable)
    {
        b = u;
        a = callable;
        super();
    }

    public final Object call()
    {
        Object obj;
        try
        {
            obj = a.call();
        }
        catch (Exception exception)
        {
            f.d().b("CrashlyticsCore", "Failed to execute task.", exception);
            return null;
        }
        return obj;
    }
}
