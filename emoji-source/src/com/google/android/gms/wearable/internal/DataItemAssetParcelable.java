// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hm;
import com.google.android.gms.wearable.DataItemAsset;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            j

public class DataItemAssetParcelable
    implements SafeParcelable, DataItemAsset
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    private final String JL;
    private final String xG;
    final int xM;

    DataItemAssetParcelable(int i, String s, String s1)
    {
        xM = i;
        xG = s;
        JL = s1;
    }

    public DataItemAssetParcelable(DataItemAsset dataitemasset)
    {
        xM = 1;
        xG = (String)hm.f(dataitemasset.getId());
        JL = (String)hm.f(dataitemasset.getDataItemKey());
    }

    public int describeContents()
    {
        return 0;
    }

    public Object freeze()
    {
        return nq();
    }

    public String getDataItemKey()
    {
        return JL;
    }

    public String getId()
    {
        return xG;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public DataItemAsset nq()
    {
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataItemAssetParcelable[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (xG == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(xG);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(JL);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
