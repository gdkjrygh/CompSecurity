// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;

public final class OperatorAsObservable
    implements rx.Observable.Operator
{
    private static final class Holder
    {

        static final OperatorAsObservable INSTANCE = new OperatorAsObservable();


        private Holder()
        {
        }
    }


    private OperatorAsObservable()
    {
    }


    public static OperatorAsObservable instance()
    {
        return Holder.INSTANCE;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        return subscriber;
    }
}
