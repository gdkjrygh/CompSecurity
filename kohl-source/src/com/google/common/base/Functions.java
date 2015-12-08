// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.util.Map;

// Referenced classes of package com.google.common.base:
//            Function, Predicate, Objects, Preconditions

public final class Functions
{
    private static class ConstantFunction
        implements Function, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Object value;

        public Object apply(Object obj)
        {
            return value;
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof ConstantFunction)
            {
                obj = (ConstantFunction)obj;
                return Objects.equal(value, ((ConstantFunction) (obj)).value);
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
            return (new StringBuilder()).append("constant(").append(value).append(")").toString();
        }

        public ConstantFunction(Object obj)
        {
            value = obj;
        }
    }

    private static class ForMapWithDefault
        implements Function, Serializable
    {

        private static final long serialVersionUID = 0L;
        final Object defaultValue;
        final Map map;

        public Object apply(Object obj)
        {
            Object obj1 = map.get(obj);
            if (obj1 != null || map.containsKey(obj))
            {
                return obj1;
            } else
            {
                return defaultValue;
            }
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof ForMapWithDefault)
            {
                obj = (ForMapWithDefault)obj;
                flag = flag1;
                if (map.equals(((ForMapWithDefault) (obj)).map))
                {
                    flag = flag1;
                    if (Objects.equal(defaultValue, ((ForMapWithDefault) (obj)).defaultValue))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return Objects.hashCode(new Object[] {
                map, defaultValue
            });
        }

        public String toString()
        {
            return (new StringBuilder()).append("forMap(").append(map).append(", defaultValue=").append(defaultValue).append(")").toString();
        }

        ForMapWithDefault(Map map1, Object obj)
        {
            map = (Map)Preconditions.checkNotNull(map1);
            defaultValue = obj;
        }
    }

    private static class FunctionComposition
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
            if (obj instanceof FunctionComposition)
            {
                obj = (FunctionComposition)obj;
                flag = flag1;
                if (f.equals(((FunctionComposition) (obj)).f))
                {
                    flag = flag1;
                    if (g.equals(((FunctionComposition) (obj)).g))
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

        public FunctionComposition(Function function, Function function1)
        {
            g = (Function)Preconditions.checkNotNull(function);
            f = (Function)Preconditions.checkNotNull(function1);
        }
    }

    private static class FunctionForMapNoDefault
        implements Function, Serializable
    {

        private static final long serialVersionUID = 0L;
        final Map map;

        public Object apply(Object obj)
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

        public boolean equals(Object obj)
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

        public int hashCode()
        {
            return map.hashCode();
        }

        public String toString()
        {
            return (new StringBuilder()).append("forMap(").append(map).append(")").toString();
        }

        FunctionForMapNoDefault(Map map1)
        {
            map = (Map)Preconditions.checkNotNull(map1);
        }
    }

    private static final class IdentityFunction extends Enum
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

        public Object apply(Object obj)
        {
            return obj;
        }

        public String toString()
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

    private static class PredicateFunction
        implements Function, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Predicate predicate;

        public Boolean apply(Object obj)
        {
            return Boolean.valueOf(predicate.apply(obj));
        }

        public volatile Object apply(Object obj)
        {
            return apply(obj);
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof PredicateFunction)
            {
                obj = (PredicateFunction)obj;
                return predicate.equals(((PredicateFunction) (obj)).predicate);
            } else
            {
                return false;
            }
        }

        public int hashCode()
        {
            return predicate.hashCode();
        }

        public String toString()
        {
            return (new StringBuilder()).append("forPredicate(").append(predicate).append(")").toString();
        }

        private PredicateFunction(Predicate predicate1)
        {
            predicate = (Predicate)Preconditions.checkNotNull(predicate1);
        }

    }

    private static final class ToStringFunction extends Enum
        implements Function
    {

        private static final ToStringFunction $VALUES[];
        public static final ToStringFunction INSTANCE;

        public static ToStringFunction valueOf(String s)
        {
            return (ToStringFunction)Enum.valueOf(com/google/common/base/Functions$ToStringFunction, s);
        }

        public static ToStringFunction[] values()
        {
            return (ToStringFunction[])$VALUES.clone();
        }

        public volatile Object apply(Object obj)
        {
            return apply(obj);
        }

        public String apply(Object obj)
        {
            Preconditions.checkNotNull(obj);
            return obj.toString();
        }

        public String toString()
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

    public static Function compose(Function function, Function function1)
    {
        return new FunctionComposition(function, function1);
    }

    public static Function constant(Object obj)
    {
        return new ConstantFunction(obj);
    }

    public static Function forMap(Map map)
    {
        return new FunctionForMapNoDefault(map);
    }

    public static Function forMap(Map map, Object obj)
    {
        return new ForMapWithDefault(map, obj);
    }

    public static Function forPredicate(Predicate predicate)
    {
        return new PredicateFunction(predicate);
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
