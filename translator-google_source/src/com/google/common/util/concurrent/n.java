// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableCollection;
import java.util.Iterator;

// Referenced classes of package com.google.common.util.concurrent:
//            m, t, AbstractFuture

final class n
    implements Runnable
{

    final m a;

    n(m m1)
    {
        a = m1;
        super();
    }

    public final void run()
    {
        if (a.isCancelled())
        {
            for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((t)iterator.next()).cancel(((AbstractFuture) (a)).b.wasInterrupted())) { }
        }
        a.a = null;
        a.f = null;
        a.e = null;
    }
}
