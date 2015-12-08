// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;


// Referenced classes of package com.snapchat.android.model.chat:
//            CashFeedItem

public static final class I extends Enum
{

    private static final INITIATED $VALUES[];
    public static final INITIATED INITIATED;
    public static final INITIATED INITIATING;
    public static final INITIATED PRE_CONFIRMATION;
    public static final INITIATED PRE_INITIATION;

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/snapchat/android/model/chat/CashFeedItem$BlockerResolutionState, s);
    }

    public static I[] values()
    {
        return (I[])$VALUES.clone();
    }

    static 
    {
        PRE_CONFIRMATION = new <init>("PRE_CONFIRMATION", 0);
        PRE_INITIATION = new <init>("PRE_INITIATION", 1);
        INITIATING = new <init>("INITIATING", 2);
        INITIATED = new <init>("INITIATED", 3);
        $VALUES = (new .VALUES[] {
            PRE_CONFIRMATION, PRE_INITIATION, INITIATING, INITIATED
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
