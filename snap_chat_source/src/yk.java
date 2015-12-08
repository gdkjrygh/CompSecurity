// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import javax.inject.Provider;

public final class yk
    implements afq
{

    private static boolean c;
    private final afq a;
    private final Provider b;

    private yk(afq afq1, Provider provider)
    {
        if (!c && afq1 == null)
        {
            throw new AssertionError();
        }
        a = afq1;
        if (!c && provider == null)
        {
            throw new AssertionError();
        } else
        {
            b = provider;
            return;
        }
    }

    public static afq a(afq afq1, Provider provider)
    {
        return new yk(afq1, provider);
    }

    public final void a(Object obj)
    {
        obj = (yj)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            a.a(obj);
            obj.h = (LB)b.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!yk.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }
}
