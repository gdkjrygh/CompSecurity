// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            AdobePassConfigurationParcelablePlease

public class AdobePassConfiguration
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public AdobePassConfiguration createFromParcel(Parcel parcel)
        {
            AdobePassConfiguration adobepassconfiguration = new AdobePassConfiguration();
            AdobePassConfigurationParcelablePlease.readFromParcel(adobepassconfiguration, parcel);
            return adobepassconfiguration;
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public AdobePassConfiguration[] newArray(int i)
        {
            return new AdobePassConfiguration[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    boolean initOnAppStart;

    public AdobePassConfiguration()
    {
    }

    public AdobePassConfiguration(Parcel parcel)
    {
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean isInitOnAppStart()
    {
        return initOnAppStart;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AdobePassConfigurationParcelablePlease.writeToParcel(this, parcel, i);
    }

}
