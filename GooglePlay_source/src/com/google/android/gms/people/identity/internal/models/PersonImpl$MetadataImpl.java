// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            PersonImpl, MetadataImplCreator

public static class mRawContactId
    implements SafeParcelable, com.google.android.gms.people.identity.models.dataImpl
{

    public static final MetadataImplCreator CREATOR = new MetadataImplCreator();
    String mContainer;
    String mContainerContactId;
    String mContainerId;
    boolean mEdgeKey;
    final Set mIndicatorSet;
    boolean mPrimary;
    int mRawContactId;
    boolean mVerified;
    final int mVersionCode;
    String mVisibility;
    boolean mWriteable;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        MetadataImplCreator.writeToParcel$ca4ed76(this, parcel);
    }


    public ()
    {
        mIndicatorSet = new HashSet();
        mVersionCode = 1;
    }

    mVersionCode(Set set, int i, String s, String s1, String s2, String s3, boolean flag, 
            boolean flag1, boolean flag2, boolean flag3, int j)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mContainer = s;
        mContainerContactId = s1;
        mContainerId = s2;
        mVisibility = s3;
        mEdgeKey = flag;
        mPrimary = flag1;
        mVerified = flag2;
        mWriteable = flag3;
        mRawContactId = j;
    }
}
