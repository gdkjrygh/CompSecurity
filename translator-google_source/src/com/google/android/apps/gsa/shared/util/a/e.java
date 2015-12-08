// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util.a;

import com.google.common.util.concurrent.t;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.gsa.shared.util.a:
//            f

final class e
    implements Runnable
{

    final AtomicReference a;
    final t b;

    e(AtomicReference atomicreference, t t1)
    {
        a = atomicreference;
        b = t1;
        super();
    }

    public final void run()
    {
        f f1;
        f1 = (f)a.get();
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        f1.a(b.get());
        a.set(null);
        f1.a = null;
        return;
        Object obj;
        obj;
        f1.a(((ExecutionException) (obj)).getCause());
        a.set(null);
        f1.a = null;
        return;
        obj;
        f1.cancel(false);
        a.set(null);
        f1.a = null;
        return;
        obj;
        f1.a(((Throwable) (obj)));
        a.set(null);
        f1.a = null;
        return;
        obj;
        a.set(null);
        f1.a = null;
        throw obj;
    }
}
