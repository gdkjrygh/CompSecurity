// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorSingle

private static final class defaultValue extends Subscriber
{

    private final Subscriber child;
    private final Object defaultValue;
    private final boolean hasDefaultValue;
    private boolean hasTooManyElements;
    private boolean isNonEmpty;
    private Object value;

    public void onCompleted()
    {
        if (hasTooManyElements)
        {
            return;
        }
        if (isNonEmpty)
        {
            child.onNext(value);
            child.onCompleted();
            return;
        }
        if (hasDefaultValue)
        {
            child.onNext(defaultValue);
            child.onCompleted();
            return;
        } else
        {
            child.onError(new NoSuchElementException("Sequence contains no elements"));
            return;
        }
    }

    public void onError(Throwable throwable)
    {
        child.onError(throwable);
    }

    public void onNext(Object obj)
    {
        if (isNonEmpty)
        {
            hasTooManyElements = true;
            child.onError(new IllegalArgumentException("Sequence contains too many elements"));
            unsubscribe();
            return;
        } else
        {
            value = obj;
            isNonEmpty = true;
            return;
        }
    }

    void requestMore(long l)
    {
        request(l);
    }

    (Subscriber subscriber, boolean flag, Object obj)
    {
        isNonEmpty = false;
        hasTooManyElements = false;
        child = subscriber;
        hasDefaultValue = flag;
        defaultValue = obj;
    }
}
