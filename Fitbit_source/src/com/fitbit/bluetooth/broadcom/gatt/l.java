// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public final class l
{
    private static class a
    {

        public static l a = new l();


        private a()
        {
        }
    }


    private Map a;

    public l()
    {
        a = new HashMap();
    }

    public static l a()
    {
        return a.a;
    }

    private Object b(Class class1, Object obj)
    {
        try
        {
            class1 = class1.getDeclaredConstructor(new Class[] {
                java/lang/Object
            });
            class1.setAccessible(true);
            class1 = ((Class) (class1.newInstance(new Object[] {
                obj
            })));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            class1.printStackTrace();
            return null;
        }
        return class1;
    }

    public Object a(Class class1, Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (!a.containsKey(obj)) goto _L2; else goto _L1
_L1:
        class1 = ((Class) (a.get(obj)));
_L4:
        this;
        JVM INSTR monitorexit ;
        return class1;
_L2:
        Object obj1 = b(class1, obj);
        class1 = ((Class) (obj1));
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        a.put(obj, obj1);
        class1 = ((Class) (obj1));
        if (true) goto _L4; else goto _L3
_L3:
        class1;
        throw class1;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        a.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
