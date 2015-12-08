// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.chat;


// Referenced classes of package com.snapchat.android.util.chat:
//            SecureChatSession

public static final class  extends Enum
{

    private static final UNKNOWN_FAILURE $VALUES[];
    public static final UNKNOWN_FAILURE SSL_HANDSHAKE_FAILURE;
    public static final UNKNOWN_FAILURE TIMED_OUT;
    public static final UNKNOWN_FAILURE UNKNOWN_FAILURE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/chat/SecureChatSession$ConnectingFailureReason, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TIMED_OUT = new <init>("TIMED_OUT", 0);
        SSL_HANDSHAKE_FAILURE = new <init>("SSL_HANDSHAKE_FAILURE", 1);
        UNKNOWN_FAILURE = new <init>("UNKNOWN_FAILURE", 2);
        $VALUES = (new .VALUES[] {
            TIMED_OUT, SSL_HANDSHAKE_FAILURE, UNKNOWN_FAILURE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
