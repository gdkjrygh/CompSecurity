// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;


// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordDetailFragment

static final class ordEventType
{

    static final int $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[];

    static 
    {
        $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType = new int[ordEventType.values().length];
        try
        {
            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[ordEventType.FETCH_PURCHASE_RECORD_FAIL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[ordEventType.FETCH_PURCHASE_RECORD_SUCCESS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
