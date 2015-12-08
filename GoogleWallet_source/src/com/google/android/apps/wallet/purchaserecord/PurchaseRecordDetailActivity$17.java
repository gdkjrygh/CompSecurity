// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;


// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordDetailActivity

static final class rdEventType
{

    static final int $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[];

    static 
    {
        $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType = new int[rdEventType.values().length];
        try
        {
            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[rdEventType.LOADED_PAGE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[rdEventType.FETCH_FIRST_PAGE_ERROR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[rdEventType.FETCHING_ADDITIONAL_PAGE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[rdEventType.FETCHING_FIRST_PAGE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[rdEventType.FETCH_ADDITIONAL_PAGE_ERROR.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[rdEventType.FETCHING_PURCHASE_RECORD.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[rdEventType.FETCH_PURCHASE_RECORD_NOT_FOUND.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[rdEventType.FETCH_PURCHASE_RECORD_FAIL.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[rdEventType.FETCH_PURCHASE_RECORD_SUCCESS.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
