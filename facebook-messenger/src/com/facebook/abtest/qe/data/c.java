// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.data;

import com.facebook.abtest.qe.protocol.sync.full.SyncQuickExperimentMetaInfoResult;
import java.util.Map;

// Referenced classes of package com.facebook.abtest.qe.data:
//            QuickExperimentInfo

public class c
{

    private String a;
    private String b;
    private boolean c;
    private String d;
    private String e;
    private Map f;
    private SyncQuickExperimentMetaInfoResult g;

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

    static String e(c c1)
    {
        return c1.e;
    }

    static Map f(c c1)
    {
        return c1.f;
    }

    static SyncQuickExperimentMetaInfoResult g(c c1)
    {
        return c1.g;
    }

    public QuickExperimentInfo a()
    {
        return new QuickExperimentInfo(this, null);
    }

    public c a(SyncQuickExperimentMetaInfoResult syncquickexperimentmetainforesult)
    {
        g = syncquickexperimentmetainforesult;
        return this;
    }

    public c a(String s)
    {
        a = s;
        return this;
    }

    public c a(Map map)
    {
        f = map;
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

    public c d(String s)
    {
        e = s;
        return this;
    }
}
