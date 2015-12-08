// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            AdConfigurationParcelablePlease

public class AdConfiguration
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public AdConfiguration createFromParcel(Parcel parcel)
        {
            AdConfiguration adconfiguration = new AdConfiguration();
            AdConfigurationParcelablePlease.readFromParcel(adconfiguration, parcel);
            return adconfiguration;
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public AdConfiguration[] newArray(int i)
        {
            return new AdConfiguration[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    String favorites;
    String featured;
    String none;
    String sports;
    String sportsFamily;

    public AdConfiguration()
    {
    }

    public AdConfiguration(Parcel parcel)
    {
    }

    public int describeContents()
    {
        return 0;
    }

    public String getFavorites()
    {
        return favorites;
    }

    public String getFeatured()
    {
        return featured;
    }

    public String getNone()
    {
        return none;
    }

    public String getSports()
    {
        return sports;
    }

    public String getSportsFamily()
    {
        return sportsFamily;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AdConfigurationParcelablePlease.writeToParcel(this, parcel, i);
    }

}
