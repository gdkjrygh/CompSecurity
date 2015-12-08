// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;


// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedAdapter

public static final class  extends Enum
{

    private static final ADD_CONTACTS_FOOTER $VALUES[];
    public static final ADD_CONTACTS_FOOTER ADD_CONTACTS_FOOTER;
    public static final ADD_CONTACTS_FOOTER CONVERSATION;
    public static final ADD_CONTACTS_FOOTER LOADING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/app/feature/messaging/feed/ui/fragment/FeedAdapter$FeedViewType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CONVERSATION = new <init>("CONVERSATION", 0);
        LOADING = new <init>("LOADING", 1);
        ADD_CONTACTS_FOOTER = new <init>("ADD_CONTACTS_FOOTER", 2);
        $VALUES = (new .VALUES[] {
            CONVERSATION, LOADING, ADD_CONTACTS_FOOTER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
