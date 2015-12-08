// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.assist;


// Referenced classes of package com.nostra13.universalimageloader.core.assist:
//            FailReason

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN DECODING_ERROR;
    public static final UNKNOWN IO_ERROR;
    public static final UNKNOWN NETWORK_DENIED;
    public static final UNKNOWN OUT_OF_MEMORY;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/nostra13/universalimageloader/core/assist/FailReason$FailType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        IO_ERROR = new <init>("IO_ERROR", 0);
        DECODING_ERROR = new <init>("DECODING_ERROR", 1);
        NETWORK_DENIED = new <init>("NETWORK_DENIED", 2);
        OUT_OF_MEMORY = new <init>("OUT_OF_MEMORY", 3);
        UNKNOWN = new <init>("UNKNOWN", 4);
        $VALUES = (new .VALUES[] {
            IO_ERROR, DECODING_ERROR, NETWORK_DENIED, OUT_OF_MEMORY, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
