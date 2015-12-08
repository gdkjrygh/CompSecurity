// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observables;

import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package rx.observables:
//            AbstractOnSubscribe

private static final class <init> extends AbstractOnSubscribe
{

    final Action1 next;
    final Func1 onSubscribe;
    final Action1 onTerminated;

    public volatile void call(Object obj)
    {
        super.call((Subscriber)obj);
    }

    protected void next(<init> <init>1)
    {
        next.call(<init>1);
    }

    protected Object onSubscribe(Subscriber subscriber)
    {
        return onSubscribe.call(subscriber);
    }

    protected void onTerminated(Object obj)
    {
        onTerminated.call(obj);
    }

    private (Action1 action1, Func1 func1, Action1 action1_1)
    {
        next = action1;
        onSubscribe = func1;
        onTerminated = action1_1;
    }

    onTerminated(Action1 action1, Func1 func1, Action1 action1_1, onTerminated onterminated)
    {
        this(action1, func1, action1_1);
    }
}
