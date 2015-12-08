// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.g;

import rx.P;
import rx.b;

// Referenced classes of package rx.g:
//            k

public abstract class m extends b
    implements P
{

    private static final Object EMPTY_ARRAY[] = new Object[0];

    public m(rx.b.f f)
    {
        super(f);
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

    public final k toSerialized()
    {
        if (getClass() == rx/g/k)
        {
            return (k)this;
        } else
        {
            return new k(this);
        }
    }

}
