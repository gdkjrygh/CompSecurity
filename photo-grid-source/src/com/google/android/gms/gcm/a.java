// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

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
import com.google.android.gms.iid.j;
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

// Referenced classes of package com.google.android.gms.gcm:
//            b

public final class a
{

    public static int a = 0x4c4b40;
    public static int b = 0x632ea0;
    public static int c = 0x6acfc0;
    static a d;
    private static final AtomicInteger i = new AtomicInteger(1);
    final Messenger e = new Messenger(new b(this, Looper.getMainLooper()));
    private Context f;
    private PendingIntent g;
    private Map h;
    private final BlockingQueue j = new LinkedBlockingQueue();

    public a()
    {
        h = Collections.synchronizedMap(new HashMap());
    }

    private Intent a(Bundle bundle)
    {
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
        if (b(f) < 0)
        {
            throw new IOException("Google Play Services missing");
        }
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage(com.google.android.gms.iid.j.a(f));
        b(intent);
        intent.putExtra("google.message_id", (new StringBuilder("google.rpc")).append(String.valueOf(i.getAndIncrement())).toString());
        intent.putExtras(bundle);
        intent.putExtra("google.messenger", e);
        f.startService(intent);
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

    public static a a(Context context)
    {
        com/google/android/gms/gcm/a;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            a a1 = new a();
            d = a1;
            a1.f = context.getApplicationContext();
        }
        context = d;
        com/google/android/gms/gcm/a;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
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

    static BlockingQueue a(a a1)
    {
        return a1.j;
    }

    static boolean a(a a1, Intent intent)
    {
        String s1 = intent.getStringExtra("In-Reply-To");
        String s = s1;
        if (s1 == null)
        {
            s = s1;
            if (intent.hasExtra("error"))
            {
                s = intent.getStringExtra("google.message_id");
            }
        }
        if (s != null)
        {
            a1 = (Handler)a1.h.remove(s);
            if (a1 != null)
            {
                Message message = Message.obtain();
                message.obj = intent;
                return a1.sendMessage(message);
            }
        }
        return false;
    }

    public static int b(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        int k;
        try
        {
            k = packagemanager.getPackageInfo(com.google.android.gms.iid.j.a(context), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return -1;
        }
        return k;
    }

    static Context b(a a1)
    {
        return a1.f;
    }

    private void b(Intent intent)
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

    public final transient String a(String as[])
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        as = (new StringBuilder(as[0])).toString();
        obj = new Bundle();
        if (!com.google.android.gms.iid.j.a(f).contains(".gsf")) goto _L2; else goto _L1
_L1:
        ((Bundle) (obj)).putString("legacy.sender", as);
        as = com.google.android.gms.iid.a.b(f).a(as, "GCM", ((Bundle) (obj)));
_L4:
        this;
        JVM INSTR monitorexit ;
        return as;
_L2:
        Intent intent;
        ((Bundle) (obj)).putString("sender", as);
        intent = a(((Bundle) (obj)));
        if (intent != null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
        as;
        this;
        JVM INSTR monitorexit ;
        throw as;
        obj = intent.getStringExtra("registration_id");
        as = ((String []) (obj));
        if (obj != null) goto _L4; else goto _L3
_L3:
        as = intent.getStringExtra("error");
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        throw new IOException(as);
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public final void a(String s, String s1, Bundle bundle)
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
        b(((Intent) (obj)));
        ((Intent) (obj)).setPackage(com.google.android.gms.iid.j.a(f));
        ((Intent) (obj)).putExtra("google.to", s);
        ((Intent) (obj)).putExtra("google.message_id", s1);
        ((Intent) (obj)).putExtra("google.ttl", Long.toString(0L));
        ((Intent) (obj)).putExtra("google.delay", Integer.toString(-1));
        if (com.google.android.gms.iid.j.a(f).contains(".gsf"))
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
                    ((Bundle) (obj)).putString((new StringBuilder("gcm.")).append(s2).toString(), (String)obj1);
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

}
