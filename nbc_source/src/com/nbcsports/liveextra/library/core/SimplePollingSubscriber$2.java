// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.core;

import android.util.Pair;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.library.core:
//            SimplePollingSubscriber

class this._cls0
    implements Callback
{

    final SimplePollingSubscriber this$0;

    public void onFailure(Request request, IOException ioexception)
    {
        SimplePollingSubscriber.access$800(SimplePollingSubscriber.this, ioexception);
    }

    public void onResponse(Response response)
        throws IOException
    {
        Object obj = SimplePollingSubscriber.access$900(SimplePollingSubscriber.this, response);
        if (obj != null)
        {
            SimplePollingSubscriber.access$800(SimplePollingSubscriber.this, ((Throwable) (obj)));
            return;
        }
        obj = response.header("Last-Modified");
        String s = response.header("Etag");
        SimplePollingSubscriber.access$1002(SimplePollingSubscriber.this, 0);
        if (SimplePollingSubscriber.access$1100(SimplePollingSubscriber.this, ((String) (obj)), s))
        {
            Timber.d((new StringBuilder()).append("Received response - LAST-MODIFIED: ").append(((String) (obj))).toString(), new Object[0]);
            Timber.d((new StringBuilder()).append("Received response - ETAG: ").append(s).toString(), new Object[0]);
            try
            {
                SimplePollingSubscriber.access$1202(SimplePollingSubscriber.this, response.body().string());
            }
            catch (Exception exception)
            {
                Timber.i(exception, (new StringBuilder()).append("Exception retrieving response body for: ").append(response.request().urlString()).toString(), new Object[0]);
                SimplePollingSubscriber.access$800(SimplePollingSubscriber.this, exception);
                return;
            }
            response = SimplePollingSubscriber.access$100(SimplePollingSubscriber.this).getPollingInterval(SimplePollingSubscriber.access$1200(SimplePollingSubscriber.this));
            Timber.d("Next poll in %s %s", new Object[] {
                Integer.toString(((Integer)((Pair) (response)).first).intValue()), ((TimeUnit)((Pair) (response)).second).toString()
            });
            pollingInterval = response;
            SimplePollingSubscriber.access$1300(SimplePollingSubscriber.this).onNext(SimplePollingSubscriber.access$1200(SimplePollingSubscriber.this));
            SimplePollingSubscriber.access$202(SimplePollingSubscriber.this, ((String) (obj)));
            SimplePollingSubscriber.access$302(SimplePollingSubscriber.this, s);
        }
        SimplePollingSubscriber.access$000(SimplePollingSubscriber.this).SimplePollingSubscriber(SimplePollingSubscriber.access$1400(SimplePollingSubscriber.this), ((Integer)pollingInterval.first).intValue(), (TimeUnit)pollingInterval.second);
    }

    llingCallback()
    {
        this$0 = SimplePollingSubscriber.this;
        super();
    }
}
