// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import android.os.Parcel;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            Tour

public class TourParcelablePlease
{

    public TourParcelablePlease()
    {
    }

    public static void readFromParcel(Tour tour, Parcel parcel)
    {
        boolean flag = true;
        tour.code = parcel.readString();
        tour.adCode = parcel.readString();
        tour.name = parcel.readString();
        tour.channel = parcel.readString();
        if (parcel.readByte() != 1)
        {
            flag = false;
        }
        tour.isRSN = flag;
        tour.sponsorImageBaseURL = parcel.readString();
        tour.sponsorImageUrlPhone = parcel.readString();
        tour.sponsorImageUrlTablet = parcel.readString();
        tour.sponsorLinkUrlPhone = parcel.readString();
        tour.sponsorLinkUrlTablet = parcel.readString();
        tour.logosBaseUrl = parcel.readString();
        tour.sportLogo = parcel.readString();
        tour.sportAdLogo = parcel.readString();
        tour.adBeacons = (new Sport.AdBeaconConfigurationBagger()).read(parcel);
        tour.sportLogo = parcel.readString();
        tour.sportAdLogo = parcel.readString();
    }

    public static void writeToParcel(Tour tour, Parcel parcel, int i)
    {
        parcel.writeString(tour.code);
        parcel.writeString(tour.adCode);
        parcel.writeString(tour.name);
        parcel.writeString(tour.channel);
        int j;
        if (tour.isRSN)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeByte((byte)j);
        parcel.writeString(tour.sponsorImageBaseURL);
        parcel.writeString(tour.sponsorImageUrlPhone);
        parcel.writeString(tour.sponsorImageUrlTablet);
        parcel.writeString(tour.sponsorLinkUrlPhone);
        parcel.writeString(tour.sponsorLinkUrlTablet);
        parcel.writeString(tour.logosBaseUrl);
        parcel.writeString(tour.sportLogo);
        parcel.writeString(tour.sportAdLogo);
        (new Sport.AdBeaconConfigurationBagger()).write(tour.adBeacons, parcel, i);
        parcel.writeString(tour.sportLogo);
        parcel.writeString(tour.sportAdLogo);
    }
}
