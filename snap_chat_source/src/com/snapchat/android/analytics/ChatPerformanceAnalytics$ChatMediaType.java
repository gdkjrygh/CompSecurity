// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;


// Referenced classes of package com.snapchat.android.analytics:
//            ChatPerformanceAnalytics

public static final class  extends Enum
{

    private static final STORY_REPLY_VIDEO $VALUES[];
    public static final STORY_REPLY_VIDEO CHAT_MEDIA;
    public static final STORY_REPLY_VIDEO DISCOVER_SHARE_IMAGE;
    public static final STORY_REPLY_VIDEO DISCOVER_SHARE_VIDEO;
    public static final STORY_REPLY_VIDEO MEDIA_CARD;
    public static final STORY_REPLY_VIDEO STORY_REPLY_IMAGE;
    public static final STORY_REPLY_VIDEO STORY_REPLY_VIDEO;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/analytics/ChatPerformanceAnalytics$ChatMediaType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CHAT_MEDIA = new <init>("CHAT_MEDIA", 0);
        MEDIA_CARD = new <init>("MEDIA_CARD", 1);
        DISCOVER_SHARE_IMAGE = new <init>("DISCOVER_SHARE_IMAGE", 2);
        DISCOVER_SHARE_VIDEO = new <init>("DISCOVER_SHARE_VIDEO", 3);
        STORY_REPLY_IMAGE = new <init>("STORY_REPLY_IMAGE", 4);
        STORY_REPLY_VIDEO = new <init>("STORY_REPLY_VIDEO", 5);
        $VALUES = (new .VALUES[] {
            CHAT_MEDIA, MEDIA_CARD, DISCOVER_SHARE_IMAGE, DISCOVER_SHARE_VIDEO, STORY_REPLY_IMAGE, STORY_REPLY_VIDEO
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
