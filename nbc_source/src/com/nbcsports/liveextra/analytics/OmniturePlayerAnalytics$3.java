// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics;

import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.utils.TimeRange;
import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.analytics:
//            OmniturePlayerAnalytics

class this._cls0 extends Subscriber
{

    final OmniturePlayerAnalytics this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
    }

    public void onNext(Long long1)
    {
        long l = OmniturePlayerAnalytics.access$100(OmniturePlayerAnalytics.this).getLocalTime();
        if (l != 0L)
        {
            float f = (float)(OmniturePlayerAnalytics.access$100(OmniturePlayerAnalytics.this).getPlaybackRange().getDuration() / l) * 1.0F;
            if ((double)f > 0.75D && !OmniturePlayerAnalytics.access$400(OmniturePlayerAnalytics.this))
            {
                OmniturePlayerAnalytics.access$402(OmniturePlayerAnalytics.this, true);
                logEvent(9);
            }
            if ((double)f > 0.5D && !OmniturePlayerAnalytics.access$500(OmniturePlayerAnalytics.this))
            {
                OmniturePlayerAnalytics.access$502(OmniturePlayerAnalytics.this, true);
                logEvent(8);
            }
            if ((double)f > 0.25D && !OmniturePlayerAnalytics.access$600(OmniturePlayerAnalytics.this))
            {
                OmniturePlayerAnalytics.access$602(OmniturePlayerAnalytics.this, true);
                logEvent(7);
                return;
            }
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((Long)obj);
    }

    A()
    {
        this$0 = OmniturePlayerAnalytics.this;
        super();
    }
}
