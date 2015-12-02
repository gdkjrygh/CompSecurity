// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import com.facebook.fbservice.service.s;
import com.facebook.orca.threads.FolderName;

// Referenced classes of package com.facebook.orca.server:
//            FetchThreadListParams

public class y
{

    private s a;
    private FolderName b;
    private long c;
    private int d;
    private boolean e;

    y()
    {
        c = -1L;
        d = 20;
    }

    public s a()
    {
        return a;
    }

    public y a(long l)
    {
        c = l;
        return this;
    }

    public y a(s s)
    {
        a = s;
        return this;
    }

    public y a(FetchThreadListParams fetchthreadlistparams)
    {
        a = fetchthreadlistparams.a();
        b = fetchthreadlistparams.b();
        c = fetchthreadlistparams.c();
        d = fetchthreadlistparams.d();
        e = fetchthreadlistparams.e();
        return this;
    }

    public y a(FolderName foldername)
    {
        b = foldername;
        return this;
    }

    public y a(boolean flag)
    {
        e = flag;
        return this;
    }

    public FolderName b()
    {
        return b;
    }

    public long c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }

    public boolean e()
    {
        return e;
    }

    public FetchThreadListParams f()
    {
        return new FetchThreadListParams(this);
    }
}
