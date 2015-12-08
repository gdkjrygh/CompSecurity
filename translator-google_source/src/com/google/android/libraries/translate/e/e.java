// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.e;

import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionManagerFactory;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;

final class e
    implements ClientConnectionManagerFactory
{

    e()
    {
    }

    public final ClientConnectionManager newInstance(HttpParams httpparams, SchemeRegistry schemeregistry)
    {
        return new ThreadSafeClientConnManager(httpparams, schemeregistry);
    }
}
