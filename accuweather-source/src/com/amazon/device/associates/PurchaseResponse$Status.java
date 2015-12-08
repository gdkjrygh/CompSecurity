// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;


// Referenced classes of package com.amazon.device.associates:
//            PurchaseResponse

public static final class  extends Enum
{

    public static final NOT_SUPPORTED FAILED;
    public static final NOT_SUPPORTED INVALID_ID;
    public static final NOT_SUPPORTED NOT_SUPPORTED;
    public static final NOT_SUPPORTED PENDING;
    public static final NOT_SUPPORTED SUCCESSFUL;
    private static final NOT_SUPPORTED a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/amazon/device/associates/PurchaseResponse$Status, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        SUCCESSFUL = new <init>("SUCCESSFUL", 0);
        FAILED = new <init>("FAILED", 1);
        PENDING = new <init>("PENDING", 2);
        INVALID_ID = new <init>("INVALID_ID", 3);
        NOT_SUPPORTED = new <init>("NOT_SUPPORTED", 4);
        a = (new a[] {
            SUCCESSFUL, FAILED, PENDING, INVALID_ID, NOT_SUPPORTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
