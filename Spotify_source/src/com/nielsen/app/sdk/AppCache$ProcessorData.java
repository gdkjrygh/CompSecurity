// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;


// Referenced classes of package com.nielsen.app.sdk:
//            AppCache

public class g
{

    final AppCache a;
    private char b;
    private int c;
    private int d;
    private long e;
    private String f;
    private long g;

    public String getData()
    {
        return f;
    }

    public long getKey()
    {
        return g;
    }

    public int getMessage()
    {
        return d;
    }

    public int getProcessor()
    {
        return c;
    }

    public char getTimeBase()
    {
        return b;
    }

    public long getTimestamp()
    {
        return e;
    }

    public void setData(String s)
    {
        f = s;
    }

    public void setKey(long l)
    {
        g = l;
    }

    public void setMessage(int i)
    {
        d = i;
    }

    public void setProcessor(int i)
    {
        c = i;
    }

    public void setTimeBase(char c1)
    {
        b = c1;
    }

    public void setTimestamp(long l)
    {
        e = l;
    }

    public (AppCache appcache, long l, int i, int j, long l1, 
            char c1, String s)
    {
        a = appcache;
        super();
        b = ' ';
        c = -1;
        d = 6;
        e = 0L;
        f = "";
        g = 0L;
        b = c1;
        c = i;
        e = l1;
        d = j;
        f = s;
        g = l;
    }

    public g(AppCache appcache, g g1)
    {
        a = appcache;
        super();
        b = ' ';
        c = -1;
        d = 6;
        e = 0L;
        f = "";
        g = 0L;
        c = g1.c;
        e = g1.e;
        b = g1.b;
        d = g1.d;
        f = g1.f;
        g = g1.g;
    }
}
