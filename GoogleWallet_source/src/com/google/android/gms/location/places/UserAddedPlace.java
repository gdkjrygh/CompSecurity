// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places:
//            k

public class UserAddedPlace
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    private final String agh;
    private final LatLng awP;
    private final List awQ;
    private final String awR;
    private final String mName;
    private final String mPhoneNumber;
    final int mVersionCode;

    UserAddedPlace(int i, String s, LatLng latlng, String s1, List list, String s2, String s3)
    {
        mVersionCode = i;
        mName = s;
        awP = latlng;
        agh = s1;
        awQ = new ArrayList(list);
        mPhoneNumber = s2;
        awR = s3;
    }

    public int describeContents()
    {
        return 0;
    }

    public final String getAddress()
    {
        return agh;
    }

    public final LatLng getLatLng()
    {
        return awP;
    }

    public final String getName()
    {
        return mName;
    }

    public final String getPhoneNumber()
    {
        return mPhoneNumber;
    }

    public final List getTypes()
    {
        return awQ;
    }

    public final String getWebsiteUri()
    {
        return awR;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }

}
