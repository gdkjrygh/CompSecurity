// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.notification;


// Referenced classes of package com.snapchat.android.notification:
//            AndroidNotificationManager

public static final class  extends Enum
{

    private static final ADD_FRIENDS $VALUES[];
    public static final ADD_FRIENDS ADD_FRIENDS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/notification/AndroidNotificationManager$Destination, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ADD_FRIENDS = new <init>("ADD_FRIENDS");
        $VALUES = (new .VALUES[] {
            ADD_FRIENDS
        });
    }

    private (String s)
    {
        super(s, 0);
    }
}
