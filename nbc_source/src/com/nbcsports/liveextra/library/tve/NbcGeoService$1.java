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

class this._cls0
    implements rx.scribe
{

    final NbcGeoService this$0;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(final Subscriber subscriber)
    {
        Request request = (new com.squareup.okhttp.<init>()).url("http://geo.nbcsports.com/").get().build();
        NbcGeoService.access$000(NbcGeoService.this).newCall(request).enqueue(new Callback() {

            final NbcGeoService._cls1 this$1;
            final Subscriber val$subscriber;

            public void onFailure(Request request1, IOException ioexception)
            {
                subscriber.onError(ioexception);
            }

            public void onResponse(Response response)
                throws IOException
            {
                response = (NbcGeoService.NbcGeoReponse)(new Gson()).fromJson(response.body().charStream(), com/nbcsports/liveextra/library/tve/NbcGeoService$NbcGeoReponse);
                subscriber.onNext(response);
                subscriber.onCompleted();
            }

            
            {
                this$1 = NbcGeoService._cls1.this;
                subscriber = subscriber1;
                super();
            }
        });
    }

    _cls1.val.subscriber()
    {
        this$0 = NbcGeoService.this;
        super();
    }
}
