// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;


public final class SettingsCacheBehavior extends Enum
{

    public static final SettingsCacheBehavior a;
    public static final SettingsCacheBehavior b;
    public static final SettingsCacheBehavior c;
    private static final SettingsCacheBehavior d[];

    private SettingsCacheBehavior(String s, int i)
    {
        super(s, i);
    }

    public static SettingsCacheBehavior valueOf(String s)
    {
        return (SettingsCacheBehavior)Enum.valueOf(io/fabric/sdk/android/services/settings/SettingsCacheBehavior, s);
    }

    public static SettingsCacheBehavior[] values()
    {
        return (SettingsCacheBehavior[])d.clone();
    }

    static 
    {
        a = new SettingsCacheBehavior("USE_CACHE", 0);
        b = new SettingsCacheBehavior("SKIP_CACHE_LOOKUP", 1);
        c = new SettingsCacheBehavior("IGNORE_CACHE_EXPIRATION", 2);
        d = (new SettingsCacheBehavior[] {
            a, b, c
        });
    }
}
