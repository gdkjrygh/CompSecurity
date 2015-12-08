// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;


// Referenced classes of package com.snapchat.android:
//            Timber

public static final class  extends Enum
{

    private static final LOOKSERY $VALUES[];
    public static final LOOKSERY BITMAP_POOL_MONITOR;
    public static final LOOKSERY CHAT;
    public static final LOOKSERY DEBUG;
    public static final LOOKSERY DOWNLOAD_PROGRESS;
    public static final LOOKSERY ERROR_WITHOUT_TRACE;
    public static final LOOKSERY ERROR_WITH_TRACE;
    public static final LOOKSERY INFO;
    public static final LOOKSERY LOCATION_MANAGER;
    public static final LOOKSERY LOOKSERY;
    public static final LOOKSERY VERBOSE;
    public static final LOOKSERY WARNING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/Timber$LogType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        VERBOSE = new <init>("VERBOSE", 0);
        INFO = new <init>("INFO", 1);
        DEBUG = new <init>("DEBUG", 2);
        WARNING = new <init>("WARNING", 3);
        ERROR_WITHOUT_TRACE = new <init>("ERROR_WITHOUT_TRACE", 4);
        ERROR_WITH_TRACE = new <init>("ERROR_WITH_TRACE", 5);
        CHAT = new <init>("CHAT", 6);
        LOCATION_MANAGER = new <init>("LOCATION_MANAGER", 7);
        BITMAP_POOL_MONITOR = new <init>("BITMAP_POOL_MONITOR", 8);
        DOWNLOAD_PROGRESS = new <init>("DOWNLOAD_PROGRESS", 9);
        LOOKSERY = new <init>("LOOKSERY", 10);
        $VALUES = (new .VALUES[] {
            VERBOSE, INFO, DEBUG, WARNING, ERROR_WITHOUT_TRACE, ERROR_WITH_TRACE, CHAT, LOCATION_MANAGER, BITMAP_POOL_MONITOR, DOWNLOAD_PROGRESS, 
            LOOKSERY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
