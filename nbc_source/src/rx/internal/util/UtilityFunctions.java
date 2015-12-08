// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import rx.functions.Func0;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.functions.Func3;
import rx.functions.Func4;
import rx.functions.Func5;
import rx.functions.Func6;
import rx.functions.Func7;
import rx.functions.Func8;
import rx.functions.Func9;
import rx.functions.FuncN;

public final class UtilityFunctions
{
    private static final class AlwaysFalse extends Enum
        implements Func1
    {

        private static final AlwaysFalse $VALUES[];
        public static final AlwaysFalse INSTANCE;

        public static AlwaysFalse valueOf(String s)
        {
            return (AlwaysFalse)Enum.valueOf(rx/internal/util/UtilityFunctions$AlwaysFalse, s);
        }

        public static AlwaysFalse[] values()
        {
            return (AlwaysFalse[])$VALUES.clone();
        }

        public Boolean call(Object obj)
        {
            return Boolean.valueOf(false);
        }

        public volatile Object call(Object obj)
        {
            return call(obj);
        }

        static 
        {
            INSTANCE = new AlwaysFalse("INSTANCE", 0);
            $VALUES = (new AlwaysFalse[] {
                INSTANCE
            });
        }

        private AlwaysFalse(String s, int i)
        {
            super(s, i);
        }
    }

    private static final class AlwaysTrue extends Enum
        implements Func1
    {

        private static final AlwaysTrue $VALUES[];
        public static final AlwaysTrue INSTANCE;

        public static AlwaysTrue valueOf(String s)
        {
            return (AlwaysTrue)Enum.valueOf(rx/internal/util/UtilityFunctions$AlwaysTrue, s);
        }

        public static AlwaysTrue[] values()
        {
            return (AlwaysTrue[])$VALUES.clone();
        }

        public Boolean call(Object obj)
        {
            return Boolean.valueOf(true);
        }

        public volatile Object call(Object obj)
        {
            return call(obj);
        }

        static 
        {
            INSTANCE = new AlwaysTrue("INSTANCE", 0);
            $VALUES = (new AlwaysTrue[] {
                INSTANCE
            });
        }

        private AlwaysTrue(String s, int i)
        {
            super(s, i);
        }
    }

    private static final class NullFunction
        implements Func0, Func1, Func2, Func3, Func4, Func5, Func6, Func7, Func8, Func9, FuncN
    {

        public Object call()
        {
            return null;
        }

        public Object call(Object obj)
        {
            return null;
        }

        public Object call(Object obj, Object obj1)
        {
            return null;
        }

        public Object call(Object obj, Object obj1, Object obj2)
        {
            return null;
        }

        public Object call(Object obj, Object obj1, Object obj2, Object obj3)
        {
            return null;
        }

        public Object call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
        {
            return null;
        }

        public Object call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
        {
            return null;
        }

        public Object call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6)
        {
            return null;
        }

        public Object call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
                Object obj7)
        {
            return null;
        }

        public Object call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
                Object obj7, Object obj8)
        {
            return null;
        }

        public transient Object call(Object aobj[])
        {
            return null;
        }

        private NullFunction()
        {
        }

    }


    private static final NullFunction NULL_FUNCTION = new NullFunction();

    public UtilityFunctions()
    {
    }

    public static Func1 alwaysFalse()
    {
        return AlwaysFalse.INSTANCE;
    }

    public static Func1 alwaysTrue()
    {
        return AlwaysTrue.INSTANCE;
    }

    public static Func1 identity()
    {
        return new Func1() {

            public Object call(Object obj)
            {
                return obj;
            }

        };
    }

    public static NullFunction returnNull()
    {
        return NULL_FUNCTION;
    }

}
