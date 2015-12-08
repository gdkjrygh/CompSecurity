// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.overlay;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;
import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.content.overlay:
//            OverlayContentService

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
        if (!response.isSuccessful())
        {
            val$subscriber.onError(new Exception(String.format("%s: %s", new Object[] {
                Integer.valueOf(response.code()), response.message()
            })));
        }
        val$subscriber.onNext(response);
        val$subscriber.onCompleted();
    }

    l.endpoint()
    {
        this$1 = final_endpoint;
        val$subscriber = Subscriber.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/content/overlay/OverlayContentService$1

/* anonymous class */
    class OverlayContentService._cls1
        implements rx.Observable.OnSubscribe
    {

        final OverlayContentService this$0;
        final String val$endpoint;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber1)
        {
            Request request = (new com.squareup.okhttp.Request.Builder()).url(endpoint).get().build();
            OverlayContentService.access$000(OverlayContentService.this).newCall(request).enqueue(subscriber1. new OverlayContentService._cls1._cls1());
        }

            
            {
                this$0 = final_overlaycontentservice;
                endpoint = String.this;
                super();
            }
    }

}
