// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.api;

import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;

// Referenced classes of package com.google.android.apps.wallet.transfer.api:
//            FundsTransferInfoPublisher

public class TransferApiModule
{

    public TransferApiModule()
    {
    }

    static InitializedEventPublisher getInitializedEventPublishers(FundsTransferInfoPublisher fundstransferinfopublisher)
    {
        return fundstransferinfopublisher;
    }
}
