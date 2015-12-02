// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.protocol.sync;


// Referenced classes of package com.facebook.abtest.qe.protocol.sync:
//            SyncQuickExperimentParams

public class c
{

    private String a;
    private String b;
    private String c;

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

    static String c(c c1)
    {
        return c1.c;
    }

    public SyncQuickExperimentParams a()
    {
        return new SyncQuickExperimentParams(this, null);
    }

    public c a(String s)
    {
        a = s;
        return this;
    }

    public c b(String s)
    {
        b = s;
        return this;
    }

    public c c(String s)
    {
        c = s;
        return this;
    }
}
