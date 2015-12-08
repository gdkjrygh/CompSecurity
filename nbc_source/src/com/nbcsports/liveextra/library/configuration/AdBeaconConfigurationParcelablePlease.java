// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import android.os.Parcel;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            AdBeaconConfiguration

public class AdBeaconConfigurationParcelablePlease
{

    public AdBeaconConfigurationParcelablePlease()
    {
    }

    public static void readFromParcel(AdBeaconConfiguration adbeaconconfiguration, Parcel parcel)
    {
        adbeaconconfiguration.splash = parcel.readString();
        adbeaconconfiguration.logo = parcel.readString();
    }

    public static void writeToParcel(AdBeaconConfiguration adbeaconconfiguration, Parcel parcel, int i)
    {
        parcel.writeString(adbeaconconfiguration.splash);
        parcel.writeString(adbeaconconfiguration.logo);
    }
}
