// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            StoredValueStatementsListActivity, PurchaseRecordManager

final class <init>
    implements Callable
{

    final StoredValueStatementsListActivity this$0;

    private List call()
        throws Exception
    {
        return purchaseRecordManager.getStoredValueTransactions();
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    private ()
    {
        this$0 = StoredValueStatementsListActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
