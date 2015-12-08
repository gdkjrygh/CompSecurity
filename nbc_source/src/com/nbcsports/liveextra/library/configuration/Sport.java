// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.hannesdorfmann.parcelableplease.ParcelBagger;
import com.phunware.nbc.sochi.content.ParcelableUtils;
import java.util.HashMap;
import java.util.Map;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            Configuration, SportParcelablePlease, AdBeaconConfiguration

public class Sport
    implements Parcelable
{
    public static class AdBeaconConfigurationBagger
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
                parcel = ParcelableUtils.readParcelableMap(parcel, com/nbcsports/liveextra/library/configuration/AdBeaconConfiguration.getClassLoader());
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
            ParcelableUtils.write(parcel, map, i);
        }

        public AdBeaconConfigurationBagger()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Sport createFromParcel(Parcel parcel)
        {
            Sport sport = new Sport();
            SportParcelablePlease.readFromParcel(sport, parcel);
            return sport;
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Sport[] newArray(int i)
        {
            return new Sport[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    Map adBeacons;
    String adCode;
    String channel;
    String code;
    boolean isRSN;
    String logosBaseUrl;
    String name;
    String sponsorImageBaseURL;
    String sponsorImageUrlPhone;
    String sponsorImageUrlTablet;
    String sponsorLinkUrlPhone;
    String sponsorLinkUrlTablet;
    String sportAdLogo;
    String sportLogo;

    public Sport()
    {
        adBeacons = new HashMap();
    }

    public Sport(Parcel parcel)
    {
        adBeacons = new HashMap();
    }

    public int describeContents()
    {
        return 0;
    }

    public Map getAdBeacons()
    {
        return adBeacons;
    }

    public String getAdCode()
    {
        return adCode;
    }

    public String getChannel()
    {
        return channel;
    }

    public String getCode()
    {
        return code;
    }

    public Uri getCoverImage(DisplayMetrics displaymetrics, Configuration configuration)
    {
        displaymetrics.densityDpi;
        JVM INSTR lookupswitch 4: default 48
    //                   213: 98
    //                   240: 98
    //                   320: 104
    //                   480: 104;
           goto _L1 _L2 _L2 _L3 _L3
_L1:
        displaymetrics = "160";
_L5:
        return Uri.parse((new StringBuilder()).append(configuration.getSportsBaseURL()).append("phone/").append(displaymetrics).append("/sports/").append(code).append(".png").toString());
_L2:
        displaymetrics = "240";
        continue; /* Loop/switch isn't completed */
_L3:
        displaymetrics = "320";
        if (true) goto _L5; else goto _L4
_L4:
    }

    public String getLogosBaseUrl()
    {
        return logosBaseUrl;
    }

    public String getName()
    {
        return name;
    }

    public String getSponsorImageBaseURL()
    {
        return sponsorImageBaseURL;
    }

    public String getSponsorImageUrlPhone()
    {
        return sponsorImageUrlPhone;
    }

    public String getSponsorImageUrlTablet()
    {
        return sponsorImageUrlTablet;
    }

    public String getSponsorLinkUrlPhone()
    {
        return sponsorLinkUrlPhone;
    }

    public String getSponsorLinkUrlTablet()
    {
        return sponsorLinkUrlTablet;
    }

    public String getSportAdLogo()
    {
        return sportAdLogo;
    }

    public String getSportLogo()
    {
        return sportLogo;
    }

    public boolean isRSN()
    {
        return isRSN;
    }

    public void setAdCode(String s)
    {
        adCode = s;
    }

    public void setCode(String s)
    {
        code = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SportParcelablePlease.writeToParcel(this, parcel, i);
    }

}
