// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;


// Referenced classes of package com.soundcloud.android.stream:
//            StreamItem

public static final class  extends Enum
{

    private static final NOTIFICATION $VALUES[];
    public static final NOTIFICATION NOTIFICATION;
    public static final NOTIFICATION PLAYABLE;
    public static final NOTIFICATION PROMOTED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/stream/StreamItem$Kind, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PLAYABLE = new <init>("PLAYABLE", 0);
        PROMOTED = new <init>("PROMOTED", 1);
        NOTIFICATION = new <init>("NOTIFICATION", 2);
        $VALUES = (new .VALUES[] {
            PLAYABLE, PROMOTED, NOTIFICATION
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
