// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            ak, zza, df, ez, 
//            eo, zzr, ci, dv

public abstract class zzk
    implements Comparable
{
    public static final class zza extends Enum
    {

        public static final zza a;
        public static final zza b;
        public static final zza c;
        public static final zza d;
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
            a = new zza("LOW", 0);
            b = new zza("NORMAL", 1);
            c = new zza("HIGH", 2);
            d = new zza("IMMEDIATE", 3);
            e = (new zza[] {
                a, b, c, d
            });
        }

        private zza(String s, int i1)
        {
            super(s, i1);
        }
    }


    private final ez.a a;
    private long b;
    final int c;
    final String d;
    final int e;
    final dv.a f;
    Integer g;
    df h;
    boolean i;
    boolean j;
    boolean k;
    eo l;
    g.a m;

    public zzk(String s, dv.a a1)
    {
        int i1;
        ez.a a2;
        if (ez.a.a)
        {
            a2 = new ez.a();
        } else
        {
            a2 = null;
        }
        a = a2;
        i = true;
        j = false;
        k = false;
        b = 0L;
        m = null;
        c = 0;
        d = s;
        f = a1;
        l = new ak();
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = Uri.parse(s);
        if (s == null) goto _L2; else goto _L3
_L3:
        s = s.getHost();
        if (s == null) goto _L2; else goto _L4
_L4:
        i1 = s.hashCode();
_L6:
        e = i1;
        return;
_L2:
        i1 = 0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static ez.a a(zzk zzk1)
    {
        return zzk1.a;
    }

    protected static zzr a(zzr zzr)
    {
        return zzr;
    }

    public static String b()
    {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    protected abstract dv a(ci ci);

    public Map a()
        throws com.google.android.gms.internal.zza
    {
        return Collections.emptyMap();
    }

    protected abstract void a(Object obj);

    public final void a(String s)
    {
        if (ez.a.a)
        {
            a.a(s, Thread.currentThread().getId());
        } else
        if (b == 0L)
        {
            b = SystemClock.elapsedRealtime();
            return;
        }
    }

    final void b(String s)
    {
        if (h == null) goto _L2; else goto _L1
_L1:
        df df1;
        df1 = h;
        synchronized (df1.b)
        {
            df1.b.remove(this);
        }
        obj = df1.d;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = df1.d.iterator(); iterator.hasNext(); iterator.next()) { }
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
        if (!i) goto _L2; else goto _L3
_L3:
        Map map = df1.a;
        map;
        JVM INSTR monitorenter ;
        String s1;
        Queue queue;
        s1 = d;
        queue = (Queue)df1.a.remove(s1);
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        if (ez.b)
        {
            ez.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
                Integer.valueOf(queue.size()), s1
            });
        }
        df1.c.addAll(queue);
        map;
        JVM INSTR monitorexit ;
_L2:
        if (!ez.a.a) goto _L5; else goto _L4
_L4:
        long l1 = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) goto _L7; else goto _L6
_L6:
        (new Handler(Looper.getMainLooper())).post(new Runnable(s, l1) {

            final String a;
            final long b;
            final zzk c;

            public final void run()
            {
                zzk.a(c).a(a, b);
                zzk.a(c).a(((Object)this).toString());
            }

            
            {
                c = zzk.this;
                a = s;
                b = l1;
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
        a.a(s, l1);
        a.a(toString());
        return;
_L5:
        long l2 = SystemClock.elapsedRealtime() - b;
        if (l2 >= 3000L)
        {
            ez.b("%d ms: %s", new Object[] {
                Long.valueOf(l2), toString()
            });
            return;
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final int c()
    {
        return l.a();
    }

    public int compareTo(Object obj)
    {
        obj = (zzk)obj;
        zza zza1 = zza.b;
        zza zza2 = zza.b;
        if (zza1 == zza2)
        {
            return g.intValue() - ((zzk) (obj)).g.intValue();
        } else
        {
            return zza2.ordinal() - zza1.ordinal();
        }
    }

    public String toString()
    {
        String s1 = (new StringBuilder("0x")).append(Integer.toHexString(e)).toString();
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (j)
        {
            s = "[X] ";
        } else
        {
            s = "[ ] ";
        }
        return stringbuilder.append(s).append(d).append(" ").append(s1).append(" ").append(zza.b).append(" ").append(g).toString();
    }
}
