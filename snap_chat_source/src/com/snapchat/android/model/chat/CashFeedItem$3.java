// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;


// Referenced classes of package com.snapchat.android.model.chat:
//            CashFeedItem

public static final class sactionStatus
{

    public static final int $SwitchMap$com$snapchat$android$model$CashTransaction$TransactionStatus[];
    static final int $SwitchMap$com$snapchat$android$model$chat$CashFeedItem$BlockerResolutionState[];

    static 
    {
        $SwitchMap$com$snapchat$android$model$chat$CashFeedItem$BlockerResolutionState = new int[ockerResolutionState.values().length];
        try
        {
            $SwitchMap$com$snapchat$android$model$chat$CashFeedItem$BlockerResolutionState[ockerResolutionState.PRE_CONFIRMATION.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$chat$CashFeedItem$BlockerResolutionState[ockerResolutionState.PRE_INITIATION.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$chat$CashFeedItem$BlockerResolutionState[ockerResolutionState.INITIATING.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$chat$CashFeedItem$BlockerResolutionState[ockerResolutionState.INITIATED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        $SwitchMap$com$snapchat$android$model$CashTransaction$TransactionStatus = new int[com.snapchat.android.model..TransactionStatus.values().length];
        try
        {
            $SwitchMap$com$snapchat$android$model$CashTransaction$TransactionStatus[com.snapchat.android.model..TransactionStatus.INITIATED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$CashTransaction$TransactionStatus[com.snapchat.android.model..TransactionStatus.WAITING_ON_RECIPIENT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$CashTransaction$TransactionStatus[com.snapchat.android.model..TransactionStatus.COMPLETED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$CashTransaction$TransactionStatus[com.snapchat.android.model..TransactionStatus.EXPIRED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$CashTransaction$TransactionStatus[com.snapchat.android.model..TransactionStatus.CANCELED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$CashTransaction$TransactionStatus[com.snapchat.android.model..TransactionStatus.RECIPIENT_CANCELED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$CashTransaction$TransactionStatus[com.snapchat.android.model..TransactionStatus.SENDER_CANCELED.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
