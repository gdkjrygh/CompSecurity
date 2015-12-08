// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


public final class YuMePlaybackStatus extends Enum
{

    public static final YuMePlaybackStatus COMPLETED;
    public static final YuMePlaybackStatus FAILED;
    public static final YuMePlaybackStatus INTERRUPTED;
    public static final YuMePlaybackStatus NONE;
    public static final YuMePlaybackStatus TIMED_OUT;
    private static final YuMePlaybackStatus a[];

    private YuMePlaybackStatus(String s, int i)
    {
        super(s, i);
    }

    public static YuMePlaybackStatus valueOf(String s)
    {
        return (YuMePlaybackStatus)Enum.valueOf(com/yume/android/sdk/YuMePlaybackStatus, s);
    }

    public static YuMePlaybackStatus[] values()
    {
        YuMePlaybackStatus ayumeplaybackstatus[] = a;
        int i = ayumeplaybackstatus.length;
        YuMePlaybackStatus ayumeplaybackstatus1[] = new YuMePlaybackStatus[i];
        System.arraycopy(ayumeplaybackstatus, 0, ayumeplaybackstatus1, 0, i);
        return ayumeplaybackstatus1;
    }

    static 
    {
        NONE = new YuMePlaybackStatus("NONE", 0);
        FAILED = new YuMePlaybackStatus("FAILED", 1);
        TIMED_OUT = new YuMePlaybackStatus("TIMED_OUT", 2);
        INTERRUPTED = new YuMePlaybackStatus("INTERRUPTED", 3);
        COMPLETED = new YuMePlaybackStatus("COMPLETED", 4);
        a = (new YuMePlaybackStatus[] {
            NONE, FAILED, TIMED_OUT, INTERRUPTED, COMPLETED
        });
    }
}
