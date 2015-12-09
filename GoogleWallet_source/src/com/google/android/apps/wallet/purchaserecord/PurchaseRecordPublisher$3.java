// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.widgets.list.PageResult;
import com.google.common.base.Optional;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordPublisher, PurchaseRecordEvent

final class val.isFirstPage
    implements AsyncCallback
{

    final PurchaseRecordPublisher this$0;
    final boolean val$isFirstPage;
    final String val$token;

    private void onSuccess(PageResult pageresult)
    {
        WLog.d(PurchaseRecordPublisher.access$400(), "loaded page");
        PurchaseRecordPublisher.access$502(PurchaseRecordPublisher.this, (String)pageresult.getNextPageToken().orNull());
        firstToken = false;
        PurchaseRecordPublisher.access$700(PurchaseRecordPublisher.this, PurchaseRecordPublisher.ALL_PURCHASE_RECORDS, PurchaseRecordEvent.loadedPageEvent(PurchaseRecordPublisher.access$600(PurchaseRecordPublisher.this, pageresult)));
    }

    public final void onFailure(Exception exception)
    {
        WLog.e(PurchaseRecordPublisher.access$400(), "error fetching page", exception);
        PurchaseRecordPublisher.access$502(PurchaseRecordPublisher.this, val$token);
        firstToken = false;
        PurchaseRecordPublisher purchaserecordpublisher = PurchaseRecordPublisher.this;
        Object obj = PurchaseRecordPublisher.ALL_PURCHASE_RECORDS;
        if (val$isFirstPage)
        {
            exception = seRecordEventType.FETCH_FIRST_PAGE_ERROR;
        } else
        {
            exception = seRecordEventType.FETCH_ADDITIONAL_PAGE_ERROR;
        }
        PurchaseRecordPublisher.access$700(purchaserecordpublisher, obj, PurchaseRecordEvent.statusEvent(exception));
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((PageResult)obj);
    }

    seRecordEventType()
    {
        this$0 = final_purchaserecordpublisher;
        val$token = s;
        val$isFirstPage = Z.this;
        super();
    }
}
