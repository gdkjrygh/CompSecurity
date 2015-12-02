// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            dv

public abstract class dz extends dv
    implements Set
{

    protected dz()
    {
    }

    protected abstract Set a();

    protected Collection b()
    {
        return a();
    }

    protected Object c()
    {
        return a();
    }

    public boolean equals(Object obj)
    {
        return obj == this || a().equals(obj);
    }

    public int hashCode()
    {
        return a().hashCode();
    }
}
