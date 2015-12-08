// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration;

import com.soundcloud.android.offline.OfflineServiceInitiator;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.configuration:
//            ConfigurationFeatureController

private class <init> extends DefaultSubscriber
{

    final ConfigurationFeatureController this$0;

    public void onNext(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            ConfigurationFeatureController.access$100(ConfigurationFeatureController.this).subscribe();
            return;
        } else
        {
            ConfigurationFeatureController.access$100(ConfigurationFeatureController.this).unsubscribe();
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((Boolean)obj);
    }

    private ()
    {
        this$0 = ConfigurationFeatureController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
