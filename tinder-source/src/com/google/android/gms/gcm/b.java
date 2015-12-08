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
import android.util.Log;
import com.google.android.gms.iid.a;
import com.google.android.gms.iid.e;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class b
{

    public static int a = 0x4c4b40;
    public static int b = 0x632ea0;
    public static int c = 0x6acfc0;
    static b d;
    private static final AtomicInteger i = new AtomicInteger(1);
    final Messenger e = new Messenger(new Handler(Looper.getMainLooper()) {

        final b a;

        public final void handleMessage(Message message)
        {
            if (message == null || !(message.obj instanceof Intent))
            {
                Log.w("GCM", "Dropping invalid message");
            }
            message = (Intent)message.obj;
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(message.getAction()))
            {
                com.google.android.gms.gcm.b.a(a).add(message);
            } else
            if (!com.google.android.gms.gcm.b.a(a, message))
            {
                message.setPackage(b.b(a).getPackageName());
                b.b(a).sendBroadcast(message);
                return;
            }
        }

            
            {
                a = b.this;
                super(looper);
            }
    });
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
        com/google/android/gms/gcm/b;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            b b1 = new b();
            d = b1;
            b1.f = context.getApplicationContext();
        }
        context = d;
        com/google/android/gms/gcm/b;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static BlockingQueue a(b b1)
    {
        return b1.j;
    }

    private void a(Intent intent)
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

    static boolean a(b b1, Intent intent)
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
            b1 = (Handler)b1.h.remove(s);
            if (b1 != null)
            {
                Message message = Message.obtain();
                message.obj = intent;
                return b1.sendMessage(message);
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
            k = packagemanager.getPackageInfo(com.google.android.gms.iid.e.a(context), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return -1;
        }
        return k;
    }

    static Context b(b b1)
    {
        return b1.f;
    }

    public final void a(String s, String s1, Bundle bundle)
        throws IOException
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
        ((Intent) (obj)).setPackage(com.google.android.gms.iid.e.a(f));
        ((Intent) (obj)).putExtra("google.to", s);
        ((Intent) (obj)).putExtra("google.message_id", s1);
        ((Intent) (obj)).putExtra("google.ttl", Long.toString(0L));
        ((Intent) (obj)).putExtra("google.delay", Integer.toString(-1));
        if (com.google.android.gms.iid.e.a(f).contains(".gsf"))
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
            com.google.android.gms.iid.a.b(f).a("GCM", "upstream", ((Bundle) (obj)));
            return;
        } else
        {
            f.sendOrderedBroadcast(((Intent) (obj)), "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
    }

}
