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

    final UserAddressRequest UC;

    public <init> addAllowedCountrySpecification(CountrySpecification countryspecification)
    {
        if (UC.UB == null)
        {
            UC.UB = new ArrayList();
        }
        UC.UB.add(countryspecification);
        return this;
    }

    public UC addAllowedCountrySpecifications(Collection collection)
    {
        if (UC.UB == null)
        {
            UC.UB = new ArrayList();
        }
        UC.UB.addAll(collection);
        return this;
    }

    public UserAddressRequest build()
    {
        if (UC.UB != null)
        {
            UC.UB = Collections.unmodifiableList(UC.UB);
        }
        return UC;
    }

    private (UserAddressRequest useraddressrequest)
    {
        UC = useraddressrequest;
        super();
    }

    UC(UserAddressRequest useraddressrequest, UC uc)
    {
        this(useraddressrequest);
    }
}
