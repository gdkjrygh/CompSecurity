// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;


// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            FindNearbyFriendsWorker

public static final class  extends Enum
{

    private static final NO_INTERNET_CONNECTION $VALUES[];
    public static final NO_INTERNET_CONNECTION ERROR;
    public static final NO_INTERNET_CONNECTION INITIAL_PROMPT;
    public static final NO_INTERNET_CONNECTION INTENTIONAL;
    public static final NO_INTERNET_CONNECTION LOCATION_ERROR;
    public static final NO_INTERNET_CONNECTION LOCATION_PERMISSIONS;
    public static final NO_INTERNET_CONNECTION NO_INTERNET_CONNECTION;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/fragments/addfriends/FindNearbyFriendsWorker$InterruptReason, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LOCATION_PERMISSIONS = new <init>("LOCATION_PERMISSIONS", 0);
        INITIAL_PROMPT = new <init>("INITIAL_PROMPT", 1);
        LOCATION_ERROR = new <init>("LOCATION_ERROR", 2);
        ERROR = new <init>("ERROR", 3);
        INTENTIONAL = new <init>("INTENTIONAL", 4);
        NO_INTERNET_CONNECTION = new <init>("NO_INTERNET_CONNECTION", 5);
        $VALUES = (new .VALUES[] {
            LOCATION_PERMISSIONS, INITIAL_PROMPT, LOCATION_ERROR, ERROR, INTENTIONAL, NO_INTERNET_CONNECTION
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
