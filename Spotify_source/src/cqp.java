// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;

public abstract class cqp extends Service
{

    private volatile int a;
    private String b;
    private Handler c;
    private IBinder d;
    private Object e;
    private boolean f;

    public cqp()
    {
        a = -1;
        e = new Object();
    }

    static String a(cqp cqp1)
    {
        return cqp1.b;
    }

    static void b(cqp cqp1)
    {
label0:
        {
            int i = Binder.getCallingUid();
            if (i != cqp1.a)
            {
                if (!GooglePlayServicesUtil.zze(cqp1, i))
                {
                    break label0;
                }
                cqp1.a = i;
            }
            return;
        }
        throw new SecurityException("Caller is not GooglePlayServices");
    }

    static Object c(cqp cqp1)
    {
        return cqp1.e;
    }

    static boolean d(cqp cqp1)
    {
        return cqp1.f;
    }

    static Handler e(cqp cqp1)
    {
        return cqp1.c;
    }

    public void a(cql cql)
    {
    }

    public final IBinder onBind(Intent intent)
    {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction()))
        {
            return d;
        } else
        {
            return null;
        }
    }

    public void onCreate()
    {
        super.onCreate();
        if (Log.isLoggable("WearableLS", 3))
        {
            Log.d("WearableLS", (new StringBuilder("onCreate: ")).append(getPackageName()).toString());
        }
        b = getPackageName();
        HandlerThread handlerthread = new HandlerThread("WearableListenerService");
        handlerthread.start();
        c = new Handler(handlerthread.getLooper());
        d = new cqq(this);
    }

    public void onDestroy()
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        f = true;
        if (c == null)
        {
            throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()?");
        }
        break MISSING_BLOCK_LABEL_34;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        c.getLooper().quit();
        obj;
        JVM INSTR monitorexit ;
        super.onDestroy();
        return;
    }
}
