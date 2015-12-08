// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class eh
    implements HostnameVerifier
{

    public eh()
    {
    }

    public boolean verify(String s, SSLSession sslsession)
    {
        return true;
    }
}
