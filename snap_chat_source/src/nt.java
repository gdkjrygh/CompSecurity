// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import javax.inject.Provider;

public final class nt
    implements afq
{

    static final boolean $assertionsDisabled;
    private final Provider mReceivingCashManagerProvider;
    private final afq supertypeInjector;

    private nt(afq afq1, Provider provider)
    {
        if (!$assertionsDisabled && afq1 == null)
        {
            throw new AssertionError();
        }
        supertypeInjector = afq1;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            mReceivingCashManagerProvider = provider;
            return;
        }
    }

    public static afq a(afq afq1, Provider provider)
    {
        return new nt(afq1, provider);
    }

    public final void a(Object obj)
    {
        obj = (ns)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.a(obj);
            obj.mReceivingCashManager = (si)mReceivingCashManagerProvider.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!nt.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
