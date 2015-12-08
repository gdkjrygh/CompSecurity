// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            PersonImpl, ProfileOwnerStatsImplCreator

public static class mViewCount
    implements SafeParcelable, com.google.android.gms.people.identity.models.tatsImpl
{

    public static final ProfileOwnerStatsImplCreator CREATOR = new ProfileOwnerStatsImplCreator();
    long mIncomingAnyCircleCount;
    final Set mIndicatorSet;
    final int mVersionCode;
    long mViewCount;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ProfileOwnerStatsImplCreator.writeToParcel$25ba8b92(this, parcel);
    }


    public ()
    {
        mIndicatorSet = new HashSet();
        mVersionCode = 1;
    }

    mVersionCode(Set set, int i, long l, long l1)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mIncomingAnyCircleCount = l;
        mViewCount = l1;
    }
}
