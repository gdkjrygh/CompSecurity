// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.ads.AdProperty;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagerPresenter

class val.videoAd
    implements f
{

    final PlayerPagerPresenter this$0;
    final PropertySet val$videoAd;

    public PropertySet call(PropertySet propertyset)
    {
        return val$videoAd.put(AdProperty.MONETIZABLE_TRACK_TITLE, propertyset.get(PlayableProperty.TITLE)).put(AdProperty.MONETIZABLE_TRACK_CREATOR, propertyset.get(PlayableProperty.CREATOR_NAME));
    }

    public volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    ()
    {
        this$0 = final_playerpagerpresenter;
        val$videoAd = PropertySet.this;
        super();
    }
}
