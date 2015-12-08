// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.d;

import rx.P;
import rx.exceptions.OnErrorNotImplementedException;

final class b
    implements P
{

    b()
    {
    }

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
        throw new OnErrorNotImplementedException(throwable);
    }

    public final void onNext(Object obj)
    {
    }
}
