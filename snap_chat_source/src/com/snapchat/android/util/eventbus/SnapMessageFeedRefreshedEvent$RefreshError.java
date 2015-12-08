// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.eventbus;


// Referenced classes of package com.snapchat.android.util.eventbus:
//            SnapMessageFeedRefreshedEvent

public static final class  extends Enum
{

    private static final SERVER_FAILURE $VALUES[];
    public static final SERVER_FAILURE AUTHENTICATION_ERROR;
    public static final SERVER_FAILURE EXTERNAL_STORAGE_UNAVAILABLE;
    public static final SERVER_FAILURE FAIL_TO_UPDATE;
    public static final SERVER_FAILURE HAS_INTERNET_BUT_CONNECTION_FAIL;
    public static final SERVER_FAILURE NONE;
    public static final SERVER_FAILURE NO_INTERNET_CONNECTION;
    public static final SERVER_FAILURE SERVER_FAILURE;
    public static final SERVER_FAILURE UNAUTHORIZED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/eventbus/SnapMessageFeedRefreshedEvent$RefreshError, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        EXTERNAL_STORAGE_UNAVAILABLE = new <init>("EXTERNAL_STORAGE_UNAVAILABLE", 1);
        FAIL_TO_UPDATE = new <init>("FAIL_TO_UPDATE", 2);
        AUTHENTICATION_ERROR = new <init>("AUTHENTICATION_ERROR", 3);
        NO_INTERNET_CONNECTION = new <init>("NO_INTERNET_CONNECTION", 4);
        HAS_INTERNET_BUT_CONNECTION_FAIL = new <init>("HAS_INTERNET_BUT_CONNECTION_FAIL", 5);
        UNAUTHORIZED = new <init>("UNAUTHORIZED", 6);
        SERVER_FAILURE = new <init>("SERVER_FAILURE", 7);
        $VALUES = (new .VALUES[] {
            NONE, EXTERNAL_STORAGE_UNAVAILABLE, FAIL_TO_UPDATE, AUTHENTICATION_ERROR, NO_INTERNET_CONNECTION, HAS_INTERNET_BUT_CONNECTION_FAIL, UNAUTHORIZED, SERVER_FAILURE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
