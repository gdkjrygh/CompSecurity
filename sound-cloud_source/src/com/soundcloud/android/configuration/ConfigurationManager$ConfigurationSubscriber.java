// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import rx.b;

// Referenced classes of package com.soundcloud.android.configuration:
//            ConfigurationManager, Configuration, DeviceManagement, DeviceManagementStorage, 
//            ConfigurationOperations

private class <init> extends DefaultSubscriber
{

    final ConfigurationManager this$0;

    public void onNext(Configuration configuration)
    {
        if (configuration.deviceManagement.isNotAuthorized())
        {
            ConfigurationManager.access$200(ConfigurationManager.this).setDeviceConflict();
            fireAndForget(ConfigurationManager.access$400(ConfigurationManager.this).logout().flatMap(ConfigurationManager.access$300(ConfigurationManager.this)));
            return;
        } else
        {
            ConfigurationManager.access$500(ConfigurationManager.this).saveConfiguration(configuration);
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((Configuration)obj);
    }

    private ()
    {
        this$0 = ConfigurationManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
