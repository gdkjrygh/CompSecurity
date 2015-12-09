// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            PlasticCardModelPublisher

final class this._cls0
    implements AsyncCallback
{

    final PlasticCardModelPublisher this$0;

    private void onSuccess(com.google.wallet.proto.nstrumentInfo nstrumentinfo)
    {
        PlasticCardModelPublisher.access$400(PlasticCardModelPublisher.this, nstrumentinfo);
    }

    public final void onFailure(Exception exception)
    {
        PlasticCardModelPublisher.access$200(PlasticCardModelPublisher.this).post(PlasticCardModelPublisher.access$900(PlasticCardModelPublisher.this, exception));
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.nstrumentInfo)obj);
    }

    ()
    {
        this$0 = PlasticCardModelPublisher.this;
        super();
    }
}
