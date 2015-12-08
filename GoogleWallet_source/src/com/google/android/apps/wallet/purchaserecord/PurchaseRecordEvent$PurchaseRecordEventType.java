// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;


// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordEvent

public static final class  extends Enum
{

    private static final FETCH_PURCHASE_RECORD_NOT_FOUND $VALUES[];
    public static final FETCH_PURCHASE_RECORD_NOT_FOUND FETCHING_ADDITIONAL_PAGE;
    public static final FETCH_PURCHASE_RECORD_NOT_FOUND FETCHING_FIRST_PAGE;
    public static final FETCH_PURCHASE_RECORD_NOT_FOUND FETCHING_PURCHASE_RECORD;
    public static final FETCH_PURCHASE_RECORD_NOT_FOUND FETCH_ADDITIONAL_PAGE_ERROR;
    public static final FETCH_PURCHASE_RECORD_NOT_FOUND FETCH_FIRST_PAGE_ERROR;
    public static final FETCH_PURCHASE_RECORD_NOT_FOUND FETCH_PURCHASE_RECORD_FAIL;
    public static final FETCH_PURCHASE_RECORD_NOT_FOUND FETCH_PURCHASE_RECORD_NOT_FOUND;
    public static final FETCH_PURCHASE_RECORD_NOT_FOUND FETCH_PURCHASE_RECORD_SUCCESS;
    public static final FETCH_PURCHASE_RECORD_NOT_FOUND LOADED_PAGE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/purchaserecord/PurchaseRecordEvent$PurchaseRecordEventType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FETCHING_FIRST_PAGE = new <init>("FETCHING_FIRST_PAGE", 0);
        FETCH_FIRST_PAGE_ERROR = new <init>("FETCH_FIRST_PAGE_ERROR", 1);
        FETCHING_ADDITIONAL_PAGE = new <init>("FETCHING_ADDITIONAL_PAGE", 2);
        FETCH_ADDITIONAL_PAGE_ERROR = new <init>("FETCH_ADDITIONAL_PAGE_ERROR", 3);
        LOADED_PAGE = new <init>("LOADED_PAGE", 4);
        FETCHING_PURCHASE_RECORD = new <init>("FETCHING_PURCHASE_RECORD", 5);
        FETCH_PURCHASE_RECORD_FAIL = new <init>("FETCH_PURCHASE_RECORD_FAIL", 6);
        FETCH_PURCHASE_RECORD_SUCCESS = new <init>("FETCH_PURCHASE_RECORD_SUCCESS", 7);
        FETCH_PURCHASE_RECORD_NOT_FOUND = new <init>("FETCH_PURCHASE_RECORD_NOT_FOUND", 8);
        $VALUES = (new .VALUES[] {
            FETCHING_FIRST_PAGE, FETCH_FIRST_PAGE_ERROR, FETCHING_ADDITIONAL_PAGE, FETCH_ADDITIONAL_PAGE_ERROR, LOADED_PAGE, FETCHING_PURCHASE_RECORD, FETCH_PURCHASE_RECORD_FAIL, FETCH_PURCHASE_RECORD_SUCCESS, FETCH_PURCHASE_RECORD_NOT_FOUND
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
