// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.HttpCallbackReceiver;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class frc
{

    public boolean a;
    public final Context b;
    final gey c;
    public gfi d;
    String e;
    final DeferredResolver f;
    private final frd g;
    private final Runnable h = new Runnable() {

        private frc a;

        public final void run()
        {
            frc frc1 = a;
            Object obj = (gcz)dmz.a(gcz);
            obj = String.format(Locale.US, "{\"trial\":\"opt-in\", \"device_id\":\"%s\", \"country\":\"%s\"}", new Object[] {
                ((gcz) (obj)).e(), frc1.e
            });
            obj = new Request("POST", "hm://login-trial/start_trial", new HashMap(), ((String) (obj)).getBytes());
            frc1.f.resolve(((Request) (obj)), frc1. new HttpCallbackReceiver(new Handler(Looper.getMainLooper())) {

                private frc a;

                protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                {
                    Logger.a(throwable, "Failed to start trial", new Object[0]);
                    a.c.e();
                    if (a.c.f())
                    {
                        frc.a(a, false);
                    }
                }

                protected final void onResolved(Response response, Object obj)
                {
                    response = (Boolean)obj;
                    Logger.a("Started opt-in trial: %s", new Object[] {
                        response
                    });
                    a.c.d();
                    frc.a(a, response.booleanValue());
                }

                protected final Object parseResponse(Response response)
                {
                    return Boolean.valueOf(true);
                }

            
            {
                a = frc.this;
                super(handler);
            }
            });
        }

            
            {
                a = frc.this;
                super();
            }
    };

    public frc(Context context, frd frd1)
    {
        b = context;
        g = frd1;
        f = Cosmos.getResolver(context);
        d = new gfi(context, new fre(this));
        context = new gez("start-optin-trial", h);
        context.a = new gfd(0L, TimeUnit.MILLISECONDS);
        context.c = new gfb(200L, TimeUnit.MILLISECONDS);
        context.d = 5;
        c = context.a();
    }

    static void a(frc frc1, boolean flag)
    {
        if (frc1.g != null)
        {
            frc1.g.a(flag);
        }
        if (!flag && frc1.a)
        {
            dmz.a(ggc);
            ggc.a(frc1.b, 0x7f080558, 0, new Object[0]);
        }
    }

    public final void a()
    {
        Logger.a("Stopping", new Object[0]);
        (new AsyncTask() {

            private frc a;

            protected final Object doInBackground(Object aobj[])
            {
                a.f.destroy();
                Logger.a("Cosmos resolver destroyed", new Object[0]);
                return null;
            }

            
            {
                a = frc.this;
                super();
            }
        }).execute(new Void[0]);
        if (d != null)
        {
            d.b();
            d = null;
        }
        if (c.c)
        {
            c.c();
        }
    }
}
