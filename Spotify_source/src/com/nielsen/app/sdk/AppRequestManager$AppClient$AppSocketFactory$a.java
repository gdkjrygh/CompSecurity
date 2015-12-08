// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

class <init>
    implements X509TrustManager
{

    final <init> a;

    public void checkClientTrusted(X509Certificate ax509certificate[], String s)
    {
    }

    public void checkServerTrusted(X509Certificate ax509certificate[], String s)
    {
    }

    public X509Certificate[] getAcceptedIssuers()
    {
        return null;
    }

    private ( )
    {
        a = ;
        super();
    }

    a(a a1, a a2)
    {
        this(a1);
    }
}
