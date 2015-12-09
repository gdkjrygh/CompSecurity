// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            IncomingMoneyRequestsManager, PurchaseRecordManager

final class this._cls0
    implements Callable
{

    final IncomingMoneyRequestsManager this$0;

    private List call()
        throws Exception
    {
        return IncomingMoneyRequestsManager.access$200(IncomingMoneyRequestsManager.this).getIncomingMoneyRequests();
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = IncomingMoneyRequestsManager.this;
        super();
    }
}
