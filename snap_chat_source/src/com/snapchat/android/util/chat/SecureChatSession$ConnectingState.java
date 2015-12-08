// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.chat;


// Referenced classes of package com.snapchat.android.util.chat:
//            SecureChatSession

public static final class  extends Enum
{

    private static final AUTH $VALUES[];
    public static final AUTH AUTH;
    public static final AUTH SOCKET;
    public static final AUTH SSL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/chat/SecureChatSession$ConnectingState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SOCKET = new <init>("SOCKET", 0);
        SSL = new <init>("SSL", 1);
        AUTH = new <init>("AUTH", 2);
        $VALUES = (new .VALUES[] {
            SOCKET, SSL, AUTH
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
