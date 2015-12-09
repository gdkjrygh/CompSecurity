// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class hcn extends hcx
{

    public hcx a;

    public hcn(hcx hcx1)
    {
        if (hcx1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            a = hcx1;
            return;
        }
    }

    public final long W_()
    {
        return a.W_();
    }

    public final boolean X_()
    {
        return a.X_();
    }

    public final hcx Y_()
    {
        return a.Y_();
    }

    public final hcx a(long l)
    {
        return a.a(l);
    }

    public final hcx a(long l, TimeUnit timeunit)
    {
        return a.a(l, timeunit);
    }

    public final long c()
    {
        return a.c();
    }

    public final hcx d()
    {
        return a.d();
    }

    public final void f()
    {
        a.f();
    }
}
