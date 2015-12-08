// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics.conviva;

import com.nbcsports.liveextra.library.player.QosEventListenerStub;

// Referenced classes of package com.nbcsports.liveextra.analytics.conviva:
//            PrimetimeCustomMediaPlayerProxy

class this._cls0 extends QosEventListenerStub
{

    final PrimetimeCustomMediaPlayerProxy this$0;

    public void onBufferComplete()
    {
        super.onBufferComplete();
        PrimetimeCustomMediaPlayerProxy.access$000(PrimetimeCustomMediaPlayerProxy.this, 3);
    }

    public void onBufferStart()
    {
        super.onBufferStart();
        PrimetimeCustomMediaPlayerProxy.access$000(PrimetimeCustomMediaPlayerProxy.this, 6);
    }

    Q()
    {
        this$0 = PrimetimeCustomMediaPlayerProxy.this;
        super();
    }
}
