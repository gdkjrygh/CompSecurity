// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.mem;

import com.fitbit.data.domain.Entity;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public abstract class a extends com.fitbit.data.repo.a
{

    public a()
    {
    }

    public transient Entity a(long l, com.fitbit.data.domain.Entity.EntityStatus aentitystatus[])
    {
        for (Iterator iterator = getAll().iterator(); iterator.hasNext();)
        {
            Entity entity = (Entity)iterator.next();
            int j = aentitystatus.length;
            int i = 0;
            boolean flag = false;
            while (i < j) 
            {
                com.fitbit.data.domain.Entity.EntityStatus entitystatus = aentitystatus[i];
                boolean flag1;
                if (entity.getEntityStatus() == entitystatus)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                flag |= flag1;
                i++;
            }
            if (entity.getServerId() == l && !flag)
            {
                return entity;
            }
        }

        return null;
    }

    public void clear(boolean flag)
    {
        getAll().clear();
    }

    public void delete(Entity entity)
    {
        getAll().remove(entity);
    }

    protected void doAdd(Entity entity)
    {
        getAll().add(entity);
    }

    public transient List get(com.fitbit.data.domain.Entity.EntityStatus aentitystatus[])
    {
        throw new UnsupportedOperationException();
    }

    public Entity getByServerId(long l)
    {
        for (Iterator iterator = getAll().iterator(); iterator.hasNext();)
        {
            Entity entity = (Entity)iterator.next();
            if (entity.getServerId() == l)
            {
                return entity;
            }
        }

        return null;
    }

    public List getByServerId(List list)
    {
        throw new UnsupportedOperationException();
    }

    public Entity getByUUID(UUID uuid)
    {
        for (Iterator iterator = getAll().iterator(); iterator.hasNext();)
        {
            Entity entity = (Entity)iterator.next();
            if (entity.getUuid() != null && uuid != null && entity.getUuid().equals(uuid))
            {
                return entity;
            }
        }

        return null;
    }

    public String getName()
    {
        return null;
    }

    public void runInTransaction(Runnable runnable)
    {
        runnable.run();
    }

    public void save(Entity entity)
    {
    }
}
