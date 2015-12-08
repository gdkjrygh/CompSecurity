// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.eventbus;


// Referenced classes of package com.snapchat.android.util.eventbus:
//            LoadSnapMediaEvent

public static final class  extends Enum
{

    private static final ENDED $VALUES[];
    public static final ENDED ENDED;
    public static final ENDED INITIATED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/eventbus/LoadSnapMediaEvent$LoadSnapMediaEventType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        INITIATED = new <init>("INITIATED", 0);
        ENDED = new <init>("ENDED", 1);
        $VALUES = (new .VALUES[] {
            INITIATED, ENDED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
