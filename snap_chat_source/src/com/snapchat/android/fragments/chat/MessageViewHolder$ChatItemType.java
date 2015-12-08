// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;


// Referenced classes of package com.snapchat.android.fragments.chat:
//            MessageViewHolder

public static final class  extends Enum
{

    private static final STORY_REPLY $VALUES[];
    public static final STORY_REPLY CASH;
    public static final STORY_REPLY CHAT_FOOTER;
    public static final STORY_REPLY CHAT_LOADING_HEADER;
    public static final STORY_REPLY CHAT_MEDIA;
    public static final STORY_REPLY CHAT_SCREENSHOT;
    public static final STORY_REPLY CHAT_STICKER;
    public static final STORY_REPLY CHAT_TEXT;
    public static final STORY_REPLY CHAT_UNKNOWN;
    public static final STORY_REPLY DATE_HEADER;
    public static final STORY_REPLY HEADER;
    public static final STORY_REPLY SHARED_DSNAP;
    public static final STORY_REPLY SNAP;
    public static final STORY_REPLY STORY_REPLY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/fragments/chat/MessageViewHolder$ChatItemType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CHAT_TEXT = new <init>("CHAT_TEXT", 0);
        DATE_HEADER = new <init>("DATE_HEADER", 1);
        HEADER = new <init>("HEADER", 2);
        SNAP = new <init>("SNAP", 3);
        CHAT_MEDIA = new <init>("CHAT_MEDIA", 4);
        CHAT_SCREENSHOT = new <init>("CHAT_SCREENSHOT", 5);
        CHAT_UNKNOWN = new <init>("CHAT_UNKNOWN", 6);
        CASH = new <init>("CASH", 7);
        SHARED_DSNAP = new <init>("SHARED_DSNAP", 8);
        CHAT_FOOTER = new <init>("CHAT_FOOTER", 9);
        CHAT_LOADING_HEADER = new <init>("CHAT_LOADING_HEADER", 10);
        CHAT_STICKER = new <init>("CHAT_STICKER", 11);
        STORY_REPLY = new <init>("STORY_REPLY", 12);
        $VALUES = (new .VALUES[] {
            CHAT_TEXT, DATE_HEADER, HEADER, SNAP, CHAT_MEDIA, CHAT_SCREENSHOT, CHAT_UNKNOWN, CASH, SHARED_DSNAP, CHAT_FOOTER, 
            CHAT_LOADING_HEADER, CHAT_STICKER, STORY_REPLY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
