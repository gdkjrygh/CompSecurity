// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.notification;


// Referenced classes of package com.snapchat.android.notification:
//            ScanNotificationItem

public static final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR ERROR;
    public static final ERROR SHOW_DATA;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/notification/ScanNotificationItem$CodeNotificationSteps, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SHOW_DATA = new <init>("SHOW_DATA", 0);
        ERROR = new <init>("ERROR", 1);
        $VALUES = (new .VALUES[] {
            SHOW_DATA, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
