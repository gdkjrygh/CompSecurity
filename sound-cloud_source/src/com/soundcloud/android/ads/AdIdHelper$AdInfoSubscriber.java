// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.optional.Optional;

// Referenced classes of package com.soundcloud.android.ads:
//            AdIdHelper

private class <init> extends DefaultSubscriber
{

    final AdIdHelper this$0;

    public void onNext(com.google.android.gms.ads.identifier. )
    {
        AdIdHelper.access$202(AdIdHelper.this, Optional.of(.Id()));
        AdIdHelper adidhelper = AdIdHelper.this;
        boolean flag;
        if (!.imitAdTrackingEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        AdIdHelper.access$302(adidhelper, flag);
        AdIdHelper.access$400();
        (new StringBuilder("Loaded ADID: ")).append(AdIdHelper.access$200(AdIdHelper.this)).append("\nTracking:").append(AdIdHelper.access$300(AdIdHelper.this));
    }

    public volatile void onNext(Object obj)
    {
        onNext((com.google.android.gms.ads.identifier.imitAdTrackingEnabled)obj);
    }

    private nt.Info()
    {
        this$0 = AdIdHelper.this;
        super();
    }

    init>(init> init>)
    {
        this();
    }
}
