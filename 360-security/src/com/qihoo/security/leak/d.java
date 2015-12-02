// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.leak;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

// Referenced classes of package com.qihoo.security.leak:
//            e, j, i, a, 
//            g, h, c

public class d
{

    private static WeakReference a;
    private LinkedHashMap b;
    private final e c = e.a();
    private boolean d;

    private d()
    {
        b = new LinkedHashMap();
        d = false;
    }

    public static d a()
    {
        com/qihoo/security/leak/d;
        JVM INSTR monitorenter ;
        d d1 = null;
        Object obj = a;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        d1 = (d)((WeakReference) (obj)).get();
        obj = d1;
        if (d1 != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj = new d();
        a = new WeakReference(obj);
        com/qihoo/security/leak/d;
        JVM INSTR monitorexit ;
        return ((d) (obj));
        Exception exception;
        exception;
        com/qihoo/security/leak/d;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (!d)
        {
            Object obj = new j(this);
            if (((j) (obj)).b())
            {
                b.put(((j) (obj)).a(), obj);
            }
            obj = new i(this);
            if (((i) (obj)).b())
            {
                b.put(((i) (obj)).a(), obj);
            }
            obj = new a(this);
            if (((a) (obj)).b())
            {
                b.put(((a) (obj)).a(), obj);
            }
            obj = new g(this);
            if (((g) (obj)).b())
            {
                b.put(((g) (obj)).a(), obj);
            }
            obj = new h(this);
            if (((h) (obj)).b())
            {
                b.put("leak_samsung_backup", obj);
            }
            d = true;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public c a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        d();
        s = (c)b.get(s);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public e b()
    {
        return c;
    }

    public List c()
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        d();
        arraylist = new ArrayList(b.values());
        this;
        JVM INSTR monitorexit ;
        return arraylist;
        Exception exception;
        exception;
        throw exception;
    }
}
