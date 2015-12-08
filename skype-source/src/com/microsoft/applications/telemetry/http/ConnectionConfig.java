// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry.http;


public class ConnectionConfig
{

    public final int connectionTimeout;
    public final int maxRedirects;
    public final int requestTimeout;

    public ConnectionConfig(int i, int j, int k)
    {
        connectionTimeout = i;
        requestTimeout = j;
        maxRedirects = k;
    }
}
