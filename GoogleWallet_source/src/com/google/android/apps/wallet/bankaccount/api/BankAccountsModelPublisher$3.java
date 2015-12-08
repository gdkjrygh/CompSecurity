// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount.api;

import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.bankaccount.api:
//            BankAccountsModelPublisher

final class this._cls0
    implements AsyncCallback
{

    final BankAccountsModelPublisher this$0;

    private void onSuccess(Void void1)
    {
        afterWriteToCache();
        generateAndPostEvent();
    }

    public final void onFailure(Exception exception)
    {
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((Void)obj);
    }

    Q()
    {
        this$0 = BankAccountsModelPublisher.this;
        super();
    }
}
