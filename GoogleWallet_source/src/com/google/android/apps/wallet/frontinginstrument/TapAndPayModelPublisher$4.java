// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.frontinginstrument;

import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.frontinginstrument:
//            TapAndPayModelPublisher, TapAndPayModelEvent

final class this._cls0
    implements AsyncCallback
{

    final TapAndPayModelPublisher this$0;

    private void onSuccess(com.google.wallet.proto.gInstrumentInfo ginstrumentinfo)
    {
        TapAndPayModelPublisher.access$602(TapAndPayModelPublisher.this, null);
        TapAndPayModelPublisher tapandpaymodelpublisher = TapAndPayModelPublisher.this;
        System _tmp = TapAndPayModelPublisher.access$000(TapAndPayModelPublisher.this);
        TapAndPayModelPublisher.access$102(tapandpaymodelpublisher, System.currentTimeMillis());
        if (ginstrumentinfo == null)
        {
            return;
        } else
        {
            ginstrumentinfo = TapAndPayModelPublisher.access$700(TapAndPayModelPublisher.this, ginstrumentinfo);
            TapAndPayModelPublisher.access$800(TapAndPayModelPublisher.this).post(new TapAndPayModelEvent(ginstrumentinfo, TapAndPayModelPublisher.access$600(TapAndPayModelPublisher.this)));
            return;
        }
    }

    public final void onFailure(Exception exception)
    {
        TapAndPayModelPublisher.access$602(TapAndPayModelPublisher.this, exception);
        TapAndPayModelPublisher.access$900(TapAndPayModelPublisher.this, null);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.gInstrumentInfo)obj);
    }

    Q()
    {
        this$0 = TapAndPayModelPublisher.this;
        super();
    }
}
