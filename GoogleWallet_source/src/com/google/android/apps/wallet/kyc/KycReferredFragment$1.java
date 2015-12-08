// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.support.v4.app.FragmentActivity;
import android.view.View;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycReferredFragment

final class this._cls0
    implements android.view.KycReferredFragment._cls1
{

    final KycReferredFragment this$0;

    public final void onClick(View view)
    {
        getActivity().setResult(20);
        getActivity().finish();
    }

    ()
    {
        this$0 = KycReferredFragment.this;
        super();
    }
}
