// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aj;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.m4b.maps.aj:
//            e, l, f

final class a
    implements Runnable
{

    private f a;
    private b b;

    public final void run()
    {
        b.b(l.a(a));
        a(b);
        return;
        Object obj;
        obj;
        b.ncel(false);
        ncel(b);
        return;
        obj;
        b.b(((ExecutionException) (obj)).getCause());
        on.getCause(b);
        return;
        obj;
        b(b);
        throw obj;
    }

    on(on on, f f)
    {
        b = on;
        a = f;
        super();
    }
}
