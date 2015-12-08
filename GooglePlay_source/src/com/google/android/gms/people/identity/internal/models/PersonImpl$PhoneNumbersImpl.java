// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            PersonImpl, PhoneNumbersImplCreator

public static class mTimesUsed
    implements SafeParcelable, com.google.android.gms.people.identity.models.bersImpl
{

    public static final PhoneNumbersImplCreator CREATOR = new PhoneNumbersImplCreator();
    String mCanonicalizedForm;
    String mFormattedType;
    final Set mIndicatorSet;
    t> mMetadata;
    int mTimesUsed;
    String mType;
    String mValue;
    final int mVersionCode;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PhoneNumbersImplCreator.writeToParcel(this, parcel, i);
    }


    public ()
    {
        mIndicatorSet = new HashSet();
        mVersionCode = 1;
    }

    mVersionCode(Set set, int i, mVersionCode mversioncode, String s, String s1, String s2, String s3, 
            int j)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mMetadata = mversioncode;
        mCanonicalizedForm = s;
        mFormattedType = s1;
        mType = s2;
        mValue = s3;
        mTimesUsed = j;
    }
}
