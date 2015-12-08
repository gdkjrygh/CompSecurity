// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.data.domain.Entity;
import com.fitbit.data.repo.mem.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.repo:
//            ao, ap

public abstract class a
    implements ao
{

    private List listeners;

    public a()
    {
        listeners = new ArrayList();
    }

    public void add(Entity entity)
    {
        prepareEntity(entity);
        doAdd(entity);
        informListeners();
    }

    public void addAll(List list)
    {
        for (list = list.iterator(); list.hasNext(); add((Entity)list.next())) { }
    }

    public void addListener(ap ap1)
    {
        List list = listeners;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = listeners.iterator();
_L2:
        ap ap2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_60;
            }
            ap2 = (ap)((WeakReference)iterator.next()).get();
        } while (ap2 == null);
        if (!ap2.equals(ap1)) goto _L2; else goto _L1
_L1:
        list;
        JVM INSTR monitorexit ;
        return;
        listeners.add(new WeakReference(ap1));
        list;
        JVM INSTR monitorexit ;
        return;
        ap1;
        list;
        JVM INSTR monitorexit ;
        throw ap1;
    }

    public void deleteAll(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); delete((Entity)iterable.next())) { }
    }

    protected abstract void doAdd(Entity entity);

    public Entity getById(long l)
    {
        throw new UnsupportedOperationException();
    }

    public List getPendingEntries()
    {
        return d.a(getAll(), new com.fitbit.data.repo.mem.d.a() {

            final a a;

            public boolean a(Entity entity)
            {
                return entity.getEntityStatus() == com.fitbit.data.domain.Entity.EntityStatus.PENDING_OPERATION || entity.getEntityStatus() == com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE;
            }

            public volatile boolean a(Object obj)
            {
                return a((Entity)obj);
            }

            
            {
                a = a.this;
                super();
            }
        });
    }

    public void informListeners()
    {
        List list = listeners;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = listeners.iterator();
_L1:
        ap ap1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_73;
        }
        ap1 = (ap)((WeakReference)iterator.next()).get();
        if (ap1 != null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        iterator.remove();
          goto _L1
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        ap1.b(getName());
          goto _L1
        list;
        JVM INSTR monitorexit ;
    }

    protected void prepareEntity(Entity entity)
    {
        if (entity.getUuid() == null)
        {
            entity.setUuid(UUID.randomUUID());
        }
        Date date = new Date();
        if (entity.getTimeCreated() == null)
        {
            entity.setTimeCreated(date);
        }
        if (entity.getTimeUpdated() == null)
        {
            entity.setTimeUpdated(date);
        }
    }

    public void removeListener(ap ap1)
    {
        List list = listeners;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = listeners.iterator();
_L2:
        ap ap2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_68;
            }
            ap2 = (ap)((WeakReference)iterator.next()).get();
        } while (ap2 != null && ap2 != ap1);
        iterator.remove();
        if (true) goto _L2; else goto _L1
_L1:
        ap1;
        list;
        JVM INSTR monitorexit ;
        throw ap1;
        list;
        JVM INSTR monitorexit ;
    }

    public void saveAll(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); save((Entity)iterable.next())) { }
    }
}
