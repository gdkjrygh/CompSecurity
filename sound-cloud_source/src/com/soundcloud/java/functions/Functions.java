// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.functions;

import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.objects.MoreObjects;
import java.io.Serializable;

// Referenced classes of package com.soundcloud.java.functions:
//            Function

public final class Functions
{
    private static class ConstantFunction
        implements Function, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Object value;

        public Object apply(Object obj)
        {
            Preconditions.checkNotNull(obj);
            return value;
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof ConstantFunction)
            {
                obj = (ConstantFunction)obj;
                return MoreObjects.equal(value, ((ConstantFunction) (obj)).value);
            } else
            {
                return false;
            }
        }

        public int hashCode()
        {
            if (value == null)
            {
                return 0;
            } else
            {
                return value.hashCode();
            }
        }

        public String toString()
        {
            return (new StringBuilder("constant(")).append(value).append(")").toString();
        }

        public ConstantFunction(Object obj)
        {
            value = obj;
        }
    }

    private static final class IdentityFunction extends Enum
        implements Function
    {

        private static final IdentityFunction $VALUES[];
        public static final IdentityFunction INSTANCE;

        public static IdentityFunction valueOf(String s)
        {
            return (IdentityFunction)Enum.valueOf(com/soundcloud/java/functions/Functions$IdentityFunction, s);
        }

        public static IdentityFunction[] values()
        {
            return (IdentityFunction[])$VALUES.clone();
        }

        public final Object apply(Object obj)
        {
            Preconditions.checkNotNull(obj);
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

    private static final class ToStringFunction extends Enum
        implements Function
    {

        private static final ToStringFunction $VALUES[];
        public static final ToStringFunction INSTANCE;

        public static ToStringFunction valueOf(String s)
        {
            return (ToStringFunction)Enum.valueOf(com/soundcloud/java/functions/Functions$ToStringFunction, s);
        }

        public static ToStringFunction[] values()
        {
            return (ToStringFunction[])$VALUES.clone();
        }

        public final volatile Object apply(Object obj)
        {
            return apply(obj);
        }

        public final String apply(Object obj)
        {
            if (obj != null)
            {
                return obj.toString();
            } else
            {
                throw new NullPointerException();
            }
        }

        public final String toString()
        {
            return "toString";
        }

        static 
        {
            INSTANCE = new ToStringFunction("INSTANCE", 0);
            $VALUES = (new ToStringFunction[] {
                INSTANCE
            });
        }

        private ToStringFunction(String s, int i)
        {
            super(s, i);
        }
    }


    private Functions()
    {
    }

    public static Function constant(Object obj)
    {
        return new ConstantFunction(obj);
    }

    public static Function identity()
    {
        return IdentityFunction.INSTANCE;
    }

    public static Function toStringFunction()
    {
        return ToStringFunction.INSTANCE;
    }
}
