// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.eventbus;


// Referenced classes of package com.snapchat.android.util.eventbus:
//            DrawingEvent

public static final class  extends Enum
{

    private static final STARTED_STROKE $VALUES[];
    public static final STARTED_STROKE COMPLETED_STROKE;
    public static final STARTED_STROKE STARTED_STROKE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/eventbus/DrawingEvent$DrawingEventType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        COMPLETED_STROKE = new <init>("COMPLETED_STROKE", 0);
        STARTED_STROKE = new <init>("STARTED_STROKE", 1);
        $VALUES = (new .VALUES[] {
            COMPLETED_STROKE, STARTED_STROKE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
