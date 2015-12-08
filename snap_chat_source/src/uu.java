// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import javax.inject.Provider;

public final class uu
    implements afq
{

    private static boolean b;
    private final Provider a;

    private uu(Provider provider)
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
        return new uu(provider);
    }

    public final void a(Object obj)
    {
        obj = (ut)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            obj.b = (Iu)a.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!uu.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
