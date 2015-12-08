// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.view.View;
import com.google.android.apps.wallet.kyc.api.KycApi;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            GenericVerifyYourIdentityActivity

final class this._cls0
    implements android.view.ourIdentityActivity._cls2
{

    final GenericVerifyYourIdentityActivity this$0;

    public final void onClick(View view)
    {
        startActivityForResult(KycApi.createManualKycActivityIntentToClaimMoney(GenericVerifyYourIdentityActivity.this), 1);
    }

    ()
    {
        this$0 = GenericVerifyYourIdentityActivity.this;
        super();
    }
}
