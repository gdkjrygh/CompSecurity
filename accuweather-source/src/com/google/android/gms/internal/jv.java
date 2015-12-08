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
//            jw

public class jv
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new jw();
    private final LatLng YH;
    private final String YI;
    private final List YJ;
    private final String YK;
    private final String YL;
    private final String mName;
    final int xJ;

    jv(int i, String s, LatLng latlng, String s1, List list, String s2, String s3)
    {
        xJ = i;
        mName = s;
        YH = latlng;
        YI = s1;
        YJ = new ArrayList(list);
        YK = s2;
        YL = s3;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAddress()
    {
        return YI;
    }

    public String getName()
    {
        return mName;
    }

    public String getPhoneNumber()
    {
        return YK;
    }

    public LatLng jf()
    {
        return YH;
    }

    public List jg()
    {
        return YJ;
    }

    public String jh()
    {
        return YL;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jw.a(this, parcel, i);
    }

}
