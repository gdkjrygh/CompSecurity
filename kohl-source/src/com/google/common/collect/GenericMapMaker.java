// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.collect:
//            MapEvictionListener

public abstract class GenericMapMaker
{

    MapEvictionListener evictionListener;

    GenericMapMaker()
    {
    }

    public abstract GenericMapMaker concurrencyLevel(int i);

    public abstract GenericMapMaker expiration(long l, TimeUnit timeunit);

    public abstract GenericMapMaker expireAfterAccess(long l, TimeUnit timeunit);

    public abstract GenericMapMaker expireAfterWrite(long l, TimeUnit timeunit);

    public abstract GenericMapMaker initialCapacity(int i);

    public abstract ConcurrentMap makeComputingMap(Function function);

    public abstract ConcurrentMap makeMap();

    public abstract GenericMapMaker maximumSize(int i);

    public abstract GenericMapMaker softKeys();

    public abstract GenericMapMaker softValues();

    public abstract GenericMapMaker weakKeys();

    public abstract GenericMapMaker weakValues();
}
