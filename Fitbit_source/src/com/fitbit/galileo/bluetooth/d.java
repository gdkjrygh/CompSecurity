// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.bluetooth;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.fitbit.galileo.bluetooth:
//            a, h, f, g

public abstract class d
    implements a
{

    private final Set a = new HashSet();
    private final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    private final Lock c;
    private final Lock d;
    private final h e = new h() {

        final d a;

        protected void a(UUID uuid)
        {
        }

        protected void b(UUID uuid)
        {
            d.a(a, uuid);
        }

        protected void c(UUID uuid)
        {
            d.a(a, uuid);
        }

        protected void d(UUID uuid)
        {
            d.a(a, uuid);
        }

            
            {
                a = d.this;
                super();
            }
    };

    d()
    {
        c = b.readLock();
        d = b.writeLock();
    }

    static void a(d d1, UUID uuid)
    {
        d1.a(uuid);
    }

    private void a(UUID uuid)
    {
        if (!b(uuid))
        {
            break MISSING_BLOCK_LABEL_31;
        }
        d.lock();
        c(uuid);
        d.unlock();
        return;
        uuid;
        d.unlock();
        throw uuid;
    }

    private boolean b(UUID uuid)
    {
        if (uuid == null)
        {
            return false;
        }
        c.lock();
        boolean flag = a.contains(uuid);
        c.unlock();
        return flag;
        uuid;
        c.unlock();
        throw uuid;
    }

    private void c(UUID uuid)
    {
        a.remove(uuid);
        if (a.size() == 0)
        {
            e.d();
        }
    }

    private boolean d(f f1)
    {
        while (f1 == null || a.contains(f1.i())) 
        {
            return false;
        }
        if (a.size() == 0)
        {
            e.a();
        }
        a.add(f1.i());
        return true;
    }

    public boolean a(f f1)
    {
        if (f1 == null)
        {
            return false;
        }
        d.lock();
        if (!d(f1))
        {
            break MISSING_BLOCK_LABEL_41;
        }
        g.a().a(f1);
        d.unlock();
        return true;
        d.unlock();
        return false;
        f1;
        d.unlock();
        throw f1;
    }

    public void b(f f1)
    {
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        c.lock();
        if (a.contains(f1.i()))
        {
            g.a().b(f1);
        }
        c.unlock();
        return;
        f1;
        c.unlock();
        throw f1;
    }

    public void c(f f1)
    {
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        c.lock();
        if (a.contains(f1.i()))
        {
            g.a().c(f1);
        }
        c.unlock();
        return;
        f1;
        c.unlock();
        throw f1;
    }
}
