// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;

public final class d
{

    private static int g = 0;
    private static final ArrayList h = new ArrayList();
    public final String a;
    public final Class b;
    public final Class c;
    public final Object d;
    public final int e;
    protected final int f;

    protected d(String s, Class class1, Class class2, Object obj, int i)
    {
        a = s;
        b = class1;
        d = obj;
        c = class2;
        e = i;
        i = g;
        g = i + 1;
        f = i;
    }

    protected static d a(Class class1, String s)
    {
        for (Iterator iterator = h.iterator(); iterator.hasNext();)
        {
            d d1 = (d)iterator.next();
            if (d1.b == class1 && d1.a.equalsIgnoreCase(s))
            {
                return d1;
            }
        }

        return null;
    }

    protected static d a(String s)
    {
        for (Iterator iterator = h.iterator(); iterator.hasNext();)
        {
            d d1 = (d)iterator.next();
            if (d1.a.equalsIgnoreCase(s))
            {
                return d1;
            }
        }

        return null;
    }

    public static d a(String s, Class class1, Class class2, Object obj)
    {
        return a(s, class1, class2, obj, 0);
    }

    public static d a(String s, Class class1, Class class2, Object obj, int i)
    {
        char ac[] = s.toCharArray();
        int k = ac.length;
        for (int j = 0; j < k; j++)
        {
            if (ac[j] == ' ')
            {
                throw new InvalidParameterException("name");
            }
        }

        for (Iterator iterator = h.iterator(); iterator.hasNext();)
        {
            d d1 = (d)iterator.next();
            if (d1.a.equals(s) && d1.b == class1)
            {
                throw new InvalidParameterException("Attribute already presents");
            }
        }

        s = new d(s, class1, class2, obj, i);
        h.add(s);
        return s;
    }

    protected final Object b(String s)
    {
        Method method = c.getMethod("valueOf", new Class[] {
            java/lang/String
        });
        s = ((String) (method.invoke(null, new Object[] {
            s
        })));
        return s;
        s;
        try
        {
            s.printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return null;
        s;
        s.printStackTrace();
        return null;
        s;
        s.printStackTrace();
        return null;
    }

    public final int hashCode()
    {
        return f;
    }

}
