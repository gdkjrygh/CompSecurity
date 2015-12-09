// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.util.Map;

// Referenced classes of package com.google.common.base:
//            Function, Preconditions

public final class Functions
{
    static final class FunctionForMapNoDefault
        implements Function, Serializable
    {

        final Map map;

        public final Object apply(Object obj)
        {
            Object obj1 = map.get(obj);
            boolean flag;
            if (obj1 != null || map.containsKey(obj))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Key '%s' not present in map", new Object[] {
                obj
            });
            return obj1;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof FunctionForMapNoDefault)
            {
                obj = (FunctionForMapNoDefault)obj;
                return map.equals(((FunctionForMapNoDefault) (obj)).map);
            } else
            {
                return false;
            }
        }

        public final int hashCode()
        {
            return map.hashCode();
        }

        public final String toString()
        {
            return (new StringBuilder("forMap(")).append(map).append(")").toString();
        }

        FunctionForMapNoDefault(Map map1)
        {
            map = (Map)Preconditions.checkNotNull(map1);
        }
    }

    static final class IdentityFunction extends Enum
        implements Function
    {

        private static final IdentityFunction $VALUES[];
        public static final IdentityFunction INSTANCE;

        public static IdentityFunction valueOf(String s)
        {
            return (IdentityFunction)Enum.valueOf(com/google/common/base/Functions$IdentityFunction, s);
        }

        public static IdentityFunction[] values()
        {
            return (IdentityFunction[])$VALUES.clone();
        }

        public final Object apply(Object obj)
        {
            return obj;
        }

        public final String toString()
        {
            return "identity";
        }

        static 
        {
            INSTANCE = new IdentityFunction("INSTANCE", 0);
            $VALUES = (new IdentityFunction[] {
                INSTANCE
            });
        }

        private IdentityFunction(String s, int i)
        {
            super(s, i);
        }
    }


    public static Function forMap(Map map)
    {
        return new FunctionForMapNoDefault(map);
    }

    public static Function identity()
    {
        return IdentityFunction.INSTANCE;
    }
}
