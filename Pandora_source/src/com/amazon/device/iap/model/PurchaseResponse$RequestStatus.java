// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.model;

import com.amazon.device.iap.internal.util.d;

// Referenced classes of package com.amazon.device.iap.model:
//            PurchaseResponse

public static final class  extends Enum
{

    private static final NOT_SUPPORTED $VALUES[];
    public static final NOT_SUPPORTED ALREADY_PURCHASED;
    public static final NOT_SUPPORTED FAILED;
    public static final NOT_SUPPORTED INVALID_SKU;
    public static final NOT_SUPPORTED NOT_SUPPORTED;
    public static final NOT_SUPPORTED SUCCESSFUL;

    public static  safeValueOf(String s)
    {
        if (d.a(s))
        {
            return null;
        }
        if ("ALREADY_ENTITLED".equalsIgnoreCase(s))
        {
            return ALREADY_PURCHASED;
        } else
        {
            return valueOf(s.toUpperCase());
        }
    }

    public static valueOf valueOf(String s)
    {
        return (valueOf)Enum.valueOf(com/amazon/device/iap/model/PurchaseResponse$RequestStatus, s);
    }

    public static valueOf[] values()
    {
        return (valueOf[])$VALUES.clone();
    }

    static 
    {
        SUCCESSFUL = new <init>("SUCCESSFUL", 0);
        FAILED = new <init>("FAILED", 1);
        INVALID_SKU = new <init>("INVALID_SKU", 2);
        ALREADY_PURCHASED = new <init>("ALREADY_PURCHASED", 3);
        NOT_SUPPORTED = new <init>("NOT_SUPPORTED", 4);
        $VALUES = (new .VALUES[] {
            SUCCESSFUL, FAILED, INVALID_SKU, ALREADY_PURCHASED, NOT_SUPPORTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
