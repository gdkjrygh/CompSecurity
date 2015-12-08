// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.data.domain.Entity;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.repo:
//            ap

public interface ao
{

    public abstract void add(Entity entity);

    public abstract void addAll(List list);

    public abstract void addListener(ap ap);

    public abstract void clear(boolean flag);

    public abstract void delete(Entity entity);

    public abstract void deleteAll(Iterable iterable);

    public transient abstract List get(com.fitbit.data.domain.Entity.EntityStatus aentitystatus[]);

    public abstract List getAll();

    public abstract Entity getById(long l);

    public abstract Entity getByServerId(long l);

    public abstract List getByServerId(List list);

    public abstract Entity getByUUID(UUID uuid);

    public abstract String getName();

    public abstract List getPendingEntries();

    public abstract void removeListener(ap ap);

    public abstract void runInTransaction(Runnable runnable);

    public abstract void save(Entity entity);

    public abstract void saveAll(Iterable iterable);
}
