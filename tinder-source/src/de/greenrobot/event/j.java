// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import java.lang.reflect.Method;

// Referenced classes of package de.greenrobot.event:
//            ThreadMode

final class j
{

    final Method a;
    final ThreadMode b;
    final Class c;
    String d;

    j(Method method, ThreadMode threadmode, Class class1)
    {
        a = method;
        b = threadmode;
        c = class1;
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            StringBuilder stringbuilder = new StringBuilder(64);
            stringbuilder.append(a.getDeclaringClass().getName());
            stringbuilder.append('#').append(a.getName());
            stringbuilder.append('(').append(c.getName());
            d = stringbuilder.toString();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof j)
        {
            a();
            obj = (j)obj;
            ((j) (obj)).a();
            return d.equals(((j) (obj)).d);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}
