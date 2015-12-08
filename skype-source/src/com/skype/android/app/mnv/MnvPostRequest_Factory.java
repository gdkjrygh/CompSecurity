// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvPostRequest, MnvUtil, MnvCases

public final class MnvPostRequest_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider mnvCasesProvider;
    private final Provider mnvUtilProvider;

    public MnvPostRequest_Factory(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        mnvUtilProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            mnvCasesProvider = provider1;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1)
    {
        return new MnvPostRequest_Factory(provider, provider1);
    }

    public final MnvPostRequest get()
    {
        return new MnvPostRequest((MnvUtil)mnvUtilProvider.get(), (MnvCases)mnvCasesProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/mnv/MnvPostRequest_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
