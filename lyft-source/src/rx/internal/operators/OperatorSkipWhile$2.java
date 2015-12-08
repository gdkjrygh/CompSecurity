// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.functions.Func1;
import rx.functions.Func2;

// Referenced classes of package rx.internal.operators:
//            OperatorSkipWhile

final class val.predicate
    implements Func2
{

    final Func1 val$predicate;

    public Boolean call(Object obj, Integer integer)
    {
        return (Boolean)val$predicate.call(obj);
    }

    public volatile Object call(Object obj, Object obj1)
    {
        return call(obj, (Integer)obj1);
    }

    ()
    {
        val$predicate = func1;
        super();
    }
}
