// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class alD extends alT
    implements alM, Serializable
{

    public final long a;

    public alD()
    {
        a = alv.a();
    }

    public alD(long l)
    {
        a = l;
    }

    public final als a()
    {
        return new als(a, ams.M());
    }

    public final alD b()
    {
        return this;
    }

    public final long c()
    {
        return a;
    }

    public final alr d()
    {
        return ams.L();
    }

    public final alG e()
    {
        return new alG(a, ams.M());
    }
}
