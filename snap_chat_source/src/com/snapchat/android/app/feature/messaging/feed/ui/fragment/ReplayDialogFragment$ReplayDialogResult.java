// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;


// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            ReplayDialogFragment

public static final class i extends Enum
{

    private static final CREDIT_REPLAY $VALUES[];
    public static final CREDIT_REPLAY CANCEL;
    public static final CREDIT_REPLAY CREDIT_REPLAY;
    public static final CREDIT_REPLAY FREE_REPLAY;
    public static final CREDIT_REPLAY PAID_REPLAY;

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/snapchat/android/app/feature/messaging/feed/ui/fragment/ReplayDialogFragment$ReplayDialogResult, s);
    }

    public static i[] values()
    {
        return (i[])$VALUES.clone();
    }

    static 
    {
        CANCEL = new <init>("CANCEL", 0);
        FREE_REPLAY = new <init>("FREE_REPLAY", 1);
        PAID_REPLAY = new <init>("PAID_REPLAY", 2);
        CREDIT_REPLAY = new <init>("CREDIT_REPLAY", 3);
        $VALUES = (new .VALUES[] {
            CANCEL, FREE_REPLAY, PAID_REPLAY, CREDIT_REPLAY
        });
    }

    private i(String s, int i)
    {
        super(s, i);
    }
}
