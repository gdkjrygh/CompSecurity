// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.googlenow;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.util.logging.Logger;
import dzk;
import dzl;
import dzm;
import dzn;
import dzq;

public class GoogleNowService extends Service
{

    private dzk a;
    private dzm b;

    public GoogleNowService()
    {
        b = new dzm() {

            private GoogleNowService a;

            public final void a()
            {
                dzk dzk1 = GoogleNowService.a(a);
                Request request = new Request("GET", "hm://croupier/auth/has_credentials");
                dzk1.b.resolve(request, dzk1.e);
            }

            public final void a(String s)
            {
                dzk dzk1 = GoogleNowService.a(a);
                s = new Request("PUT", String.format("hm://croupier/auth/add_credentials?authCode=%s", new Object[] {
                    dzq.a(s)
                }));
                dzk1.b.resolve(s, dzk1.f);
            }

            public final void b()
            {
                Logger.b("Failed to connect to Cosmos resolver", new Object[0]);
                a.stopSelf();
            }

            public final void b(String s)
            {
                (new dzn((byte)0)).execute(new String[] {
                    s
                });
                a.stopSelf();
            }

            public final void c()
            {
                a.stopSelf();
            }

            public final void d()
            {
                (new dzl(GoogleNowService.a(a), (byte)0)).execute(new Void[0]);
            }

            public final void e()
            {
                Logger.b("Failed to check for credentials on server", new Object[0]);
                a.stopSelf();
            }

            public final void f()
            {
                a.stopSelf();
            }

            public final void g()
            {
                a.stopSelf();
            }

            public final void h()
            {
                Logger.b("Failed to post new credentials", new Object[0]);
                a.stopSelf();
            }

            
            {
                a = GoogleNowService.this;
                super();
            }
        };
    }

    static dzk a(GoogleNowService googlenowservice)
    {
        return googlenowservice.a;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        a = new dzk(this, b);
        dzk dzk1 = a;
        dzk1.b.registerConnectionCallback(dzk1.d);
        dzk1.b.connect();
    }

    public void onDestroy()
    {
        a.b.destroy();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        return 2;
    }
}
