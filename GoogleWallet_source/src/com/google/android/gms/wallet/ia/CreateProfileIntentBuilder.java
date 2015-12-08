// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.ia;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import com.google.android.gms.internal.kn;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BrokerAndRelationships;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet.ia:
//            BaseIntentBuilder, IntentBuilderUtils

public final class CreateProfileIntentBuilder extends BaseIntentBuilder
{

    private ArrayList aVi;

    public CreateProfileIntentBuilder(Context context)
    {
        super(context, "com.google.android.gms.wallet.ACTION_CREATE_PROFILE", "inapp_ext");
    }

    public final CreateProfileIntentBuilder addCountrySpecificationFilter(CountrySpecification countryspecification)
    {
        if (aVi == null)
        {
            aVi = new ArrayList();
        }
        aVi.add(countryspecification);
        return this;
    }

    protected final Intent onIntentBuilt(Intent intent, BuyFlowConfig buyflowconfig)
    {
        boolean flag1 = true;
        int i = 0;
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
        flag = flag1;
        if (!intent.hasExtra("com.google.android.gms.wallet.brokerAndRelationships"))
        {
            if (intent.hasExtra("legalDocsForCountries"))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        kn.b(flag, "brokerAndRelationships and legalDocsForCountries cannot be both left out");
        if (intent.hasExtra("com.google.android.gms.wallet.brokerAndRelationships"))
        {
            IntentBuilderUtils.validateBrokerAndRelationships(intent);
        }
        if (intent.hasExtra("legalDocsForCountries"))
        {
            IntentBuilderUtils.validateLegalDocsForCountries(intent);
        }
        if (aVi != null)
        {
            kn.b(intent.hasExtra("com.google.android.gms.wallet.brokerAndRelationships"), "CountrySpecification filters can only be used with brokerAndRelationships");
            for (int j = aVi.size(); i < j; i++)
            {
                IntentBuilderUtils.validateCountrySpecification((CountrySpecification)aVi.get(i));
            }

            intent.putExtra("com.google.android.gms.wallet.countrySpecificationsFilter", aVi);
        }
        intent.putExtra("com.google.android.gms.wallet.account", buyflowconfig);
        return intent;
    }

    public final CreateProfileIntentBuilder setBrokerAndRelationships(BrokerAndRelationships abrokerandrelationships[])
    {
        mIntent.putExtra("com.google.android.gms.wallet.brokerAndRelationships", abrokerandrelationships);
        return this;
    }

    public final CreateProfileIntentBuilder setInstrumentRequired(boolean flag)
    {
        mIntent.putExtra("com.google.android.gms.wallet.requiresInstrument", flag);
        return this;
    }

    public final CreateProfileIntentBuilder setLegalDocsForCountries(ArrayList arraylist)
    {
        mIntent.putParcelableArrayListExtra("legalDocsForCountries", arraylist);
        return this;
    }
}
