// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import com.hannesdorfmann.parcelableplease.ParcelBagger;
import com.phunware.nbc.sochi.content.ParcelableUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            AdobePassConfiguration, ConfigurationParcelablePlease

public class Configuration
    implements Parcelable
{
    public static class AnvatoErrorBagger
        implements ParcelBagger
    {

        public volatile Object read(Parcel parcel)
        {
            return read(parcel);
        }

        public Map read(Parcel parcel)
        {
            try
            {
                parcel = ParcelableUtils.readIntStringMap(parcel);
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                Timber.i(parcel, "Exception while reading AdBeaconConfiguration map bundle.", new Object[0]);
                return null;
            }
            return parcel;
        }

        public volatile void write(Object obj, Parcel parcel, int i)
        {
            write((Map)obj, parcel, i);
        }

        public void write(Map map, Parcel parcel, int i)
        {
            ParcelableUtils.writeIntStringMap(parcel, map);
        }

        public AnvatoErrorBagger()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Configuration createFromParcel(Parcel parcel)
        {
            Configuration configuration = new Configuration();
            ConfigurationParcelablePlease.readFromParcel(configuration, parcel);
            return configuration;
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Configuration[] newArray(int i)
        {
            return new Configuration[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    String adobePassAuthURL;
    AdobePassConfiguration adobePassConfig;
    String adobePassEndpoint;
    String adobePassRequestorId;
    String adobePassSignedRequestorId;
    String alertsUrl;
    String anvatoErrorDefault;
    Map anvatoErrors;
    String featuredRequestURL;
    String helpURL;
    boolean homepageDefaultTabHighlights;
    String imagesBaseURL;
    String liveRequestURL;
    String longTempPass;
    int longTempPassDuration;
    String minApplicationVersionAndroid;
    String mvpdKeyValue;
    String mvpdLogoURL;
    List mvpdPremium;
    List mvpdStandard;
    String requestorIDLookup;
    String rsnDmaUrl;
    String scheduleRequestURL;
    String shortTempPass;
    int shortTempPassDuration;
    List sports;
    String sportsBaseURL;
    String sportsFeaturedRequestURL;
    List tours;
    String upcomingRequestURL;
    long userSelectedCaptionStyleId;
    String version;

    public Configuration()
    {
        sports = new ArrayList();
        tours = new ArrayList();
        mvpdPremium = new ArrayList();
        mvpdStandard = new ArrayList();
        anvatoErrors = new HashMap();
    }

    public Configuration(Parcel parcel)
    {
        sports = new ArrayList();
        tours = new ArrayList();
        mvpdPremium = new ArrayList();
        mvpdStandard = new ArrayList();
        anvatoErrors = new HashMap();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAdobePassAuthURL()
    {
        return adobePassAuthURL;
    }

    public AdobePassConfiguration getAdobePassConfig()
    {
        return adobePassConfig;
    }

    public String getAdobePassEndpoint()
    {
        return adobePassEndpoint;
    }

    public String getAdobePassRequestorId()
    {
        return adobePassRequestorId;
    }

    public String getAdobePassSignedRequestorId()
    {
        return adobePassSignedRequestorId;
    }

    public String getAlertsUrl()
    {
        return alertsUrl;
    }

    public String getAnvatoErrorDefault()
    {
        return anvatoErrorDefault;
    }

    public Map getAnvatoErrors()
    {
        return anvatoErrors;
    }

    public String getFeaturedRequestURL()
    {
        return featuredRequestURL;
    }

    public String getHelpURL()
    {
        return helpURL;
    }

    public String getImagesBaseURL()
    {
        return imagesBaseURL;
    }

    public String getLiveRequestURL()
    {
        return liveRequestURL;
    }

    public String getLongTempPass()
    {
        return longTempPass;
    }

    public int getLongTempPassDuration()
    {
        return longTempPassDuration;
    }

    public String getMinApplicationVersionAndroid()
    {
        return minApplicationVersionAndroid;
    }

    public String getMvpdKeyValue()
    {
        return mvpdKeyValue;
    }

    public String getMvpdLogoURL()
    {
        return mvpdLogoURL;
    }

    public List getMvpdPremium()
    {
        return mvpdPremium;
    }

    public List getMvpdStandard()
    {
        return mvpdStandard;
    }

    public String getRequestorIDLookup()
    {
        return requestorIDLookup;
    }

    public String getRsnDmaUrl()
    {
        return rsnDmaUrl;
    }

    public String getScheduleRequestURL()
    {
        return scheduleRequestURL;
    }

    public String getShortTempPass()
    {
        return shortTempPass;
    }

    public int getShortTempPassDuration()
    {
        return shortTempPassDuration;
    }

    public List getSports()
    {
        return sports;
    }

    public String getSportsBaseURL()
    {
        return sportsBaseURL;
    }

    public String getSportsFeaturedRequestURL()
    {
        return sportsFeaturedRequestURL;
    }

    public List getTours()
    {
        return tours;
    }

    public String getUpcomingRequestURL()
    {
        return upcomingRequestURL;
    }

    public long getUserSelectedCaptionStyleId()
    {
        return userSelectedCaptionStyleId;
    }

    public String getVersion()
    {
        return version;
    }

    public boolean isHomepageDefaultTabHighlights()
    {
        return homepageDefaultTabHighlights;
    }

    public boolean isInitAdobePassOnAppStart()
    {
        return adobePassConfig == null || adobePassConfig.isInitOnAppStart();
    }

    public boolean isLoaded()
    {
        return version != null;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ConfigurationParcelablePlease.writeToParcel(this, parcel, i);
    }

}
