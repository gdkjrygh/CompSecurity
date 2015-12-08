// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import android.os.Parcel;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            AdobePassConfiguration

public class AdobePassConfigurationParcelablePlease
{

    public AdobePassConfigurationParcelablePlease()
    {
    }

    public static void readFromParcel(AdobePassConfiguration adobepassconfiguration, Parcel parcel)
    {
        boolean flag = true;
        if (parcel.readByte() != 1)
        {
            flag = false;
        }
        adobepassconfiguration.initOnAppStart = flag;
    }

    public static void writeToParcel(AdobePassConfiguration adobepassconfiguration, Parcel parcel, int i)
    {
        if (adobepassconfiguration.initOnAppStart)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }
}
