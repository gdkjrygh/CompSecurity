// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            PersonImpl, EmailsImplCreator

public static class mTimesUsed
    implements SafeParcelable, com.google.android.gms.people.identity.models.ailsImpl
{

    public static final EmailsImplCreator CREATOR = new EmailsImplCreator();
    String mFormattedType;
    final Set mIndicatorSet;
    l mMetadata;
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
        EmailsImplCreator.writeToParcel(this, parcel, i);
    }


    public l()
    {
        mIndicatorSet = new HashSet();
        mVersionCode = 1;
    }

    l(Set set, int i, l l, String s, String s1, String s2, int j)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mMetadata = l;
        mFormattedType = s;
        mType = s1;
        mValue = s2;
        mTimesUsed = j;
    }
}
