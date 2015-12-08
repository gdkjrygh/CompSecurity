// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.support.v4.app.FragmentActivity;
import android.view.View;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycFailedFragment

final class this._cls0
    implements android.view.
{

    final KycFailedFragment this$0;

    public final void onClick(View view)
    {
        getActivity().setResult(17);
        getActivity().finish();
    }

    ()
    {
        this$0 = KycFailedFragment.this;
        super();
    }
}
