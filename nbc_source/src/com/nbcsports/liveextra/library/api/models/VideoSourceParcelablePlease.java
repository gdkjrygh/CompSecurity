// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.api.models;

import android.os.Parcel;
import com.nbcsports.liveextra.library.core.ListStringBagger;

// Referenced classes of package com.nbcsports.liveextra.library.api.models:
//            VideoSource

public class VideoSourceParcelablePlease
{

    public VideoSourceParcelablePlease()
    {
    }

    public static void readFromParcel(VideoSource videosource, Parcel parcel)
    {
        boolean flag = true;
        videosource.id = parcel.readString();
        videosource.assetID = parcel.readString();
        if (parcel.readByte() != 1)
        {
            flag = false;
        }
        videosource.isDefault = flag;
        videosource.name = parcel.readString();
        videosource.trackName = parcel.readString();
        videosource.description = parcel.readString();
        videosource.androidStreamUrl = parcel.readString();
        videosource.failoverStreamUrl = parcel.readString();
        videosource.ottStreamUrlAlt = parcel.readString();
        videosource.thumbnail = parcel.readString();
        videosource.csid = parcel.readString();
        videosource.camSponsor = parcel.readString();
        videosource.devices = (new ListStringBagger()).read(parcel);
    }

    public static void writeToParcel(VideoSource videosource, Parcel parcel, int i)
    {
        parcel.writeString(videosource.id);
        parcel.writeString(videosource.assetID);
        int j;
        if (videosource.isDefault)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeByte((byte)j);
        parcel.writeString(videosource.name);
        parcel.writeString(videosource.trackName);
        parcel.writeString(videosource.description);
        parcel.writeString(videosource.androidStreamUrl);
        parcel.writeString(videosource.failoverStreamUrl);
        parcel.writeString(videosource.ottStreamUrlAlt);
        parcel.writeString(videosource.thumbnail);
        parcel.writeString(videosource.csid);
        parcel.writeString(videosource.camSponsor);
        (new ListStringBagger()).write(videosource.devices, parcel, i);
    }
}
