// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.android.gms.common.api.Status;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class gmh
    implements gmg
{

    final Map a = new ConcurrentHashMap();
    volatile MediaService b;
    final bqu c;
    final Context d;
    final ObjectMapper e;
    gmk f;
    ServiceConnection g;
    private Executor h;
    private final ConcurrentLinkedQueue i = new ConcurrentLinkedQueue();
    private final bqw j = new bqw() {

        private gmh a;

        public final void a(int k)
        {
        }

        public final void a(Bundle bundle)
        {
            a.a();
        }

            
            {
                a = gmh.this;
                super();
            }
    };

    public gmh(Context context)
    {
        e = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a();
        g = new ServiceConnection() {

            private gmh a;

            public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                a.b = ((eao)ibinder).a;
                a.a();
            }

            public final void onServiceDisconnected(ComponentName componentname)
            {
            }

            
            {
                a = gmh.this;
                super();
            }
        };
        d = context;
        c = (new bqv(context)).a(cqm.c).a(j).b();
        f = gmk.a;
        h = Executors.newSingleThreadExecutor();
    }

    static void a(gmh gmh1, String s)
    {
        ((cqk)gmh1.f.a(gmh1.c, s, "/wear/connect", null).b()).c().a();
    }

    private void a(Runnable runnable)
    {
        runnable = new Runnable(runnable) {

            private Runnable a;

            public final void run()
            {
                try
                {
                    a.run();
                    return;
                }
                catch (Exception exception)
                {
                    Logger.c("Error while running a task", new Object[] {
                        a
                    });
                    Assertion.a("Failed to run queued task", exception);
                    return;
                }
            }

            
            {
                a = runnable;
                super();
            }
        };
        i.add(runnable);
    }

    private void b()
    {
        boolean flag;
        if (c.d() || c.e() || b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            c.b();
            MediaService.a(d, g);
        }
    }

    final void a()
    {
        i.size();
        Runnable runnable;
        for (; c.d() && b != null && !i.isEmpty(); h.execute(runnable))
        {
            runnable = (Runnable)i.poll();
        }

    }

    public final void a(String s)
    {
        a(new Runnable(s) {

            private String a;
            private gmh b;

            public final void run()
            {
                if (b.a.containsKey(a))
                {
                    String s1 = a;
                    gmh.a(b, a);
                    return;
                } else
                {
                    Object obj = a;
                    obj = a;
                    obj = new gmj(a, b.c, b.f);
                    ehe ehe1 = new ehe(new ehk(new ehv(b.e), ((egv) (obj))), b.b, new Handler(Looper.getMainLooper()), false);
                    obj = new gmi(a, ehe1, ((gmj) (obj)), (byte)0);
                    b.a.put(a, obj);
                    gmh.a(b, ((gmi) (obj)).a);
                    return;
                }
            }

            
            {
                b = gmh.this;
                a = s;
                super();
            }
        });
        b();
        a();
    }

    public final void a(String s, byte abyte0[])
    {
        a(new Runnable(s, abyte0) {

            private String a;
            private byte b[];
            private gmh c;

            public final void run()
            {
                if (c.a.containsKey(a))
                {
                    gmj gmj1 = ((gmi)c.a.get(a)).c;
                    byte abyte1[] = b;
                    if (gmj1.a != null)
                    {
                        gmj1.a.a(abyte1);
                    }
                    return;
                } else
                {
                    String s1 = a;
                    return;
                }
            }

            
            {
                c = gmh.this;
                a = s;
                b = abyte0;
                super();
            }
        });
        b();
        a();
    }

    public final void b(String s)
    {
        a(new Runnable(s) {

            private String a;
            private gmh b;

            public final void run()
            {
                String s1;
                if (b.a.containsKey(a))
                {
                    Object obj = a;
                    ((gmi)b.a.get(a)).b.b();
                    obj = b;
                    String s2 = a;
                    ((cqk)((gmh) (obj)).f.a(((gmh) (obj)).c, s2, "/wear/disconnect", null).b()).c().a();
                    b.a.remove(a);
                } else
                {
                    s1 = a;
                }
                if (b.a.isEmpty())
                {
                    gmh gmh1 = b;
                    gmh1.c.c();
                    MediaService.b(gmh1.d, gmh1.g);
                    gmh1.b = null;
                }
            }

            
            {
                b = gmh.this;
                a = s;
                super();
            }
        });
        b();
        a();
    }
}
