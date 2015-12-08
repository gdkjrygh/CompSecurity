// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            EditLoyaltyCardActivity, LoyaltyApiClient

final class this._cls0
    implements Callable
{

    final EditLoyaltyCardActivity this$0;

    private com.google.wallet.proto.api.tyEditFormResponse call()
        throws Exception
    {
        return loyaltyClient.getEditForm(EditLoyaltyCardActivity.access$200(EditLoyaltyCardActivity.this));
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    esponse()
    {
        this$0 = EditLoyaltyCardActivity.this;
        super();
    }
}
