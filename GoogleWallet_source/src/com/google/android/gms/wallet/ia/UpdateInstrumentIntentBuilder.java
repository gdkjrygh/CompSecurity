// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.ia;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.kn;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

// Referenced classes of package com.google.android.gms.wallet.ia:
//            BaseIntentBuilder

public final class UpdateInstrumentIntentBuilder extends BaseIntentBuilder
{

    public UpdateInstrumentIntentBuilder(Context context)
    {
        super(context, "com.google.android.gms.wallet.ACTION_UPDATE_INSTRUMENT", "inapp_ext");
    }

    protected final Intent onIntentBuilt(Intent intent, BuyFlowConfig buyflowconfig)
    {
        buyflowconfig = buyflowconfig.getApplicationParams().getBuyerAccount();
        boolean flag;
        if (buyflowconfig != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.b(flag, "Buyer account is required");
        kn.b(mIntent.hasExtra("com.google.android.gms.wallet.instrument"), "Payment instrument is required");
        intent.putExtra("com.google.android.gms.wallet.account", buyflowconfig);
        return intent;
    }

    public final UpdateInstrumentIntentBuilder setAddressUpgradeRequired(boolean flag)
    {
        mIntent.putExtra("com.google.android.gms.wallet.requireAddressUpgrade", flag);
        return this;
    }

    public final UpdateInstrumentIntentBuilder setPaymentInstrument(byte abyte0[])
    {
        mIntent.putExtra("com.google.android.gms.wallet.instrument", abyte0);
        return this;
    }
}
