// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.service;

import com.skype.android.util.ServerClock;
import com.skype.android.util.cache.SpannedStringCache;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.service:
//            LocaleChangedReceiver

public final class LocaleChangedReceiver_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider serverClockProvider;
    private final Provider spannedStringCacheProvider;

    public LocaleChangedReceiver_MembersInjector(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        spannedStringCacheProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            serverClockProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new LocaleChangedReceiver_MembersInjector(provider, provider1);
    }

    public static void injectServerClock(LocaleChangedReceiver localechangedreceiver, Provider provider)
    {
        localechangedreceiver.serverClock = (ServerClock)provider.get();
    }

    public static void injectSpannedStringCache(LocaleChangedReceiver localechangedreceiver, Provider provider)
    {
        localechangedreceiver.spannedStringCache = (SpannedStringCache)provider.get();
    }

    public final void injectMembers(LocaleChangedReceiver localechangedreceiver)
    {
        if (localechangedreceiver == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            localechangedreceiver.spannedStringCache = (SpannedStringCache)spannedStringCacheProvider.get();
            localechangedreceiver.serverClock = (ServerClock)serverClockProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LocaleChangedReceiver)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/service/LocaleChangedReceiver_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
