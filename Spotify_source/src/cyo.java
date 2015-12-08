// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class cyo
{

    final Object a[];
    final Method b;
    private final String c;
    private final Class d;
    private final Class e;

    public cyo(Class class1, String s, Object aobj[], Class class2)
    {
        c = s;
        a = aobj;
        d = class2;
        b = b(class1);
        if (b == null)
        {
            throw new NoSuchMethodException((new StringBuilder("Method ")).append(class1.getName()).append(".").append(c).append(" doesn't exit").toString());
        } else
        {
            e = b.getDeclaringClass();
            return;
        }
    }

    static Class a(Class class1)
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
        Class aclass[] = new Class[a.length];
        for (int i = 0; i < a.length; i++)
        {
            aclass[i] = a[i].getClass();
        }

        class1 = class1.getMethods();
        int l = class1.length;
        for (int j = 0; j < l; j++)
        {
            Method method = class1[j];
            String s = method.getName();
            Class aclass1[] = method.getParameterTypes();
            if (!s.equals(c) || aclass1.length != a.length || !a(d).isAssignableFrom(a(method.getReturnType())))
            {
                continue;
            }
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

        return null;
    }

    public final Object a(View view)
    {
        return a(view, a);
    }

    public final Object a(View view, Object aobj[])
    {
        Class class1 = view.getClass();
        if (!e.isAssignableFrom(class1))
        {
            break MISSING_BLOCK_LABEL_63;
        }
        view = ((View) (b.invoke(view, aobj)));
        return view;
        view;
        Log.e("MixpanelABTest.Caller", (new StringBuilder("Method ")).append(b.getName()).append(" appears not to be public").toString(), view);
_L2:
        return null;
        view;
        Log.e("MixpanelABTest.Caller", (new StringBuilder("Method ")).append(b.getName()).append(" called with arguments of the wrong type").toString(), view);
        continue; /* Loop/switch isn't completed */
        view;
        Log.e("MixpanelABTest.Caller", (new StringBuilder("Method ")).append(b.getName()).append(" threw an exception").toString(), view);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final String toString()
    {
        return (new StringBuilder("[Caller ")).append(c).append("(").append(((Object) (a))).append(")]").toString();
    }
}
