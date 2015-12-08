// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.util;

import com.mopub.common.Preconditions;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflection
{

    public Reflection()
    {
    }

    public static boolean classFound(String s)
    {
        try
        {
            Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    public static transient Method getDeclaredMethodWithTraversal(Class class1, String s, Class aclass[])
    {
_L2:
        if (class1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Method method = class1.getDeclaredMethod(s, aclass);
        return method;
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
        class1 = class1.getSuperclass();
        if (true) goto _L2; else goto _L1
_L1:
        throw new NoSuchMethodException();
    }

    public static Object instantiateClassWithEmptyConstructor(String s, Class class1)
    {
        Preconditions.checkNotNull(s);
        s = Class.forName(s).asSubclass(class1).getDeclaredConstructor(null);
        s.setAccessible(true);
        return s.newInstance(new Object[0]);
    }
}
