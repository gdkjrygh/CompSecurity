// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http.apache;

import com.google.api.client.util.Preconditions;
import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

final class HttpExtensionMethod extends HttpEntityEnclosingRequestBase
{

    private final String methodName;

    public HttpExtensionMethod(String s, String s1)
    {
        methodName = (String)Preconditions.checkNotNull(s);
        setURI(URI.create(s1));
    }

    public String getMethod()
    {
        return methodName;
    }
}
