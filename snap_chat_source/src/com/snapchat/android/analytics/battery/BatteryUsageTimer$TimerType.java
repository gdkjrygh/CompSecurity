// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.battery;


// Referenced classes of package com.snapchat.android.analytics.battery:
//            BatteryUsageTimer

public static final class b extends Enum
{

    private static final ON_WWAN $VALUES[];
    public static final ON_WWAN CAMERA_PAGE;
    public static final ON_WWAN CAMERA_RUNNING;
    public static final ON_WWAN CHAT_PAGE;
    public static final ON_WWAN DISCOVER_PAGE;
    public static final ON_WWAN FEED_PAGE;
    public static final ON_WWAN FRIENDS_PAGE;
    public static final ON_WWAN ON_WIFI;
    public static final ON_WWAN ON_WWAN;
    public static final ON_WWAN STORIES_PAGE;
    public static final ON_WWAN UNKNOWN;
    private final String a;
    private final boolean b;

    public static b fromPagerId(int i)
    {
        switch (i)
        {
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        default:
            return UNKNOWN;

        case 2: // '\002'
            return CAMERA_PAGE;

        case 0: // '\0'
            return CHAT_PAGE;

        case 4: // '\004'
            return DISCOVER_PAGE;

        case 1: // '\001'
            return FEED_PAGE;

        case 11: // '\013'
            return FRIENDS_PAGE;

        case 3: // '\003'
            return STORIES_PAGE;
        }
    }

    public static STORIES_PAGE valueOf(String s)
    {
        return (STORIES_PAGE)Enum.valueOf(com/snapchat/android/analytics/battery/BatteryUsageTimer$TimerType, s);
    }

    public static STORIES_PAGE[] values()
    {
        return (STORIES_PAGE[])$VALUES.clone();
    }

    public final boolean isPage()
    {
        return b;
    }

    public final String toString()
    {
        if (a == null)
        {
            return "null";
        } else
        {
            return a;
        }
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0, "UNKNOWN", true);
        CAMERA_RUNNING = new <init>("CAMERA_RUNNING", 1, "CAMERA_RUNNING", false);
        CAMERA_PAGE = new <init>("CAMERA_PAGE", 2, "CAMERA_PAGE", true);
        STORIES_PAGE = new <init>("STORIES_PAGE", 3, "STORIES_PAGE", true);
        DISCOVER_PAGE = new <init>("DISCOVER_PAGE", 4, "DISCOVER_PAGE", true);
        CHAT_PAGE = new <init>("CHAT_PAGE", 5, "CHAT_PAGE", true);
        FRIENDS_PAGE = new <init>("FRIENDS_PAGE", 6, "FRIENDS_PAGE", true);
        FEED_PAGE = new <init>("FEED_PAGE", 7, "FEED_PAGE", true);
        ON_WIFI = new <init>("ON_WIFI", 8, "ON_WIFI", false);
        ON_WWAN = new <init>("ON_WWAN", 9, "ON_WWAN", false);
        $VALUES = (new .VALUES[] {
            UNKNOWN, CAMERA_RUNNING, CAMERA_PAGE, STORIES_PAGE, DISCOVER_PAGE, CHAT_PAGE, FRIENDS_PAGE, FEED_PAGE, ON_WIFI, ON_WWAN
        });
    }

    private (String s, int i, String s1, boolean flag)
    {
        super(s, i);
        a = s1;
        b = flag;
    }
}
