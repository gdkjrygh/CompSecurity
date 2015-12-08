// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.functions;

import com.soundcloud.java.checks.Preconditions;
import java.io.Serializable;

// Referenced classes of package com.soundcloud.java.functions:
//            Predicate, Predicates

private static class clazz
    implements Predicate, Serializable
{

    private static final long serialVersionUID = 0L;
    private final Class clazz;

    public boolean apply(Object obj)
    {
        return clazz.isInstance(obj);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof clazz)
        {
            obj = (clazz)obj;
            flag = flag1;
            if (clazz == ((clazz) (obj)).clazz)
            {
                flag = true;
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return clazz.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("Predicates.instanceOf(")).append(clazz.getName()).append(")").toString();
    }

    (Class class1)
    {
        clazz = (Class)Preconditions.checkNotNull(class1);
    }
}
