// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Function, Functions, Preconditions

private static class f
    implements Function, Serializable
{

    private static final long serialVersionUID = 0L;
    private final Function f;
    private final Function g;

    public Object apply(Object obj)
    {
        return g.apply(f.apply(obj));
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
                if (g.equals(((g) (obj)).g))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return f.hashCode() ^ g.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append(g.toString()).append("(").append(f.toString()).append(")").toString();
    }

    public (Function function, Function function1)
    {
        g = (Function)Preconditions.checkNotNull(function);
        f = (Function)Preconditions.checkNotNull(function1);
    }
}
