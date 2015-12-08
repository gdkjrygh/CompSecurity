// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Channel;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ChannelImplCreator

public class ChannelImpl
    implements SafeParcelable, Channel
{

    public static final android.os.Parcelable.Creator CREATOR = new ChannelImplCreator();
    final String mNodeId;
    final String mPath;
    final String mToken;
    final int mVersionCode;

    ChannelImpl(int i, String s, String s1, String s2)
    {
        mVersionCode = i;
        mToken = (String)Preconditions.checkNotNull(s);
        mNodeId = (String)Preconditions.checkNotNull(s1);
        mPath = (String)Preconditions.checkNotNull(s2);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ChannelImpl))
            {
                return false;
            }
            obj = (ChannelImpl)obj;
            if (!mToken.equals(((ChannelImpl) (obj)).mToken) || !Objects.equal(((ChannelImpl) (obj)).mNodeId, mNodeId) || !Objects.equal(((ChannelImpl) (obj)).mPath, mPath) || ((ChannelImpl) (obj)).mVersionCode != mVersionCode)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return mToken.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("ChannelImpl{versionCode=")).append(mVersionCode).append(", token='").append(mToken).append('\'').append(", nodeId='").append(mNodeId).append('\'').append(", path='").append(mPath).append('\'').append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ChannelImplCreator.writeToParcel$2d2555a3(this, parcel);
    }

}
