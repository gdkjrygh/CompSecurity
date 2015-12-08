// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            NbcGeoService

class val.subscriber
    implements Callback
{

    final val.subscriber this$1;
    final Subscriber val$subscriber;

    public void onFailure(Request request, IOException ioexception)
    {
        val$subscriber.onError(ioexception);
    }

    public void onResponse(Response response)
        throws IOException
    {
        response = (eoReponse)(new Gson()).fromJson(response.body().charStream(), com/nbcsports/liveextra/library/tve/NbcGeoService$NbcGeoReponse);
        val$subscriber.onNext(response);
        val$subscriber.onCompleted();
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$subscriber = Subscriber.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/library/tve/NbcGeoService$1

/* anonymous class */
    class NbcGeoService._cls1
        implements rx.Observable.OnSubscribe
    {

        final NbcGeoService this$0;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber1)
        {
            Request request = (new com.squareup.okhttp.Request.Builder()).url("http://geo.nbcsports.com/").get().build();
            NbcGeoService.access$000(NbcGeoService.this).newCall(request).enqueue(subscriber1. new NbcGeoService._cls1._cls1());
        }

            
            {
                this$0 = NbcGeoService.this;
                super();
            }
    }

}
