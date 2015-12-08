// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.a;

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

// Referenced classes of package com.google.android.m4b.maps.a:
//            o, l, s, r, 
//            h, m

public abstract class k
    implements Comparable
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static a c;
        private static a d;
        private static final a e[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/a/k$a, s1);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("LOW", 0);
            b = new a("NORMAL", 1);
            c = new a("HIGH", 2);
            d = new a("IMMEDIATE", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    public final int a;
    public final String b;
    final int c;
    final m.a d;
    Integer e;
    l f;
    public boolean g;
    public boolean h;
    boolean i;
    public o j;
    public b.a k;
    private final s.a l;
    private long m;

    public k(int i1, String s1, m.a a1)
    {
        s.a a2;
        if (s.a.a)
        {
            a2 = new s.a();
        } else
        {
            a2 = null;
        }
        l = a2;
        g = true;
        h = false;
        i = false;
        m = 0L;
        k = null;
        a = i1;
        b = s1;
        d = a1;
        j = new o();
        if (TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        s1 = Uri.parse(s1);
        if (s1 == null) goto _L2; else goto _L3
_L3:
        s1 = s1.getHost();
        if (s1 == null) goto _L2; else goto _L4
_L4:
        i1 = s1.hashCode();
_L6:
        c = i1;
        return;
_L2:
        i1 = 0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected static r a(r r)
    {
        return r;
    }

    static s.a a(k k1)
    {
        return k1.l;
    }

    public abstract m a(h h1);

    public Map a()
    {
        return Collections.emptyMap();
    }

    public abstract void a(Object obj);

    public final void a(String s1)
    {
        if (s.a.a)
        {
            l.a(s1, Thread.currentThread().getId());
        } else
        if (m == 0L)
        {
            m = SystemClock.elapsedRealtime();
            return;
        }
    }

    public String b()
    {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    final void b(String s1)
    {
        if (f == null) goto _L2; else goto _L1
_L1:
        l l1;
        l1 = f;
        synchronized (l1.b)
        {
            l1.b.remove(this);
        }
        obj = l1.j;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = l1.j.iterator(); iterator.hasNext(); iterator.next()) { }
        break MISSING_BLOCK_LABEL_81;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
        obj;
        JVM INSTR monitorexit ;
        if (!g) goto _L2; else goto _L3
_L3:
        Map map = l1.a;
        map;
        JVM INSTR monitorenter ;
        String s2;
        Queue queue;
        s2 = b;
        queue = (Queue)l1.a.remove(s2);
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        if (s.a)
        {
            s.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
                Integer.valueOf(queue.size()), s2
            });
        }
        l1.c.addAll(queue);
        map;
        JVM INSTR monitorexit ;
_L2:
        if (!s.a.a) goto _L5; else goto _L4
_L4:
        long l2 = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) goto _L7; else goto _L6
_L6:
        (new Handler(Looper.getMainLooper())).post(new Runnable(s1, l2) {

            private String a;
            private long b;
            private k c;

            public final void run()
            {
                k.a(c).a(a, b);
                k.a(c).a(((Object)this).toString());
            }

            
            {
                c = k.this;
                a = s1;
                b = l1;
                super();
            }
        });
_L9:
        return;
        s1;
        map;
        JVM INSTR monitorexit ;
        throw s1;
_L7:
        l.a(s1, l2);
        l.a(toString());
        return;
_L5:
        long l3 = SystemClock.elapsedRealtime() - m;
        if (l3 >= 3000L)
        {
            s.b("%d ms: %s", new Object[] {
                Long.valueOf(l3), toString()
            });
            return;
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    public byte[] c()
    {
        return null;
    }

    public int compareTo(Object obj)
    {
        obj = (k)obj;
        a a1 = d();
        a a2 = ((k) (obj)).d();
        if (a1 == a2)
        {
            return e.intValue() - ((k) (obj)).e.intValue();
        } else
        {
            return a2.ordinal() - a1.ordinal();
        }
    }

    public a d()
    {
        return a.b;
    }

    public String toString()
    {
        String s2 = (new StringBuilder("0x")).append(Integer.toHexString(c)).toString();
        StringBuilder stringbuilder = new StringBuilder();
        String s1;
        if (h)
        {
            s1 = "[X] ";
        } else
        {
            s1 = "[ ] ";
        }
        return stringbuilder.append(s1).append(b).append(" ").append(s2).append(" ").append(d()).append(" ").append(e).toString();
    }
}
