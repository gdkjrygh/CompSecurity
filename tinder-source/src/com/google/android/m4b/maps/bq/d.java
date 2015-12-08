// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.ay.t;
import com.google.android.m4b.maps.ay.v;
import com.google.android.m4b.maps.bd.b;
import com.google.android.m4b.maps.bd.c;
import com.google.android.m4b.maps.be.g;
import com.google.android.m4b.maps.bo.bh;
import com.google.android.m4b.maps.bo.bi;
import com.google.android.m4b.maps.bw.e;
import com.google.android.m4b.maps.bx.o;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class d extends Thread
    implements v
{
    static final class a
    {

        public final com.google.android.m4b.maps.ak.a.c a;
        public final b b;

        public a(com.google.android.m4b.maps.ak.a.c c1, b b1)
        {
            a = c1;
            b = b1;
        }
    }


    private static final String d = com/google/android/m4b/maps/bq/d.getSimpleName();
    private static d e;
    public final m a;
    public final g b;
    public Handler c;
    private final k f;
    private final File g;
    private boolean h;
    private final com.google.android.m4b.maps.bs.e i;
    private final Map j = ax.c();
    private boolean k;

    private d(m m1, File file, Locale locale, k k1, com.google.android.m4b.maps.bs.e e1)
    {
        super("ibs");
        a = m1;
        f = k1;
        b = new g(locale, f);
        g = file;
        i = e1;
    }

    public static d a()
    {
        return e;
    }

    public static d a(m m1, File file, Locale locale, k k1, com.google.android.m4b.maps.bs.e e1)
    {
        if (e == null)
        {
            e = new d(m1, file, locale, k1, e1);
        }
        return e;
    }

    static void a(d d1)
    {
        d1.k = false;
        d1.a.b();
        Iterator iterator = d1.j.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c c1 = (c)iterator.next();
            if (!c1.d)
            {
                d1.a.c(c1);
                c1.d = true;
            }
        } while (true);
        break MISSING_BLOCK_LABEL_79;
        Exception exception;
        exception;
        d1.a.c();
        throw exception;
        d1.a.c();
        return;
    }

    static void a(d d1, c c1)
    {
        bh bh1;
        bh1 = null;
        if (d1.j.remove(c1.a) == null && ab.a(d, 3))
        {
            String s = d;
            String s1 = String.valueOf(c1.a);
            Log.d(s, (new StringBuilder(String.valueOf(s1).length() + 49)).append("handleResponse: Received unexpected response for ").append(s1).toString());
        }
        g g1;
        com.google.android.m4b.maps.ak.a.c c2;
        com.google.android.m4b.maps.be.g.a a2;
        boolean flag;
        if (c1.h() == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        g1 = d1.b;
        c2 = c1.a;
        a2 = new com.google.android.m4b.maps.be.g.a(c2, (byte)0);
        synchronized (g1.b)
        {
            g1.b.b(c2, a2);
        }
_L4:
        c1.a(bh1);
        return;
        c1;
        d1;
        JVM INSTR monitorexit ;
        throw c1;
_L2:
        com.google.android.m4b.maps.ac.a a1;
        if (c1.c == null)
        {
            a1 = null;
        } else
        {
            a1 = c1.c.f(2);
        }
        if (a1 != null)
        {
            bh1 = d1.b.a(c1.a, a1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(d d1, a a1)
    {
label0:
        {
            boolean flag1 = false;
            com.google.android.m4b.maps.ak.a.c c2 = a1.a;
            b b1 = a1.b;
            a1 = d1.b.a(c2, true);
            if (a1 != null)
            {
                if (ab.a(d, 3))
                {
                    String s = d;
                    String s1 = String.valueOf(c2);
                    String s2 = String.valueOf(a1);
                    Log.d(s, (new StringBuilder(String.valueOf(s1).length() + 11 + String.valueOf(s2).length())).append("fetch: ").append(s1).append(" -> ").append(s2).toString());
                }
                c c1;
                boolean flag;
                if (b1 != null)
                {
                    if (com.google.android.m4b.maps.be.g.a(a1))
                    {
                        b1.a(c2, 2, null);
                    } else
                    {
                        b1.a(c2, 0, a1);
                    }
                }
                flag = flag1;
                if (((bh) (a1)).e >= 0L)
                {
                    flag = flag1;
                    if (com.google.android.m4b.maps.ay.k.b() > ((bh) (a1)).e)
                    {
                        flag = true;
                    }
                }
                if (!flag)
                {
                    break label0;
                }
            }
            c1 = (c)d1.j.get(c2);
            a1 = c1;
            if (c1 == null)
            {
                a1 = new c(c2);
                d1.j.put(c2, a1);
            }
            if (b1 != null && b1 != null)
            {
                ((c) (a1)).b.add(b1);
            }
            if (!((c) (a1)).d && !d1.k)
            {
                d1.c.sendEmptyMessageDelayed(1, 50L);
                d1.k = true;
            }
        }
    }

    static void b(d d1, c c1)
    {
        if (d1.j.remove(c1.a) == null && ab.a(d, 3))
        {
            d1 = d;
            String s = String.valueOf(c1.a);
            Log.d(d1, (new StringBuilder(String.valueOf(s).length() + 46)).append("handleError: Received unexpected response for ").append(s).toString());
        }
        c1.a(null);
    }

    public final bh a(com.google.android.m4b.maps.ak.a.c c1)
    {
        bh bh1 = b.a(c1, false);
        c1 = bh1;
        if (com.google.android.m4b.maps.be.g.a(bh1))
        {
            c1 = null;
        }
        return c1;
    }

    public final void a(int l, String s)
    {
        if (ab.a(d, 3))
        {
            String s1 = d;
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "NetworkError: ".concat(s);
            } else
            {
                s = new String("NetworkError: ");
            }
            Log.d(s1, s);
        }
    }

    public final void a(com.google.android.m4b.maps.ak.a.c c1, b b1)
    {
        c.sendMessage(c.obtainMessage(0, new a(c1, b1)));
    }

    public final void a(t t1)
    {
        if (t1.g() == 118)
        {
            c.sendMessage(c.obtainMessage(2, t1));
        }
    }

    public final bi b(com.google.android.m4b.maps.ak.a.c c1)
    {
        bh bh1 = a(c1);
        if (bh1 != null)
        {
            return bh1.a(c1);
        } else
        {
            return null;
        }
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        while (!h) 
        {
            wait();
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (InterruptedException interruptedexception)
        {
            Thread.currentThread().interrupt();
        }
        return;
        this;
        JVM INSTR monitorexit ;
    }

    public final void b(t t1)
    {
        if (t1.g() == 118)
        {
            c.sendMessage(c.obtainMessage(3, t1));
        }
    }

    public void run()
    {
        Process.setThreadPriority(o.c());
_L2:
        Looper.prepare();
        c = new Handler() {

            private d a;

            public final void handleMessage(Message message)
            {
                switch (message.what)
                {
                default:
                    return;

                case 0: // '\0'
                    com.google.android.m4b.maps.bq.d.a(a, (a)message.obj);
                    return;

                case 1: // '\001'
                    com.google.android.m4b.maps.bq.d.a(a);
                    return;

                case 2: // '\002'
                    com.google.android.m4b.maps.bq.d.a(a, (c)message.obj);
                    return;

                case 3: // '\003'
                    com.google.android.m4b.maps.bq.d.b(a, (c)message.obj);
                    break;
                }
            }

            
            {
                a = d.this;
                super();
            }
        };
        this;
        JVM INSTR monitorenter ;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        g g1;
        com.google.android.m4b.maps.be.a a1;
        if (!com.google.android.m4b.maps.al.b.a())
        {
            break MISSING_BLOCK_LABEL_98;
        }
        g1 = b;
        File file = g;
        com.google.android.m4b.maps.bs.e e1 = i;
        a1 = new com.google.android.m4b.maps.be.a(g1.e, "bd", com.google.android.m4b.maps.cj.a.a, g.a);
        if (!a1.a(file, e1))
        {
            break MISSING_BLOCK_LABEL_98;
        }
        a1.a(g1.f);
        g1.d = a1;
        this;
        JVM INSTR monitorenter ;
        h = true;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        Looper.loop();
        return;
        SecurityException securityexception;
        securityexception;
        if (ab.a(d, 6))
        {
            String s = d;
            String s1 = String.valueOf(securityexception);
            Log.e(s, (new StringBuilder(String.valueOf(s1).length() + 31)).append("Could not set thread priority: ").append(s1).toString());
        }
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
