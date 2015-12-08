// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.api;

import android.os.Bundle;
import com.google.common.util.concurrent.SettableFuture;

// Referenced classes of package com.google.android.apps.wallet.paymentcard.api:
//            PaymentCardApi

final class val.future
    implements com.google.android.gms.common.api.onnectionCallbacks
{

    final PaymentCardApi this$0;
    final SettableFuture val$future;

    public final void onConnected(Bundle bundle)
    {
        val$future.set(PaymentCardApi.access$000(PaymentCardApi.this));
    }

    public final void onConnectionSuspended(int i)
    {
    }

    backs()
    {
        this$0 = final_paymentcardapi;
        val$future = SettableFuture.this;
        super();
    }
}
