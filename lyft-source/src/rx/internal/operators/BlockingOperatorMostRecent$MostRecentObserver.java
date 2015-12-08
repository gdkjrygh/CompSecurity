// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import rx.Subscriber;
import rx.exceptions.Exceptions;

// Referenced classes of package rx.internal.operators:
//            NotificationLite

final class <init> extends Subscriber
{

    final NotificationLite nl;
    volatile Object value;

    public Iterator getIterable()
    {
        return new Iterator() {

            private Object buf;
            final BlockingOperatorMostRecent.MostRecentObserver this$0;

            public boolean hasNext()
            {
                buf = value;
                return !nl.isCompleted(buf);
            }

            public Object next()
            {
                if (buf == null)
                {
                    buf = value;
                }
                if (nl.isCompleted(buf))
                {
                    throw new NoSuchElementException();
                }
                break MISSING_BLOCK_LABEL_51;
                Exception exception;
                exception;
                buf = null;
                throw exception;
                Object obj;
                if (nl.isError(buf))
                {
                    throw Exceptions.propagate(nl.getError(buf));
                }
                obj = nl.getValue(buf);
                buf = null;
                return obj;
            }

            public void remove()
            {
                throw new UnsupportedOperationException("Read only iterator");
            }

            
            {
                this$0 = BlockingOperatorMostRecent.MostRecentObserver.this;
                super();
                buf = null;
            }
        };
    }

    public void onCompleted()
    {
        value = nl.completed();
    }

    public void onError(Throwable throwable)
    {
        value = nl.error(throwable);
    }

    public void onNext(Object obj)
    {
        value = nl.next(obj);
    }

    private _cls1.buf(Object obj)
    {
        nl = NotificationLite.instance();
        value = nl.next(obj);
    }

    nl(Object obj, nl nl1)
    {
        this(obj);
    }
}
