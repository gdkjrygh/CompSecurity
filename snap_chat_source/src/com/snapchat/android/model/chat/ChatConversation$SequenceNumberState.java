// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;


// Referenced classes of package com.snapchat.android.model.chat:
//            ChatConversation

public static final class  extends Enum
{

    private static final UPDATED $VALUES[];
    public static final UPDATED NOT_UPDATED;
    public static final UPDATED UPDATED;
    public static final UPDATED UPDATING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/model/chat/ChatConversation$SequenceNumberState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NOT_UPDATED = new <init>("NOT_UPDATED", 0);
        UPDATING = new <init>("UPDATING", 1);
        UPDATED = new <init>("UPDATED", 2);
        $VALUES = (new .VALUES[] {
            NOT_UPDATED, UPDATING, UPDATED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
