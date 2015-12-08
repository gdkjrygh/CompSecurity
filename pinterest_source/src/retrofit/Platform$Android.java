// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import com.google.gson.Gson;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import retrofit.android.AndroidApacheClient;
import retrofit.android.AndroidLog;
import retrofit.android.MainThreadExecutor;
import retrofit.client.UrlConnectionClient;
import retrofit.converter.Converter;
import retrofit.converter.GsonConverter;

// Referenced classes of package retrofit:
//            Platform

class <init> extends Platform
{

    Executor defaultCallbackExecutor()
    {
        return new MainThreadExecutor();
    }

    retrofit.client.or defaultClient()
    {
        class _cls1
            implements retrofit.client.Client.Provider
        {

            final Platform.Android this$0;
            final Client val$client;

            public Client get()
            {
                return client;
            }

            _cls1()
            {
                this$0 = Platform.Android.this;
                client = client1;
                super();
            }
        }

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
        return new _cls1();
    }

    Converter defaultConverter()
    {
        return new GsonConverter(new Gson());
    }

    Executor defaultHttpExecutor()
    {
        class _cls2
            implements ThreadFactory
        {

            final Platform.Android this$0;

            public Thread newThread(final Runnable r)
            {
                class _cls1
                    implements Runnable
                {

                    final _cls2 this$1;
                    final Runnable val$r;

                    public void run()
                    {
                        Process.setThreadPriority(10);
                        r.run();
                    }

                        _cls1()
                        {
                            this$1 = _cls2.this;
                            r = runnable;
                            super();
                        }
                }

                return new Thread(new _cls1(), "Retrofit-Idle");
            }

            _cls2()
            {
                this$0 = Platform.Android.this;
                super();
            }
        }

        return Executors.newCachedThreadPool(new _cls2());
    }

    _cls2 defaultLog()
    {
        return new AndroidLog("Retrofit");
    }

    private tor()
    {
    }

    tor(tor tor)
    {
        this();
    }
}
