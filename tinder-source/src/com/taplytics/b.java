// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public final class b
{

    Class a;
    Object b;
    HashMap c;

    public b(Object obj)
    {
        c = new HashMap();
        a = obj.getClass();
        b = obj;
    }

    public b(String s)
        throws IllegalAccessException, InstantiationException, ClassNotFoundException
    {
        c = new HashMap();
        a = Class.forName(s);
        b = a.newInstance();
    }

    public b(String s, String s1, Class aclass[], Object aobj[])
        throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        c = new HashMap();
        a = Class.forName(s);
        b = a.getDeclaredMethod(s1, aclass).invoke(null, aobj);
    }

    public b(String s, Class aclass[], Object aobj[])
        throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException
    {
        c = new HashMap();
        a = Class.forName(s);
        b = a.getConstructor(aclass).newInstance(aobj);
    }

    public static Object a(String s, String s1)
        throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException
    {
        s = Class.forName(s).getDeclaredField(s1);
        s.setAccessible(true);
        return s.get(null);
    }

    public final Object a(String s)
        throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        if (!c.containsKey(s))
        {
            c.put(s, a.getDeclaredMethod(s, new Class[0]));
        }
        return ((Method)c.get(s)).invoke(b, new Object[0]);
    }

    public final Object a(String s, Class aclass[], Object aobj[])
        throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        int j = aclass.length;
        Object obj = new StringBuilder();
        ((StringBuilder) (obj)).append(s);
        for (int i = 0; i < j; i++)
        {
            ((StringBuilder) (obj)).append(aclass[i].toString());
        }

        obj = ((StringBuilder) (obj)).toString();
        if (!c.containsKey(obj))
        {
            s = a.getDeclaredMethod(s, aclass);
            s.setAccessible(true);
            c.put(obj, s);
        }
        return ((Method)c.get(obj)).invoke(b, aobj);
    }
}
