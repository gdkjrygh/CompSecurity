// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.events.AdOverlayTrackingEvent;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.ads:
//            AdOverlayImpressionOperations

class this._cls0
    implements f
{

    final AdOverlayImpressionOperations this$0;

    public AdOverlayTrackingEvent call(sualImpressionState sualimpressionstate)
    {
        return AdOverlayTrackingEvent.forImpression(sualImpressionState.access._mth000(sualimpressionstate), sualImpressionState.access._mth100(sualimpressionstate), AdOverlayImpressionOperations.access$200(AdOverlayImpressionOperations.this).getLoggedInUserUrn(), sualImpressionState.access._mth300(sualimpressionstate));
    }

    public volatile Object call(Object obj)
    {
        return call((sualImpressionState)obj);
    }

    sualImpressionState()
    {
        this$0 = AdOverlayImpressionOperations.this;
        super();
    }
}
