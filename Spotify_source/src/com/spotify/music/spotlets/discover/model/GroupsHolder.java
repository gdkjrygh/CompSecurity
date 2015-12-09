// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.discover.model;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.spotify.music.spotlets.discover.model:
//            DiscoverGroupModel

public class GroupsHolder
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            parcel = parcel.readParcelableArray(com/spotify/music/spotlets/discover/model/DiscoverGroupModel.getClassLoader());
            DiscoverGroupModel adiscovergroupmodel[] = new DiscoverGroupModel[parcel.length];
            System.arraycopy(parcel, 0, adiscovergroupmodel, 0, parcel.length);
            return new GroupsHolder(adiscovergroupmodel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new GroupsHolder[i];
        }

    };
    public final DiscoverGroupModel a[];

    public GroupsHolder(DiscoverGroupModel adiscovergroupmodel[])
    {
        a = adiscovergroupmodel;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelableArray(a, 0);
    }

}
