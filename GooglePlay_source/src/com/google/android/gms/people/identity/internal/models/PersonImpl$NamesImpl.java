// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            PersonImpl, NamesImplCreator

public static class mPhoneticHonorificSuffix
    implements SafeParcelable, com.google.android.gms.people.identity.models.amesImpl
{

    public static final NamesImplCreator CREATOR = new NamesImplCreator();
    String mDisplayName;
    String mFamilyName;
    String mFormatted;
    String mGivenName;
    String mHonorificPrefix;
    String mHonorificSuffix;
    final Set mIndicatorSet;
    pl mMetadata;
    String mMiddleName;
    String mPhoneticFamilyName;
    String mPhoneticGivenName;
    String mPhoneticHonorificPrefix;
    String mPhoneticHonorificSuffix;
    final int mVersionCode;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        NamesImplCreator.writeToParcel(this, parcel, i);
    }


    public pl()
    {
        mIndicatorSet = new HashSet();
        mVersionCode = 1;
    }

    pl(Set set, int i, pl pl, String s, String s1, String s2, String s3, 
            String s4, String s5, String s6, String s7, String s8, String s9, String s10)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mMetadata = pl;
        mDisplayName = s;
        mFamilyName = s1;
        mFormatted = s2;
        mGivenName = s3;
        mHonorificPrefix = s4;
        mHonorificSuffix = s5;
        mMiddleName = s6;
        mPhoneticFamilyName = s7;
        mPhoneticGivenName = s8;
        mPhoneticHonorificPrefix = s9;
        mPhoneticHonorificSuffix = s10;
    }
}
