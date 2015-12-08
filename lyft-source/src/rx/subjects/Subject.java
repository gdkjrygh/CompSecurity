// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import rx.Observable;
import rx.Observer;

// Referenced classes of package rx.subjects:
//            SerializedSubject

public abstract class Subject extends Observable
    implements Observer
{

    private static final Object EMPTY_ARRAY[] = new Object[0];

    protected Subject(rx.Observable.OnSubscribe onsubscribe)
    {
        super(onsubscribe);
    }

    public Throwable getThrowable()
    {
        throw new UnsupportedOperationException();
    }

    public Object getValue()
    {
        throw new UnsupportedOperationException();
    }

    public Object[] getValues()
    {
        Object aobj1[] = getValues((Object[])EMPTY_ARRAY);
        Object aobj[] = aobj1;
        if (aobj1 == EMPTY_ARRAY)
        {
            aobj = new Object[0];
        }
        return aobj;
    }

    public Object[] getValues(Object aobj[])
    {
        throw new UnsupportedOperationException();
    }

    public boolean hasCompleted()
    {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasObservers();

    public boolean hasThrowable()
    {
        throw new UnsupportedOperationException();
    }

    public boolean hasValue()
    {
        throw new UnsupportedOperationException();
    }

    public final SerializedSubject toSerialized()
    {
        if (getClass() == rx/subjects/SerializedSubject)
        {
            return (SerializedSubject)this;
        } else
        {
            return new SerializedSubject(this);
        }
    }

}
