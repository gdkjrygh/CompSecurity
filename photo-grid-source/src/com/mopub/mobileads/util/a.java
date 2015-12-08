// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.util;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;

final class a
    implements Runnable
{

    final HttpClient a;

    a(HttpClient httpclient)
    {
        a = httpclient;
        super();
    }

    public final void run()
    {
        if (a != null && a.getConnectionManager() != null)
        {
            a.getConnectionManager().shutdown();
        }
    }
}
