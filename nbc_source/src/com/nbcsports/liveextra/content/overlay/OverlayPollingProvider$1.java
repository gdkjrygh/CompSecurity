// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.overlay;


// Referenced classes of package com.nbcsports.liveextra.content.overlay:
//            OverlayPollingProvider, OverlayPollingSubscriber

class this._cls0
    implements Runnable
{

    final OverlayPollingProvider this$0;

    public void run()
    {
        OverlayPollingProvider.access$000(OverlayPollingProvider.this).cancel();
    }

    ()
    {
        this$0 = OverlayPollingProvider.this;
        super();
    }
}
