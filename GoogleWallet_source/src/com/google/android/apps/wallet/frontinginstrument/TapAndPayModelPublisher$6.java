// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.frontinginstrument;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.frontinginstrument:
//            TapAndPayModelPublisher, TapAndPayModelEvent

final class val.doAfter
    implements AsyncCallback
{

    final TapAndPayModelPublisher this$0;
    final Runnable val$doAfter;

    private void onSuccess(com.google.wallet.proto.gInstrumentInfo ginstrumentinfo)
    {
        ginstrumentinfo = TapAndPayModelPublisher.access$700(TapAndPayModelPublisher.this, ginstrumentinfo);
        TapAndPayModelPublisher.access$800(TapAndPayModelPublisher.this).post(new TapAndPayModelEvent(ginstrumentinfo, TapAndPayModelPublisher.access$600(TapAndPayModelPublisher.this)));
        if (val$doAfter != null)
        {
            val$doAfter.run();
        }
    }

    public final void onFailure(Exception exception)
    {
        WLog.e(TapAndPayModelPublisher.access$1000(), "Exception retrieving FrontingInstrumentInfo from db", exception);
        if (val$doAfter != null)
        {
            val$doAfter.run();
        }
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.gInstrumentInfo)obj);
    }

    Q()
    {
        this$0 = final_tapandpaymodelpublisher;
        val$doAfter = Runnable.this;
        super();
    }
}
