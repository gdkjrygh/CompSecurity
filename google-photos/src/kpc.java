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

public final class kpc
{

    public static kpc a;
    private static final AtomicInteger e = new AtomicInteger(1);
    private Context b;
    private PendingIntent c;
    private Map d;
    private final BlockingQueue f = new LinkedBlockingQueue();
    private Messenger g;

    public kpc()
    {
        d = Collections.synchronizedMap(new HashMap());
        g = new Messenger(new kpd(this, Looper.getMainLooper()));
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
        intent.setPackage(kri.a(b));
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

    static BlockingQueue a(kpc kpc1)
    {
        return kpc1.f;
    }

    public static kpc a(Context context)
    {
        kpc;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            kpc kpc1 = new kpc();
            a = kpc1;
            kpc1.b = context.getApplicationContext();
        }
        context = a;
        kpc;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static boolean a(kpc kpc1, Intent intent)
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
            kpc1 = (Handler)kpc1.d.remove(s);
            if (kpc1 != null)
            {
                Message message = Message.obtain();
                message.obj = intent;
                return kpc1.sendMessage(message);
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
            i = packagemanager.getPackageInfo(kri.a(context), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return -1;
        }
        return i;
    }

    static Context b(kpc kpc1)
    {
        return kpc1.b;
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
        boolean flag1 = true;
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        if (as.length != 0)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        throw new IllegalArgumentException("No senderIds");
        as;
        this;
        JVM INSTR monitorexit ;
        throw as;
        Object obj = new StringBuilder(as[0]);
        int i = 1;
_L2:
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringBuilder) (obj)).append(',').append(as[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        Object obj1;
        Bundle bundle;
        obj1 = ((StringBuilder) (obj)).toString();
        bundle = new Bundle();
        if (!kri.a(b).contains(".gsf")) goto _L4; else goto _L3
_L3:
        krf krf1;
        bundle.putString("legacy.sender", ((String) (obj1)));
        krf1 = krf.b(b);
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
        if (!krf.c()) goto _L6; else goto _L5
_L5:
        obj = null;
_L7:
        as = ((String []) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        i = ((flag1) ? 1 : 0);
        if (bundle.getString("ttl") != null)
        {
            i = 0;
        }
        if ("jwt".equals(bundle.getString("type")))
        {
            i = ((flag) ? 1 : 0);
        }
        obj = krf1.a(((String) (obj1)), "GCM", bundle);
        Log.w("InstanceID", (new StringBuilder("token: ")).append(((String) (obj))).toString());
        as = ((String []) (obj));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        as = ((String []) (obj));
        if (!i)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        krf.a.a(krf1.c, ((String) (obj1)), "GCM", ((String) (obj)), krf.e);
        as = ((String []) (obj));
_L9:
        this;
        JVM INSTR monitorexit ;
        return as;
_L6:
        obj = krf.a.a(krf1.c, ((String) (obj1)), "GCM");
          goto _L7
_L4:
        bundle.putString("sender", ((String) (obj1)));
        obj1 = a(bundle);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_321;
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
        obj = ((Intent) (obj1)).getStringExtra("registration_id");
        as = ((String []) (obj));
        if (obj != null) goto _L9; else goto _L8
_L8:
        as = ((Intent) (obj1)).getStringExtra("error");
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_355;
        }
        throw new IOException(as);
        throw new IOException("SERVICE_NOT_AVAILABLE");
          goto _L7
    }

    public final void a()
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

    public final void a(String s, String s1, long l, Bundle bundle)
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
        ((Intent) (obj)).setPackage(kri.a(b));
        ((Intent) (obj)).putExtra("google.to", s);
        ((Intent) (obj)).putExtra("google.message_id", s1);
        ((Intent) (obj)).putExtra("google.ttl", Long.toString(0L));
        ((Intent) (obj)).putExtra("google.delay", Integer.toString(-1));
        if (kri.a(b).contains(".gsf"))
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
            krf.b(b).a("GCM", "upstream", ((Bundle) (obj)));
            return;
        } else
        {
            b.sendOrderedBroadcast(((Intent) (obj)), "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
    }

}
