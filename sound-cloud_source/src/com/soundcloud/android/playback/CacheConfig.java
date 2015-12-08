// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.java.strings.Strings;
import java.util.Locale;

public class CacheConfig
{

    static final long MAX_SIZE_BYTES = 0x1f400000L;
    static final long MIN_SIZE_BYTES = 0x3c00000L;

    public CacheConfig()
    {
    }

    public static long getCacheSize(String s)
    {
        return !Strings.isBlank(s) && !Locale.US.getCountry().equalsIgnoreCase(s) && !Locale.GERMANY.getCountry().equalsIgnoreCase(s) && !Locale.FRANCE.getCountry().equalsIgnoreCase(s) && !Locale.UK.getCountry().equalsIgnoreCase(s) ? 0x1f400000L : 0x3c00000L;
    }
}
