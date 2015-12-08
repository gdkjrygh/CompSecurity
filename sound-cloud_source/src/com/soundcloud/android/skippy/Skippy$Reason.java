// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;


// Referenced classes of package com.soundcloud.android.skippy:
//            Skippy

public static final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR BUFFERING;
    public static final ERROR COMPLETE;
    public static final ERROR ERROR;
    public static final ERROR NOTHING;
    public static final ERROR PAUSED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/skippy/Skippy$Reason, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NOTHING = new <init>("NOTHING", 0);
        PAUSED = new <init>("PAUSED", 1);
        BUFFERING = new <init>("BUFFERING", 2);
        COMPLETE = new <init>("COMPLETE", 3);
        ERROR = new <init>("ERROR", 4);
        $VALUES = (new .VALUES[] {
            NOTHING, PAUSED, BUFFERING, COMPLETE, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
