// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;


// Referenced classes of package com.snapchat.android.model.chat:
//            ChatFeedItem

public static final class  extends Enum
{

    private static final CURRENTLY_TICKING $VALUES[];
    public static final CURRENTLY_TICKING CURRENTLY_TICKING;
    public static final CURRENTLY_TICKING FAILED;
    public static final CURRENTLY_TICKING IN_APP_PURCHASE_PROCESSING;
    public static final CURRENTLY_TICKING MOST_RECENT;
    public static final CURRENTLY_TICKING NEW;
    public static final CURRENTLY_TICKING RECENTLY_OPENED_LAST_SNAP;
    public static final CURRENTLY_TICKING RECENTLY_SENT;
    public static final CURRENTLY_TICKING SENDING;
    public static final CURRENTLY_TICKING UNOPENED_SNAP_AVAILABLE_NEXT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/model/chat/ChatFeedItem$FeedIconPriority, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MOST_RECENT = new <init>("MOST_RECENT", 0);
        NEW = new <init>("NEW", 1);
        RECENTLY_SENT = new <init>("RECENTLY_SENT", 2);
        FAILED = new <init>("FAILED", 3);
        SENDING = new <init>("SENDING", 4);
        RECENTLY_OPENED_LAST_SNAP = new <init>("RECENTLY_OPENED_LAST_SNAP", 5);
        UNOPENED_SNAP_AVAILABLE_NEXT = new <init>("UNOPENED_SNAP_AVAILABLE_NEXT", 6);
        IN_APP_PURCHASE_PROCESSING = new <init>("IN_APP_PURCHASE_PROCESSING", 7);
        CURRENTLY_TICKING = new <init>("CURRENTLY_TICKING", 8);
        $VALUES = (new .VALUES[] {
            MOST_RECENT, NEW, RECENTLY_SENT, FAILED, SENDING, RECENTLY_OPENED_LAST_SNAP, UNOPENED_SNAP_AVAILABLE_NEXT, IN_APP_PURCHASE_PROCESSING, CURRENTLY_TICKING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
