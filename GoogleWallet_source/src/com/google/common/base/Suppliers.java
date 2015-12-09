// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Supplier, Objects

public final class Suppliers
{
    static final class SupplierOfInstance
        implements Supplier, Serializable
    {

        final Object instance;

        public final boolean equals(Object obj)
        {
            if (obj instanceof SupplierOfInstance)
            {
                obj = (SupplierOfInstance)obj;
                return Objects.equal(instance, ((SupplierOfInstance) (obj)).instance);
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

        SupplierOfInstance(Object obj)
        {
            instance = obj;
        }
    }


    public static Supplier ofInstance(Object obj)
    {
        return new SupplierOfInstance(obj);
    }
}
