// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import com.google.android.apps.wallet.kyc.api.KycClient;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycEnterPersonalInfoFragment, KycUiModel

final class this._cls0
    implements Callable
{

    final KycEnterPersonalInfoFragment this$0;

    private com.google.wallet.proto.api.nse call()
        throws Exception
    {
        com.google.wallet.proto.api.st st = new com.google.wallet.proto.api.st();
        st.acceptedTosId = (new String[] {
            KycEnterPersonalInfoFragment.access$100(KycEnterPersonalInfoFragment.this).getWalletLegalDocument().documentId, KycEnterPersonalInfoFragment.access$100(KycEnterPersonalInfoFragment.this).getEsignLegalDocument().documentId
        });
        return kycClient.acceptKycTos(st);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = KycEnterPersonalInfoFragment.this;
        super();
    }
}
