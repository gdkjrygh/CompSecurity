// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding;

import com.google.android.apps.wallet.frontinginstrument.TapAndPayModelPublisher;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.funding:
//            LegacySetupNfcBackingInstrumentsActivity

final class val.newCardCdpId
    implements Callable
{

    final LegacySetupNfcBackingInstrumentsActivity this$0;
    final String val$newCardCdpId;

    private Void call()
        throws Exception
    {
        tapAndPayModelPublisher.selectCredential(val$newCardCdpId, null);
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
        val$newCardCdpId = String.this;
        super();
    }
}
