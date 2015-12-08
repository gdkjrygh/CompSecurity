// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import javax.inject.Provider;

public final class sB
    implements afq
{

    private static boolean b;
    private final Provider a;

    private sB(Provider provider)
    {
        if (!b && provider == null)
        {
            throw new AssertionError();
        } else
        {
            a = provider;
            return;
        }
    }

    public static afq a(Provider provider)
    {
        return new sB(provider);
    }

    public final void a(Object obj)
    {
        obj = (sA)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            obj.a = (sl)a.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!sB.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
