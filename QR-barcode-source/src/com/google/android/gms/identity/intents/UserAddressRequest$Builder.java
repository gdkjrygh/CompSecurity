// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.intents;

import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.identity.intents:
//            UserAddressRequest

public final class <init>
{

    final UserAddressRequest adL;

    public <init> addAllowedCountrySpecification(CountrySpecification countryspecification)
    {
        if (adL.adK == null)
        {
            adL.adK = new ArrayList();
        }
        adL.adK.add(countryspecification);
        return this;
    }

    public adL addAllowedCountrySpecifications(Collection collection)
    {
        if (adL.adK == null)
        {
            adL.adK = new ArrayList();
        }
        adL.adK.addAll(collection);
        return this;
    }

    public UserAddressRequest build()
    {
        if (adL.adK != null)
        {
            adL.adK = Collections.unmodifiableList(adL.adK);
        }
        return adL;
    }

    private (UserAddressRequest useraddressrequest)
    {
        adL = useraddressrequest;
        super();
    }

    adL(UserAddressRequest useraddressrequest, adL adl)
    {
        this(useraddressrequest);
    }
}
