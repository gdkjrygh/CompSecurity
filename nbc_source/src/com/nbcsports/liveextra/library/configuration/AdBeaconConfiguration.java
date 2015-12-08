// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            AdBeaconConfigurationParcelablePlease

public class AdBeaconConfiguration
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public AdBeaconConfiguration createFromParcel(Parcel parcel)
        {
            AdBeaconConfiguration adbeaconconfiguration = new AdBeaconConfiguration();
            AdBeaconConfigurationParcelablePlease.readFromParcel(adbeaconconfiguration, parcel);
            return adbeaconconfiguration;
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public AdBeaconConfiguration[] newArray(int i)
        {
            return new AdBeaconConfiguration[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    String logo;
    String splash;

    public AdBeaconConfiguration()
    {
    }

    public AdBeaconConfiguration(Parcel parcel)
    {
    }

    public AdBeaconConfiguration(String s, String s1)
    {
        splash = s;
        logo = s1;
    }

    protected boolean canEqual(Object obj)
    {
        return obj instanceof AdBeaconConfiguration;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof AdBeaconConfiguration))
            {
                return false;
            }
            obj = (AdBeaconConfiguration)obj;
            if (!((AdBeaconConfiguration) (obj)).canEqual(this))
            {
                return false;
            }
            String s = getSplash();
            String s1 = ((AdBeaconConfiguration) (obj)).getSplash();
            if (s != null ? !s.equals(s1) : s1 != null)
            {
                return false;
            }
            s = getLogo();
            obj = ((AdBeaconConfiguration) (obj)).getLogo();
            if (s != null ? !s.equals(obj) : obj != null)
            {
                return false;
            }
        }
        return true;
    }

    public String getLogo()
    {
        return logo;
    }

    public String getSplash()
    {
        return splash;
    }

    public int hashCode()
    {
        int j = 0;
        String s = getSplash();
        int i;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = s.hashCode();
        }
        s = getLogo();
        if (s != null)
        {
            j = s.hashCode();
        }
        return (i + 59) * 59 + j;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AdBeaconConfigurationParcelablePlease.writeToParcel(this, parcel, i);
    }

}
