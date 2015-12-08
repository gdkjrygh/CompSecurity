// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class dq
{

    private static final Map a = new WeakHashMap();

    public static du a(Class class1, String s)
    {
        dv.a(class1);
        dv.a(s);
        s = (WeakReference)a(class1).get(s);
        if (s == null)
        {
            return du.b();
        } else
        {
            return du.b(class1.cast(s.get()));
        }
    }

    private static Map a(Class class1)
    {
        Map map1 = a;
        map1;
        JVM INSTR monitorenter ;
        Map map = (Map)a.get(class1);
        Object obj;
        obj = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        obj = new HashMap();
        Enum enum;
        for (Iterator iterator = EnumSet.allOf(class1).iterator(); iterator.hasNext(); ((Map) (obj)).put(enum.name(), new WeakReference(enum)))
        {
            enum = (Enum)iterator.next();
        }

        break MISSING_BLOCK_LABEL_90;
        class1;
        map1;
        JVM INSTR monitorexit ;
        throw class1;
        a.put(class1, obj);
        map1;
        JVM INSTR monitorexit ;
        return ((Map) (obj));
    }

}
