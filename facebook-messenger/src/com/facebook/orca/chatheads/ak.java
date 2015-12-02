// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.common.executors.a;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.messages.threads.model.b;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.hq;
import com.google.common.a.ik;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.orca.chatheads:
//            ag

public class ak
{

    private final a a;
    private final List b = hq.a();
    private final ConcurrentMap c = ik.c();

    ak(a a1)
    {
        a = a1;
    }

    ag a(int i)
    {
        b b1 = (b)b.get(i);
        return (ag)c.get(b1);
    }

    ag a(b b1)
    {
        a.a();
        ag ag1 = (ag)c.get(b1);
        if (ag1 != null)
        {
            Preconditions.checkState(Objects.equal(ag1.getThreadViewSpec().h(), b1));
        }
        return ag1;
    }

    void a()
    {
        a.a();
        b.clear();
        c.clear();
    }

    void a(ThreadViewSpec threadviewspec)
    {
        a.a();
        b.remove(threadviewspec.h());
        c.remove(threadviewspec.h());
        boolean flag;
        if (b.size() == c.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
    }

    void a(ThreadViewSpec threadviewspec, ag ag1)
    {
        boolean flag1 = true;
        a.a();
        boolean flag;
        if (ag1.getPendingThreadViewSpec() == threadviewspec)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        c.put(threadviewspec.h(), ag1);
        b.add(0, threadviewspec.h());
        if (b.size() == c.size())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
    }

    void a(b b1, ThreadViewSpec threadviewspec)
    {
        boolean flag1 = true;
        a.a();
        Preconditions.checkNotNull(b1.b());
        Preconditions.checkNotNull(threadviewspec.h().a());
        ag ag1 = (ag)c.remove(b1);
        int i;
        boolean flag;
        if (ag1.getPendingThreadViewSpec() == threadviewspec)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        threadviewspec = threadviewspec.h();
        c.put(threadviewspec, ag1);
        i = b.indexOf(b1);
        b.set(i, threadviewspec);
        if (b.size() == c.size())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
    }

    boolean a(ThreadViewSpec threadviewspec, int i)
    {
        int j;
        boolean flag;
        if (i >= 0 && i < b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        a.a();
        j = b.indexOf(threadviewspec.h());
        if (j != i)
        {
            b.remove(j);
            b.add(i, threadviewspec.h());
            return true;
        } else
        {
            return false;
        }
    }

    int b()
    {
        return c.size();
    }

    boolean b(ThreadViewSpec threadviewspec)
    {
        return a(threadviewspec, 0);
    }

    boolean c()
    {
        return c.isEmpty();
    }

    boolean c(ThreadViewSpec threadviewspec)
    {
        return c.containsKey(threadviewspec.h());
    }

    ag d(ThreadViewSpec threadviewspec)
    {
        return a(threadviewspec.h());
    }

    es d()
    {
        return es.a(c.values());
    }

    int e(ThreadViewSpec threadviewspec)
    {
        a.a();
        return b.indexOf(threadviewspec.h());
    }

    es e()
    {
        et et1 = es.e();
        b b1;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); et1.b(c.get(b1)))
        {
            b1 = (b)iterator.next();
        }

        return et1.b();
    }
}
