// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import com.google.android.apps.wallet.preferences.PreferenceClient;
import com.google.android.apps.wallet.widgets.validation.ValidatedSpinner;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycEnterPersonalInfoFragment

final class this._cls0
    implements Callable
{

    final KycEnterPersonalInfoFragment this$0;

    private Void call()
        throws Exception
    {
        preferenceClient.updateCommercialUse(true, ((bCategory)KycEnterPersonalInfoFragment.access$800(KycEnterPersonalInfoFragment.this).getValue()).getP2pCommercialUseType());
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    bCategory()
    {
        this$0 = KycEnterPersonalInfoFragment.this;
        super();
    }
}
