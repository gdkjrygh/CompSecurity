// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup.setupstate;

import com.google.android.apps.wallet.hce.database.HceLibraryDatabase;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.hce.setup.setupstate:
//            NfcPaymentSetupManager

final class this._cls0
    implements Callable
{

    final NfcPaymentSetupManager this$0;

    private List call()
        throws Exception
    {
        return NfcPaymentSetupManager.access$300(NfcPaymentSetupManager.this).getAllAtcs();
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = NfcPaymentSetupManager.this;
        super();
    }
}
