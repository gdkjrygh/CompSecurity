// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.networkmanager;


public final class DownloadPriority extends Enum
{

    private static final DownloadPriority $VALUES[];
    public static final DownloadPriority BACKGROUND_HIGH;
    public static final DownloadPriority BACKGROUND_HIGHEST;
    public static final DownloadPriority BACKGROUND_LOW;
    public static final DownloadPriority BACKGROUND_LOWEST;
    public static final DownloadPriority BACKGROUND_MEDIUM;
    public static final DownloadPriority HIGH;
    public static final DownloadPriority LOW;
    public static final DownloadPriority MEDIUM;
    public static final DownloadPriority MEDIUM_HIGH;

    private DownloadPriority(String s, int i)
    {
        super(s, i);
    }

    public static DownloadPriority valueOf(String s)
    {
        return (DownloadPriority)Enum.valueOf(com/snapchat/android/networkmanager/DownloadPriority, s);
    }

    public static DownloadPriority[] values()
    {
        return (DownloadPriority[])$VALUES.clone();
    }

    public final boolean isBackground()
    {
        return compareTo(LOW) < 0;
    }

    static 
    {
        BACKGROUND_LOWEST = new DownloadPriority("BACKGROUND_LOWEST", 0);
        BACKGROUND_LOW = new DownloadPriority("BACKGROUND_LOW", 1);
        BACKGROUND_MEDIUM = new DownloadPriority("BACKGROUND_MEDIUM", 2);
        BACKGROUND_HIGH = new DownloadPriority("BACKGROUND_HIGH", 3);
        BACKGROUND_HIGHEST = new DownloadPriority("BACKGROUND_HIGHEST", 4);
        LOW = new DownloadPriority("LOW", 5);
        MEDIUM = new DownloadPriority("MEDIUM", 6);
        MEDIUM_HIGH = new DownloadPriority("MEDIUM_HIGH", 7);
        HIGH = new DownloadPriority("HIGH", 8);
        $VALUES = (new DownloadPriority[] {
            BACKGROUND_LOWEST, BACKGROUND_LOW, BACKGROUND_MEDIUM, BACKGROUND_HIGH, BACKGROUND_HIGHEST, LOW, MEDIUM, MEDIUM_HIGH, HIGH
        });
    }
}
