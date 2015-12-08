// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.skypetelemetry;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import com.microsoft.applications.skypetelemetry.hardware.DeviceInformation;
import com.microsoft.applications.skypetelemetry.hardware.HardwareInformationReceiver;
import com.microsoft.applications.skypetelemetry.hardware.NetworkInformation;
import com.microsoft.applications.skypetelemetry.hardware.a;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.microsoft.applications.skypetelemetry:
//            a, b, e, SemanticContext, 
//            Logger, c

public final class LogManager extends Enum
{

    public static final LogManager a;
    private static final String b = com/microsoft/applications/skypetelemetry/LogManager.getSimpleName();
    private static final LogManager j[];
    private Map c;
    private AtomicBoolean d;
    private HardwareInformationReceiver e;
    private Context f;
    private String g;
    private b h;
    private e i;

    private LogManager(String s)
    {
        super(s, 0);
        c = new HashMap();
        d = new AtomicBoolean(false);
        e = null;
    }

    public static void a()
    {
        com/microsoft/applications/skypetelemetry/LogManager;
        JVM INSTR monitorenter ;
        a.flushNative();
        com/microsoft/applications/skypetelemetry/LogManager;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(Context context, String s, e e1)
    {
        com/microsoft/applications/skypetelemetry/LogManager;
        JVM INSTR monitorenter ;
        String.format("onAppStart|context: %s|tenantToken: %s|logConfig: %s", new Object[] {
            context, s, e1
        });
        if (a.d.get()) goto _L2; else goto _L1
_L1:
        b(context, s, e1);
        c().a(a.b);
_L4:
        com/microsoft/applications/skypetelemetry/LogManager;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.w(b, "OnAppStart already called. Ignoring.");
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    private static b b(Context context, String s, e e1)
        throws IllegalStateException
    {
        com/microsoft/applications/skypetelemetry/LogManager;
        JVM INSTR monitorenter ;
        String.format("initializeLogger|context:%s|tenantToken:%s|configuration:%s", new Object[] {
            context, s, e1
        });
        if (context == null || s == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (!s.isEmpty())
        {
            break MISSING_BLOCK_LABEL_71;
        }
        throw new IllegalArgumentException(String.format("Invalid inputs in initializeLogger|context:%s|tenantToken:%s", new Object[] {
            context, s
        }));
        context;
        com/microsoft/applications/skypetelemetry/LogManager;
        JVM INSTR monitorexit ;
        throw context;
        Object obj1;
        if (a.d.get())
        {
            throw new IllegalStateException("Telemetry system has already been initialized!");
        }
        DeviceInformation.a(context);
        NetworkInformation.a(context);
        com.microsoft.applications.skypetelemetry.hardware.a.a(context);
        obj1 = a;
        Object obj;
        obj = e1;
        if (e1 != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj = com.microsoft.applications.skypetelemetry.e.a(context);
        long l;
        obj1.i = ((e) (obj));
        a.f = context;
        context = a;
        a.e = new HardwareInformationReceiver();
        e1 = new IntentFilter();
        e1.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        e1.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        e1.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        e1.addAction("android.intent.action.MEDIA_MOUNTED");
        e1.addAction("android.intent.action.MEDIA_UNMOUNTED");
        a.f.registerReceiver(((LogManager) (context)).e, e1);
        l = a.initializeWithConfigNative(s, a.i.a, a.i.b, a.i.c, a.i.d, a.i.e, a.i.f, a.i.g, a.i.h);
        context = a;
        if (l != 0L) goto _L2; else goto _L1
_L1:
        Log.wtf(b, (new StringBuilder("Error initializing logger with token. Null logger returned from native code.")).append(s).toString());
        context = null;
_L3:
        int k;
        e1 = (SemanticContext)e();
        e1.a(android.os.Build.VERSION.INCREMENTAL);
        s = TimeZone.getDefault();
        k = s.getOffset(GregorianCalendar.getInstance(s).getTimeInMillis());
        obj = String.format("%02d:%02d", new Object[] {
            Integer.valueOf(Math.abs(k / 0x36ee80)), Integer.valueOf(Math.abs((k / 60000) % 60))
        });
        obj1 = new StringBuilder();
        if (k >= 0)
        {
            s = "+";
        } else
        {
            s = "-";
        }
        e1.b(((StringBuilder) (obj1)).append(s).append(((String) (obj))).toString());
        com/microsoft/applications/skypetelemetry/LogManager;
        JVM INSTR monitorexit ;
        return context;
_L2:
        a.g = s;
        a.h = new Logger(l);
        a.d.set(true);
        e1 = a.h;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_503;
        }
        Log.e(b, String.format("Error caching logger. Invalid arguments|app: %s| source: %s", new Object[] {
            s, ""
        }));
        if (!a.c.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_551;
        }
        ((Map)a.c.get(s)).put("", e1);
_L4:
        context = ((LogManager) (context)).h;
          goto _L3
        HashMap hashmap = new HashMap();
        hashmap.put("", e1);
        a.c.put(s, hashmap);
          goto _L4
    }

    public static void b()
    {
        com/microsoft/applications/skypetelemetry/LogManager;
        JVM INSTR monitorenter ;
        String.format("onAppStop", new Object[0]);
        if (!a.d.get()) goto _L2; else goto _L1
_L1:
        c().a(a.c);
        d();
_L4:
        com/microsoft/applications/skypetelemetry/LogManager;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.w(b, "onAppStop called before initialization. Ignoring.");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static b c()
    {
        com/microsoft/applications/skypetelemetry/LogManager;
        JVM INSTR monitorenter ;
        b b1;
        String.format("getLogger", new Object[0]);
        a.f();
        b1 = a.h;
        com/microsoft/applications/skypetelemetry/LogManager;
        JVM INSTR monitorexit ;
        return b1;
        Exception exception;
        exception;
        throw exception;
    }

    private static void d()
    {
        com/microsoft/applications/skypetelemetry/LogManager;
        JVM INSTR monitorenter ;
        LogManager logmanager;
        HardwareInformationReceiver hardwareinformationreceiver;
        if (!a.d.get())
        {
            break MISSING_BLOCK_LABEL_88;
        }
        logmanager = a;
        if (logmanager.f == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        hardwareinformationreceiver = logmanager.e;
        if (hardwareinformationreceiver == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        a.f.unregisterReceiver(logmanager.e);
_L1:
        a.flushAndTeardownNative();
        a.d.set(false);
_L2:
        com/microsoft/applications/skypetelemetry/LogManager;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.w(b, "Unable to unregister hardware receiver");
          goto _L1
        obj;
        throw obj;
        Log.w(b, "flushAndTeardown called before initialization. Ignoring.");
          goto _L2
    }

    private static c e()
    {
        com/microsoft/applications/skypetelemetry/LogManager;
        JVM INSTR monitorenter ;
        SemanticContext semanticcontext;
        a.f();
        semanticcontext = new SemanticContext(a.getSemanticContextNative());
        com/microsoft/applications/skypetelemetry/LogManager;
        JVM INSTR monitorexit ;
        return semanticcontext;
        Exception exception;
        exception;
        throw exception;
    }

    private void f()
    {
        if (!d.get())
        {
            Log.w(b, "The telemetry system has not yet been initialized!");
        }
    }

    private native void flushAndTeardownNative();

    private native void flushNative();

    private native long getSemanticContextNative();

    private native long initializeWithConfigNative(String s, String s1, String s2, String s3, int k, int l, long l1, long l2, long l3);

    public static LogManager valueOf(String s)
    {
        return (LogManager)Enum.valueOf(com/microsoft/applications/skypetelemetry/LogManager, s);
    }

    public static LogManager[] values()
    {
        return (LogManager[])j.clone();
    }

    static 
    {
        a = new LogManager("INSTANCE");
        j = (new LogManager[] {
            a
        });
    }
}
