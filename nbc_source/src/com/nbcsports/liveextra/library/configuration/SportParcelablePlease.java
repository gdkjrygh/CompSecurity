// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import android.os.Parcel;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            Sport

public class SportParcelablePlease
{

    public SportParcelablePlease()
    {
    }

    public static void readFromParcel(Sport sport, Parcel parcel)
    {
        boolean flag = true;
        sport.code = parcel.readString();
        sport.adCode = parcel.readString();
        sport.name = parcel.readString();
        sport.channel = parcel.readString();
        if (parcel.readByte() != 1)
        {
            flag = false;
        }
        sport.isRSN = flag;
        sport.sponsorImageBaseURL = parcel.readString();
        sport.sponsorImageUrlPhone = parcel.readString();
        sport.sponsorImageUrlTablet = parcel.readString();
        sport.sponsorLinkUrlPhone = parcel.readString();
        sport.sponsorLinkUrlTablet = parcel.readString();
        sport.logosBaseUrl = parcel.readString();
        sport.sportLogo = parcel.readString();
        sport.sportAdLogo = parcel.readString();
        sport.adBeacons = (new Sport.AdBeaconConfigurationBagger()).read(parcel);
    }

    public static void writeToParcel(Sport sport, Parcel parcel, int i)
    {
        parcel.writeString(sport.code);
        parcel.writeString(sport.adCode);
        parcel.writeString(sport.name);
        parcel.writeString(sport.channel);
        int j;
        if (sport.isRSN)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeByte((byte)j);
        parcel.writeString(sport.sponsorImageBaseURL);
        parcel.writeString(sport.sponsorImageUrlPhone);
        parcel.writeString(sport.sponsorImageUrlTablet);
        parcel.writeString(sport.sponsorLinkUrlPhone);
        parcel.writeString(sport.sponsorLinkUrlTablet);
        parcel.writeString(sport.logosBaseUrl);
        parcel.writeString(sport.sportLogo);
        parcel.writeString(sport.sportAdLogo);
        (new Sport.AdBeaconConfigurationBagger()).write(sport.adBeacons, parcel, i);
    }
}
