// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import android.os.Parcel;
import com.nbcsports.liveextra.library.core.ListStringBagger;
import java.util.ArrayList;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            Configuration, Sport, Tour, AdobePassConfiguration

public class ConfigurationParcelablePlease
{

    public ConfigurationParcelablePlease()
    {
    }

    public static void readFromParcel(Configuration configuration, Parcel parcel)
    {
        configuration.version = parcel.readString();
        boolean flag;
        boolean flag1;
        if (parcel.readByte() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            ArrayList arraylist = new ArrayList();
            parcel.readList(arraylist, com/nbcsports/liveextra/library/configuration/Sport.getClassLoader());
            configuration.sports = arraylist;
        } else
        {
            configuration.sports = null;
        }
        if (parcel.readByte() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            ArrayList arraylist1 = new ArrayList();
            parcel.readList(arraylist1, com/nbcsports/liveextra/library/configuration/Tour.getClassLoader());
            configuration.tours = arraylist1;
        } else
        {
            configuration.tours = null;
        }
        configuration.scheduleRequestURL = parcel.readString();
        configuration.liveRequestURL = parcel.readString();
        configuration.upcomingRequestURL = parcel.readString();
        configuration.featuredRequestURL = parcel.readString();
        configuration.sportsFeaturedRequestURL = parcel.readString();
        configuration.adobePassEndpoint = parcel.readString();
        configuration.adobePassRequestorId = parcel.readString();
        configuration.adobePassSignedRequestorId = parcel.readString();
        configuration.mvpdPremium = (new ListStringBagger()).read(parcel);
        configuration.mvpdStandard = (new ListStringBagger()).read(parcel);
        configuration.mvpdLogoURL = parcel.readString();
        configuration.mvpdKeyValue = parcel.readString();
        configuration.sportsBaseURL = parcel.readString();
        configuration.imagesBaseURL = parcel.readString();
        configuration.adobePassAuthURL = parcel.readString();
        configuration.longTempPass = parcel.readString();
        configuration.longTempPassDuration = parcel.readInt();
        configuration.shortTempPass = parcel.readString();
        configuration.shortTempPassDuration = parcel.readInt();
        configuration.adobePassConfig = (AdobePassConfiguration)parcel.readParcelable(com/nbcsports/liveextra/library/configuration/AdobePassConfiguration.getClassLoader());
        configuration.helpURL = parcel.readString();
        configuration.requestorIDLookup = parcel.readString();
        configuration.alertsUrl = parcel.readString();
        configuration.rsnDmaUrl = parcel.readString();
        configuration.minApplicationVersionAndroid = parcel.readString();
        configuration.userSelectedCaptionStyleId = parcel.readLong();
        if (parcel.readByte() == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        configuration.homepageDefaultTabHighlights = flag1;
        configuration.anvatoErrorDefault = parcel.readString();
        configuration.anvatoErrors = (new Configuration.AnvatoErrorBagger()).read(parcel);
    }

    public static void writeToParcel(Configuration configuration, Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeString(configuration.version);
        int j;
        if (configuration.sports != null)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeByte((byte)j);
        if (configuration.sports != null)
        {
            parcel.writeList(configuration.sports);
        }
        if (configuration.tours != null)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeByte((byte)j);
        if (configuration.tours != null)
        {
            parcel.writeList(configuration.tours);
        }
        parcel.writeString(configuration.scheduleRequestURL);
        parcel.writeString(configuration.liveRequestURL);
        parcel.writeString(configuration.upcomingRequestURL);
        parcel.writeString(configuration.featuredRequestURL);
        parcel.writeString(configuration.sportsFeaturedRequestURL);
        parcel.writeString(configuration.adobePassEndpoint);
        parcel.writeString(configuration.adobePassRequestorId);
        parcel.writeString(configuration.adobePassSignedRequestorId);
        (new ListStringBagger()).write(configuration.mvpdPremium, parcel, i);
        (new ListStringBagger()).write(configuration.mvpdStandard, parcel, i);
        parcel.writeString(configuration.mvpdLogoURL);
        parcel.writeString(configuration.mvpdKeyValue);
        parcel.writeString(configuration.sportsBaseURL);
        parcel.writeString(configuration.imagesBaseURL);
        parcel.writeString(configuration.adobePassAuthURL);
        parcel.writeString(configuration.longTempPass);
        parcel.writeInt(configuration.longTempPassDuration);
        parcel.writeString(configuration.shortTempPass);
        parcel.writeInt(configuration.shortTempPassDuration);
        parcel.writeParcelable(configuration.adobePassConfig, i);
        parcel.writeString(configuration.helpURL);
        parcel.writeString(configuration.requestorIDLookup);
        parcel.writeString(configuration.alertsUrl);
        parcel.writeString(configuration.rsnDmaUrl);
        parcel.writeString(configuration.minApplicationVersionAndroid);
        parcel.writeLong(configuration.userSelectedCaptionStyleId);
        if (configuration.homepageDefaultTabHighlights)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = 0;
        }
        parcel.writeByte((byte)j);
        parcel.writeString(configuration.anvatoErrorDefault);
        (new Configuration.AnvatoErrorBagger()).write(configuration.anvatoErrors, parcel, i);
    }
}
