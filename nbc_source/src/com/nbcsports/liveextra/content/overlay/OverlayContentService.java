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
import rx.Observable;
import rx.Subscriber;

public class OverlayContentService
{

    private OkHttpClient client;

    public OverlayContentService(OkHttpClient okhttpclient)
    {
        client = okhttpclient;
    }

    public Observable getResponseObservable(final String endpoint)
    {
        this;
        JVM INSTR monitorenter ;
        endpoint = Observable.create(new rx.Observable.OnSubscribe() {

            final OverlayContentService this$0;
            final String val$endpoint;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                Request request = (new com.squareup.okhttp.Request.Builder()).url(endpoint).get().build();
                client.newCall(request).enqueue(subscriber. new Callback() {

                    final _cls1 this$1;
                    final Subscriber val$subscriber;

                    public void onFailure(Request request, IOException ioexception)
                    {
                        subscriber.onError(ioexception);
                    }

                    public void onResponse(Response response)
                        throws IOException
                    {
                        if (!response.isSuccessful())
                        {
                            subscriber.onError(new Exception(String.format("%s: %s", new Object[] {
                                Integer.valueOf(response.code()), response.message()
                            })));
                        }
                        subscriber.onNext(response);
                        subscriber.onCompleted();
                    }

            
            {
                this$1 = final__pcls1;
                subscriber = Subscriber.this;
                super();
            }
                });
            }

            
            {
                this$0 = OverlayContentService.this;
                endpoint = s;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return endpoint;
        endpoint;
        throw endpoint;
    }

}
