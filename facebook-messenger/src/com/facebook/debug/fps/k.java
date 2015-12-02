// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.fps;


public final class k extends Enum
{

    private static final k $VALUES[];
    public static final k ENABLE;
    public static final k ENABLE_FLUSH_DATA_ON_PAUSE;
    public static final k ENABLE_FRAME_COUNTER;
    public static final k ENABLE_OUTPUT_TO_LOGCAT;
    public static final k ENABLE_RECORD_DATA;

    private k(String s, int i)
    {
        super(s, i);
    }

    public static k valueOf(String s)
    {
        return (k)Enum.valueOf(com/facebook/debug/fps/k, s);
    }

    public static k[] values()
    {
        return (k[])$VALUES.clone();
    }

    static 
    {
        ENABLE = new k("ENABLE", 0);
        ENABLE_RECORD_DATA = new k("ENABLE_RECORD_DATA", 1);
        ENABLE_OUTPUT_TO_LOGCAT = new k("ENABLE_OUTPUT_TO_LOGCAT", 2);
        ENABLE_FRAME_COUNTER = new k("ENABLE_FRAME_COUNTER", 3);
        ENABLE_FLUSH_DATA_ON_PAUSE = new k("ENABLE_FLUSH_DATA_ON_PAUSE", 4);
        $VALUES = (new k[] {
            ENABLE, ENABLE_RECORD_DATA, ENABLE_OUTPUT_TO_LOGCAT, ENABLE_FRAME_COUNTER, ENABLE_FLUSH_DATA_ON_PAUSE
        });
    }
}
