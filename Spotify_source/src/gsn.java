// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

final class gsn
    implements InvocationHandler
{

    private final List a;
    private boolean b;
    private String c;

    public gsn(List list)
    {
        a = list;
    }

    static boolean a(gsn gsn1)
    {
        return gsn1.b;
    }

    static String b(gsn gsn1)
    {
        return gsn1.c;
    }

    public final Object invoke(Object obj, Method method, Object aobj[])
    {
        String s = method.getName();
        Class class1 = method.getReturnType();
        obj = ((Object) (aobj));
        if (aobj == null)
        {
            obj = gsp.b;
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
            int j = ((List) (obj)).size();
            for (int i = 0; i < j; i++)
            {
                if (a.contains(((List) (obj)).get(i)))
                {
                    obj = (String)((List) (obj)).get(i);
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
}
