// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.lang.reflect.Method;
import java.util.Arrays;

final class pu
{

    final Method a;
    private final String b;
    private final Class c[];
    private final Class d;

    public pu(Method method)
    {
        a = method;
        b = method.getName();
        c = method.getParameterTypes();
        d = method.getReturnType();
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof pu)
        {
            obj = (pu)obj;
            flag = flag1;
            if (b.equals(((pu) (obj)).b))
            {
                flag = flag1;
                if (d.equals(((pu) (obj)).d))
                {
                    flag = flag1;
                    if (Arrays.equals(c, ((pu) (obj)).c))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        int i = b.hashCode() + 527 + 17;
        i += i * 31 + d.hashCode();
        return i + (i * 31 + Arrays.hashCode(c));
    }
}
