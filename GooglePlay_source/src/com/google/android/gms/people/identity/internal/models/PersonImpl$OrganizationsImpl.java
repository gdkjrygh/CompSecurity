// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            PersonImpl, OrganizationsImplCreator

public static class mType
    implements SafeParcelable, com.google.android.gms.people.identity.models.ionsImpl
{

    public static final OrganizationsImplCreator CREATOR = new OrganizationsImplCreator();
    boolean mCurrent;
    String mDepartment;
    String mDescription;
    String mDomain;
    String mEndDate;
    final Set mIndicatorSet;
    String mLocation;
    t> mMetadata;
    String mName;
    String mPhoneticName;
    String mStartDate;
    String mSymbol;
    String mTitle;
    String mType;
    final int mVersionCode;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        OrganizationsImplCreator.writeToParcel(this, parcel, i);
    }


    public Y()
    {
        mIndicatorSet = new HashSet();
        mVersionCode = 1;
    }

    mVersionCode(Set set, int i, mVersionCode mversioncode, boolean flag, String s, String s1, String s2, 
            String s3, String s4, String s5, String s6, String s7, String s8, String s9, 
            String s10)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mMetadata = mversioncode;
        mCurrent = flag;
        mDepartment = s;
        mDescription = s1;
        mDomain = s2;
        mEndDate = s3;
        mLocation = s4;
        mName = s5;
        mPhoneticName = s6;
        mStartDate = s7;
        mSymbol = s8;
        mTitle = s9;
        mType = s10;
    }
}
