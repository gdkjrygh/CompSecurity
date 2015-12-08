// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package rx.internal.operators:
//            OperatorMapPair

final class val.selector
    implements Func1
{

    final Func1 val$selector;

    public volatile Object call(Object obj)
    {
        return call(obj);
    }

    public Observable call(Object obj)
    {
        return Observable.from((Iterable)val$selector.call(obj));
    }

    ()
    {
        val$selector = func1;
        super();
    }
}
