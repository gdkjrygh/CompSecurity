// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.tapandpay.ui;

import com.google.android.apps.wallet.purchaserecord.PurchaseRecord;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecordManager;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.tapandpay.ui:
//            TapCompletedActivity

final class val.id
    implements Callable
{

    final TapCompletedActivity this$0;
    final String val$id;

    private PurchaseRecord call()
        throws Exception
    {
        return purchaseRecordManager.get(val$id);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_tapcompletedactivity;
        val$id = String.this;
        super();
    }
}
