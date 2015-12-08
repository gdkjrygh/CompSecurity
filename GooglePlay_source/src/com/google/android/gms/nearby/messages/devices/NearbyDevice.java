// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.nearby.messages.devices:
//            NearbyDeviceCreator, NearbyDeviceId

public class NearbyDevice
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new NearbyDeviceCreator();
    public static final NearbyDevice UNKNOWN_DEVICE;
    final NearbyDeviceId mId;
    final String mUrl;
    final int mVersionCode;

    NearbyDevice(int i, NearbyDeviceId nearbydeviceid, String s)
    {
        mVersionCode = i;
        mId = nearbydeviceid;
        mUrl = s;
    }

    private NearbyDevice(NearbyDeviceId nearbydeviceid)
    {
        this(1, nearbydeviceid, null);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof NearbyDevice))
            {
                return false;
            }
            obj = (NearbyDevice)obj;
            if (!Objects.equal(mId, ((NearbyDevice) (obj)).mId) || !Objects.equal(mUrl, ((NearbyDevice) (obj)).mUrl))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mId, mUrl
        });
    }

    public String toString()
    {
        return (new StringBuilder("NearbyDevice{id=")).append(mId).append("url=").append(mUrl).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        NearbyDeviceCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        UNKNOWN_DEVICE = new NearbyDevice(NearbyDeviceId.UNKNOWN_ID);
    }
}
