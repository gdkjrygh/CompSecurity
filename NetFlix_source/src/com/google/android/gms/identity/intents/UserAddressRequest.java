// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.intents;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.identity.intents:
//            a

public final class UserAddressRequest
    implements SafeParcelable
{
    public final class Builder
    {

        final UserAddressRequest Nz;

        public Builder addAllowedCountrySpecification(CountrySpecification countryspecification)
        {
            if (Nz.Ny == null)
            {
                Nz.Ny = new ArrayList();
            }
            Nz.Ny.add(countryspecification);
            return this;
        }

        public Builder addAllowedCountrySpecifications(Collection collection)
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

        private Builder()
        {
            Nz = UserAddressRequest.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new a();
    List Ny;
    private final int xH;

    UserAddressRequest()
    {
        xH = 1;
    }

    UserAddressRequest(int i, List list)
    {
        xH = i;
        Ny = list;
    }

    public static Builder newBuilder()
    {
        UserAddressRequest useraddressrequest = new UserAddressRequest();
        useraddressrequest.getClass();
        return useraddressrequest. new Builder();
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
