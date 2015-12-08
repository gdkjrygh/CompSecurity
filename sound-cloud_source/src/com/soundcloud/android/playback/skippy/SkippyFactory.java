// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.skippy;

import com.soundcloud.android.Consts;
import com.soundcloud.android.crypto.CryptoOperations;
import com.soundcloud.android.playback.CacheConfig;
import com.soundcloud.android.properties.ApplicationProperties;
import com.soundcloud.android.skippy.Skippy;
import com.soundcloud.android.utils.TelphonyBasedCountryProvider;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class SkippyFactory
{

    private static final int BUFFER_DURATION_MS;
    private static final int CACHE_MIN_FREE_SPACE_AVAILABLE_PERCENTAGE = 1;
    private static final String KEY_PREFERENCE_NAME = "skippy_cache";
    private static final int PROGRESS_INTERVAL_MS = 500;
    private static final com.soundcloud.android.skippy.Skippy.CacheRestriction USE_CACHE_ALWAYS;
    private final ApplicationProperties applicationProperties;
    private final TelphonyBasedCountryProvider countryProvider;
    private final CryptoOperations cryptoOperations;

    SkippyFactory(CryptoOperations cryptooperations, ApplicationProperties applicationproperties, TelphonyBasedCountryProvider telphonybasedcountryprovider)
    {
        cryptoOperations = cryptooperations;
        applicationProperties = applicationproperties;
        countryProvider = telphonybasedcountryprovider;
    }

    public Skippy create()
    {
        return new Skippy();
    }

    public Skippy create(com.soundcloud.android.skippy.Skippy.PlayListener playlistener)
    {
        return new Skippy(playlistener);
    }

    public com.soundcloud.android.skippy.Skippy.Configuration createConfiguration()
    {
        long l = BUFFER_DURATION_MS;
        long l1 = CacheConfig.getCacheSize(countryProvider.getCountryCode());
        String s = Consts.EXTERNAL_SKIPPY_STREAM_DIRECTORY.getAbsolutePath();
        byte abyte0[] = cryptoOperations.getKeyOrGenerateAndStore("skippy_cache");
        boolean flag;
        if (!applicationProperties.isReleaseBuild())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new com.soundcloud.android.skippy.Skippy.Configuration(500, l, l1, 1L, s, abyte0, flag, USE_CACHE_ALWAYS);
    }

    static 
    {
        BUFFER_DURATION_MS = (int)TimeUnit.SECONDS.toMillis(90L);
        USE_CACHE_ALWAYS = com.soundcloud.android.skippy.Skippy.CacheRestriction.NONE;
    }
}
