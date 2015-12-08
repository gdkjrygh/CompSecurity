// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.core;

import android.util.Pair;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import java.util.concurrent.TimeUnit;
import rx.Subscriber;
import rx.functions.Action0;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.library.core:
//            PollingSubscriber

class this._cls0
    implements Action0
{

    final PollingSubscriber this$0;

    public void call()
    {
        Object obj;
        try
        {
            obj = listener.getUrl();
        }
        catch (Exception exception)
        {
            if (PollingSubscriber.access$500(PollingSubscriber.this) != null)
            {
                PollingSubscriber.access$500(PollingSubscriber.this).onError(exception);
            }
            Timber.d(exception, "Error while polling", new Object[0]);
            return;
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        Timber.d("URL is null for %s, delaying 15 seconds", new Object[] {
            resultClass.getSimpleName()
        });
        if (responseBody == null)
        {
            pollingInterval = new Pair(Integer.valueOf(15), TimeUnit.SECONDS);
        }
        scheduleWorker();
        return;
        Timber.d((new StringBuilder()).append("Getting ").append(resultClass.getSimpleName()).append(" from NETWORK").toString(), new Object[0]);
        obj = (new com.squareup.okhttp.t>()).t>(((String) (obj))).t>();
        if (PollingSubscriber.access$000(PollingSubscriber.this) != null)
        {
            ((com.squareup.okhttp.lingSubscriber) (obj)).eader("If-Modified-Since", PollingSubscriber.access$000(PollingSubscriber.this));
        }
        if (PollingSubscriber.access$100(PollingSubscriber.this) != null)
        {
            ((com.squareup.okhttp.lingSubscriber) (obj)).eader("If-None-Match", PollingSubscriber.access$100(PollingSubscriber.this));
        }
        PollingSubscriber.access$202(PollingSubscriber.this, PollingSubscriber.access$300(PollingSubscriber.this).newCall(((com.squareup.okhttp.) (obj)).d()));
        PollingSubscriber.access$200(PollingSubscriber.this).enqueue(PollingSubscriber.access$400(PollingSubscriber.this));
        return;
    }

    llingCallback()
    {
        this$0 = PollingSubscriber.this;
        super();
    }
}
