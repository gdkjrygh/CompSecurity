// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hn;
import com.google.android.gms.wearable.DataItemAsset;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            j

public class DataItemAssetParcelable
    implements SafeParcelable, DataItemAsset
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    private final String JI;
    private final String xD;
    final int xJ;

    DataItemAssetParcelable(int i, String s, String s1)
    {
        xJ = i;
        xD = s;
        JI = s1;
    }

    public DataItemAssetParcelable(DataItemAsset dataitemasset)
    {
        xJ = 1;
        xD = (String)hn.f(dataitemasset.getId());
        JI = (String)hn.f(dataitemasset.getDataItemKey());
    }

    public int describeContents()
    {
        return 0;
    }

    public Object freeze()
    {
        return nl();
    }

    public String getDataItemKey()
    {
        return JI;
    }

    public String getId()
    {
        return xD;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public DataItemAsset nl()
    {
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataItemAssetParcelable[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (xD == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(xD);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(JI);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
