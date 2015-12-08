// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.internal.util.UtilityFunctions;

public final class OperatorSequenceEqual
{

    private static final Object LOCAL_ONCOMPLETED = new Object();

    private OperatorSequenceEqual()
    {
        throw new IllegalStateException("No instances!");
    }

    static Observable materializeLite(Observable observable)
    {
        return Observable.concat(observable.map(new Func1() {

            public Object call(Object obj)
            {
                return obj;
            }

        }), Observable.just(LOCAL_ONCOMPLETED));
    }

    public static Observable sequenceEqual(Observable observable, Observable observable1, Func2 func2)
    {
        return Observable.zip(materializeLite(observable), materializeLite(observable1), new Func2(func2) {

            final Func2 val$equality;

            public Boolean call(Object obj, Object obj1)
            {
                boolean flag;
                boolean flag1;
                if (obj == OperatorSequenceEqual.LOCAL_ONCOMPLETED)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (obj1 == OperatorSequenceEqual.LOCAL_ONCOMPLETED)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag && flag1)
                {
                    return Boolean.valueOf(true);
                }
                if (flag || flag1)
                {
                    return Boolean.valueOf(false);
                } else
                {
                    return (Boolean)equality.call(obj, obj1);
                }
            }

            public volatile Object call(Object obj, Object obj1)
            {
                return call(obj, obj1);
            }

            
            {
                equality = func2;
                super();
            }
        }).all(UtilityFunctions.identity());
    }


}
