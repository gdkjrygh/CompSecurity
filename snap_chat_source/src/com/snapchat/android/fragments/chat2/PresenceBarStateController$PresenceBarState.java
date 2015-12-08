// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat2;


// Referenced classes of package com.snapchat.android.fragments.chat2:
//            PresenceBarStateController

public static final class  extends Enum
{

    private static final VIDEO $VALUES[];
    public static final VIDEO LISTENING;
    public static final VIDEO NOTHING;
    public static final VIDEO PRESENT;
    public static final VIDEO RINGING;
    public static final VIDEO SOMETHING;
    public static final VIDEO TALKING;
    public static final VIDEO VIDEO;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/fragments/chat2/PresenceBarStateController$PresenceBarState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NOTHING = new <init>("NOTHING", 0);
        PRESENT = new <init>("PRESENT", 1);
        SOMETHING = new <init>("SOMETHING", 2);
        RINGING = new <init>("RINGING", 3);
        LISTENING = new <init>("LISTENING", 4);
        TALKING = new <init>("TALKING", 5);
        VIDEO = new <init>("VIDEO", 6);
        $VALUES = (new .VALUES[] {
            NOTHING, PRESENT, SOMETHING, RINGING, LISTENING, TALKING, VIDEO
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
