// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.discover.model;

import android.os.Parcel;

// Referenced classes of package com.spotify.music.spotlets.discover.model:
//            GroupsHolder, DiscoverGroupModel

final class del
    implements android.os.tor
{

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

    del()
    {
    }
}
