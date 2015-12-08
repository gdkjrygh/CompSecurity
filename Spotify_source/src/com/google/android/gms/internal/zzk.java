// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import bzy;
import ccz;
import cjd;
import cls;
import cnb;
import cnc;
import cnz;
import cop;
import coq;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            zzr

public abstract class zzk
    implements Comparable
{

    public final String a;
    public final int b;
    public final cnc c;
    public Integer d;
    public cls e;
    public boolean f;
    public boolean g;
    public cnz h;
    public bzy i;
    private final coq j;
    private long k;

    public zzk(String s, cnc cnc)
    {
        int l;
        coq coq1;
        if (coq.a)
        {
            coq1 = new coq();
        } else
        {
            coq1 = null;
        }
        j = coq1;
        f = true;
        g = false;
        k = 0L;
        i = null;
        a = s;
        c = cnc;
        h = new ccz();
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = Uri.parse(s);
        if (s == null) goto _L2; else goto _L3
_L3:
        s = s.getHost();
        if (s == null) goto _L2; else goto _L4
_L4:
        l = s.hashCode();
_L6:
        b = l;
        return;
_L2:
        l = 0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static zzr a(zzr zzr)
    {
        return zzr;
    }

    static coq a(zzk zzk1)
    {
        return zzk1.j;
    }

    public abstract cnb a(cjd cjd);

    public Map a()
    {
        return Collections.emptyMap();
    }

    public abstract void a(Object obj);

    public final void a(String s)
    {
        if (coq.a)
        {
            j.a(s, Thread.currentThread().getId());
        } else
        if (k == 0L)
        {
            k = SystemClock.elapsedRealtime();
            return;
        }
    }

    public final int b()
    {
        return h.a();
    }

    public final void b(String s)
    {
        if (e == null) goto _L2; else goto _L1
_L1:
        cls cls1;
        cls1 = e;
        synchronized (cls1.b)
        {
            cls1.b.remove(this);
        }
        obj = cls1.d;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = cls1.d.iterator(); iterator.hasNext(); iterator.next()) { }
        break MISSING_BLOCK_LABEL_81;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        obj;
        JVM INSTR monitorexit ;
        if (!f) goto _L2; else goto _L3
_L3:
        Map map = cls1.a;
        map;
        JVM INSTR monitorenter ;
        String s1;
        Queue queue;
        s1 = a;
        queue = (Queue)cls1.a.remove(s1);
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        if (cop.a)
        {
            cop.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
                Integer.valueOf(queue.size()), s1
            });
        }
        cls1.c.addAll(queue);
        map;
        JVM INSTR monitorexit ;
_L2:
        if (!coq.a) goto _L5; else goto _L4
_L4:
        long l = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) goto _L7; else goto _L6
_L6:
        (new Handler(Looper.getMainLooper())).post(new Runnable(s, l) {

            private String a;
            private long b;
            private zzk c;

            public final void run()
            {
                zzk.a(c).a(a, b);
                zzk.a(c).a(((Object)this).toString());
            }

            
            {
                c = zzk.this;
                a = s;
                b = l;
                super();
            }
        });
_L9:
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
_L7:
        j.a(s, l);
        j.a(toString());
        return;
_L5:
        long l1 = SystemClock.elapsedRealtime() - k;
        if (l1 >= 3000L)
        {
            cop.b("%d ms: %s", new Object[] {
                Long.valueOf(l1), toString()
            });
            return;
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    public int compareTo(Object obj)
    {
        obj = (zzk)obj;
        zza zza1 = zza.a;
        zza zza2 = zza.a;
        if (zza1 == zza2)
        {
            return d.intValue() - ((zzk) (obj)).d.intValue();
        } else
        {
            return zza2.ordinal() - zza1.ordinal();
        }
    }

    public String toString()
    {
        String s = (new StringBuilder("0x")).append(Integer.toHexString(b)).toString();
        return (new StringBuilder("[ ] ")).append(a).append(" ").append(s).append(" ").append(zza.a).append(" ").append(d).toString();
    }

    private class zza extends Enum
    {

        public static final zza a;
        private static zza b;
        private static zza c;
        private static zza d;
        private static final zza e[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/internal/zzk$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])e.clone();
        }

        static 
        {
            b = new zza("LOW", 0);
            a = new zza("NORMAL", 1);
            c = new zza("HIGH", 2);
            d = new zza("IMMEDIATE", 3);
            e = (new zza[] {
                b, a, c, d
            });
        }

        private zza(String s, int l)
        {
            super(s, l);
        }
    }

}
