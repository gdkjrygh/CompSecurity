// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ms

public class mr
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ms();
    final int BR;
    private final String Sz;
    private final LatLng ahY;
    private final List ahZ;
    private final String aia;
    private final String aib;
    private final String mName;

    mr(int i, String s, LatLng latlng, String s1, List list, String s2, String s3)
    {
        BR = i;
        mName = s;
        ahY = latlng;
        Sz = s1;
        ahZ = new ArrayList(list);
        aia = s2;
        aib = s3;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAddress()
    {
        return Sz;
    }

    public String getName()
    {
        return mName;
    }

    public String getPhoneNumber()
    {
        return aia;
    }

    public LatLng ml()
    {
        return ahY;
    }

    public List mm()
    {
        return ahZ;
    }

    public String mn()
    {
        return aib;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ms.a(this, parcel, i);
    }

}
