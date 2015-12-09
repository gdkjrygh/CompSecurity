// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth:
//            CountryCreator

public class Country
    implements SafeParcelable
{

    public static final CountryCreator CREATOR = new CountryCreator();
    public String mCode;
    public String mName;
    final int mVersionCode;

    public Country()
    {
        mVersionCode = 1;
    }

    Country(int i, String s, String s1)
    {
        mVersionCode = i;
        mName = s;
        mCode = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        CountryCreator.writeToParcel$53a79cc9(this, parcel);
    }

}
