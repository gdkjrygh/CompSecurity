// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding;

import com.google.android.apps.wallet.frontinginstrument.TapAndPayModelPublisher;
import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.funding:
//            LegacySetupNfcBackingInstrumentsActivity

final class val.storedValue
    implements Callable
{

    final LegacySetupNfcBackingInstrumentsActivity this$0;
    final PaymentCard val$cardToSelect;
    final com.google.wallet.proto.entsActivity val$storedValue;

    private Void call()
        throws Exception
    {
        tapAndPayModelPublisher.selectCredential(val$cardToSelect, val$storedValue);
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_legacysetupnfcbackinginstrumentsactivity;
        val$cardToSelect = paymentcard;
        val$storedValue = com.google.wallet.proto.entsActivity._cls2.val.storedValue.this;
        super();
    }
}
