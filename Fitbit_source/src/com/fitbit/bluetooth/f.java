// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelUuid;
import android.os.SystemClock;
import android.text.TextUtils;
import com.fitbit.util.z;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class f
{
    private static final class a extends BroadcastReceiver
    {

        private Reference a;

        public void a(c c1)
        {
            a = new SoftReference(c1);
        }

        public void onReceive(Context context, Intent intent)
        {
            if (a == null)
            {
                z.a(this);
            } else
            {
                context = (c)a.get();
                if (context == null)
                {
                    z.a(this);
                    return;
                }
                int i1 = intent.getIntExtra("bytes", 0);
                int j1 = intent.getIntExtra("pending_bytes", 0x7fffffff);
                ParcelUuid parceluuid = (ParcelUuid)intent.getParcelableExtra("transfer_source");
                long l1 = intent.getLongExtra("time_of_transfer", 0L);
                intent = intent.getAction();
                if (TextUtils.equals(f.a, intent))
                {
                    context.b(parceluuid.getUuid(), i1, j1, l1);
                    return;
                }
                if (TextUtils.equals(f.b, intent))
                {
                    context.a(parceluuid.getUuid(), i1, j1, l1);
                    return;
                }
            }
        }

        private a()
        {
        }

    }

    public static class b
    {

        private final Map a = new HashMap();

        public float a(UUID uuid, TimeUnit timeunit)
        {
            uuid = (a)a.get(uuid);
            if (uuid == null)
            {
                return (0.0F / 0.0F);
            } else
            {
                return ((1.0F * (float)((a) (uuid)).a) / (float)((a) (uuid)).b) * (float)TimeUnit.MILLISECONDS.convert(1L, timeunit);
            }
        }

        public void a(UUID uuid, int i1, long l1)
        {
            a a1 = (a)a.get(uuid);
            if (a1 == null)
            {
                a1 = new a();
                a1.c = l1;
                a1.a = i1;
                a.put(uuid, a1);
                return;
            } else
            {
                a1.a = a1.a + i1;
                a1.b = (int)((long)a1.b + (l1 - a1.c));
                a1.c = l1;
                return;
            }
        }

        public b()
        {
        }
    }

    private static class b.a
    {

        int a;
        int b;
        long c;

        private b.a()
        {
        }

    }

    public static interface c
    {

        public abstract void a(UUID uuid, int i1, int j1, long l1);

        public abstract void b(UUID uuid, int i1, int j1, long l1);
    }


    public static final String a = String.format("%s.BYTES_SENT", new Object[] {
        com/fitbit/bluetooth/f.getCanonicalName()
    });
    public static final String b = String.format("%s.BYTES_RECEIVED", new Object[] {
        com/fitbit/bluetooth/f.getCanonicalName()
    });
    public static final String c = "transfer_source";
    public static final String d = "time_of_transfer";
    public static final String e = "bytes";
    public static final String f = "pending_bytes";
    private static final long g = 500L;
    private static IntentFilter h;
    private static int i = 0;
    private static int j = 0;
    private static int k = 0;
    private static int l = 0;
    private static final Object m = new Object();
    private static Handler n = null;
    private static ParcelUuid o = null;
    private final a p = new a();

    public f()
    {
    }

    public static void a(ParcelUuid parceluuid, int i1, int j1)
    {
        Object obj = m;
        obj;
        JVM INSTR monitorenter ;
        if (o == null || parceluuid == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        if (!o.equals(parceluuid))
        {
            f();
        }
        o = parceluuid;
        i += i1;
        j = j1;
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        e();
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        f();
        if (true) goto _L2; else goto _L1
_L1:
        parceluuid;
        obj;
        JVM INSTR monitorexit ;
        throw parceluuid;
    }

    private static void a(String s, ParcelUuid parceluuid, int i1, int j1)
    {
        s = new Intent(s);
        s.putExtra("transfer_source", parceluuid);
        s.putExtra("bytes", i1);
        s.putExtra("pending_bytes", j1);
        s.putExtra("time_of_transfer", SystemClock.elapsedRealtime());
        z.a(s);
    }

    static Object b()
    {
        return m;
    }

    public static void b(ParcelUuid parceluuid, int i1, int j1)
    {
        Object obj = m;
        obj;
        JVM INSTR monitorenter ;
        if (o == null || parceluuid == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        if (!o.equals(parceluuid))
        {
            f();
        }
        o = parceluuid;
        k += i1;
        l = j1;
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        e();
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        f();
        if (true) goto _L2; else goto _L1
_L1:
        parceluuid;
        obj;
        JVM INSTR monitorexit ;
        throw parceluuid;
    }

    static Handler c()
    {
        return n;
    }

    static void d()
    {
        f();
    }

    private static void e()
    {
        synchronized (m)
        {
            if (n == null)
            {
                Handler handler = new Handler(Looper.getMainLooper());
                n = handler;
                n.postDelayed(new Runnable(handler) {

                    final Handler a;

                    public void run()
                    {
                        synchronized (f.b())
                        {
                            if (f.c() == a)
                            {
                                f.d();
                            }
                        }
                        return;
                        exception1;
                        obj1;
                        JVM INSTR monitorexit ;
                        throw exception1;
                    }

            
            {
                a = handler;
                super();
            }
                }, 500L);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static void f()
    {
        synchronized (m)
        {
            if (o != null)
            {
                if (k > 0)
                {
                    a(b, o, k, l);
                    k = 0;
                    l = 0;
                }
                if (i > 0)
                {
                    a(a, o, i, j);
                    i = 0;
                    j = 0;
                }
                o = null;
            }
            if (n != null)
            {
                n.removeCallbacksAndMessages(null);
                n = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a()
    {
        p.a(null);
        z.a(p);
    }

    public void a(c c1)
    {
        p.a(c1);
        z.a(p, h);
    }

    static 
    {
        h = new IntentFilter();
        h.addAction(b);
        h.addAction(a);
    }
}
