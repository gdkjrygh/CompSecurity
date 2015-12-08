// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import android.os.Parcel;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            AdConfiguration

public class AdConfigurationParcelablePlease
{

    public AdConfigurationParcelablePlease()
    {
    }

    public static void readFromParcel(AdConfiguration adconfiguration, Parcel parcel)
    {
        adconfiguration.none = parcel.readString();
        adconfiguration.featured = parcel.readString();
        adconfiguration.sports = parcel.readString();
        adconfiguration.sportsFamily = parcel.readString();
        adconfiguration.favorites = parcel.readString();
    }

    public static void writeToParcel(AdConfiguration adconfiguration, Parcel parcel, int i)
    {
        parcel.writeString(adconfiguration.none);
        parcel.writeString(adconfiguration.featured);
        parcel.writeString(adconfiguration.sports);
        parcel.writeString(adconfiguration.sportsFamily);
        parcel.writeString(adconfiguration.favorites);
    }
}
