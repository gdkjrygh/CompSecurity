// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;


// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordDetailFragment, PurchaseRecord

static interface a
{

    public abstract void onCancelMoneyRequest(PurchaseRecord purchaserecord);

    public abstract void onDeclineMoneyRequest(PurchaseRecord purchaserecord);

    public abstract void onReturnMoneyClicked(PurchaseRecord purchaserecord);

    public abstract void onSendMoneyRequestReminder(PurchaseRecord purchaserecord);

    public abstract void onSettleMoneyRequest(PurchaseRecord purchaserecord);
}
