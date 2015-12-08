// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


public final class YuMeAdEvent extends Enum
{

    public static final YuMeAdEvent AD_ABSENT;
    public static final YuMeAdEvent AD_AND_ASSETS_READY;
    public static final YuMeAdEvent AD_COMPLETED;
    public static final YuMeAdEvent AD_ERROR;
    public static final YuMeAdEvent AD_EXPIRED;
    public static final YuMeAdEvent AD_NOT_READY;
    public static final YuMeAdEvent AD_PLAYING;
    public static final YuMeAdEvent AD_PRESENT;
    public static final YuMeAdEvent AD_READY;
    public static final YuMeAdEvent NONE;
    private static final YuMeAdEvent a[];

    private YuMeAdEvent(String s, int i)
    {
        super(s, i);
    }

    public static YuMeAdEvent valueOf(String s)
    {
        return (YuMeAdEvent)Enum.valueOf(com/yume/android/sdk/YuMeAdEvent, s);
    }

    public static YuMeAdEvent[] values()
    {
        YuMeAdEvent ayumeadevent[] = a;
        int i = ayumeadevent.length;
        YuMeAdEvent ayumeadevent1[] = new YuMeAdEvent[i];
        System.arraycopy(ayumeadevent, 0, ayumeadevent1, 0, i);
        return ayumeadevent1;
    }

    static 
    {
        NONE = new YuMeAdEvent("NONE", 0);
        AD_READY = new YuMeAdEvent("AD_READY", 1);
        AD_AND_ASSETS_READY = new YuMeAdEvent("AD_AND_ASSETS_READY", 2);
        AD_NOT_READY = new YuMeAdEvent("AD_NOT_READY", 3);
        AD_PRESENT = new YuMeAdEvent("AD_PRESENT", 4);
        AD_ABSENT = new YuMeAdEvent("AD_ABSENT", 5);
        AD_PLAYING = new YuMeAdEvent("AD_PLAYING", 6);
        AD_COMPLETED = new YuMeAdEvent("AD_COMPLETED", 7);
        AD_ERROR = new YuMeAdEvent("AD_ERROR", 8);
        AD_EXPIRED = new YuMeAdEvent("AD_EXPIRED", 9);
        a = (new YuMeAdEvent[] {
            NONE, AD_READY, AD_AND_ASSETS_READY, AD_NOT_READY, AD_PRESENT, AD_ABSENT, AD_PLAYING, AD_COMPLETED, AD_ERROR, AD_EXPIRED
        });
    }
}
