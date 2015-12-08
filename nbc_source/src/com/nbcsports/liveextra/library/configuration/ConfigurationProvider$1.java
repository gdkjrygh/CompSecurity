// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import rx.Subscriber;
import rx.subjects.BehaviorSubject;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            ConfigurationProvider, Configuration

class this._cls0 extends Subscriber
{

    final ConfigurationProvider this$0;

    public void onCompleted()
    {
        ConfigurationProvider.access$000(ConfigurationProvider.this).onCompleted();
    }

    public void onError(Throwable throwable)
    {
        ConfigurationProvider.access$000(ConfigurationProvider.this).onError(throwable);
    }

    public void onNext(Configuration configuration)
    {
        ConfigurationProvider.access$000(ConfigurationProvider.this).onNext(configuration);
    }

    public volatile void onNext(Object obj)
    {
        onNext((Configuration)obj);
    }

    ()
    {
        this$0 = ConfigurationProvider.this;
        super();
    }
}
