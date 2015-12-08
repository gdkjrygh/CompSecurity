// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import rx.exceptions.Exceptions;

// Referenced classes of package rx.internal.operators:
//            NotificationLite

class buf
    implements Iterator
{

    private Object buf;
    final buf this$0;

    public boolean hasNext()
    {
        buf = lue;
        return !.isCompleted(buf);
    }

    public Object next()
    {
        if (buf == null)
        {
            buf = lue;
        }
        if (.isCompleted(buf))
        {
            throw new NoSuchElementException();
        }
        break MISSING_BLOCK_LABEL_51;
        Exception exception;
        exception;
        buf = null;
        throw exception;
        Object obj;
        if (.isError(buf))
        {
            throw Exceptions.propagate(.getError(buf));
        }
        obj = .getValue(buf);
        buf = null;
        return obj;
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Read only iterator");
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
        buf = null;
    }
}
