// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.b;

import android.util.Base64;
import com.google.android.apps.gsa.shared.a.a;
import com.google.android.apps.gsa.shared.util.a.i;
import com.google.android.apps.gsa.shared.util.a.k;
import com.google.android.apps.gsa.shared.util.b;
import com.google.android.apps.gsa.shared.util.common.L;
import com.google.common.b.ae;
import com.google.common.util.concurrent.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;

// Referenced classes of package com.google.android.apps.gsa.shared.b:
//            i, o, n, m, 
//            l, j, k

public final class h
{

    public static final Set a = new HashSet();
    private static volatile n b;
    private static a.a c;
    private static final Object d = new Object();
    private static String e = "";
    private static final a f = new a();
    private static final com.google.android.apps.gsa.shared.util.debug.a.a g = new com.google.android.apps.gsa.shared.b.i();
    private static b h = new com.google.android.apps.gsa.shared.util.h();

    public static ae a(int i1)
    {
        return (new ae()).a(i1);
    }

    public static ae a(int i1, o o1)
    {
        ae ae1 = a(i1);
        if (o1 != null)
        {
            if (o1.a != 0L)
            {
                long l1 = o1.a;
                byte abyte0[] = new byte[8];
                for (i1 = 7; i1 >= 0; i1--)
                {
                    abyte0[i1] = (byte)(int)(255L & l1);
                    l1 >>= 8;
                }

                String s = Base64.encodeToString(abyte0, 11);
                if (s == null)
                {
                    throw new NullPointerException();
                }
                ae1.d = s;
                ae1.a = ae1.a | 4;
            }
            if (o1.b != 0L)
            {
                ae1.e = o1.b;
                ae1.a = ae1.a | 0x10;
            }
        }
        return ae1;
    }

    private static String a()
    {
        String s;
        synchronized (d)
        {
            s = e;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void a(ae ae1)
    {
        ae ae2 = ae1;
        if (ae1 == null)
        {
            ae2 = a(472);
        }
        b(ae2);
    }

    protected static void a(ae ae1, String s)
    {
        a a1;
        g g1 = b.a();
        a1 = f;
        s = new m(g1, ae1.c, s);
        ae1 = a1.b;
        ae1;
        JVM INSTR monitorenter ;
        int i1 = (a1.b.size() + 1) - a1.a;
_L2:
        if (i1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        a1.b.remove();
        i1--;
        if (true) goto _L2; else goto _L1
_L1:
        a1.b.add(s);
        ae1;
        JVM INSTR monitorexit ;
        return;
        s;
        ae1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void b(int i1)
    {
        b((new ae()).a(i1));
    }

    private static void b(ae ae1)
    {
        if (b == null)
        {
            L.a("EventLogger", "No EventLoggerStore set on EventLogger, event will be ignored.Initialize EventLogger in your Application#onCreate method", new Object[0]);
            return;
        }
        long l2 = h.a();
        ae1.c = l2;
        ae1.a = ae1.a | 1;
        ae1.X = l2;
        ae1.b = ae1.b | 0x40000000;
        String s = a();
        if (s == null)
        {
            throw new NullPointerException();
        }
        ae1.I = s;
        ae1.b = ae1.b | 0x2000;
        if (c == null)
        {
            a(ae1, ((String) (null)));
            return;
        }
        Set set = a;
        set;
        JVM INSTR monitorenter ;
        Object obj;
        if (a.isEmpty())
        {
            break MISSING_BLOCK_LABEL_281;
        }
        obj = new HashSet(a);
_L2:
        if (obj == null)
        {
            a(ae1, ((String) (null)));
            return;
        }
        break MISSING_BLOCK_LABEL_151;
        ae1;
        set;
        JVM INSTR monitorexit ;
        throw ae1;
        HashSet hashset = new HashSet();
        obj = ((Set) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            l l1 = (l)((Iterator) (obj)).next();
            if (l1.b())
            {
                k k1 = (k)c.a();
                new j(l1.a(), l1, ae1);
                hashset.add(k1.a());
            }
        } while (true);
        if (hashset.isEmpty())
        {
            a(ae1, ((String) (null)));
            return;
        } else
        {
            new i("Guard future timeout", com.google.common.util.concurrent.e.a(hashset));
            new com.google.android.apps.gsa.shared.b.k("Record log event", ae1);
            return;
        }
        obj = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
