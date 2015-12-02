// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import com.google.common.a.es;
import com.google.common.a.hq;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.common.d.a:
//            a, ad, q, w, 
//            s, r

class p extends a
{

    es a;
    final boolean b;
    final AtomicInteger c;
    List d;

    p(es es1, boolean flag, Executor executor)
    {
        a = es1;
        d = hq.b(es1.size());
        b = flag;
        c = new AtomicInteger(es1.size());
        a(executor);
    }

    private void a(int i, Future future)
    {
        List list;
        boolean flag;
        boolean flag6;
        boolean flag7;
        boolean flag8;
        boolean flag9;
        boolean flag10;
        flag6 = true;
        flag7 = true;
        flag8 = true;
        flag9 = true;
        flag10 = true;
        flag = true;
        list = d;
        if (!isDone() && list != null) goto _L2; else goto _L1
_L1:
        Preconditions.checkState(b, "Future was done before all dependencies completed");
_L3:
        return;
_L2:
        Preconditions.checkState(future.isDone(), "Tried to set value from future which is not done");
        list.set(i, ad.a(future));
        i = c.decrementAndGet();
        if (i < 0)
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Less than 0 remaining futures");
        if (i == 0)
        {
            future = d;
            if (future != null)
            {
                a_(hq.a(future));
                return;
            } else
            {
                Preconditions.checkState(isDone());
                return;
            }
        }
          goto _L3
        future;
        if (b)
        {
            cancel(false);
        }
        i = c.decrementAndGet();
        boolean flag1;
        if (i >= 0)
        {
            flag1 = flag6;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkState(flag1, "Less than 0 remaining futures");
        if (i == 0)
        {
            future = d;
            if (future != null)
            {
                a_(hq.a(future));
                return;
            } else
            {
                Preconditions.checkState(isDone());
                return;
            }
        }
          goto _L3
        future;
        if (b)
        {
            a_(future.getCause());
        }
        i = c.decrementAndGet();
        boolean flag2;
        if (i >= 0)
        {
            flag2 = flag7;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkState(flag2, "Less than 0 remaining futures");
        if (i == 0)
        {
            future = d;
            if (future != null)
            {
                a_(hq.a(future));
                return;
            } else
            {
                Preconditions.checkState(isDone());
                return;
            }
        }
          goto _L3
        future;
        if (b)
        {
            a_(future);
        }
        i = c.decrementAndGet();
        boolean flag3;
        if (i >= 0)
        {
            flag3 = flag8;
        } else
        {
            flag3 = false;
        }
        Preconditions.checkState(flag3, "Less than 0 remaining futures");
        if (i == 0)
        {
            future = d;
            if (future != null)
            {
                a_(hq.a(future));
                return;
            } else
            {
                Preconditions.checkState(isDone());
                return;
            }
        }
          goto _L3
        future;
        a_(future);
        i = c.decrementAndGet();
        boolean flag4;
        if (i >= 0)
        {
            flag4 = flag9;
        } else
        {
            flag4 = false;
        }
        Preconditions.checkState(flag4, "Less than 0 remaining futures");
        if (i != 0) goto _L3; else goto _L4
_L4:
        future = d;
        if (future != null)
        {
            a_(hq.a(future));
            return;
        } else
        {
            Preconditions.checkState(isDone());
            return;
        }
        future;
        i = c.decrementAndGet();
        boolean flag5;
        if (i >= 0)
        {
            flag5 = flag10;
        } else
        {
            flag5 = false;
        }
        Preconditions.checkState(flag5, "Less than 0 remaining futures");
        if (i == 0)
        {
            List list1 = d;
            if (list1 != null)
            {
                a_(hq.a(list1));
            } else
            {
                Preconditions.checkState(isDone());
            }
        }
        throw future;
    }

    static void a(p p1, int i, Future future)
    {
        p1.a(i, future);
    }

    private void a(Executor executor)
    {
        boolean flag = false;
        a(((Runnable) (new q(this))), ((Executor) (w.a())));
        if (a.isEmpty())
        {
            a_(hq.a(d));
        } else
        {
            for (int i = 0; i < a.size(); i++)
            {
                d.add(null);
            }

            es es1 = a;
            int j = ((flag) ? 1 : 0);
            while (j < es1.size()) 
            {
                s s1 = (s)es1.get(j);
                s1.a(new r(this, j, s1), executor);
                j++;
            }
        }
    }

    private void b()
    {
        Object obj = a;
        if (obj == null || isDone()) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj)).iterator();
_L6:
        s s1;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = (s)((Iterator) (obj)).next();
_L4:
        if (s1.isDone())
        {
            continue; /* Loop/switch isn't completed */
        }
        s1.get();
        if (true) goto _L4; else goto _L3
_L3:
        continue; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        Throwable throwable;
        throwable;
        if (!b) goto _L4; else goto _L2
_L2:
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public List a()
    {
        b();
        return (List)super.get();
    }

    public Object get()
    {
        return a();
    }
}
