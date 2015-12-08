// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.core;

import android.util.Pair;
import com.google.gson.Gson;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.net.SocketException;
import java.util.concurrent.TimeUnit;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.library.core:
//            PollingSubscriber

class this._cls0
    implements Callback
{

    final PollingSubscriber this$0;

    public void onFailure(Request request, IOException ioexception)
    {
        if (ioexception.getMessage().equals("Canceled"))
        {
            return;
        } else
        {
            PollingSubscriber.access$600(PollingSubscriber.this, ioexception);
            return;
        }
    }

    public void onResponse(Response response)
        throws IOException
    {
        Object obj = PollingSubscriber.access$700(PollingSubscriber.this, response);
        if (obj != null)
        {
            PollingSubscriber.access$600(PollingSubscriber.this, ((Throwable) (obj)));
            return;
        }
        obj = response.header("Last-Modified");
        String s = response.header("Etag");
        PollingSubscriber.access$802(PollingSubscriber.this, 0);
        if (PollingSubscriber.access$900(PollingSubscriber.this, s))
        {
            Timber.d((new StringBuilder()).append("Received response - LAST-MODIFIED: ").append(((String) (obj))).toString(), new Object[0]);
            Timber.d((new StringBuilder()).append("Received response - ETAG: ").append(s).toString(), new Object[0]);
            Pair pair;
            try
            {
                response = ((Response) (PollingSubscriber.access$1000(PollingSubscriber.this).fromJson(response.body().charStream(), resultClass)));
                responseBody = PollingSubscriber.access$1000(PollingSubscriber.this).toJson(response);
            }
            // Misplaced declaration of an exception variable
            catch (Response response)
            {
                if (response instanceof SocketException)
                {
                    Timber.e(response, "", new Object[0]);
                    scheduleWorker();
                    return;
                } else
                {
                    PollingSubscriber.access$600(PollingSubscriber.this, response);
                    return;
                }
            }
            pair = listener.getPollingInterval(response);
            pollingInterval = pair;
            if ((response != null || listener.enableNulls()) && PollingSubscriber.access$500(PollingSubscriber.this) != null)
            {
                PollingSubscriber.access$500(PollingSubscriber.this).onNext(response);
            }
            PollingSubscriber.access$002(PollingSubscriber.this, ((String) (obj)));
            PollingSubscriber.access$102(PollingSubscriber.this, s);
        }
        Timber.d("Next poll in %s %s", new Object[] {
            Integer.toString(((Integer)pollingInterval.first).intValue()), ((TimeUnit)pollingInterval.second).toString()
        });
        scheduleWorker();
    }

    llingCallback()
    {
        this$0 = PollingSubscriber.this;
        super();
    }
}
