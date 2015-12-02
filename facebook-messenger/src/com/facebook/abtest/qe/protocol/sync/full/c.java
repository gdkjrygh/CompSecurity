// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.protocol.sync.full;

import com.google.common.a.ev;
import java.util.List;

// Referenced classes of package com.facebook.abtest.qe.protocol.sync.full:
//            SyncQuickExperimentMetaInfoResult

public class c
{

    private String a;
    private List b;
    private ev c;
    private String d;
    private long e;

    public c()
    {
    }

    static String a(c c1)
    {
        return c1.a;
    }

    static List b(c c1)
    {
        return c1.b;
    }

    static ev c(c c1)
    {
        return c1.c;
    }

    static String d(c c1)
    {
        return c1.d;
    }

    static long e(c c1)
    {
        return c1.e;
    }

    public SyncQuickExperimentMetaInfoResult a()
    {
        return new SyncQuickExperimentMetaInfoResult(this, null);
    }

    public c a(long l)
    {
        e = l;
        return this;
    }

    public c a(ev ev)
    {
        c = ev;
        return this;
    }

    public c a(String s)
    {
        a = s;
        return this;
    }

    public c a(List list)
    {
        b = list;
        return this;
    }

    public c b(String s)
    {
        d = s;
        return this;
    }
}
