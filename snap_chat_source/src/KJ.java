// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.util.crypto.DeviceTokenManager;
import javax.inject.Provider;

public final class KJ
    implements afw
{

    static final boolean $assertionsDisabled;
    private final Provider apiTaskFactoryProvider;
    private final Provider developerSettingsProvider;
    private final Provider gsonWrapperProvider;
    private final Provider slightlySecurePreferencesProvider;

    private KJ(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        slightlySecurePreferencesProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        gsonWrapperProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        apiTaskFactoryProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            developerSettingsProvider = provider3;
            return;
        }
    }

    public static afw a(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new KJ(provider, provider1, provider2, provider3);
    }

    public final Object get()
    {
        return new DeviceTokenManager((KO)slightlySecurePreferencesProvider.get(), (Iu)gsonWrapperProvider.get(), (lX)apiTaskFactoryProvider.get(), (LA)developerSettingsProvider.get());
    }

    static 
    {
        boolean flag;
        if (!KJ.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
