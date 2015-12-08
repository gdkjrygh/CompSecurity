// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.wearable:
//            ConnectionConfigurationCreator

public class ConnectionConfiguration
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ConnectionConfigurationCreator();
    final String mAddress;
    boolean mBtlePriority;
    final boolean mConnectionEnabled;
    boolean mIsConnected;
    final String mName;
    String mNodeId;
    String mPeerNodeId;
    final int mRole;
    final int mType;
    final int mVersionCode;

    ConnectionConfiguration(int i, String s, String s1, int j, int k, boolean flag, boolean flag1, 
            String s2, boolean flag2, String s3)
    {
        mVersionCode = i;
        mName = s;
        mAddress = s1;
        mType = j;
        mRole = k;
        mConnectionEnabled = flag;
        mIsConnected = flag1;
        mPeerNodeId = s2;
        mBtlePriority = flag2;
        mNodeId = s3;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ConnectionConfiguration)
        {
            if (Objects.equal(Integer.valueOf(mVersionCode), Integer.valueOf(((ConnectionConfiguration) (obj = (ConnectionConfiguration)obj)).mVersionCode)) && Objects.equal(mName, ((ConnectionConfiguration) (obj)).mName) && Objects.equal(mAddress, ((ConnectionConfiguration) (obj)).mAddress) && Objects.equal(Integer.valueOf(mType), Integer.valueOf(((ConnectionConfiguration) (obj)).mType)) && Objects.equal(Integer.valueOf(mRole), Integer.valueOf(((ConnectionConfiguration) (obj)).mRole)) && Objects.equal(Boolean.valueOf(mConnectionEnabled), Boolean.valueOf(((ConnectionConfiguration) (obj)).mConnectionEnabled)) && Objects.equal(Boolean.valueOf(mBtlePriority), Boolean.valueOf(((ConnectionConfiguration) (obj)).mBtlePriority)))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(mVersionCode), mName, mAddress, Integer.valueOf(mType), Integer.valueOf(mRole), Boolean.valueOf(mConnectionEnabled), Boolean.valueOf(mBtlePriority)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("ConnectionConfiguration[ ");
        stringbuilder.append((new StringBuilder("mName=")).append(mName).toString());
        stringbuilder.append((new StringBuilder(", mAddress=")).append(mAddress).toString());
        stringbuilder.append((new StringBuilder(", mType=")).append(mType).toString());
        stringbuilder.append((new StringBuilder(", mRole=")).append(mRole).toString());
        stringbuilder.append((new StringBuilder(", mEnabled=")).append(mConnectionEnabled).toString());
        stringbuilder.append((new StringBuilder(", mIsConnected=")).append(mIsConnected).toString());
        stringbuilder.append((new StringBuilder(", mPeerNodeId=")).append(mPeerNodeId).toString());
        stringbuilder.append((new StringBuilder(", mBtlePriority=")).append(mBtlePriority).toString());
        stringbuilder.append((new StringBuilder(", mNodeId=")).append(mNodeId).toString());
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ConnectionConfigurationCreator.writeToParcel$3e41336a(this, parcel);
    }

}
