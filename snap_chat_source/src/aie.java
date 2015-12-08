// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class aie extends aip
{

    public aip a;

    public aie(aip aip1)
    {
        if (aip1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            a = aip1;
            return;
        }
    }

    public final aip a(long l)
    {
        return a.a(l);
    }

    public final aip a(long l, TimeUnit timeunit)
    {
        return a.a(l, timeunit);
    }

    public final long ad_()
    {
        return a.ad_();
    }

    public final boolean ae_()
    {
        return a.ae_();
    }

    public final aip af_()
    {
        return a.af_();
    }

    public final long c()
    {
        return a.c();
    }

    public final aip d()
    {
        return a.d();
    }

    public final void f()
    {
        a.f();
    }
}
