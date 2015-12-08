// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.view.View;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.widgets.validation.ValidationGroup;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycEnterPersonalInfoFragment, KycUiModel

final class this._cls0
    implements android.view.ersonalInfoFragment._cls1
{

    final KycEnterPersonalInfoFragment this$0;

    public final void onClick(View view)
    {
        if (validationGroup.checkForErrors())
        {
            validationGroup.focusOnFirstError();
        } else
        if (networkAccessChecker.check())
        {
            KycEnterPersonalInfoFragment.access$000(KycEnterPersonalInfoFragment.this);
            if (!KycEnterPersonalInfoFragment.access$100(KycEnterPersonalInfoFragment.this).isAllLegalDocumentsAccepted())
            {
                KycEnterPersonalInfoFragment.access$200(KycEnterPersonalInfoFragment.this);
                return;
            } else
            {
                fullScreenProgressSpinnerManager.show();
                KycEnterPersonalInfoFragment.access$300(KycEnterPersonalInfoFragment.this);
                return;
            }
        }
    }

    rogressSpinnerManager()
    {
        this$0 = KycEnterPersonalInfoFragment.this;
        super();
    }
}
