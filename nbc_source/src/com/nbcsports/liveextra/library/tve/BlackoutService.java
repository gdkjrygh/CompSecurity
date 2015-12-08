// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.phunware.nbc.sochi.content.GeoRequestResponse;
import com.phunware.nbc.sochi.services.GeoTrackingService;
import com.phunware.nbc.sochi.system.NBCSystem;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Subscriber;
import timber.log.Timber;

public class BlackoutService extends ContextWrapper
{
    public static class Blackout
    {

        int authenticated;

        public boolean isAuthenticated()
        {
            return authenticated == 1;
        }

        public Blackout()
        {
        }
    }


    private static final int BLACKOUT_HTTP_READ_TIMEOUT = 8000;
    private final OkHttpClient client;
    private final Gson gson;
    private int retry;
    private Subscriber subscriber;

    public BlackoutService(OkHttpClient okhttpclient, Gson gson1, Context context)
    {
        super(context);
        client = okhttpclient.clone();
        gson = gson1;
    }

    private void requestBlackoutStatus(final String blackoutId)
    {
        if (TextUtils.isEmpty(blackoutId) || blackoutId.equals("0"))
        {
            subscriber.onNext(Boolean.valueOf(true));
            subscriber.onCompleted();
            return;
        }
        if (!NBCSystem.IS_GEO_LOCATION_ENABLED && !NBCSystem.GEO_LOCATION_RETRY)
        {
            subscriber.onNext(Boolean.valueOf(false));
            subscriber.onCompleted();
            return;
        }
        GeoRequestResponse georequestresponse = NBCSystem.LAST_KNOWN_GEO_LOCATION;
        if (georequestresponse == null || georequestresponse.ZipCode == null)
        {
            if (retry > 0)
            {
                subscriber.onNext(Boolean.valueOf(false));
                subscriber.onCompleted();
                return;
            } else
            {
                retry = retry + 1;
                startService(new Intent(getBaseContext(), com/phunware/nbc/sochi/services/GeoTrackingService));
                (new Handler()).postDelayed(new Runnable() {

                    final BlackoutService this$0;
                    final String val$blackoutId;

                    public void run()
                    {
                        requestBlackoutStatus(blackoutId);
                    }

            
            {
                this$0 = BlackoutService.this;
                blackoutId = s;
                super();
            }
                }, 5000L);
                return;
            }
        } else
        {
            blackoutId = "http://api.nbcsports.com/geo.asmx/MLEAuth2?evt=[eventid]&z=[zipcode]&callback=".replace("[eventid]", blackoutId).replace("[zipcode]", georequestresponse.ZipCode);
            blackoutId = (new com.squareup.okhttp.Request.Builder()).url(blackoutId).header("ACCEPT", "application/json").build();
            client.setReadTimeout(8000L, TimeUnit.SECONDS);
            client.newCall(blackoutId).enqueue(new Callback() {

                final BlackoutService this$0;

                public void onFailure(Request request, IOException ioexception)
                {
                    Timber.i((new StringBuilder()).append("Server request failed: ").append(ioexception.getMessage()).toString(), new Object[0]);
                    subscriber.onNext(Boolean.valueOf(true));
                    subscriber.onCompleted();
                }

                public void onResponse(Response response)
                    throws IOException
                {
                    if (!response.isSuccessful())
                    {
                        Timber.i((new StringBuilder()).append("Bad response from server: ").append(response.message()).toString(), new Object[0]);
                        subscriber.onNext(Boolean.valueOf(true));
                        subscriber.onCompleted();
                        return;
                    }
                    response = response.body().string();
                    try
                    {
                        Blackout blackout = (Blackout)gson.fromJson(response, com/nbcsports/liveextra/library/tve/BlackoutService$Blackout);
                        Timber.d((new StringBuilder()).append("Blackout response: ").append(response).toString(), new Object[0]);
                        subscriber.onNext(Boolean.valueOf(blackout.isAuthenticated()));
                        subscriber.onCompleted();
                        return;
                    }
                    catch (JsonSyntaxException jsonsyntaxexception)
                    {
                        Timber.i((new StringBuilder()).append("Blackout service failed to deserialize json: ").append(response).toString(), new Object[0]);
                    }
                    subscriber.onNext(Boolean.valueOf(true));
                    subscriber.onCompleted();
                }

            
            {
                this$0 = BlackoutService.this;
                super();
            }
            });
            return;
        }
    }

    public Observable getBlackoutStatus(final String blackoutId)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final BlackoutService this$0;
            final String val$blackoutId;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber1)
            {
                subscriber = subscriber1;
                requestBlackoutStatus(blackoutId);
            }

            
            {
                this$0 = BlackoutService.this;
                blackoutId = s;
                super();
            }
        });
    }



/*
    static Subscriber access$002(BlackoutService blackoutservice, Subscriber subscriber1)
    {
        blackoutservice.subscriber = subscriber1;
        return subscriber1;
    }

*/


}
