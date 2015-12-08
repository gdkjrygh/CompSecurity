// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Looper;
import com.google.common.base.Optional;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public final class dkv extends Thread
{

    public CountDownLatch a;
    public AtomicReference b;
    private Resolver c;
    private final Context d;
    private final String e;
    private com.spotify.cosmos.android.Resolver.ConnectionCallback f;
    private com.spotify.cosmos.android.Resolver.CallbackReceiver g;

    public dkv(Context context, String s)
    {
        b = new AtomicReference(Optional.e());
        f = new com.spotify.cosmos.android.Resolver.ConnectionCallback() {

            private dkv a;

            public final void onServiceConnected(Resolver resolver)
            {
                resolver = new Request("PUT", (new StringBuilder("hm://yolo/code/authenticated/")).append(dkv.a(a)).toString());
                dkv.c(a).resolve(resolver, dkv.b(a));
            }

            public final void onServiceConnectionFailed(Resolver resolver, com.spotify.cosmos.android.Resolver.ConnectionError connectionerror)
            {
                dkv.d(a);
                Looper.myLooper().quit();
            }

            public final void onServiceDisconnected(Resolver resolver)
            {
                Looper.myLooper().quit();
            }

            
            {
                a = dkv.this;
                super();
            }
        };
        g = new com.spotify.cosmos.android.Resolver.CallbackReceiver() {

            private dkv a;

            protected final void onError(Throwable throwable)
            {
                dkv.d(a);
            }

            protected final void onResolved(Response response)
            {
                dkv.e(a).set(Optional.b(response));
                dkv.d(a);
            }

            
            {
                a = dkv.this;
                super(null);
            }
        };
        d = context;
        e = s;
    }

    static String a(dkv dkv1)
    {
        return dkv1.e;
    }

    static com.spotify.cosmos.android.Resolver.CallbackReceiver b(dkv dkv1)
    {
        return dkv1.g;
    }

    static Resolver c(dkv dkv1)
    {
        return dkv1.c;
    }

    static void d(dkv dkv1)
    {
        dkv1.a.countDown();
        dkv1.c.destroy();
    }

    static AtomicReference e(dkv dkv1)
    {
        return dkv1.b;
    }

    public final void run()
    {
        Looper.prepare();
        c = Cosmos.getResolver(d);
        c.connect();
        c.registerConnectionCallback(f);
    }

    public final void start()
    {
        this;
        JVM INSTR monitorenter ;
        a = new CountDownLatch(1);
        super.start();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
