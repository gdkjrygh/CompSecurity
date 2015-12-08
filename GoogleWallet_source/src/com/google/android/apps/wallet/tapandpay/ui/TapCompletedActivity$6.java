// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.tapandpay.ui;


// Referenced classes of package com.google.android.apps.wallet.tapandpay.ui:
//            TapCompletedActivity

static final class ansactionDetailState
{

    static final int $SwitchMap$com$google$android$apps$wallet$tapandpay$ui$TapCompletedActivity$TransactionDetailState[];

    static 
    {
        $SwitchMap$com$google$android$apps$wallet$tapandpay$ui$TapCompletedActivity$TransactionDetailState = new int[ansactionDetailState.values().length];
        try
        {
            $SwitchMap$com$google$android$apps$wallet$tapandpay$ui$TapCompletedActivity$TransactionDetailState[ansactionDetailState.NOT_STARTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$tapandpay$ui$TapCompletedActivity$TransactionDetailState[ansactionDetailState.REQUESTING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$tapandpay$ui$TapCompletedActivity$TransactionDetailState[ansactionDetailState.DETAILS_DELAYED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$tapandpay$ui$TapCompletedActivity$TransactionDetailState[ansactionDetailState.DETAILS_DELAYED_LONGER.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$tapandpay$ui$TapCompletedActivity$TransactionDetailState[ansactionDetailState.DETAILS_DONE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
