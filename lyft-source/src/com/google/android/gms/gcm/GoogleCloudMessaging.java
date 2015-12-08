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
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.iid.zzc;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class GoogleCloudMessaging
{

    public static int a = 0x4c4b40;
    public static int b = 0x632ea0;
    public static int c = 0x6acfc0;
    static GoogleCloudMessaging d;
    private static final AtomicInteger i = new AtomicInteger(1);
    final Messenger e = new Messenger(new Handler(Looper.getMainLooper()) {

        final GoogleCloudMessaging a;

        public void handleMessage(Message message)
        {
            if (message == null || !(message.obj instanceof Intent))
            {
                Log.w("GCM", "Dropping invalid message");
            }
            message = (Intent)message.obj;
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(message.getAction()))
            {
                GoogleCloudMessaging.a(a).add(message);
            } else
            if (!GoogleCloudMessaging.a(a, message))
            {
                message.setPackage(GoogleCloudMessaging.b(a).getPackageName());
                GoogleCloudMessaging.b(a).sendBroadcast(message);
                return;
            }
        }

            
            {
                a = GoogleCloudMessaging.this;
                super(looper);
            }
    });
    private Context f;
    private PendingIntent g;
    private Map h;
    private final BlockingQueue j = new LinkedBlockingQueue();

    public GoogleCloudMessaging()
    {
        h = Collections.synchronizedMap(new HashMap());
    }

    public static GoogleCloudMessaging a(Context context)
    {
        com/google/android/gms/gcm/GoogleCloudMessaging;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = new GoogleCloudMessaging();
            d.f = context.getApplicationContext();
        }
        context = d;
        com/google/android/gms/gcm/GoogleCloudMessaging;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static BlockingQueue a(GoogleCloudMessaging googlecloudmessaging)
    {
        return googlecloudmessaging.j;
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
            InstanceID.b(f).b("GCM", "upstream", ((Bundle) (obj)));
            return;
        } else
        {
            f.sendOrderedBroadcast(((Intent) (obj)), "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
    }

    static boolean a(GoogleCloudMessaging googlecloudmessaging, Intent intent)
    {
        return googlecloudmessaging.b(intent);
    }

    static Context b(GoogleCloudMessaging googlecloudmessaging)
    {
        return googlecloudmessaging.f;
    }

    public static String b(Context context)
    {
        return zzc.a(context);
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

}
