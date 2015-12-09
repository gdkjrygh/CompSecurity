// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class a
{

    private final String a;
    private final Object b[];
    private final Class c[];
    private final Class d;
    private final Class e;
    private final Method f;

    public a(Class class1, String s, Object aobj[], Class class2)
    {
        a = s;
        b = aobj;
        d = class2;
        c = new Class[b.length];
        for (int i = 0; i < b.length; i++)
        {
            c[i] = b[i].getClass();
        }

        f = b(class1);
        if (f == null)
        {
            throw new NoSuchMethodException((new StringBuilder()).append("Method ").append(class1.getName()).append(".").append(a).append(" doesn't exit").toString());
        } else
        {
            e = f.getDeclaringClass();
            return;
        }
    }

    private static Class a(Class class1)
    {
        Class class2;
        if (class1 == java/lang/Integer)
        {
            class2 = Integer.TYPE;
        } else
        {
            if (class1 == java/lang/Float)
            {
                return Float.TYPE;
            }
            if (class1 == java/lang/Double)
            {
                return Double.TYPE;
            }
            class2 = class1;
            if (class1 == java/lang/Boolean)
            {
                return Boolean.TYPE;
            }
        }
        return class2;
    }

    private Method b(Class class1)
    {
        class1 = class1.getMethods();
        int k = class1.length;
        int i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            Method method = class1[i];
            String s = method.getName();
            Class aclass[] = method.getParameterTypes();
            if (s.equals(a) && aclass.length == b.length && a(d).isAssignableFrom(a(method.getReturnType())))
            {
                boolean flag = true;
                for (int j = 0; j < aclass.length && flag; j++)
                {
                    Class class2 = a(c[j]);
                    flag = a(aclass[j]).isAssignableFrom(class2);
                }

                if (flag)
                {
                    return method;
                }
            }
            i++;
        } while (true);
        return null;
    }

    public Object a(View view)
    {
        Class class1 = view.getClass();
        if (!e.isAssignableFrom(class1))
        {
            break MISSING_BLOCK_LABEL_69;
        }
        view = ((View) (f.invoke(view, b)));
        return view;
        view;
        Log.e("MixpanelABTest.Caller", (new StringBuilder()).append("Method ").append(f.getName()).append(" appears not to be public").toString(), view);
_L2:
        return null;
        view;
        Log.e("MixpanelABTest.Caller", (new StringBuilder()).append("Method ").append(f.getName()).append(" threw an exception").toString(), view);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Object[] a()
    {
        return b;
    }

    public String toString()
    {
        return (new StringBuilder()).append("[Caller ").append(a).append("(").append(((Object) (b))).append(")").append("]").toString();
    }
}
