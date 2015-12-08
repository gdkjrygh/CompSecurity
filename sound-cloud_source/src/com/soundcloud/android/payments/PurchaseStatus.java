// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;


final class PurchaseStatus extends Enum
{

    private static final PurchaseStatus $VALUES[];
    public static final PurchaseStatus NONE;
    public static final PurchaseStatus PENDING;
    public static final PurchaseStatus SUCCESS;
    public static final PurchaseStatus UPDATE_FAIL;
    public static final PurchaseStatus VERIFY_FAIL;
    public static final PurchaseStatus VERIFY_TIMEOUT;

    private PurchaseStatus(String s, int i)
    {
        super(s, i);
    }

    public static PurchaseStatus valueOf(String s)
    {
        return (PurchaseStatus)Enum.valueOf(com/soundcloud/android/payments/PurchaseStatus, s);
    }

    public static PurchaseStatus[] values()
    {
        return (PurchaseStatus[])$VALUES.clone();
    }

    public final boolean isPending()
    {
        return this == PENDING;
    }

    static 
    {
        PENDING = new PurchaseStatus("PENDING", 0);
        SUCCESS = new PurchaseStatus("SUCCESS", 1);
        UPDATE_FAIL = new PurchaseStatus("UPDATE_FAIL", 2);
        VERIFY_FAIL = new PurchaseStatus("VERIFY_FAIL", 3);
        VERIFY_TIMEOUT = new PurchaseStatus("VERIFY_TIMEOUT", 4);
        NONE = new PurchaseStatus("NONE", 5);
        $VALUES = (new PurchaseStatus[] {
            PENDING, SUCCESS, UPDATE_FAIL, VERIFY_FAIL, VERIFY_TIMEOUT, NONE
        });
    }
}
