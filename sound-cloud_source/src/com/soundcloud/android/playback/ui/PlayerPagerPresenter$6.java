// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagerPresenter

class val.adOverlayData
    implements b
{

    final PlayerPagerPresenter this$0;
    final PropertySet val$adOverlayData;

    public void call(PropertySet propertyset)
    {
        val$adOverlayData.put(TrackProperty.URN, propertyset.get(TrackProperty.URN)).put(TrackProperty.TITLE, propertyset.get(TrackProperty.TITLE)).put(TrackProperty.CREATOR_NAME, propertyset.get(TrackProperty.CREATOR_NAME)).put(TrackProperty.CREATOR_URN, propertyset.get(TrackProperty.CREATOR_URN));
    }

    public volatile void call(Object obj)
    {
        call((PropertySet)obj);
    }

    ()
    {
        this$0 = final_playerpagerpresenter;
        val$adOverlayData = PropertySet.this;
        super();
    }
}
