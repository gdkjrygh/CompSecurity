// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import android.content.Context;
import android.util.Log;
import com.facebook.am;
import com.facebook.internal.ak;
import com.facebook.internal.aw;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.a:
//            p, s, a, i

final class o
{

    private static final Object a = new Object();
    private static boolean b = false;
    private static boolean c = false;
    private static Map d;
    private static final Runnable e = new p();

    private static s a(Context context, i i)
    {
        Object obj1 = null;
        Object obj2 = a;
        obj2;
        JVM INSTR monitorenter ;
        boolean flag = c;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        Object obj = new ObjectInputStream(context.openFileInput("AppEventsLogger.persistedsessioninfo"));
        obj1 = obj;
        d = (HashMap)((ObjectInputStream) (obj)).readObject();
        obj1 = obj;
        ak.a(am.e, "AppEvents", "App session info loaded");
        aw.a(((java.io.Closeable) (obj)));
        context.deleteFile("AppEventsLogger.persistedsessioninfo");
        if (d == null)
        {
            d = new HashMap();
        }
        c = true;
        b = false;
_L1:
        obj2;
        JVM INSTR monitorexit ;
        obj = (s)d.get(i);
        context = ((Context) (obj));
        if (obj == null)
        {
            context = new s();
            d.put(i, context);
        }
        return context;
        obj;
        obj = obj1;
_L4:
        aw.a(((java.io.Closeable) (obj)));
        context.deleteFile("AppEventsLogger.persistedsessioninfo");
        if (d == null)
        {
            d = new HashMap();
        }
        c = true;
        b = false;
          goto _L1
        context;
        obj2;
        JVM INSTR monitorexit ;
        throw context;
        Exception exception;
        exception;
        obj = null;
_L3:
        obj1 = obj;
        Log.d(com.facebook.a.a.f(), (new StringBuilder("Got unexpected exception: ")).append(exception.toString()).toString());
        aw.a(((java.io.Closeable) (obj)));
        context.deleteFile("AppEventsLogger.persistedsessioninfo");
        if (d == null)
        {
            d = new HashMap();
        }
        c = true;
        b = false;
          goto _L1
_L2:
        aw.a(((java.io.Closeable) (obj1)));
        context.deleteFile("AppEventsLogger.persistedsessioninfo");
        if (d == null)
        {
            d = new HashMap();
        }
        c = true;
        b = false;
        throw i;
        i;
          goto _L2
        exception;
          goto _L3
        obj1;
          goto _L4
        i;
        obj1 = null;
          goto _L2
    }

    private static void a()
    {
        if (!b)
        {
            b = true;
            com.facebook.a.a.g().schedule(e, 30L, TimeUnit.SECONDS);
        }
    }

    static void a(Context context)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = b;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(new BufferedOutputStream(context.openFileOutput("AppEventsLogger.persistedsessioninfo", 0)));
        context = objectoutputstream;
        objectoutputstream.writeObject(d);
        context = objectoutputstream;
        b = false;
        context = objectoutputstream;
        ak.a(am.e, "AppEvents", "App session info saved");
        aw.a(objectoutputstream);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception1;
        exception1;
        objectoutputstream = null;
_L4:
        context = objectoutputstream;
        Log.d(com.facebook.a.a.f(), (new StringBuilder("Got unexpected exception: ")).append(exception1.toString()).toString());
        aw.a(objectoutputstream);
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        Exception exception;
        exception;
        context = null;
_L3:
        aw.a(context);
        throw exception;
        exception;
        if (true) goto _L3; else goto _L2
_L2:
        exception1;
          goto _L4
    }

    static void a(Context context, i i, long l)
    {
        synchronized (a)
        {
            a(context, i).a(l);
            a();
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void a(Context context, i i, a a1, long l, String s1)
    {
        synchronized (a)
        {
            a(context, i).a(a1, l, s1);
            a();
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

}
