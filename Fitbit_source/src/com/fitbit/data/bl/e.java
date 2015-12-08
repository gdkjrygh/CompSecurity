// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.a.a;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            dx, bs, ez

public abstract class e
    implements a
{

    private static Map e = new HashMap();
    private bs a;
    private boolean b;
    protected boolean c;
    private boolean d;

    public e(bs bs1, boolean flag)
    {
        b = true;
        a = bs1;
        c = flag;
    }

    public e(bs bs1, boolean flag, boolean flag1)
    {
        this(bs1, flag);
        b(flag1);
    }

    private static Object a(e e1)
    {
        synchronized (e)
        {
            if (!e.containsKey(e1.c()))
            {
                e.put(e1.c(), new Object());
            }
            e1 = ((e) (e.get(e1.c())));
        }
        return e1;
        e1;
        map;
        JVM INSTR monitorexit ;
        throw e1;
    }

    protected java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock a()
    {
        return dx.b.readLock();
    }

    protected abstract void a(h.a a1)
        throws ServerCommunicationException, JSONException, CancellationException;

    public void a(boolean flag)
    {
        d = flag;
    }

    protected boolean a(h.a a1, boolean flag)
        throws ServerCommunicationException, JSONException
    {
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag1 = false;
        flag2 = false;
        flag3 = true;
        Object obj = a(this);
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = c();
        if (a1.a()) goto _L2; else goto _L1
_L1:
        if (flag) goto _L4; else goto _L3
_L3:
        flag = g();
        if (flag) goto _L2; else goto _L4
_L4:
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readlock = a();
        if (readlock == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        readlock.lock();
        com.fitbit.e.a.a("SyncManager", "Started sync operation: %s", new Object[] {
            obj1
        });
        a(a1);
        com.fitbit.e.a.a("SyncManager", "Completed sync operation: %s", new Object[] {
            obj1
        });
        h();
        a1 = a();
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        a1.unlock();
        h();
        flag = flag3;
_L5:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        a1;
        com.fitbit.e.a.a("SyncManager", "Caught CancellationException in %s", new Object[] {
            obj1
        });
        a1 = a();
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        a1.unlock();
        if (b)
        {
            h();
        }
        flag = false;
          goto _L5
        a1;
        if (!d)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        com.fitbit.e.a.a("SyncManager", "Caught exception but ignore it %s\n%s", new Object[] {
            obj1, a1
        });
        a1 = a();
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        a1.unlock();
        if (b)
        {
            h();
        }
        flag = false;
          goto _L5
        throw a1;
        a1;
        flag1 = true;
_L6:
        obj1 = a();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        ((java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock) (obj1)).unlock();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        if (!b)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        h();
        throw a1;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
        a1;
        if (!d)
        {
            break MISSING_BLOCK_LABEL_333;
        }
        com.fitbit.e.a.a("SyncManager", "Caught exception but ignore it %s\n%s", new Object[] {
            obj1, a1
        });
        a1 = a();
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        a1.unlock();
        if (b)
        {
            h();
        }
        flag = false;
          goto _L5
        throw a1;
        a1;
        throw a1;
        a1;
        throw a1;
_L2:
        if (!a1.a())
        {
            break MISSING_BLOCK_LABEL_372;
        }
        com.fitbit.e.a.a("SyncManager", "Operation %s was cancelled before it has started.", new Object[] {
            obj1
        });
        flag = flag2;
          goto _L5
        com.fitbit.e.a.a("SyncManager", "Last %s was too recent.. skipping sync request.", new Object[] {
            obj1
        });
        flag = flag2;
          goto _L5
        a1;
          goto _L6
    }

    public void b(boolean flag)
    {
        b = flag;
    }

    public boolean b(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        return a(a1, c);
    }

    public bs e()
    {
        return a;
    }

    public boolean f()
    {
        return c;
    }

    protected boolean g()
    {
        return !e().c().f(c());
    }

    protected void h()
    {
        e().c().b(c());
    }

    protected java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock i()
    {
        return dx.b.writeLock();
    }

}
