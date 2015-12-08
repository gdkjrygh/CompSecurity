// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics.conviva;

import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.conviva.LivePass;
import com.nbcsports.liveextra.library.player.AdPlaybackEventListenerStub;

// Referenced classes of package com.nbcsports.liveextra.analytics.conviva:
//            PrimetimeCustomMediaPlayerProxy

class this._cls0 extends AdPlaybackEventListenerStub
{

    final PrimetimeCustomMediaPlayerProxy this$0;

    public void onAdBreakComplete(AdBreak adbreak)
    {
        super.onAdBreakComplete(adbreak);
        LivePass.adEnd(PrimetimeCustomMediaPlayerProxy.access$400(PrimetimeCustomMediaPlayerProxy.this));
        PrimetimeCustomMediaPlayerProxy.access$302(PrimetimeCustomMediaPlayerProxy.this, false);
        PrimetimeCustomMediaPlayerProxy.access$000(PrimetimeCustomMediaPlayerProxy.this, 3);
    }

    public void onAdBreakStart(AdBreak adbreak)
    {
        super.onAdBreakStart(adbreak);
        PrimetimeCustomMediaPlayerProxy.access$302(PrimetimeCustomMediaPlayerProxy.this, true);
        LivePass.adStart(PrimetimeCustomMediaPlayerProxy.access$400(PrimetimeCustomMediaPlayerProxy.this));
        PrimetimeCustomMediaPlayerProxy.access$000(PrimetimeCustomMediaPlayerProxy.this, 98);
    }

    Q()
    {
        this$0 = PrimetimeCustomMediaPlayerProxy.this;
        super();
    }
}
