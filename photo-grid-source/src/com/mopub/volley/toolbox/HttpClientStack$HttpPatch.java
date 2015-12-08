// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class setURI extends HttpEntityEnclosingRequestBase
{

    public static final String METHOD_NAME = "PATCH";

    public final String getMethod()
    {
        return "PATCH";
    }

    public equestBase()
    {
    }

    public equestBase(String s)
    {
        setURI(URI.create(s));
    }

    public setURI(URI uri)
    {
        setURI(uri);
    }
}
