// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import com.qihoo.security.service.ProcessClearService;
import com.qihoo.security.service.SecurityService;
import com.qihoo360.mobilesafe.core.c.c;
import com.qihoo360.mobilesafe.service.ProcessInfo;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class com.qihoo.security.app.a
{
    private class a extends com.qihoo.security.booster.b
        implements ServiceConnection
    {

        final com.qihoo.security.app.a a;

        public void a(List list)
        {
            synchronized (a.a)
            {
                a.a.a = list;
            }
            obj = com.qihoo.security.opti.a.a.a(list);
            synchronized (a.a)
            {
                if (a.a.a != null)
                {
                    a.a.b = ((Map) (obj));
                    a.a.c = SystemClock.elapsedRealtime();
                    obj = Message.obtain(com.qihoo.security.app.a.b(a), 0, a.a);
                    com.qihoo.security.app.a.b(a).sendMessage(((Message) (obj)));
                }
            }
            return;
            list;
            obj;
            JVM INSTR monitorexit ;
            throw list;
            exception;
            list;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void a_(int i1, int j1)
        {
            Message message = Message.obtain(com.qihoo.security.app.a.b(a), 1, i1, j1);
            com.qihoo.security.app.a.b(a).sendMessage(message);
        }

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            componentname = Message.obtain(com.qihoo.security.app.a.a(a), 1, ibinder);
            com.qihoo.security.app.a.a(a).sendMessage(componentname);
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            com.qihoo.security.app.a.a(a).sendEmptyMessage(2);
        }

        a()
        {
            a = com.qihoo.security.app.a.this;
            super(com.qihoo.security.app.a.a(com.qihoo.security.app.a.this));
        }
    }

    public static interface b
    {

        public abstract void a(int i1, int j1);

        public abstract void a(List list, Map map);
    }

    public static class c
    {

        public List a;
        public Map b;
        public long c;

        public c()
        {
        }

        public c(c c1)
        {
            c = c1.c;
            if (c1.a != null)
            {
                a = new ArrayList();
                ProcessInfo processinfo;
                for (Iterator iterator = c1.a.iterator(); iterator.hasNext(); a.add(processinfo))
                {
                    processinfo = (ProcessInfo)iterator.next();
                }

            }
            if (c1.b != null)
            {
                b = new HashMap();
                String s;
                for (Iterator iterator1 = c1.b.keySet().iterator(); iterator1.hasNext(); b.put(s, c1.b.get(s)))
                {
                    s = (String)iterator1.next();
                }

            }
        }
    }


    private static int b = -1;
    private static final int c = Process.myUid();
    private static int d = 0;
    private static int e = 1;
    private static int f = 2;
    private static com.qihoo.security.app.a g;
    c a;
    private com.qihoo360.mobilesafe.core.c.c h;
    private final Context i;
    private final a j = new a();
    private final Handler k;
    private final Handler l = new Handler(Looper.getMainLooper()) {

        final com.qihoo.security.app.a a;

        public void handleMessage(Message message)
        {
            com.qihoo.security.app.a.a(a, message, this);
        }

            
            {
                a = com.qihoo.security.app.a.this;
                super(looper);
            }
    };
    private final List m = new ArrayList();
    private boolean n;

    private com.qihoo.security.app.a(Context context)
    {
        a = new c();
        n = false;
        i = context.getApplicationContext();
        context = new Intent(com.qihoo.security.env.a.f);
        context.setClass(i, com/qihoo/security/service/SecurityService);
        HandlerThread handlerthread = new HandlerThread("BoosterHelper", 10);
        handlerthread.start();
        k = new Handler(handlerthread.getLooper()) {

            final com.qihoo.security.app.a a;

            public void handleMessage(Message message)
            {
                com.qihoo.security.app.a.a(a, message, this);
            }

            
            {
                a = com.qihoo.security.app.a.this;
                super(looper);
            }
        };
        i.bindService(context, j, 1);
    }

    static Handler a(com.qihoo.security.app.a a1)
    {
        return a1.k;
    }

    public static com.qihoo.security.app.a a(Context context)
    {
        com/qihoo/security/app/a;
        JVM INSTR monitorenter ;
        if (g == null)
        {
            g = new com.qihoo.security.app.a(context);
        }
        context = g;
        com/qihoo/security/app/a;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static void a(Context context, boolean flag)
    {
        SharedPref.a(context, "key_boost_is_fastest", flag);
    }

    private void a(Message message, Handler handler)
    {
        boolean flag = true;
        if (handler != k) goto _L2; else goto _L1
_L1:
        message.what;
        JVM INSTR tableswitch 0 3: default 360
    //                   0 44
    //                   1 86
    //                   2 143
    //                   3 157;
           goto _L3 _L4 _L5 _L6 _L7
_L4:
        if (h == null) goto _L9; else goto _L8
_L8:
        if (a()) goto _L3; else goto _L10
_L10:
        handler = h;
        Iterator iterator;
        b b1;
        if (message.arg1 != 1)
        {
            flag = false;
        }
        handler.a(flag);
        return;
_L9:
        try
        {
            n = true;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            return;
        }
_L5:
        h = com.qihoo360.mobilesafe.core.c.c.a.a((IBinder)message.obj);
        h.a(j);
        if (n)
        {
            n = false;
            if (!a())
            {
                h.a(true);
                return;
            }
        }
          goto _L3
_L6:
        h.b(j);
        return;
_L7:
        if (h != null)
        {
            h.e();
            ProcessClearService.a(null);
            return;
        }
          goto _L3
_L2:
        message.what;
        JVM INSTR tableswitch 0 1: default 369
    //                   0 204
    //                   1 286;
           goto _L11 _L12 _L13
_L12:
        handler = (c)message.obj;
        message = m;
        message;
        JVM INSTR monitorenter ;
        iterator = m.iterator();
_L17:
        if (!iterator.hasNext()) goto _L15; else goto _L14
_L14:
        b1 = (b)((WeakReference)iterator.next()).get();
        if (b1 == null) goto _L17; else goto _L16
_L16:
        b1.a(((c) (handler)).a, ((c) (handler)).b);
          goto _L17
        handler;
        message;
        JVM INSTR monitorexit ;
        throw handler;
_L15:
        message;
        JVM INSTR monitorexit ;
        return;
_L13:
        handler = m;
        handler;
        JVM INSTR monitorenter ;
        iterator = m.iterator();
_L21:
        if (!iterator.hasNext()) goto _L19; else goto _L18
_L18:
        b1 = (b)((WeakReference)iterator.next()).get();
        if (b1 == null) goto _L21; else goto _L20
_L20:
        b1.a(message.arg1, message.arg2);
          goto _L21
        message;
        handler;
        JVM INSTR monitorexit ;
        throw message;
_L19:
        handler;
        JVM INSTR monitorexit ;
        return;
_L3:
        return;
_L11:
    }

    static void a(com.qihoo.security.app.a a1, Message message, Handler handler)
    {
        a1.a(message, handler);
    }

    static Handler b(com.qihoo.security.app.a a1)
    {
        return a1.l;
    }

    public static boolean b(Context context)
    {
        return SharedPref.b(context, "key_boost_is_fastest", false);
    }

    public void a(b b1)
    {
        synchronized (m)
        {
            b1 = new WeakReference(b1);
            m.add(b1);
        }
        return;
        b1;
        list;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public void a(boolean flag)
    {
        int i1 = 0;
        Message message = Message.obtain(k);
        message.what = 0;
        if (flag)
        {
            i1 = 1;
        }
        message.arg1 = i1;
        k.sendMessage(message);
    }

    public boolean a()
    {
        if (h == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        boolean flag = h.f();
        return flag;
        RemoteException remoteexception;
        remoteexception;
        return false;
    }

    public void b(b b1)
    {
        List list = m;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = m.iterator();
_L3:
        b b2;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_77;
        }
        b2 = (b)((WeakReference)iterator.next()).get();
        if (b2 != null) goto _L2; else goto _L1
_L1:
        iterator.remove();
          goto _L3
        b1;
        list;
        JVM INSTR monitorexit ;
        throw b1;
_L2:
        if (b2 != b1) goto _L3; else goto _L4
_L4:
        iterator.remove();
          goto _L3
        list;
        JVM INSTR monitorexit ;
    }

    public boolean b()
    {
        if (h == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        boolean flag = h.g();
        return flag;
        RemoteException remoteexception;
        remoteexception;
        return false;
    }

    public long c()
    {
        if (h == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        long l1 = h.i();
        return l1;
        RemoteException remoteexception;
        remoteexception;
        return 0L;
    }

    public void d()
    {
        k.sendEmptyMessage(3);
    }

    public c e()
    {
        c c2;
        synchronized (a)
        {
            c2 = new c(a);
        }
        return c2;
        exception;
        c1;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
