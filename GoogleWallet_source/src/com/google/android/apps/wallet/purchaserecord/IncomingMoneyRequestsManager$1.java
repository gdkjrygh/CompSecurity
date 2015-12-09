// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.eventbus.RegistrationCallback;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            IncomingMoneyRequestsManager

final class this._cls0
    implements RegistrationCallback
{

    final IncomingMoneyRequestsManager this$0;

    public final void handleRegistration(Object obj)
    {
        IncomingMoneyRequestsManager.access$000(IncomingMoneyRequestsManager.this, obj);
    }

    ()
    {
        this$0 = IncomingMoneyRequestsManager.this;
        super();
    }
}
