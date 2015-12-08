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

    final UserAddressRequest afI;

    public <init> addAllowedCountrySpecification(CountrySpecification countryspecification)
    {
        if (afI.afH == null)
        {
            afI.afH = new ArrayList();
        }
        afI.afH.add(countryspecification);
        return this;
    }

    public afI addAllowedCountrySpecifications(Collection collection)
    {
        if (afI.afH == null)
        {
            afI.afH = new ArrayList();
        }
        afI.afH.addAll(collection);
        return this;
    }

    public UserAddressRequest build()
    {
        if (afI.afH != null)
        {
            afI.afH = Collections.unmodifiableList(afI.afH);
        }
        return afI;
    }

    private (UserAddressRequest useraddressrequest)
    {
        afI = useraddressrequest;
        super();
    }

    afI(UserAddressRequest useraddressrequest, afI afi)
    {
        this(useraddressrequest);
    }
}
