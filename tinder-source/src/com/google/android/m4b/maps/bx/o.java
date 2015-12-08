// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.m4b.maps.al.b;
import com.google.android.m4b.maps.av.a;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.ay.u;
import com.google.android.m4b.maps.ay.w;
import com.google.android.m4b.maps.be.g;
import com.google.android.m4b.maps.bg.c;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bq.d;
import com.google.android.m4b.maps.bq.i;
import com.google.android.m4b.maps.bq.j;
import com.google.android.m4b.maps.bq.l;
import com.google.android.m4b.maps.bw.e;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;

public final class o
{

    private static ah a[];
    private static ah b[];
    private static boolean c = false;
    private static volatile int d = 10;
    private static volatile int e = -1;

    public static j a(ah ah1, Context context, Resources resources, m m1, com.google.android.m4b.maps.bs.e e1)
    {
        com/google/android/m4b/maps/bx/o;
        JVM INSTR monitorenter ;
        ah1 = a(ah1, ((u) (m1)), context, resources, e1);
        com/google/android/m4b/maps/bx/o;
        JVM INSTR monitorexit ;
        return ah1;
        ah1;
        throw ah1;
    }

    public static j a(ah ah1, u u, Context context, Resources resources, com.google.android.m4b.maps.bs.e e1)
    {
        com/google/android/m4b/maps/bx/o;
        JVM INSTR monitorenter ;
        if (!c)
        {
            throw new IllegalStateException("VectorGlobalState.initialize() must be called first");
        }
        break MISSING_BLOCK_LABEL_25;
        ah1;
        com/google/android/m4b/maps/bx/o;
        JVM INSTR monitorexit ;
        throw ah1;
        Locale locale = Locale.getDefault();
        context = com.google.android.m4b.maps.al.b.c(context);
        a(new ah[] {
            ah1
        }, u, locale, ((File) (context)), resources, e1);
        ah1 = l.b(ah1);
        com/google/android/m4b/maps/bx/o;
        JVM INSTR monitorexit ;
        return ah1;
    }

    public static void a(Context context, Resources resources, ah aah[], int i1, m m1, com.google.android.m4b.maps.bs.e e1, com.google.android.m4b.maps.bw.g g1)
    {
        com/google/android/m4b/maps/bx/o;
        JVM INSTR monitorenter ;
        boolean flag = c;
        if (!flag) goto _L2; else goto _L1
_L1:
        com/google/android/m4b/maps/bx/o;
        JVM INSTR monitorexit ;
        return;
_L2:
        Locale locale;
        long l1;
        l1 = SystemClock.uptimeMillis();
        com.google.android.m4b.maps.av.a.a();
        e = ((ActivityManager)context.getSystemService("activity")).getMemoryClass();
        com.google.android.m4b.maps.al.b.a(context).mkdirs();
        com.google.android.m4b.maps.al.b.b(context).mkdir();
        com.google.android.m4b.maps.al.b.c(context).mkdir();
        context = com.google.android.m4b.maps.al.b.c(context);
        com.google.android.m4b.maps.bg.c.a(m1, context, e1);
        locale = Locale.getDefault();
        if (i1 == -1)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        i.a(resources.openRawResource(i1));
_L8:
        a(aah, ((u) (m1)), locale, ((File) (context)), resources, e1);
        context = com.google.android.m4b.maps.bq.d.a(m1, context, locale, new k(), e1);
        if (context == null) goto _L4; else goto _L3
_L3:
        context.start();
        context;
        JVM INSTR monitorenter ;
        while (((d) (context)).c == null) 
        {
            context.wait();
        }
          goto _L5
        resources;
        context;
        JVM INSTR monitorexit ;
        try
        {
            throw resources;
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources) { }
        finally
        {
            com/google/android/m4b/maps/bx/o;
        }
        Thread.currentThread().interrupt();
_L9:
        ((d) (context)).a.a(context);
        com.google.android.m4b.maps.az.i.a(context, g1);
_L4:
        long l2 = SystemClock.uptimeMillis();
        if (ab.a("VectorGlobalState", 3))
        {
            Log.d("VectorGlobalState", (new StringBuilder(42)).append("Initialization took ").append(l2 - l1).append("ms").toString());
        }
        c = true;
        com.google.android.m4b.maps.av.a.b();
        if (true) goto _L1; else goto _L6
_L6:
        JVM INSTR monitorexit ;
        throw context;
        IOException ioexception;
        ioexception;
        if (!ab.a("VectorGlobalState", 6)) goto _L8; else goto _L7
_L7:
        Log.e("VectorGlobalState", "Could not load encryption key", ioexception);
          goto _L8
_L5:
        context;
        JVM INSTR monitorexit ;
          goto _L9
    }

    private static void a(ah aah[], u u, Locale locale, File file, Resources resources, com.google.android.m4b.maps.bs.e e1)
    {
        com/google/android/m4b/maps/bx/o;
        JVM INSTR monitorenter ;
        int k1 = aah.length;
        int i1 = 0;
_L3:
        if (i1 >= k1) goto _L2; else goto _L1
_L1:
        ah ah1 = aah[i1];
        j j1;
        if (l.a(ah1))
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = ah1.a(u, resources, locale, file, e1);
        if (j1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1.b();
        l.a(ah1, j1);
        i1++;
          goto _L3
_L2:
        return;
        aah;
        throw aah;
    }

    public static boolean a()
    {
        return w.a;
    }

    public static void b()
    {
        com/google/android/m4b/maps/bx/o;
        JVM INSTR monitorenter ;
        boolean flag = c;
        if (flag) goto _L2; else goto _L1
_L1:
        com/google/android/m4b/maps/bx/o;
        JVM INSTR monitorexit ;
        return;
_L2:
        Iterator iterator = ah.c().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ah ah1 = (ah)iterator.next();
            if (l.a(ah1))
            {
                l.b(ah1).c();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_68;
        Exception exception;
        exception;
        throw exception;
        Object obj;
        if (com.google.android.m4b.maps.bg.c.a() != null)
        {
            com.google.android.m4b.maps.bg.c.a().a(false);
        }
        if (com.google.android.m4b.maps.bq.d.a() == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = com.google.android.m4b.maps.bq.d.a();
        ((d) (obj)).b();
        obj = ((d) (obj)).b;
        synchronized (((g) (obj)).b)
        {
            ((g) (obj)).b.a(0);
        }
        synchronized (((g) (obj)).c)
        {
            ((g) (obj)).c.a(0);
        }
        if (true) goto _L1; else goto _L3
_L3:
        exception1;
        e1;
        JVM INSTR monitorexit ;
        throw exception1;
        exception2;
        e1;
        JVM INSTR monitorexit ;
        throw exception2;
    }

    public static int c()
    {
        return d;
    }

    public static void d()
    {
        com/google/android/m4b/maps/bx/o;
        JVM INSTR monitorenter ;
        boolean flag = c;
        if (flag) goto _L2; else goto _L1
_L1:
        com/google/android/m4b/maps/bx/o;
        JVM INSTR monitorexit ;
        return;
_L2:
        Iterator iterator = ah.c().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ah ah1 = (ah)iterator.next();
            if (l.a(ah1))
            {
                l.b(ah1).a();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_68;
        Exception exception;
        exception;
        throw exception;
        Object obj;
        com.google.android.m4b.maps.bg.c.a().a(true);
        if (com.google.android.m4b.maps.bq.d.a() == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = com.google.android.m4b.maps.bq.d.a();
        ((d) (obj)).b();
        obj = ((d) (obj)).b;
        synchronized (((g) (obj)).b)
        {
            ((g) (obj)).b.a(0);
        }
        synchronized (((g) (obj)).c)
        {
            ((g) (obj)).c.a(0);
        }
        if (((g) (obj)).d != null)
        {
            ((g) (obj)).d.a();
        }
        if (true) goto _L1; else goto _L3
_L3:
        exception1;
        e1;
        JVM INSTR monitorexit ;
        throw exception1;
        exception2;
        e1;
        JVM INSTR monitorexit ;
        throw exception2;
    }

    public static int e()
    {
        return e;
    }

    static 
    {
        a = (new ah[] {
            ah.b, ah.d, ah.g, ah.h, ah.i
        });
        b = (new ah[] {
            ah.a, ah.c, ah.d, ah.f, ah.e, ah.j, ah.l, ah.k, ah.m, ah.n, 
            ah.o, ah.p
        });
    }
}
