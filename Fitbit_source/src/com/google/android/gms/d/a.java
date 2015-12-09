// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class a
{

    public static final String a = "SERVICE_NOT_AVAILABLE";
    public static final String b = "MAIN_THREAD";
    public static final String c = "deleted_messages";
    public static final String d = "gcm";
    public static final String e = "send_error";
    static a f;
    final BlockingQueue g = new LinkedBlockingQueue();
    private Context h;
    private PendingIntent i;
    private Handler j;
    private Messenger k;

    public a()
    {
        j = new _cls1(Looper.getMainLooper());
        k = new Messenger(j);
    }

    public static a a(Context context)
    {
        com/google/android/gms/d/a;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new a();
            f.h = context.getApplicationContext();
        }
        context = f;
        com/google/android/gms/d/a;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private void a(String s, String s1, long l, int i1, Bundle bundle)
        throws IOException
    {
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
        if (s == null)
        {
            throw new IllegalArgumentException("Missing 'to'");
        } else
        {
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            intent.putExtras(bundle);
            b(intent);
            intent.setPackage("com.google.android.gms");
            intent.putExtra("google.to", s);
            intent.putExtra("google.message_id", s1);
            intent.putExtra("google.ttl", Long.toString(l));
            intent.putExtra("google.delay", Integer.toString(i1));
            h.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
    }

    private transient void c(String as[])
    {
        as = b(as);
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("google.messenger", k);
        b(intent);
        intent.putExtra("sender", as);
        h.startService(intent);
    }

    private void d()
    {
        Intent intent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
        intent.setPackage("com.google.android.gms");
        g.clear();
        intent.putExtra("google.messenger", k);
        b(intent);
        h.startService(intent);
    }

    public String a(Intent intent)
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

    public transient String a(String as[])
        throws IOException
    {
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
        g.clear();
        c(as);
        try
        {
            as = (Intent)g.poll(5000L, TimeUnit.MILLISECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            throw new IOException(as.getMessage());
        }
        if (as != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
        String s = as.getStringExtra("registration_id");
        if (s != null)
        {
            return s;
        }
        as.getStringExtra("error");
        as = as.getStringExtra("error");
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        throw new IOException(as);
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public void a()
    {
        c();
    }

    public void a(String s, String s1, long l, Bundle bundle)
        throws IOException
    {
        a(s, s1, l, -1, bundle);
    }

    public void a(String s, String s1, Bundle bundle)
        throws IOException
    {
        a(s, s1, -1L, bundle);
    }

    transient String b(String as[])
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

    public void b()
        throws IOException
    {
        Object obj;
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
        d();
        try
        {
            obj = (Intent)g.poll(5000L, TimeUnit.MILLISECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IOException(((InterruptedException) (obj)).getMessage());
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
        if (((Intent) (obj)).getStringExtra("unregistered") != null)
        {
            return;
        }
        obj = ((Intent) (obj)).getStringExtra("error");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        throw new IOException(((String) (obj)));
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    void b(Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (i == null)
        {
            Intent intent1 = new Intent();
            intent1.setPackage("com.google.example.invalidpackage");
            i = PendingIntent.getBroadcast(h, 0, intent1, 0);
        }
        intent.putExtra("app", i);
        this;
        JVM INSTR monitorexit ;
        return;
        intent;
        throw intent;
    }

    void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (i != null)
        {
            i.cancel();
            i = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    /* member class not found */
    class _cls1 {}

}
