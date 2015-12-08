// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;

import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;

// Referenced classes of package com.fitbit.maps:
//            FitbitMapOptions

static final class apOptions
    implements android.os.ns._cls1
{

    public FitbitMapOptions a(Parcel parcel)
    {
        return new FitbitMapOptions((GoogleMapOptions)parcel.readParcelable(com/google/android/gms/maps/GoogleMapOptions.getClassLoader()));
    }

    public FitbitMapOptions[] a(int i)
    {
        return new FitbitMapOptions[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    apOptions()
    {
    }
}
