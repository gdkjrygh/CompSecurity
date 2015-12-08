// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.nearby.bootstrap:
//            DeviceCreator

public class Device
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new DeviceCreator();
    final String description;
    final String deviceId;
    final byte deviceType;
    final String name;
    final int versionCode;

    Device(int i, String s, String s1, String s2, byte byte0)
    {
        versionCode = i;
        name = Preconditions.checkNotEmpty(s);
        description = (String)Preconditions.checkNotNull(s1);
        deviceId = (String)Preconditions.checkNotNull(s2);
        boolean flag;
        if (byte0 <= 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Unknown device type");
        deviceType = byte0;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append(name).append(": ").append(description).append("[").append(deviceType).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        DeviceCreator.writeToParcel$38282ba3(this, parcel);
    }

}
