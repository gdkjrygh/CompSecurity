// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;


// Referenced classes of package com.snapchat.android.analytics:
//            AnalyticsEvents

public static final class  extends Enum
{

    private static final DOUBLE_TAP_DISCOVER $VALUES[];
    public static final DOUBLE_TAP_DISCOVER CAMERA;
    public static final DOUBLE_TAP_DISCOVER DOUBLE_TAP_DISCOVER;
    public static final DOUBLE_TAP_DISCOVER DOUBLE_TAP_FEED;
    public static final DOUBLE_TAP_DISCOVER DOUBLE_TAP_FRIENDS;
    public static final DOUBLE_TAP_DISCOVER IN_CHAT;
    public static final DOUBLE_TAP_DISCOVER QUICK_SNAP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/analytics/AnalyticsEvents$AnalyticsSendSnapSource, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CAMERA = new <init>("CAMERA", 0);
        DOUBLE_TAP_FEED = new <init>("DOUBLE_TAP_FEED", 1);
        DOUBLE_TAP_FRIENDS = new <init>("DOUBLE_TAP_FRIENDS", 2);
        IN_CHAT = new <init>("IN_CHAT", 3);
        QUICK_SNAP = new <init>("QUICK_SNAP", 4);
        DOUBLE_TAP_DISCOVER = new <init>("DOUBLE_TAP_DISCOVER", 5);
        $VALUES = (new .VALUES[] {
            CAMERA, DOUBLE_TAP_FEED, DOUBLE_TAP_FRIENDS, IN_CHAT, QUICK_SNAP, DOUBLE_TAP_DISCOVER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
