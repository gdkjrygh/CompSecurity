// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.DataItemAsset;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            DataItemAssetParcelableCreator

public class DataItemAssetParcelable
    implements SafeParcelable, DataItemAsset
{

    public static final android.os.Parcelable.Creator CREATOR = new DataItemAssetParcelableCreator();
    final String mId;
    final String mKey;
    final int mVersionCode;

    DataItemAssetParcelable(int i, String s, String s1)
    {
        mVersionCode = i;
        mId = s;
        mKey = s1;
    }

    public DataItemAssetParcelable(DataItemAsset dataitemasset)
    {
        mVersionCode = 1;
        mId = (String)Preconditions.checkNotNull(dataitemasset.getId());
        mKey = (String)Preconditions.checkNotNull(dataitemasset.getDataItemKey());
    }

    public int describeContents()
    {
        return 0;
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final String getDataItemKey()
    {
        return mKey;
    }

    public final String getId()
    {
        return mId;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataItemAssetParcelable[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (mId == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(mId);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(mKey);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        DataItemAssetParcelableCreator.writeToParcel$4a7bd096(this, parcel);
    }

}
