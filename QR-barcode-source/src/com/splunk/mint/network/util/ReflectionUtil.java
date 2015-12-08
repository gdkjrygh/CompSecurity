// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint.network.util;

import java.lang.reflect.Constructor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ReflectionUtil
{

    public static boolean includeObject = false;

    public ReflectionUtil()
    {
    }

    public static boolean callingClassAnyOf(String as[])
    {
        StackTraceElement astacktraceelement[] = (new Throwable()).getStackTrace();
        int j = astacktraceelement.length;
        for (int i = 0; i < j; i++)
        {
            if (contains(astacktraceelement[i].getClassName(), as))
            {
                return true;
            }
        }

        return false;
    }

    public static final boolean contains(String s, String as[])
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            if (s.contains(as[i]))
            {
                return true;
            }
        }

        return false;
    }

    public static String extractCallingMethod(String as[])
    {
        StackTraceElement astacktraceelement[] = (new Throwable()).getStackTrace();
        int j = astacktraceelement.length;
        for (int i = 0; i < j; i++)
        {
            StackTraceElement stacktraceelement = astacktraceelement[i];
            if (!inExcluded(stacktraceelement.getClassName(), as))
            {
                return (new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).append(":").append(stacktraceelement.getLineNumber()).toString();
            }
        }

        return null;
    }

    public static Constructor findConstructor(String s, Class aclass[])
        throws ClassNotFoundException
    {
        s = Class.forName(s).getDeclaredConstructors();
        int k = s.length;
        for (int i = 0; i < k; i++)
        {
            Constructor constructor = s[i];
            Class aclass1[] = constructor.getParameterTypes();
            if (aclass1.length != aclass.length)
            {
                continue;
            }
            boolean flag = true;
            for (int j = 0; j < aclass1.length; j++)
            {
                if (!aclass1[j].equals(aclass[j]))
                {
                    flag = false;
                }
            }

            if (flag)
            {
                return constructor;
            }
        }

        return null;
    }

    public static Set getAllMethods(Class class1)
    {
        HashSet hashset = new HashSet();
        for (class1 = getAllSuperTypes(class1).iterator(); class1.hasNext();)
        {
            java.lang.reflect.Method amethod[] = ((Class)class1.next()).getDeclaredMethods();
            int j = amethod.length;
            int i = 0;
            while (i < j) 
            {
                hashset.add(amethod[i]);
                i++;
            }
        }

        return hashset;
    }

    public static Set getAllSuperTypes(Class class1)
    {
        HashSet hashset = new HashSet();
        if (class1 != null && (includeObject || !class1.equals(java/lang/Object)))
        {
            hashset.add(class1);
            hashset.addAll(getAllSuperTypes(class1.getSuperclass()));
            class1 = class1.getInterfaces();
            int j = class1.length;
            for (int i = 0; i < j; i++)
            {
                hashset.addAll(getAllSuperTypes(class1[i]));
            }

        }
        return hashset;
    }

    private static final boolean inExcluded(String s, String as[])
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            if (s.startsWith(as[i]))
            {
                return true;
            }
        }

        return false;
    }

}
