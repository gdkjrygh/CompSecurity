// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import b.a.a.a.f;
import b.a.a.a.q;
import java.util.concurrent.Callable;

// Referenced classes of package com.a.a:
//            t

final class v
    implements Callable
{

    final Callable a;
    final t b;

    v(t t, Callable callable)
    {
        b = t;
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
            f.c().c("Fabric", "Failed to execute task.", exception);
            return null;
        }
        return obj;
    }
}
