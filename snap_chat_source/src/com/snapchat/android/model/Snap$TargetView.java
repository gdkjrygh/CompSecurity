// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;


// Referenced classes of package com.snapchat.android.model:
//            Snap

public static final class  extends Enum
{

    private static final CHAT_AND_FEED $VALUES[];
    public static final CHAT_AND_FEED CHAT;
    public static final CHAT_AND_FEED CHAT_AND_FEED;
    public static final CHAT_AND_FEED FEED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/model/Snap$TargetView, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CHAT = new <init>("CHAT", 0);
        FEED = new <init>("FEED", 1);
        CHAT_AND_FEED = new <init>("CHAT_AND_FEED", 2);
        $VALUES = (new .VALUES[] {
            CHAT, FEED, CHAT_AND_FEED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
