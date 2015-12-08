// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import javax.inject.Provider;

public final class nC
    implements afq
{

    static final boolean $assertionsDisabled;
    private final Provider mCashCardManagerProvider;
    private final Provider mSquareProvider;
    private final afq supertypeInjector;

    private nC(afq afq1, Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && afq1 == null)
        {
            throw new AssertionError();
        }
        supertypeInjector = afq1;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        mCashCardManagerProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            mSquareProvider = provider1;
            return;
        }
    }

    public static afq a(afq afq1, Provider provider, Provider provider1)
    {
        return new nC(afq1, provider, provider1);
    }

    public final void a(Object obj)
    {
        obj = (nB)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.a(obj);
            obj.mCashCardManager = (sc)mCashCardManagerProvider.get();
            obj.mSquareProvider = (oh)mSquareProvider.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!nC.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
