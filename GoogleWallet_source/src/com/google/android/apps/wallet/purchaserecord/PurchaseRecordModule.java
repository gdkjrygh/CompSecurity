// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.common.collect.Sets;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            IncomingMoneyRequestsManager, PurchaseRecordPublisher

public class PurchaseRecordModule
{

    public PurchaseRecordModule()
    {
    }

    static Set getInitializedEventPublishers(IncomingMoneyRequestsManager incomingmoneyrequestsmanager, PurchaseRecordPublisher purchaserecordpublisher)
    {
        return Sets.newHashSet(new InitializedEventPublisher[] {
            incomingmoneyrequestsmanager, purchaserecordpublisher
        });
    }
}
