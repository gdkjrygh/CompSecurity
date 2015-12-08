// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2.chat;


// Referenced classes of package com.snapchat.android.api2.chat:
//            LoadConversationPageTask

public static final class  extends Enum
{

    private static final COMPLETION $VALUES[];
    public static final COMPLETION COMPLETION;
    public static final COMPLETION FAILED;
    public static final COMPLETION RUNNING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/api2/chat/LoadConversationPageTask$TaskStatus, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        RUNNING = new <init>("RUNNING", 0);
        FAILED = new <init>("FAILED", 1);
        COMPLETION = new <init>("COMPLETION", 2);
        $VALUES = (new .VALUES[] {
            RUNNING, FAILED, COMPLETION
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
