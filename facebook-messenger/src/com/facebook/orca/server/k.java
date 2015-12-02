// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;


// Referenced classes of package com.facebook.orca.server:
//            FetchGroupThreadsParams, j

public class k
{

    private j a;
    private int b;
    private String c;

    k()
    {
        a = null;
        b = 20;
        c = "";
    }

    public j a()
    {
        return a;
    }

    public k a(int i)
    {
        b = i;
        return this;
    }

    public k a(j j)
    {
        a = j;
        return this;
    }

    public k a(String s)
    {
        c = s;
        return this;
    }

    public int b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public FetchGroupThreadsParams d()
    {
        return new FetchGroupThreadsParams(this);
    }
}
