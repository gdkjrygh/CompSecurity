// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;


// Referenced classes of package com.amazon.device.associates:
//            ReceiptsResponse

public static final class  extends Enum
{

    public static final NOT_SUPPORTED FAILED;
    public static final NOT_SUPPORTED NOT_SUPPORTED;
    public static final NOT_SUPPORTED NO_MORE_DATA;
    public static final NOT_SUPPORTED SUCCESSFUL;
    private static final NOT_SUPPORTED a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/amazon/device/associates/ReceiptsResponse$Status, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        SUCCESSFUL = new <init>("SUCCESSFUL", 0);
        FAILED = new <init>("FAILED", 1);
        NO_MORE_DATA = new <init>("NO_MORE_DATA", 2);
        NOT_SUPPORTED = new <init>("NOT_SUPPORTED", 3);
        a = (new a[] {
            SUCCESSFUL, FAILED, NO_MORE_DATA, NOT_SUPPORTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
