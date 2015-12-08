// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorSwitch

final class initialRequested extends Subscriber
{

    private final int id;
    private final long initialRequested;
    private long requested;
    final request this$0;

    public void onCompleted()
    {
        initialRequested.this.initialRequested(id);
    }

    public void onError(Throwable throwable)
    {
        id.this.id(throwable, id);
    }

    public void onNext(Object obj)
    {
        id.this.id(obj, id, this);
    }

    public void onStart()
    {
        requestMore(initialRequested);
    }

    public void requestMore(long l)
    {
        request(l);
    }



/*
    static long access$102( , long l)
    {
        .requested = l;
        return l;
    }

*/


/*
    static long access$110(requested requested1)
    {
        long l = requested1.requested;
        requested1.requested = l - 1L;
        return l;
    }

*/

    public requested(int i, long l)
    {
        this$0 = this._cls0.this;
        super();
        requested = 0L;
        id = i;
        initialRequested = l;
    }
}
