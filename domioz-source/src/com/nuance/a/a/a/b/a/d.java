// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b.a;

import com.nuance.a.a.a.a.d.a.e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class d
{

    private e a;

    public d()
    {
        a = com.nuance.a.a.a.a.d.a.d.a(getClass());
    }

    public static Class a(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            throw new RuntimeException("getClassForName failed", s);
        }
        return s;
    }

    public static Object a(Class class1, String s)
    {
        try
        {
            class1 = ((Class) (class1.getField(s).get(null)));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            class1.printStackTrace();
            throw new RuntimeException("getFieldValue failed", class1);
        }
        return class1;
    }

    public static Object a(Class class1, String s, Object obj)
    {
        try
        {
            class1 = ((Class) (class1.getField(s).get(null)));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return obj;
        }
        return class1;
    }

    public static transient Constructor a(Class class1, Class aclass[])
    {
        try
        {
            class1 = class1.getConstructor(aclass);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            class1.printStackTrace();
            throw new RuntimeException("getConstructor failed", class1);
        }
        return class1;
    }

    public static transient Method a(Class class1, String s, Class aclass[])
    {
        try
        {
            class1 = class1.getMethod(s, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            class1.printStackTrace();
            throw new RuntimeException("getMethod failed", class1);
        }
        return class1;
    }

    public static transient Method b(Class class1, String s, Class aclass[])
    {
        try
        {
            class1 = class1.getMethod(s, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }
}
