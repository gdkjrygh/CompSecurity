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

    final UserAddressRequest Nz;

    public <init> addAllowedCountrySpecification(CountrySpecification countryspecification)
    {
        if (Nz.Ny == null)
        {
            Nz.Ny = new ArrayList();
        }
        Nz.Ny.add(countryspecification);
        return this;
    }

    public Nz addAllowedCountrySpecifications(Collection collection)
    {
        if (Nz.Ny == null)
        {
            Nz.Ny = new ArrayList();
        }
        Nz.Ny.addAll(collection);
        return this;
    }

    public UserAddressRequest build()
    {
        if (Nz.Ny != null)
        {
            Nz.Ny = Collections.unmodifiableList(Nz.Ny);
        }
        return Nz;
    }

    private (UserAddressRequest useraddressrequest)
    {
        Nz = useraddressrequest;
        super();
    }

    Nz(UserAddressRequest useraddressrequest, Nz nz)
    {
        this(useraddressrequest);
    }
}
