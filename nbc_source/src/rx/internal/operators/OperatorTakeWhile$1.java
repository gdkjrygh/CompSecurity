// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.functions.Func1;
import rx.functions.Func2;

// Referenced classes of package rx.internal.operators:
//            OperatorTakeWhile

class val.underlying
    implements Func2
{

    final Func1 val$underlying;

    public Boolean call(Object obj, Integer integer)
    {
        return (Boolean)val$underlying.call(obj);
    }

    public volatile Object call(Object obj, Object obj1)
    {
        return call(obj, (Integer)obj1);
    }

    ()
    {
        val$underlying = func1;
        super();
    }
}
