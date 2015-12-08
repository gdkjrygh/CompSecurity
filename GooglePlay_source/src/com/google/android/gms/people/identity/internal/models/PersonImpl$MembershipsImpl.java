// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            PersonImpl, MembershipsImplCreator

public static class mSystemContactGroup
    implements SafeParcelable, com.google.android.gms.people.identity.models.hipsImpl
{

    public static final MembershipsImplCreator CREATOR = new MembershipsImplCreator();
    String mCircle;
    String mContactGroup;
    final Set mIndicatorSet;
    t> mMetadata;
    String mSystemContactGroup;
    final int mVersionCode;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        MembershipsImplCreator.writeToParcel(this, parcel, i);
    }


    public ()
    {
        mIndicatorSet = new HashSet();
        mVersionCode = 1;
    }

    mVersionCode(Set set, int i, mVersionCode mversioncode, String s, String s1, String s2)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mMetadata = mversioncode;
        mCircle = s;
        mContactGroup = s1;
        mSystemContactGroup = s2;
    }
}
