// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.api;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.net.URL;
import me.lyft.android.common.Closeables;
import me.lyft.android.common.Unit;
import me.lyft.android.logging.L;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

public class BaseApi
{

    protected Gson gson;
    protected OkHttpClient okHttpClient;

    public BaseApi(OkHttpClient okhttpclient, Gson gson1)
    {
        okHttpClient = okhttpclient;
        gson = gson1;
    }

    private Response createAnExecuteCall(Request request)
    {
        request = okHttpClient.newCall(request).execute();
        if (!request.isSuccessful())
        {
            IOException ioexception = getUnsuccessfulResponseException(request);
            if (ioexception != null)
            {
                throw ioexception;
            }
        }
        return request;
    }

    private Object createAnExecuteCall(Request request, Class class1)
    {
        try
        {
            class1 = ((Class) (deserializeJsonBody(createAnExecuteCall(request), class1)));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            L.e(class1, String.format("JsonSyntaxException occurred with deserializing response from : [%s %s]. Message [%s].", new Object[] {
                request.method(), request.url().getPath(), class1.getMessage()
            }), new Object[0]);
            throw class1;
        }
        return class1;
    }

    protected Object deserializeJsonBody(Response response, Class class1)
    {
        String s;
        response = response.body();
        s = response.string();
        class1 = ((Class) (gson.a(s, class1)));
        Closeables.closeQuietly(response);
        return class1;
        class1;
        Closeables.closeQuietly(response);
        throw class1;
    }

    public Object execute(com.squareup.okhttp.Request.Builder builder, Class class1)
    {
        return createAnExecuteCall(builder.build(), class1);
    }

    public Observable executeAsync(final com.squareup.okhttp.Request.Builder requestBuilder, final Class clazz)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final BaseApi this$0;
            final Class val$clazz;
            final com.squareup.okhttp.Request.Builder val$requestBuilder;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                try
                {
                    Request request = requestBuilder.build();
                    subscriber.onNext(createAnExecuteCall(request, clazz));
                    subscriber.onCompleted();
                    return;
                }
                catch (Throwable throwable)
                {
                    subscriber.onError(throwable);
                }
            }

            
            {
                this$0 = BaseApi.this;
                requestBuilder = builder;
                clazz = class1;
                super();
            }
        }).subscribeOn(Schedulers.io());
    }

    public Observable executeWithoutResultAsync(final com.squareup.okhttp.Request.Builder requestBuilder)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final BaseApi this$0;
            final com.squareup.okhttp.Request.Builder val$requestBuilder;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                try
                {
                    Request request = requestBuilder.build();
                    createAnExecuteCall(request).body().close();
                    subscriber.onNext(Unit.create());
                    subscriber.onCompleted();
                    return;
                }
                catch (Throwable throwable)
                {
                    subscriber.onError(throwable);
                }
            }

            
            {
                this$0 = BaseApi.this;
                requestBuilder = builder;
                super();
            }
        }).subscribeOn(Schedulers.io());
    }

    protected IOException getUnsuccessfulResponseException(Response response)
    {
        return null;
    }


}
