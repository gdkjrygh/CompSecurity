// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2;


// Referenced classes of package com.snapchat.android.api2:
//            LogoutTask

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN CHAT_NO_USERNAME;
    public static final UNKNOWN TERMS_OF_USE;
    public static final UNKNOWN UNAUTHORIZED_NETWORK_CALL;
    public static final UNKNOWN UNKNOWN;
    public static final UNKNOWN USER_ACTION;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/api2/LogoutTask$LogoutReason, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        USER_ACTION = new <init>("USER_ACTION", 0);
        TERMS_OF_USE = new <init>("TERMS_OF_USE", 1);
        UNAUTHORIZED_NETWORK_CALL = new <init>("UNAUTHORIZED_NETWORK_CALL", 2);
        CHAT_NO_USERNAME = new <init>("CHAT_NO_USERNAME", 3);
        UNKNOWN = new <init>("UNKNOWN", 4);
        $VALUES = (new .VALUES[] {
            USER_ACTION, TERMS_OF_USE, UNAUTHORIZED_NETWORK_CALL, CHAT_NO_USERNAME, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
