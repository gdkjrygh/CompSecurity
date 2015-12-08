// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Optional;
import com.google.common.base.p;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.af;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractFuture, v, p, n, 
//            t, o

class m extends AbstractFuture
{

    private static final Logger i = Logger.getLogger(com/google/common/util/concurrent/m.getName());
    ImmutableCollection a;
    final boolean c = true;
    final AtomicInteger d;
    com.google.common.util.concurrent.p e;
    List f;
    final Object g = new Object();
    Set h;

    m(ImmutableCollection immutablecollection, Executor executor, com.google.common.util.concurrent.p p1)
    {
        a = immutablecollection;
        d = new AtomicInteger(immutablecollection.size());
        e = p1;
        int j = immutablecollection.size();
        af.a(j, "initialArraySize");
        f = new ArrayList(j);
        a(executor);
    }

    static void a(m m1, int j, Future future)
    {
        List list;
        boolean flag;
        boolean flag6;
        boolean flag7;
        boolean flag8;
        boolean flag9;
        flag6 = true;
        flag7 = true;
        flag8 = true;
        flag9 = true;
        boolean flag5 = true;
        list = m1.f;
        if (m1.isDone() || list == null)
        {
            if (m1.c || m1.isCancelled())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.b(flag, "Future was done before all dependencies completed");
        }
        p.b(future.isDone(), "Tried to set value from future which is not done");
        future = ((Future) (v.a(future)));
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        list.set(j, Optional.fromNullable(future));
        j = m1.d.decrementAndGet();
        if (j >= 0)
        {
            flag = flag5;
        } else
        {
            flag = false;
        }
        p.b(flag, "Less than 0 remaining futures");
        if (j != 0) goto _L2; else goto _L1
_L1:
        future = m1.e;
        if (future == null || list == null) goto _L4; else goto _L3
_L3:
        m1.a(future.a(list));
_L2:
        return;
_L4:
        p.b(m1.isDone());
        return;
        future;
        if (m1.c)
        {
            m1.cancel(false);
        }
        j = m1.d.decrementAndGet();
        boolean flag1;
        if (j >= 0)
        {
            flag1 = flag6;
        } else
        {
            flag1 = false;
        }
        p.b(flag1, "Less than 0 remaining futures");
        if (j != 0) goto _L2; else goto _L5
_L5:
        future = m1.e;
        if (future != null && list != null)
        {
            m1.a(future.a(list));
            return;
        } else
        {
            p.b(m1.isDone());
            return;
        }
        future;
        m1.b(future.getCause());
        j = m1.d.decrementAndGet();
        boolean flag2;
        if (j >= 0)
        {
            flag2 = flag7;
        } else
        {
            flag2 = false;
        }
        p.b(flag2, "Less than 0 remaining futures");
        if (j != 0) goto _L2; else goto _L6
_L6:
        future = m1.e;
        if (future != null && list != null)
        {
            m1.a(future.a(list));
            return;
        } else
        {
            p.b(m1.isDone());
            return;
        }
        future;
        m1.b(future);
        j = m1.d.decrementAndGet();
        boolean flag3;
        if (j >= 0)
        {
            flag3 = flag8;
        } else
        {
            flag3 = false;
        }
        p.b(flag3, "Less than 0 remaining futures");
        if (j != 0) goto _L2; else goto _L7
_L7:
        future = m1.e;
        if (future != null && list != null)
        {
            m1.a(future.a(list));
            return;
        } else
        {
            p.b(m1.isDone());
            return;
        }
        future;
        j = m1.d.decrementAndGet();
        boolean flag4;
        if (j >= 0)
        {
            flag4 = flag9;
        } else
        {
            flag4 = false;
        }
        p.b(flag4, "Less than 0 remaining futures");
        if (j == 0)
        {
            com.google.common.util.concurrent.p p1 = m1.e;
            if (p1 != null && list != null)
            {
                m1.a(p1.a(list));
            } else
            {
                p.b(m1.isDone());
            }
        }
        throw future;
    }

    private void a(Executor executor)
    {
        boolean flag = false;
        a(((Runnable) (new n(this))), ((Executor) (MoreExecutors.DirectExecutor.INSTANCE)));
        if (a.isEmpty())
        {
            a(e.a(ImmutableList.of()));
        } else
        {
            for (int j = 0; j < a.size(); j++)
            {
                f.add(null);
            }

            Iterator iterator = a.iterator();
            int k = ((flag) ? 1 : 0);
            while (iterator.hasNext()) 
            {
                t t1 = (t)iterator.next();
                t1.a(new o(this, k, t1), executor);
                k++;
            }
        }
    }

    private void b(Throwable throwable)
    {
        boolean flag1 = false;
        boolean flag = true;
        if (c)
        {
            flag1 = super.a(throwable);
            synchronized (g)
            {
                if (h == null)
                {
                    h = new HashSet();
                }
                flag = h.add(throwable);
            }
        }
        if ((throwable instanceof Error) || c && !flag1 && flag)
        {
            i.log(Level.SEVERE, "input future failed.", throwable);
        }
        return;
        throwable;
        obj;
        JVM INSTR monitorexit ;
        throw throwable;
    }

}
