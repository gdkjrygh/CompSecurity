// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            PersonImpl, AddressesImplCreator

public static class mValue
    implements SafeParcelable, com.google.android.gms.people.identity.models.ssesImpl
{

    public static final AddressesImplCreator CREATOR = new AddressesImplCreator();
    String mCity;
    String mCountry;
    String mCountryCode;
    String mFormattedType;
    final Set mIndicatorSet;
    t> mMetadata;
    String mPoBox;
    String mPostalCode;
    String mRegion;
    String mStreetAddress;
    String mType;
    String mValue;
    final int mVersionCode;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AddressesImplCreator.writeToParcel(this, parcel, i);
    }


    public ()
    {
        mIndicatorSet = new HashSet();
        mVersionCode = 1;
    }

    mVersionCode(Set set, int i, mVersionCode mversioncode, String s, String s1, String s2, String s3, 
            String s4, String s5, String s6, String s7, String s8, String s9)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mMetadata = mversioncode;
        mCity = s;
        mCountry = s1;
        mCountryCode = s2;
        mFormattedType = s3;
        mPoBox = s4;
        mPostalCode = s5;
        mRegion = s6;
        mStreetAddress = s7;
        mType = s8;
        mValue = s9;
    }
}
