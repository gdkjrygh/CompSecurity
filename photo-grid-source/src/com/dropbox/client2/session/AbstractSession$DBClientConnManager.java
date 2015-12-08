// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.session;

import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;

class t> extends ThreadSafeClientConnManager
{

    public ClientConnectionRequest requestConnection(HttpRoute httproute, Object obj)
    {
        Thread.ensureRunning(this, 20, 5);
        return super.requestConnection(httproute, obj);
    }

    public Thread(HttpParams httpparams, SchemeRegistry schemeregistry)
    {
        super(httpparams, schemeregistry);
    }
}
