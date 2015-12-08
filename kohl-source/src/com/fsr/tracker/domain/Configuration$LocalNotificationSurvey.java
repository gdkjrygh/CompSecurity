// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.domain;


// Referenced classes of package com.fsr.tracker.domain:
//            Configuration

public static final class  extends Enum
{

    private static final IN_BROWSER $VALUES[];
    public static final IN_BROWSER IN_APP;
    public static final IN_BROWSER IN_BROWSER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fsr/tracker/domain/Configuration$LocalNotificationSurvey, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        IN_APP = new <init>("IN_APP", 0);
        IN_BROWSER = new <init>("IN_BROWSER", 1);
        $VALUES = (new .VALUES[] {
            IN_APP, IN_BROWSER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
