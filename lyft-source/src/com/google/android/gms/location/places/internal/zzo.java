// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class zzo
{

    private static final String a = com/google/android/gms/location/places/internal/zzo.getSimpleName();
    private static final long b;
    private static zzo c;
    private final Context d;
    private final Handler e;
    private final Runnable f;
    private final Object g;
    private ArrayList h;
    private ArrayList i;

    private zzo(Context context)
    {
        this((Context)zzu.a(context), new Handler(Looper.getMainLooper()));
    }

    zzo(Context context, Handler handler)
    {
        f = new zza();
        g = new Object();
        h = null;
        i = null;
        d = context;
        e = handler;
    }

    public static zzo a(Context context)
    {
        com/google/android/gms/location/places/internal/zzo;
        JVM INSTR monitorenter ;
        int j;
        zzu.a(context);
        j = android.os.Build.VERSION.SDK_INT;
        if (j >= 14) goto _L2; else goto _L1
_L1:
        context = null;
_L4:
        com/google/android/gms/location/places/internal/zzo;
        JVM INSTR monitorexit ;
        return context;
_L2:
        if (c == null)
        {
            c = new zzo(context.getApplicationContext());
        }
        context = c;
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    static Object a(zzo zzo1)
    {
        return zzo1.g;
    }

    static ArrayList a(zzo zzo1, ArrayList arraylist)
    {
        zzo1.h = arraylist;
        return arraylist;
    }

    static ArrayList b(zzo zzo1)
    {
        return zzo1.h;
    }

    static ArrayList b(zzo zzo1, ArrayList arraylist)
    {
        zzo1.i = arraylist;
        return arraylist;
    }

    static ArrayList c(zzo zzo1)
    {
        return zzo1.i;
    }

    static Context d(zzo zzo1)
    {
        return zzo1.d;
    }

    public void a(String s, String s1)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (h == null)
        {
            h = new ArrayList();
            i = new ArrayList();
            e.postDelayed(f, b);
        }
        h.add(s);
        i.add(s1);
        if (h.size() >= 10000)
        {
            if (Log.isLoggable(a, 5))
            {
                Log.w(a, "Event buffer full, flushing");
            }
            f.run();
            e.removeCallbacks(f);
            return;
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    static 
    {
        b = TimeUnit.SECONDS.toMillis(1L);
    }

    private class zza
        implements Runnable
    {

        final zzo a;

        public void run()
        {
            synchronized (zzo.a(a))
            {
                Intent intent = new Intent("com.google.android.location.places.METHOD_CALL");
                intent.setPackage("com.google.android.gms");
                intent.putStringArrayListExtra("PLACE_IDS", zzo.b(a));
                intent.putStringArrayListExtra("METHOD_NAMES", zzo.c(a));
                zzo.d(a).sendBroadcast(intent);
                zzo.a(a, null);
                zzo.b(a, null);
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private zza()
        {
            a = zzo.this;
            super();
        }

    }

}
