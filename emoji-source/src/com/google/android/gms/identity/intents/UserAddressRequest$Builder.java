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

    final UserAddressRequest UF;

    public <init> addAllowedCountrySpecification(CountrySpecification countryspecification)
    {
        if (UF.UE == null)
        {
            UF.UE = new ArrayList();
        }
        UF.UE.add(countryspecification);
        return this;
    }

    public UF addAllowedCountrySpecifications(Collection collection)
    {
        if (UF.UE == null)
        {
            UF.UE = new ArrayList();
        }
        UF.UE.addAll(collection);
        return this;
    }

    public UserAddressRequest build()
    {
        if (UF.UE != null)
        {
            UF.UE = Collections.unmodifiableList(UF.UE);
        }
        return UF;
    }

    private (UserAddressRequest useraddressrequest)
    {
        UF = useraddressrequest;
        super();
    }

    UF(UserAddressRequest useraddressrequest, UF uf)
    {
        this(useraddressrequest);
    }
}
