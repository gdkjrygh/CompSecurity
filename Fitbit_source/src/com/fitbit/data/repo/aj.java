// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.data.domain.Operation;
import java.util.List;

public interface aj
{

    public abstract void add(Operation operation);

    public abstract void addAll(List list);

    public abstract void clearOperationQueueFor(Long long1, String s);

    public abstract void delete(Operation operation);

    public abstract void deleteAll(List list);

    public abstract List getAllOperationsWithCreationOrder();

    public abstract void saveAll(List list);
}
