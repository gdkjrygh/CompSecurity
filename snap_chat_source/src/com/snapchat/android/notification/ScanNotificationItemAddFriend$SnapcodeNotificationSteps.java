// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.notification;


// Referenced classes of package com.snapchat.android.notification:
//            ScanNotificationItemAddFriend

public static final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR COMPLETE;
    public static final ERROR EDITING_FRIENDS;
    public static final ERROR ERROR;
    public static final ERROR SHOW_PROFILE_INFO;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/notification/ScanNotificationItemAddFriend$SnapcodeNotificationSteps, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SHOW_PROFILE_INFO = new <init>("SHOW_PROFILE_INFO", 0);
        EDITING_FRIENDS = new <init>("EDITING_FRIENDS", 1);
        COMPLETE = new <init>("COMPLETE", 2);
        ERROR = new <init>("ERROR", 3);
        $VALUES = (new .VALUES[] {
            SHOW_PROFILE_INFO, EDITING_FRIENDS, COMPLETE, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
