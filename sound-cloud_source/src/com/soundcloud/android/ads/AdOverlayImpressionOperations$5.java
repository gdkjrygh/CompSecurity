// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.events.ActivityLifeCycleEvent;
import com.soundcloud.android.events.AdOverlayEvent;
import com.soundcloud.android.events.PlayerUIEvent;
import rx.b.h;

// Referenced classes of package com.soundcloud.android.ads:
//            AdOverlayImpressionOperations

class this._cls0
    implements h
{

    final AdOverlayImpressionOperations this$0;

    public sualImpressionState call(AdOverlayEvent adoverlayevent, ActivityLifeCycleEvent activitylifecycleevent, PlayerUIEvent playeruievent)
    {
        boolean flag2 = true;
        boolean flag;
        boolean flag1;
        if (adoverlayevent.getKind() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (activitylifecycleevent.getKind() == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (playeruievent.getKind() != 0)
        {
            flag2 = false;
        }
        return new sualImpressionState(flag, flag1, flag2, adoverlayevent.getCurrentPlayingUrn(), adoverlayevent.getAdMetaData(), adoverlayevent.getTrackSourceInfo());
    }

    public volatile Object call(Object obj, Object obj1, Object obj2)
    {
        return call((AdOverlayEvent)obj, (ActivityLifeCycleEvent)obj1, (PlayerUIEvent)obj2);
    }

    sualImpressionState()
    {
        this$0 = AdOverlayImpressionOperations.this;
        super();
    }
}
