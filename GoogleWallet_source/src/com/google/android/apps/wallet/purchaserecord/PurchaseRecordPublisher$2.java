// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.widgets.list.PageResult;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordPublisher, PurchaseRecordManager

final class val.token
    implements Callable
{

    final PurchaseRecordPublisher this$0;
    final boolean val$isFirstPage;
    final String val$token;

    private PageResult call()
        throws com.google.android.apps.wallet.widgets.list.xception
    {
        if (val$isFirstPage)
        {
            return PurchaseRecordPublisher.access$300(PurchaseRecordPublisher.this).fetchFirstPage(PurchaseRecordPublisher.access$200(PurchaseRecordPublisher.this));
        } else
        {
            return PurchaseRecordPublisher.access$300(PurchaseRecordPublisher.this).fetchNextPage(PurchaseRecordPublisher.access$200(PurchaseRecordPublisher.this), val$token);
        }
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    eption()
    {
        this$0 = final_purchaserecordpublisher;
        val$isFirstPage = flag;
        val$token = String.this;
        super();
    }
}
