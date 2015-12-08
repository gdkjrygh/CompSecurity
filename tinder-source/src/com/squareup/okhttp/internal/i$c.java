// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

// Referenced classes of package com.squareup.okhttp.internal:
//            i, k

private static final class a
    implements InvocationHandler
{

    private final List a;
    private boolean b;
    private String c;

    static boolean a(er er)
    {
        return er.b;
    }

    static String b(b b1)
    {
        return b1.c;
    }

    public final Object invoke(Object obj, Method method, Object aobj[])
        throws Throwable
    {
        String s = method.getName();
        Class class1 = method.getReturnType();
        obj = ((Object) (aobj));
        if (aobj == null)
        {
            obj = k.b;
        }
        if (s.equals("supports") && Boolean.TYPE == class1)
        {
            return Boolean.valueOf(true);
        }
        if (s.equals("unsupported") && Void.TYPE == class1)
        {
            b = true;
            return null;
        }
        if (s.equals("protocols") && obj.length == 0)
        {
            return a;
        }
        if ((s.equals("selectProtocol") || s.equals("select")) && java/lang/String == class1 && obj.length == 1 && (obj[0] instanceof List))
        {
            obj = (List)obj[0];
            int l = ((List) (obj)).size();
            for (int j = 0; j < l; j++)
            {
                if (a.contains(((List) (obj)).get(j)))
                {
                    obj = (String)((List) (obj)).get(j);
                    c = ((String) (obj));
                    return obj;
                }
            }

            obj = (String)a.get(0);
            c = ((String) (obj));
            return obj;
        }
        if ((s.equals("protocolSelected") || s.equals("selected")) && obj.length == 1)
        {
            c = (String)obj[0];
            return null;
        } else
        {
            return method.invoke(this, ((Object []) (obj)));
        }
    }

    public er(List list)
    {
        a = list;
    }
}
