// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import android.os.Process;
import com.google.gson.Gson;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import retrofit.android.AndroidApacheClient;
import retrofit.android.AndroidLog;
import retrofit.android.MainThreadExecutor;
import retrofit.client.Client;
import retrofit.client.UrlConnectionClient;
import retrofit.converter.Converter;
import retrofit.converter.GsonConverter;

// Referenced classes of package retrofit:
//            Platform

private static class <init> extends Platform
{

    Executor defaultCallbackExecutor()
    {
        return new MainThreadExecutor();
    }

    retrofit.client.or defaultClient()
    {
        final Object client;
        if (Platform.access$300())
        {
            client = Instantiator.instantiate();
        } else
        if (android.os._INT < 9)
        {
            client = new AndroidApacheClient();
        } else
        {
            client = new UrlConnectionClient();
        }
        return new retrofit.client.Client.Provider() {

            final Platform.Android this$0;
            final Client val$client;

            public Client get()
            {
                return client;
            }

            
            {
                this$0 = Platform.Android.this;
                client = client1;
                super();
            }
        };
    }

    Converter defaultConverter()
    {
        return new GsonConverter(new Gson());
    }

    Executor defaultHttpExecutor()
    {
        return Executors.newCachedThreadPool(new ThreadFactory() {

            final Platform.Android this$0;

            public Thread newThread(Runnable runnable)
            {
                return new Thread(runnable. new Runnable() {

                    final _cls2 this$1;
                    final Runnable val$r;

                    public void run()
                    {
                        Process.setThreadPriority(10);
                        r.run();
                    }

            
            {
                this$1 = final__pcls2;
                r = Runnable.this;
                super();
            }
                }, "Retrofit-Idle");
            }

            
            {
                this$0 = Platform.Android.this;
                super();
            }
        });
    }

    _cls2 defaultLog()
    {
        return new AndroidLog("Retrofit");
    }

    private _cls2.this._cls0()
    {
    }

    _cls2.this._cls0(_cls2.this._cls0 _pcls0)
    {
        this();
    }
}
