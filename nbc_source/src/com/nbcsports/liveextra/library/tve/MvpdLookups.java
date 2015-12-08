// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.configuration.ConfigurationProvider;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            Channel, Logo

public class MvpdLookups
{

    private Map channels;
    private final OkHttpClient client;
    private Map logos;
    private Subscriber subscriber;

    public MvpdLookups(ConfigurationProvider configurationprovider, OkHttpClient okhttpclient)
    {
        channels = new HashMap();
        logos = new HashMap();
        client = okhttpclient;
        configurationprovider.getObservable().subscribeOn(Schedulers.io()).subscribe(new Subscriber() {

            final MvpdLookups this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
            }

            public void onNext(Configuration configuration)
            {
                if (configuration == null || !configuration.isLoaded())
                {
                    return;
                } else
                {
                    getChannels(configuration.getRequestorIDLookup());
                    getLogos(configuration.getMvpdLogoURL());
                    return;
                }
            }

            public volatile void onNext(Object obj)
            {
                onNext((Configuration)obj);
            }

            
            {
                this$0 = MvpdLookups.this;
                super();
            }
        });
    }

    private void getChannels(String s)
    {
        s = (new com.squareup.okhttp.Request.Builder()).url(s).build();
        client.newCall(s).enqueue(new Callback() {

            final MvpdLookups this$0;

            public void onFailure(Request request, IOException ioexception)
            {
                if (subscriber != null)
                {
                    subscriber.onError(ioexception);
                }
            }

            public void onResponse(Response response)
                throws IOException
            {
                if (!response.isSuccessful())
                {
                    onFailure(response.request(), new IOException("Cannot retrieve channels"));
                }
                if (response.isSuccessful() && response.code() != 304)
                {
                    Object obj = Channel.parse(response.body().byteStream());
                    if (((List) (obj)).size() == 0)
                    {
                        onFailure(response.request(), new IOException("Channels were empty"));
                        return;
                    }
                    for (response = ((List) (obj)).iterator(); response.hasNext(); channels.put(((Channel) (obj)).getResourceId().toLowerCase(), obj))
                    {
                        obj = (Channel)response.next();
                    }

                }
                areLookupsReady();
            }

            
            {
                this$0 = MvpdLookups.this;
                super();
            }
        });
    }

    private void getLogos(String s)
    {
        s = (new com.squareup.okhttp.Request.Builder()).url(s).build();
        client.newCall(s).enqueue(new Callback() {

            final MvpdLookups this$0;

            public void onFailure(Request request, IOException ioexception)
            {
            }

            public void onResponse(Response response)
                throws IOException
            {
                if (!response.isSuccessful())
                {
                    onFailure(response.request(), new IOException("Cannot retrieve logos"));
                }
                if (response.isSuccessful() && response.code() != 304)
                {
                    response = Logo.parse(response.body().byteStream()).iterator();
                    do
                    {
                        if (!response.hasNext())
                        {
                            break;
                        }
                        Logo logo = (Logo)response.next();
                        if (logo.getId() != null)
                        {
                            logos.put(logo.getId().toLowerCase(), logo);
                        }
                    } while (true);
                }
            }

            
            {
                this$0 = MvpdLookups.this;
                super();
            }
        });
    }

    public void areLookupsReady()
    {
        if (channels.size() > 0 && subscriber != null)
        {
            subscriber.onNext(Boolean.valueOf(true));
            subscriber.onCompleted();
        }
    }

    public Observable checkLookups()
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final MvpdLookups this$0;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber1)
            {
                subscriber = subscriber1;
                areLookupsReady();
            }

            
            {
                this$0 = MvpdLookups.this;
                super();
            }
        });
    }

    public Map getChannels()
    {
        return channels;
    }

    public Map getLogos()
    {
        return logos;
    }





/*
    static Subscriber access$202(MvpdLookups mvpdlookups, Subscriber subscriber1)
    {
        mvpdlookups.subscriber = subscriber1;
        return subscriber1;
    }

*/


}
