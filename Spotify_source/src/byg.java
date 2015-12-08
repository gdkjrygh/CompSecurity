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
import android.util.Log;
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

public final class byg
{

    private static byg a;
    private static final AtomicInteger e = new AtomicInteger(1);
    private Context b;
    private PendingIntent c;
    private Map d;
    private final BlockingQueue f = new LinkedBlockingQueue();
    private Messenger g;

    public byg()
    {
        d = Collections.synchronizedMap(new HashMap());
        g = new Messenger(new Handler(Looper.getMainLooper()) {

            private byg a;

            public final void handleMessage(Message message)
            {
                if (message == null || !(message.obj instanceof Intent))
                {
                    Log.w("GCM", "Dropping invalid message");
                }
                message = (Intent)message.obj;
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(message.getAction()))
                {
                    byg.a(a).add(message);
                } else
                if (!byg.a(a, message))
                {
                    message.setPackage(byg.b(a).getPackageName());
                    byg.b(a).sendBroadcast(message);
                    return;
                }
            }

            
            {
                a = byg.this;
                super(looper);
            }
        });
    }

    private Intent a(Bundle bundle)
    {
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
        if (b(b) < 0)
        {
            throw new IOException("Google Play Services missing");
        }
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage(byn.a(b));
        b(intent);
        intent.putExtra("google.message_id", (new StringBuilder("google.rpc")).append(String.valueOf(e.getAndIncrement())).toString());
        intent.putExtras(bundle);
        intent.putExtra("google.messenger", g);
        b.startService(intent);
        try
        {
            bundle = (Intent)f.poll(30000L, TimeUnit.MILLISECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new IOException(bundle.getMessage());
        }
        return bundle;
    }

    public static byg a(Context context)
    {
        byg;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            byg byg1 = new byg();
            a = byg1;
            byg1.b = context.getApplicationContext();
        }
        context = a;
        byg;
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

    static BlockingQueue a(byg byg1)
    {
        return byg1.f;
    }

    static boolean a(byg byg1, Intent intent)
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
            byg1 = (Handler)byg1.d.remove(s);
            if (byg1 != null)
            {
                Message message = Message.obtain();
                message.obj = intent;
                return byg1.sendMessage(message);
            }
        }
        return false;
    }

    public static int b(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        int i;
        try
        {
            i = packagemanager.getPackageInfo(byn.a(context), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return -1;
        }
        return i;
    }

    static Context b(byg byg1)
    {
        return byg1.b;
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (c != null)
        {
            c.cancel();
            c = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void b(Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            Intent intent1 = new Intent();
            intent1.setPackage("com.google.example.invalidpackage");
            c = PendingIntent.getBroadcast(b, 0, intent1, 0);
        }
        intent.putExtra("app", c);
        this;
        JVM INSTR monitorexit ;
        return;
        intent;
        throw intent;
    }

    public final transient String a(String as[])
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Bundle bundle;
        obj = (new StringBuilder(as[0])).toString();
        bundle = new Bundle();
        if (!byn.a(b).contains(".gsf")) goto _L2; else goto _L1
_L1:
        byh byh1;
        bundle.putString("legacy.sender", ((String) (obj)));
        byh1 = byh.b(b);
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
          goto _L3
        as;
        this;
        JVM INSTR monitorexit ;
        throw as;
_L3:
        boolean flag = true;
        if (!byh.c()) goto _L5; else goto _L4
_L4:
        String s = null;
_L6:
        as = s;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        if (bundle.getString("ttl") != null)
        {
            flag = false;
        }
        if ("jwt".equals(bundle.getString("type")))
        {
            flag = flag1;
        }
        s = byh1.a(((String) (obj)), "GCM", bundle);
        Log.w("InstanceID", (new StringBuilder("token: ")).append(s).toString());
        as = s;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        as = s;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        byh.a.a(byh1.c, ((String) (obj)), "GCM", s, byh.e);
        as = s;
_L8:
        this;
        JVM INSTR monitorexit ;
        return as;
_L5:
        s = byh.a.a(byh1.c, ((String) (obj)), "GCM");
          goto _L6
_L2:
        bundle.putString("sender", ((String) (obj)));
        obj = a(bundle);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
        s = ((Intent) (obj)).getStringExtra("registration_id");
        as = s;
        if (s != null) goto _L8; else goto _L7
_L7:
        as = ((Intent) (obj)).getStringExtra("error");
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        throw new IOException(as);
        throw new IOException("SERVICE_NOT_AVAILABLE");
          goto _L6
    }

    public final void a()
    {
        a = null;
        b();
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
        ((Intent) (obj)).setPackage(byn.a(b));
        ((Intent) (obj)).putExtra("google.to", s);
        ((Intent) (obj)).putExtra("google.message_id", s1);
        ((Intent) (obj)).putExtra("google.ttl", Long.toString(0L));
        ((Intent) (obj)).putExtra("google.delay", Integer.toString(-1));
        if (byn.a(b).contains(".gsf"))
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
            byh.b(b).a("GCM", "upstream", ((Bundle) (obj)));
            return;
        } else
        {
            b.sendOrderedBroadcast(((Intent) (obj)), "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
    }

}
