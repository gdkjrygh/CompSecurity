// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import java.util.Arrays;
import me.lyft.android.common.Unit;
import rx.Observable;
import rx.functions.Func1;
import rx.functions.FuncN;

public class ReactiveUI
{

    public ReactiveUI()
    {
    }

    public static transient Observable and(Observable aobservable[])
    {
        return Observable.combineLatest(Arrays.asList(aobservable), new FuncN() {

            public transient Boolean call(Object aobj[])
            {
                int j = aobj.length;
                for (int i = 0; i < j; i++)
                {
                    if (!((Boolean)aobj[i]).booleanValue())
                    {
                        return Boolean.valueOf(false);
                    }
                }

                return Boolean.valueOf(true);
            }

            public volatile Object call(Object aobj[])
            {
                return call(aobj);
            }

        });
    }

    public static Observable any(Observable observable, Observable observable1)
    {
        return Observable.combineLatest(observable, observable1, Unit.func2());
    }

    public static Observable any(Observable observable, Observable observable1, Observable observable2)
    {
        return Observable.combineLatest(observable, observable1, observable2, Unit.func3());
    }

    public static transient Observable any(Observable aobservable[])
    {
        return Observable.combineLatest(Arrays.asList(aobservable), Unit.funcN());
    }

    public static Observable isFalse(Observable observable)
    {
        return observable.filter(new Func1() {

            public Boolean call(Boolean boolean1)
            {
                boolean flag;
                if (!boolean1.booleanValue())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj)
            {
                return call((Boolean)obj);
            }

        }).map(Unit.func1());
    }

    public static Observable isTrue(Observable observable)
    {
        return observable.filter(new Func1() {

            public Boolean call(Boolean boolean1)
            {
                return boolean1;
            }

            public volatile Object call(Object obj)
            {
                return call((Boolean)obj);
            }

        }).map(Unit.func1());
    }

    public static Observable not(Observable observable)
    {
        return observable.map(new Func1() {

            public Boolean call(Boolean boolean1)
            {
                boolean flag;
                if (!boolean1.booleanValue())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj)
            {
                return call((Boolean)obj);
            }

        });
    }

    public static transient Observable or(Observable aobservable[])
    {
        return Observable.combineLatest(Arrays.asList(aobservable), new FuncN() {

            public transient Boolean call(Object aobj[])
            {
                int j = aobj.length;
                for (int i = 0; i < j; i++)
                {
                    if (((Boolean)aobj[i]).booleanValue())
                    {
                        return Boolean.valueOf(true);
                    }
                }

                return Boolean.valueOf(false);
            }

            public volatile Object call(Object aobj[])
            {
                return call(aobj);
            }

        });
    }
}
