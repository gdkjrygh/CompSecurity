// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.c;

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
import com.google.android.gms.iid.a;
import com.google.android.gms.iid.h;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.c:
//            c

public class b
{

    public static int a = 0x4c4b40;
    public static int b = 0x632ea0;
    public static int c = 0x6acfc0;
    static b d;
    private static final AtomicInteger i = new AtomicInteger(1);
    final Messenger e = new Messenger(new c(this, Looper.getMainLooper()));
    private Context f;
    private PendingIntent g;
    private Map h;
    private final BlockingQueue j = new LinkedBlockingQueue();

    public b()
    {
        h = Collections.synchronizedMap(new HashMap());
    }

    public static b a(Context context)
    {
        com/google/android/gms/c/b;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = new b();
            d.f = context.getApplicationContext();
        }
        context = d;
        com/google/android/gms/c/b;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private String a()
    {
        return (new StringBuilder()).append("google.rpc").append(String.valueOf(i.getAndIncrement())).toString();
    }

    static String a(Intent intent, String s)
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

    static BlockingQueue a(b b1)
    {
        return b1.j;
    }

    private void a(String s, String s1, long l, int k, Bundle bundle)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Object obj = new Intent("com.google.android.gcm.intent.SEND");
        if (bundle != null)
        {
            ((Intent) (obj)).putExtras(bundle);
        }
        a(((Intent) (obj)));
        ((Intent) (obj)).setPackage(b(f));
        ((Intent) (obj)).putExtra("google.to", s);
        ((Intent) (obj)).putExtra("google.message_id", s1);
        ((Intent) (obj)).putExtra("google.ttl", Long.toString(l));
        ((Intent) (obj)).putExtra("google.delay", Integer.toString(k));
        if (b(f).contains(".gsf"))
        {
            obj = new Bundle();
            Iterator iterator = bundle.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s2 = (String)iterator.next();
                Object obj1 = bundle.get(s2);
                if (obj1 instanceof String)
                {
                    ((Bundle) (obj)).putString((new StringBuilder()).append("gcm.").append(s2).toString(), (String)obj1);
                }
            } while (true);
            ((Bundle) (obj)).putString("google.to", s);
            ((Bundle) (obj)).putString("google.message_id", s1);
            com.google.android.gms.iid.a.b(f).b("GCM", "upstream", ((Bundle) (obj)));
            return;
        } else
        {
            f.sendOrderedBroadcast(((Intent) (obj)), "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
    }

    static boolean a(b b1, Intent intent)
    {
        return b1.b(intent);
    }

    static Context b(b b1)
    {
        return b1.f;
    }

    public static String b(Context context)
    {
        return com.google.android.gms.iid.h.a(context);
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
            obj = (Handler)h.remove(obj);
            if (obj != null)
            {
                Message message = Message.obtain();
                message.obj = intent;
                return ((Handler) (obj)).sendMessage(message);
            }
        }
        return false;
    }

    public static int c(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        int k;
        try
        {
            k = packagemanager.getPackageInfo(b(context), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return -1;
        }
        return k;
    }

    Intent a(Bundle bundle)
    {
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
        if (c(f) < 0)
        {
            throw new IOException("Google Play Services missing");
        }
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        bundle = new Intent("com.google.android.c2dm.intent.REGISTER");
        bundle.setPackage(b(f));
        a(((Intent) (bundle)));
        bundle.putExtra("google.message_id", a());
        bundle.putExtras(bundle1);
        bundle.putExtra("google.messenger", e);
        f.startService(bundle);
        try
        {
            bundle = (Intent)j.poll(30000L, TimeUnit.MILLISECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new IOException(bundle.getMessage());
        }
        return bundle;
    }

    public transient String a(String as[])
    {
        this;
        JVM INSTR monitorenter ;
        Bundle bundle;
        as = b(as);
        bundle = new Bundle();
        if (!b(f).contains(".gsf")) goto _L2; else goto _L1
_L1:
        bundle.putString("legacy.sender", as);
        as = com.google.android.gms.iid.a.b(f).a(as, "GCM", bundle);
_L4:
        this;
        JVM INSTR monitorexit ;
        return as;
_L2:
        bundle.putString("sender", as);
        as = a(a(bundle), "registration_id");
        if (true) goto _L4; else goto _L3
_L3:
        as;
        throw as;
    }

    void a(Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (g == null)
        {
            Intent intent1 = new Intent();
            intent1.setPackage("com.google.example.invalidpackage");
            g = PendingIntent.getBroadcast(f, 0, intent1, 0);
        }
        intent.putExtra("app", g);
        this;
        JVM INSTR monitorexit ;
        return;
        intent;
        throw intent;
    }

    public void a(String s, String s1, long l, Bundle bundle)
    {
        a(s, s1, l, -1, bundle);
    }

    transient String b(String as[])
    {
        if (as == null || as.length == 0)
        {
            throw new IllegalArgumentException("No senderIds");
        }
        StringBuilder stringbuilder = new StringBuilder(as[0]);
        for (int k = 1; k < as.length; k++)
        {
            stringbuilder.append(',').append(as[k]);
        }

        return stringbuilder.toString();
    }

}
