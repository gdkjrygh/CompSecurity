// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.httpstack;

import java.io.IOException;
import java.util.List;
import org.apache.http.HttpResponse;

// Referenced classes of package com.netflix.mediaclient.httpstack:
//            HttpStackConnection

public interface HttpStack
{

    public static final String COOKIE_SET_CHECK = "Set-Cookie";
    public static final int DEFAULT_HTTP_CONN_TIMEOUT_MS = 15000;
    public static final int DEFAULT_HTTP_SO_TIMEOUT_MS = 10000;
    public static final String DOMAIN = ".netflix.com";
    public static final String PATH = "/";

    public abstract void disconnect(HttpStackConnection httpstackconnection);

    public abstract HttpStackConnection getConnection(String s)
        throws IOException;

    public abstract List getResponseCookies(HttpStackConnection httpstackconnection);

    public abstract HttpResponse performGet(HttpStackConnection httpstackconnection)
        throws IOException;
}
