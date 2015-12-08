// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            Log

public static final class  extends Enum
{

    private static final NODEBUG $VALUES[];
    public static final NODEBUG DEBUG;
    public static final NODEBUG NODEBUG;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/amobee/pulse3d/Log$DebugLevel, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DEBUG = new <init>("DEBUG", 0);
        NODEBUG = new <init>("NODEBUG", 1);
        $VALUES = (new .VALUES[] {
            DEBUG, NODEBUG
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
