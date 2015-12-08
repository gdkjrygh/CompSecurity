// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import com.c.a.v;
import java.net.URL;

public final class p
{

    public static String a(v v1)
    {
        if (v1 == v.a)
        {
            return "HTTP/1.0";
        } else
        {
            return "HTTP/1.1";
        }
    }

    public static String a(URL url)
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
                return (new StringBuilder("/")).append(s).toString();
            }
        }
        return url;
    }
}
