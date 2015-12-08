// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class a
{

    private static final String f = "MixpanelABTest.Caller";
    private final String a;
    private final Object b[];
    private final Class c;
    private final Class d;
    private final Method e;

    public a(Class class1, String s, Object aobj[], Class class2)
        throws NoSuchMethodException
    {
        a = s;
        b = aobj;
        c = class2;
        e = b(class1);
        if (e == null)
        {
            throw new NoSuchMethodException((new StringBuilder()).append("Method ").append(class1.getName()).append(".").append(a).append(" doesn't exit").toString());
        } else
        {
            d = e.getDeclaringClass();
            return;
        }
    }

    private static Class a(Class class1)
    {
        Class class2;
        if (class1 == java/lang/Byte)
        {
            class2 = Byte.TYPE;
        } else
        {
            if (class1 == java/lang/Short)
            {
                return Short.TYPE;
            }
            if (class1 == java/lang/Integer)
            {
                return Integer.TYPE;
            }
            if (class1 == java/lang/Long)
            {
                return Long.TYPE;
            }
            if (class1 == java/lang/Float)
            {
                return Float.TYPE;
            }
            if (class1 == java/lang/Double)
            {
                return Double.TYPE;
            }
            if (class1 == java/lang/Boolean)
            {
                return Boolean.TYPE;
            }
            class2 = class1;
            if (class1 == java/lang/Character)
            {
                return Character.TYPE;
            }
        }
        return class2;
    }

    private Method b(Class class1)
    {
        Class aclass[] = new Class[b.length];
        for (int i = 0; i < b.length; i++)
        {
            aclass[i] = b[i].getClass();
        }

        class1 = class1.getMethods();
        int l = class1.length;
        int j = 0;
        do
        {
            if (j >= l)
            {
                break;
            }
            Method method = class1[j];
            String s = method.getName();
            Class aclass1[] = method.getParameterTypes();
            if (s.equals(a) && aclass1.length == b.length && a(c).isAssignableFrom(a(method.getReturnType())))
            {
                boolean flag = true;
                for (int k = 0; k < aclass1.length && flag; k++)
                {
                    Class class2 = a(aclass[k]);
                    flag = a(aclass1[k]).isAssignableFrom(class2);
                }

                if (flag)
                {
                    return method;
                }
            }
            j++;
        } while (true);
        return null;
    }

    public Object a(View view)
    {
        return a(view, b);
    }

    public Object a(View view, Object aobj[])
    {
        Class class1 = view.getClass();
        if (!d.isAssignableFrom(class1))
        {
            break MISSING_BLOCK_LABEL_66;
        }
        view = ((View) (e.invoke(view, aobj)));
        return view;
        view;
        Log.e("MixpanelABTest.Caller", (new StringBuilder()).append("Method ").append(e.getName()).append(" appears not to be public").toString(), view);
_L2:
        return null;
        view;
        Log.e("MixpanelABTest.Caller", (new StringBuilder()).append("Method ").append(e.getName()).append(" called with arguments of the wrong type").toString(), view);
        continue; /* Loop/switch isn't completed */
        view;
        Log.e("MixpanelABTest.Caller", (new StringBuilder()).append("Method ").append(e.getName()).append(" threw an exception").toString(), view);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean a(Object aobj[])
    {
        Class aclass[] = e.getParameterTypes();
        if (aobj.length == aclass.length) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i = 0;
_L6:
        Class class1;
        if (i >= aobj.length)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        class1 = a(aclass[i]);
        if (aobj[i] != null) goto _L4; else goto _L3
_L3:
        if (class1 == Byte.TYPE || class1 == Short.TYPE || class1 == Integer.TYPE || class1 == Long.TYPE || class1 == Float.TYPE || class1 == Double.TYPE || class1 == Boolean.TYPE || class1 == Character.TYPE) goto _L1; else goto _L5
_L5:
        i++;
          goto _L6
_L4:
        if (class1.isAssignableFrom(a(aobj[i].getClass()))) goto _L5; else goto _L7
_L7:
        return false;
        return true;
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
