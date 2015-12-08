// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import javax.inject.Provider;

public final class oN
    implements afw
{

    static final boolean $assertionsDisabled;
    private final Provider gsonProvider;
    private final afq membersInjector;

    private oN(afq afq1, Provider provider)
    {
        if (!$assertionsDisabled && afq1 == null)
        {
            throw new AssertionError();
        }
        membersInjector = afq1;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            gsonProvider = provider;
            return;
        }
    }

    public static afw a(afq afq1, Provider provider)
    {
        return new oN(afq1, provider);
    }

    public final Object get()
    {
        oM om = new oM((Iu)gsonProvider.get());
        membersInjector.a(om);
        return om;
    }

    static 
    {
        boolean flag;
        if (!oN.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
