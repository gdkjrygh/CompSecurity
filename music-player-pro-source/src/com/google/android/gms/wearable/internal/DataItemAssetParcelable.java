// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jx;
import com.google.android.gms.wearable.DataItemAsset;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            j

public class DataItemAssetParcelable
    implements SafeParcelable, DataItemAsset
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    private final String CE;
    final int CK;
    private final String KP;

    DataItemAssetParcelable(int i, String s, String s1)
    {
        CK = i;
        CE = s;
        KP = s1;
    }

    public DataItemAssetParcelable(DataItemAsset dataitemasset)
    {
        CK = 1;
        CE = (String)jx.i(dataitemasset.getId());
        KP = (String)jx.i(dataitemasset.getDataItemKey());
    }

    public int describeContents()
    {
        return 0;
    }

    public Object freeze()
    {
        return ro();
    }

    public String getDataItemKey()
    {
        return KP;
    }

    public String getId()
    {
        return CE;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public DataItemAsset ro()
    {
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataItemAssetParcelable[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (CE == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(CE);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(KP);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
