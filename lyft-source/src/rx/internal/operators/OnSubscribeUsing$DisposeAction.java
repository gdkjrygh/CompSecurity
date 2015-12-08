// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;

final class <init> extends AtomicBoolean
    implements Subscription, Action0
{

    private static final long serialVersionUID = 0x3b28c647329bb8ccL;
    private Action1 dispose;
    private Object resource;

    public void call()
    {
        if (!compareAndSet(false, true))
        {
            break MISSING_BLOCK_LABEL_32;
        }
        dispose.call(resource);
        resource = null;
        dispose = null;
        return;
        Exception exception;
        exception;
        resource = null;
        dispose = null;
        throw exception;
    }

    public boolean isUnsubscribed()
    {
        return get();
    }

    public void unsubscribe()
    {
        call();
    }

    private (Action1 action1, Object obj)
    {
        dispose = action1;
        resource = obj;
        lazySet(false);
    }

    lazySet(Action1 action1, Object obj, lazySet lazyset)
    {
        this(action1, obj);
    }
}
