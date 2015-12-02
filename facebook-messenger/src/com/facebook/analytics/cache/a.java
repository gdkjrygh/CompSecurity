// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.cache;

import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.common.w.q;

public class a
{

    private final av a;
    private final String b;
    private final javax.inject.a c;

    public a(String s, av av1, javax.inject.a a1)
    {
        a = av1;
        b = s;
        c = a1;
    }

    private cb a(String s, int i)
    {
        return (new cb((new StringBuilder()).append(b).append("_").append(s).toString())).a("obj_id", i);
    }

    private boolean a()
    {
        return ((q)c.b()).equals(q.YES);
    }

    public void a(int i, long l)
    {
        if (a())
        {
            a.a(a("cache_read", i).a("mem_size", l));
        }
    }

    public void a(int i, long l, long l1)
    {
        if (a())
        {
            a.a(a("cache_write", i).a("mem_size", l).a("disk_size", l1));
        }
    }

    public void b(int i, long l)
    {
        if (a())
        {
            a.a(a("cache_mem_read", i).a("mem_size", l));
        }
    }

    public void c(int i, long l)
    {
        if (a())
        {
            a.a(a("cache_disk_read", i).a("disk_size", l));
        }
    }

    public void d(int i, long l)
    {
        if (a())
        {
            a.a(a("cache_disk_write", i).a("disk_size", l));
        }
    }
}
