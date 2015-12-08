// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.overlay;

import android.os.Handler;
import rx.functions.Action0;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.content.overlay:
//            OverlayPollingProvider, OverlayPollingSubscriber

class this._cls0
    implements Action0
{

    final OverlayPollingProvider this$0;

    public void call()
    {
        OverlayPollingProvider.access$200(OverlayPollingProvider.this).postDelayed(OverlayPollingProvider.access$100(OverlayPollingProvider.this), 5000L);
        Timber.d((new StringBuilder()).append("Cancelling polling for: ").append(OverlayPollingProvider.access$000(OverlayPollingProvider.this).getResultClass().getSimpleName()).toString(), new Object[0]);
    }

    ()
    {
        this$0 = OverlayPollingProvider.this;
        super();
    }
}
