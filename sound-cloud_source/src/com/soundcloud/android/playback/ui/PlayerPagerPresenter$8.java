// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.ads.AdProperty;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.java.collections.PropertySet;
import rx.b.g;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagerPresenter

class val.audioAd
    implements g
{

    final PlayerPagerPresenter this$0;
    final PropertySet val$audioAd;

    public PropertySet call(PropertySet propertyset, PropertySet propertyset1)
    {
        return propertyset.merge(val$audioAd).put(AdProperty.MONETIZABLE_TRACK_TITLE, propertyset1.get(PlayableProperty.TITLE)).put(AdProperty.MONETIZABLE_TRACK_CREATOR, propertyset1.get(PlayableProperty.CREATOR_NAME));
    }

    public volatile Object call(Object obj, Object obj1)
    {
        return call((PropertySet)obj, (PropertySet)obj1);
    }

    ()
    {
        this$0 = final_playerpagerpresenter;
        val$audioAd = PropertySet.this;
        super();
    }
}
