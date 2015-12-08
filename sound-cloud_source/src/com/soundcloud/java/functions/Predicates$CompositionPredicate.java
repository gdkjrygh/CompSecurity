// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.functions;

import com.soundcloud.java.checks.Preconditions;
import java.io.Serializable;

// Referenced classes of package com.soundcloud.java.functions:
//            Predicate, Predicates, Function

private static class f
    implements Predicate, Serializable
{

    private static final long serialVersionUID = 0L;
    final Function f;
    final Predicate p;

    public boolean apply(Object obj)
    {
        return p.apply(f.apply(obj));
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof f)
        {
            obj = (f)obj;
            flag = flag1;
            if (f.equals(((f) (obj)).f))
            {
                flag = flag1;
                if (p.equals(((p) (obj)).p))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return f.hashCode() ^ p.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append(p.toString()).append("(").append(f.toString()).append(")").toString();
    }

    (Predicate predicate, Function function)
    {
        p = (Predicate)Preconditions.checkNotNull(predicate);
        f = (Function)Preconditions.checkNotNull(function);
    }
}
