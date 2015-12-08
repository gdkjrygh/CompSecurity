// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import com.google.gson.Gson;
import java.io.PrintStream;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
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
        return new ousExecutor();
    }

    retrofit.client.r defaultClient()
    {
        final Object client;
        if (Platform.access$300())
        {
            client = entInstantiator.instantiate();
        } else
        {
            client = new UrlConnectionClient();
        }
        return new retrofit.client.Client.Provider() {

            final Platform.Base this$0;
            final Client val$client;

            public Client get()
            {
                return client;
            }

            
            {
                this$0 = Platform.Base.this;
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

            final Platform.Base this$0;

            public Thread newThread(Runnable runnable)
            {
                return new Thread(runnable. new Runnable() {

                    final _cls2 this$1;
                    final Runnable val$r;

                    public void run()
                    {
                        Thread.currentThread().setPriority(1);
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
                this$0 = Platform.Base.this;
                super();
            }
        });
    }

    g defaultLog()
    {
        return new RestAdapter.Log() {

            final Platform.Base this$0;

            public void log(String s)
            {
                System.out.println(s);
            }

            
            {
                this$0 = Platform.Base.this;
                super();
            }
        };
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
