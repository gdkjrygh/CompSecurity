// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import b.a.a.a.d;
import b.a.a.a.o;
import java.util.concurrent.Callable;

// Referenced classes of package com.a.a.c:
//            r

final class t
    implements Callable
{

    final Callable a;
    final r b;

    t(r r, Callable callable)
    {
        b = r;
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
            d.c().b("Fabric", "Failed to execute task.", exception);
            return null;
        }
        return obj;
    }
}
