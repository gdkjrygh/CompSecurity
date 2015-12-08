// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import com.soundcloud.android.stations.StationOnboardingStreamItem;
import com.soundcloud.android.stations.StationsOperations;
import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.stream:
//            SoundStreamOperations

class this._cls0
    implements f
{

    final SoundStreamOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public List call(List list)
    {
        if (SoundStreamOperations.access$300(SoundStreamOperations.this).isEnabled(Flag.STATIONS_SOFT_LAUNCH) && SoundStreamOperations.access$400(SoundStreamOperations.this).shouldDisplayOnboardingStreamItem() && SoundStreamOperations.access$500(SoundStreamOperations.this, list))
        {
            list.add(0, new StationOnboardingStreamItem());
        }
        return list;
    }

    mItem()
    {
        this$0 = SoundStreamOperations.this;
        super();
    }
}
