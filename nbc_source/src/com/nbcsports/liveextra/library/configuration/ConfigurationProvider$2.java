// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import rx.Subscription;
import rx.functions.Action0;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            ConfigurationProvider, ConfigurationPollingSubscriber

class this._cls0
    implements Action0
{

    final ConfigurationProvider this$0;

    public void call()
    {
        ConfigurationProvider.access$100(ConfigurationProvider.this).cancel();
        ConfigurationProvider.access$200(ConfigurationProvider.this).unsubscribe();
    }

    criber()
    {
        this$0 = ConfigurationProvider.this;
        super();
    }
}
