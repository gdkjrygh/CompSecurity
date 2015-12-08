// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.os.Parcel;
import com.nbcsports.liveextra.library.core.ListStringBagger;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            Channel

public class ChannelParcelablePlease
{

    public ChannelParcelablePlease()
    {
    }

    public static void readFromParcel(Channel channel, Parcel parcel)
    {
        channel.resourceId = parcel.readString();
        channel.requestorId = parcel.readString();
        channel.signedRequestorId = parcel.readString();
        channel.mvpdPremium = (new ListStringBagger()).read(parcel);
        channel.mvpdStandard = (new ListStringBagger()).read(parcel);
    }

    public static void writeToParcel(Channel channel, Parcel parcel, int i)
    {
        parcel.writeString(channel.resourceId);
        parcel.writeString(channel.requestorId);
        parcel.writeString(channel.signedRequestorId);
        (new ListStringBagger()).write(channel.mvpdPremium, parcel, i);
        (new ListStringBagger()).write(channel.mvpdStandard, parcel, i);
    }
}
