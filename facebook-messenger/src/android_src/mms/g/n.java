// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.g;

import java.util.HashMap;

public class n
{

    private static final HashMap a = new HashMap();

    public n()
    {
    }

    public static long a(Object obj)
    {
        android_src/mms/g/n;
        JVM INSTR monitorenter ;
        obj = (Long)a.get(obj);
        if (obj == null) goto _L2; else goto _L1
_L1:
        long l = ((Long) (obj)).longValue();
_L4:
        android_src/mms/g/n;
        JVM INSTR monitorexit ;
        return l;
_L2:
        l = -1L;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        throw obj;
    }

    public static void b(Object obj)
    {
        android_src/mms/g/n;
        JVM INSTR monitorenter ;
        a.remove(obj);
        android_src/mms/g/n;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

}
