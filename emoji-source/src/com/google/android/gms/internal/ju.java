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
//            jv

public class ju
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new jv();
    private final LatLng YK;
    private final String YL;
    private final List YM;
    private final String YN;
    private final String YO;
    private final String mName;
    final int xM;

    ju(int i, String s, LatLng latlng, String s1, List list, String s2, String s3)
    {
        xM = i;
        mName = s;
        YK = latlng;
        YL = s1;
        YM = new ArrayList(list);
        YN = s2;
        YO = s3;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAddress()
    {
        return YL;
    }

    public String getName()
    {
        return mName;
    }

    public String getPhoneNumber()
    {
        return YN;
    }

    public LatLng jk()
    {
        return YK;
    }

    public List jl()
    {
        return YM;
    }

    public String jm()
    {
        return YO;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jv.a(this, parcel, i);
    }

}
