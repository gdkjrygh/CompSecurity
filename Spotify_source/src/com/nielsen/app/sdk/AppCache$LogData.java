// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;


// Referenced classes of package com.nielsen.app.sdk:
//            h, AppCache

public class copy
{

    final AppCache a;
    private long b;
    private String c;
    private long d;
    private long e;
    private long f;
    private long g;
    private int h;

    public void addOccurrence(String s)
    {
        f = e;
        e = d;
        d = com.nielsen.app.sdk.h.g();
        c = s;
        h = h + 1;
    }

    public void copy(h h1)
    {
        e = h1.e;
        f = h1.f;
        d = h1.d;
        h = h1.h;
        c = h1.c;
        b = h1.b;
        g = h1.g;
    }

    public int getCount()
    {
        return h;
    }

    public String getInfo()
    {
        return c;
    }

    public long getKey()
    {
        return g;
    }

    public long getLog()
    {
        return b;
    }

    public long getTimestamp()
    {
        return d;
    }

    public long getTimestamp2()
    {
        return e;
    }

    public long getTimestamp3()
    {
        return f;
    }

    public void initialize(long l)
    {
        initialize(l, 0, "", 0L, 0L, 0L);
    }

    public void initialize(long l, int i, String s, long l1, long l2, long l3)
    {
        f = l3;
        e = l2;
        d = l1;
        h = i;
        c = s;
        b = l;
    }

    public void setCount(int i)
    {
        h = i;
    }

    public void setInfo(String s)
    {
        c = s;
    }

    public void setKey(long l)
    {
        g = l;
    }

    public void setLog(long l)
    {
        b = l;
    }

    public void setTimestamp(long l)
    {
        d = l;
    }

    public void setTimestamp2(long l)
    {
        e = l;
    }

    public void setTimestamp3(long l)
    {
        f = l;
    }

    public (AppCache appcache, long l)
    {
        a = appcache;
        super();
        b = 23L;
        c = "";
        d = 0L;
        e = 0L;
        f = 0L;
        g = -1L;
        h = 0;
        initialize(l);
    }

    public initialize(AppCache appcache, long l, int i, long l1, long l2, long l3, String s)
    {
        a = appcache;
        super();
        b = 23L;
        c = "";
        d = 0L;
        e = 0L;
        f = 0L;
        g = -1L;
        h = 0;
        initialize(l, i, s, l1, l2, l3);
    }

    public initialize(AppCache appcache, initialize initialize1)
    {
        a = appcache;
        super();
        b = 23L;
        c = "";
        d = 0L;
        e = 0L;
        f = 0L;
        g = -1L;
        h = 0;
        copy(initialize1);
    }
}
