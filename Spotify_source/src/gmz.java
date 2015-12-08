// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Process;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class gmz
    implements gmy
{

    CountDownLatch a;
    private final Context b;
    private final gcs c;

    public gmz(Context context, gcs gcs1)
    {
        a = new CountDownLatch(0);
        b = context;
        c = gcs1;
    }

    public final void a()
    {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {

            public final void uncaughtException(Thread thread, Throwable throwable)
            {
                Process.killProcess(Process.myPid());
                System.exit(10);
            }

        });
        if (gmm.b())
        {
            gya.a(b, new gyh[] {
                new akk(), new gmw(new gmx() {

                    public final void a()
                    {
                        gcs gcs1 = new gcs();
                        Map map = ((gcr)dmz.a(gcr)).a();
                        map.put("runtime", "native");
                        gcs1.a(map);
                    }

                })
            });
        } else
        {
            gya.a(b, new gyh[] {
                new akk()
            });
        }
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(new gna(this, Thread.getDefaultUncaughtExceptionHandler(), c)) {

            private Thread.UncaughtExceptionHandler a;
            private gmz b;

            public final void uncaughtException(Thread thread, Throwable throwable)
            {
                b.a = new CountDownLatch(1);
                ((gfr)dmz.a(gfr)).a();
                a.uncaughtException(thread, throwable);
            }

            
            {
                b = gmz.this;
                a = uncaughtexceptionhandler;
                super();
            }
        });
        c.a = new Runnable() {

            private gmz a;

            public final void run()
            {
                a.a.countDown();
            }

            
            {
                a = gmz.this;
                super();
            }
        };
    }

    public final void b()
    {
        try
        {
            a.await(5000L, TimeUnit.MILLISECONDS);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
