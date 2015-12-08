// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.livechat;


// Referenced classes of package com.snapchat.android.livechat:
//            AdlHelper

public static final class  extends Enum
{

    private static final CHAT_GATEWAY $VALUES[];
    public static final CHAT_GATEWAY ADDLIVE;
    public static final CHAT_GATEWAY CHAT_GATEWAY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/livechat/AdlHelper$PresenceSource, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ADDLIVE = new <init>("ADDLIVE", 0);
        CHAT_GATEWAY = new <init>("CHAT_GATEWAY", 1);
        $VALUES = (new .VALUES[] {
            ADDLIVE, CHAT_GATEWAY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
