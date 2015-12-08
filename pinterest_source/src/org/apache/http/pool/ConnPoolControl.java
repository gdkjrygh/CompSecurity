// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.pool;


// Referenced classes of package org.apache.http.pool:
//            PoolStats

public interface ConnPoolControl
{

    public abstract int getDefaultMaxPerRoute();

    public abstract int getMaxPerRoute(Object obj);

    public abstract int getMaxTotal();

    public abstract PoolStats getStats(Object obj);

    public abstract PoolStats getTotalStats();

    public abstract void setDefaultMaxPerRoute(int i);

    public abstract void setMaxPerRoute(Object obj, int i);

    public abstract void setMaxTotal(int i);
}
