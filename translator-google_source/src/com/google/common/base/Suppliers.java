// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            s

public final class Suppliers
{

    public static s a(Object obj)
    {
        return new SupplierOfInstance(obj);
    }

    private class SupplierOfInstance
        implements s, Serializable
    {

        private static final long serialVersionUID = 0L;
        final Object instance;

        public boolean equals(Object obj)
        {
            if (obj instanceof SupplierOfInstance)
            {
                obj = (SupplierOfInstance)obj;
                return k.a(instance, ((SupplierOfInstance) (obj)).instance);
            } else
            {
                return false;
            }
        }

        public Object get()
        {
            return instance;
        }

        public int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                instance
            });
        }

        public String toString()
        {
            return (new StringBuilder("Suppliers.ofInstance(")).append(instance).append(")").toString();
        }

        SupplierOfInstance(Object obj)
        {
            instance = obj;
        }
    }

}
