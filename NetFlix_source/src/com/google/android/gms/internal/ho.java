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
//            hp

public class ho
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new hp();
    private final LatLng Re;
    private final String Rf;
    private final List Rg;
    private final String Rh;
    private final String Ri;
    private final String mName;
    final int xH;

    ho(int i, String s, LatLng latlng, String s1, List list, String s2, String s3)
    {
        xH = i;
        mName = s;
        Re = latlng;
        Rf = s1;
        Rg = new ArrayList(list);
        Rh = s2;
        Ri = s3;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAddress()
    {
        return Rf;
    }

    public String getName()
    {
        return mName;
    }

    public String getPhoneNumber()
    {
        return Rh;
    }

    public LatLng ia()
    {
        return Re;
    }

    public List ib()
    {
        return Rg;
    }

    public String ic()
    {
        return Ri;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        hp.a(this, parcel, i);
    }

}
