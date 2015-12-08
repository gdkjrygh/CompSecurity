// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.common.cache.Cache;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            PlasticCardModelPublisher

final class val.eventId
    implements AsyncCallback
{

    final PlasticCardModelPublisher this$0;
    final Object val$eventId;

    private void onSuccess(com.google.wallet.proto.nstrumentInfo nstrumentinfo)
    {
        if (nstrumentinfo != null && cache.getIfPresent(PlasticCardModelPublisher.CACHE_KEY) == null)
        {
            cache.put(PlasticCardModelPublisher.CACHE_KEY, nstrumentinfo);
            PlasticCardModelPublisher.access$200(PlasticCardModelPublisher.this).post(val$eventId, PlasticCardModelPublisher.access$500(PlasticCardModelPublisher.this, nstrumentinfo));
        }
    }

    public final void onFailure(Exception exception)
    {
        WLog.e(PlasticCardModelPublisher.access$700(), "Error reading FrontingInstrumentInfo from db", exception);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.nstrumentInfo)obj);
    }

    ()
    {
        this$0 = final_plasticcardmodelpublisher;
        val$eventId = Object.this;
        super();
    }
}
