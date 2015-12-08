// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

public final class ctn
    implements ServiceConnection
{

    public AtomicBoolean a;
    public final BlockingQueue b = new LinkedBlockingQueue();
    private boolean c;

    public ctn()
    {
        c = false;
        a = new AtomicBoolean(false);
    }

    static boolean a(ctn ctn1)
    {
        return ctn1.c;
    }

    public final void a(Context context)
    {
        context = new Runnable(context) {

            private Context a;
            private ctn b;

            public final void run()
            {
                if (ctn.a(b))
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
                b = ctn.this;
                a = context;
                super();
            }
        };
        (new Handler(Looper.getMainLooper())).post(context);
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        c = true;
        b.clear();
        b.add(ibinder);
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        c = false;
    }
}
