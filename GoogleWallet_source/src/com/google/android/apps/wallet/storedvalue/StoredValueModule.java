// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.storedvalue.api.StoredValuePublisher;
import com.google.common.collect.Sets;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            WalletBalancePendingTransactionPublisher

public class StoredValueModule
{

    public StoredValueModule()
    {
    }

    static Set getInitializedEventPublishers(StoredValuePublisher storedvaluepublisher, WalletBalancePendingTransactionPublisher walletbalancependingtransactionpublisher)
    {
        return Sets.newHashSet(new InitializedEventPublisher[] {
            storedvaluepublisher, walletbalancependingtransactionpublisher
        });
    }
}
