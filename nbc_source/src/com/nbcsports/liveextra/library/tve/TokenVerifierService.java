// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.net.Uri;
import android.util.Base64;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

public class TokenVerifierService
{

    private static final String CDN = "akamai";
    private Action0 action;
    private final OkHttpClient client;
    private Subscriber subscriber;
    private rx.Scheduler.Worker worker;

    public TokenVerifierService(OkHttpClient okhttpclient)
    {
        client = okhttpclient.clone();
    }

    private void verifyToken(String s, String s1, String s2)
    {
        s = Uri.parse("http://sp.auth.adobe.com/tvs/v1/sign").buildUpon().appendQueryParameter("mediaToken", Base64.encodeToString(s1.getBytes(), 0)).appendQueryParameter("resource", Base64.encodeToString(s.getBytes(), 0)).appendQueryParameter("cdn", "akamai").appendQueryParameter("url", s2).build();
        s = (new com.squareup.okhttp.Request.Builder()).url(s.toString()).header("CONTENT-TYPE", "application/x-www-form-urlencoded").header("ACCEPT", "text/plain").build();
        client.newCall(s).enqueue(new Callback() {

            final TokenVerifierService this$0;

            public void onFailure(Request request, IOException ioexception)
            {
                subscriber.onError(ioexception);
            }

            public void onResponse(Response response)
                throws IOException
            {
                if (!response.isSuccessful())
                {
                    subscriber.onError(new Exception(response.message()));
                }
                response = response.body().string();
                subscriber.onNext(response);
                subscriber.onCompleted();
            }

            
            {
                this$0 = TokenVerifierService.this;
                super();
            }
        });
    }

    public Observable verify(final String resource, final String token, final String videoUrl)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final TokenVerifierService this$0;
            final String val$resource;
            final String val$token;
            final String val$videoUrl;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber1)
            {
                subscriber = subscriber1;
                worker = Schedulers.io().createWorker();
                action = new Action0() {

                    final _cls1 this$1;

                    public void call()
                    {
                        verifyToken(resource, token, videoUrl);
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                };
                worker.schedule(action);
            }

            
            {
                this$0 = TokenVerifierService.this;
                resource = s;
                token = s1;
                videoUrl = s2;
                super();
            }
        });
    }



/*
    static Subscriber access$002(TokenVerifierService tokenverifierservice, Subscriber subscriber1)
    {
        tokenverifierservice.subscriber = subscriber1;
        return subscriber1;
    }

*/



/*
    static rx.Scheduler.Worker access$102(TokenVerifierService tokenverifierservice, rx.Scheduler.Worker worker1)
    {
        tokenverifierservice.worker = worker1;
        return worker1;
    }

*/



/*
    static Action0 access$202(TokenVerifierService tokenverifierservice, Action0 action0)
    {
        tokenverifierservice.action = action0;
        return action0;
    }

*/

}
