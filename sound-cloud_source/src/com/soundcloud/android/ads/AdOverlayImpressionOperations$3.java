// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.events.AdOverlayEvent;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.ads:
//            AdOverlayImpressionOperations

class this._cls0
    implements b
{

    final AdOverlayImpressionOperations this$0;

    public void call(AdOverlayEvent adoverlayevent)
    {
        if (adoverlayevent.getKind() == 1)
        {
            AdOverlayImpressionOperations.access$402(AdOverlayImpressionOperations.this, false);
        }
    }

    public volatile void call(Object obj)
    {
        call((AdOverlayEvent)obj);
    }

    ()
    {
        this$0 = AdOverlayImpressionOperations.this;
        super();
    }
}
