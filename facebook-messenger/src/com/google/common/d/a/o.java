// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.d.a:
//            ad, n, s

class o
    implements Runnable
{

    final s a;
    final n b;

    o(n n1, s s)
    {
        b = n1;
        a = s;
        super();
    }

    public void run()
    {
        b.a_(ad.a(a));
        n.a(b, null);
        return;
        Object obj;
        obj;
        b.cancel(false);
        n.a(b, null);
        return;
        obj;
        b.a_(((ExecutionException) (obj)).getCause());
        n.a(b, null);
        return;
        obj;
        n.a(b, null);
        throw obj;
    }
}
