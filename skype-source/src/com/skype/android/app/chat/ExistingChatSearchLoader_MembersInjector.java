// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.SkyLib;
import com.skype.android.skylib.ObjectIdMap;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            ExistingChatSearchLoader

public final class ExistingChatSearchLoader_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider libProvider;
    private final Provider mapProvider;

    public ExistingChatSearchLoader_MembersInjector(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        libProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            mapProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new ExistingChatSearchLoader_MembersInjector(provider, provider1);
    }

    public static void injectLib(ExistingChatSearchLoader existingchatsearchloader, Provider provider)
    {
        existingchatsearchloader.lib = (SkyLib)provider.get();
    }

    public static void injectMap(ExistingChatSearchLoader existingchatsearchloader, Provider provider)
    {
        existingchatsearchloader.map = (ObjectIdMap)provider.get();
    }

    public final void injectMembers(ExistingChatSearchLoader existingchatsearchloader)
    {
        if (existingchatsearchloader == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            existingchatsearchloader.lib = (SkyLib)libProvider.get();
            existingchatsearchloader.map = (ObjectIdMap)mapProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ExistingChatSearchLoader)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/ExistingChatSearchLoader_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
