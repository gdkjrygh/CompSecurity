// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            RuntimeConfiguration, Configuration

class this._cls0 extends Subscriber
{

    final RuntimeConfiguration this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
    }

    public void onNext(Configuration configuration)
    {
        RuntimeConfiguration.access$000(RuntimeConfiguration.this, configuration);
    }

    public volatile void onNext(Object obj)
    {
        onNext((Configuration)obj);
    }

    ()
    {
        this$0 = RuntimeConfiguration.this;
        super();
    }
}
