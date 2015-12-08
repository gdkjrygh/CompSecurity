// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount.api;

import com.google.android.apps.wallet.eventbus.RegistrationCallback;

// Referenced classes of package com.google.android.apps.wallet.bankaccount.api:
//            BankAccountsModelPublisher

final class this._cls0
    implements RegistrationCallback
{

    final BankAccountsModelPublisher this$0;

    public final void handleRegistration(Object obj)
    {
        generateAndPostEvent();
    }

    Q()
    {
        this$0 = BankAccountsModelPublisher.this;
        super();
    }
}
