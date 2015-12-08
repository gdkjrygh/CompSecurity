// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.DataItemAsset;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            j

public class DataItemAssetParcelable
    implements SafeParcelable, DataItemAsset
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    private final String BL;
    final int BR;
    private final String JO;

    DataItemAssetParcelable(int i, String s, String s1)
    {
        BR = i;
        BL = s;
        JO = s1;
    }

    public DataItemAssetParcelable(DataItemAsset dataitemasset)
    {
        BR = 1;
        BL = (String)o.i(dataitemasset.getId());
        JO = (String)o.i(dataitemasset.getDataItemKey());
    }

    public int describeContents()
    {
        return 0;
    }

    public Object freeze()
    {
        return pX();
    }

    public String getDataItemKey()
    {
        return JO;
    }

    public String getId()
    {
        return BL;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public DataItemAsset pX()
    {
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataItemAssetParcelable[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (BL == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(BL);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(JO);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
