// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.schedule;

import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.schedule:
//            SplashData

public class ScheduleService
{

    private final OkHttpClient client;
    private final Gson gson;
    private final String url;

    public ScheduleService(OkHttpClient okhttpclient, Gson gson1, String s)
    {
        client = okhttpclient;
        gson = gson1;
        url = s;
    }

    public Observable getEventListing(final int gameId)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final ScheduleService this$0;
            final int val$gameId;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                Request request = (new com.squareup.okhttp.Request.Builder()).url(url).build();
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
                        try
                        {
                            response = (SplashData.EventListing)CollectionUtils.find(((SplashData)gson.fromJson(response.body().charStream(), com/nbcsports/liveextra/ui/player/premierleague/schedule/SplashData)).eventListings, new Predicate() {

                                final _cls1 this$2;

                                public boolean evaluate(SplashData.EventListing eventlisting)
                                {
                                    while (eventlisting.extendedInfo == null || eventlisting.extendedInfo.gameId != gameId) 
                                    {
                                        return false;
                                    }
                                    return true;
                                }

                                public volatile boolean evaluate(Object obj)
                                {
                                    return evaluate((SplashData.EventListing)obj);
                                }

            
            {
                this$2 = _cls1.this;
                super();
            }
                            });
                            subscriber.onNext(response);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Response response)
                        {
                            subscriber.onError(response);
                        }
                    }

            
            {
                this$1 = final__pcls1;
                subscriber = Subscriber.this;
                super();
            }
                });
            }

            
            {
                this$0 = ScheduleService.this;
                gameId = i;
                super();
            }
        }).subscribeOn(Schedulers.io());
    }



}
