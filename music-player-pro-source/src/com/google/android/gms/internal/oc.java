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
//            od

public class oc
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new od();
    final int CK;
    private final String TW;
    private final LatLng ajX;
    private final List ajY;
    private final String ajZ;
    private final String aka;
    private final String mName;

    oc(int i, String s, LatLng latlng, String s1, List list, String s2, String s3)
    {
        CK = i;
        mName = s;
        ajX = latlng;
        TW = s1;
        ajY = new ArrayList(list);
        ajZ = s2;
        aka = s3;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAddress()
    {
        return TW;
    }

    public String getName()
    {
        return mName;
    }

    public String getPhoneNumber()
    {
        return ajZ;
    }

    public LatLng nx()
    {
        return ajX;
    }

    public List ny()
    {
        return ajY;
    }

    public String nz()
    {
        return aka;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        od.a(this, parcel, i);
    }

}
