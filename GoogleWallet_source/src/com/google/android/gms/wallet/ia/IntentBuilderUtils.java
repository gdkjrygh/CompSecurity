// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.ia;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import com.google.android.gms.internal.kn;
import com.google.android.gms.wallet.shared.BrokerAndRelationships;
import com.google.android.gms.wallet.shared.LegalDocsForCountry;
import java.util.ArrayList;

public final class IntentBuilderUtils
{

    private static boolean l(String as[])
    {
        if (as != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = as.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                if (TextUtils.isEmpty(as[i]))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static void validateBrokerAndRelationships(Intent intent)
    {
        intent = (BrokerAndRelationships[])intent.getParcelableArrayExtra("com.google.android.gms.wallet.brokerAndRelationships");
        int i;
        int j;
        boolean flag;
        if (intent != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.b(flag, "brokerAndRelationships is required");
        j = intent.length;
        i = 0;
        while (i < j) 
        {
            BrokerAndRelationships brokerandrelationships = intent[i];
            if (brokerandrelationships != null && !TextUtils.isEmpty(brokerandrelationships.getBrokerId()) && l(brokerandrelationships.getRelationships()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            kn.b(flag, "invalid brokerAndRelationships");
            i++;
        }
    }

    public static void validateCountrySpecification(CountrySpecification countryspecification)
    {
        countryspecification = countryspecification.getCountryCode();
        boolean flag;
        if (!TextUtils.isEmpty(countryspecification) && countryspecification.length() == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.L(flag);
    }

    public static void validateLegalDocsForCountries(Intent intent)
    {
        intent = intent.getParcelableArrayListExtra("legalDocsForCountries");
        int j = intent.size();
        for (int i = 0; i < j; i++)
        {
            validateLegalDocsForCountry((LegalDocsForCountry)intent.get(i));
        }

    }

    private static void validateLegalDocsForCountry(LegalDocsForCountry legaldocsforcountry)
    {
        boolean flag;
        if (legaldocsforcountry != null && !TextUtils.isEmpty(legaldocsforcountry.getCountryCode()) && !TextUtils.isEmpty(legaldocsforcountry.getLegalDocumentUrl()) && l(legaldocsforcountry.getLegalDocumentIds()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.b(flag, "invalid legalDocsForCountry");
    }
}
