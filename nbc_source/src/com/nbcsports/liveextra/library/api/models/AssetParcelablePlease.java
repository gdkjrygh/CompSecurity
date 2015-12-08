// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.api.models;

import android.os.Parcel;
import com.nbcsports.liveextra.library.core.ListStringBagger;
import java.util.ArrayList;

// Referenced classes of package com.nbcsports.liveextra.library.api.models:
//            NbcDate, Asset, VideoSource

public class AssetParcelablePlease
{

    public AssetParcelablePlease()
    {
    }

    public static void readFromParcel(Asset asset, Parcel parcel)
    {
        boolean flag = true;
        asset.expirationDate = (NbcDate)parcel.readParcelable(com/nbcsports/liveextra/library/api/models/NbcDate.getClassLoader());
        asset.image = parcel.readString();
        asset.pid = parcel.readString();
        asset.eventId = parcel.readString();
        asset.id = parcel.readString();
        asset.title = parcel.readString();
        asset.trackName = parcel.readString();
        asset.info = parcel.readString();
        asset.status = parcel.readInt();
        asset.start = (NbcDate)parcel.readParcelable(com/nbcsports/liveextra/library/api/models/NbcDate.getClassLoader());
        asset.link = parcel.readString();
        asset.oc = parcel.readInt();
        asset.rsndma = parcel.readString();
        asset.entitlementId = parcel.readString();
        asset.free = parcel.readInt();
        asset.provider = parcel.readString();
        asset.channel = parcel.readString();
        asset.sportName = parcel.readString();
        asset.league = parcel.readString();
        asset.sport = parcel.readString();
        asset.sportCode = parcel.readString();
        asset.tour = parcel.readString();
        asset.streamUrl = parcel.readString();
        asset.backupUrl = parcel.readString();
        asset.overlayId = parcel.readString();
        asset.hdsUrl = parcel.readString();
        asset.hdsUrlAlt = parcel.readString();
        asset.blackout = parcel.readString();
        asset.blackoutId = parcel.readString();
        asset.duration = parcel.readDouble();
        asset.overlayGameId = parcel.readString();
        asset.platform = parcel.readString();
        asset.platforms = parcel.readString();
        asset.devices = (new ListStringBagger()).read(parcel);
        asset.mvpdAuth = parcel.readString();
        if (parcel.readByte() != 1)
        {
            flag = false;
        }
        if (flag)
        {
            ArrayList arraylist = new ArrayList();
            parcel.readList(arraylist, com/nbcsports/liveextra/library/api/models/VideoSource.getClassLoader());
            asset.videoSources = arraylist;
            return;
        } else
        {
            asset.videoSources = null;
            return;
        }
    }

    public static void writeToParcel(Asset asset, Parcel parcel, int i)
    {
        parcel.writeParcelable(asset.expirationDate, i);
        parcel.writeString(asset.image);
        parcel.writeString(asset.pid);
        parcel.writeString(asset.eventId);
        parcel.writeString(asset.id);
        parcel.writeString(asset.title);
        parcel.writeString(asset.trackName);
        parcel.writeString(asset.info);
        parcel.writeInt(asset.status);
        parcel.writeParcelable(asset.start, i);
        parcel.writeString(asset.link);
        parcel.writeInt(asset.oc);
        parcel.writeString(asset.rsndma);
        parcel.writeString(asset.entitlementId);
        parcel.writeInt(asset.free);
        parcel.writeString(asset.provider);
        parcel.writeString(asset.channel);
        parcel.writeString(asset.sportName);
        parcel.writeString(asset.league);
        parcel.writeString(asset.sport);
        parcel.writeString(asset.sportCode);
        parcel.writeString(asset.tour);
        parcel.writeString(asset.streamUrl);
        parcel.writeString(asset.backupUrl);
        parcel.writeString(asset.overlayId);
        parcel.writeString(asset.hdsUrl);
        parcel.writeString(asset.hdsUrlAlt);
        parcel.writeString(asset.blackout);
        parcel.writeString(asset.blackoutId);
        parcel.writeDouble(asset.duration);
        parcel.writeString(asset.overlayGameId);
        parcel.writeString(asset.platform);
        parcel.writeString(asset.platforms);
        (new ListStringBagger()).write(asset.devices, parcel, i);
        parcel.writeString(asset.mvpdAuth);
        if (asset.videoSources != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        if (asset.videoSources != null)
        {
            parcel.writeList(asset.videoSources);
        }
    }
}
