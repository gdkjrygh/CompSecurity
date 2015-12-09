// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.discover.model;

import android.os.Parcel;

// Referenced classes of package com.spotify.music.spotlets.discover.model:
//            DiscoverGroupModel, DiscoverStoryModel, DiscoverReasonModel

final class 
    implements android.os.ver.model.DiscoverGroupModel._cls1
{

    public final Object createFromParcel(Parcel parcel)
    {
        android.os.Parcelable aparcelable[] = parcel.readParcelableArray(com/spotify/music/spotlets/discover/model/DiscoverGroupModel.getClassLoader());
        DiscoverStoryModel adiscoverstorymodel[] = new DiscoverStoryModel[aparcelable.length];
        System.arraycopy(aparcelable, 0, adiscoverstorymodel, 0, aparcelable.length);
        return new DiscoverGroupModel(adiscoverstorymodel, (DiscoverReasonModel)parcel.readParcelable(com/spotify/music/spotlets/discover/model/DiscoverReasonModel.getClassLoader()));
    }

    public final volatile Object[] newArray(int i)
    {
        return new DiscoverGroupModel[i];
    }

    ()
    {
    }
}
