// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util.a;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.t;
import com.google.common.util.concurrent.v;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.gsa.shared.util.a:
//            f, e

public final class d
{

    public static t a(Iterable iterable)
    {
        Object obj = ImmutableList.copyOf(iterable);
        switch (((ImmutableList) (obj)).size())
        {
        default:
            iterable = new f(((ImmutableList) (obj)));
            AtomicReference atomicreference = new AtomicReference(iterable);
            t t1;
            for (obj = ((ImmutableList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); t1.a(new e(atomicreference, t1), com.google.common.util.concurrent.MoreExecutors.DirectExecutor.INSTANCE))
            {
                t1 = (t)((Iterator) (obj)).next();
            }

            break;

        case 0: // '\0'
            throw new IllegalArgumentException("Expected at least one future, got 0.");

        case 1: // '\001'
            return (t)((ImmutableList) (obj)).get(0);
        }
        return iterable;
    }

    public static Object a(Future future)
    {
        if (!future.isDone())
        {
            break MISSING_BLOCK_LABEL_17;
        }
        future = ((Future) (v.a(future)));
        return future;
        future;
_L2:
        return null;
        future;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
