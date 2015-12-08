// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.google.android.apps.gsa.shared.util:
//            i

final class k
    implements Runnable
{

    private final Object a;
    private final Method b;
    private final Object c[];
    private final Class d;
    private final Throwable e = null;

    k(Object obj, Method method, Object aobj[], Class class1)
    {
        a = obj;
        b = method;
        c = aobj;
        d = class1;
    }

    public final void run()
    {
        try
        {
            b.invoke(a, c);
            return;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new IllegalStateException(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            Throwable throwable = i.a(invocationtargetexception.getCause(), e);
            if (throwable instanceof RuntimeException)
            {
                throw (RuntimeException)throwable;
            }
            if (throwable instanceof Error)
            {
                throw (Error)throwable;
            } else
            {
                throw new IllegalStateException(throwable);
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Object obj = String.valueOf(b);
            String s = String.valueOf(a.getClass());
            String s1 = String.valueOf(i.a(c));
            String s2 = String.valueOf(d);
            obj = new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 89 + String.valueOf(s).length() + String.valueOf(s1).length() + String.valueOf(s2).length())).append("Failed to call [").append(((String) (obj))).append("] on delegate of type [").append(s).append("] with argument list ").append(s1).append(" for dynamic proxy of type [").append(s2).append("]").toString());
            ((IllegalArgumentException) (obj)).initCause(illegalargumentexception);
            i.a(((Throwable) (obj)), e);
            throw obj;
        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("ThreadChanger: ");
        stringbuilder.append(a.getClass().getSimpleName()).append(".");
        stringbuilder.append(b.getName()).append("(");
        boolean flag = true;
        Class aclass[] = b.getParameterTypes();
        int l = aclass.length;
        int j = 0;
        while (j < l) 
        {
            Class class1 = aclass[j];
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(class1.getSimpleName());
            j++;
        }
        stringbuilder.append(")");
        return stringbuilder.toString();
    }
}
