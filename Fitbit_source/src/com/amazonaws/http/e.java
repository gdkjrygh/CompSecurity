// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.http;

import com.amazonaws.auth.al;
import com.amazonaws.auth.g;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.a;
import java.net.URI;
import java.util.List;

public class e
{

    private final AWSRequestMetrics a;
    private final List b;
    private String c;
    private final com.amazonaws.a d;
    private g e;

    public e()
    {
        this(null, false, null);
    }

    public e(List list, boolean flag, com.amazonaws.a a1)
    {
        b = list;
        if (flag)
        {
            list = new a();
        } else
        {
            list = new AWSRequestMetrics();
        }
        a = list;
        d = a1;
    }

    public e(boolean flag)
    {
        this(null, flag, null);
    }

    public al a(URI uri)
    {
        if (d == null)
        {
            return null;
        } else
        {
            return d.b(uri);
        }
    }

    public String a()
    {
        return c;
    }

    public void a(al al)
    {
    }

    public void a(g g)
    {
        e = g;
    }

    public void a(String s)
    {
        c = s;
    }

    public List b()
    {
        return b;
    }

    public AWSRequestMetrics c()
    {
        return a;
    }

    public g d()
    {
        return e;
    }
}
