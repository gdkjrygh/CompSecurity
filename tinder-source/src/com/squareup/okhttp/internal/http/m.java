// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.p;

public final class m
{

    public static String a(Protocol protocol)
    {
        if (protocol == Protocol.a)
        {
            return "HTTP/1.0";
        } else
        {
            return "HTTP/1.1";
        }
    }

    public static String a(p p1)
    {
        int i = p1.f.indexOf('/', p1.a.length() + 3);
        int j = p.a(p1.f, i, p1.f.length(), "?#");
        String s = p1.f.substring(i, j);
        String s1 = p1.e();
        p1 = s;
        if (s1 != null)
        {
            p1 = (new StringBuilder()).append(s).append('?').append(s1).toString();
        }
        return p1;
    }
}
