// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.zero.protocol.CarrierAndSimMccMnc;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.zero.server:
//            a, c

public final class FetchZeroTokenParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final CarrierAndSimMccMnc a;
    private final c b;

    private FetchZeroTokenParams(Parcel parcel)
    {
        a = (CarrierAndSimMccMnc)parcel.readParcelable(com/facebook/zero/protocol/CarrierAndSimMccMnc.getClassLoader());
        b = new c(parcel.readString());
    }

    FetchZeroTokenParams(Parcel parcel, a a1)
    {
        this(parcel);
    }

    public FetchZeroTokenParams(CarrierAndSimMccMnc carrierandsimmccmnc, c c1)
    {
        a = carrierandsimmccmnc;
        b = c1;
    }

    public CarrierAndSimMccMnc a()
    {
        return a;
    }

    public c b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof FetchZeroTokenParams)
        {
            if (Objects.equal(a, ((FetchZeroTokenParams) (obj = (FetchZeroTokenParams)obj)).a()) && Objects.equal(b, ((FetchZeroTokenParams) (obj)).b()))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a, b
        });
    }

    public String toString()
    {
        return Objects.toStringHelper(com/facebook/zero/server/FetchZeroTokenParams).add("carrierAndSimMccMnc", a).add("networkType", b.a()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeString(b.a());
    }

}
