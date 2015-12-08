// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ddz
{

    private static final Map a;

    private ddz()
    {
    }

    public static Object a(Class class1)
    {
        ClassLoader classloader = ddz.getClassLoader();
        dea dea1 = new dea();
        return Proxy.newProxyInstance(classloader, new Class[] {
            class1
        }, dea1);
    }

    static Map a()
    {
        return a;
    }

    static 
    {
        HashMap hashmap = new HashMap();
        hashmap.put(Boolean.TYPE, Boolean.FALSE);
        hashmap.put(Integer.TYPE, Integer.valueOf(0));
        hashmap.put(Long.TYPE, Long.valueOf(0L));
        hashmap.put(Short.TYPE, Short.valueOf((short)0));
        hashmap.put(Byte.TYPE, Byte.valueOf((byte)0));
        hashmap.put(Float.TYPE, Float.valueOf(0.0F));
        hashmap.put(Double.TYPE, Double.valueOf(0.0D));
        hashmap.put(Character.TYPE, Character.valueOf('\0'));
        hashmap.put(java/lang/String, "");
        a = Collections.unmodifiableMap(hashmap);
    }
}
