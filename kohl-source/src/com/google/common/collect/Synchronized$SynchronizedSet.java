// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Synchronized

static class ection extends ection
    implements Set
{

    private static final long serialVersionUID = 0L;

    volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    Set _mthdelegate()
    {
        return (Set)super._mthdelegate();
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().equals(obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public int hashCode()
    {
        int i;
        synchronized (mutex)
        {
            i = _mthdelegate().hashCode();
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ection(Set set, Object obj)
    {
        super(set, obj, null);
    }
}
