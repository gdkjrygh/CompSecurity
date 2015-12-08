// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;


public final class  extends Enum
{

    public static final IGNORE_CACHE_EXPIRATION IGNORE_CACHE_EXPIRATION;
    public static final IGNORE_CACHE_EXPIRATION SKIP_CACHE_LOOKUP;
    public static final IGNORE_CACHE_EXPIRATION USE_CACHE;
    private static final IGNORE_CACHE_EXPIRATION a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/crashlytics/android/SettingsController$CacheBehavior, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        USE_CACHE = new <init>("USE_CACHE", 0);
        SKIP_CACHE_LOOKUP = new <init>("SKIP_CACHE_LOOKUP", 1);
        IGNORE_CACHE_EXPIRATION = new <init>("IGNORE_CACHE_EXPIRATION", 2);
        a = (new a[] {
            USE_CACHE, SKIP_CACHE_LOOKUP, IGNORE_CACHE_EXPIRATION
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
