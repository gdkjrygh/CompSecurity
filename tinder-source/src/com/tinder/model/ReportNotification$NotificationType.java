// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;


// Referenced classes of package com.tinder.model:
//            ReportNotification

public static final class  extends Enum
{

    private static final BANNED $VALUES[];
    public static final BANNED BANNED;
    public static final BANNED WARNING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/tinder/model/ReportNotification$NotificationType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        WARNING = new <init>("WARNING", 0);
        BANNED = new <init>("BANNED", 1);
        $VALUES = (new .VALUES[] {
            WARNING, BANNED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
