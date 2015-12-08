// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.events.VisualAdImpressionEvent;
import com.soundcloud.android.playback.PlayQueueItem;
import com.soundcloud.android.playback.PlayQueueManager;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.ads:
//            VisualAdImpressionOperations

class this._cls0
    implements f
{

    final VisualAdImpressionOperations this$0;

    public VisualAdImpressionEvent call(ate ate)
    {
        return new VisualAdImpressionEvent(VisualAdImpressionOperations.access$000(VisualAdImpressionOperations.this).getCurrentPlayQueueItem().getMetaData(), ate.access._mth100(ate), VisualAdImpressionOperations.access$200(VisualAdImpressionOperations.this).getLoggedInUserUrn(), VisualAdImpressionOperations.access$000(VisualAdImpressionOperations.this).getCurrentTrackSourceInfo());
    }

    public volatile Object call(Object obj)
    {
        return call((ate)obj);
    }

    ate()
    {
        this$0 = VisualAdImpressionOperations.this;
        super();
    }
}
