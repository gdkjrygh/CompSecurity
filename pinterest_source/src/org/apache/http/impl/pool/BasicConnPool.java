// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.impl.pool;

import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.params.HttpParams;
import org.apache.http.pool.AbstractConnPool;
import org.apache.http.pool.ConnFactory;
import org.apache.http.pool.PoolEntry;

// Referenced classes of package org.apache.http.impl.pool:
//            BasicConnFactory, BasicPoolEntry

public class BasicConnPool extends AbstractConnPool
{

    private static AtomicLong COUNTER = new AtomicLong();

    public BasicConnPool(HttpParams httpparams)
    {
        super(new BasicConnFactory(httpparams), 2, 20);
    }

    public BasicConnPool(ConnFactory connfactory)
    {
        super(connfactory, 2, 20);
    }

    protected BasicPoolEntry createEntry(HttpHost httphost, HttpClientConnection httpclientconnection)
    {
        return new BasicPoolEntry(Long.toString(COUNTER.getAndIncrement()), httphost, httpclientconnection);
    }

    protected volatile PoolEntry createEntry(Object obj, Object obj1)
    {
        return createEntry((HttpHost)obj, (HttpClientConnection)obj1);
    }

}
