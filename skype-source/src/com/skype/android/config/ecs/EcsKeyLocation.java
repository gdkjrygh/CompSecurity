// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.ecs;


public final class EcsKeyLocation extends Enum
{

    private static final EcsKeyLocation $VALUES[];
    public static final EcsKeyLocation ASYNC_MEDIA_CLIENT_FEATURES;
    public static final EcsKeyLocation SKYPE_ANDROID;
    public static final EcsKeyLocation SKYPE_ANDROID_TELEMETRY;
    public static final EcsKeyLocation SKYPE_TMX_FEATURES;
    public static final EcsKeyLocation SPEX_FEATURES;
    public static final EcsKeyLocation SPEX_TELEMETRY;
    private final String keyPrefix;
    private final String pathRoot;

    private EcsKeyLocation(String s, int i, String s1, String s2)
    {
        super(s, i);
        pathRoot = s1;
        keyPrefix = s2;
    }

    public static EcsKeyLocation valueOf(String s)
    {
        return (EcsKeyLocation)Enum.valueOf(com/skype/android/config/ecs/EcsKeyLocation, s);
    }

    public static EcsKeyLocation[] values()
    {
        return (EcsKeyLocation[])$VALUES.clone();
    }

    public final String getKeyPrefix()
    {
        return keyPrefix;
    }

    public final String getPathRoot()
    {
        return pathRoot;
    }

    static 
    {
        SKYPE_ANDROID = new EcsKeyLocation("SKYPE_ANDROID", 0, "SkypeAndroid", "FeaturesPolicy/");
        SPEX_FEATURES = new EcsKeyLocation("SPEX_FEATURES", 1, "SPEX", "FeaturesPolicy/");
        SKYPE_TMX_FEATURES = new EcsKeyLocation("SKYPE_TMX_FEATURES", 2, "SkypeAVTMX", "");
        ASYNC_MEDIA_CLIENT_FEATURES = new EcsKeyLocation("ASYNC_MEDIA_CLIENT_FEATURES", 3, "AsyncMediaClient", "");
        SKYPE_ANDROID_TELEMETRY = new EcsKeyLocation("SKYPE_ANDROID_TELEMETRY", 4, "SkypeAndroid", "FeaturesPolicy/Telemetry/");
        SPEX_TELEMETRY = new EcsKeyLocation("SPEX_TELEMETRY", 5, "SPEX", "FeaturesPolicy/Telemetry/");
        $VALUES = (new EcsKeyLocation[] {
            SKYPE_ANDROID, SPEX_FEATURES, SKYPE_TMX_FEATURES, ASYNC_MEDIA_CLIENT_FEATURES, SKYPE_ANDROID_TELEMETRY, SPEX_TELEMETRY
        });
    }
}
