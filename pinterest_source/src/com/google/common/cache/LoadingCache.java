// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.cache:
//            Cache

public interface LoadingCache
    extends Function, Cache
{

    public abstract Object apply(Object obj);

    public abstract ConcurrentMap asMap();

    public abstract Object get(Object obj);

    public abstract ImmutableMap getAll(Iterable iterable);

    public abstract Object getUnchecked(Object obj);

    public abstract void refresh(Object obj);
}
