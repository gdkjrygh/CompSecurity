// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import com.skype.android.concurrent.AsyncService;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.push:
//            RegisterReceiver, PushManager

public final class RegisterReceiver_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider asyncServiceProvider;
    private final Provider pushManagerProvider;

    public RegisterReceiver_MembersInjector(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        pushManagerProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            asyncServiceProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new RegisterReceiver_MembersInjector(provider, provider1);
    }

    public static void injectAsyncService(RegisterReceiver registerreceiver, Provider provider)
    {
        registerreceiver.asyncService = (AsyncService)provider.get();
    }

    public static void injectPushManager(RegisterReceiver registerreceiver, Provider provider)
    {
        registerreceiver.pushManager = (PushManager)provider.get();
    }

    public final void injectMembers(RegisterReceiver registerreceiver)
    {
        if (registerreceiver == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            registerreceiver.pushManager = (PushManager)pushManagerProvider.get();
            registerreceiver.asyncService = (AsyncService)asyncServiceProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RegisterReceiver)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/push/RegisterReceiver_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
