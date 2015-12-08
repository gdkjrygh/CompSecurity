// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f;

import kik.a.f.g.c;

// Referenced classes of package kik.a.f:
//            k

public abstract class h
    implements k
{

    public h()
    {
    }

    public String a()
    {
        return (new StringBuilder()).append(b()).append(".").append(k()).toString();
    }

    public abstract String b();

    public c c()
    {
        return c.b;
    }

    public String k()
    {
        return "kik.com";
    }

    public final String l()
    {
        return (new StringBuilder()).append(b()).append("-inactive.").append(k()).toString();
    }

    public final int m()
    {
        return c() != c.b && c() != c.d ? 5222 : 5223;
    }

    public final int n()
    {
        return c() != c.b && c() != c.d ? 80 : 443;
    }

    public final String o()
    {
        return "talk.kik.com";
    }
}
