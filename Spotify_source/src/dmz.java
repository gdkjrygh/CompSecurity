// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.IdentityHashMap;
import java.util.Map;

public final class dmz
{

    private static dmy a = new dmy();
    private static boolean b = true;

    private dmz()
    {
    }

    public static dmx a(Class class1)
    {
        dmz;
        JVM INSTR monitorenter ;
        if (b)
        {
            throw new IllegalStateException("You cannot call any getter before the injection phase is over. If you are calling this from the constructor of an Injectable, please supply the dependencies as arguments to the constructor instead");
        }
        break MISSING_BLOCK_LABEL_25;
        class1;
        dmz;
        JVM INSTR monitorexit ;
        throw class1;
        class1 = a(dmz, class1);
        dmz;
        JVM INSTR monitorexit ;
        return class1;
    }

    public static dmx a(Class class1, Class class2)
    {
        dmz;
        JVM INSTR monitorenter ;
        Map map = (Map)a.a.get(class1);
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        throw new IllegalStateException((new StringBuilder("Could not find any local injections for ")).append(class1.getName()).append(" while getting ").append(class2.getName()).toString());
        class1;
        dmz;
        JVM INSTR monitorexit ;
        throw class1;
        dmx dmx1 = (dmx)map.get(class2);
        if (dmx1 != null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        throw new IllegalStateException((new StringBuilder("Could not find any injection for ")).append(class2.getName()).toString());
        class1 = dmx1;
        if (dmx1 instanceof dna)
        {
            class1 = (dmx)((dna)dmx1).a();
            map.put(class2, class1);
        }
        dmz;
        JVM INSTR monitorexit ;
        return class1;
    }

    public static void a(Class class1, dmx dmx1)
    {
        dmz;
        JVM INSTR monitorenter ;
        if (!b)
        {
            throw new IllegalStateException("You cannot inject production code after the injection phase");
        }
        break MISSING_BLOCK_LABEL_25;
        class1;
        dmz;
        JVM INSTR monitorexit ;
        throw class1;
        a(dmz, class1, dmx1);
        dmz;
        JVM INSTR monitorexit ;
    }

    public static void a(Class class1, dna dna1)
    {
        dmz;
        JVM INSTR monitorenter ;
        if (!b)
        {
            throw new IllegalStateException("You cannot inject production code after the injection phase");
        }
        break MISSING_BLOCK_LABEL_25;
        class1;
        dmz;
        JVM INSTR monitorexit ;
        throw class1;
        a(dmz, class1, dna1);
        dmz;
        JVM INSTR monitorexit ;
    }

    public static void a(Class class1, Class class2, dmx dmx1)
    {
        dmz;
        JVM INSTR monitorenter ;
        Map map;
        dmy dmy1;
        dmy1 = a;
        map = (Map)dmy1.a.get(class1);
        Object obj;
        obj = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        obj = new IdentityHashMap();
        dmy1.a.put(class1, obj);
        ((Map) (obj)).put(class2, dmx1);
        dmz;
        JVM INSTR monitorexit ;
        return;
        class1;
        throw class1;
    }

    private static void a(Class class1, Class class2, dna dna1)
    {
        dmz;
        JVM INSTR monitorenter ;
        Map map;
        dmy dmy1;
        dmy1 = a;
        map = (Map)dmy1.a.get(class1);
        Object obj;
        obj = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        obj = new IdentityHashMap();
        dmy1.a.put(class1, obj);
        ((Map) (obj)).put(class2, dna1);
        dmz;
        JVM INSTR monitorexit ;
        return;
        class1;
        throw class1;
    }

    public static void a(boolean flag)
    {
        b = flag;
    }

    public static dmx b(Class class1)
    {
        dmz;
        JVM INSTR monitorenter ;
        if (b)
        {
            throw new IllegalStateException("You cannot call any getter before the injection phase is over. If you are calling this from the constructor of an Injectable, please supply the dependencies as arguments to the constructor instead");
        }
        break MISSING_BLOCK_LABEL_25;
        class1;
        dmz;
        JVM INSTR monitorexit ;
        throw class1;
        class1 = b(dmz, class1);
        dmz;
        JVM INSTR monitorexit ;
        return class1;
    }

    public static dmx b(Class class1, Class class2)
    {
        dmz;
        JVM INSTR monitorenter ;
        Map map = (Map)a.a.get(class1);
        if (map != null) goto _L2; else goto _L1
_L1:
        class1 = null;
_L4:
        dmz;
        JVM INSTR monitorexit ;
        return class1;
_L2:
        dmx dmx1 = (dmx)map.get(class2);
        class1 = dmx1;
        if (dmx1 instanceof dna)
        {
            class1 = (dmx)((dna)dmx1).a();
            map.put(class2, class1);
        }
        if (true) goto _L4; else goto _L3
_L3:
        class1;
        throw class1;
    }

    public static void c(Class class1, Class class2)
    {
        dmz;
        JVM INSTR monitorenter ;
        class1 = (Map)a.a.get(class1);
        if (class1 == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        class1.remove(class2);
        dmz;
        JVM INSTR monitorexit ;
        return;
        class1;
        throw class1;
    }

}
