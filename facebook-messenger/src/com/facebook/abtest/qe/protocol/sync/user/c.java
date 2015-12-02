// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.protocol.sync.user;

import com.google.common.a.ev;

// Referenced classes of package com.facebook.abtest.qe.protocol.sync.user:
//            SyncQuickExperimentUserInfoResult

public class c
{

    private String a;
    private String b;
    private boolean c;
    private String d;
    private ev e;

    public c()
    {
    }

    static String a(c c1)
    {
        return c1.a;
    }

    static String b(c c1)
    {
        return c1.b;
    }

    static boolean c(c c1)
    {
        return c1.c;
    }

    static String d(c c1)
    {
        return c1.d;
    }

    static ev e(c c1)
    {
        return c1.e;
    }

    public SyncQuickExperimentUserInfoResult a()
    {
        return new SyncQuickExperimentUserInfoResult(this, null);
    }

    public c a(ev ev)
    {
        e = ev;
        return this;
    }

    public c a(String s)
    {
        a = s;
        return this;
    }

    public c a(boolean flag)
    {
        c = flag;
        return this;
    }

    public c b(String s)
    {
        b = s;
        return this;
    }

    public c c(String s)
    {
        d = s;
        return this;
    }
}
