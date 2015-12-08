// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Supplier, Suppliers, Objects

static final class instance
    implements Supplier, Serializable
{

    final Object instance;

    public final boolean equals(Object obj)
    {
        if (obj instanceof instance)
        {
            obj = (instance)obj;
            return Objects.equal(instance, ((instance) (obj)).instance);
        } else
        {
            return false;
        }
    }

    public final Object get()
    {
        return instance;
    }

    public final int hashCode()
    {
        return Objects.hashCode(new Object[] {
            instance
        });
    }

    public final String toString()
    {
        return (new StringBuilder("Suppliers.ofInstance(")).append(instance).append(")").toString();
    }

    _cls9(Object obj)
    {
        instance = obj;
    }
}
