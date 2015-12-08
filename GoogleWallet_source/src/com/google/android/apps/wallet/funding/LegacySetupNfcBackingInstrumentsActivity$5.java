// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding;

import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;

// Referenced classes of package com.google.android.apps.wallet.funding:
//            LegacySetupNfcBackingInstrumentsActivity

final class this._cls0
    implements AsyncCallback
{

    final LegacySetupNfcBackingInstrumentsActivity this$0;

    private void onSuccess(Void void1)
    {
        fullScreenProgressSpinnerManager.hide();
        LegacySetupNfcBackingInstrumentsActivity.access$100(LegacySetupNfcBackingInstrumentsActivity.this);
    }

    public final void onFailure(Exception exception)
    {
        fullScreenProgressSpinnerManager.hide();
        LegacySetupNfcBackingInstrumentsActivity.access$200(LegacySetupNfcBackingInstrumentsActivity.this, com.google.android.apps.walletnfcrel._cls5.this._fld0);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((Void)obj);
    }

    nager()
    {
        this$0 = LegacySetupNfcBackingInstrumentsActivity.this;
        super();
    }
}
