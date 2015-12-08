// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import rx.Observable;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.functions.Func3;
import rx.functions.Func4;
import rx.functions.FuncN;

public final class Unit
{

    private static final Func1 FUNC_1 = new Func1() {

        public volatile Object call(Object obj)
        {
            return call(obj);
        }

        public Unit call(Object obj)
        {
            return Unit.INSTANCE;
        }

    };
    private static final Func2 FUNC_2 = new Func2() {

        public volatile Object call(Object obj, Object obj1)
        {
            return call(obj, obj1);
        }

        public Unit call(Object obj, Object obj1)
        {
            return null;
        }

    };
    private static final Func3 FUNC_3 = new Func3() {

        public volatile Object call(Object obj, Object obj1, Object obj2)
        {
            return call(obj, obj1, obj2);
        }

        public Unit call(Object obj, Object obj1, Object obj2)
        {
            return Unit.INSTANCE;
        }

    };
    private static final Func4 FUNC_4 = new Func4() {

        public volatile Object call(Object obj, Object obj1, Object obj2, Object obj3)
        {
            return call(obj, obj1, obj2, obj3);
        }

        public Unit call(Object obj, Object obj1, Object obj2, Object obj3)
        {
            return Unit.INSTANCE;
        }

    };
    private static final FuncN FUNC_N = new FuncN() {

        public volatile Object call(Object aobj[])
        {
            return call(aobj);
        }

        public transient Unit call(Object aobj[])
        {
            return Unit.INSTANCE;
        }

    };
    private static final Unit INSTANCE = new Unit();

    private Unit()
    {
    }

    public static Unit create()
    {
        return INSTANCE;
    }

    public static Func1 func1()
    {
        return FUNC_1;
    }

    public static Func2 func2()
    {
        return FUNC_2;
    }

    public static Func3 func3()
    {
        return FUNC_3;
    }

    public static Func4 func4()
    {
        return FUNC_4;
    }

    public static FuncN funcN()
    {
        return FUNC_N;
    }

    public static Observable just()
    {
        return Observable.just(INSTANCE);
    }


}
