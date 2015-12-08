// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import java.net.URL;

public final class RequestLine
{

    static String get(Request request, java.net.Proxy.Type type, Protocol protocol)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(request.method());
        stringbuilder.append(' ');
        if (includeAuthorityInRequestLine(request, type))
        {
            stringbuilder.append(request.url());
        } else
        {
            stringbuilder.append(requestPath(request.url()));
        }
        stringbuilder.append(' ');
        stringbuilder.append(version(protocol));
        return stringbuilder.toString();
    }

    private static boolean includeAuthorityInRequestLine(Request request, java.net.Proxy.Type type)
    {
        return !request.isHttps() && type == java.net.Proxy.Type.HTTP;
    }

    public static String requestPath(URL url)
    {
        String s = url.getFile();
        if (s == null)
        {
            url = "/";
        } else
        {
            url = s;
            if (!s.startsWith("/"))
            {
                return (new StringBuilder()).append("/").append(s).toString();
            }
        }
        return url;
    }

    public static String version(Protocol protocol)
    {
        if (protocol == Protocol.HTTP_1_0)
        {
            return "HTTP/1.0";
        } else
        {
            return "HTTP/1.1";
        }
    }
}
