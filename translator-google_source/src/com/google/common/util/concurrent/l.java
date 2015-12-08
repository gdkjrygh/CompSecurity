// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.util.concurrent:
//            v, k, t

final class l
    implements Runnable
{

    final t a;
    final k b;

    l(k k1, t t)
    {
        b = k1;
        a = t;
        super();
    }

    public final void run()
    {
        b.a(v.a(a));
        k.a(b);
        return;
        Object obj;
        obj;
        b.cancel(false);
        k.a(b);
        return;
        obj;
        b.a(((ExecutionException) (obj)).getCause());
        k.a(b);
        return;
        obj;
        k.a(b);
        throw obj;
    }
}
