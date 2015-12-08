// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.skippy;

import com.soundcloud.android.crypto.CryptoOperations;
import com.soundcloud.android.properties.ApplicationProperties;
import com.soundcloud.android.utils.TelphonyBasedCountryProvider;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.skippy:
//            SkippyFactory

public final class I extends b
    implements Provider
{

    private b applicationProperties;
    private b countryProvider;
    private b cryptoOperations;

    public final void attach(l l1)
    {
        cryptoOperations = l1.a("com.soundcloud.android.crypto.CryptoOperations", com/soundcloud/android/playback/skippy/SkippyFactory, getClass().getClassLoader());
        applicationProperties = l1.a("com.soundcloud.android.properties.ApplicationProperties", com/soundcloud/android/playback/skippy/SkippyFactory, getClass().getClassLoader());
        countryProvider = l1.a("com.soundcloud.android.utils.TelphonyBasedCountryProvider", com/soundcloud/android/playback/skippy/SkippyFactory, getClass().getClassLoader());
    }

    public final SkippyFactory get()
    {
        return new SkippyFactory((CryptoOperations)cryptoOperations.get(), (ApplicationProperties)applicationProperties.get(), (TelphonyBasedCountryProvider)countryProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(cryptoOperations);
        set.add(applicationProperties);
        set.add(countryProvider);
    }

    public I()
    {
        super("com.soundcloud.android.playback.skippy.SkippyFactory", "members/com.soundcloud.android.playback.skippy.SkippyFactory", false, com/soundcloud/android/playback/skippy/SkippyFactory);
    }
}
