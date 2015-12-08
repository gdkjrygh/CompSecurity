// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;

// Referenced classes of package com.android.volley:
//            e, c, h, l, 
//            AuthFailureError, k, VolleyError, NetworkResponse, 
//            i

public abstract class Request
    implements Comparable
{
    public static final class Priority extends Enum
    {

        public static final Priority a;
        public static final Priority b;
        public static final Priority c;
        public static final Priority d;
        private static final Priority e[];

        public static Priority valueOf(String s)
        {
            return (Priority)Enum.valueOf(com/android/volley/Request$Priority, s);
        }

        public static Priority[] values()
        {
            return (Priority[])e.clone();
        }

        static 
        {
            a = new Priority("LOW", 0);
            b = new Priority("NORMAL", 1);
            c = new Priority("HIGH", 2);
            d = new Priority("IMMEDIATE", 3);
            e = (new Priority[] {
                a, b, c, d
            });
        }

        private Priority(String s, int i1)
        {
            super(s, i1);
        }
    }


    private static long p;
    public final int a;
    public final String b;
    public String c;
    final int d;
    Integer e;
    h f;
    boolean g;
    boolean h;
    boolean i;
    public k j;
    public a.a k;
    public Object l;
    private final l.a m;
    private String n;
    private i.a o;

    public Request(int i1, String s, i.a a1)
    {
        Object obj;
        long l1;
        if (l.a.a)
        {
            obj = new l.a();
        } else
        {
            obj = null;
        }
        m = ((l.a) (obj));
        g = true;
        h = false;
        i = false;
        k = null;
        a = i1;
        b = s;
        obj = (new StringBuilder("Request:")).append(i1).append(":").append(s).append(":").append(System.currentTimeMillis()).append(":");
        l1 = p;
        p = 1L + l1;
        n = com.android.volley.e.a(((StringBuilder) (obj)).append(l1).toString());
        o = a1;
        j = new c();
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
        d = i1;
        return;
_L2:
        i1 = 0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected static VolleyError a(VolleyError volleyerror)
    {
        return volleyerror;
    }

    static l.a a(Request request)
    {
        return request.m;
    }

    public abstract i a(NetworkResponse networkresponse);

    public void a()
    {
        o = null;
    }

    public abstract void a(Object obj);

    public final void a(String s)
    {
        if (l.a.a)
        {
            m.a(s, Thread.currentThread().getId());
        }
    }

    public final String b()
    {
        if (c != null)
        {
            return c;
        } else
        {
            return b;
        }
    }

    public void b(VolleyError volleyerror)
    {
        if (o != null)
        {
            o.a(volleyerror);
        }
    }

    final void b(String s)
    {
        h h1;
        if (f == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        h1 = f;
        synchronized (h1.b)
        {
            h1.b.remove(this);
        }
        obj = h1.d;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = h1.d.iterator(); iterator.hasNext(); iterator.next()) { }
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
        if (!g) goto _L2; else goto _L1
_L1:
        Map map = h1.a;
        map;
        JVM INSTR monitorenter ;
        String s1;
        Queue queue;
        s1 = c();
        queue = (Queue)h1.a.remove(s1);
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        if (l.b)
        {
            com.android.volley.l.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
                Integer.valueOf(queue.size()), s1
            });
        }
        h1.c.addAll(queue);
        map;
        JVM INSTR monitorexit ;
_L2:
        a();
        long l1;
        if (l.a.a)
        {
            l1 = Thread.currentThread().getId();
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                break MISSING_BLOCK_LABEL_227;
            }
            (new Handler(Looper.getMainLooper())).post(new Runnable(s, l1) {

                final String a;
                final long b;
                final Request c;

                public final void run()
                {
                    Request.a(c).a(a, b);
                    Request.a(c).a(((Object)this).toString());
                }

            
            {
                c = Request.this;
                a = s;
                b = l1;
                super();
            }
            });
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
        m.a(s, l1);
        m.a(toString());
        return;
    }

    public final String c()
    {
        return (new StringBuilder()).append(a).append(":").append(b).toString();
    }

    public int compareTo(Object obj)
    {
        obj = (Request)obj;
        Priority priority = i();
        Priority priority1 = ((Request) (obj)).i();
        if (priority == priority1)
        {
            return e.intValue() - ((Request) (obj)).e.intValue();
        } else
        {
            return priority1.ordinal() - priority.ordinal();
        }
    }

    public Map d()
        throws AuthFailureError
    {
        return Collections.emptyMap();
    }

    public String e()
    {
        return g();
    }

    public byte[] f()
        throws AuthFailureError
    {
        return null;
    }

    public String g()
    {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public byte[] h()
        throws AuthFailureError
    {
        return null;
    }

    public Priority i()
    {
        return Priority.b;
    }

    public final int j()
    {
        return j.a();
    }

    public String toString()
    {
        String s1 = (new StringBuilder("0x")).append(Integer.toHexString(d)).toString();
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (h)
        {
            s = "[X] ";
        } else
        {
            s = "[ ] ";
        }
        return stringbuilder.append(s).append(b()).append(" ").append(s1).append(" ").append(i()).append(" ").append(e).toString();
    }
}
