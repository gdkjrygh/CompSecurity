// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            NodeParcelableCreator

public class NodeParcelable
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new NodeParcelableCreator();
    final String mDisplayName;
    final int mHopCount;
    final String mId;
    final boolean mIsNearby;
    final int mVersionCode;

    NodeParcelable(int i, String s, String s1, int j, boolean flag)
    {
        mVersionCode = i;
        mId = s;
        mDisplayName = s1;
        mHopCount = j;
        mIsNearby = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof NodeParcelable))
        {
            return false;
        } else
        {
            return ((NodeParcelable)obj).mId.equals(mId);
        }
    }

    public int hashCode()
    {
        return mId.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("Node{")).append(mDisplayName).append(", id=").append(mId).append(", hops=").append(mHopCount).append(", isNearby=").append(mIsNearby).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        NodeParcelableCreator.writeToParcel$70e0d217(this, parcel);
    }

}
