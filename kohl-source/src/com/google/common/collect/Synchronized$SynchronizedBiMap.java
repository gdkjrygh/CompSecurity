// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            BiMap, Synchronized

static class <init> extends <init>
    implements BiMap, Serializable
{

    private static final long serialVersionUID = 0L;
    private transient BiMap inverse;
    private transient Set valueSet;

    BiMap _mthdelegate()
    {
        return (BiMap)super.legate();
    }

    volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    volatile Map _mthdelegate()
    {
        return _mthdelegate();
    }

    public Object forcePut(Object obj, Object obj1)
    {
        synchronized (mutex)
        {
            obj = _mthdelegate().forcePut(obj, obj1);
        }
        return obj;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public BiMap inverse()
    {
        BiMap bimap;
        synchronized (mutex)
        {
            if (inverse == null)
            {
                inverse = new <init>(_mthdelegate().inverse(), mutex, this);
            }
            bimap = inverse;
        }
        return bimap;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public volatile Collection values()
    {
        return values();
    }

    public Set values()
    {
        Set set;
        synchronized (mutex)
        {
            if (valueSet == null)
            {
                valueSet = Synchronized.set(_mthdelegate().values(), mutex);
            }
            set = valueSet;
        }
        return set;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private (BiMap bimap, Object obj, BiMap bimap1)
    {
        super(bimap, obj);
        inverse = bimap1;
    }

    inverse(BiMap bimap, Object obj, BiMap bimap1, inverse inverse1)
    {
        this(bimap, obj, bimap1);
    }
}
