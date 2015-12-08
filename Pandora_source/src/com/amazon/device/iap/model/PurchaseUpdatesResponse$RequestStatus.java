// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.model;


// Referenced classes of package com.amazon.device.iap.model:
//            PurchaseUpdatesResponse

public static final class  extends Enum
{

    private static final NOT_SUPPORTED $VALUES[];
    public static final NOT_SUPPORTED FAILED;
    public static final NOT_SUPPORTED NOT_SUPPORTED;
    public static final NOT_SUPPORTED SUCCESSFUL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SUCCESSFUL = new <init>("SUCCESSFUL", 0);
        FAILED = new <init>("FAILED", 1);
        NOT_SUPPORTED = new <init>("NOT_SUPPORTED", 2);
        $VALUES = (new .VALUES[] {
            SUCCESSFUL, FAILED, NOT_SUPPORTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
