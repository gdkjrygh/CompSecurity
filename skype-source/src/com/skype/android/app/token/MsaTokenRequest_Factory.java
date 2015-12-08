// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.token;

import com.skype.SkyLib;
import com.skype.android.event.EventBus;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.token:
//            MsaTokenRequest

public final class MsaTokenRequest_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider eventBusProvider;
    private final Provider libProvider;

    public MsaTokenRequest_Factory(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        eventBusProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            libProvider = provider1;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1)
    {
        return new MsaTokenRequest_Factory(provider, provider1);
    }

    public final MsaTokenRequest get()
    {
        return new MsaTokenRequest((EventBus)eventBusProvider.get(), (SkyLib)libProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/token/MsaTokenRequest_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
