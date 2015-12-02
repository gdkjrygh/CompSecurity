// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class aam
{

    public static int a = 0x4c4b40;
    public static int b = 0x632ea0;
    public static int c = 0x6acfc0;
    static aam d;
    private static String f = null;
    private static final AtomicInteger j = new AtomicInteger(1);
    final Messenger e = new Messenger(new _cls1(Looper.getMainLooper()));
    private Context g;
    private PendingIntent h;
    private Map i;
    private final BlockingQueue k = new LinkedBlockingQueue();

    public aam()
    {
        i = Collections.synchronizedMap(new HashMap());
    }

    public static aam a(Context context)
    {
        aam;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            aam aam1 = new aam();
            d = aam1;
            aam1.g = context.getApplicationContext();
        }
        context = d;
        aam;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private Intent a(Bundle bundle)
    {
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
        if (b(g) < 0)
        {
            throw new IOException("Google Play Services missing");
        }
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage(c());
        c(intent);
        intent.putExtra("google.message_id", b());
        intent.putExtras(bundle);
        intent.putExtra("google.messenger", e);
        g.startService(intent);
        try
        {
            bundle = (Intent)k.poll(30000L, TimeUnit.MILLISECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new IOException(bundle.getMessage());
        }
        return bundle;
    }

    public static String a(Intent intent)
    {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction()))
        {
            intent = null;
        } else
        {
            String s = intent.getStringExtra("message_type");
            intent = s;
            if (s == null)
            {
                return "gcm";
            }
        }
        return intent;
    }

    private static String a(Intent intent, String s)
    {
        if (intent == null)
        {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        s = intent.getStringExtra(s);
        if (s != null)
        {
            return s;
        }
        intent = intent.getStringExtra("error");
        if (intent != null)
        {
            throw new IOException(intent);
        } else
        {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    static BlockingQueue a(aam aam1)
    {
        return aam1.k;
    }

    static boolean a(aam aam1, Intent intent)
    {
        return aam1.b(intent);
    }

    private static int b(Context context)
    {
        context = context.getPackageManager();
        int l;
        try
        {
            l = context.getPackageInfo(c(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return -1;
        }
        return l;
    }

    static Context b(aam aam1)
    {
        return aam1.g;
    }

    private static String b()
    {
        return (new StringBuilder("google.rpc")).append(String.valueOf(j.getAndIncrement())).toString();
    }

    private static transient String b(String as[])
    {
        if (as == null || as.length == 0)
        {
            throw new IllegalArgumentException("No senderIds");
        }
        StringBuilder stringbuilder = new StringBuilder(as[0]);
        for (int l = 1; l < as.length; l++)
        {
            stringbuilder.append(',').append(as[l]);
        }

        return stringbuilder.toString();
    }

    private boolean b(Intent intent)
    {
        String s = intent.getStringExtra("In-Reply-To");
        Object obj = s;
        if (s == null)
        {
            obj = s;
            if (intent.hasExtra("error"))
            {
                obj = intent.getStringExtra("google.message_id");
            }
        }
        if (obj != null)
        {
            obj = (Handler)i.remove(obj);
            if (obj != null)
            {
                Message message = Message.obtain();
                message.obj = intent;
                return ((Handler) (obj)).sendMessage(message);
            }
        }
        return false;
    }

    private static String c()
    {
        if (f == null)
        {
            f = "com.google.android.gms";
        }
        return f;
    }

    private void c(Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (h == null)
        {
            Intent intent1 = new Intent();
            intent1.setPackage("com.google.example.invalidpackage");
            h = PendingIntent.getBroadcast(g, 0, intent1, 0);
        }
        intent.putExtra("app", h);
        this;
        JVM INSTR monitorexit ;
        return;
        intent;
        throw intent;
    }

    public final transient String a(String as[])
    {
        this;
        JVM INSTR monitorenter ;
        as = b(as);
        Bundle bundle = new Bundle();
        bundle.putString("sender", as);
        as = a(a(bundle), "registration_id");
        this;
        JVM INSTR monitorexit ;
        return as;
        as;
        throw as;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
        break MISSING_BLOCK_LABEL_26;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        Intent intent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
        intent.setPackage(c());
        intent.putExtra("google.messenger", e);
        c(intent);
        g.startService(intent);
        Intent intent1 = (Intent)k.poll(30000L, TimeUnit.MILLISECONDS);
        a(intent1, "unregistered");
        this;
        JVM INSTR monitorexit ;
        return;
        intent1;
        throw new IOException(intent1.getMessage());
    }


    /* member class not found */
    class _cls1 {}

}
