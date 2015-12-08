// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import javax.inject.Provider;

public final class KG
    implements afq
{

    static final boolean $assertionsDisabled;
    private final Provider mClockProvider;

    private KG(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            mClockProvider = provider;
            return;
        }
    }

    public static afq a(Provider provider)
    {
        return new KG(provider);
    }

    public final void a(Object obj)
    {
        obj = (KF)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            obj.mClock = (PB)mClockProvider.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!KG.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
