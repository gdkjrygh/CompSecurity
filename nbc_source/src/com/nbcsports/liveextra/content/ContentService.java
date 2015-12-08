// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.nbcsports.liveextra.library.api.models.AssetList;
import com.nbcsports.liveextra.library.api.models.FeaturedContent;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.File;
import java.io.IOException;
import javax.inject.Provider;
import rx.Observable;
import rx.Subscriber;
import timber.log.Timber;

public class ContentService extends ContextWrapper
{

    private final OkHttpClient client;
    private final Provider configuration;
    private final Gson gson;

    public ContentService(Provider provider, OkHttpClient okhttpclient, Gson gson1, Context context)
    {
        super(context);
        configuration = provider;
        client = okhttpclient.clone();
        client.setCache(getCache());
        gson = gson1;
    }

    private void getAssetList(final Subscriber subscriber, final String url)
    {
        Request request = (new com.squareup.okhttp.Request.Builder()).url(url).get().build();
        client.newCall(request).enqueue(new Callback() {

            final ContentService this$0;
            final Subscriber val$subscriber;
            final String val$url;

            public void onFailure(Request request1, IOException ioexception)
            {
                Timber.d(ioexception, (new StringBuilder()).append("Failure retrieving url: ").append(url).toString(), new Object[0]);
            }

            public void onResponse(Response response)
                throws IOException
            {
                if (!response.isSuccessful())
                {
                    onFailure(response.request(), new IOException(response.message()));
                }
                try
                {
                    response = (AssetList)gson.fromJson(response.body().charStream(), com/nbcsports/liveextra/library/api/models/AssetList);
                    subscriber.onNext(response);
                    subscriber.onCompleted();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Response response)
                {
                    Timber.i(response, "Error deserializing asset list", new Object[0]);
                    subscriber.onError(response);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Response response)
                {
                    Timber.d(response, "Error deserializing asset list", new Object[0]);
                }
                subscriber.onError(response);
            }

            
            {
                this$0 = ContentService.this;
                url = s;
                subscriber = subscriber1;
                super();
            }
        });
    }

    private Cache getCache()
    {
        Cache cache = new Cache(new File(getApplicationContext().getCacheDir(), "/content_service"), 0x500000L);
        try
        {
            cache.evictAll();
        }
        catch (IOException ioexception)
        {
            return cache;
        }
        return cache;
    }

    private void getFeaturedContent(final Subscriber subscriber, final String url)
    {
        Request request = (new com.squareup.okhttp.Request.Builder()).url(url).get().build();
        client.newCall(request).enqueue(new Callback() {

            final ContentService this$0;
            final Subscriber val$subscriber;
            final String val$url;

            public void onFailure(Request request1, IOException ioexception)
            {
                Timber.d(ioexception, (new StringBuilder()).append("Failure retrieving url: ").append(url).toString(), new Object[0]);
                subscriber.onError(ioexception);
            }

            public void onResponse(Response response)
                throws IOException
            {
                if (!response.isSuccessful())
                {
                    onFailure(response.request(), new IOException(response.message()));
                    return;
                }
                try
                {
                    response = (FeaturedContent)gson.fromJson(response.body().charStream(), com/nbcsports/liveextra/library/api/models/FeaturedContent);
                    subscriber.onNext(response);
                    subscriber.onCompleted();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Response response)
                {
                    Timber.i(response, "Error deserializing featured content", new Object[0]);
                    subscriber.onError(response);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Response response)
                {
                    Timber.d(response, "Error deserializing featured content", new Object[0]);
                }
                subscriber.onError(response);
            }

            
            {
                this$0 = ContentService.this;
                url = s;
                subscriber = subscriber1;
                super();
            }
        });
    }

    public void evictAll()
    {
        Cache cache;
        cache = client.getCache();
        if (cache == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        cache.evictAll();
        return;
        IOException ioexception;
        ioexception;
        Timber.d(ioexception, "Error evicting cache", new Object[0]);
        return;
    }

    public Observable loadFeaturedContent()
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final ContentService this$0;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                String s = ((Configuration)configuration.get()).getFeaturedRequestURL().trim();
                getFeaturedContent(subscriber, s);
            }

            
            {
                this$0 = ContentService.this;
                super();
            }
        });
    }

    public Observable loadFeaturedSportContent(final String sportCode)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final ContentService this$0;
            final String val$sportCode;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                String s = ((Configuration)configuration.get()).getSportsFeaturedRequestURL().trim().replace("$(sport)", sportCode).replace("$(tour)", sportCode);
                getFeaturedContent(subscriber, s);
            }

            
            {
                this$0 = ContentService.this;
                sportCode = s;
                super();
            }
        });
    }

    public Observable loadLive()
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final ContentService this$0;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                String s = ((Configuration)configuration.get()).getLiveRequestURL().trim();
                getAssetList(subscriber, s);
            }

            
            {
                this$0 = ContentService.this;
                super();
            }
        });
    }

    public Observable loadSchedule()
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final ContentService this$0;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                String s = ((Configuration)configuration.get()).getScheduleRequestURL().trim();
                getAssetList(subscriber, s);
            }

            
            {
                this$0 = ContentService.this;
                super();
            }
        });
    }

    public Observable loadUpcomingData()
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final ContentService this$0;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                String s = ((Configuration)configuration.get()).getUpcomingRequestURL().trim();
                getAssetList(subscriber, s);
            }

            
            {
                this$0 = ContentService.this;
                super();
            }
        });
    }




}
