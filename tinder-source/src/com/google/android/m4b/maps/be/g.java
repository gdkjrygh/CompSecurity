// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.be;

import android.util.Log;
import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ak.c;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.bo.bh;
import com.google.android.m4b.maps.bo.bi;
import com.google.android.m4b.maps.bw.e;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.be:
//            a

public final class g
{
    public static final class a extends bh
    {

        public final String toString()
        {
            String s = String.valueOf(super.a);
            return (new StringBuilder(String.valueOf(s).length() + 20)).append("[NotFoundBuilding: ").append(s).append("]").toString();
        }

        private a(com.google.android.m4b.maps.ak.a.c c1)
        {
            super(c1, ae.e(), -1, false, null, -1L);
        }

        public a(com.google.android.m4b.maps.ak.a.c c1, byte byte0)
        {
            this(c1);
        }
    }


    public static long a;
    public final e b = new e(128);
    public final e c = new e(1024);
    public com.google.android.m4b.maps.be.a d;
    public final k e;
    public Locale f;

    public g(Locale locale, k k1)
    {
        e = k1;
        f = locale;
    }

    public static boolean a(bh bh1)
    {
        return bh1 instanceof a;
    }

    private void b(bh bh1)
    {
        com.google.android.m4b.maps.ak.a.c c1;
        c1 = bh1.a;
        synchronized (b)
        {
            b.b(c1, bh1);
        }
        e1 = c;
        e1;
        JVM INSTR monitorenter ;
        bi bi1;
        for (bh1 = bh1.b.iterator(); bh1.hasNext(); c.b(bi1.c.a, c1))
        {
            bi1 = (bi)bh1.next();
        }

        break MISSING_BLOCK_LABEL_89;
        bh1;
        e1;
        JVM INSTR monitorexit ;
        throw bh1;
        bh1;
        e1;
        JVM INSTR monitorexit ;
        throw bh1;
        e1;
        JVM INSTR monitorexit ;
    }

    public final bh a(com.google.android.m4b.maps.ak.a.c c1, com.google.android.m4b.maps.ac.a a1)
    {
        com.google.android.m4b.maps.ak.a.c c2 = com.google.android.m4b.maps.ak.a.c.b(a1.g(1));
        if (c1 != null && c2 != null)
        {
            long l = k.b();
            long l1 = a;
            if (d != null)
            {
                d.a(c2.d(), a1);
                int j = a1.j(2);
                if (j != 0)
                {
                    c1 = new com.google.android.m4b.maps.ac.a(com.google.android.m4b.maps.cj.a.a);
                    c1.b(1, c2.toString());
                    for (int i = 0; i < j; i++)
                    {
                        com.google.android.m4b.maps.ak.a.c c3 = com.google.android.m4b.maps.ak.a.c.b(a1.c(2, i).g(1));
                        if (c3 != null)
                        {
                            d.a(c3.d(), c1);
                        }
                    }

                }
            }
            c1 = bh.a(a1, l + l1);
            if (c1 != null)
            {
                b(c1);
                return c1;
            }
        }
        return null;
    }

    public final bh a(com.google.android.m4b.maps.ak.a.c c1, boolean flag)
    {
        e e1 = c;
        e1;
        JVM INSTR monitorenter ;
        Object obj = c1;
        if (c.b(c1) != null)
        {
            obj = (com.google.android.m4b.maps.ak.a.c)c.c(c1);
        }
        e1;
        JVM INSTR monitorexit ;
        e1 = b;
        e1;
        JVM INSTR monitorenter ;
        c1 = (bh)b.c(obj);
        if (c1 == null) goto _L2; else goto _L1
_L1:
        e1;
        JVM INSTR monitorexit ;
_L4:
        return c1;
        c1;
        e1;
        JVM INSTR monitorexit ;
        throw c1;
_L2:
        e1;
        JVM INSTR monitorexit ;
        if (!flag || d == null)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_95;
        c1;
        e1;
        JVM INSTR monitorexit ;
        throw c1;
        c1 = d.a(((com.google.android.m4b.maps.ak.a.c) (obj)).d());
        if (c1 == null)
        {
            return null;
        }
        com.google.android.m4b.maps.ak.a.c c2 = com.google.android.m4b.maps.ak.a.c.b(((a.c) (c1)).a.g(1));
        if (c2 == null)
        {
            if (ab.a("BuildingCache", 3))
            {
                c1 = String.valueOf(((a.c) (c1)).a.g(1));
                if (c1.length() != 0)
                {
                    c1 = "malformed building id from cache: ".concat(c1);
                } else
                {
                    c1 = new String("malformed building id from cache: ");
                }
                Log.d("BuildingCache", c1);
            }
            return null;
        }
        if (!((com.google.android.m4b.maps.ak.a.c) (obj)).equals(c2))
        {
            c1 = d.a(c2.d());
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_267;
            }
            synchronized (c)
            {
                c.b(obj, c2);
            }
        }
        obj = bh.a(((a.c) (c1)).a, ((a.c) (c1)).b);
        c1 = ((com.google.android.m4b.maps.ak.a.c) (obj));
        if (obj == null) goto _L4; else goto _L3
_L3:
        b(((bh) (obj)));
        return ((bh) (obj));
        c1;
        e2;
        JVM INSTR monitorexit ;
        throw c1;
        return null;
    }

    static 
    {
        a = TimeUnit.DAYS.toMillis(1L);
    }
}
