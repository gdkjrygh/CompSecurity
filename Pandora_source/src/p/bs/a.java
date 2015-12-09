// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

class a
    implements ServiceConnection
{

    private boolean a;
    private AtomicBoolean b;
    private final BlockingQueue c = new LinkedBlockingQueue();

    a()
    {
        a = false;
        b = new AtomicBoolean(false);
    }

    static boolean a(a a1)
    {
        return a1.a;
    }

    public IBinder a()
        throws InterruptedException
    {
        if (b.get())
        {
            throw new IllegalStateException();
        } else
        {
            b.set(true);
            return (IBinder)c.take();
        }
    }

    public void a(Context context)
    {
        context = new Runnable(context) {

            final Context a;
            final a b;

            public void run()
            {
                if (a.a(b))
                {
                    a.unbindService(b);
                    return;
                } else
                {
                    Log.w("BlockingServiceConnection", "Service disconnected before unbinding");
                    return;
                }
            }

            
            {
                b = a.this;
                a = context;
                super();
            }
        };
        (new Handler(Looper.getMainLooper())).post(context);
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        a = true;
        c.clear();
        c.add(ibinder);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        a = false;
    }
}
