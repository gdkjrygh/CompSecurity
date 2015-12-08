// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.impl.pool;

import java.io.IOException;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.pool.PoolEntry;

public class BasicPoolEntry extends PoolEntry
{

    public BasicPoolEntry(String s, HttpHost httphost, HttpClientConnection httpclientconnection)
    {
        super(s, httphost, httpclientconnection);
    }

    public void close()
    {
        try
        {
            ((HttpClientConnection)getConnection()).close();
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    public boolean isClosed()
    {
        return !((HttpClientConnection)getConnection()).isOpen();
    }
}
