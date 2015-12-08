// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.streamerProxies.adobe;

import com.adobe.mediacore.qos.LoadInfo;

// Referenced classes of package com.conviva.streamerProxies.adobe:
//            PrimeTimeDefaultMediaPlayerProxy

class this._cls0
    implements com.adobe.mediacore.PlayerProxy._cls2
{

    final PrimeTimeDefaultMediaPlayerProxy this$0;

    public void onBufferComplete()
    {
        PrimeTimeDefaultMediaPlayerProxy.access$002(PrimeTimeDefaultMediaPlayerProxy.this, false);
    }

    public void onBufferStart()
    {
        PrimeTimeDefaultMediaPlayerProxy.access$100(PrimeTimeDefaultMediaPlayerProxy.this, 6);
        PrimeTimeDefaultMediaPlayerProxy.access$002(PrimeTimeDefaultMediaPlayerProxy.this, true);
    }

    public void onLoadInfo(LoadInfo loadinfo)
    {
    }

    public void onOperationFailed(com.adobe.mediacore.PlayerProxy._cls2 _pcls2)
    {
    }

    public void onSeekComplete(long l)
    {
    }

    public void onSeekStart()
    {
    }

    ()
    {
        this$0 = PrimeTimeDefaultMediaPlayerProxy.this;
        super();
    }
}
