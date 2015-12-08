// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.flurry.sdk:
//            il, ig, io, ih, 
//            ii, kc, lp

public class ik
{

    private static final String a = com/flurry/sdk/il.getName();
    private long b;
    private long c;
    private long d;
    private io e;
    private boolean f;
    private int g;
    private String h;
    private int i;
    private AtomicInteger j;
    private Map k;

    public ik(String s, boolean flag, long l, long l1, io io1, 
            Map map)
    {
        h = s;
        f = flag;
        b = l;
        d = l1;
        e = io1;
        c = System.currentTimeMillis();
        k = map;
        if (map != null)
        {
            for (s = map.keySet().iterator(); s.hasNext(); ((ig)map.get(s.next())).a(this)) { }
            i = map.size();
        } else
        {
            i = 0;
        }
        j = new AtomicInteger(0);
    }

    static int a(ik ik1, int l)
    {
        ik1.g = l;
        return l;
    }

    static long a(ik ik1)
    {
        return ik1.b;
    }

    static long a(ik ik1, long l)
    {
        ik1.c = l;
        return l;
    }

    static Map a(ik ik1, Map map)
    {
        ik1.k = map;
        return map;
    }

    static AtomicInteger a(ik ik1, AtomicInteger atomicinteger)
    {
        ik1.j = atomicinteger;
        return atomicinteger;
    }

    static int b(ik ik1, int l)
    {
        ik1.i = l;
        return l;
    }

    static long b(ik ik1)
    {
        return ik1.c;
    }

    static long c(ik ik1)
    {
        return ik1.d;
    }

    static io d(ik ik1)
    {
        return ik1.e;
    }

    static boolean e(ik ik1)
    {
        return ik1.f;
    }

    static int f(ik ik1)
    {
        return ik1.g;
    }

    static String g(ik ik1)
    {
        return ik1.h;
    }

    static int h(ik ik1)
    {
        return ik1.i;
    }

    static AtomicInteger i(ik ik1)
    {
        return ik1.j;
    }

    static Map j(ik ik1)
    {
        return ik1.k;
    }

    public int a()
    {
        return g;
    }

    public void a(int l)
    {
        g = l;
    }

    public long b()
    {
        return b;
    }

    public String c()
    {
        return h;
    }

    public List d()
    {
        if (k != null)
        {
            return new ArrayList(k.values());
        } else
        {
            return Collections.emptyList();
        }
    }

    public Map e()
    {
        return k;
    }

    public boolean f()
    {
        this;
        JVM INSTR monitorenter ;
        int l;
        int i1;
        l = j.intValue();
        i1 = i;
        boolean flag;
        if (l >= i1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void g()
    {
        this;
        JVM INSTR monitorenter ;
        j.incrementAndGet();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public byte[] h()
    {
        Object obj = null;
        Object obj1;
        Object obj2;
        obj2 = new ByteArrayOutputStream();
        obj1 = new DataOutputStream(((java.io.OutputStream) (obj2)));
        ((DataOutputStream) (obj1)).writeShort(e.a());
        ((DataOutputStream) (obj1)).writeLong(b);
        ((DataOutputStream) (obj1)).writeLong(d);
        ((DataOutputStream) (obj1)).writeBoolean(f);
        if (f)
        {
            ((DataOutputStream) (obj1)).writeShort(g);
            ((DataOutputStream) (obj1)).writeUTF(h);
        }
        ((DataOutputStream) (obj1)).writeShort(k.size());
        if (k != null)
        {
            for (obj = k.entrySet().iterator(); ((Iterator) (obj)).hasNext();)
            {
                Object obj3 = (java.util.Map.Entry)((Iterator) (obj)).next();
                ig ig1 = (ig)((java.util.Map.Entry) (obj3)).getValue();
                ((DataOutputStream) (obj1)).writeLong(((Long)((java.util.Map.Entry) (obj3)).getKey()).longValue());
                ((DataOutputStream) (obj1)).writeUTF(ig1.t());
                ((DataOutputStream) (obj1)).writeShort(ig1.a.size());
                obj3 = ig1.a.iterator();
                while (((Iterator) (obj3)).hasNext()) 
                {
                    ih ih1 = (ih)((Iterator) (obj3)).next();
                    ((DataOutputStream) (obj1)).writeShort(ih1.a);
                    ((DataOutputStream) (obj1)).writeLong(ih1.b);
                    ((DataOutputStream) (obj1)).writeLong(ih1.c);
                    ((DataOutputStream) (obj1)).writeBoolean(ih1.d);
                    ((DataOutputStream) (obj1)).writeShort(ih1.e);
                    ((DataOutputStream) (obj1)).writeShort(ih1.f.a());
                    if ((ih1.e < 200 || ih1.e >= 400) && ih1.g != null)
                    {
                        byte abyte0[] = ih1.g.getBytes();
                        ((DataOutputStream) (obj1)).writeShort(abyte0.length);
                        ((DataOutputStream) (obj1)).write(abyte0);
                    }
                    ((DataOutputStream) (obj1)).writeShort(ih1.h);
                    ((DataOutputStream) (obj1)).writeInt((int)ih1.k);
                }
            }

        }
          goto _L1
        obj2;
        obj = obj1;
        obj1 = obj2;
_L5:
        kc.a(6, a, "Error when generating report", ((Throwable) (obj1)));
        throw obj1;
        obj2;
        obj1 = obj;
        obj = obj2;
_L3:
        lp.a(((java.io.Closeable) (obj1)));
        throw obj;
_L1:
        obj = ((ByteArrayOutputStream) (obj2)).toByteArray();
        lp.a(((java.io.Closeable) (obj1)));
        return ((byte []) (obj));
        obj;
        obj1 = null;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L3; else goto _L2
_L2:
        obj1;
        if (true) goto _L5; else goto _L4
_L4:
    }

}
