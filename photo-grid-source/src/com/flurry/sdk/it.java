// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.flurry.sdk:
//            kc, lp

public final class it
{

    private final Map a = new HashMap();
    private int b;
    private String c;
    private long d;
    private boolean e;
    private boolean f;
    private long g;

    public it(int i, String s, Map map, long l, boolean flag)
    {
        b = i;
        c = s;
        if (map != null)
        {
            a.putAll(map);
        }
        d = l;
        e = flag;
        if (e)
        {
            f = false;
            return;
        } else
        {
            f = true;
            return;
        }
    }

    public final void a(long l)
    {
        f = true;
        g = l - d;
        kc.a(3, "FlurryAgent", (new StringBuilder("Ended event '")).append(c).append("' (").append(d).append(") after ").append(g).append("ms").toString());
    }

    public final void a(Map map)
    {
        this;
        JVM INSTR monitorenter ;
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        a.putAll(map);
        this;
        JVM INSTR monitorexit ;
        return;
        map;
        throw map;
    }

    public final boolean a()
    {
        return e;
    }

    public final boolean a(String s)
    {
        return e && g == 0L && c.equals(s);
    }

    public final void b(Map map)
    {
        this;
        JVM INSTR monitorenter ;
        a.clear();
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        a.putAll(map);
        this;
        JVM INSTR monitorexit ;
        return;
        map;
        throw map;
    }

    public final boolean b()
    {
        return f;
    }

    public final Map c()
    {
        this;
        JVM INSTR monitorenter ;
        HashMap hashmap = new HashMap(a);
        this;
        JVM INSTR monitorexit ;
        return hashmap;
        Exception exception;
        exception;
        throw exception;
    }

    public final int d()
    {
        return e().length;
    }

    public final byte[] e()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        obj = new ByteArrayOutputStream();
        obj1 = new DataOutputStream(((java.io.OutputStream) (obj)));
        ((DataOutputStream) (obj1)).writeShort(b);
        ((DataOutputStream) (obj1)).writeUTF(c);
        ((DataOutputStream) (obj1)).writeShort(a.size());
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); ((DataOutputStream) (obj1)).writeUTF(lp.b((String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)iterator.next();
            ((DataOutputStream) (obj1)).writeUTF(lp.b((String)entry.getKey()));
        }

          goto _L1
        obj;
        obj = obj1;
_L7:
        obj1 = new byte[0];
        lp.a(((java.io.Closeable) (obj)));
        obj = obj1;
_L3:
        this;
        JVM INSTR monitorexit ;
        return ((byte []) (obj));
_L1:
        ((DataOutputStream) (obj1)).writeLong(d);
        ((DataOutputStream) (obj1)).writeLong(g);
        ((DataOutputStream) (obj1)).flush();
        obj = ((ByteArrayOutputStream) (obj)).toByteArray();
        lp.a(((java.io.Closeable) (obj1)));
        if (true) goto _L3; else goto _L2
_L2:
        obj;
        throw obj;
        obj;
        obj1 = null;
_L5:
        lp.a(((java.io.Closeable) (obj1)));
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
        if (true) goto _L5; else goto _L4
_L4:
        IOException ioexception;
        ioexception;
        ioexception = null;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
