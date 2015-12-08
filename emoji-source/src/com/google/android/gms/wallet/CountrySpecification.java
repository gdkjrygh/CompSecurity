// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            c

public class CountrySpecification
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    String rf;
    private final int xM;

    CountrySpecification(int i, String s)
    {
        xM = i;
        rf = s;
    }

    public CountrySpecification(String s)
    {
        xM = 1;
        rf = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCountryCode()
    {
        return rf;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
