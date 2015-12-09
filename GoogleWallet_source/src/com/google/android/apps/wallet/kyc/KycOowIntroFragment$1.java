// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.ui.listener.OnActionListener;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycOowIntroFragment

final class this._cls0
    implements OnActionListener
{

    final KycOowIntroFragment this$0;

    private void onAction(Void void1)
    {
        void1 = UriIntents.create(getActivity(), HelpUrls.createKycHelpUrl());
        startActivity(void1);
    }

    public final volatile void onAction(Object obj)
    {
        onAction((Void)obj);
    }

    er()
    {
        this$0 = KycOowIntroFragment.this;
        super();
    }
}
